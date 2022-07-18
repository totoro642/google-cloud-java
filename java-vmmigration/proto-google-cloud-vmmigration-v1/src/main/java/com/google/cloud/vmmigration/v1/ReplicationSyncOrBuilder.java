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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface ReplicationSyncOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.ReplicationSync)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The most updated snapshot created time in the source that finished
   * replication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 1;</code>
   *
   * @return Whether the lastSyncTime field is set.
   */
  boolean hasLastSyncTime();
  /**
   *
   *
   * <pre>
   * The most updated snapshot created time in the source that finished
   * replication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 1;</code>
   *
   * @return The lastSyncTime.
   */
  com.google.protobuf.Timestamp getLastSyncTime();
  /**
   *
   *
   * <pre>
   * The most updated snapshot created time in the source that finished
   * replication.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_sync_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastSyncTimeOrBuilder();
}
