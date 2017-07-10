// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.LeaseGrantRequest}
 */
public  final class LeaseGrantRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.LeaseGrantRequest)
    LeaseGrantRequestOrBuilder {
  // Use LeaseGrantRequest.newBuilder() to construct.
  private LeaseGrantRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeaseGrantRequest() {
    tTL_ = 0L;
    iD_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LeaseGrantRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            tTL_ = input.readInt64();
            break;
          }
          case 16: {

            iD_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseGrantRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseGrantRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coreos.jetcd.api.LeaseGrantRequest.class, com.coreos.jetcd.api.LeaseGrantRequest.Builder.class);
  }

  public static final int TTL_FIELD_NUMBER = 1;
  private long tTL_;
  /**
   * <pre>
   * TTL is the advisory time-to-live in seconds.
   * </pre>
   *
   * <code>int64 TTL = 1;</code>
   */
  public long getTTL() {
    return tTL_;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private long iD_;
  /**
   * <pre>
   * ID is the requested ID for the lease. If ID is set to 0, the lessor chooses an ID.
   * </pre>
   *
   * <code>int64 ID = 2;</code>
   */
  public long getID() {
    return iD_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tTL_ != 0L) {
      output.writeInt64(1, tTL_);
    }
    if (iD_ != 0L) {
      output.writeInt64(2, iD_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tTL_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, tTL_);
    }
    if (iD_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, iD_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.coreos.jetcd.api.LeaseGrantRequest)) {
      return super.equals(obj);
    }
    com.coreos.jetcd.api.LeaseGrantRequest other = (com.coreos.jetcd.api.LeaseGrantRequest) obj;

    boolean result = true;
    result = result && (getTTL()
        == other.getTTL());
    result = result && (getID()
        == other.getID());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TTL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTTL());
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getID());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coreos.jetcd.api.LeaseGrantRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.LeaseGrantRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.coreos.jetcd.api.LeaseGrantRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code etcdserverpb.LeaseGrantRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.LeaseGrantRequest)
      com.coreos.jetcd.api.LeaseGrantRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseGrantRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseGrantRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coreos.jetcd.api.LeaseGrantRequest.class, com.coreos.jetcd.api.LeaseGrantRequest.Builder.class);
    }

    // Construct using com.coreos.jetcd.api.LeaseGrantRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      tTL_ = 0L;

      iD_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseGrantRequest_descriptor;
    }

    public com.coreos.jetcd.api.LeaseGrantRequest getDefaultInstanceForType() {
      return com.coreos.jetcd.api.LeaseGrantRequest.getDefaultInstance();
    }

    public com.coreos.jetcd.api.LeaseGrantRequest build() {
      com.coreos.jetcd.api.LeaseGrantRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.coreos.jetcd.api.LeaseGrantRequest buildPartial() {
      com.coreos.jetcd.api.LeaseGrantRequest result = new com.coreos.jetcd.api.LeaseGrantRequest(this);
      result.tTL_ = tTL_;
      result.iD_ = iD_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.coreos.jetcd.api.LeaseGrantRequest) {
        return mergeFrom((com.coreos.jetcd.api.LeaseGrantRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coreos.jetcd.api.LeaseGrantRequest other) {
      if (other == com.coreos.jetcd.api.LeaseGrantRequest.getDefaultInstance()) return this;
      if (other.getTTL() != 0L) {
        setTTL(other.getTTL());
      }
      if (other.getID() != 0L) {
        setID(other.getID());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.coreos.jetcd.api.LeaseGrantRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.coreos.jetcd.api.LeaseGrantRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long tTL_ ;
    /**
     * <pre>
     * TTL is the advisory time-to-live in seconds.
     * </pre>
     *
     * <code>int64 TTL = 1;</code>
     */
    public long getTTL() {
      return tTL_;
    }
    /**
     * <pre>
     * TTL is the advisory time-to-live in seconds.
     * </pre>
     *
     * <code>int64 TTL = 1;</code>
     */
    public Builder setTTL(long value) {
      
      tTL_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TTL is the advisory time-to-live in seconds.
     * </pre>
     *
     * <code>int64 TTL = 1;</code>
     */
    public Builder clearTTL() {
      
      tTL_ = 0L;
      onChanged();
      return this;
    }

    private long iD_ ;
    /**
     * <pre>
     * ID is the requested ID for the lease. If ID is set to 0, the lessor chooses an ID.
     * </pre>
     *
     * <code>int64 ID = 2;</code>
     */
    public long getID() {
      return iD_;
    }
    /**
     * <pre>
     * ID is the requested ID for the lease. If ID is set to 0, the lessor chooses an ID.
     * </pre>
     *
     * <code>int64 ID = 2;</code>
     */
    public Builder setID(long value) {
      
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID is the requested ID for the lease. If ID is set to 0, the lessor chooses an ID.
     * </pre>
     *
     * <code>int64 ID = 2;</code>
     */
    public Builder clearID() {
      
      iD_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.LeaseGrantRequest)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.LeaseGrantRequest)
  private static final com.coreos.jetcd.api.LeaseGrantRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coreos.jetcd.api.LeaseGrantRequest();
  }

  public static com.coreos.jetcd.api.LeaseGrantRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeaseGrantRequest>
      PARSER = new com.google.protobuf.AbstractParser<LeaseGrantRequest>() {
    public LeaseGrantRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LeaseGrantRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LeaseGrantRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeaseGrantRequest> getParserForType() {
    return PARSER;
  }

  public com.coreos.jetcd.api.LeaseGrantRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

