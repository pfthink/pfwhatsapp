// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.BizAccountPayload}
 */
public final class BizAccountPayload extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.BizAccountPayload)
    BizAccountPayloadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BizAccountPayload.newBuilder() to construct.
  private BizAccountPayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BizAccountPayload() {
    bizAcctLinkInfo_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BizAccountPayload();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BizAccountPayload(
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
            com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = vnameCert_.toBuilder();
            }
            vnameCert_ = input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vnameCert_);
              vnameCert_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            bizAcctLinkInfo_ = input.readBytes();
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_BizAccountPayload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_BizAccountPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload.class, com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload.Builder.class);
  }

  private int bitField0_;
  public static final int VNAMECERT_FIELD_NUMBER = 1;
  private com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate vnameCert_;
  /**
   * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
   * @return Whether the vnameCert field is set.
   */
  @java.lang.Override
  public boolean hasVnameCert() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
   * @return The vnameCert.
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate getVnameCert() {
    return vnameCert_ == null ? com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.getDefaultInstance() : vnameCert_;
  }
  /**
   * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificateOrBuilder getVnameCertOrBuilder() {
    return vnameCert_ == null ? com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.getDefaultInstance() : vnameCert_;
  }

  public static final int BIZACCTLINKINFO_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString bizAcctLinkInfo_;
  /**
   * <code>optional bytes bizAcctLinkInfo = 2;</code>
   * @return Whether the bizAcctLinkInfo field is set.
   */
  @java.lang.Override
  public boolean hasBizAcctLinkInfo() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bytes bizAcctLinkInfo = 2;</code>
   * @return The bizAcctLinkInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBizAcctLinkInfo() {
    return bizAcctLinkInfo_;
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
      output.writeMessage(1, getVnameCert());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBytes(2, bizAcctLinkInfo_);
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
        .computeMessageSize(1, getVnameCert());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, bizAcctLinkInfo_);
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload other = (com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload) obj;

    if (hasVnameCert() != other.hasVnameCert()) return false;
    if (hasVnameCert()) {
      if (!getVnameCert()
          .equals(other.getVnameCert())) return false;
    }
    if (hasBizAcctLinkInfo() != other.hasBizAcctLinkInfo()) return false;
    if (hasBizAcctLinkInfo()) {
      if (!getBizAcctLinkInfo()
          .equals(other.getBizAcctLinkInfo())) return false;
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
    if (hasVnameCert()) {
      hash = (37 * hash) + VNAMECERT_FIELD_NUMBER;
      hash = (53 * hash) + getVnameCert().hashCode();
    }
    if (hasBizAcctLinkInfo()) {
      hash = (37 * hash) + BIZACCTLINKINFO_FIELD_NUMBER;
      hash = (53 * hash) + getBizAcctLinkInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload prototype) {
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
   * Protobuf type {@code binary.BizAccountPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.BizAccountPayload)
      com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_BizAccountPayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_BizAccountPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload.class, com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload.newBuilder()
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
        getVnameCertFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (vnameCertBuilder_ == null) {
        vnameCert_ = null;
      } else {
        vnameCertBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      bizAcctLinkInfo_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_BizAccountPayload_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload build() {
      com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload result = new com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (vnameCertBuilder_ == null) {
          result.vnameCert_ = vnameCert_;
        } else {
          result.vnameCert_ = vnameCertBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.bizAcctLinkInfo_ = bizAcctLinkInfo_;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload.getDefaultInstance()) return this;
      if (other.hasVnameCert()) {
        mergeVnameCert(other.getVnameCert());
      }
      if (other.hasBizAcctLinkInfo()) {
        setBizAcctLinkInfo(other.getBizAcctLinkInfo());
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
      com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate vnameCert_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate, com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.Builder, com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificateOrBuilder> vnameCertBuilder_;
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     * @return Whether the vnameCert field is set.
     */
    public boolean hasVnameCert() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     * @return The vnameCert.
     */
    public com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate getVnameCert() {
      if (vnameCertBuilder_ == null) {
        return vnameCert_ == null ? com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.getDefaultInstance() : vnameCert_;
      } else {
        return vnameCertBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     */
    public Builder setVnameCert(com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate value) {
      if (vnameCertBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vnameCert_ = value;
        onChanged();
      } else {
        vnameCertBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     */
    public Builder setVnameCert(
        com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.Builder builderForValue) {
      if (vnameCertBuilder_ == null) {
        vnameCert_ = builderForValue.build();
        onChanged();
      } else {
        vnameCertBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     */
    public Builder mergeVnameCert(com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate value) {
      if (vnameCertBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            vnameCert_ != null &&
            vnameCert_ != com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.getDefaultInstance()) {
          vnameCert_ =
            com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.newBuilder(vnameCert_).mergeFrom(value).buildPartial();
        } else {
          vnameCert_ = value;
        }
        onChanged();
      } else {
        vnameCertBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     */
    public Builder clearVnameCert() {
      if (vnameCertBuilder_ == null) {
        vnameCert_ = null;
        onChanged();
      } else {
        vnameCertBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.Builder getVnameCertBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVnameCertFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificateOrBuilder getVnameCertOrBuilder() {
      if (vnameCertBuilder_ != null) {
        return vnameCertBuilder_.getMessageOrBuilder();
      } else {
        return vnameCert_ == null ?
            com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.getDefaultInstance() : vnameCert_;
      }
    }
    /**
     * <code>optional .binary.VerifiedNameCertificate vnameCert = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate, com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.Builder, com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificateOrBuilder>
        getVnameCertFieldBuilder() {
      if (vnameCertBuilder_ == null) {
        vnameCertBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate, com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificate.Builder, com.xt.pfwhatsapp.ws.binary.protos.VerifiedNameCertificateOrBuilder>(
                getVnameCert(),
                getParentForChildren(),
                isClean());
        vnameCert_ = null;
      }
      return vnameCertBuilder_;
    }

    private com.google.protobuf.ByteString bizAcctLinkInfo_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes bizAcctLinkInfo = 2;</code>
     * @return Whether the bizAcctLinkInfo field is set.
     */
    @java.lang.Override
    public boolean hasBizAcctLinkInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes bizAcctLinkInfo = 2;</code>
     * @return The bizAcctLinkInfo.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBizAcctLinkInfo() {
      return bizAcctLinkInfo_;
    }
    /**
     * <code>optional bytes bizAcctLinkInfo = 2;</code>
     * @param value The bizAcctLinkInfo to set.
     * @return This builder for chaining.
     */
    public Builder setBizAcctLinkInfo(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      bizAcctLinkInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes bizAcctLinkInfo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBizAcctLinkInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bizAcctLinkInfo_ = getDefaultInstance().getBizAcctLinkInfo();
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


    // @@protoc_insertion_point(builder_scope:binary.BizAccountPayload)
  }

  // @@protoc_insertion_point(class_scope:binary.BizAccountPayload)
  private static final com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<BizAccountPayload>
      PARSER = new com.google.protobuf.AbstractParser<BizAccountPayload>() {
    @java.lang.Override
    public BizAccountPayload parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BizAccountPayload(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BizAccountPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BizAccountPayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.BizAccountPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

