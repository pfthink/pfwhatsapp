// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.HistorySyncMsg}
 */
public final class HistorySyncMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.HistorySyncMsg)
    HistorySyncMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistorySyncMsg.newBuilder() to construct.
  private HistorySyncMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistorySyncMsg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistorySyncMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HistorySyncMsg(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = message_.toBuilder();
            }
            message_ = input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(message_);
              message_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            msgOrderId_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HistorySyncMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HistorySyncMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg.class, com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg.Builder.class);
  }

  private int bitField0_;
  public static final int MESSAGE_FIELD_NUMBER = 1;
  private com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo message_;
  /**
   * <code>optional .binary.WebMessageInfo message = 1;</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .binary.WebMessageInfo message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo getMessage() {
    return message_ == null ? com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.getDefaultInstance() : message_;
  }
  /**
   * <code>optional .binary.WebMessageInfo message = 1;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfoOrBuilder getMessageOrBuilder() {
    return message_ == null ? com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.getDefaultInstance() : message_;
  }

  public static final int MSGORDERID_FIELD_NUMBER = 2;
  private long msgOrderId_;
  /**
   * <code>optional uint64 msgOrderId = 2;</code>
   * @return Whether the msgOrderId field is set.
   */
  @java.lang.Override
  public boolean hasMsgOrderId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint64 msgOrderId = 2;</code>
   * @return The msgOrderId.
   */
  @java.lang.Override
  public long getMsgOrderId() {
    return msgOrderId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (hasMessage()) {
      if (!getMessage().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getMessage());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(2, msgOrderId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMessage());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, msgOrderId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg other = (com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg) obj;

    if (hasMessage() != other.hasMessage()) return false;
    if (hasMessage()) {
      if (!getMessage()
          .equals(other.getMessage())) return false;
    }
    if (hasMsgOrderId() != other.hasMsgOrderId()) return false;
    if (hasMsgOrderId()) {
      if (getMsgOrderId()
          != other.getMsgOrderId()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    if (hasMsgOrderId()) {
      hash = (37 * hash) + MSGORDERID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMsgOrderId());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code binary.HistorySyncMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.HistorySyncMsg)
      com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HistorySyncMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HistorySyncMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg.class, com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg.newBuilder()
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
        getMessageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (messageBuilder_ == null) {
        message_ = null;
      } else {
        messageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      msgOrderId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HistorySyncMsg_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg build() {
      com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg result = new com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (messageBuilder_ == null) {
          result.message_ = message_;
        } else {
          result.message_ = messageBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.msgOrderId_ = msgOrderId_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        mergeMessage(other.getMessage());
      }
      if (other.hasMsgOrderId()) {
        setMsgOrderId(other.getMsgOrderId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (hasMessage()) {
        if (!getMessage().isInitialized()) {
          return false;
        }
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo message_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo, com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.Builder, com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfoOrBuilder> messageBuilder_;
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     * @return Whether the message field is set.
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     * @return The message.
     */
    public com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo getMessage() {
      if (messageBuilder_ == null) {
        return message_ == null ? com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.getDefaultInstance() : message_;
      } else {
        return messageBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     */
    public Builder setMessage(com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     */
    public Builder setMessage(
        com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.Builder builderForValue) {
      if (messageBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     */
    public Builder mergeMessage(com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo value) {
      if (messageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            message_ != null &&
            message_ != com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.getDefaultInstance()) {
          message_ =
            com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.newBuilder(message_).mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        messageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        message_ = null;
        onChanged();
      } else {
        messageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.Builder getMessageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfoOrBuilder getMessageOrBuilder() {
      if (messageBuilder_ != null) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        return message_ == null ?
            com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.getDefaultInstance() : message_;
      }
    }
    /**
     * <code>optional .binary.WebMessageInfo message = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo, com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.Builder, com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfoOrBuilder>
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo, com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfo.Builder, com.xt.pfwhatsapp.ws.binary.protos.WebMessageInfoOrBuilder>(
                getMessage(),
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      return messageBuilder_;
    }

    private long msgOrderId_ ;
    /**
     * <code>optional uint64 msgOrderId = 2;</code>
     * @return Whether the msgOrderId field is set.
     */
    @java.lang.Override
    public boolean hasMsgOrderId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint64 msgOrderId = 2;</code>
     * @return The msgOrderId.
     */
    @java.lang.Override
    public long getMsgOrderId() {
      return msgOrderId_;
    }
    /**
     * <code>optional uint64 msgOrderId = 2;</code>
     * @param value The msgOrderId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgOrderId(long value) {
      bitField0_ |= 0x00000002;
      msgOrderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 msgOrderId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgOrderId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      msgOrderId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:binary.HistorySyncMsg)
  }

  // @@protoc_insertion_point(class_scope:binary.HistorySyncMsg)
  private static final com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HistorySyncMsg>
      PARSER = new com.google.protobuf.AbstractParser<HistorySyncMsg>() {
    @java.lang.Override
    public HistorySyncMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HistorySyncMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HistorySyncMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistorySyncMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.HistorySyncMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

