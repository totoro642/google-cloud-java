// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/workflows/executions/v1beta/executions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.workflows.executions.v1beta;

public interface ListExecutionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workflows.executions.v1beta.ListExecutionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The executions which match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.workflows.executions.v1beta.Execution executions = 1;</code>
   */
  java.util.List<com.google.cloud.workflows.executions.v1beta.Execution> 
      getExecutionsList();
  /**
   * <pre>
   * The executions which match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.workflows.executions.v1beta.Execution executions = 1;</code>
   */
  com.google.cloud.workflows.executions.v1beta.Execution getExecutions(int index);
  /**
   * <pre>
   * The executions which match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.workflows.executions.v1beta.Execution executions = 1;</code>
   */
  int getExecutionsCount();
  /**
   * <pre>
   * The executions which match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.workflows.executions.v1beta.Execution executions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.workflows.executions.v1beta.ExecutionOrBuilder> 
      getExecutionsOrBuilderList();
  /**
   * <pre>
   * The executions which match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.workflows.executions.v1beta.Execution executions = 1;</code>
   */
  com.google.cloud.workflows.executions.v1beta.ExecutionOrBuilder getExecutionsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
