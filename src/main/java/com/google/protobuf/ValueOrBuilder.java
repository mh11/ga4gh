// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/google/protobuf/struct.proto

package com.google.protobuf;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   *
   * <pre>
   * Represents a null value.
   * </pre>
   */
  int getNullValueValue();
  /**
   * <code>optional .google.protobuf.NullValue null_value = 1;</code>
   *
   * <pre>
   * Represents a null value.
   * </pre>
   */
  com.google.protobuf.NullValue getNullValue();

  /**
   * <code>optional double number_value = 2;</code>
   *
   * <pre>
   * Represents a double value.
   * </pre>
   */
  double getNumberValue();

  /**
   * <code>optional string string_value = 3;</code>
   *
   * <pre>
   * Represents a string value.
   * </pre>
   */
  java.lang.String getStringValue();
  /**
   * <code>optional string string_value = 3;</code>
   *
   * <pre>
   * Represents a string value.
   * </pre>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>optional bool bool_value = 4;</code>
   *
   * <pre>
   * Represents a boolean value.
   * </pre>
   */
  boolean getBoolValue();

  /**
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   *
   * <pre>
   * Represents a structured value.
   * </pre>
   */
  com.google.protobuf.Struct getStructValue();
  /**
   * <code>optional .google.protobuf.Struct struct_value = 5;</code>
   *
   * <pre>
   * Represents a structured value.
   * </pre>
   */
  com.google.protobuf.StructOrBuilder getStructValueOrBuilder();

  /**
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   *
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   */
  com.google.protobuf.ListValue getListValue();
  /**
   * <code>optional .google.protobuf.ListValue list_value = 6;</code>
   *
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   */
  com.google.protobuf.ListValueOrBuilder getListValueOrBuilder();

  public com.google.protobuf.Value.KindCase getKindCase();
}