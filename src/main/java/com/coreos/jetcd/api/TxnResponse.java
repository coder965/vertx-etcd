// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.TxnResponse}
 */
public  final class TxnResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.TxnResponse)
    TxnResponseOrBuilder {
  // Use TxnResponse.newBuilder() to construct.
  private TxnResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxnResponse() {
    succeeded_ = false;
    responses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TxnResponse(
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

            succeeded_ = input.readBool();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              responses_ = new java.util.ArrayList<com.coreos.jetcd.api.ResponseOp>();
              mutable_bitField0_ |= 0x00000004;
            }
            responses_.add(
                input.readMessage(com.coreos.jetcd.api.ResponseOp.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        responses_ = java.util.Collections.unmodifiableList(responses_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_TxnResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_TxnResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coreos.jetcd.api.TxnResponse.class, com.coreos.jetcd.api.TxnResponse.Builder.class);
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

  public static final int SUCCEEDED_FIELD_NUMBER = 2;
  private boolean succeeded_;
  /**
   * <pre>
   * succeeded is set to true if the compare evaluated to true or false otherwise.
   * </pre>
   *
   * <code>bool succeeded = 2;</code>
   */
  public boolean getSucceeded() {
    return succeeded_;
  }

  public static final int RESPONSES_FIELD_NUMBER = 3;
  private java.util.List<com.coreos.jetcd.api.ResponseOp> responses_;
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  public java.util.List<com.coreos.jetcd.api.ResponseOp> getResponsesList() {
    return responses_;
  }
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  public java.util.List<? extends com.coreos.jetcd.api.ResponseOpOrBuilder> 
      getResponsesOrBuilderList() {
    return responses_;
  }
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  public int getResponsesCount() {
    return responses_.size();
  }
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  public com.coreos.jetcd.api.ResponseOp getResponses(int index) {
    return responses_.get(index);
  }
  /**
   * <pre>
   * responses is a list of responses corresponding to the results from applying
   * success if succeeded is true or failure if succeeded is false.
   * </pre>
   *
   * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
   */
  public com.coreos.jetcd.api.ResponseOpOrBuilder getResponsesOrBuilder(
      int index) {
    return responses_.get(index);
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
    if (succeeded_ != false) {
      output.writeBool(2, succeeded_);
    }
    for (int i = 0; i < responses_.size(); i++) {
      output.writeMessage(3, responses_.get(i));
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
    if (succeeded_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, succeeded_);
    }
    for (int i = 0; i < responses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, responses_.get(i));
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
    if (!(obj instanceof com.coreos.jetcd.api.TxnResponse)) {
      return super.equals(obj);
    }
    com.coreos.jetcd.api.TxnResponse other = (com.coreos.jetcd.api.TxnResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (getSucceeded()
        == other.getSucceeded());
    result = result && getResponsesList()
        .equals(other.getResponsesList());
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
    hash = (37 * hash) + SUCCEEDED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSucceeded());
    if (getResponsesCount() > 0) {
      hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getResponsesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coreos.jetcd.api.TxnResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreos.jetcd.api.TxnResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreos.jetcd.api.TxnResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreos.jetcd.api.TxnResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreos.jetcd.api.TxnResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.TxnResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreos.jetcd.api.TxnResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.TxnResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreos.jetcd.api.TxnResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreos.jetcd.api.TxnResponse parseFrom(
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
  public static Builder newBuilder(com.coreos.jetcd.api.TxnResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.TxnResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.TxnResponse)
      com.coreos.jetcd.api.TxnResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_TxnResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_TxnResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coreos.jetcd.api.TxnResponse.class, com.coreos.jetcd.api.TxnResponse.Builder.class);
    }

    // Construct using com.coreos.jetcd.api.TxnResponse.newBuilder()
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
        getResponsesFieldBuilder();
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
      succeeded_ = false;

      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_TxnResponse_descriptor;
    }

    public com.coreos.jetcd.api.TxnResponse getDefaultInstanceForType() {
      return com.coreos.jetcd.api.TxnResponse.getDefaultInstance();
    }

    public com.coreos.jetcd.api.TxnResponse build() {
      com.coreos.jetcd.api.TxnResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.coreos.jetcd.api.TxnResponse buildPartial() {
      com.coreos.jetcd.api.TxnResponse result = new com.coreos.jetcd.api.TxnResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.succeeded_ = succeeded_;
      if (responsesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          responses_ = java.util.Collections.unmodifiableList(responses_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.responses_ = responses_;
      } else {
        result.responses_ = responsesBuilder_.build();
      }
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
      if (other instanceof com.coreos.jetcd.api.TxnResponse) {
        return mergeFrom((com.coreos.jetcd.api.TxnResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coreos.jetcd.api.TxnResponse other) {
      if (other == com.coreos.jetcd.api.TxnResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getSucceeded() != false) {
        setSucceeded(other.getSucceeded());
      }
      if (responsesBuilder_ == null) {
        if (!other.responses_.isEmpty()) {
          if (responses_.isEmpty()) {
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureResponsesIsMutable();
            responses_.addAll(other.responses_);
          }
          onChanged();
        }
      } else {
        if (!other.responses_.isEmpty()) {
          if (responsesBuilder_.isEmpty()) {
            responsesBuilder_.dispose();
            responsesBuilder_ = null;
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000004);
            responsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResponsesFieldBuilder() : null;
          } else {
            responsesBuilder_.addAllMessages(other.responses_);
          }
        }
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
      com.coreos.jetcd.api.TxnResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.coreos.jetcd.api.TxnResponse) e.getUnfinishedMessage();
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

    private boolean succeeded_ ;
    /**
     * <pre>
     * succeeded is set to true if the compare evaluated to true or false otherwise.
     * </pre>
     *
     * <code>bool succeeded = 2;</code>
     */
    public boolean getSucceeded() {
      return succeeded_;
    }
    /**
     * <pre>
     * succeeded is set to true if the compare evaluated to true or false otherwise.
     * </pre>
     *
     * <code>bool succeeded = 2;</code>
     */
    public Builder setSucceeded(boolean value) {
      
      succeeded_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * succeeded is set to true if the compare evaluated to true or false otherwise.
     * </pre>
     *
     * <code>bool succeeded = 2;</code>
     */
    public Builder clearSucceeded() {
      
      succeeded_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.coreos.jetcd.api.ResponseOp> responses_ =
      java.util.Collections.emptyList();
    private void ensureResponsesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        responses_ = new java.util.ArrayList<com.coreos.jetcd.api.ResponseOp>(responses_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.coreos.jetcd.api.ResponseOp, com.coreos.jetcd.api.ResponseOp.Builder, com.coreos.jetcd.api.ResponseOpOrBuilder> responsesBuilder_;

    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public java.util.List<com.coreos.jetcd.api.ResponseOp> getResponsesList() {
      if (responsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(responses_);
      } else {
        return responsesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public int getResponsesCount() {
      if (responsesBuilder_ == null) {
        return responses_.size();
      } else {
        return responsesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public com.coreos.jetcd.api.ResponseOp getResponses(int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);
      } else {
        return responsesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder setResponses(
        int index, com.coreos.jetcd.api.ResponseOp value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.set(index, value);
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder setResponses(
        int index, com.coreos.jetcd.api.ResponseOp.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.set(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder addResponses(com.coreos.jetcd.api.ResponseOp value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder addResponses(
        int index, com.coreos.jetcd.api.ResponseOp value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(index, value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder addResponses(
        com.coreos.jetcd.api.ResponseOp.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder addResponses(
        int index, com.coreos.jetcd.api.ResponseOp.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder addAllResponses(
        java.lang.Iterable<? extends com.coreos.jetcd.api.ResponseOp> values) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, responses_);
        onChanged();
      } else {
        responsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder clearResponses() {
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public Builder removeResponses(int index) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.remove(index);
        onChanged();
      } else {
        responsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public com.coreos.jetcd.api.ResponseOp.Builder getResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public com.coreos.jetcd.api.ResponseOpOrBuilder getResponsesOrBuilder(
        int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);  } else {
        return responsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public java.util.List<? extends com.coreos.jetcd.api.ResponseOpOrBuilder> 
         getResponsesOrBuilderList() {
      if (responsesBuilder_ != null) {
        return responsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(responses_);
      }
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public com.coreos.jetcd.api.ResponseOp.Builder addResponsesBuilder() {
      return getResponsesFieldBuilder().addBuilder(
          com.coreos.jetcd.api.ResponseOp.getDefaultInstance());
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public com.coreos.jetcd.api.ResponseOp.Builder addResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().addBuilder(
          index, com.coreos.jetcd.api.ResponseOp.getDefaultInstance());
    }
    /**
     * <pre>
     * responses is a list of responses corresponding to the results from applying
     * success if succeeded is true or failure if succeeded is false.
     * </pre>
     *
     * <code>repeated .etcdserverpb.ResponseOp responses = 3;</code>
     */
    public java.util.List<com.coreos.jetcd.api.ResponseOp.Builder> 
         getResponsesBuilderList() {
      return getResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.coreos.jetcd.api.ResponseOp, com.coreos.jetcd.api.ResponseOp.Builder, com.coreos.jetcd.api.ResponseOpOrBuilder> 
        getResponsesFieldBuilder() {
      if (responsesBuilder_ == null) {
        responsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.coreos.jetcd.api.ResponseOp, com.coreos.jetcd.api.ResponseOp.Builder, com.coreos.jetcd.api.ResponseOpOrBuilder>(
                responses_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        responses_ = null;
      }
      return responsesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.TxnResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.TxnResponse)
  private static final com.coreos.jetcd.api.TxnResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coreos.jetcd.api.TxnResponse();
  }

  public static com.coreos.jetcd.api.TxnResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxnResponse>
      PARSER = new com.google.protobuf.AbstractParser<TxnResponse>() {
    public TxnResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TxnResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TxnResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TxnResponse> getParserForType() {
    return PARSER;
  }

  public com.coreos.jetcd.api.TxnResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

