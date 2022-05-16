// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.AppStateSyncKeyData}
 */
public final class AppStateSyncKeyData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.AppStateSyncKeyData)
    AppStateSyncKeyDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppStateSyncKeyData.newBuilder() to construct.
  private AppStateSyncKeyData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppStateSyncKeyData() {
    keyData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppStateSyncKeyData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppStateSyncKeyData(
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
            bitField0_ |= 0x00000001;
            keyData_ = input.readBytes();
            break;
          }
          case 18: {
            com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = fingerprint_.toBuilder();
            }
            fingerprint_ = input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fingerprint_);
              fingerprint_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            timestamp_ = input.readInt64();
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData.class, com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData.Builder.class);
  }

  private int bitField0_;
  public static final int KEYDATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString keyData_;
  /**
   * <code>optional bytes keyData = 1;</code>
   * @return Whether the keyData field is set.
   */
  @java.lang.Override
  public boolean hasKeyData() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bytes keyData = 1;</code>
   * @return The keyData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyData() {
    return keyData_;
  }

  public static final int FINGERPRINT_FIELD_NUMBER = 2;
  private com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint fingerprint_;
  /**
   * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
   * @return Whether the fingerprint field is set.
   */
  @java.lang.Override
  public boolean hasFingerprint() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
   * @return The fingerprint.
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint getFingerprint() {
    return fingerprint_ == null ? com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.getDefaultInstance() : fingerprint_;
  }
  /**
   * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprintOrBuilder getFingerprintOrBuilder() {
    return fingerprint_ == null ? com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.getDefaultInstance() : fingerprint_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private long timestamp_;
  /**
   * <code>optional int64 timestamp = 3;</code>
   * @return Whether the timestamp field is set.
   */
  @java.lang.Override
  public boolean hasTimestamp() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int64 timestamp = 3;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public long getTimestamp() {
    return timestamp_;
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
      output.writeBytes(1, keyData_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getFingerprint());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(3, timestamp_);
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
        .computeBytesSize(1, keyData_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFingerprint());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timestamp_);
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData other = (com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData) obj;

    if (hasKeyData() != other.hasKeyData()) return false;
    if (hasKeyData()) {
      if (!getKeyData()
          .equals(other.getKeyData())) return false;
    }
    if (hasFingerprint() != other.hasFingerprint()) return false;
    if (hasFingerprint()) {
      if (!getFingerprint()
          .equals(other.getFingerprint())) return false;
    }
    if (hasTimestamp() != other.hasTimestamp()) return false;
    if (hasTimestamp()) {
      if (getTimestamp()
          != other.getTimestamp()) return false;
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
    if (hasKeyData()) {
      hash = (37 * hash) + KEYDATA_FIELD_NUMBER;
      hash = (53 * hash) + getKeyData().hashCode();
    }
    if (hasFingerprint()) {
      hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
      hash = (53 * hash) + getFingerprint().hashCode();
    }
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData prototype) {
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
   * Protobuf type {@code binary.AppStateSyncKeyData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.AppStateSyncKeyData)
      com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData.class, com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData.newBuilder()
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
        getFingerprintFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      keyData_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (fingerprintBuilder_ == null) {
        fingerprint_ = null;
      } else {
        fingerprintBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      timestamp_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyData_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData build() {
      com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData result = new com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.keyData_ = keyData_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (fingerprintBuilder_ == null) {
          result.fingerprint_ = fingerprint_;
        } else {
          result.fingerprint_ = fingerprintBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timestamp_ = timestamp_;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData.getDefaultInstance()) return this;
      if (other.hasKeyData()) {
        setKeyData(other.getKeyData());
      }
      if (other.hasFingerprint()) {
        mergeFingerprint(other.getFingerprint());
      }
      if (other.hasTimestamp()) {
        setTimestamp(other.getTimestamp());
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
      com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString keyData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes keyData = 1;</code>
     * @return Whether the keyData field is set.
     */
    @java.lang.Override
    public boolean hasKeyData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes keyData = 1;</code>
     * @return The keyData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKeyData() {
      return keyData_;
    }
    /**
     * <code>optional bytes keyData = 1;</code>
     * @param value The keyData to set.
     * @return This builder for chaining.
     */
    public Builder setKeyData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      keyData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes keyData = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      keyData_ = getDefaultInstance().getKeyData();
      onChanged();
      return this;
    }

    private com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint fingerprint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint, com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.Builder, com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprintOrBuilder> fingerprintBuilder_;
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     * @return Whether the fingerprint field is set.
     */
    public boolean hasFingerprint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     * @return The fingerprint.
     */
    public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint getFingerprint() {
      if (fingerprintBuilder_ == null) {
        return fingerprint_ == null ? com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.getDefaultInstance() : fingerprint_;
      } else {
        return fingerprintBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     */
    public Builder setFingerprint(com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint value) {
      if (fingerprintBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fingerprint_ = value;
        onChanged();
      } else {
        fingerprintBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     */
    public Builder setFingerprint(
        com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.Builder builderForValue) {
      if (fingerprintBuilder_ == null) {
        fingerprint_ = builderForValue.build();
        onChanged();
      } else {
        fingerprintBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     */
    public Builder mergeFingerprint(com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint value) {
      if (fingerprintBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            fingerprint_ != null &&
            fingerprint_ != com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.getDefaultInstance()) {
          fingerprint_ =
            com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.newBuilder(fingerprint_).mergeFrom(value).buildPartial();
        } else {
          fingerprint_ = value;
        }
        onChanged();
      } else {
        fingerprintBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     */
    public Builder clearFingerprint() {
      if (fingerprintBuilder_ == null) {
        fingerprint_ = null;
        onChanged();
      } else {
        fingerprintBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.Builder getFingerprintBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFingerprintFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprintOrBuilder getFingerprintOrBuilder() {
      if (fingerprintBuilder_ != null) {
        return fingerprintBuilder_.getMessageOrBuilder();
      } else {
        return fingerprint_ == null ?
            com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.getDefaultInstance() : fingerprint_;
      }
    }
    /**
     * <code>optional .binary.AppStateSyncKeyFingerprint fingerprint = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint, com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.Builder, com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprintOrBuilder>
        getFingerprintFieldBuilder() {
      if (fingerprintBuilder_ == null) {
        fingerprintBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint, com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprint.Builder, com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyFingerprintOrBuilder>(
                getFingerprint(),
                getParentForChildren(),
                isClean());
        fingerprint_ = null;
      }
      return fingerprintBuilder_;
    }

    private long timestamp_ ;
    /**
     * <code>optional int64 timestamp = 3;</code>
     * @return Whether the timestamp field is set.
     */
    @java.lang.Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int64 timestamp = 3;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>optional int64 timestamp = 3;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      bitField0_ |= 0x00000004;
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 timestamp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000004);
      timestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:binary.AppStateSyncKeyData)
  }

  // @@protoc_insertion_point(class_scope:binary.AppStateSyncKeyData)
  private static final com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AppStateSyncKeyData>
      PARSER = new com.google.protobuf.AbstractParser<AppStateSyncKeyData>() {
    @java.lang.Override
    public AppStateSyncKeyData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppStateSyncKeyData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppStateSyncKeyData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppStateSyncKeyData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.AppStateSyncKeyData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
