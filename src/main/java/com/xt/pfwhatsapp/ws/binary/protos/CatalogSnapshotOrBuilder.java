// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface CatalogSnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.CatalogSnapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.ImageMessage catalogImage = 1;</code>
   * @return Whether the catalogImage field is set.
   */
  boolean hasCatalogImage();
  /**
   * <code>optional .binary.ImageMessage catalogImage = 1;</code>
   * @return The catalogImage.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ImageMessage getCatalogImage();
  /**
   * <code>optional .binary.ImageMessage catalogImage = 1;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.ImageMessageOrBuilder getCatalogImageOrBuilder();

  /**
   * <code>optional string title = 2;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string description = 3;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
