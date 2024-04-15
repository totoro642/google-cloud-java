// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/workflows/executions/v1/executions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.workflows.executions.v1;

public interface CreateExecutionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workflows.executions.v1.CreateExecutionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the workflow for which an execution should be created.
   * Format: projects/{project}/locations/{location}/workflows/{workflow}
   * The latest revision of the workflow will be used.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Name of the workflow for which an execution should be created.
   * Format: projects/{project}/locations/{location}/workflows/{workflow}
   * The latest revision of the workflow will be used.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Execution to be created.
   * </pre>
   *
   * <code>.google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the execution field is set.
   */
  boolean hasExecution();
  /**
   * <pre>
   * Required. Execution to be created.
   * </pre>
   *
   * <code>.google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The execution.
   */
  com.google.cloud.workflows.executions.v1.Execution getExecution();
  /**
   * <pre>
   * Required. Execution to be created.
   * </pre>
   *
   * <code>.google.cloud.workflows.executions.v1.Execution execution = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.workflows.executions.v1.ExecutionOrBuilder getExecutionOrBuilder();
}
