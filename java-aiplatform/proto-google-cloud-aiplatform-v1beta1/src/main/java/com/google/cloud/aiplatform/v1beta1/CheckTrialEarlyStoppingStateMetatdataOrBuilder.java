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
// source: google/cloud/aiplatform/v1beta1/vizier_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface CheckTrialEarlyStoppingStateMetatdataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CheckTrialEarlyStoppingStateMetatdata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   *
   *
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   *
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata();
  /**
   *
   *
   * <pre>
   * Operation metadata for suggesting Trials.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder
      getGenericMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the Study that the Trial belongs to.
   * </pre>
   *
   * <code>string study = 2;</code>
   *
   * @return The study.
   */
  java.lang.String getStudy();
  /**
   *
   *
   * <pre>
   * The name of the Study that the Trial belongs to.
   * </pre>
   *
   * <code>string study = 2;</code>
   *
   * @return The bytes for study.
   */
  com.google.protobuf.ByteString getStudyBytes();

  /**
   *
   *
   * <pre>
   * The Trial name.
   * </pre>
   *
   * <code>string trial = 3;</code>
   *
   * @return The trial.
   */
  java.lang.String getTrial();
  /**
   *
   *
   * <pre>
   * The Trial name.
   * </pre>
   *
   * <code>string trial = 3;</code>
   *
   * @return The bytes for trial.
   */
  com.google.protobuf.ByteString getTrialBytes();
}
