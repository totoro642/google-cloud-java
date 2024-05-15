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
// source: google/cloud/visionai/v1/platform.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

public interface VertexAutoMLVisionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.VertexAutoMLVisionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Only entities with higher score than the threshold will be returned.
   * Value 0.0 means to return all the detected entities.
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   *
   * @return The confidenceThreshold.
   */
  float getConfidenceThreshold();

  /**
   *
   *
   * <pre>
   * At most this many predictions will be returned per output frame.
   * Value 0 means to return all the detected entities.
   * </pre>
   *
   * <code>int32 max_predictions = 2;</code>
   *
   * @return The maxPredictions.
   */
  int getMaxPredictions();
}
