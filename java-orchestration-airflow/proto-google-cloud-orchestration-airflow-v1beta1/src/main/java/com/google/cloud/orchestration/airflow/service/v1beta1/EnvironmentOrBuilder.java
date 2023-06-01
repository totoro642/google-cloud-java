/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface EnvironmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.Environment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the environment, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   *
   * EnvironmentId must start with a lowercase letter followed by up to 63
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the environment, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   *
   * EnvironmentId must start with a lowercase letter followed by up to 63
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Configuration parameters for this environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig config = 2;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Configuration parameters for this environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig config = 2;</code>
   *
   * @return The config.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig getConfig();
  /**
   *
   *
   * <pre>
   * Configuration parameters for this environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfig config = 2;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentConfigOrBuilder
      getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The UUID (Universally Unique IDentifier) associated with this
   * environment. This value is generated when the environment is created.
   * </pre>
   *
   * <code>string uuid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   *
   *
   * <pre>
   * Output only. The UUID (Universally Unique IDentifier) associated with this
   * environment. This value is generated when the environment is created.
   * </pre>
   *
   * <code>string uuid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString getUuidBytes();

  /**
   *
   *
   * <pre>
   * The current state of the environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.Environment.State state = 4;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The current state of the environment.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.Environment.State state = 4;</code>
   *
   * @return The state.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.Environment.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this environment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this environment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this environment was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this environment was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this environment was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this environment was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for this environment.
   * The labels map can contain no more than 64 entries. Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   *
   * * Keys must conform to regexp: [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for this environment.
   * The labels map can contain no more than 64 entries. Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   *
   * * Keys must conform to regexp: [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for this environment.
   * The labels map can contain no more than 64 entries. Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   *
   * * Keys must conform to regexp: [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. User-defined labels for this environment.
   * The labels map can contain no more than 64 entries. Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   *
   * * Keys must conform to regexp: [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. User-defined labels for this environment.
   * The labels map can contain no more than 64 entries. Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   *
   * * Keys must conform to regexp: [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
