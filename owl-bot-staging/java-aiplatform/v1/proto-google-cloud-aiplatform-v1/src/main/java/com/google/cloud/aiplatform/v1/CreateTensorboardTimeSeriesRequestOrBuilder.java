// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface CreateTensorboardTimeSeriesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreateTensorboardTimeSeriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the TensorboardRun to create the
   * TensorboardTimeSeries in.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the TensorboardRun to create the
   * TensorboardTimeSeries in.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The user specified unique ID to use for the
   * TensorboardTimeSeries, which becomes the final component of the
   * TensorboardTimeSeries's resource name. This value should match
   * "[a-z0-9][a-z0-9-]{0, 127}"
   * </pre>
   *
   * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The tensorboardTimeSeriesId.
   */
  java.lang.String getTensorboardTimeSeriesId();
  /**
   * <pre>
   * Optional. The user specified unique ID to use for the
   * TensorboardTimeSeries, which becomes the final component of the
   * TensorboardTimeSeries's resource name. This value should match
   * "[a-z0-9][a-z0-9-]{0, 127}"
   * </pre>
   *
   * <code>string tensorboard_time_series_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for tensorboardTimeSeriesId.
   */
  com.google.protobuf.ByteString
      getTensorboardTimeSeriesIdBytes();

  /**
   * <pre>
   * Required. The TensorboardTimeSeries to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tensorboardTimeSeries field is set.
   */
  boolean hasTensorboardTimeSeries();
  /**
   * <pre>
   * Required. The TensorboardTimeSeries to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tensorboardTimeSeries.
   */
  com.google.cloud.aiplatform.v1.TensorboardTimeSeries getTensorboardTimeSeries();
  /**
   * <pre>
   * Required. The TensorboardTimeSeries to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTimeSeries tensorboard_time_series = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardTimeSeriesOrBuilder getTensorboardTimeSeriesOrBuilder();
}
