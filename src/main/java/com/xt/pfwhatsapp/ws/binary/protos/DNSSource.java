// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.DNSSource}
 */
public final class DNSSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.DNSSource)
    DNSSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DNSSource.newBuilder() to construct.
  private DNSSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DNSSource() {
    dnsMethod_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DNSSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DNSSource(
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
          case 120: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod value = com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(15, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              dnsMethod_ = rawValue;
            }
            break;
          }
          case 128: {
            bitField0_ |= 0x00000002;
            appCached_ = input.readBool();
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_DNSSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_DNSSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.DNSSource.class, com.xt.pfwhatsapp.ws.binary.protos.DNSSource.Builder.class);
  }

  /**
   * Protobuf enum {@code binary.DNSSource.DNSSourceDNSResolutionMethod}
   */
  public enum DNSSourceDNSResolutionMethod
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SYSTEM = 0;</code>
     */
    SYSTEM(0),
    /**
     * <code>GOOGLE = 1;</code>
     */
    GOOGLE(1),
    /**
     * <code>HARDCODED = 2;</code>
     */
    HARDCODED(2),
    /**
     * <code>OVERRIDE = 3;</code>
     */
    OVERRIDE(3),
    /**
     * <code>FALLBACK = 4;</code>
     */
    FALLBACK(4),
    ;

    /**
     * <code>SYSTEM = 0;</code>
     */
    public static final int SYSTEM_VALUE = 0;
    /**
     * <code>GOOGLE = 1;</code>
     */
    public static final int GOOGLE_VALUE = 1;
    /**
     * <code>HARDCODED = 2;</code>
     */
    public static final int HARDCODED_VALUE = 2;
    /**
     * <code>OVERRIDE = 3;</code>
     */
    public static final int OVERRIDE_VALUE = 3;
    /**
     * <code>FALLBACK = 4;</code>
     */
    public static final int FALLBACK_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DNSSourceDNSResolutionMethod valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DNSSourceDNSResolutionMethod forNumber(int value) {
      switch (value) {
        case 0: return SYSTEM;
        case 1: return GOOGLE;
        case 2: return HARDCODED;
        case 3: return OVERRIDE;
        case 4: return FALLBACK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DNSSourceDNSResolutionMethod>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DNSSourceDNSResolutionMethod> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DNSSourceDNSResolutionMethod>() {
            public DNSSourceDNSResolutionMethod findValueByNumber(int number) {
              return DNSSourceDNSResolutionMethod.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.DNSSource.getDescriptor().getEnumTypes().get(0);
    }

    private static final DNSSourceDNSResolutionMethod[] VALUES = values();

    public static DNSSourceDNSResolutionMethod valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DNSSourceDNSResolutionMethod(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:binary.DNSSource.DNSSourceDNSResolutionMethod)
  }

  private int bitField0_;
  public static final int DNSMETHOD_FIELD_NUMBER = 15;
  private int dnsMethod_;
  /**
   * <code>optional .binary.DNSSource.DNSSourceDNSResolutionMethod dnsMethod = 15;</code>
   * @return Whether the dnsMethod field is set.
   */
  @java.lang.Override public boolean hasDnsMethod() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .binary.DNSSource.DNSSourceDNSResolutionMethod dnsMethod = 15;</code>
   * @return The dnsMethod.
   */
  @java.lang.Override public com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod getDnsMethod() {
    @SuppressWarnings("deprecation")
    com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod result = com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod.valueOf(dnsMethod_);
    return result == null ? com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod.SYSTEM : result;
  }

  public static final int APPCACHED_FIELD_NUMBER = 16;
  private boolean appCached_;
  /**
   * <code>optional bool appCached = 16;</code>
   * @return Whether the appCached field is set.
   */
  @java.lang.Override
  public boolean hasAppCached() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bool appCached = 16;</code>
   * @return The appCached.
   */
  @java.lang.Override
  public boolean getAppCached() {
    return appCached_;
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
      output.writeEnum(15, dnsMethod_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(16, appCached_);
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
        .computeEnumSize(15, dnsMethod_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(16, appCached_);
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.DNSSource)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.DNSSource other = (com.xt.pfwhatsapp.ws.binary.protos.DNSSource) obj;

    if (hasDnsMethod() != other.hasDnsMethod()) return false;
    if (hasDnsMethod()) {
      if (dnsMethod_ != other.dnsMethod_) return false;
    }
    if (hasAppCached() != other.hasAppCached()) return false;
    if (hasAppCached()) {
      if (getAppCached()
          != other.getAppCached()) return false;
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
    if (hasDnsMethod()) {
      hash = (37 * hash) + DNSMETHOD_FIELD_NUMBER;
      hash = (53 * hash) + dnsMethod_;
    }
    if (hasAppCached()) {
      hash = (37 * hash) + APPCACHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAppCached());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.DNSSource prototype) {
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
   * Protobuf type {@code binary.DNSSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.DNSSource)
      com.xt.pfwhatsapp.ws.binary.protos.DNSSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_DNSSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_DNSSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.DNSSource.class, com.xt.pfwhatsapp.ws.binary.protos.DNSSource.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.DNSSource.newBuilder()
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
      dnsMethod_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      appCached_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_DNSSource_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.DNSSource getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.DNSSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.DNSSource build() {
      com.xt.pfwhatsapp.ws.binary.protos.DNSSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.DNSSource buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.DNSSource result = new com.xt.pfwhatsapp.ws.binary.protos.DNSSource(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.dnsMethod_ = dnsMethod_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.appCached_ = appCached_;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.DNSSource) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.DNSSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.DNSSource other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.DNSSource.getDefaultInstance()) return this;
      if (other.hasDnsMethod()) {
        setDnsMethod(other.getDnsMethod());
      }
      if (other.hasAppCached()) {
        setAppCached(other.getAppCached());
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
      com.xt.pfwhatsapp.ws.binary.protos.DNSSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.DNSSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int dnsMethod_ = 0;
    /**
     * <code>optional .binary.DNSSource.DNSSourceDNSResolutionMethod dnsMethod = 15;</code>
     * @return Whether the dnsMethod field is set.
     */
    @java.lang.Override public boolean hasDnsMethod() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .binary.DNSSource.DNSSourceDNSResolutionMethod dnsMethod = 15;</code>
     * @return The dnsMethod.
     */
    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod getDnsMethod() {
      @SuppressWarnings("deprecation")
      com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod result = com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod.valueOf(dnsMethod_);
      return result == null ? com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod.SYSTEM : result;
    }
    /**
     * <code>optional .binary.DNSSource.DNSSourceDNSResolutionMethod dnsMethod = 15;</code>
     * @param value The dnsMethod to set.
     * @return This builder for chaining.
     */
    public Builder setDnsMethod(com.xt.pfwhatsapp.ws.binary.protos.DNSSource.DNSSourceDNSResolutionMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      dnsMethod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .binary.DNSSource.DNSSourceDNSResolutionMethod dnsMethod = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearDnsMethod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dnsMethod_ = 0;
      onChanged();
      return this;
    }

    private boolean appCached_ ;
    /**
     * <code>optional bool appCached = 16;</code>
     * @return Whether the appCached field is set.
     */
    @java.lang.Override
    public boolean hasAppCached() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool appCached = 16;</code>
     * @return The appCached.
     */
    @java.lang.Override
    public boolean getAppCached() {
      return appCached_;
    }
    /**
     * <code>optional bool appCached = 16;</code>
     * @param value The appCached to set.
     * @return This builder for chaining.
     */
    public Builder setAppCached(boolean value) {
      bitField0_ |= 0x00000002;
      appCached_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool appCached = 16;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppCached() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appCached_ = false;
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


    // @@protoc_insertion_point(builder_scope:binary.DNSSource)
  }

  // @@protoc_insertion_point(class_scope:binary.DNSSource)
  private static final com.xt.pfwhatsapp.ws.binary.protos.DNSSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.DNSSource();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.DNSSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DNSSource>
      PARSER = new com.google.protobuf.AbstractParser<DNSSource>() {
    @java.lang.Override
    public DNSSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DNSSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DNSSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DNSSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.DNSSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

