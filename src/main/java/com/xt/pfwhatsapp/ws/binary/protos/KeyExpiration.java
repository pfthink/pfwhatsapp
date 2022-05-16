// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.KeyExpiration}
 */
public final class KeyExpiration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.KeyExpiration)
    KeyExpirationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeyExpiration.newBuilder() to construct.
  private KeyExpiration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeyExpiration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeyExpiration();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeyExpiration(
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
          case 8: {
            bitField0_ |= 0x00000001;
            expiredKeyEpoch_ = input.readInt32();
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_KeyExpiration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_KeyExpiration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration.class, com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration.Builder.class);
  }

  private int bitField0_;
  public static final int EXPIREDKEYEPOCH_FIELD_NUMBER = 1;
  private int expiredKeyEpoch_;
  /**
   * <code>optional int32 expiredKeyEpoch = 1;</code>
   * @return Whether the expiredKeyEpoch field is set.
   */
  @java.lang.Override
  public boolean hasExpiredKeyEpoch() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 expiredKeyEpoch = 1;</code>
   * @return The expiredKeyEpoch.
   */
  @java.lang.Override
  public int getExpiredKeyEpoch() {
    return expiredKeyEpoch_;
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
      output.writeInt32(1, expiredKeyEpoch_);
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
        .computeInt32Size(1, expiredKeyEpoch_);
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration other = (com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration) obj;

    if (hasExpiredKeyEpoch() != other.hasExpiredKeyEpoch()) return false;
    if (hasExpiredKeyEpoch()) {
      if (getExpiredKeyEpoch()
          != other.getExpiredKeyEpoch()) return false;
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
    if (hasExpiredKeyEpoch()) {
      hash = (37 * hash) + EXPIREDKEYEPOCH_FIELD_NUMBER;
      hash = (53 * hash) + getExpiredKeyEpoch();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration prototype) {
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
   * Protobuf type {@code binary.KeyExpiration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.KeyExpiration)
      com.xt.pfwhatsapp.ws.binary.protos.KeyExpirationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_KeyExpiration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_KeyExpiration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration.class, com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      expiredKeyEpoch_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_KeyExpiration_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration build() {
      com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration result = new com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.expiredKeyEpoch_ = expiredKeyEpoch_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration.getDefaultInstance()) return this;
      if (other.hasExpiredKeyEpoch()) {
        setExpiredKeyEpoch(other.getExpiredKeyEpoch());
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
      com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int expiredKeyEpoch_ ;
    /**
     * <code>optional int32 expiredKeyEpoch = 1;</code>
     * @return Whether the expiredKeyEpoch field is set.
     */
    @java.lang.Override
    public boolean hasExpiredKeyEpoch() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 expiredKeyEpoch = 1;</code>
     * @return The expiredKeyEpoch.
     */
    @java.lang.Override
    public int getExpiredKeyEpoch() {
      return expiredKeyEpoch_;
    }
    /**
     * <code>optional int32 expiredKeyEpoch = 1;</code>
     * @param value The expiredKeyEpoch to set.
     * @return This builder for chaining.
     */
    public Builder setExpiredKeyEpoch(int value) {
      bitField0_ |= 0x00000001;
      expiredKeyEpoch_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 expiredKeyEpoch = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpiredKeyEpoch() {
      bitField0_ = (bitField0_ & ~0x00000001);
      expiredKeyEpoch_ = 0;
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


    // @@protoc_insertion_point(builder_scope:binary.KeyExpiration)
  }

  // @@protoc_insertion_point(class_scope:binary.KeyExpiration)
  private static final com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<KeyExpiration>
      PARSER = new com.google.protobuf.AbstractParser<KeyExpiration>() {
    @java.lang.Override
    public KeyExpiration parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeyExpiration(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeyExpiration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyExpiration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.KeyExpiration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

