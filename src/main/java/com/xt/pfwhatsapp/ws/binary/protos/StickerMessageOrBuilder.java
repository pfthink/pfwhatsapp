// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface StickerMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.StickerMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string url = 1;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional bytes fileSha256 = 2;</code>
   * @return Whether the fileSha256 field is set.
   */
  boolean hasFileSha256();
  /**
   * <code>optional bytes fileSha256 = 2;</code>
   * @return The fileSha256.
   */
  com.google.protobuf.ByteString getFileSha256();

  /**
   * <code>optional bytes fileEncSha256 = 3;</code>
   * @return Whether the fileEncSha256 field is set.
   */
  boolean hasFileEncSha256();
  /**
   * <code>optional bytes fileEncSha256 = 3;</code>
   * @return The fileEncSha256.
   */
  com.google.protobuf.ByteString getFileEncSha256();

  /**
   * <code>optional bytes mediaKey = 4;</code>
   * @return Whether the mediaKey field is set.
   */
  boolean hasMediaKey();
  /**
   * <code>optional bytes mediaKey = 4;</code>
   * @return The mediaKey.
   */
  com.google.protobuf.ByteString getMediaKey();

  /**
   * <code>optional string mimetype = 5;</code>
   * @return Whether the mimetype field is set.
   */
  boolean hasMimetype();
  /**
   * <code>optional string mimetype = 5;</code>
   * @return The mimetype.
   */
  java.lang.String getMimetype();
  /**
   * <code>optional string mimetype = 5;</code>
   * @return The bytes for mimetype.
   */
  com.google.protobuf.ByteString
      getMimetypeBytes();

  /**
   * <code>optional uint32 height = 6;</code>
   * @return Whether the height field is set.
   */
  boolean hasHeight();
  /**
   * <code>optional uint32 height = 6;</code>
   * @return The height.
   */
  int getHeight();

  /**
   * <code>optional uint32 width = 7;</code>
   * @return Whether the width field is set.
   */
  boolean hasWidth();
  /**
   * <code>optional uint32 width = 7;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <code>optional string directPath = 8;</code>
   * @return Whether the directPath field is set.
   */
  boolean hasDirectPath();
  /**
   * <code>optional string directPath = 8;</code>
   * @return The directPath.
   */
  java.lang.String getDirectPath();
  /**
   * <code>optional string directPath = 8;</code>
   * @return The bytes for directPath.
   */
  com.google.protobuf.ByteString
      getDirectPathBytes();

  /**
   * <code>optional uint64 fileLength = 9;</code>
   * @return Whether the fileLength field is set.
   */
  boolean hasFileLength();
  /**
   * <code>optional uint64 fileLength = 9;</code>
   * @return The fileLength.
   */
  long getFileLength();

  /**
   * <code>optional int64 mediaKeyTimestamp = 10;</code>
   * @return Whether the mediaKeyTimestamp field is set.
   */
  boolean hasMediaKeyTimestamp();
  /**
   * <code>optional int64 mediaKeyTimestamp = 10;</code>
   * @return The mediaKeyTimestamp.
   */
  long getMediaKeyTimestamp();

  /**
   * <code>optional uint32 firstFrameLength = 11;</code>
   * @return Whether the firstFrameLength field is set.
   */
  boolean hasFirstFrameLength();
  /**
   * <code>optional uint32 firstFrameLength = 11;</code>
   * @return The firstFrameLength.
   */
  int getFirstFrameLength();

  /**
   * <code>optional bytes firstFrameSidecar = 12;</code>
   * @return Whether the firstFrameSidecar field is set.
   */
  boolean hasFirstFrameSidecar();
  /**
   * <code>optional bytes firstFrameSidecar = 12;</code>
   * @return The firstFrameSidecar.
   */
  com.google.protobuf.ByteString getFirstFrameSidecar();

  /**
   * <code>optional bool isAnimated = 13;</code>
   * @return Whether the isAnimated field is set.
   */
  boolean hasIsAnimated();
  /**
   * <code>optional bool isAnimated = 13;</code>
   * @return The isAnimated.
   */
  boolean getIsAnimated();

  /**
   * <code>optional bytes pngThumbnail = 16;</code>
   * @return Whether the pngThumbnail field is set.
   */
  boolean hasPngThumbnail();
  /**
   * <code>optional bytes pngThumbnail = 16;</code>
   * @return The pngThumbnail.
   */
  com.google.protobuf.ByteString getPngThumbnail();

  /**
   * <code>optional .binary.ContextInfo contextInfo = 17;</code>
   * @return Whether the contextInfo field is set.
   */
  boolean hasContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 17;</code>
   * @return The contextInfo.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ContextInfo getContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 17;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.ContextInfoOrBuilder getContextInfoOrBuilder();
}
