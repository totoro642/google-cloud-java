// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface SummarizationQualityInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SummarizationQualityInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Spec for summarization quality score metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SummarizationQualitySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the metricSpec field is set.
   */
  boolean hasMetricSpec();
  /**
   * <pre>
   * Required. Spec for summarization quality score metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SummarizationQualitySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The metricSpec.
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationQualitySpec getMetricSpec();
  /**
   * <pre>
   * Required. Spec for summarization quality score metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SummarizationQualitySpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationQualitySpecOrBuilder getMetricSpecOrBuilder();

  /**
   * <pre>
   * Required. Summarization quality instance.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SummarizationQualityInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * Required. Summarization quality instance.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SummarizationQualityInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instance.
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationQualityInstance getInstance();
  /**
   * <pre>
   * Required. Summarization quality instance.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SummarizationQualityInstance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1beta1.SummarizationQualityInstanceOrBuilder getInstanceOrBuilder();
}
