// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface CompanionRegDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.CompanionRegData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes eRegid = 1;</code>
   * @return Whether the eRegid field is set.
   */
  boolean hasERegid();
  /**
   * <code>optional bytes eRegid = 1;</code>
   * @return The eRegid.
   */
  com.google.protobuf.ByteString getERegid();

  /**
   * <code>optional bytes eKeytype = 2;</code>
   * @return Whether the eKeytype field is set.
   */
  boolean hasEKeytype();
  /**
   * <code>optional bytes eKeytype = 2;</code>
   * @return The eKeytype.
   */
  com.google.protobuf.ByteString getEKeytype();

  /**
   * <code>optional bytes eIdent = 3;</code>
   * @return Whether the eIdent field is set.
   */
  boolean hasEIdent();
  /**
   * <code>optional bytes eIdent = 3;</code>
   * @return The eIdent.
   */
  com.google.protobuf.ByteString getEIdent();

  /**
   * <code>optional bytes eSkeyId = 4;</code>
   * @return Whether the eSkeyId field is set.
   */
  boolean hasESkeyId();
  /**
   * <code>optional bytes eSkeyId = 4;</code>
   * @return The eSkeyId.
   */
  com.google.protobuf.ByteString getESkeyId();

  /**
   * <code>optional bytes eSkeyVal = 5;</code>
   * @return Whether the eSkeyVal field is set.
   */
  boolean hasESkeyVal();
  /**
   * <code>optional bytes eSkeyVal = 5;</code>
   * @return The eSkeyVal.
   */
  com.google.protobuf.ByteString getESkeyVal();

  /**
   * <code>optional bytes eSkeySig = 6;</code>
   * @return Whether the eSkeySig field is set.
   */
  boolean hasESkeySig();
  /**
   * <code>optional bytes eSkeySig = 6;</code>
   * @return The eSkeySig.
   */
  com.google.protobuf.ByteString getESkeySig();

  /**
   * <code>optional bytes buildHash = 7;</code>
   * @return Whether the buildHash field is set.
   */
  boolean hasBuildHash();
  /**
   * <code>optional bytes buildHash = 7;</code>
   * @return The buildHash.
   */
  com.google.protobuf.ByteString getBuildHash();

  /**
   * <code>optional bytes companionProps = 8;</code>
   * @return Whether the companionProps field is set.
   */
  boolean hasCompanionProps();
  /**
   * <code>optional bytes companionProps = 8;</code>
   * @return The companionProps.
   */
  com.google.protobuf.ByteString getCompanionProps();
}