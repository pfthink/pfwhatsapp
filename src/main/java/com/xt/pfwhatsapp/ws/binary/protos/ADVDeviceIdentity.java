// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.ADVDeviceIdentity}
 */
public final class ADVDeviceIdentity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.ADVDeviceIdentity)
    ADVDeviceIdentityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ADVDeviceIdentity.newBuilder() to construct.
  private ADVDeviceIdentity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ADVDeviceIdentity() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ADVDeviceIdentity();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ADVDeviceIdentity(
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
            rawId_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            timestamp_ = input.readUInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            keyIndex_ = input.readUInt32();
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVDeviceIdentity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVDeviceIdentity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity.class, com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity.Builder.class);
  }

  private int bitField0_;
  public static final int RAWID_FIELD_NUMBER = 1;
  private int rawId_;
  /**
   * <code>optional uint32 rawId = 1;</code>
   * @return Whether the rawId field is set.
   */
  @java.lang.Override
  public boolean hasRawId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional uint32 rawId = 1;</code>
   * @return The rawId.
   */
  @java.lang.Override
  public int getRawId() {
    return rawId_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 2;
  private long timestamp_;
  /**
   * <code>optional uint64 timestamp = 2;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int KEYINDEX_FIELD_NUMBER = 3;
  private int keyIndex_;
  /**
   * <code>optional uint32 keyIndex = 3;</code>
   * @return Whether the keyIndex field is set.
   */
  @java.lang.Override
  public boolean hasKeyIndex() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional uint32 keyIndex = 3;</code>
   * @return The keyIndex.
   */
  @java.lang.Override
  public int getKeyIndex() {
    return keyIndex_;
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
      output.writeUInt32(1, rawId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt64(2, timestamp_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(3, keyIndex_);
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
        .computeUInt32Size(1, rawId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, timestamp_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, keyIndex_);
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity other = (com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity) obj;

    if (hasRawId() != other.hasRawId()) return false;
    if (hasRawId()) {
      if (getRawId()
          != other.getRawId()) return false;
    }
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (getTimestamp()
          != other.getTimestamp()) return false;
    }
    if (hasKeyIndex() != other.hasKeyIndex()) return false;
    if (hasKeyIndex()) {
      if (getKeyIndex()
          != other.getKeyIndex()) return false;
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
    if (hasRawId()) {
      hash = (37 * hash) + RAWID_FIELD_NUMBER;
      hash = (53 * hash) + getRawId();
    }
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
    }
    if (hasKeyIndex()) {
      hash = (37 * hash) + KEYINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getKeyIndex();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity prototype) {
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
   * Protobuf type {@code binary.ADVDeviceIdentity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.ADVDeviceIdentity)
      com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVDeviceIdentity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVDeviceIdentity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity.class, com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity.newBuilder()
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
      rawId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      timestamp_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      keyIndex_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVDeviceIdentity_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity build() {
      com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity result = new com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rawId_ = rawId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timestamp_ = timestamp_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.keyIndex_ = keyIndex_;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity.getDefaultInstance()) return this;
      if (other.hasRawId()) {
        setRawId(other.getRawId());
      }
      if (other.hasTimestamp()) {
        setTimestamp(other.getTimestamp());
      }
      if (other.hasKeyIndex()) {
        setKeyIndex(other.getKeyIndex());
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
      com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int rawId_ ;
    /**
     * <code>optional uint32 rawId = 1;</code>
     * @return Whether the rawId field is set.
     */
    @java.lang.Override
    public boolean hasRawId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint32 rawId = 1;</code>
     * @return The rawId.
     */
    @java.lang.Override
    public int getRawId() {
      return rawId_;
    }
    /**
     * <code>optional uint32 rawId = 1;</code>
     * @param value The rawId to set.
     * @return This builder for chaining.
     */
    public Builder setRawId(int value) {
      bitField0_ |= 0x00000001;
      rawId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 rawId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRawId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rawId_ = 0;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>optional uint64 timestamp = 2;</code>
     * @return Whether the timestamp field is set.
     */
    @java.lang.Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint64 timestamp = 2;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>optional uint64 timestamp = 2;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      bitField0_ |= 0x00000002;
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 timestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private int keyIndex_ ;
    /**
     * <code>optional uint32 keyIndex = 3;</code>
     * @return Whether the keyIndex field is set.
     */
    @java.lang.Override
    public boolean hasKeyIndex() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 keyIndex = 3;</code>
     * @return The keyIndex.
     */
    @java.lang.Override
    public int getKeyIndex() {
      return keyIndex_;
    }
    /**
     * <code>optional uint32 keyIndex = 3;</code>
     * @param value The keyIndex to set.
     * @return This builder for chaining.
     */
    public Builder setKeyIndex(int value) {
      bitField0_ |= 0x00000004;
      keyIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 keyIndex = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyIndex() {
      bitField0_ = (bitField0_ & ~0x00000004);
      keyIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:binary.ADVDeviceIdentity)
  }

  // @@protoc_insertion_point(class_scope:binary.ADVDeviceIdentity)
  private static final com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ADVDeviceIdentity>
      PARSER = new com.google.protobuf.AbstractParser<ADVDeviceIdentity>() {
    @java.lang.Override
    public ADVDeviceIdentity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ADVDeviceIdentity(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ADVDeviceIdentity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ADVDeviceIdentity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ADVDeviceIdentity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

