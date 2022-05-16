// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface ADVKeyIndexListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.ADVKeyIndexList)
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
   * <code>optional uint32 currentIndex = 3;</code>
   * @return Whether the currentIndex field is set.
   */
  boolean hasCurrentIndex();
  /**
   * <code>optional uint32 currentIndex = 3;</code>
   * @return The currentIndex.
   */
  int getCurrentIndex();

  /**
   * <code>repeated uint32 validIndexes = 4 [packed = true];</code>
   * @return A list containing the validIndexes.
   */
  java.util.List<java.lang.Integer> getValidIndexesList();
  /**
   * <code>repeated uint32 validIndexes = 4 [packed = true];</code>
   * @return The count of validIndexes.
   */
  int getValidIndexesCount();
  /**
   * <code>repeated uint32 validIndexes = 4 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The validIndexes at the given index.
   */
  int getValidIndexes(int index);
}
