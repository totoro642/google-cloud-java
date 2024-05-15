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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

public interface ImageQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ImageQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Input image in raw bytes.
   * </pre>
   *
   * <code>bytes input_image = 1;</code>
   *
   * @return Whether the inputImage field is set.
   */
  boolean hasInputImage();
  /**
   *
   *
   * <pre>
   * Input image in raw bytes.
   * </pre>
   *
   * <code>bytes input_image = 1;</code>
   *
   * @return The inputImage.
   */
  com.google.protobuf.ByteString getInputImage();

  /**
   *
   *
   * <pre>
   * Resource name of the asset. Only supported in IMAGE corpus type.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string asset = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the asset field is set.
   */
  boolean hasAsset();
  /**
   *
   *
   * <pre>
   * Resource name of the asset. Only supported in IMAGE corpus type.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string asset = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   *
   *
   * <pre>
   * Resource name of the asset. Only supported in IMAGE corpus type.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string asset = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString getAssetBytes();

  com.google.cloud.visionai.v1.ImageQuery.ImageCase getImageCase();
}
