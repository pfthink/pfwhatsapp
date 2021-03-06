// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface PaymentBackgroundOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.PaymentBackground)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>optional string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>optional string fileLength = 2;</code>
   * @return Whether the fileLength field is set.
   */
  boolean hasFileLength();
  /**
   * <code>optional string fileLength = 2;</code>
   * @return The fileLength.
   */
  java.lang.String getFileLength();
  /**
   * <code>optional string fileLength = 2;</code>
   * @return The bytes for fileLength.
   */
  com.google.protobuf.ByteString
      getFileLengthBytes();

  /**
   * <code>optional uint32 width = 3;</code>
   * @return Whether the width field is set.
   */
  boolean hasWidth();
  /**
   * <code>optional uint32 width = 3;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <code>optional uint32 height = 4;</code>
   * @return Whether the height field is set.
   */
  boolean hasHeight();
  /**
   * <code>optional uint32 height = 4;</code>
   * @return The height.
   */
  int getHeight();

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
   * <code>optional fixed32 placeholderArgb = 6;</code>
   * @return Whether the placeholderArgb field is set.
   */
  boolean hasPlaceholderArgb();
  /**
   * <code>optional fixed32 placeholderArgb = 6;</code>
   * @return The placeholderArgb.
   */
  int getPlaceholderArgb();

  /**
   * <code>optional fixed32 textArgb = 7;</code>
   * @return Whether the textArgb field is set.
   */
  boolean hasTextArgb();
  /**
   * <code>optional fixed32 textArgb = 7;</code>
   * @return The textArgb.
   */
  int getTextArgb();

  /**
   * <code>optional fixed32 subtextArgb = 8;</code>
   * @return Whether the subtextArgb field is set.
   */
  boolean hasSubtextArgb();
  /**
   * <code>optional fixed32 subtextArgb = 8;</code>
   * @return The subtextArgb.
   */
  int getSubtextArgb();
}
