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
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface QueryDeployedModelsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QueryDeployedModelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * DEPRECATED Use deployed_model_refs instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedModel deployed_models = 1 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<com.google.cloud.aiplatform.v1beta1.DeployedModel> getDeployedModelsList();
  /**
   *
   *
   * <pre>
   * DEPRECATED Use deployed_model_refs instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedModel deployed_models = 1 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1beta1.DeployedModel getDeployedModels(int index);
  /**
   *
   *
   * <pre>
   * DEPRECATED Use deployed_model_refs instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedModel deployed_models = 1 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getDeployedModelsCount();
  /**
   *
   *
   * <pre>
   * DEPRECATED Use deployed_model_refs instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedModel deployed_models = 1 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder>
      getDeployedModelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * DEPRECATED Use deployed_model_refs instead.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedModel deployed_models = 1 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder getDeployedModelsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * References to the DeployedModels that share the specified
   * deploymentResourcePool.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedModelRef deployed_model_refs = 3;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.DeployedModelRef> getDeployedModelRefsList();
  /**
   *
   *
   * <pre>
   * References to the DeployedModels that share the specified
   * deploymentResourcePool.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedModelRef deployed_model_refs = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedModelRef getDeployedModelRefs(int index);
  /**
   *
   *
   * <pre>
   * References to the DeployedModels that share the specified
   * deploymentResourcePool.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedModelRef deployed_model_refs = 3;
   * </code>
   */
  int getDeployedModelRefsCount();
  /**
   *
   *
   * <pre>
   * References to the DeployedModels that share the specified
   * deploymentResourcePool.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedModelRef deployed_model_refs = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DeployedModelRefOrBuilder>
      getDeployedModelRefsOrBuilderList();
  /**
   *
   *
   * <pre>
   * References to the DeployedModels that share the specified
   * deploymentResourcePool.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.DeployedModelRef deployed_model_refs = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedModelRefOrBuilder getDeployedModelRefsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The total number of DeployedModels on this DeploymentResourcePool.
   * </pre>
   *
   * <code>int32 total_deployed_model_count = 4;</code>
   *
   * @return The totalDeployedModelCount.
   */
  int getTotalDeployedModelCount();

  /**
   *
   *
   * <pre>
   * The total number of Endpoints that have DeployedModels on this
   * DeploymentResourcePool.
   * </pre>
   *
   * <code>int32 total_endpoint_count = 5;</code>
   *
   * @return The totalEndpointCount.
   */
  int getTotalEndpointCount();
}
