// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface CreateIndexRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreateIndexRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Location to create the Index in.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the Location to create the Index in.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The Index to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the index field is set.
   */
  boolean hasIndex();
  /**
   * <pre>
   * Required. The Index to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The index.
   */
  com.google.cloud.aiplatform.v1.Index getIndex();
  /**
   * <pre>
   * Required. The Index to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.IndexOrBuilder getIndexOrBuilder();
}
