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
// source: google/cloud/dialogflow/v2beta1/session_entity_type.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2beta1;

public interface UpdateSessionEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the sessionEntityType field is set.
   */
  boolean hasSessionEntityType();
  /**
   *
   *
   * <pre>
   * Required. The session entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sessionEntityType.
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityType getSessionEntityType();
  /**
   *
   *
   * <pre>
   * Required. The session entity type to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SessionEntityType session_entity_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SessionEntityTypeOrBuilder getSessionEntityTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
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
   * Optional. The mask to control which fields get updated.
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
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
