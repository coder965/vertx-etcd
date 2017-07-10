// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface PutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.PutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * key is the key, in bytes, to put into the key-value store.
   * </pre>
   *
   * <code>bytes key = 1;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <pre>
   * value is the value, in bytes, to associate with the key in the key-value store.
   * </pre>
   *
   * <code>bytes value = 2;</code>
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <pre>
   * lease is the lease ID to associate with the key in the key-value store. A lease
   * value of 0 indicates no lease.
   * </pre>
   *
   * <code>int64 lease = 3;</code>
   */
  long getLease();

  /**
   * <pre>
   * If prev_kv is set, etcd gets the previous key-value pair before changing it.
   * The previous key-value pair will be returned in the put response.
   * </pre>
   *
   * <code>bool prev_kv = 4;</code>
   */
  boolean getPrevKv();

  /**
   * <pre>
   * If ignore_value is set, etcd updates the key using its current value.
   * Returns an error if the key does not exist.
   * </pre>
   *
   * <code>bool ignore_value = 5;</code>
   */
  boolean getIgnoreValue();

  /**
   * <pre>
   * If ignore_lease is set, etcd updates the key using its current lease.
   * Returns an error if the key does not exist.
   * </pre>
   *
   * <code>bool ignore_lease = 6;</code>
   */
  boolean getIgnoreLease();
}
