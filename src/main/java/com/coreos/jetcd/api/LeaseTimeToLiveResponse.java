// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.LeaseTimeToLiveResponse}
 */
public  final class LeaseTimeToLiveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.LeaseTimeToLiveResponse)
    LeaseTimeToLiveResponseOrBuilder {
  // Use LeaseTimeToLiveResponse.newBuilder() to construct.
  private LeaseTimeToLiveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeaseTimeToLiveResponse() {
    iD_ = 0L;
    tTL_ = 0L;
    grantedTTL_ = 0L;
    keys_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LeaseTimeToLiveResponse(
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
          case 10: {
            com.coreos.jetcd.api.ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.coreos.jetcd.api.ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            iD_ = input.readInt64();
            break;
          }
          case 24: {

            tTL_ = input.readInt64();
            break;
          }
          case 32: {

            grantedTTL_ = input.readInt64();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000010;
            }
            keys_.add(input.readBytes());
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coreos.jetcd.api.LeaseTimeToLiveResponse.class, com.coreos.jetcd.api.LeaseTimeToLiveResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private com.coreos.jetcd.api.ResponseHeader header_;
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public com.coreos.jetcd.api.ResponseHeader getHeader() {
    return header_ == null ? com.coreos.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public com.coreos.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int ID_FIELD_NUMBER = 2;
  private long iD_;
  /**
   * <pre>
   * ID is the lease ID from the keep alive request.
   * </pre>
   *
   * <code>int64 ID = 2;</code>
   */
  public long getID() {
    return iD_;
  }

  public static final int TTL_FIELD_NUMBER = 3;
  private long tTL_;
  /**
   * <pre>
   * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
   * </pre>
   *
   * <code>int64 TTL = 3;</code>
   */
  public long getTTL() {
    return tTL_;
  }

  public static final int GRANTEDTTL_FIELD_NUMBER = 4;
  private long grantedTTL_;
  /**
   * <pre>
   * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
   * </pre>
   *
   * <code>int64 grantedTTL = 4;</code>
   */
  public long getGrantedTTL() {
    return grantedTTL_;
  }

  public static final int KEYS_FIELD_NUMBER = 5;
  private java.util.List<com.google.protobuf.ByteString> keys_;
  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getKeysList() {
    return keys_;
  }
  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   */
  public int getKeysCount() {
    return keys_.size();
  }
  /**
   * <pre>
   * Keys is the list of keys attached to this lease.
   * </pre>
   *
   * <code>repeated bytes keys = 5;</code>
   */
  public com.google.protobuf.ByteString getKeys(int index) {
    return keys_.get(index);
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (iD_ != 0L) {
      output.writeInt64(2, iD_);
    }
    if (tTL_ != 0L) {
      output.writeInt64(3, tTL_);
    }
    if (grantedTTL_ != 0L) {
      output.writeInt64(4, grantedTTL_);
    }
    for (int i = 0; i < keys_.size(); i++) {
      output.writeBytes(5, keys_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (iD_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, iD_);
    }
    if (tTL_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, tTL_);
    }
    if (grantedTTL_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, grantedTTL_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < keys_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(keys_.get(i));
      }
      size += dataSize;
      size += 1 * getKeysList().size();
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
    if (!(obj instanceof com.coreos.jetcd.api.LeaseTimeToLiveResponse)) {
      return super.equals(obj);
    }
    com.coreos.jetcd.api.LeaseTimeToLiveResponse other = (com.coreos.jetcd.api.LeaseTimeToLiveResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (getID()
        == other.getID());
    result = result && (getTTL()
        == other.getTTL());
    result = result && (getGrantedTTL()
        == other.getGrantedTTL());
    result = result && getKeysList()
        .equals(other.getKeysList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getID());
    hash = (37 * hash) + TTL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTTL());
    hash = (37 * hash) + GRANTEDTTL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGrantedTTL());
    if (getKeysCount() > 0) {
      hash = (37 * hash) + KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getKeysList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse parseFrom(
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
  public static Builder newBuilder(com.coreos.jetcd.api.LeaseTimeToLiveResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.LeaseTimeToLiveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.LeaseTimeToLiveResponse)
      com.coreos.jetcd.api.LeaseTimeToLiveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coreos.jetcd.api.LeaseTimeToLiveResponse.class, com.coreos.jetcd.api.LeaseTimeToLiveResponse.Builder.class);
    }

    // Construct using com.coreos.jetcd.api.LeaseTimeToLiveResponse.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      iD_ = 0L;

      tTL_ = 0L;

      grantedTTL_ = 0L;

      keys_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_LeaseTimeToLiveResponse_descriptor;
    }

    public com.coreos.jetcd.api.LeaseTimeToLiveResponse getDefaultInstanceForType() {
      return com.coreos.jetcd.api.LeaseTimeToLiveResponse.getDefaultInstance();
    }

    public com.coreos.jetcd.api.LeaseTimeToLiveResponse build() {
      com.coreos.jetcd.api.LeaseTimeToLiveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.coreos.jetcd.api.LeaseTimeToLiveResponse buildPartial() {
      com.coreos.jetcd.api.LeaseTimeToLiveResponse result = new com.coreos.jetcd.api.LeaseTimeToLiveResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.iD_ = iD_;
      result.tTL_ = tTL_;
      result.grantedTTL_ = grantedTTL_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        keys_ = java.util.Collections.unmodifiableList(keys_);
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.keys_ = keys_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.coreos.jetcd.api.LeaseTimeToLiveResponse) {
        return mergeFrom((com.coreos.jetcd.api.LeaseTimeToLiveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coreos.jetcd.api.LeaseTimeToLiveResponse other) {
      if (other == com.coreos.jetcd.api.LeaseTimeToLiveResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getID() != 0L) {
        setID(other.getID());
      }
      if (other.getTTL() != 0L) {
        setTTL(other.getTTL());
      }
      if (other.getGrantedTTL() != 0L) {
        setGrantedTTL(other.getGrantedTTL());
      }
      if (!other.keys_.isEmpty()) {
        if (keys_.isEmpty()) {
          keys_ = other.keys_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureKeysIsMutable();
          keys_.addAll(other.keys_);
        }
        onChanged();
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
      com.coreos.jetcd.api.LeaseTimeToLiveResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.coreos.jetcd.api.LeaseTimeToLiveResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.coreos.jetcd.api.ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.coreos.jetcd.api.ResponseHeader, com.coreos.jetcd.api.ResponseHeader.Builder, com.coreos.jetcd.api.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public com.coreos.jetcd.api.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.coreos.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(com.coreos.jetcd.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        com.coreos.jetcd.api.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(com.coreos.jetcd.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.coreos.jetcd.api.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public com.coreos.jetcd.api.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public com.coreos.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.coreos.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.coreos.jetcd.api.ResponseHeader, com.coreos.jetcd.api.ResponseHeader.Builder, com.coreos.jetcd.api.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.coreos.jetcd.api.ResponseHeader, com.coreos.jetcd.api.ResponseHeader.Builder, com.coreos.jetcd.api.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private long iD_ ;
    /**
     * <pre>
     * ID is the lease ID from the keep alive request.
     * </pre>
     *
     * <code>int64 ID = 2;</code>
     */
    public long getID() {
      return iD_;
    }
    /**
     * <pre>
     * ID is the lease ID from the keep alive request.
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
     * ID is the lease ID from the keep alive request.
     * </pre>
     *
     * <code>int64 ID = 2;</code>
     */
    public Builder clearID() {
      
      iD_ = 0L;
      onChanged();
      return this;
    }

    private long tTL_ ;
    /**
     * <pre>
     * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
     * </pre>
     *
     * <code>int64 TTL = 3;</code>
     */
    public long getTTL() {
      return tTL_;
    }
    /**
     * <pre>
     * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
     * </pre>
     *
     * <code>int64 TTL = 3;</code>
     */
    public Builder setTTL(long value) {
      
      tTL_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TTL is the remaining TTL in seconds for the lease; the lease will expire in under TTL+1 seconds.
     * </pre>
     *
     * <code>int64 TTL = 3;</code>
     */
    public Builder clearTTL() {
      
      tTL_ = 0L;
      onChanged();
      return this;
    }

    private long grantedTTL_ ;
    /**
     * <pre>
     * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
     * </pre>
     *
     * <code>int64 grantedTTL = 4;</code>
     */
    public long getGrantedTTL() {
      return grantedTTL_;
    }
    /**
     * <pre>
     * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
     * </pre>
     *
     * <code>int64 grantedTTL = 4;</code>
     */
    public Builder setGrantedTTL(long value) {
      
      grantedTTL_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * GrantedTTL is the initial granted time in seconds upon lease creation/renewal.
     * </pre>
     *
     * <code>int64 grantedTTL = 4;</code>
     */
    public Builder clearGrantedTTL() {
      
      grantedTTL_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> keys_ = java.util.Collections.emptyList();
    private void ensureKeysIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>(keys_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getKeysList() {
      return java.util.Collections.unmodifiableList(keys_);
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     */
    public int getKeysCount() {
      return keys_.size();
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     */
    public com.google.protobuf.ByteString getKeys(int index) {
      return keys_.get(index);
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     */
    public Builder setKeys(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeysIsMutable();
      keys_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     */
    public Builder addKeys(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureKeysIsMutable();
      keys_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     */
    public Builder addAllKeys(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keys_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Keys is the list of keys attached to this lease.
     * </pre>
     *
     * <code>repeated bytes keys = 5;</code>
     */
    public Builder clearKeys() {
      keys_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000010);
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


    // @@protoc_insertion_point(builder_scope:etcdserverpb.LeaseTimeToLiveResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.LeaseTimeToLiveResponse)
  private static final com.coreos.jetcd.api.LeaseTimeToLiveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coreos.jetcd.api.LeaseTimeToLiveResponse();
  }

  public static com.coreos.jetcd.api.LeaseTimeToLiveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeaseTimeToLiveResponse>
      PARSER = new com.google.protobuf.AbstractParser<LeaseTimeToLiveResponse>() {
    public LeaseTimeToLiveResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LeaseTimeToLiveResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LeaseTimeToLiveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeaseTimeToLiveResponse> getParserForType() {
    return PARSER;
  }

  public com.coreos.jetcd.api.LeaseTimeToLiveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

