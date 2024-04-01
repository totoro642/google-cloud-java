// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface GroundingAttributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GroundingAttribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Attribution from the web.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundingAttribution.Web web = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the web field is set.
   */
  boolean hasWeb();
  /**
   * <pre>
   * Optional. Attribution from the web.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundingAttribution.Web web = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The web.
   */
  com.google.cloud.aiplatform.v1beta1.GroundingAttribution.Web getWeb();
  /**
   * <pre>
   * Optional. Attribution from the web.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundingAttribution.Web web = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1beta1.GroundingAttribution.WebOrBuilder getWebOrBuilder();

  /**
   * <pre>
   * Optional. Attribution from context retrieved by the retrieval tools.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundingAttribution.RetrievedContext retrieved_context = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the retrievedContext field is set.
   */
  boolean hasRetrievedContext();
  /**
   * <pre>
   * Optional. Attribution from context retrieved by the retrieval tools.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundingAttribution.RetrievedContext retrieved_context = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The retrievedContext.
   */
  com.google.cloud.aiplatform.v1beta1.GroundingAttribution.RetrievedContext getRetrievedContext();
  /**
   * <pre>
   * Optional. Attribution from context retrieved by the retrieval tools.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GroundingAttribution.RetrievedContext retrieved_context = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1beta1.GroundingAttribution.RetrievedContextOrBuilder getRetrievedContextOrBuilder();

  /**
   * <pre>
   * Output only. Segment of the content this attribution belongs to.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Segment segment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the segment field is set.
   */
  boolean hasSegment();
  /**
   * <pre>
   * Output only. Segment of the content this attribution belongs to.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Segment segment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The segment.
   */
  com.google.cloud.aiplatform.v1beta1.Segment getSegment();
  /**
   * <pre>
   * Output only. Segment of the content this attribution belongs to.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Segment segment = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1beta1.SegmentOrBuilder getSegmentOrBuilder();

  /**
   * <pre>
   * Optional. Output only. Confidence score of the attribution. Ranges from 0
   * to 1. 1 is the most confident.
   * </pre>
   *
   * <code>optional float confidence_score = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the confidenceScore field is set.
   */
  boolean hasConfidenceScore();
  /**
   * <pre>
   * Optional. Output only. Confidence score of the attribution. Ranges from 0
   * to 1. 1 is the most confident.
   * </pre>
   *
   * <code>optional float confidence_score = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The confidenceScore.
   */
  float getConfidenceScore();

  com.google.cloud.aiplatform.v1beta1.GroundingAttribution.ReferenceCase getReferenceCase();
}
