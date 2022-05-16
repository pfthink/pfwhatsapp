// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.CatalogSnapshot}
 */
public final class CatalogSnapshot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.CatalogSnapshot)
    CatalogSnapshotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CatalogSnapshot.newBuilder() to construct.
  private CatalogSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CatalogSnapshot() {
    title_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CatalogSnapshot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CatalogSnapshot(
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
            com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = catalogImage_.toBuilder();
            }
            catalogImage_ = input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(catalogImage_);
              catalogImage_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            title_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            description_ = bs;
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CatalogSnapshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CatalogSnapshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot.class, com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot.Builder.class);
  }

  private int bitField0_;
  public static final int CATALOGIMAGE_FIELD_NUMBER = 1;
  private com.xt.pfwhatsapp.ws.binary.protos.ImageMessage catalogImage_;
  /**
   * <code>optional .binary.ImageMessage catalogImage = 1;</code>
   * @return Whether the catalogImage field is set.
   */
  @java.lang.Override
  public boolean hasCatalogImage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .binary.ImageMessage catalogImage = 1;</code>
   * @return The catalogImage.
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ImageMessage getCatalogImage() {
    return catalogImage_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.getDefaultInstance() : catalogImage_;
  }
  /**
   * <code>optional .binary.ImageMessage catalogImage = 1;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ImageMessageOrBuilder getCatalogImageOrBuilder() {
    return catalogImage_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.getDefaultInstance() : catalogImage_;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>optional string title = 2;</code>
   * @return Whether the title field is set.
   */
  @java.lang.Override
  public boolean hasTitle() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        title_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>optional string description = 3;</code>
   * @return Whether the description field is set.
   */
  @java.lang.Override
  public boolean hasDescription() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        description_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      output.writeMessage(1, getCatalogImage());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
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
        .computeMessageSize(1, getCatalogImage());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot other = (com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot) obj;

    if (hasCatalogImage() != other.hasCatalogImage()) return false;
    if (hasCatalogImage()) {
      if (!getCatalogImage()
          .equals(other.getCatalogImage())) return false;
    }
    if (hasTitle() != other.hasTitle()) return false;
    if (hasTitle()) {
      if (!getTitle()
          .equals(other.getTitle())) return false;
    }
    if (hasDescription() != other.hasDescription()) return false;
    if (hasDescription()) {
      if (!getDescription()
          .equals(other.getDescription())) return false;
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
    if (hasCatalogImage()) {
      hash = (37 * hash) + CATALOGIMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getCatalogImage().hashCode();
    }
    if (hasTitle()) {
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
    }
    if (hasDescription()) {
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot prototype) {
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
   * Protobuf type {@code binary.CatalogSnapshot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.CatalogSnapshot)
      com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CatalogSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CatalogSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot.class, com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot.newBuilder()
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
        getCatalogImageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (catalogImageBuilder_ == null) {
        catalogImage_ = null;
      } else {
        catalogImageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      title_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      description_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CatalogSnapshot_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot build() {
      com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot result = new com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (catalogImageBuilder_ == null) {
          result.catalogImage_ = catalogImage_;
        } else {
          result.catalogImage_ = catalogImageBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.title_ = title_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.description_ = description_;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot.getDefaultInstance()) return this;
      if (other.hasCatalogImage()) {
        mergeCatalogImage(other.getCatalogImage());
      }
      if (other.hasTitle()) {
        bitField0_ |= 0x00000002;
        title_ = other.title_;
        onChanged();
      }
      if (other.hasDescription()) {
        bitField0_ |= 0x00000004;
        description_ = other.description_;
        onChanged();
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
      com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.xt.pfwhatsapp.ws.binary.protos.ImageMessage catalogImage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.ImageMessage, com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.Builder, com.xt.pfwhatsapp.ws.binary.protos.ImageMessageOrBuilder> catalogImageBuilder_;
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     * @return Whether the catalogImage field is set.
     */
    public boolean hasCatalogImage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     * @return The catalogImage.
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ImageMessage getCatalogImage() {
      if (catalogImageBuilder_ == null) {
        return catalogImage_ == null ? com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.getDefaultInstance() : catalogImage_;
      } else {
        return catalogImageBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     */
    public Builder setCatalogImage(com.xt.pfwhatsapp.ws.binary.protos.ImageMessage value) {
      if (catalogImageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        catalogImage_ = value;
        onChanged();
      } else {
        catalogImageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     */
    public Builder setCatalogImage(
        com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.Builder builderForValue) {
      if (catalogImageBuilder_ == null) {
        catalogImage_ = builderForValue.build();
        onChanged();
      } else {
        catalogImageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     */
    public Builder mergeCatalogImage(com.xt.pfwhatsapp.ws.binary.protos.ImageMessage value) {
      if (catalogImageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            catalogImage_ != null &&
            catalogImage_ != com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.getDefaultInstance()) {
          catalogImage_ =
            com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.newBuilder(catalogImage_).mergeFrom(value).buildPartial();
        } else {
          catalogImage_ = value;
        }
        onChanged();
      } else {
        catalogImageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     */
    public Builder clearCatalogImage() {
      if (catalogImageBuilder_ == null) {
        catalogImage_ = null;
        onChanged();
      } else {
        catalogImageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.Builder getCatalogImageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCatalogImageFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ImageMessageOrBuilder getCatalogImageOrBuilder() {
      if (catalogImageBuilder_ != null) {
        return catalogImageBuilder_.getMessageOrBuilder();
      } else {
        return catalogImage_ == null ?
            com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.getDefaultInstance() : catalogImage_;
      }
    }
    /**
     * <code>optional .binary.ImageMessage catalogImage = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.ImageMessage, com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.Builder, com.xt.pfwhatsapp.ws.binary.protos.ImageMessageOrBuilder>
        getCatalogImageFieldBuilder() {
      if (catalogImageBuilder_ == null) {
        catalogImageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.ImageMessage, com.xt.pfwhatsapp.ws.binary.protos.ImageMessage.Builder, com.xt.pfwhatsapp.ws.binary.protos.ImageMessageOrBuilder>(
                getCatalogImage(),
                getParentForChildren(),
                isClean());
        catalogImage_ = null;
      }
      return catalogImageBuilder_;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>optional string title = 2;</code>
     * @return Whether the title field is set.
     */
    public boolean hasTitle() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          title_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      bitField0_ = (bitField0_ & ~0x00000002);
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>optional string description = 3;</code>
     * @return Whether the description field is set.
     */
    public boolean hasDescription() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string description = 3;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          description_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      bitField0_ = (bitField0_ & ~0x00000004);
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>optional string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      description_ = value;
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


    // @@protoc_insertion_point(builder_scope:binary.CatalogSnapshot)
  }

  // @@protoc_insertion_point(class_scope:binary.CatalogSnapshot)
  private static final com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CatalogSnapshot>
      PARSER = new com.google.protobuf.AbstractParser<CatalogSnapshot>() {
    @java.lang.Override
    public CatalogSnapshot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CatalogSnapshot(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CatalogSnapshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CatalogSnapshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

