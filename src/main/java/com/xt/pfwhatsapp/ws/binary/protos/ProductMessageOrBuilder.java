// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface ProductMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.ProductMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.ProductSnapshot product = 1;</code>
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   * <code>optional .binary.ProductSnapshot product = 1;</code>
   * @return The product.
   */
  com.xt.pfwhatsapp.ws.binary.protos.ProductSnapshot getProduct();
  /**
   * <code>optional .binary.ProductSnapshot product = 1;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.ProductSnapshotOrBuilder getProductOrBuilder();

  /**
   * <code>optional string businessOwnerJid = 2;</code>
   * @return Whether the businessOwnerJid field is set.
   */
  boolean hasBusinessOwnerJid();
  /**
   * <code>optional string businessOwnerJid = 2;</code>
   * @return The businessOwnerJid.
   */
  java.lang.String getBusinessOwnerJid();
  /**
   * <code>optional string businessOwnerJid = 2;</code>
   * @return The bytes for businessOwnerJid.
   */
  com.google.protobuf.ByteString
      getBusinessOwnerJidBytes();

  /**
   * <code>optional .binary.CatalogSnapshot catalog = 4;</code>
   * @return Whether the catalog field is set.
   */
  boolean hasCatalog();
  /**
   * <code>optional .binary.CatalogSnapshot catalog = 4;</code>
   * @return The catalog.
   */
  com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshot getCatalog();
  /**
   * <code>optional .binary.CatalogSnapshot catalog = 4;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.CatalogSnapshotOrBuilder getCatalogOrBuilder();

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
