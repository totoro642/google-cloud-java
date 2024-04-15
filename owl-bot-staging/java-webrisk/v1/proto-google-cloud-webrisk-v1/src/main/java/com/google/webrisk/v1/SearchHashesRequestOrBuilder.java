// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1/webrisk.proto

// Protobuf Java Version: 3.25.3
package com.google.webrisk.v1;

public interface SearchHashesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.SearchHashesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A hash prefix, consisting of the most significant 4-32 bytes of a SHA256
   * hash. For JSON requests, this field is base64-encoded.
   * Note that if this parameter is provided by a URI, it must be encoded using
   * the web safe base64 variant (RFC 4648).
   * </pre>
   *
   * <code>bytes hash_prefix = 1;</code>
   * @return The hashPrefix.
   */
  com.google.protobuf.ByteString getHashPrefix();

  /**
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the threatTypes.
   */
  java.util.List<com.google.webrisk.v1.ThreatType> getThreatTypesList();
  /**
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of threatTypes.
   */
  int getThreatTypesCount();
  /**
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The threatTypes at the given index.
   */
  com.google.webrisk.v1.ThreatType getThreatTypes(int index);
  /**
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the enum numeric values on the wire for threatTypes.
   */
  java.util.List<java.lang.Integer>
  getThreatTypesValueList();
  /**
   * <pre>
   * Required. The ThreatLists to search in. Multiple ThreatLists may be
   * specified.
   * </pre>
   *
   * <code>repeated .google.cloud.webrisk.v1.ThreatType threat_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of threatTypes at the given index.
   */
  int getThreatTypesValue(int index);
}
