// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface MarkChatAsReadActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.MarkChatAsReadAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool read = 1;</code>
   * @return Whether the read field is set.
   */
  boolean hasRead();
  /**
   * <code>optional bool read = 1;</code>
   * @return The read.
   */
  boolean getRead();

  /**
   * <code>optional .binary.SyncActionMessageRange messageRange = 2;</code>
   * @return Whether the messageRange field is set.
   */
  boolean hasMessageRange();
  /**
   * <code>optional .binary.SyncActionMessageRange messageRange = 2;</code>
   * @return The messageRange.
   */
  com.xt.pfwhatsapp.ws.binary.protos.SyncActionMessageRange getMessageRange();
  /**
   * <code>optional .binary.SyncActionMessageRange messageRange = 2;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.SyncActionMessageRangeOrBuilder getMessageRangeOrBuilder();
}
