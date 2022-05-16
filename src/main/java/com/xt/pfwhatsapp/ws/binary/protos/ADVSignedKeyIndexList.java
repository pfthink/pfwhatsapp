// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.ADVSignedKeyIndexList}
 */
public final class ADVSignedKeyIndexList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.ADVSignedKeyIndexList)
    ADVSignedKeyIndexListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ADVSignedKeyIndexList.newBuilder() to construct.
  private ADVSignedKeyIndexList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ADVSignedKeyIndexList() {
    details_ = com.google.protobuf.ByteString.EMPTY;
    accountSignature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ADVSignedKeyIndexList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ADVSignedKeyIndexList(
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
            details_ = input.readBytes();
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            accountSignature_ = input.readBytes();
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVSignedKeyIndexList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVSignedKeyIndexList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList.class, com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList.Builder.class);
  }

  private int bitField0_;
  public static final int DETAILS_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString details_;
  /**
   * <code>optional bytes details = 1;</code>
   * @return Whether the details field is set.
   */
  @java.lang.Override
  public boolean hasDetails() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bytes details = 1;</code>
   * @return The details.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDetails() {
    return details_;
  }

  public static final int ACCOUNTSIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString accountSignature_;
  /**
   * <code>optional bytes accountSignature = 2;</code>
   * @return Whether the accountSignature field is set.
   */
  @java.lang.Override
  public boolean hasAccountSignature() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bytes accountSignature = 2;</code>
   * @return The accountSignature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAccountSignature() {
    return accountSignature_;
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
      output.writeBytes(1, details_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBytes(2, accountSignature_);
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
        .computeBytesSize(1, details_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, accountSignature_);
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList other = (com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList) obj;

    if (hasDetails() != other.hasDetails()) return false;
    if (hasDetails()) {
      if (!getDetails()
          .equals(other.getDetails())) return false;
    }
    if (hasAccountSignature() != other.hasAccountSignature()) return false;
    if (hasAccountSignature()) {
      if (!getAccountSignature()
          .equals(other.getAccountSignature())) return false;
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
    if (hasDetails()) {
      hash = (37 * hash) + DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getDetails().hashCode();
    }
    if (hasAccountSignature()) {
      hash = (37 * hash) + ACCOUNTSIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getAccountSignature().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList prototype) {
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
   * Protobuf type {@code binary.ADVSignedKeyIndexList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.ADVSignedKeyIndexList)
      com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVSignedKeyIndexList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVSignedKeyIndexList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList.class, com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList.newBuilder()
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
      details_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      accountSignature_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ADVSignedKeyIndexList_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList build() {
      com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList result = new com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.details_ = details_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.accountSignature_ = accountSignature_;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList.getDefaultInstance()) return this;
      if (other.hasDetails()) {
        setDetails(other.getDetails());
      }
      if (other.hasAccountSignature()) {
        setAccountSignature(other.getAccountSignature());
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
      com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString details_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes details = 1;</code>
     * @return Whether the details field is set.
     */
    @java.lang.Override
    public boolean hasDetails() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes details = 1;</code>
     * @return The details.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDetails() {
      return details_;
    }
    /**
     * <code>optional bytes details = 1;</code>
     * @param value The details to set.
     * @return This builder for chaining.
     */
    public Builder setDetails(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      details_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes details = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDetails() {
      bitField0_ = (bitField0_ & ~0x00000001);
      details_ = getDefaultInstance().getDetails();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString accountSignature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes accountSignature = 2;</code>
     * @return Whether the accountSignature field is set.
     */
    @java.lang.Override
    public boolean hasAccountSignature() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes accountSignature = 2;</code>
     * @return The accountSignature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAccountSignature() {
      return accountSignature_;
    }
    /**
     * <code>optional bytes accountSignature = 2;</code>
     * @param value The accountSignature to set.
     * @return This builder for chaining.
     */
    public Builder setAccountSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      accountSignature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes accountSignature = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountSignature() {
      bitField0_ = (bitField0_ & ~0x00000002);
      accountSignature_ = getDefaultInstance().getAccountSignature();
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


    // @@protoc_insertion_point(builder_scope:binary.ADVSignedKeyIndexList)
  }

  // @@protoc_insertion_point(class_scope:binary.ADVSignedKeyIndexList)
  private static final com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ADVSignedKeyIndexList>
      PARSER = new com.google.protobuf.AbstractParser<ADVSignedKeyIndexList>() {
    @java.lang.Override
    public ADVSignedKeyIndexList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ADVSignedKeyIndexList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ADVSignedKeyIndexList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ADVSignedKeyIndexList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ADVSignedKeyIndexList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

