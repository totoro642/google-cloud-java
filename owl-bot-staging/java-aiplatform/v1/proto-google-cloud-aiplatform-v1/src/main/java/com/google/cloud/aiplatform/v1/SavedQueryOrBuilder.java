// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/saved_query.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface SavedQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SavedQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the SavedQuery.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the SavedQuery.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The user-defined name of the SavedQuery.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The user-defined name of the SavedQuery.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Some additional information about the SavedQuery.
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 12;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Some additional information about the SavedQuery.
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 12;</code>
   * @return The metadata.
   */
  com.google.protobuf.Value getMetadata();
  /**
   * <pre>
   * Some additional information about the SavedQuery.
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 12;</code>
   */
  com.google.protobuf.ValueOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this SavedQuery was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this SavedQuery was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this SavedQuery was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when SavedQuery was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when SavedQuery was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when SavedQuery was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Filters on the Annotations in the dataset.
   * </pre>
   *
   * <code>string annotation_filter = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The annotationFilter.
   */
  java.lang.String getAnnotationFilter();
  /**
   * <pre>
   * Output only. Filters on the Annotations in the dataset.
   * </pre>
   *
   * <code>string annotation_filter = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for annotationFilter.
   */
  com.google.protobuf.ByteString
      getAnnotationFilterBytes();

  /**
   * <pre>
   * Required. Problem type of the SavedQuery.
   * Allowed values:
   *
   * * IMAGE_CLASSIFICATION_SINGLE_LABEL
   * * IMAGE_CLASSIFICATION_MULTI_LABEL
   * * IMAGE_BOUNDING_POLY
   * * IMAGE_BOUNDING_BOX
   * * TEXT_CLASSIFICATION_SINGLE_LABEL
   * * TEXT_CLASSIFICATION_MULTI_LABEL
   * * TEXT_EXTRACTION
   * * TEXT_SENTIMENT
   * * VIDEO_CLASSIFICATION
   * * VIDEO_OBJECT_TRACKING
   * </pre>
   *
   * <code>string problem_type = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The problemType.
   */
  java.lang.String getProblemType();
  /**
   * <pre>
   * Required. Problem type of the SavedQuery.
   * Allowed values:
   *
   * * IMAGE_CLASSIFICATION_SINGLE_LABEL
   * * IMAGE_CLASSIFICATION_MULTI_LABEL
   * * IMAGE_BOUNDING_POLY
   * * IMAGE_BOUNDING_BOX
   * * TEXT_CLASSIFICATION_SINGLE_LABEL
   * * TEXT_CLASSIFICATION_MULTI_LABEL
   * * TEXT_EXTRACTION
   * * TEXT_SENTIMENT
   * * VIDEO_CLASSIFICATION
   * * VIDEO_OBJECT_TRACKING
   * </pre>
   *
   * <code>string problem_type = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for problemType.
   */
  com.google.protobuf.ByteString
      getProblemTypeBytes();

  /**
   * <pre>
   * Output only. Number of AnnotationSpecs in the context of the SavedQuery.
   * </pre>
   *
   * <code>int32 annotation_spec_count = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The annotationSpecCount.
   */
  int getAnnotationSpecCount();

  /**
   * <pre>
   * Used to perform a consistent read-modify-write update. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 8;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Used to perform a consistent read-modify-write update. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 8;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();

  /**
   * <pre>
   * Output only. If the Annotations belonging to the SavedQuery can be used for
   * AutoML training.
   * </pre>
   *
   * <code>bool support_automl_training = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The supportAutomlTraining.
   */
  boolean getSupportAutomlTraining();
}
