// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/adaptive_mt.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.translate.v3;

public interface AdaptiveMtSentenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.AdaptiveMtSentence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the file, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/adaptiveMtDatasets/{dataset}/adaptiveMtFiles/{file}/adaptiveMtSentences/{sentence}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the file, in form of
   * `projects/{project-number-or-id}/locations/{location_id}/adaptiveMtDatasets/{dataset}/adaptiveMtFiles/{file}/adaptiveMtSentences/{sentence}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The source sentence.
   * </pre>
   *
   * <code>string source_sentence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The sourceSentence.
   */
  java.lang.String getSourceSentence();
  /**
   * <pre>
   * Required. The source sentence.
   * </pre>
   *
   * <code>string source_sentence = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for sourceSentence.
   */
  com.google.protobuf.ByteString
      getSourceSentenceBytes();

  /**
   * <pre>
   * Required. The target sentence.
   * </pre>
   *
   * <code>string target_sentence = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The targetSentence.
   */
  java.lang.String getTargetSentence();
  /**
   * <pre>
   * Required. The target sentence.
   * </pre>
   *
   * <code>string target_sentence = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for targetSentence.
   */
  com.google.protobuf.ByteString
      getTargetSentenceBytes();

  /**
   * <pre>
   * Output only. Timestamp when this sentence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this sentence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this sentence was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this sentence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this sentence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this sentence was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
