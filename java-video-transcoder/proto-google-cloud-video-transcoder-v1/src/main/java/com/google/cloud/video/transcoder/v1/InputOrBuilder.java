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
// source: google/cloud/video/transcoder/v1/resources.proto

package com.google.cloud.video.transcoder.v1;

public interface InputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.Input)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique key for this input. Must be specified when using advanced
   * mapping and edit lists.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * A unique key for this input. Must be specified when using advanced
   * mapping and edit lists.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * URI of the media. Input files must be at least 5 seconds in duration and
   * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
   * If empty, the value will be populated from `Job.input_uri`.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI of the media. Input files must be at least 5 seconds in duration and
   * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
   * If empty, the value will be populated from `Job.input_uri`.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;</code>
   *
   * @return Whether the preprocessingConfig field is set.
   */
  boolean hasPreprocessingConfig();
  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;</code>
   *
   * @return The preprocessingConfig.
   */
  com.google.cloud.video.transcoder.v1.PreprocessingConfig getPreprocessingConfig();
  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;</code>
   */
  com.google.cloud.video.transcoder.v1.PreprocessingConfigOrBuilder
      getPreprocessingConfigOrBuilder();
}
