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
// source: google/cloud/dialogflow/v2/session.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public interface TextInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.TextInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The UTF-8 encoded natural language text to be processed.
   * Text length must not exceed 256 characters for virtual agent interactions.
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * Required. The UTF-8 encoded natural language text to be processed.
   * Text length must not exceed 256 characters for virtual agent interactions.
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * Required. The language of this conversational query. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The language of this conversational query. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
