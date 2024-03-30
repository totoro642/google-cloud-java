/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/entity_type.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface EntityTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.EntityType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Name of the EntityType.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *
   * The last part entity_type is assigned by the client. The entity_type can be
   * up to 64 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z and underscore(_), and ASCII digits 0-9 starting with a letter. The
   * value will be unique given a featurestore.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. Name of the EntityType.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   *
   * The last part entity_type is assigned by the client. The entity_type can be
   * up to 64 characters long and can consist only of ASCII Latin letters A-Z
   * and a-z and underscore(_), and ASCII digits 0-9 starting with a letter. The
   * value will be unique given a featurestore.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Description of the EntityType.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of the EntityType.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this EntityType was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * EntityTypes.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one EntityType (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * EntityTypes.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one EntityType (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * EntityTypes.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one EntityType (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * EntityTypes.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one EntityType (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize your
   * EntityTypes.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information on and examples of labels.
   * No more than 64 user labels can be associated with one EntityType (System
   * labels are excluded)."
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Used to perform a consistent read-modify-write updates. If not
   * set, a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. Used to perform a consistent read-modify-write updates. If not
   * set, a blind "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. The default monitoring configuration for all Features with value
   * type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * BOOL, STRING, DOUBLE or INT64 under this EntityType.
   *
   * If this is populated with
   * [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot
   * analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is
   * disabled.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig monitoring_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the monitoringConfig field is set.
   */
  boolean hasMonitoringConfig();
  /**
   *
   *
   * <pre>
   * Optional. The default monitoring configuration for all Features with value
   * type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * BOOL, STRING, DOUBLE or INT64 under this EntityType.
   *
   * If this is populated with
   * [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot
   * analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is
   * disabled.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig monitoring_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The monitoringConfig.
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig getMonitoringConfig();
  /**
   *
   *
   * <pre>
   * Optional. The default monitoring configuration for all Features with value
   * type
   * ([Feature.ValueType][google.cloud.aiplatform.v1beta1.Feature.ValueType])
   * BOOL, STRING, DOUBLE or INT64 under this EntityType.
   *
   * If this is populated with
   * [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot
   * analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is
   * disabled.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfig monitoring_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfigOrBuilder
      getMonitoringConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Config for data retention policy in offline storage.
   * TTL in days for feature values that will be stored in offline storage.
   * The Feature Store offline storage periodically removes obsolete feature
   * values older than `offline_storage_ttl_days` since the feature generation
   * time. If unset (or explicitly set to 0), default to 4000 days TTL.
   * </pre>
   *
   * <code>int32 offline_storage_ttl_days = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The offlineStorageTtlDays.
   */
  int getOfflineStorageTtlDays();
}
