// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface ExtendedTextMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.ExtendedTextMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>optional string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>optional string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>optional string matchedText = 2;</code>
   * @return Whether the matchedText field is set.
   */
  boolean hasMatchedText();
  /**
   * <code>optional string matchedText = 2;</code>
   * @return The matchedText.
   */
  java.lang.String getMatchedText();
  /**
   * <code>optional string matchedText = 2;</code>
   * @return The bytes for matchedText.
   */
  com.google.protobuf.ByteString
      getMatchedTextBytes();

  /**
   * <code>optional string canonicalUrl = 4;</code>
   * @return Whether the canonicalUrl field is set.
   */
  boolean hasCanonicalUrl();
  /**
   * <code>optional string canonicalUrl = 4;</code>
   * @return The canonicalUrl.
   */
  java.lang.String getCanonicalUrl();
  /**
   * <code>optional string canonicalUrl = 4;</code>
   * @return The bytes for canonicalUrl.
   */
  com.google.protobuf.ByteString
      getCanonicalUrlBytes();

  /**
   * <code>optional string description = 5;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string title = 6;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 6;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 6;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

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
   * <code>optional fixed32 backgroundArgb = 8;</code>
   * @return Whether the backgroundArgb field is set.
   */
  boolean hasBackgroundArgb();
  /**
   * <code>optional fixed32 backgroundArgb = 8;</code>
   * @return The backgroundArgb.
   */
  int getBackgroundArgb();

  /**
   * <code>optional .binary.ExtendedTextMessage.ExtendedTextMessageFontType font = 9;</code>
   * @return Whether the font field is set.
   */
  boolean hasFont();
  /**
   * <code>optional .binary.ExtendedTextMessage.ExtendedTextMessageFontType font = 9;</code>
   * @return The font.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ExtendedTextMessage.ExtendedTextMessageFontType getFont();

  /**
   * <code>optional .binary.ExtendedTextMessage.ExtendedTextMessagePreviewType previewType = 10;</code>
   * @return Whether the previewType field is set.
   */
  boolean hasPreviewType();
  /**
   * <code>optional .binary.ExtendedTextMessage.ExtendedTextMessagePreviewType previewType = 10;</code>
   * @return The previewType.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ExtendedTextMessage.ExtendedTextMessagePreviewType getPreviewType();

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

  /**
   * <code>optional bool doNotPlayInline = 18;</code>
   * @return Whether the doNotPlayInline field is set.
   */
  boolean hasDoNotPlayInline();
  /**
   * <code>optional bool doNotPlayInline = 18;</code>
   * @return The doNotPlayInline.
   */
  boolean getDoNotPlayInline();

  /**
   * <code>optional string thumbnailDirectPath = 19;</code>
   * @return Whether the thumbnailDirectPath field is set.
   */
  boolean hasThumbnailDirectPath();
  /**
   * <code>optional string thumbnailDirectPath = 19;</code>
   * @return The thumbnailDirectPath.
   */
  java.lang.String getThumbnailDirectPath();
  /**
   * <code>optional string thumbnailDirectPath = 19;</code>
   * @return The bytes for thumbnailDirectPath.
   */
  com.google.protobuf.ByteString
      getThumbnailDirectPathBytes();

  /**
   * <code>optional bytes thumbnailSha256 = 20;</code>
   * @return Whether the thumbnailSha256 field is set.
   */
  boolean hasThumbnailSha256();
  /**
   * <code>optional bytes thumbnailSha256 = 20;</code>
   * @return The thumbnailSha256.
   */
  com.google.protobuf.ByteString getThumbnailSha256();

  /**
   * <code>optional bytes thumbnailEncSha256 = 21;</code>
   * @return Whether the thumbnailEncSha256 field is set.
   */
  boolean hasThumbnailEncSha256();
  /**
   * <code>optional bytes thumbnailEncSha256 = 21;</code>
   * @return The thumbnailEncSha256.
   */
  com.google.protobuf.ByteString getThumbnailEncSha256();

  /**
   * <code>optional bytes mediaKey = 22;</code>
   * @return Whether the mediaKey field is set.
   */
  boolean hasMediaKey();
  /**
   * <code>optional bytes mediaKey = 22;</code>
   * @return The mediaKey.
   */
  com.google.protobuf.ByteString getMediaKey();

  /**
   * <code>optional int64 mediaKeyTimestamp = 23;</code>
   * @return Whether the mediaKeyTimestamp field is set.
   */
  boolean hasMediaKeyTimestamp();
  /**
   * <code>optional int64 mediaKeyTimestamp = 23;</code>
   * @return The mediaKeyTimestamp.
   */
  long getMediaKeyTimestamp();

  /**
   * <code>optional uint32 thumbnailHeight = 24;</code>
   * @return Whether the thumbnailHeight field is set.
   */
  boolean hasThumbnailHeight();
  /**
   * <code>optional uint32 thumbnailHeight = 24;</code>
   * @return The thumbnailHeight.
   */
  int getThumbnailHeight();

  /**
   * <code>optional uint32 thumbnailWidth = 25;</code>
   * @return Whether the thumbnailWidth field is set.
   */
  boolean hasThumbnailWidth();
  /**
   * <code>optional uint32 thumbnailWidth = 25;</code>
   * @return The thumbnailWidth.
   */
  int getThumbnailWidth();
}