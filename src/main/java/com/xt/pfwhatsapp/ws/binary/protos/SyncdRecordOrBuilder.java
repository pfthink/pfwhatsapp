// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface SyncdRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.SyncdRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.SyncdIndex index = 1;</code>
   * @return Whether the index field is set.
   */
  boolean hasIndex();
  /**
   * <code>optional .binary.SyncdIndex index = 1;</code>
   * @return The index.
   */
  com.xt.pfwhatsapp.ws.binary.protos.SyncdIndex getIndex();
  /**
   * <code>optional .binary.SyncdIndex index = 1;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.SyncdIndexOrBuilder getIndexOrBuilder();

  /**
   * <code>optional .binary.SyncdValue value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>optional .binary.SyncdValue value = 2;</code>
   * @return The value.
   */
  com.xt.pfwhatsapp.ws.binary.protos.SyncdValue getValue();
  /**
   * <code>optional .binary.SyncdValue value = 2;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.SyncdValueOrBuilder getValueOrBuilder();

  /**
   * <code>optional .binary.KeyId keyId = 3;</code>
   * @return Whether the keyId field is set.
   */
  boolean hasKeyId();
  /**
   * <code>optional .binary.KeyId keyId = 3;</code>
   * @return The keyId.
   */
  com.xt.pfwhatsapp.ws.binary.protos.KeyId getKeyId();
  /**
   * <code>optional .binary.KeyId keyId = 3;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.KeyIdOrBuilder getKeyIdOrBuilder();
}
