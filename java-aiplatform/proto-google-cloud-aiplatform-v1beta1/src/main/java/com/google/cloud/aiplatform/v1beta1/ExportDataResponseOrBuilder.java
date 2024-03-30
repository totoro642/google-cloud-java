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
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ExportDataResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExportDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * All of the files that are exported in this export operation. For custom
   * code training export, only three (training, validation and test)
   * Cloud Storage paths in wildcard format are populated
   * (for example, gs://.../training-*).
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   *
   * @return A list containing the exportedFiles.
   */
  java.util.List<java.lang.String> getExportedFilesList();
  /**
   *
   *
   * <pre>
   * All of the files that are exported in this export operation. For custom
   * code training export, only three (training, validation and test)
   * Cloud Storage paths in wildcard format are populated
   * (for example, gs://.../training-*).
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   *
   * @return The count of exportedFiles.
   */
  int getExportedFilesCount();
  /**
   *
   *
   * <pre>
   * All of the files that are exported in this export operation. For custom
   * code training export, only three (training, validation and test)
   * Cloud Storage paths in wildcard format are populated
   * (for example, gs://.../training-*).
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The exportedFiles at the given index.
   */
  java.lang.String getExportedFiles(int index);
  /**
   *
   *
   * <pre>
   * All of the files that are exported in this export operation. For custom
   * code training export, only three (training, validation and test)
   * Cloud Storage paths in wildcard format are populated
   * (for example, gs://.../training-*).
   * </pre>
   *
   * <code>repeated string exported_files = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exportedFiles at the given index.
   */
  com.google.protobuf.ByteString getExportedFilesBytes(int index);
}
