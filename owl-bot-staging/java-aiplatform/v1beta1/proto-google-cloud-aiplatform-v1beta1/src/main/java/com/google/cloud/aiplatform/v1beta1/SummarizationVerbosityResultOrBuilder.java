// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface SummarizationVerbosityResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SummarizationVerbosityResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Summarization Verbosity score.
   * </pre>
   *
   * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the score field is set.
   */
  boolean hasScore();
  /**
   * <pre>
   * Output only. Summarization Verbosity score.
   * </pre>
   *
   * <code>optional float score = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The score.
   */
  float getScore();

  /**
   * <pre>
   * Output only. Explanation for summarization verbosity score.
   * </pre>
   *
   * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The explanation.
   */
  java.lang.String getExplanation();
  /**
   * <pre>
   * Output only. Explanation for summarization verbosity score.
   * </pre>
   *
   * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for explanation.
   */
  com.google.protobuf.ByteString
      getExplanationBytes();

  /**
   * <pre>
   * Output only. Confidence for summarization verbosity score.
   * </pre>
   *
   * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the confidence field is set.
   */
  boolean hasConfidence();
  /**
   * <pre>
   * Output only. Confidence for summarization verbosity score.
   * </pre>
   *
   * <code>optional float confidence = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The confidence.
   */
  float getConfidence();
}
