// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ToolParameterKeyMatchInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ToolParameterKeyMatchInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the prediction field is set.
   */
  boolean hasPrediction();
  /**
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The prediction.
   */
  java.lang.String getPrediction();
  /**
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for prediction.
   */
  com.google.protobuf.ByteString
      getPredictionBytes();

  /**
   * <pre>
   * Required. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the reference field is set.
   */
  boolean hasReference();
  /**
   * <pre>
   * Required. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The reference.
   */
  java.lang.String getReference();
  /**
   * <pre>
   * Required. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for reference.
   */
  com.google.protobuf.ByteString
      getReferenceBytes();
}
