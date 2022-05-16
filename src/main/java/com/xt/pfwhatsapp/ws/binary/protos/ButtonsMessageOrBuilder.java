// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface ButtonsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.ButtonsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string contentText = 6;</code>
   * @return Whether the contentText field is set.
   */
  boolean hasContentText();
  /**
   * <code>optional string contentText = 6;</code>
   * @return The contentText.
   */
  java.lang.String getContentText();
  /**
   * <code>optional string contentText = 6;</code>
   * @return The bytes for contentText.
   */
  com.google.protobuf.ByteString
      getContentTextBytes();

  /**
   * <code>optional string footerText = 7;</code>
   * @return Whether the footerText field is set.
   */
  boolean hasFooterText();
  /**
   * <code>optional string footerText = 7;</code>
   * @return The footerText.
   */
  java.lang.String getFooterText();
  /**
   * <code>optional string footerText = 7;</code>
   * @return The bytes for footerText.
   */
  com.google.protobuf.ByteString
      getFooterTextBytes();

  /**
   * <code>optional .binary.ContextInfo contextInfo = 8;</code>
   * @return Whether the contextInfo field is set.
   */
  boolean hasContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 8;</code>
   * @return The contextInfo.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ContextInfo getContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 8;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.ContextInfoOrBuilder getContextInfoOrBuilder();

  /**
   * <code>repeated .binary.Button buttons = 9;</code>
   */
  java.util.List<com.xt.pfwhatsapp.ws.binary.protos.Button>
      getButtonsList();
  /**
   * <code>repeated .binary.Button buttons = 9;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.Button getButtons(int index);
  /**
   * <code>repeated .binary.Button buttons = 9;</code>
   */
  int getButtonsCount();
  /**
   * <code>repeated .binary.Button buttons = 9;</code>
   */
  java.util.List<? extends com.xt.pfwhatsapp.ws.binary.protos.ButtonOrBuilder>
      getButtonsOrBuilderList();
  /**
   * <code>repeated .binary.Button buttons = 9;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.ButtonOrBuilder getButtonsOrBuilder(
      int index);

  /**
   * <code>optional .binary.ButtonsMessage.ButtonsMessageHeaderType headerType = 10;</code>
   * @return Whether the headerType field is set.
   */
  boolean hasHeaderType();
  /**
   * <code>optional .binary.ButtonsMessage.ButtonsMessageHeaderType headerType = 10;</code>
   * @return The headerType.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ButtonsMessage.ButtonsMessageHeaderType getHeaderType();

  /**
   * <code>string text = 1;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>.binary.DocumentMessage documentMessage = 2;</code>
   * @return Whether the documentMessage field is set.
   */
  boolean hasDocumentMessage();
  /**
   * <code>.binary.DocumentMessage documentMessage = 2;</code>
   * @return The documentMessage.
   */
  com.xt.pfwhatsapp.ws.binary.protos.DocumentMessage getDocumentMessage();
  /**
   * <code>.binary.DocumentMessage documentMessage = 2;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.DocumentMessageOrBuilder getDocumentMessageOrBuilder();

  /**
   * <code>.binary.ImageMessage imageMessage = 3;</code>
   * @return Whether the imageMessage field is set.
   */
  boolean hasImageMessage();
  /**
   * <code>.binary.ImageMessage imageMessage = 3;</code>
   * @return The imageMessage.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ImageMessage getImageMessage();
  /**
   * <code>.binary.ImageMessage imageMessage = 3;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.ImageMessageOrBuilder getImageMessageOrBuilder();

  /**
   * <code>.binary.VideoMessage videoMessage = 4;</code>
   * @return Whether the videoMessage field is set.
   */
  boolean hasVideoMessage();
  /**
   * <code>.binary.VideoMessage videoMessage = 4;</code>
   * @return The videoMessage.
   */
  com.xt.pfwhatsapp.ws.binary.protos.VideoMessage getVideoMessage();
  /**
   * <code>.binary.VideoMessage videoMessage = 4;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.VideoMessageOrBuilder getVideoMessageOrBuilder();

  /**
   * <code>.binary.LocationMessage locationMessage = 5;</code>
   * @return Whether the locationMessage field is set.
   */
  boolean hasLocationMessage();
  /**
   * <code>.binary.LocationMessage locationMessage = 5;</code>
   * @return The locationMessage.
   */
  com.xt.pfwhatsapp.ws.binary.protos.LocationMessage getLocationMessage();
  /**
   * <code>.binary.LocationMessage locationMessage = 5;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.LocationMessageOrBuilder getLocationMessageOrBuilder();

  public com.xt.pfwhatsapp.ws.binary.protos.ButtonsMessage.HeaderCase getHeaderCase();
}