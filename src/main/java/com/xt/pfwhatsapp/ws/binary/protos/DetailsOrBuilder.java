// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package com.xt.pfwhatsapp.ws.binary.protos;

public interface DetailsOrBuilder extends
        // @@protoc_insertion_point(interface_extends:binary.Details)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 serial = 1;</code>
     *
     * @return Whether the serial field is set.
     */
    boolean hasSerial();

    /**
     * <code>optional uint32 serial = 1;</code>
     *
     * @return The serial.
     */
    int getSerial();

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @return Whether the issuer field is set.
     */
    boolean hasIssuer();

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @return The issuer.
     */
    java.lang.String getIssuer();

    /**
     * <code>optional string issuer = 2;</code>
     *
     * @return The bytes for issuer.
     */
    com.google.protobuf.ByteString
    getIssuerBytes();

    /**
     * <code>optional uint64 expires = 3;</code>
     *
     * @return Whether the expires field is set.
     */
    boolean hasExpires();

    /**
     * <code>optional uint64 expires = 3;</code>
     *
     * @return The expires.
     */
    long getExpires();

    /**
     * <code>optional string subject = 4;</code>
     *
     * @return Whether the subject field is set.
     */
    boolean hasSubject();

    /**
     * <code>optional string subject = 4;</code>
     *
     * @return The subject.
     */
    java.lang.String getSubject();

    /**
     * <code>optional string subject = 4;</code>
     *
     * @return The bytes for subject.
     */
    com.google.protobuf.ByteString
    getSubjectBytes();

    /**
     * <code>optional bytes key = 5;</code>
     *
     * @return Whether the key field is set.
     */
    boolean hasKey();

    /**
     * <code>optional bytes key = 5;</code>
     *
     * @return The key.
     */
    com.google.protobuf.ByteString getKey();
}
