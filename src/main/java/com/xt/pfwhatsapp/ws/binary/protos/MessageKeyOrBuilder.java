// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface MessageKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.MessageKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string remoteJid = 1;</code>
   * @return Whether the remoteJid field is set.
   */
  boolean hasRemoteJid();
  /**
   * <code>optional string remoteJid = 1;</code>
   * @return The remoteJid.
   */
  java.lang.String getRemoteJid();
  /**
   * <code>optional string remoteJid = 1;</code>
   * @return The bytes for remoteJid.
   */
  com.google.protobuf.ByteString
      getRemoteJidBytes();

  /**
   * <code>optional bool fromMe = 2;</code>
   * @return Whether the fromMe field is set.
   */
  boolean hasFromMe();
  /**
   * <code>optional bool fromMe = 2;</code>
   * @return The fromMe.
   */
  boolean getFromMe();

  /**
   * <code>optional string id = 3;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional string id = 3;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>optional string id = 3;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>optional string participant = 4;</code>
   * @return Whether the participant field is set.
   */
  boolean hasParticipant();
  /**
   * <code>optional string participant = 4;</code>
   * @return The participant.
   */
  java.lang.String getParticipant();
  /**
   * <code>optional string participant = 4;</code>
   * @return The bytes for participant.
   */
  com.google.protobuf.ByteString
      getParticipantBytes();
}
