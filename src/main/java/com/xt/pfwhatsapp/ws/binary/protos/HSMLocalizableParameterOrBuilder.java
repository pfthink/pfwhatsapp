// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface HSMLocalizableParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.HSMLocalizableParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string default = 1;</code>
   * @return Whether the default field is set.
   */
  boolean hasDefault();
  /**
   * <code>optional string default = 1;</code>
   * @return The default.
   */
  java.lang.String getDefault();
  /**
   * <code>optional string default = 1;</code>
   * @return The bytes for default.
   */
  com.google.protobuf.ByteString
      getDefaultBytes();

  /**
   * <code>.binary.HSMCurrency currency = 2;</code>
   * @return Whether the currency field is set.
   */
  boolean hasCurrency();
  /**
   * <code>.binary.HSMCurrency currency = 2;</code>
   * @return The currency.
   */
  com.xt.pfwhatsapp.ws.binary.protos.HSMCurrency getCurrency();
  /**
   * <code>.binary.HSMCurrency currency = 2;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.HSMCurrencyOrBuilder getCurrencyOrBuilder();

  /**
   * <code>.binary.HSMDateTime dateTime = 3;</code>
   * @return Whether the dateTime field is set.
   */
  boolean hasDateTime();
  /**
   * <code>.binary.HSMDateTime dateTime = 3;</code>
   * @return The dateTime.
   */
  com.xt.pfwhatsapp.ws.binary.protos.HSMDateTime getDateTime();
  /**
   * <code>.binary.HSMDateTime dateTime = 3;</code>
   */
  com.xt.pfwhatsapp.ws.binary.protos.HSMDateTimeOrBuilder getDateTimeOrBuilder();

  public com.xt.pfwhatsapp.ws.binary.protos.HSMLocalizableParameter.ParamOneofCase getParamOneofCase();
}
