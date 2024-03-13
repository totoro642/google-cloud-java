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

public interface AnnotatedMessagePartOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AnnotatedMessagePart)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A part of a message possibly annotated with an entity.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * Required. A part of a message possibly annotated with an entity.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity
   * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
   * of this message part. If this is empty, Dialogflow could not annotate the
   * phrase part with a system entity.
   * </pre>
   *
   * <code>string entity_type = 2;</code>
   *
   * @return The entityType.
   */
  java.lang.String getEntityType();
  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity
   * type](https://cloud.google.com/dialogflow/docs/reference/system-entities)
   * of this message part. If this is empty, Dialogflow could not annotate the
   * phrase part with a system entity.
   * </pre>
   *
   * <code>string entity_type = 2;</code>
   *
   * @return The bytes for entityType.
   */
  com.google.protobuf.ByteString getEntityTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
   * this message part. For example for a system entity of type
   * `&#64;sys.unit-currency`, this may contain:
   * &lt;pre&gt;
   * {
   *   "amount": 5,
   *   "currency": "USD"
   * }
   * &lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Value formatted_value = 3;</code>
   *
   * @return Whether the formattedValue field is set.
   */
  boolean hasFormattedValue();
  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
   * this message part. For example for a system entity of type
   * `&#64;sys.unit-currency`, this may contain:
   * &lt;pre&gt;
   * {
   *   "amount": 5,
   *   "currency": "USD"
   * }
   * &lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Value formatted_value = 3;</code>
   *
   * @return The formattedValue.
   */
  com.google.protobuf.Value getFormattedValue();
  /**
   *
   *
   * <pre>
   * Optional. The [Dialogflow system entity formatted value
   * ](https://cloud.google.com/dialogflow/docs/reference/system-entities) of
   * this message part. For example for a system entity of type
   * `&#64;sys.unit-currency`, this may contain:
   * &lt;pre&gt;
   * {
   *   "amount": 5,
   *   "currency": "USD"
   * }
   * &lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Value formatted_value = 3;</code>
   */
  com.google.protobuf.ValueOrBuilder getFormattedValueOrBuilder();
}
