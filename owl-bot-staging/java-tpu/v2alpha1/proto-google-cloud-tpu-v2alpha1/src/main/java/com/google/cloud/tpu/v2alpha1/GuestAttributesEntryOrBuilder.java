// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2alpha1;

public interface GuestAttributesEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.GuestAttributesEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Namespace for the guest attribute entry.
   * </pre>
   *
   * <code>string namespace = 1;</code>
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   * <pre>
   * Namespace for the guest attribute entry.
   * </pre>
   *
   * <code>string namespace = 1;</code>
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString
      getNamespaceBytes();

  /**
   * <pre>
   * Key for the guest attribute entry.
   * </pre>
   *
   * <code>string key = 2;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Key for the guest attribute entry.
   * </pre>
   *
   * <code>string key = 2;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Value for the guest attribute entry.
   * </pre>
   *
   * <code>string value = 3;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Value for the guest attribute entry.
   * </pre>
   *
   * <code>string value = 3;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}
