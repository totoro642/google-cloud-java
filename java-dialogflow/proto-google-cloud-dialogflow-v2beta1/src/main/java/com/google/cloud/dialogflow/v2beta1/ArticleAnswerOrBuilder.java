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
// source: google/cloud/dialogflow/v2beta1/participant.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2beta1;

public interface ArticleAnswerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ArticleAnswer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The article title.
   * </pre>
   *
   * <code>string title = 1;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * The article title.
   * </pre>
   *
   * <code>string title = 1;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * The article URI.
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
   * The article URI.
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
   * Output only. Article snippets.
   * </pre>
   *
   * <code>repeated string snippets = 3;</code>
   *
   * @return A list containing the snippets.
   */
  java.util.List<java.lang.String> getSnippetsList();
  /**
   *
   *
   * <pre>
   * Output only. Article snippets.
   * </pre>
   *
   * <code>repeated string snippets = 3;</code>
   *
   * @return The count of snippets.
   */
  int getSnippetsCount();
  /**
   *
   *
   * <pre>
   * Output only. Article snippets.
   * </pre>
   *
   * <code>repeated string snippets = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The snippets at the given index.
   */
  java.lang.String getSnippets(int index);
  /**
   *
   *
   * <pre>
   * Output only. Article snippets.
   * </pre>
   *
   * <code>repeated string snippets = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the snippets at the given index.
   */
  com.google.protobuf.ByteString getSnippetsBytes(int index);

  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A map that contains metadata about the answer and the
   * document from which it originates.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 5;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The name of answer record, in the format of
   * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
   * ID&gt;"
   * </pre>
   *
   * <code>string answer_record = 6;</code>
   *
   * @return The answerRecord.
   */
  java.lang.String getAnswerRecord();
  /**
   *
   *
   * <pre>
   * The name of answer record, in the format of
   * "projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/answerRecords/&lt;Answer Record
   * ID&gt;"
   * </pre>
   *
   * <code>string answer_record = 6;</code>
   *
   * @return The bytes for answerRecord.
   */
  com.google.protobuf.ByteString getAnswerRecordBytes();
}
