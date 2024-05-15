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

public interface OccupancyCountConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.OccupancyCountConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether to count the appearances of people, output counts have 'people' as
   * the key.
   * </pre>
   *
   * <code>bool enable_people_counting = 1;</code>
   *
   * @return The enablePeopleCounting.
   */
  boolean getEnablePeopleCounting();

  /**
   *
   *
   * <pre>
   * Whether to count the appearances of vehicles, output counts will have
   * 'vehicle' as the key.
   * </pre>
   *
   * <code>bool enable_vehicle_counting = 2;</code>
   *
   * @return The enableVehicleCounting.
   */
  boolean getEnableVehicleCounting();

  /**
   *
   *
   * <pre>
   * Whether to track each invidual object's loitering time inside the scene or
   * specific zone.
   * </pre>
   *
   * <code>bool enable_dwelling_time_tracking = 3;</code>
   *
   * @return The enableDwellingTimeTracking.
   */
  boolean getEnableDwellingTimeTracking();
}
