// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface SafetySettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SafetySetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Harm category.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.HarmCategory category = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <pre>
   * Required. Harm category.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.HarmCategory category = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The category.
   */
  com.google.cloud.aiplatform.v1beta1.HarmCategory getCategory();

  /**
   * <pre>
   * Required. The harm block threshold.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetySetting.HarmBlockThreshold threshold = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for threshold.
   */
  int getThresholdValue();
  /**
   * <pre>
   * Required. The harm block threshold.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetySetting.HarmBlockThreshold threshold = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The threshold.
   */
  com.google.cloud.aiplatform.v1beta1.SafetySetting.HarmBlockThreshold getThreshold();

  /**
   * <pre>
   * Optional. Specify if the threshold is used for probability or severity
   * score. If not specified, the threshold is used for probability score.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetySetting.HarmBlockMethod method = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for method.
   */
  int getMethodValue();
  /**
   * <pre>
   * Optional. Specify if the threshold is used for probability or severity
   * score. If not specified, the threshold is used for probability score.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SafetySetting.HarmBlockMethod method = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The method.
   */
  com.google.cloud.aiplatform.v1beta1.SafetySetting.HarmBlockMethod getMethod();
}
