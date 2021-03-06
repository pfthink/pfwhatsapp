// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface LocationMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.LocationMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional double degreesLatitude = 1;</code>
   * @return Whether the degreesLatitude field is set.
   */
  boolean hasDegreesLatitude();
  /**
   * <code>optional double degreesLatitude = 1;</code>
   * @return The degreesLatitude.
   */
  double getDegreesLatitude();

  /**
   * <code>optional double degreesLongitude = 2;</code>
   * @return Whether the degreesLongitude field is set.
   */
  boolean hasDegreesLongitude();
  /**
   * <code>optional double degreesLongitude = 2;</code>
   * @return The degreesLongitude.
   */
  double getDegreesLongitude();

  /**
   * <code>optional string name = 3;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string address = 4;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>optional string address = 4;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>optional string address = 4;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>optional string url = 5;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 5;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 5;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional bool isLive = 6;</code>
   * @return Whether the isLive field is set.
   */
  boolean hasIsLive();
  /**
   * <code>optional bool isLive = 6;</code>
   * @return The isLive.
   */
  boolean getIsLive();

  /**
   * <code>optional uint32 accuracyInMeters = 7;</code>
   * @return Whether the accuracyInMeters field is set.
   */
  boolean hasAccuracyInMeters();
  /**
   * <code>optional uint32 accuracyInMeters = 7;</code>
   * @return The accuracyInMeters.
   */
  int getAccuracyInMeters();

  /**
   * <code>optional float speedInMps = 8;</code>
   * @return Whether the speedInMps field is set.
   */
  boolean hasSpeedInMps();
  /**
   * <code>optional float speedInMps = 8;</code>
   * @return The speedInMps.
   */
  float getSpeedInMps();

  /**
   * <code>optional uint32 degreesClockwiseFromMagneticNorth = 9;</code>
   * @return Whether the degreesClockwiseFromMagneticNorth field is set.
   */
  boolean hasDegreesClockwiseFromMagneticNorth();
  /**
   * <code>optional uint32 degreesClockwiseFromMagneticNorth = 9;</code>
   * @return The degreesClockwiseFromMagneticNorth.
   */
  int getDegreesClockwiseFromMagneticNorth();

  /**
   * <code>optional string comment = 11;</code>
   * @return Whether the comment field is set.
   */
  boolean hasComment();
  /**
   * <code>optional string comment = 11;</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <code>optional string comment = 11;</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <code>optional bytes jpegThumbnail = 16;</code>
   * @return Whether the jpegThumbnail field is set.
   */
  boolean hasJpegThumbnail();
  /**
   * <code>optional bytes jpegThumbnail = 16;</code>
   * @return The jpegThumbnail.
   */
  com.google.protobuf.ByteString getJpegThumbnail();

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
