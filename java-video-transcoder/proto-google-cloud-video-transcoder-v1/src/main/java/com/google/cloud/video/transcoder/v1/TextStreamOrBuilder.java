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

public interface TextStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.TextStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The codec for this text stream. The default is `"webvtt"`.
   * Supported text codecs:
   * - 'srt'
   * - 'ttml'
   * - 'cea608'
   * - 'cea708'
   * - 'webvtt'
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   *
   *
   * <pre>
   * The codec for this text stream. The default is `"webvtt"`.
   * Supported text codecs:
   * - 'srt'
   * - 'ttml'
   * - 'cea608'
   * - 'cea708'
   * - 'webvtt'
   * </pre>
   *
   * <code>string codec = 1;</code>
   *
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString getCodecBytes();

  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.TextStream.TextMapping mapping = 3;</code>
   */
  java.util.List<com.google.cloud.video.transcoder.v1.TextStream.TextMapping> getMappingList();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.TextStream.TextMapping mapping = 3;</code>
   */
  com.google.cloud.video.transcoder.v1.TextStream.TextMapping getMapping(int index);
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.TextStream.TextMapping mapping = 3;</code>
   */
  int getMappingCount();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.TextStream.TextMapping mapping = 3;</code>
   */
  java.util.List<? extends com.google.cloud.video.transcoder.v1.TextStream.TextMappingOrBuilder>
      getMappingOrBuilderList();
  /**
   *
   *
   * <pre>
   * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
   * </pre>
   *
   * <code>repeated .google.cloud.video.transcoder.v1.TextStream.TextMapping mapping = 3;</code>
   */
  com.google.cloud.video.transcoder.v1.TextStream.TextMappingOrBuilder getMappingOrBuilder(
      int index);
}
