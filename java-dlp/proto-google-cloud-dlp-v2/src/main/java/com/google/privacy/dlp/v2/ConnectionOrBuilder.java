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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

public interface ConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Connection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of the connection:
   * `projects/{project}/locations/{location}/connections/{name}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Name of the connection:
   * `projects/{project}/locations/{location}/connections/{name}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The connection's state in its lifecycle.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.ConnectionState state = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Required. The connection's state in its lifecycle.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.ConnectionState state = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The state.
   */
  com.google.privacy.dlp.v2.ConnectionState getState();

  /**
   *
   *
   * <pre>
   * Output only. Set if status == ERROR, to provide additional details. Will
   * store the last 10 errors sorted with the most recent first.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.privacy.dlp.v2.Error> getErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. Set if status == ERROR, to provide additional details. Will
   * store the last 10 errors sorted with the most recent first.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.privacy.dlp.v2.Error getErrors(int index);
  /**
   *
   *
   * <pre>
   * Output only. Set if status == ERROR, to provide additional details. Will
   * store the last 10 errors sorted with the most recent first.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. Set if status == ERROR, to provide additional details. Will
   * store the last 10 errors sorted with the most recent first.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.ErrorOrBuilder> getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Set if status == ERROR, to provide additional details. Will
   * store the last 10 errors sorted with the most recent first.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.privacy.dlp.v2.ErrorOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Connect to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudSqlProperties cloud_sql = 4;</code>
   *
   * @return Whether the cloudSql field is set.
   */
  boolean hasCloudSql();
  /**
   *
   *
   * <pre>
   * Connect to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudSqlProperties cloud_sql = 4;</code>
   *
   * @return The cloudSql.
   */
  com.google.privacy.dlp.v2.CloudSqlProperties getCloudSql();
  /**
   *
   *
   * <pre>
   * Connect to a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudSqlProperties cloud_sql = 4;</code>
   */
  com.google.privacy.dlp.v2.CloudSqlPropertiesOrBuilder getCloudSqlOrBuilder();

  com.google.privacy.dlp.v2.Connection.PropertiesCase getPropertiesCase();
}
