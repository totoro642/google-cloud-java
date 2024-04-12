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
// source: google/cloud/discoveryengine/v1alpha/site_search_engine_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public interface EnableAdvancedSiteSearchRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.EnableAdvancedSiteSearchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of the
   * [SiteSearchEngine][google.cloud.discoveryengine.v1alpha.SiteSearchEngine],
   * such as
   * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
   * </pre>
   *
   * <code>
   * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The siteSearchEngine.
   */
  java.lang.String getSiteSearchEngine();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the
   * [SiteSearchEngine][google.cloud.discoveryengine.v1alpha.SiteSearchEngine],
   * such as
   * `projects/{project}/locations/{location}/dataStores/{data_store_id}/siteSearchEngine`.
   * </pre>
   *
   * <code>
   * string site_search_engine = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for siteSearchEngine.
   */
  com.google.protobuf.ByteString getSiteSearchEngineBytes();
}
