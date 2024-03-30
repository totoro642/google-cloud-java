// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface QuestionAnsweringRelevanceSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QuestionAnsweringRelevanceSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether to use instance.reference to compute question answering
   * relevance.
   * </pre>
   *
   * <code>bool use_reference = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The useReference.
   */
  boolean getUseReference();

  /**
   * <pre>
   * Optional. Which version to use for evaluation.
   * </pre>
   *
   * <code>int32 version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The version.
   */
  int getVersion();
}
