// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.ProductSection}
 */
public final class ProductSection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.ProductSection)
    ProductSectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductSection.newBuilder() to construct.
  private ProductSection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductSection() {
    title_ = "";
    products_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductSection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductSection(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            title_ = bs;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              products_ = new java.util.ArrayList<com.xt.pfwhatsapp.ws.binary.protos.Product>();
              mutable_bitField0_ |= 0x00000002;
            }
            products_.add(
                input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.Product.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        products_ = java.util.Collections.unmodifiableList(products_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ProductSection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ProductSection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.ProductSection.class, com.xt.pfwhatsapp.ws.binary.protos.ProductSection.Builder.class);
  }

  private int bitField0_;
  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>optional string title = 1;</code>
   * @return Whether the title field is set.
   */
  @java.lang.Override
  public boolean hasTitle() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string title = 1;</code>
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
   * <code>optional string title = 1;</code>
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

  public static final int PRODUCTS_FIELD_NUMBER = 2;
  private java.util.List<com.xt.pfwhatsapp.ws.binary.protos.Product> products_;
  /**
   * <code>repeated .binary.Product products = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.xt.pfwhatsapp.ws.binary.protos.Product> getProductsList() {
    return products_;
  }
  /**
   * <code>repeated .binary.Product products = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.xt.pfwhatsapp.ws.binary.protos.ProductOrBuilder>
      getProductsOrBuilderList() {
    return products_;
  }
  /**
   * <code>repeated .binary.Product products = 2;</code>
   */
  @java.lang.Override
  public int getProductsCount() {
    return products_.size();
  }
  /**
   * <code>repeated .binary.Product products = 2;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.Product getProducts(int index) {
    return products_.get(index);
  }
  /**
   * <code>repeated .binary.Product products = 2;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ProductOrBuilder getProductsOrBuilder(
      int index) {
    return products_.get(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    for (int i = 0; i < products_.size(); i++) {
      output.writeMessage(2, products_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    for (int i = 0; i < products_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, products_.get(i));
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.ProductSection)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.ProductSection other = (com.xt.pfwhatsapp.ws.binary.protos.ProductSection) obj;

    if (hasTitle() != other.hasTitle()) return false;
    if (hasTitle()) {
      if (!getTitle()
          .equals(other.getTitle())) return false;
    }
    if (!getProductsList()
        .equals(other.getProductsList())) return false;
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
    if (hasTitle()) {
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
    }
    if (getProductsCount() > 0) {
      hash = (37 * hash) + PRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getProductsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.ProductSection prototype) {
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
   * Protobuf type {@code binary.ProductSection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.ProductSection)
      com.xt.pfwhatsapp.ws.binary.protos.ProductSectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ProductSection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ProductSection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.ProductSection.class, com.xt.pfwhatsapp.ws.binary.protos.ProductSection.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.ProductSection.newBuilder()
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
        getProductsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      title_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        productsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_ProductSection_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ProductSection getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.ProductSection.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ProductSection build() {
      com.xt.pfwhatsapp.ws.binary.protos.ProductSection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.ProductSection buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.ProductSection result = new com.xt.pfwhatsapp.ws.binary.protos.ProductSection(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.title_ = title_;
      if (productsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          products_ = java.util.Collections.unmodifiableList(products_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.products_ = products_;
      } else {
        result.products_ = productsBuilder_.build();
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.ProductSection) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.ProductSection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.ProductSection other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.ProductSection.getDefaultInstance()) return this;
      if (other.hasTitle()) {
        bitField0_ |= 0x00000001;
        title_ = other.title_;
        onChanged();
      }
      if (productsBuilder_ == null) {
        if (!other.products_.isEmpty()) {
          if (products_.isEmpty()) {
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureProductsIsMutable();
            products_.addAll(other.products_);
          }
          onChanged();
        }
      } else {
        if (!other.products_.isEmpty()) {
          if (productsBuilder_.isEmpty()) {
            productsBuilder_.dispose();
            productsBuilder_ = null;
            products_ = other.products_;
            bitField0_ = (bitField0_ & ~0x00000002);
            productsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductsFieldBuilder() : null;
          } else {
            productsBuilder_.addAllMessages(other.products_);
          }
        }
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
      com.xt.pfwhatsapp.ws.binary.protos.ProductSection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.ProductSection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object title_ = "";
    /**
     * <code>optional string title = 1;</code>
     * @return Whether the title field is set.
     */
    public boolean hasTitle() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string title = 1;</code>
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
     * <code>optional string title = 1;</code>
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
     * <code>optional string title = 1;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      bitField0_ = (bitField0_ & ~0x00000001);
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 1;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      title_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.xt.pfwhatsapp.ws.binary.protos.Product> products_ =
      java.util.Collections.emptyList();
    private void ensureProductsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        products_ = new java.util.ArrayList<com.xt.pfwhatsapp.ws.binary.protos.Product>(products_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.Product, com.xt.pfwhatsapp.ws.binary.protos.Product.Builder, com.xt.pfwhatsapp.ws.binary.protos.ProductOrBuilder> productsBuilder_;

    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public java.util.List<com.xt.pfwhatsapp.ws.binary.protos.Product> getProductsList() {
      if (productsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(products_);
      } else {
        return productsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public int getProductsCount() {
      if (productsBuilder_ == null) {
        return products_.size();
      } else {
        return productsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.Product getProducts(int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);
      } else {
        return productsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder setProducts(
        int index, com.xt.pfwhatsapp.ws.binary.protos.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.set(index, value);
        onChanged();
      } else {
        productsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder setProducts(
        int index, com.xt.pfwhatsapp.ws.binary.protos.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.set(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder addProducts(com.xt.pfwhatsapp.ws.binary.protos.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(value);
        onChanged();
      } else {
        productsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder addProducts(
        int index, com.xt.pfwhatsapp.ws.binary.protos.Product value) {
      if (productsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductsIsMutable();
        products_.add(index, value);
        onChanged();
      } else {
        productsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder addProducts(
        com.xt.pfwhatsapp.ws.binary.protos.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder addProducts(
        int index, com.xt.pfwhatsapp.ws.binary.protos.Product.Builder builderForValue) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.add(index, builderForValue.build());
        onChanged();
      } else {
        productsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder addAllProducts(
        java.lang.Iterable<? extends com.xt.pfwhatsapp.ws.binary.protos.Product> values) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, products_);
        onChanged();
      } else {
        productsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder clearProducts() {
      if (productsBuilder_ == null) {
        products_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        productsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public Builder removeProducts(int index) {
      if (productsBuilder_ == null) {
        ensureProductsIsMutable();
        products_.remove(index);
        onChanged();
      } else {
        productsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.Product.Builder getProductsBuilder(
        int index) {
      return getProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.ProductOrBuilder getProductsOrBuilder(
        int index) {
      if (productsBuilder_ == null) {
        return products_.get(index);  } else {
        return productsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public java.util.List<? extends com.xt.pfwhatsapp.ws.binary.protos.ProductOrBuilder>
         getProductsOrBuilderList() {
      if (productsBuilder_ != null) {
        return productsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(products_);
      }
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.Product.Builder addProductsBuilder() {
      return getProductsFieldBuilder().addBuilder(
          com.xt.pfwhatsapp.ws.binary.protos.Product.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.Product.Builder addProductsBuilder(
        int index) {
      return getProductsFieldBuilder().addBuilder(
          index, com.xt.pfwhatsapp.ws.binary.protos.Product.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.Product products = 2;</code>
     */
    public java.util.List<com.xt.pfwhatsapp.ws.binary.protos.Product.Builder>
         getProductsBuilderList() {
      return getProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.Product, com.xt.pfwhatsapp.ws.binary.protos.Product.Builder, com.xt.pfwhatsapp.ws.binary.protos.ProductOrBuilder>
        getProductsFieldBuilder() {
      if (productsBuilder_ == null) {
        productsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.Product, com.xt.pfwhatsapp.ws.binary.protos.Product.Builder, com.xt.pfwhatsapp.ws.binary.protos.ProductOrBuilder>(
                products_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        products_ = null;
      }
      return productsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:binary.ProductSection)
  }

  // @@protoc_insertion_point(class_scope:binary.ProductSection)
  private static final com.xt.pfwhatsapp.ws.binary.protos.ProductSection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.ProductSection();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.ProductSection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ProductSection>
      PARSER = new com.google.protobuf.AbstractParser<ProductSection>() {
    @java.lang.Override
    public ProductSection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductSection(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductSection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductSection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.ProductSection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

