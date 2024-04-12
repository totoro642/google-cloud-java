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
// source: google/cloud/discoveryengine/v1beta/schema.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public interface SchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   *
   * @return Whether the structSchema field is set.
   */
  boolean hasStructSchema();
  /**
   *
   *
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   *
   * @return The structSchema.
   */
  com.google.protobuf.Struct getStructSchema();
  /**
   *
   *
   * <pre>
   * The structured representation of the schema.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_schema = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getStructSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   *
   * @return Whether the jsonSchema field is set.
   */
  boolean hasJsonSchema();
  /**
   *
   *
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   *
   * @return The jsonSchema.
   */
  java.lang.String getJsonSchema();
  /**
   *
   *
   * <pre>
   * The JSON representation of the schema.
   * </pre>
   *
   * <code>string json_schema = 3;</code>
   *
   * @return The bytes for jsonSchema.
   */
  com.google.protobuf.ByteString getJsonSchemaBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The full resource name of the schema, in the format of
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The full resource name of the schema, in the format of
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/schemas/{schema}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  com.google.cloud.discoveryengine.v1beta.Schema.SchemaCase getSchemaCase();
}
