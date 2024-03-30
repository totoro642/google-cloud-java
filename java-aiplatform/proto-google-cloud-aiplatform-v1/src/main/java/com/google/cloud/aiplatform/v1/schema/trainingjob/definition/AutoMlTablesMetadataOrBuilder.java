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
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_tables.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public interface AutoMlTablesMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlTablesMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The actual training cost of the model, expressed in milli
   * node hours, i.e. 1,000 value in this field means 1 node hour. Guaranteed
   * to not exceed the train budget.
   * </pre>
   *
   * <code>int64 train_cost_milli_node_hours = 1;</code>
   *
   * @return The trainCostMilliNodeHours.
   */
  long getTrainCostMilliNodeHours();
}
