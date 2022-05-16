// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.HandshakeMessage}
 */
public final class HandshakeMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.HandshakeMessage)
    HandshakeMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HandshakeMessage.newBuilder() to construct.
  private HandshakeMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HandshakeMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HandshakeMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HandshakeMessage(
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
          case 18: {
            com.xt.pfwhatsapp.ws.binary.protos.ClientHello.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = clientHello_.toBuilder();
            }
            clientHello_ = input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.ClientHello.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientHello_);
              clientHello_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 26: {
            com.xt.pfwhatsapp.ws.binary.protos.ServerHello.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = serverHello_.toBuilder();
            }
            serverHello_ = input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.ServerHello.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(serverHello_);
              serverHello_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 34: {
            com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) != 0)) {
              subBuilder = clientFinish_.toBuilder();
            }
            clientFinish_ = input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientFinish_);
              clientFinish_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HandshakeMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HandshakeMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage.class, com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage.Builder.class);
  }

  private int bitField0_;
  public static final int CLIENTHELLO_FIELD_NUMBER = 2;
  private com.xt.pfwhatsapp.ws.binary.protos.ClientHello clientHello_;
  /**
   * <code>optional .binary.ClientHello clientHello = 2;</code>
   * @return Whether the clientHello field is set.
   */
  @java.lang.Override
  public boolean hasClientHello() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .binary.ClientHello clientHello = 2;</code>
   * @return The clientHello.
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ClientHello getClientHello() {
    return clientHello_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ClientHello.getDefaultInstance() : clientHello_;
  }
  /**
   * <code>optional .binary.ClientHello clientHello = 2;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ClientHelloOrBuilder getClientHelloOrBuilder() {
    return clientHello_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ClientHello.getDefaultInstance() : clientHello_;
  }

  public static final int SERVERHELLO_FIELD_NUMBER = 3;
  private com.xt.pfwhatsapp.ws.binary.protos.ServerHello serverHello_;
  /**
   * <code>optional .binary.ServerHello serverHello = 3;</code>
   * @return Whether the serverHello field is set.
   */
  @java.lang.Override
  public boolean hasServerHello() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .binary.ServerHello serverHello = 3;</code>
   * @return The serverHello.
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ServerHello getServerHello() {
    return serverHello_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ServerHello.getDefaultInstance() : serverHello_;
  }
  /**
   * <code>optional .binary.ServerHello serverHello = 3;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ServerHelloOrBuilder getServerHelloOrBuilder() {
    return serverHello_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ServerHello.getDefaultInstance() : serverHello_;
  }

  public static final int CLIENTFINISH_FIELD_NUMBER = 4;
  private com.xt.pfwhatsapp.ws.binary.protos.ClientFinish clientFinish_;
  /**
   * <code>optional .binary.ClientFinish clientFinish = 4;</code>
   * @return Whether the clientFinish field is set.
   */
  @java.lang.Override
  public boolean hasClientFinish() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .binary.ClientFinish clientFinish = 4;</code>
   * @return The clientFinish.
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ClientFinish getClientFinish() {
    return clientFinish_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.getDefaultInstance() : clientFinish_;
  }
  /**
   * <code>optional .binary.ClientFinish clientFinish = 4;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ClientFinishOrBuilder getClientFinishOrBuilder() {
    return clientFinish_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.getDefaultInstance() : clientFinish_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getClientHello());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getServerHello());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(4, getClientFinish());
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
        .computeMessageSize(2, getClientHello());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getServerHello());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getClientFinish());
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage other = (com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage) obj;

    if (hasClientHello() != other.hasClientHello()) return false;
    if (hasClientHello()) {
      if (!getClientHello()
          .equals(other.getClientHello())) return false;
    }
    if (hasServerHello() != other.hasServerHello()) return false;
    if (hasServerHello()) {
      if (!getServerHello()
          .equals(other.getServerHello())) return false;
    }
    if (hasClientFinish() != other.hasClientFinish()) return false;
    if (hasClientFinish()) {
      if (!getClientFinish()
          .equals(other.getClientFinish())) return false;
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
    if (hasClientHello()) {
      hash = (37 * hash) + CLIENTHELLO_FIELD_NUMBER;
      hash = (53 * hash) + getClientHello().hashCode();
    }
    if (hasServerHello()) {
      hash = (37 * hash) + SERVERHELLO_FIELD_NUMBER;
      hash = (53 * hash) + getServerHello().hashCode();
    }
    if (hasClientFinish()) {
      hash = (37 * hash) + CLIENTFINISH_FIELD_NUMBER;
      hash = (53 * hash) + getClientFinish().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage prototype) {
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
   * Protobuf type {@code binary.HandshakeMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.HandshakeMessage)
      com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HandshakeMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HandshakeMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage.class, com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage.newBuilder()
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
        getClientHelloFieldBuilder();
        getServerHelloFieldBuilder();
        getClientFinishFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (clientHelloBuilder_ == null) {
        clientHello_ = null;
      } else {
        clientHelloBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (serverHelloBuilder_ == null) {
        serverHello_ = null;
      } else {
        serverHelloBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      if (clientFinishBuilder_ == null) {
        clientFinish_ = null;
      } else {
        clientFinishBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_HandshakeMessage_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage build() {
      com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage result = new com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (clientHelloBuilder_ == null) {
          result.clientHello_ = clientHello_;
        } else {
          result.clientHello_ = clientHelloBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (serverHelloBuilder_ == null) {
          result.serverHello_ = serverHello_;
        } else {
          result.serverHello_ = serverHelloBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (clientFinishBuilder_ == null) {
          result.clientFinish_ = clientFinish_;
        } else {
          result.clientFinish_ = clientFinishBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage.getDefaultInstance()) return this;
      if (other.hasClientHello()) {
        mergeClientHello(other.getClientHello());
      }
      if (other.hasServerHello()) {
        mergeServerHello(other.getServerHello());
      }
      if (other.hasClientFinish()) {
        mergeClientFinish(other.getClientFinish());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.xt.pfwhatsapp.ws.binary.protos.ClientHello clientHello_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.ClientHello, com.xt.pfwhatsapp.ws.binary.protos.ClientHello.Builder, com.xt.pfwhatsapp.ws.binary.protos.ClientHelloOrBuilder> clientHelloBuilder_;
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     * @return Whether the clientHello field is set.
     */
    public boolean hasClientHello() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     * @return The clientHello.
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ClientHello getClientHello() {
      if (clientHelloBuilder_ == null) {
        return clientHello_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ClientHello.getDefaultInstance() : clientHello_;
      } else {
        return clientHelloBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     */
    public Builder setClientHello(com.xt.pfwhatsapp.ws.binary.protos.ClientHello value) {
      if (clientHelloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientHello_ = value;
        onChanged();
      } else {
        clientHelloBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     */
    public Builder setClientHello(
        com.xt.pfwhatsapp.ws.binary.protos.ClientHello.Builder builderForValue) {
      if (clientHelloBuilder_ == null) {
        clientHello_ = builderForValue.build();
        onChanged();
      } else {
        clientHelloBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     */
    public Builder mergeClientHello(com.xt.pfwhatsapp.ws.binary.protos.ClientHello value) {
      if (clientHelloBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            clientHello_ != null &&
            clientHello_ != com.xt.pfwhatsapp.ws.binary.protos.ClientHello.getDefaultInstance()) {
          clientHello_ =
            com.xt.pfwhatsapp.ws.binary.protos.ClientHello.newBuilder(clientHello_).mergeFrom(value).buildPartial();
        } else {
          clientHello_ = value;
        }
        onChanged();
      } else {
        clientHelloBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     */
    public Builder clearClientHello() {
      if (clientHelloBuilder_ == null) {
        clientHello_ = null;
        onChanged();
      } else {
        clientHelloBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ClientHello.Builder getClientHelloBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getClientHelloFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ClientHelloOrBuilder getClientHelloOrBuilder() {
      if (clientHelloBuilder_ != null) {
        return clientHelloBuilder_.getMessageOrBuilder();
      } else {
        return clientHello_ == null ?
            com.xt.pfwhatsapp.ws.binary.protos.ClientHello.getDefaultInstance() : clientHello_;
      }
    }
    /**
     * <code>optional .binary.ClientHello clientHello = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.ClientHello, com.xt.pfwhatsapp.ws.binary.protos.ClientHello.Builder, com.xt.pfwhatsapp.ws.binary.protos.ClientHelloOrBuilder>
        getClientHelloFieldBuilder() {
      if (clientHelloBuilder_ == null) {
        clientHelloBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.ClientHello, com.xt.pfwhatsapp.ws.binary.protos.ClientHello.Builder, com.xt.pfwhatsapp.ws.binary.protos.ClientHelloOrBuilder>(
                getClientHello(),
                getParentForChildren(),
                isClean());
        clientHello_ = null;
      }
      return clientHelloBuilder_;
    }

    private com.xt.pfwhatsapp.ws.binary.protos.ServerHello serverHello_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.ServerHello, com.xt.pfwhatsapp.ws.binary.protos.ServerHello.Builder, com.xt.pfwhatsapp.ws.binary.protos.ServerHelloOrBuilder> serverHelloBuilder_;
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     * @return Whether the serverHello field is set.
     */
    public boolean hasServerHello() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     * @return The serverHello.
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ServerHello getServerHello() {
      if (serverHelloBuilder_ == null) {
        return serverHello_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ServerHello.getDefaultInstance() : serverHello_;
      } else {
        return serverHelloBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     */
    public Builder setServerHello(com.xt.pfwhatsapp.ws.binary.protos.ServerHello value) {
      if (serverHelloBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serverHello_ = value;
        onChanged();
      } else {
        serverHelloBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     */
    public Builder setServerHello(
        com.xt.pfwhatsapp.ws.binary.protos.ServerHello.Builder builderForValue) {
      if (serverHelloBuilder_ == null) {
        serverHello_ = builderForValue.build();
        onChanged();
      } else {
        serverHelloBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     */
    public Builder mergeServerHello(com.xt.pfwhatsapp.ws.binary.protos.ServerHello value) {
      if (serverHelloBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            serverHello_ != null &&
            serverHello_ != com.xt.pfwhatsapp.ws.binary.protos.ServerHello.getDefaultInstance()) {
          serverHello_ =
            com.xt.pfwhatsapp.ws.binary.protos.ServerHello.newBuilder(serverHello_).mergeFrom(value).buildPartial();
        } else {
          serverHello_ = value;
        }
        onChanged();
      } else {
        serverHelloBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     */
    public Builder clearServerHello() {
      if (serverHelloBuilder_ == null) {
        serverHello_ = null;
        onChanged();
      } else {
        serverHelloBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ServerHello.Builder getServerHelloBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getServerHelloFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ServerHelloOrBuilder getServerHelloOrBuilder() {
      if (serverHelloBuilder_ != null) {
        return serverHelloBuilder_.getMessageOrBuilder();
      } else {
        return serverHello_ == null ?
            com.xt.pfwhatsapp.ws.binary.protos.ServerHello.getDefaultInstance() : serverHello_;
      }
    }
    /**
     * <code>optional .binary.ServerHello serverHello = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.ServerHello, com.xt.pfwhatsapp.ws.binary.protos.ServerHello.Builder, com.xt.pfwhatsapp.ws.binary.protos.ServerHelloOrBuilder>
        getServerHelloFieldBuilder() {
      if (serverHelloBuilder_ == null) {
        serverHelloBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.ServerHello, com.xt.pfwhatsapp.ws.binary.protos.ServerHello.Builder, com.xt.pfwhatsapp.ws.binary.protos.ServerHelloOrBuilder>(
                getServerHello(),
                getParentForChildren(),
                isClean());
        serverHello_ = null;
      }
      return serverHelloBuilder_;
    }

    private com.xt.pfwhatsapp.ws.binary.protos.ClientFinish clientFinish_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.ClientFinish, com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.Builder, com.xt.pfwhatsapp.ws.binary.protos.ClientFinishOrBuilder> clientFinishBuilder_;
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     * @return Whether the clientFinish field is set.
     */
    public boolean hasClientFinish() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     * @return The clientFinish.
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ClientFinish getClientFinish() {
      if (clientFinishBuilder_ == null) {
        return clientFinish_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.getDefaultInstance() : clientFinish_;
      } else {
        return clientFinishBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     */
    public Builder setClientFinish(com.xt.pfwhatsapp.ws.binary.protos.ClientFinish value) {
      if (clientFinishBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientFinish_ = value;
        onChanged();
      } else {
        clientFinishBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     */
    public Builder setClientFinish(
        com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.Builder builderForValue) {
      if (clientFinishBuilder_ == null) {
        clientFinish_ = builderForValue.build();
        onChanged();
      } else {
        clientFinishBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     */
    public Builder mergeClientFinish(com.xt.pfwhatsapp.ws.binary.protos.ClientFinish value) {
      if (clientFinishBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            clientFinish_ != null &&
            clientFinish_ != com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.getDefaultInstance()) {
          clientFinish_ =
            com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.newBuilder(clientFinish_).mergeFrom(value).buildPartial();
        } else {
          clientFinish_ = value;
        }
        onChanged();
      } else {
        clientFinishBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     */
    public Builder clearClientFinish() {
      if (clientFinishBuilder_ == null) {
        clientFinish_ = null;
        onChanged();
      } else {
        clientFinishBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.Builder getClientFinishBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getClientFinishFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ClientFinishOrBuilder getClientFinishOrBuilder() {
      if (clientFinishBuilder_ != null) {
        return clientFinishBuilder_.getMessageOrBuilder();
      } else {
        return clientFinish_ == null ?
            com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.getDefaultInstance() : clientFinish_;
      }
    }
    /**
     * <code>optional .binary.ClientFinish clientFinish = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.ClientFinish, com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.Builder, com.xt.pfwhatsapp.ws.binary.protos.ClientFinishOrBuilder>
        getClientFinishFieldBuilder() {
      if (clientFinishBuilder_ == null) {
        clientFinishBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.ClientFinish, com.xt.pfwhatsapp.ws.binary.protos.ClientFinish.Builder, com.xt.pfwhatsapp.ws.binary.protos.ClientFinishOrBuilder>(
                getClientFinish(),
                getParentForChildren(),
                isClean());
        clientFinish_ = null;
      }
      return clientFinishBuilder_;
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


    // @@protoc_insertion_point(builder_scope:binary.HandshakeMessage)
  }

  // @@protoc_insertion_point(class_scope:binary.HandshakeMessage)
  private static final com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HandshakeMessage>
      PARSER = new com.google.protobuf.AbstractParser<HandshakeMessage>() {
    @java.lang.Override
    public HandshakeMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HandshakeMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HandshakeMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HandshakeMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.HandshakeMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
