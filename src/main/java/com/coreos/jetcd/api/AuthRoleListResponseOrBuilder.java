// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface AuthRoleListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AuthRoleListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  com.coreos.jetcd.api.ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  com.coreos.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated string roles = 2;</code>
   */
  java.util.List<java.lang.String>
      getRolesList();
  /**
   * <code>repeated string roles = 2;</code>
   */
  int getRolesCount();
  /**
   * <code>repeated string roles = 2;</code>
   */
  java.lang.String getRoles(int index);
  /**
   * <code>repeated string roles = 2;</code>
   */
  com.google.protobuf.ByteString
      getRolesBytes(int index);
}
