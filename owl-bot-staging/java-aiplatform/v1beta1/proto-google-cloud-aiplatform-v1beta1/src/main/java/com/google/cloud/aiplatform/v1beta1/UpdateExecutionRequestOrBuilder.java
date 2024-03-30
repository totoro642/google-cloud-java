// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface UpdateExecutionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateExecutionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Execution containing updates.
   * The Execution's
   * [Execution.name][google.cloud.aiplatform.v1beta1.Execution.name] field is
   * used to identify the Execution to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the execution field is set.
   */
  boolean hasExecution();
  /**
   * <pre>
   * Required. The Execution containing updates.
   * The Execution's
   * [Execution.name][google.cloud.aiplatform.v1beta1.Execution.name] field is
   * used to identify the Execution to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The execution.
   */
  com.google.cloud.aiplatform.v1beta1.Execution getExecution();
  /**
   * <pre>
   * Required. The Execution containing updates.
   * The Execution's
   * [Execution.name][google.cloud.aiplatform.v1beta1.Execution.name] field is
   * used to identify the Execution to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExecutionOrBuilder getExecutionOrBuilder();

  /**
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * If set to true, and the
   * [Execution][google.cloud.aiplatform.v1beta1.Execution] is not found, a new
   * [Execution][google.cloud.aiplatform.v1beta1.Execution] is created.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
