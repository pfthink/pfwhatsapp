// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface ADVDeviceIdentityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.ADVDeviceIdentity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 rawId = 1;</code>
   * @return Whether the rawId field is set.
   */
  boolean hasRawId();
  /**
   * <code>optional uint32 rawId = 1;</code>
   * @return The rawId.
   */
  int getRawId();

  /**
   * <code>optional uint64 timestamp = 2;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <code>optional uint64 timestamp = 2;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>optional uint32 keyIndex = 3;</code>
   * @return Whether the keyIndex field is set.
   */
  boolean hasKeyIndex();
  /**
   * <code>optional uint32 keyIndex = 3;</code>
   * @return The keyIndex.
   */
  int getKeyIndex();
}
