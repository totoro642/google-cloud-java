// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/user_action_reference.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface UserActionReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UserActionReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * For API calls that return a long running operation.
   * Resource name of the long running operation.
   * Format:
   * `projects/{project}/locations/{location}/operations/{operation}`
   * </pre>
   *
   * <code>string operation = 1;</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * For API calls that return a long running operation.
   * Resource name of the long running operation.
   * Format:
   * `projects/{project}/locations/{location}/operations/{operation}`
   * </pre>
   *
   * <code>string operation = 1;</code>
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   * <pre>
   * For API calls that return a long running operation.
   * Resource name of the long running operation.
   * Format:
   * `projects/{project}/locations/{location}/operations/{operation}`
   * </pre>
   *
   * <code>string operation = 1;</code>
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString
      getOperationBytes();

  /**
   * <pre>
   * For API calls that start a LabelingJob.
   * Resource name of the LabelingJob.
   * Format:
   * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * </pre>
   *
   * <code>string data_labeling_job = 2;</code>
   * @return Whether the dataLabelingJob field is set.
   */
  boolean hasDataLabelingJob();
  /**
   * <pre>
   * For API calls that start a LabelingJob.
   * Resource name of the LabelingJob.
   * Format:
   * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * </pre>
   *
   * <code>string data_labeling_job = 2;</code>
   * @return The dataLabelingJob.
   */
  java.lang.String getDataLabelingJob();
  /**
   * <pre>
   * For API calls that start a LabelingJob.
   * Resource name of the LabelingJob.
   * Format:
   * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * </pre>
   *
   * <code>string data_labeling_job = 2;</code>
   * @return The bytes for dataLabelingJob.
   */
  com.google.protobuf.ByteString
      getDataLabelingJobBytes();

  /**
   * <pre>
   * The method name of the API RPC call. For example,
   * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
   * </pre>
   *
   * <code>string method = 3;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <pre>
   * The method name of the API RPC call. For example,
   * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
   * </pre>
   *
   * <code>string method = 3;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  com.google.cloud.aiplatform.v1beta1.UserActionReference.ReferenceCase getReferenceCase();
}
