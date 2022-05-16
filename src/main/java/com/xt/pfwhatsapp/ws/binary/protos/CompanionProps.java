// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

/**
 * Protobuf type {@code binary.CompanionProps}
 */
public final class CompanionProps extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.CompanionProps)
    CompanionPropsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompanionProps.newBuilder() to construct.
  private CompanionProps(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompanionProps() {
    os_ = "";
    platformType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompanionProps();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CompanionProps(
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
            os_ = bs;
            break;
          }
          case 18: {
            com.xt.pfwhatsapp.ws.binary.protos.AppVersion.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = version_.toBuilder();
            }
            version_ = input.readMessage(com.xt.pfwhatsapp.ws.binary.protos.AppVersion.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(version_);
              version_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType value = com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(3, rawValue);
            } else {
              bitField0_ |= 0x00000004;
              platformType_ = rawValue;
            }
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            requireFullSync_ = input.readBool();
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
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionProps_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionProps_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.class, com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.Builder.class);
  }

  /**
   * Protobuf enum {@code binary.CompanionProps.CompanionPropsPlatformType}
   */
  public enum CompanionPropsPlatformType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>CHROME = 1;</code>
     */
    CHROME(1),
    /**
     * <code>FIREFOX = 2;</code>
     */
    FIREFOX(2),
    /**
     * <code>IE = 3;</code>
     */
    IE(3),
    /**
     * <code>OPERA = 4;</code>
     */
    OPERA(4),
    /**
     * <code>SAFARI = 5;</code>
     */
    SAFARI(5),
    /**
     * <code>EDGE = 6;</code>
     */
    EDGE(6),
    /**
     * <code>DESKTOP = 7;</code>
     */
    DESKTOP(7),
    /**
     * <code>IPAD = 8;</code>
     */
    IPAD(8),
    /**
     * <code>ANDROID_TABLET = 9;</code>
     */
    ANDROID_TABLET(9),
    /**
     * <code>OHANA = 10;</code>
     */
    OHANA(10),
    /**
     * <code>ALOHA = 11;</code>
     */
    ALOHA(11),
    /**
     * <code>CATALINA = 12;</code>
     */
    CATALINA(12),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>CHROME = 1;</code>
     */
    public static final int CHROME_VALUE = 1;
    /**
     * <code>FIREFOX = 2;</code>
     */
    public static final int FIREFOX_VALUE = 2;
    /**
     * <code>IE = 3;</code>
     */
    public static final int IE_VALUE = 3;
    /**
     * <code>OPERA = 4;</code>
     */
    public static final int OPERA_VALUE = 4;
    /**
     * <code>SAFARI = 5;</code>
     */
    public static final int SAFARI_VALUE = 5;
    /**
     * <code>EDGE = 6;</code>
     */
    public static final int EDGE_VALUE = 6;
    /**
     * <code>DESKTOP = 7;</code>
     */
    public static final int DESKTOP_VALUE = 7;
    /**
     * <code>IPAD = 8;</code>
     */
    public static final int IPAD_VALUE = 8;
    /**
     * <code>ANDROID_TABLET = 9;</code>
     */
    public static final int ANDROID_TABLET_VALUE = 9;
    /**
     * <code>OHANA = 10;</code>
     */
    public static final int OHANA_VALUE = 10;
    /**
     * <code>ALOHA = 11;</code>
     */
    public static final int ALOHA_VALUE = 11;
    /**
     * <code>CATALINA = 12;</code>
     */
    public static final int CATALINA_VALUE = 12;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CompanionPropsPlatformType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CompanionPropsPlatformType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return CHROME;
        case 2: return FIREFOX;
        case 3: return IE;
        case 4: return OPERA;
        case 5: return SAFARI;
        case 6: return EDGE;
        case 7: return DESKTOP;
        case 8: return IPAD;
        case 9: return ANDROID_TABLET;
        case 10: return OHANA;
        case 11: return ALOHA;
        case 12: return CATALINA;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CompanionPropsPlatformType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CompanionPropsPlatformType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CompanionPropsPlatformType>() {
            public CompanionPropsPlatformType findValueByNumber(int number) {
              return CompanionPropsPlatformType.forNumber(number);
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
      return com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.getDescriptor().getEnumTypes().get(0);
    }

    private static final CompanionPropsPlatformType[] VALUES = values();

    public static CompanionPropsPlatformType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CompanionPropsPlatformType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:binary.CompanionProps.CompanionPropsPlatformType)
  }

  private int bitField0_;
  public static final int OS_FIELD_NUMBER = 1;
  private volatile java.lang.Object os_;
  /**
   * <code>optional string os = 1;</code>
   * @return Whether the os field is set.
   */
  @java.lang.Override
  public boolean hasOs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string os = 1;</code>
   * @return The os.
   */
  @java.lang.Override
  public java.lang.String getOs() {
    java.lang.Object ref = os_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        os_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string os = 1;</code>
   * @return The bytes for os.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOsBytes() {
    java.lang.Object ref = os_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      os_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private com.xt.pfwhatsapp.ws.binary.protos.AppVersion version_;
  /**
   * <code>optional .binary.AppVersion version = 2;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .binary.AppVersion version = 2;</code>
   * @return The version.
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.AppVersion getVersion() {
    return version_ == null ? com.xt.pfwhatsapp.ws.binary.protos.AppVersion.getDefaultInstance() : version_;
  }
  /**
   * <code>optional .binary.AppVersion version = 2;</code>
   */
  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.AppVersionOrBuilder getVersionOrBuilder() {
    return version_ == null ? com.xt.pfwhatsapp.ws.binary.protos.AppVersion.getDefaultInstance() : version_;
  }

  public static final int PLATFORMTYPE_FIELD_NUMBER = 3;
  private int platformType_;
  /**
   * <code>optional .binary.CompanionProps.CompanionPropsPlatformType platformType = 3;</code>
   * @return Whether the platformType field is set.
   */
  @java.lang.Override public boolean hasPlatformType() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .binary.CompanionProps.CompanionPropsPlatformType platformType = 3;</code>
   * @return The platformType.
   */
  @java.lang.Override public com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType getPlatformType() {
    @SuppressWarnings("deprecation")
    com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType result = com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType.valueOf(platformType_);
    return result == null ? com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType.UNKNOWN : result;
  }

  public static final int REQUIREFULLSYNC_FIELD_NUMBER = 4;
  private boolean requireFullSync_;
  /**
   * <code>optional bool requireFullSync = 4;</code>
   * @return Whether the requireFullSync field is set.
   */
  @java.lang.Override
  public boolean hasRequireFullSync() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional bool requireFullSync = 4;</code>
   * @return The requireFullSync.
   */
  @java.lang.Override
  public boolean getRequireFullSync() {
    return requireFullSync_;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, os_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getVersion());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeEnum(3, platformType_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeBool(4, requireFullSync_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, os_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVersion());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, platformType_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, requireFullSync_);
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
    if (!(obj instanceof com.xt.pfwhatsapp.ws.binary.protos.CompanionProps)) {
      return super.equals(obj);
    }
    com.xt.pfwhatsapp.ws.binary.protos.CompanionProps other = (com.xt.pfwhatsapp.ws.binary.protos.CompanionProps) obj;

    if (hasOs() != other.hasOs()) return false;
    if (hasOs()) {
      if (!getOs()
          .equals(other.getOs())) return false;
    }
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion()
          .equals(other.getVersion())) return false;
    }
    if (hasPlatformType() != other.hasPlatformType()) return false;
    if (hasPlatformType()) {
      if (platformType_ != other.platformType_) return false;
    }
    if (hasRequireFullSync() != other.hasRequireFullSync()) return false;
    if (hasRequireFullSync()) {
      if (getRequireFullSync()
          != other.getRequireFullSync()) return false;
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
    if (hasOs()) {
      hash = (37 * hash) + OS_FIELD_NUMBER;
      hash = (53 * hash) + getOs().hashCode();
    }
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    if (hasPlatformType()) {
      hash = (37 * hash) + PLATFORMTYPE_FIELD_NUMBER;
      hash = (53 * hash) + platformType_;
    }
    if (hasRequireFullSync()) {
      hash = (37 * hash) + REQUIREFULLSYNC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRequireFullSync());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parseFrom(
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
  public static Builder newBuilder(com.xt.pfwhatsapp.ws.binary.protos.CompanionProps prototype) {
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
   * Protobuf type {@code binary.CompanionProps}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.CompanionProps)
      com.xt.pfwhatsapp.ws.binary.protos.CompanionPropsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionProps_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionProps_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.class, com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.Builder.class);
    }

    // Construct using com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.newBuilder()
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
        getVersionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      os_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        versionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      platformType_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      requireFullSync_ = false;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.WaMessageProtos.internal_static_binary_CompanionProps_descriptor;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.CompanionProps getDefaultInstanceForType() {
      return com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.getDefaultInstance();
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.CompanionProps build() {
      com.xt.pfwhatsapp.ws.binary.protos.CompanionProps result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.CompanionProps buildPartial() {
      com.xt.pfwhatsapp.ws.binary.protos.CompanionProps result = new com.xt.pfwhatsapp.ws.binary.protos.CompanionProps(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.os_ = os_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (versionBuilder_ == null) {
          result.version_ = version_;
        } else {
          result.version_ = versionBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.platformType_ = platformType_;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.requireFullSync_ = requireFullSync_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.xt.pfwhatsapp.ws.binary.protos.CompanionProps) {
        return mergeFrom((com.xt.pfwhatsapp.ws.binary.protos.CompanionProps)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xt.pfwhatsapp.ws.binary.protos.CompanionProps other) {
      if (other == com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.getDefaultInstance()) return this;
      if (other.hasOs()) {
        bitField0_ |= 0x00000001;
        os_ = other.os_;
        onChanged();
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (other.hasPlatformType()) {
        setPlatformType(other.getPlatformType());
      }
      if (other.hasRequireFullSync()) {
        setRequireFullSync(other.getRequireFullSync());
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
      com.xt.pfwhatsapp.ws.binary.protos.CompanionProps parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xt.pfwhatsapp.ws.binary.protos.CompanionProps) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object os_ = "";
    /**
     * <code>optional string os = 1;</code>
     * @return Whether the os field is set.
     */
    public boolean hasOs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string os = 1;</code>
     * @return The os.
     */
    public java.lang.String getOs() {
      java.lang.Object ref = os_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          os_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string os = 1;</code>
     * @return The bytes for os.
     */
    public com.google.protobuf.ByteString
        getOsBytes() {
      java.lang.Object ref = os_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        os_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string os = 1;</code>
     * @param value The os to set.
     * @return This builder for chaining.
     */
    public Builder setOs(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      os_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string os = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      os_ = getDefaultInstance().getOs();
      onChanged();
      return this;
    }
    /**
     * <code>optional string os = 1;</code>
     * @param value The bytes for os to set.
     * @return This builder for chaining.
     */
    public Builder setOsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      os_ = value;
      onChanged();
      return this;
    }

    private com.xt.pfwhatsapp.ws.binary.protos.AppVersion version_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.AppVersion, com.xt.pfwhatsapp.ws.binary.protos.AppVersion.Builder, com.xt.pfwhatsapp.ws.binary.protos.AppVersionOrBuilder> versionBuilder_;
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     * @return The version.
     */
    public com.xt.pfwhatsapp.ws.binary.protos.AppVersion getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? com.xt.pfwhatsapp.ws.binary.protos.AppVersion.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     */
    public Builder setVersion(com.xt.pfwhatsapp.ws.binary.protos.AppVersion value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     */
    public Builder setVersion(
        com.xt.pfwhatsapp.ws.binary.protos.AppVersion.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     */
    public Builder mergeVersion(com.xt.pfwhatsapp.ws.binary.protos.AppVersion value) {
      if (versionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            version_ != null &&
            version_ != com.xt.pfwhatsapp.ws.binary.protos.AppVersion.getDefaultInstance()) {
          version_ =
            com.xt.pfwhatsapp.ws.binary.protos.AppVersion.newBuilder(version_).mergeFrom(value).buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        versionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.AppVersion.Builder getVersionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     */
    public com.xt.pfwhatsapp.ws.binary.protos.AppVersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ?
            com.xt.pfwhatsapp.ws.binary.protos.AppVersion.getDefaultInstance() : version_;
      }
    }
    /**
     * <code>optional .binary.AppVersion version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xt.pfwhatsapp.ws.binary.protos.AppVersion, com.xt.pfwhatsapp.ws.binary.protos.AppVersion.Builder, com.xt.pfwhatsapp.ws.binary.protos.AppVersionOrBuilder>
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xt.pfwhatsapp.ws.binary.protos.AppVersion, com.xt.pfwhatsapp.ws.binary.protos.AppVersion.Builder, com.xt.pfwhatsapp.ws.binary.protos.AppVersionOrBuilder>(
                getVersion(),
                getParentForChildren(),
                isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private int platformType_ = 0;
    /**
     * <code>optional .binary.CompanionProps.CompanionPropsPlatformType platformType = 3;</code>
     * @return Whether the platformType field is set.
     */
    @java.lang.Override public boolean hasPlatformType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .binary.CompanionProps.CompanionPropsPlatformType platformType = 3;</code>
     * @return The platformType.
     */
    @java.lang.Override
    public com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType getPlatformType() {
      @SuppressWarnings("deprecation")
      com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType result = com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType.valueOf(platformType_);
      return result == null ? com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType.UNKNOWN : result;
    }
    /**
     * <code>optional .binary.CompanionProps.CompanionPropsPlatformType platformType = 3;</code>
     * @param value The platformType to set.
     * @return This builder for chaining.
     */
    public Builder setPlatformType(com.xt.pfwhatsapp.ws.binary.protos.CompanionProps.CompanionPropsPlatformType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      platformType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .binary.CompanionProps.CompanionPropsPlatformType platformType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlatformType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      platformType_ = 0;
      onChanged();
      return this;
    }

    private boolean requireFullSync_ ;
    /**
     * <code>optional bool requireFullSync = 4;</code>
     * @return Whether the requireFullSync field is set.
     */
    @java.lang.Override
    public boolean hasRequireFullSync() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional bool requireFullSync = 4;</code>
     * @return The requireFullSync.
     */
    @java.lang.Override
    public boolean getRequireFullSync() {
      return requireFullSync_;
    }
    /**
     * <code>optional bool requireFullSync = 4;</code>
     * @param value The requireFullSync to set.
     * @return This builder for chaining.
     */
    public Builder setRequireFullSync(boolean value) {
      bitField0_ |= 0x00000008;
      requireFullSync_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool requireFullSync = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequireFullSync() {
      bitField0_ = (bitField0_ & ~0x00000008);
      requireFullSync_ = false;
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


    // @@protoc_insertion_point(builder_scope:binary.CompanionProps)
  }

  // @@protoc_insertion_point(class_scope:binary.CompanionProps)
  private static final com.xt.pfwhatsapp.ws.binary.protos.CompanionProps DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xt.pfwhatsapp.ws.binary.protos.CompanionProps();
  }

  public static com.xt.pfwhatsapp.ws.binary.protos.CompanionProps getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CompanionProps>
      PARSER = new com.google.protobuf.AbstractParser<CompanionProps>() {
    @java.lang.Override
    public CompanionProps parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CompanionProps(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompanionProps> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompanionProps> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xt.pfwhatsapp.ws.binary.protos.CompanionProps getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

