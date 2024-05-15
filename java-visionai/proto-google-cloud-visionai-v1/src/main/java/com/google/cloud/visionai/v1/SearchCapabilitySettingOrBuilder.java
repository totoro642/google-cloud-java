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

public interface SearchCapabilitySettingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.SearchCapabilitySetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The metadata of search capability to enable.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchCapability search_capabilities = 1;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.SearchCapability> getSearchCapabilitiesList();
  /**
   *
   *
   * <pre>
   * The metadata of search capability to enable.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchCapability search_capabilities = 1;</code>
   */
  com.google.cloud.visionai.v1.SearchCapability getSearchCapabilities(int index);
  /**
   *
   *
   * <pre>
   * The metadata of search capability to enable.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchCapability search_capabilities = 1;</code>
   */
  int getSearchCapabilitiesCount();
  /**
   *
   *
   * <pre>
   * The metadata of search capability to enable.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchCapability search_capabilities = 1;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.SearchCapabilityOrBuilder>
      getSearchCapabilitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The metadata of search capability to enable.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SearchCapability search_capabilities = 1;</code>
   */
  com.google.cloud.visionai.v1.SearchCapabilityOrBuilder getSearchCapabilitiesOrBuilder(int index);
}
