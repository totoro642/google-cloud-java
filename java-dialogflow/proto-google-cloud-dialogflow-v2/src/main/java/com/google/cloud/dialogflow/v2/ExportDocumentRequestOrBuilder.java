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
// source: google/cloud/dialogflow/v2/document.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public interface ExportDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ExportDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the document to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the document to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Cloud Storage file path to export the document.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination gcs_destination = 2;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * Cloud Storage file path to export the document.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination gcs_destination = 2;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.dialogflow.v2.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * Cloud Storage file path to export the document.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsDestination gcs_destination = 2;</code>
   */
  com.google.cloud.dialogflow.v2.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * When enabled, export the full content of the document including empirical
   * probability.
   * </pre>
   *
   * <code>bool export_full_content = 3;</code>
   *
   * @return The exportFullContent.
   */
  boolean getExportFullContent();

  /**
   *
   *
   * <pre>
   * When enabled, export the smart messaging allowlist document for partial
   * update.
   * </pre>
   *
   * <code>bool smart_messaging_partial_update = 5;</code>
   *
   * @return The smartMessagingPartialUpdate.
   */
  boolean getSmartMessagingPartialUpdate();

  com.google.cloud.dialogflow.v2.ExportDocumentRequest.DestinationCase getDestinationCase();
}
