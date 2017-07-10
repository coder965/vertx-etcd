// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface ResponseHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.ResponseHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * cluster_id is the ID of the cluster which sent the response.
   * </pre>
   *
   * <code>uint64 cluster_id = 1;</code>
   */
  long getClusterId();

  /**
   * <pre>
   * member_id is the ID of the member which sent the response.
   * </pre>
   *
   * <code>uint64 member_id = 2;</code>
   */
  long getMemberId();

  /**
   * <pre>
   * revision is the key-value store revision when the request was applied.
   * </pre>
   *
   * <code>int64 revision = 3;</code>
   */
  long getRevision();

  /**
   * <pre>
   * raft_term is the raft term when the request was applied.
   * </pre>
   *
   * <code>uint64 raft_term = 4;</code>
   */
  long getRaftTerm();
}
