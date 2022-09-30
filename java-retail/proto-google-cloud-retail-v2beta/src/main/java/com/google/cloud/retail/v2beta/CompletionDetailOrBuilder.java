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
// source: google/cloud/retail/v2beta/user_event.proto

package com.google.cloud.retail.v2beta;

public interface CompletionDetailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.CompletionDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Completion attribution token in
   * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2beta.CompleteQueryResponse.attribution_token].
   * </pre>
   *
   * <code>string completion_attribution_token = 1;</code>
   *
   * @return The completionAttributionToken.
   */
  java.lang.String getCompletionAttributionToken();
  /**
   *
   *
   * <pre>
   * Completion attribution token in
   * [CompleteQueryResponse.attribution_token][google.cloud.retail.v2beta.CompleteQueryResponse.attribution_token].
   * </pre>
   *
   * <code>string completion_attribution_token = 1;</code>
   *
   * @return The bytes for completionAttributionToken.
   */
  com.google.protobuf.ByteString getCompletionAttributionTokenBytes();

  /**
   *
   *
   * <pre>
   * End user selected
   * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2beta.CompleteQueryResponse.CompletionResult.suggestion].
   * </pre>
   *
   * <code>string selected_suggestion = 2;</code>
   *
   * @return The selectedSuggestion.
   */
  java.lang.String getSelectedSuggestion();
  /**
   *
   *
   * <pre>
   * End user selected
   * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2beta.CompleteQueryResponse.CompletionResult.suggestion].
   * </pre>
   *
   * <code>string selected_suggestion = 2;</code>
   *
   * @return The bytes for selectedSuggestion.
   */
  com.google.protobuf.ByteString getSelectedSuggestionBytes();

  /**
   *
   *
   * <pre>
   * End user selected
   * [CompleteQueryResponse.CompletionResult.suggestion][google.cloud.retail.v2beta.CompleteQueryResponse.CompletionResult.suggestion]
   * position, starting from 0.
   * </pre>
   *
   * <code>int32 selected_position = 3;</code>
   *
   * @return The selectedPosition.
   */
  int getSelectedPosition();
}
