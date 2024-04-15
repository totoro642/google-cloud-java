// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/finding_addon.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1;

public interface XssOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1.Xss)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   * @return A list containing the stackTraces.
   */
  java.util.List<java.lang.String>
      getStackTracesList();
  /**
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   * @return The count of stackTraces.
   */
  int getStackTracesCount();
  /**
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   * @param index The index of the element to return.
   * @return The stackTraces at the given index.
   */
  java.lang.String getStackTraces(int index);
  /**
   * <pre>
   * Stack traces leading to the point where the XSS occurred.
   * </pre>
   *
   * <code>repeated string stack_traces = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the stackTraces at the given index.
   */
  com.google.protobuf.ByteString
      getStackTracesBytes(int index);

  /**
   * <pre>
   * An error message generated by a javascript breakage.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   * <pre>
   * An error message generated by a javascript breakage.
   * </pre>
   *
   * <code>string error_message = 2;</code>
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <pre>
   * The attack vector of the payload triggering this XSS.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.Xss.AttackVector attack_vector = 3;</code>
   * @return The enum numeric value on the wire for attackVector.
   */
  int getAttackVectorValue();
  /**
   * <pre>
   * The attack vector of the payload triggering this XSS.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.Xss.AttackVector attack_vector = 3;</code>
   * @return The attackVector.
   */
  com.google.cloud.websecurityscanner.v1.Xss.AttackVector getAttackVector();

  /**
   * <pre>
   * The reproduction url for the seeding POST request of a Stored XSS.
   * </pre>
   *
   * <code>string stored_xss_seeding_url = 4;</code>
   * @return The storedXssSeedingUrl.
   */
  java.lang.String getStoredXssSeedingUrl();
  /**
   * <pre>
   * The reproduction url for the seeding POST request of a Stored XSS.
   * </pre>
   *
   * <code>string stored_xss_seeding_url = 4;</code>
   * @return The bytes for storedXssSeedingUrl.
   */
  com.google.protobuf.ByteString
      getStoredXssSeedingUrlBytes();
}
