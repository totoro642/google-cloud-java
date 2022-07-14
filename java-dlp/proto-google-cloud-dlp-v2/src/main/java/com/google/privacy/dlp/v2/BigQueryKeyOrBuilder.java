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
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

public interface BigQueryKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.BigQueryKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
   *
   * @return Whether the tableReference field is set.
   */
  boolean hasTableReference();
  /**
   *
   *
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
   *
   * @return The tableReference.
   */
  com.google.privacy.dlp.v2.BigQueryTable getTableReference();
  /**
   *
   *
   * <pre>
   * Complete BigQuery table reference.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
   */
  com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableReferenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Row number inferred at the time the table was scanned. This value is
   * nondeterministic, cannot be queried, and may be null for inspection
   * jobs. To locate findings within a table, specify
   * `inspect_job.storage_config.big_query_options.identifying_fields` in
   * `CreateDlpJobRequest`.
   * </pre>
   *
   * <code>int64 row_number = 2;</code>
   *
   * @return The rowNumber.
   */
  long getRowNumber();
}
