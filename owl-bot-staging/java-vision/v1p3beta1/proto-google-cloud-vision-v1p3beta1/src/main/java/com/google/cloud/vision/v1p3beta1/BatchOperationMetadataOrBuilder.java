// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p3beta1;

public interface BatchOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.BatchOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The current state of the batch operation.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BatchOperationMetadata.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * The current state of the batch operation.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BatchOperationMetadata.State state = 1;</code>
   * @return The state.
   */
  com.google.cloud.vision.v1p3beta1.BatchOperationMetadata.State getState();

  /**
   * <pre>
   * The time when the batch request was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   * @return Whether the submitTime field is set.
   */
  boolean hasSubmitTime();
  /**
   * <pre>
   * The time when the batch request was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   * @return The submitTime.
   */
  com.google.protobuf.Timestamp getSubmitTime();
  /**
   * <pre>
   * The time when the batch request was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();

  /**
   * <pre>
   * The time when the batch request is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * The time when the batch request is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * The time when the batch request is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
