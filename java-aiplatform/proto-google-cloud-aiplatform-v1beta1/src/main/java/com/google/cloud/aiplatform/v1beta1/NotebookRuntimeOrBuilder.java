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
// source: google/cloud/aiplatform/v1beta1/notebook_runtime.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface NotebookRuntimeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.NotebookRuntime)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the NotebookRuntime.
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
   * Output only. The resource name of the NotebookRuntime.
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
   * Required. The user email of the NotebookRuntime.
   * </pre>
   *
   * <code>string runtime_user = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The runtimeUser.
   */
  java.lang.String getRuntimeUser();
  /**
   *
   *
   * <pre>
   * Required. The user email of the NotebookRuntime.
   * </pre>
   *
   * <code>string runtime_user = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for runtimeUser.
   */
  com.google.protobuf.ByteString getRuntimeUserBytes();

  /**
   *
   *
   * <pre>
   * Output only. The pointer to NotebookRuntimeTemplate this NotebookRuntime is
   * created from.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplateRef notebook_runtime_template_ref = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the notebookRuntimeTemplateRef field is set.
   */
  boolean hasNotebookRuntimeTemplateRef();
  /**
   *
   *
   * <pre>
   * Output only. The pointer to NotebookRuntimeTemplate this NotebookRuntime is
   * created from.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplateRef notebook_runtime_template_ref = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The notebookRuntimeTemplateRef.
   */
  com.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplateRef getNotebookRuntimeTemplateRef();
  /**
   *
   *
   * <pre>
   * Output only. The pointer to NotebookRuntimeTemplate this NotebookRuntime is
   * created from.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplateRef notebook_runtime_template_ref = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.NotebookRuntimeTemplateRefOrBuilder
      getNotebookRuntimeTemplateRefOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint used to access the NotebookRuntime.
   * </pre>
   *
   * <code>string proxy_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The proxyUri.
   */
  java.lang.String getProxyUri();
  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint used to access the NotebookRuntime.
   * </pre>
   *
   * <code>string proxy_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for proxyUri.
   */
  com.google.protobuf.ByteString getProxyUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The health state of the NotebookRuntime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntime.HealthState health_state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for healthState.
   */
  int getHealthStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The health state of the NotebookRuntime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntime.HealthState health_state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The healthState.
   */
  com.google.cloud.aiplatform.v1beta1.NotebookRuntime.HealthState getHealthState();

  /**
   *
   *
   * <pre>
   * Required. The display name of the NotebookRuntime.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the NotebookRuntime.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the NotebookRuntime.
   * </pre>
   *
   * <code>string description = 11;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the NotebookRuntime.
   * </pre>
   *
   * <code>string description = 11;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The service account that the NotebookRuntime workload runs as.
   * </pre>
   *
   * <code>string service_account = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Output only. The service account that the NotebookRuntime workload runs as.
   * </pre>
   *
   * <code>string service_account = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Output only. The runtime (instance) state of the NotebookRuntime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntime.RuntimeState runtime_state = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for runtimeState.
   */
  int getRuntimeStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The runtime (instance) state of the NotebookRuntime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntime.RuntimeState runtime_state = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The runtimeState.
   */
  com.google.cloud.aiplatform.v1beta1.NotebookRuntime.RuntimeState getRuntimeState();

  /**
   *
   *
   * <pre>
   * Output only. Whether NotebookRuntime is upgradable.
   * </pre>
   *
   * <code>bool is_upgradable = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The isUpgradable.
   */
  boolean getIsUpgradable();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * NotebookRuntime.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one NotebookRuntime
   * (System labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for NotebookRuntime:
   *
   * * "aiplatform.googleapis.com/notebook_runtime_gce_instance_id": output
   * only, its value is the Compute Engine instance id.
   * * "aiplatform.googleapis.com/colab_enterprise_entry_service": its value is
   * either "bigquery" or "vertex"; if absent, it should be "vertex". This is to
   * describe the entry service, either BigQuery or Vertex.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * NotebookRuntime.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one NotebookRuntime
   * (System labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for NotebookRuntime:
   *
   * * "aiplatform.googleapis.com/notebook_runtime_gce_instance_id": output
   * only, its value is the Compute Engine instance id.
   * * "aiplatform.googleapis.com/colab_enterprise_entry_service": its value is
   * either "bigquery" or "vertex"; if absent, it should be "vertex". This is to
   * describe the entry service, either BigQuery or Vertex.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * NotebookRuntime.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one NotebookRuntime
   * (System labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for NotebookRuntime:
   *
   * * "aiplatform.googleapis.com/notebook_runtime_gce_instance_id": output
   * only, its value is the Compute Engine instance id.
   * * "aiplatform.googleapis.com/colab_enterprise_entry_service": its value is
   * either "bigquery" or "vertex"; if absent, it should be "vertex". This is to
   * describe the entry service, either BigQuery or Vertex.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your
   * NotebookRuntime.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one NotebookRuntime
   * (System labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for NotebookRuntime:
   *
   * * "aiplatform.googleapis.com/notebook_runtime_gce_instance_id": output
   * only, its value is the Compute Engine instance id.
   * * "aiplatform.googleapis.com/colab_enterprise_entry_service": its value is
   * either "bigquery" or "vertex"; if absent, it should be "vertex". This is to
   * describe the entry service, either BigQuery or Vertex.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
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
   * The labels with user-defined metadata to organize your
   * NotebookRuntime.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one NotebookRuntime
   * (System labels are excluded).
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable. Following system labels exist for NotebookRuntime:
   *
   * * "aiplatform.googleapis.com/notebook_runtime_gce_instance_id": output
   * only, its value is the Compute Engine instance id.
   * * "aiplatform.googleapis.com/colab_enterprise_entry_service": its value is
   * either "bigquery" or "vertex"; if absent, it should be "vertex". This is to
   * describe the entry service, either BigQuery or Vertex.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 16;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime will be expired:
   * 1. System Predefined NotebookRuntime: 24 hours after creation. After
   * expiration, system predifined runtime will be deleted.
   * 2. User created NotebookRuntime: 6 months after last upgrade. After
   * expiration, user created runtime will be stopped and allowed for upgrade.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expirationTime field is set.
   */
  boolean hasExpirationTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime will be expired:
   * 1. System Predefined NotebookRuntime: 24 hours after creation. After
   * expiration, system predifined runtime will be deleted.
   * 2. User created NotebookRuntime: 6 months after last upgrade. After
   * expiration, user created runtime will be stopped and allowed for upgrade.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expirationTime.
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntime will be expired:
   * 1. System Predefined NotebookRuntime: 24 hours after creation. After
   * expiration, system predifined runtime will be deleted.
   * 2. User created NotebookRuntime: 6 months after last upgrade. After
   * expiration, user created runtime will be stopped and allowed for upgrade.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp expiration_time = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The VM os image version of NotebookRuntime.
   * </pre>
   *
   * <code>string version = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Output only. The VM os image version of NotebookRuntime.
   * </pre>
   *
   * <code>string version = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The type of the notebook runtime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntimeType notebook_runtime_type = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for notebookRuntimeType.
   */
  int getNotebookRuntimeTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The type of the notebook runtime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.NotebookRuntimeType notebook_runtime_type = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The notebookRuntimeType.
   */
  com.google.cloud.aiplatform.v1beta1.NotebookRuntimeType getNotebookRuntimeType();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * </pre>
   *
   * <code>repeated string network_tags = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the networkTags.
   */
  java.util.List<java.lang.String> getNetworkTagsList();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * </pre>
   *
   * <code>repeated string network_tags = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of networkTags.
   */
  int getNetworkTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * </pre>
   *
   * <code>repeated string network_tags = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The networkTags at the given index.
   */
  java.lang.String getNetworkTags(int index);
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * </pre>
   *
   * <code>repeated string network_tags = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the networkTags at the given index.
   */
  com.google.protobuf.ByteString getNetworkTagsBytes(int index);
}
