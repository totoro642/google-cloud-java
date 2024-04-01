// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ListTensorboardRunsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListTensorboardRunsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.TensorboardRun> 
      getTensorboardRunsList();
  /**
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardRun getTensorboardRuns(int index);
  /**
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  int getTensorboardRunsCount();
  /**
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder> 
      getTensorboardRunsOrBuilderList();
  /**
   * <pre>
   * The TensorboardRuns mathching the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder getTensorboardRunsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as
   * [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1.ListTensorboardRunsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as
   * [ListTensorboardRunsRequest.page_token][google.cloud.aiplatform.v1.ListTensorboardRunsRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
