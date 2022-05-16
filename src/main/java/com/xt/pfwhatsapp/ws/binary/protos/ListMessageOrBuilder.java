// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface ListMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.ListMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string title = 1;</code>
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   * <code>optional string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional string description = 2;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional string buttonText = 3;</code>
   * @return Whether the buttonText field is set.
   */
  boolean hasButtonText();
  /**
   * <code>optional string buttonText = 3;</code>
   * @return The buttonText.
   */
  java.lang.String getButtonText();
  /**
   * <code>optional string buttonText = 3;</code>
   * @return The bytes for buttonText.
   */
  com.google.protobuf.ByteString
      getButtonTextBytes();

  /**
   * <code>optional .binary.ListMessage.ListMessageListType listType = 4;</code>
   * @return Whether the listType field is set.
   */
  boolean hasListType();
  /**
   * <code>optional .binary.ListMessage.ListMessageListType listType = 4;</code>
   * @return The listType.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ListMessage.ListMessageListType getListType();

  /**
   * <code>repeated .binary.Section sections = 5;</code>
   */
  java.util.List<com.xt.pfwhatsapp.ws.binary.protos.Section>
      getSectionsList();
  /**
   * <code>repeated .binary.Section sections = 5;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.Section getSections(int index);
  /**
   * <code>repeated .binary.Section sections = 5;</code>
   */
  int getSectionsCount();
  /**
   * <code>repeated .binary.Section sections = 5;</code>
   */
  java.util.List<? extends com.xt.pfwhatsapp.ws.binary.protos.SectionOrBuilder>
      getSectionsOrBuilderList();
  /**
   * <code>repeated .binary.Section sections = 5;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.SectionOrBuilder getSectionsOrBuilder(
      int index);

  /**
   * <code>optional .binary.ProductListInfo productListInfo = 6;</code>
   * @return Whether the productListInfo field is set.
   */
  boolean hasProductListInfo();
  /**
   * <code>optional .binary.ProductListInfo productListInfo = 6;</code>
   * @return The productListInfo.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ProductListInfo getProductListInfo();
  /**
   * <code>optional .binary.ProductListInfo productListInfo = 6;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.ProductListInfoOrBuilder getProductListInfoOrBuilder();

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
}
