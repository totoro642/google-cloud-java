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
// source: google/cloud/discoveryengine/v1alpha/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public interface ImportCompletionSuggestionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.ImportCompletionSuggestionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  java.util.List<com.google.rpc.Status> getErrorSamplesList();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  com.google.rpc.Status getErrorSamples(int index);
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  int getErrorSamplesCount();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorSamplesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A sample of errors encountered while processing the request.
   * </pre>
   *
   * <code>repeated .google.rpc.Status error_samples = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorSamplesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Count of
   * [CompletionSuggestion][google.cloud.discoveryengine.v1alpha.CompletionSuggestion]s
   * successfully imported.
   * </pre>
   *
   * <code>int64 success_count = 2;</code>
   *
   * @return The successCount.
   */
  long getSuccessCount();

  /**
   *
   *
   * <pre>
   * Count of
   * [CompletionSuggestion][google.cloud.discoveryengine.v1alpha.CompletionSuggestion]s
   * that failed to be imported.
   * </pre>
   *
   * <code>int64 failure_count = 3;</code>
   *
   * @return The failureCount.
   */
  long getFailureCount();
}
