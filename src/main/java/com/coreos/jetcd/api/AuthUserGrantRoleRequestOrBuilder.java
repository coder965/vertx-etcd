// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface AuthUserGrantRoleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.AuthUserGrantRoleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * user is the name of the user which should be granted a given role.
   * </pre>
   *
   * <code>string user = 1;</code>
   */
  java.lang.String getUser();
  /**
   * <pre>
   * user is the name of the user which should be granted a given role.
   * </pre>
   *
   * <code>string user = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <pre>
   * role is the name of the role to grant to the user.
   * </pre>
   *
   * <code>string role = 2;</code>
   */
  java.lang.String getRole();
  /**
   * <pre>
   * role is the name of the role to grant to the user.
   * </pre>
   *
   * <code>string role = 2;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();
}
