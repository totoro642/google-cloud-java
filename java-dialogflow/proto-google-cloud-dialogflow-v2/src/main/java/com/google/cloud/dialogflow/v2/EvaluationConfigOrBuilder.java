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
// source: google/cloud/dialogflow/v2/conversation_model.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public interface EvaluationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.EvaluationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Datasets used for evaluation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.InputDataset> getDatasetsList();
  /**
   *
   *
   * <pre>
   * Required. Datasets used for evaluation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.InputDataset getDatasets(int index);
  /**
   *
   *
   * <pre>
   * Required. Datasets used for evaluation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getDatasetsCount();
  /**
   *
   *
   * <pre>
   * Required. Datasets used for evaluation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.InputDatasetOrBuilder>
      getDatasetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Datasets used for evaluation.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.InputDataset datasets = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.InputDatasetOrBuilder getDatasetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Configuration for smart reply model evalution.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EvaluationConfig.SmartReplyConfig smart_reply_config = 2;
   * </code>
   *
   * @return Whether the smartReplyConfig field is set.
   */
  boolean hasSmartReplyConfig();
  /**
   *
   *
   * <pre>
   * Configuration for smart reply model evalution.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EvaluationConfig.SmartReplyConfig smart_reply_config = 2;
   * </code>
   *
   * @return The smartReplyConfig.
   */
  com.google.cloud.dialogflow.v2.EvaluationConfig.SmartReplyConfig getSmartReplyConfig();
  /**
   *
   *
   * <pre>
   * Configuration for smart reply model evalution.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EvaluationConfig.SmartReplyConfig smart_reply_config = 2;
   * </code>
   */
  com.google.cloud.dialogflow.v2.EvaluationConfig.SmartReplyConfigOrBuilder
      getSmartReplyConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for smart compose model evalution.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EvaluationConfig.SmartComposeConfig smart_compose_config = 4;
   * </code>
   *
   * @return Whether the smartComposeConfig field is set.
   */
  boolean hasSmartComposeConfig();
  /**
   *
   *
   * <pre>
   * Configuration for smart compose model evalution.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EvaluationConfig.SmartComposeConfig smart_compose_config = 4;
   * </code>
   *
   * @return The smartComposeConfig.
   */
  com.google.cloud.dialogflow.v2.EvaluationConfig.SmartComposeConfig getSmartComposeConfig();
  /**
   *
   *
   * <pre>
   * Configuration for smart compose model evalution.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.EvaluationConfig.SmartComposeConfig smart_compose_config = 4;
   * </code>
   */
  com.google.cloud.dialogflow.v2.EvaluationConfig.SmartComposeConfigOrBuilder
      getSmartComposeConfigOrBuilder();

  com.google.cloud.dialogflow.v2.EvaluationConfig.ModelSpecificConfigCase
      getModelSpecificConfigCase();
}
