// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.AlarmResponse}
 */
public  final class AlarmResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AlarmResponse)
    AlarmResponseOrBuilder {
  // Use AlarmResponse.newBuilder() to construct.
  private AlarmResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlarmResponse() {
    alarms_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AlarmResponse(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              alarms_ = new java.util.ArrayList<AlarmMember>();
              mutable_bitField0_ |= 0x00000002;
            }
            alarms_.add(
                input.readMessage(AlarmMember.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        alarms_ = java.util.Collections.unmodifiableList(alarms_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AlarmResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AlarmResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AlarmResponse.class, Builder.class);
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

  public static final int ALARMS_FIELD_NUMBER = 2;
  private java.util.List<AlarmMember> alarms_;
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  public java.util.List<AlarmMember> getAlarmsList() {
    return alarms_;
  }
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  public java.util.List<? extends AlarmMemberOrBuilder>
      getAlarmsOrBuilderList() {
    return alarms_;
  }
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  public int getAlarmsCount() {
    return alarms_.size();
  }
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  public AlarmMember getAlarms(int index) {
    return alarms_.get(index);
  }
  /**
   * <pre>
   * alarms is a list of alarms associated with the alarm request.
   * </pre>
   *
   * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
   */
  public AlarmMemberOrBuilder getAlarmsOrBuilder(
      int index) {
    return alarms_.get(index);
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
    for (int i = 0; i < alarms_.size(); i++) {
      output.writeMessage(2, alarms_.get(i));
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
    for (int i = 0; i < alarms_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, alarms_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof AlarmResponse)) {
      return super.equals(obj);
    }
    AlarmResponse other = (AlarmResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getAlarmsList()
        .equals(other.getAlarmsList());
    return result;
  }

  @Override
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
    if (getAlarmsCount() > 0) {
      hash = (37 * hash) + ALARMS_FIELD_NUMBER;
      hash = (53 * hash) + getAlarmsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AlarmResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AlarmResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AlarmResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AlarmResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AlarmResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AlarmResponse parseFrom(
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
  public static Builder newBuilder(AlarmResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code etcdserverpb.AlarmResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AlarmResponse)
      com.coreos.jetcd.api.AlarmResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AlarmResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AlarmResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AlarmResponse.class, Builder.class);
    }

    // Construct using com.coreos.jetcd.api.AlarmResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAlarmsFieldBuilder();
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
      if (alarmsBuilder_ == null) {
        alarms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        alarmsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AlarmResponse_descriptor;
    }

    public AlarmResponse getDefaultInstanceForType() {
      return AlarmResponse.getDefaultInstance();
    }

    public AlarmResponse build() {
      AlarmResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AlarmResponse buildPartial() {
      AlarmResponse result = new AlarmResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (alarmsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          alarms_ = java.util.Collections.unmodifiableList(alarms_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.alarms_ = alarms_;
      } else {
        result.alarms_ = alarmsBuilder_.build();
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
      if (other instanceof AlarmResponse) {
        return mergeFrom((AlarmResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AlarmResponse other) {
      if (other == AlarmResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (alarmsBuilder_ == null) {
        if (!other.alarms_.isEmpty()) {
          if (alarms_.isEmpty()) {
            alarms_ = other.alarms_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAlarmsIsMutable();
            alarms_.addAll(other.alarms_);
          }
          onChanged();
        }
      } else {
        if (!other.alarms_.isEmpty()) {
          if (alarmsBuilder_.isEmpty()) {
            alarmsBuilder_.dispose();
            alarmsBuilder_ = null;
            alarms_ = other.alarms_;
            bitField0_ = (bitField0_ & ~0x00000002);
            alarmsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAlarmsFieldBuilder() : null;
          } else {
            alarmsBuilder_.addAllMessages(other.alarms_);
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
      AlarmResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AlarmResponse) e.getUnfinishedMessage();
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

    private java.util.List<AlarmMember> alarms_ =
      java.util.Collections.emptyList();
    private void ensureAlarmsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        alarms_ = new java.util.ArrayList<AlarmMember>(alarms_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        AlarmMember, AlarmMember.Builder, AlarmMemberOrBuilder> alarmsBuilder_;

    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public java.util.List<AlarmMember> getAlarmsList() {
      if (alarmsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(alarms_);
      } else {
        return alarmsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public int getAlarmsCount() {
      if (alarmsBuilder_ == null) {
        return alarms_.size();
      } else {
        return alarmsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public AlarmMember getAlarms(int index) {
      if (alarmsBuilder_ == null) {
        return alarms_.get(index);
      } else {
        return alarmsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder setAlarms(
        int index, AlarmMember value) {
      if (alarmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlarmsIsMutable();
        alarms_.set(index, value);
        onChanged();
      } else {
        alarmsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder setAlarms(
        int index, AlarmMember.Builder builderForValue) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        alarms_.set(index, builderForValue.build());
        onChanged();
      } else {
        alarmsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAlarms(AlarmMember value) {
      if (alarmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlarmsIsMutable();
        alarms_.add(value);
        onChanged();
      } else {
        alarmsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAlarms(
        int index, AlarmMember value) {
      if (alarmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlarmsIsMutable();
        alarms_.add(index, value);
        onChanged();
      } else {
        alarmsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAlarms(
        AlarmMember.Builder builderForValue) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        alarms_.add(builderForValue.build());
        onChanged();
      } else {
        alarmsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAlarms(
        int index, AlarmMember.Builder builderForValue) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        alarms_.add(index, builderForValue.build());
        onChanged();
      } else {
        alarmsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder addAllAlarms(
        Iterable<? extends AlarmMember> values) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, alarms_);
        onChanged();
      } else {
        alarmsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder clearAlarms() {
      if (alarmsBuilder_ == null) {
        alarms_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        alarmsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public Builder removeAlarms(int index) {
      if (alarmsBuilder_ == null) {
        ensureAlarmsIsMutable();
        alarms_.remove(index);
        onChanged();
      } else {
        alarmsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public AlarmMember.Builder getAlarmsBuilder(
        int index) {
      return getAlarmsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public AlarmMemberOrBuilder getAlarmsOrBuilder(
        int index) {
      if (alarmsBuilder_ == null) {
        return alarms_.get(index);  } else {
        return alarmsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public java.util.List<? extends AlarmMemberOrBuilder>
         getAlarmsOrBuilderList() {
      if (alarmsBuilder_ != null) {
        return alarmsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(alarms_);
      }
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public AlarmMember.Builder addAlarmsBuilder() {
      return getAlarmsFieldBuilder().addBuilder(
          AlarmMember.getDefaultInstance());
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public AlarmMember.Builder addAlarmsBuilder(
        int index) {
      return getAlarmsFieldBuilder().addBuilder(
          index, AlarmMember.getDefaultInstance());
    }
    /**
     * <pre>
     * alarms is a list of alarms associated with the alarm request.
     * </pre>
     *
     * <code>repeated .etcdserverpb.AlarmMember alarms = 2;</code>
     */
    public java.util.List<AlarmMember.Builder>
         getAlarmsBuilderList() {
      return getAlarmsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        AlarmMember, AlarmMember.Builder, AlarmMemberOrBuilder>
        getAlarmsFieldBuilder() {
      if (alarmsBuilder_ == null) {
        alarmsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            AlarmMember, AlarmMember.Builder, AlarmMemberOrBuilder>(
                alarms_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        alarms_ = null;
      }
      return alarmsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AlarmResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.AlarmResponse)
  private static final AlarmResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AlarmResponse();
  }

  public static AlarmResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlarmResponse>
      PARSER = new com.google.protobuf.AbstractParser<AlarmResponse>() {
    public AlarmResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AlarmResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlarmResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AlarmResponse> getParserForType() {
    return PARSER;
  }

  public AlarmResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
