// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface LabelEditActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.LabelEditAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int32 color = 2;</code>
   * @return Whether the color field is set.
   */
  boolean hasColor();
  /**
   * <code>optional int32 color = 2;</code>
   * @return The color.
   */
  int getColor();

  /**
   * <code>optional int32 predefinedId = 3;</code>
   * @return Whether the predefinedId field is set.
   */
  boolean hasPredefinedId();
  /**
   * <code>optional int32 predefinedId = 3;</code>
   * @return The predefinedId.
   */
  int getPredefinedId();

  /**
   * <code>optional bool deleted = 4;</code>
   * @return Whether the deleted field is set.
   */
  boolean hasDeleted();
  /**
   * <code>optional bool deleted = 4;</code>
   * @return The deleted.
   */
  boolean getDeleted();
}