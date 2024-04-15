// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/finding_addon.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1;

public interface XxeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1.Xxe)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The XML string that triggered the XXE vulnerability. Non-payload values
   * might be redacted.
   * </pre>
   *
   * <code>string payload_value = 1;</code>
   * @return The payloadValue.
   */
  java.lang.String getPayloadValue();
  /**
   * <pre>
   * The XML string that triggered the XXE vulnerability. Non-payload values
   * might be redacted.
   * </pre>
   *
   * <code>string payload_value = 1;</code>
   * @return The bytes for payloadValue.
   */
  com.google.protobuf.ByteString
      getPayloadValueBytes();

  /**
   * <pre>
   * Location within the request where the payload was placed.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
   * @return The enum numeric value on the wire for payloadLocation.
   */
  int getPayloadLocationValue();
  /**
   * <pre>
   * Location within the request where the payload was placed.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.Xxe.Location payload_location = 2;</code>
   * @return The payloadLocation.
   */
  com.google.cloud.websecurityscanner.v1.Xxe.Location getPayloadLocation();
}
