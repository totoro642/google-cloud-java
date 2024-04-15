// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1/finding_addon.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1;

public interface VulnerableParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1.VulnerableParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   * @return A list containing the parameterNames.
   */
  java.util.List<java.lang.String>
      getParameterNamesList();
  /**
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   * @return The count of parameterNames.
   */
  int getParameterNamesCount();
  /**
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   * @param index The index of the element to return.
   * @return The parameterNames at the given index.
   */
  java.lang.String getParameterNames(int index);
  /**
   * <pre>
   * The vulnerable parameter names.
   * </pre>
   *
   * <code>repeated string parameter_names = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the parameterNames at the given index.
   */
  com.google.protobuf.ByteString
      getParameterNamesBytes(int index);
}
