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
// source: google/monitoring/v3/service_service.proto

package com.google.monitoring.v3;

public interface UpdateServiceLevelObjectiveRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UpdateServiceLevelObjectiveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `ServiceLevelObjective` to draw updates from.
   * The given `name` specifies the resource to update.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.ServiceLevelObjective service_level_objective = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the serviceLevelObjective field is set.
   */
  boolean hasServiceLevelObjective();
  /**
   *
   *
   * <pre>
   * Required. The `ServiceLevelObjective` to draw updates from.
   * The given `name` specifies the resource to update.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.ServiceLevelObjective service_level_objective = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The serviceLevelObjective.
   */
  com.google.monitoring.v3.ServiceLevelObjective getServiceLevelObjective();
  /**
   *
   *
   * <pre>
   * Required. The `ServiceLevelObjective` to draw updates from.
   * The given `name` specifies the resource to update.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.ServiceLevelObjective service_level_objective = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder getServiceLevelObjectiveOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of field paths defining which fields to use for the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * A set of field paths defining which fields to use for the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * A set of field paths defining which fields to use for the update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
