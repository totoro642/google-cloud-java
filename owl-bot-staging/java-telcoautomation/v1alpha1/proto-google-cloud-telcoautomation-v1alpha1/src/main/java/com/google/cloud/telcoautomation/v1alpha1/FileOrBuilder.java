// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

public interface FileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.File)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Path of the file in package.
   * e.g. `gdce/v1/cluster.yaml`
   * </pre>
   *
   * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Required. Path of the file in package.
   * e.g. `gdce/v1/cluster.yaml`
   * </pre>
   *
   * <code>string path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Optional. The contents of a file in string format.
   * </pre>
   *
   * <code>string content = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * Optional. The contents of a file in string format.
   * </pre>
   *
   * <code>string content = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * Optional. Signifies whether a file is marked for deletion.
   * </pre>
   *
   * <code>bool deleted = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The deleted.
   */
  boolean getDeleted();

  /**
   * <pre>
   * Optional. Indicates whether changes are allowed to a file. If the field is
   * not set, the file cannot be edited.
   * </pre>
   *
   * <code>bool editable = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The editable.
   */
  boolean getEditable();
}
