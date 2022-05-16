// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface HistorySyncNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.HistorySyncNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes fileSha256 = 1;</code>
   * @return Whether the fileSha256 field is set.
   */
  boolean hasFileSha256();
  /**
   * <code>optional bytes fileSha256 = 1;</code>
   * @return The fileSha256.
   */
  com.google.protobuf.ByteString getFileSha256();

  /**
   * <code>optional uint64 fileLength = 2;</code>
   * @return Whether the fileLength field is set.
   */
  boolean hasFileLength();
  /**
   * <code>optional uint64 fileLength = 2;</code>
   * @return The fileLength.
   */
  long getFileLength();

  /**
   * <code>optional bytes mediaKey = 3;</code>
   * @return Whether the mediaKey field is set.
   */
  boolean hasMediaKey();
  /**
   * <code>optional bytes mediaKey = 3;</code>
   * @return The mediaKey.
   */
  com.google.protobuf.ByteString getMediaKey();

  /**
   * <code>optional bytes fileEncSha256 = 4;</code>
   * @return Whether the fileEncSha256 field is set.
   */
  boolean hasFileEncSha256();
  /**
   * <code>optional bytes fileEncSha256 = 4;</code>
   * @return The fileEncSha256.
   */
  com.google.protobuf.ByteString getFileEncSha256();

  /**
   * <code>optional string directPath = 5;</code>
   * @return Whether the directPath field is set.
   */
  boolean hasDirectPath();
  /**
   * <code>optional string directPath = 5;</code>
   * @return The directPath.
   */
  java.lang.String getDirectPath();
  /**
   * <code>optional string directPath = 5;</code>
   * @return The bytes for directPath.
   */
  com.google.protobuf.ByteString
      getDirectPathBytes();

  /**
   * <code>optional .binary.HistorySyncNotification.HistorySyncNotificationHistorySyncType syncType = 6;</code>
   * @return Whether the syncType field is set.
   */
  boolean hasSyncType();
  /**
   * <code>optional .binary.HistorySyncNotification.HistorySyncNotificationHistorySyncType syncType = 6;</code>
   * @return The syncType.
   */
  com.xt.pfwhatsapp.ws.binary.protos.HistorySyncNotification.HistorySyncNotificationHistorySyncType getSyncType();

  /**
   * <code>optional uint32 chunkOrder = 7;</code>
   * @return Whether the chunkOrder field is set.
   */
  boolean hasChunkOrder();
  /**
   * <code>optional uint32 chunkOrder = 7;</code>
   * @return The chunkOrder.
   */
  int getChunkOrder();

  /**
   * <code>optional string originalMessageId = 8;</code>
   * @return Whether the originalMessageId field is set.
   */
  boolean hasOriginalMessageId();
  /**
   * <code>optional string originalMessageId = 8;</code>
   * @return The originalMessageId.
   */
  java.lang.String getOriginalMessageId();
  /**
   * <code>optional string originalMessageId = 8;</code>
   * @return The bytes for originalMessageId.
   */
  com.google.protobuf.ByteString
      getOriginalMessageIdBytes();
}
