package io.vertx.spi.cluster.etcd;

import com.google.protobuf.ByteString;

import com.coreos.jetcd.api.DeleteRangeRequest;
import com.coreos.jetcd.api.DeleteRangeResponse;
import com.coreos.jetcd.api.KVGrpc;
import com.coreos.jetcd.api.LeaseGrantRequest;
import com.coreos.jetcd.api.LeaseGrantResponse;
import com.coreos.jetcd.api.LeaseGrpc;
import com.coreos.jetcd.api.LeaseKeepAliveRequest;
import com.coreos.jetcd.api.LeaseKeepAliveResponse;
import com.coreos.jetcd.api.PutRequest;
import com.coreos.jetcd.api.PutResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Collectors;

import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.channel.nio.NioEventLoopGroup;
import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.shareddata.AsyncMap;
import io.vertx.core.shareddata.Counter;
import io.vertx.core.shareddata.Lock;
import io.vertx.core.spi.cluster.AsyncMultiMap;
import io.vertx.core.spi.cluster.ClusterManager;
import io.vertx.core.spi.cluster.NodeListener;
import io.vertx.grpc.GrpcBidiExchange;
import io.vertx.spi.cluster.etcd.impl.EtcdAsyncMapImpl;
import io.vertx.spi.cluster.etcd.impl.EtcdAsyncMultiMapImpl;
import io.vertx.spi.cluster.etcd.impl.EtcdSyncMapImpl;

/**
 * @author <a href="mailto:guoyu.511@gmail.com">Guo Yu</a>
 */
public class EtcdClusterManager implements ClusterManager {

  private String host;

  private int port;

  private String prefix;

  private Map<String, String> nodeCache = new HashMap<>();

  private Vertx vertx;

  private ManagedChannel channel;

  private NodeListener listener;

  private KVGrpc.KVVertxStub kvStub;

  private LeaseGrpc.LeaseVertxStub leaseStub;

  private long keepAlivePeriodic;

  private boolean active;

  private String nodeId;

  private static final String ETCD_CLUSTER_NODES = "cluster/nodes";

  private static final long ETCD_TIMEOUT = 5000l;

  public EtcdClusterManager(String host, int port) {
    this(host, port, "vertx");
  }

  public EtcdClusterManager(String host, int port, String prefix) {
    this.host = host;
    this.port = port;
    this.prefix = prefix;
  }

  @Override
  public void setVertx(Vertx vertx) {
    this.vertx = vertx;
  }

  @Override
  public <K, V> void getAsyncMultiMap(String name, Handler<AsyncResult<AsyncMultiMap<K, V>>> asyncResultHandler) {
    vertx.runOnContext((ignore) ->
      asyncResultHandler.handle(Future.succeededFuture(
        new EtcdAsyncMultiMapImpl<>(prefix + "/" + name, channel)))
    );
  }

  @Override
  public <K, V> void getAsyncMap(String name, Handler<AsyncResult<AsyncMap<K, V>>> asyncResultHandler) {
    vertx.runOnContext((ignore) ->
      asyncResultHandler.handle(Future.succeededFuture(
        new EtcdAsyncMapImpl<>(prefix + "/" + name, channel)))
    );
  }

  @Override
  public <K, V> Map<K, V> getSyncMap(String name) {
    return new EtcdSyncMapImpl(prefix + "/" + name, channel);
  }

  @Override
  public void getLockWithTimeout(String name, long timeout, Handler<AsyncResult<Lock>> resultHandler) {
    System.out.println("getLockWithTimeout");
  }

  @Override
  public void getCounter(String name, Handler<AsyncResult<Counter>> resultHandler) {
    System.out.println("getCounter");
  }

  @Override
  public String getNodeID() {
    return nodeId;
  }

  @Override
  public List<String> getNodes() {
    return nodeCache.keySet().stream()
      .collect(Collectors.toList());
  }

  @Override
  public void nodeListener(NodeListener listener) {
    this.listener = listener;
  }

  @Override
  public void join(Handler<AsyncResult<Void>> handler) {
    channel = buildChannel();

    leaseStub = LeaseGrpc.newVertxStub(channel);
    kvStub = KVGrpc.newVertxStub(channel);

    nodeId = UUID.randomUUID().toString();

    Future
      .<LeaseGrantResponse>future(grantFuture ->
        leaseStub.leaseGrant(
          LeaseGrantRequest.newBuilder()
            .setTTL(ETCD_TIMEOUT)
            .build(),
          grantFuture)
      )
      .map(LeaseGrantResponse::getID)
      .<Void>compose(lease ->
        Future.<PutResponse>future(putFuture ->
          kvStub.put(
            PutRequest.newBuilder()
              .setLease(lease)
              .setKey(key())
              .setValue(value())
              .build(),
            putFuture)
        )
        .map((res) -> {
          leaseStub.leaseKeepAlive((exchange) ->
            this.keepAlive(lease, exchange));
          active = true;
          return null;
        })
      )
      .setHandler(handler);
  }

  @Override
  public void leave(Handler<AsyncResult<Void>> handler) {
    vertx.cancelTimer(keepAlivePeriodic);
    Future
      .<DeleteRangeResponse>future(future ->
        kvStub.deleteRange(
          DeleteRangeRequest.newBuilder()
            .setKey(key())
            .build(),
          future
        )
      )
      .map((Void)null)
      .setHandler(handler);
  }

  @Override
  public boolean isActive() {
    return active;
  }

  private ManagedChannel buildChannel() {
    //use split nio event loop because we need perform blocking operator on eventloop thread for syncMap
    Context context = vertx.getOrCreateContext();
    NioEventLoopGroup eventLoopGroup = new NioEventLoopGroup(1,
      (ThreadFactory) (r) -> new Thread(r, "vertx-etcd-eventloop"));
    return NettyChannelBuilder.forAddress(host, port)
      .eventLoopGroup(eventLoopGroup)
      .usePlaintext(true)
      .executor((runnable) ->
        context.runOnContext((ignore) -> runnable.run())
      )
      .build();
  }

  private void keepAlive(long lease, GrpcBidiExchange<LeaseKeepAliveResponse, LeaseKeepAliveRequest> exchange) {
    keepAlivePeriodic = vertx.setPeriodic(ETCD_TIMEOUT / 2, (ignore) ->
      exchange.write(LeaseKeepAliveRequest.newBuilder()
        .setID(lease)
        .build())
    );
  }

  private ByteString key() {
    return ByteString.copyFromUtf8(prefix + "/" + ETCD_CLUSTER_NODES + "/" + nodeId);
  }

  private ByteString value() {
    return ByteString.copyFromUtf8(nodeId);
  }

}
