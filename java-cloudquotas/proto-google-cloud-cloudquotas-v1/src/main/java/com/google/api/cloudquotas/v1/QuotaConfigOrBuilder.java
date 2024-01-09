/*
 * Copyright 2023 Google LLC
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
// source: google/api/cloudquotas/v1/resources.proto

package com.google.api.cloudquotas.v1;

public interface QuotaConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1.QuotaConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The preferred value. Must be greater than or equal to -1. If set
   * to -1, it means the value is "unlimited".
   * </pre>
   *
   * <code>int64 preferred_value = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The preferredValue.
   */
  long getPreferredValue();

  /**
   *
   *
   * <pre>
   * Output only. Optional details about the state of this quota preference.
   * </pre>
   *
   * <code>string state_detail = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateDetail.
   */
  java.lang.String getStateDetail();
  /**
   *
   *
   * <pre>
   * Output only. Optional details about the state of this quota preference.
   * </pre>
   *
   * <code>string state_detail = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateDetail.
   */
  com.google.protobuf.ByteString getStateDetailBytes();

  /**
   *
   *
   * <pre>
   * Output only. Granted quota value.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int64Value granted_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the grantedValue field is set.
   */
  boolean hasGrantedValue();
  /**
   *
   *
   * <pre>
   * Output only. Granted quota value.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int64Value granted_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The grantedValue.
   */
  com.google.protobuf.Int64Value getGrantedValue();
  /**
   *
   *
   * <pre>
   * Output only. Granted quota value.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int64Value granted_value = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.Int64ValueOrBuilder getGrantedValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The trace id that the Google Cloud uses to provision the
   * requested quota. This trace id may be used by the client to contact Cloud
   * support to track the state of a quota preference request. The trace id is
   * only produced for increase requests and is unique for each request. The
   * quota decrease requests do not have a trace id.
   * </pre>
   *
   * <code>string trace_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The traceId.
   */
  java.lang.String getTraceId();
  /**
   *
   *
   * <pre>
   * Output only. The trace id that the Google Cloud uses to provision the
   * requested quota. This trace id may be used by the client to contact Cloud
   * support to track the state of a quota preference request. The trace id is
   * only produced for increase requests and is unique for each request. The
   * quota decrease requests do not have a trace id.
   * </pre>
   *
   * <code>string trace_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for traceId.
   */
  com.google.protobuf.ByteString getTraceIdBytes();

  /**
   *
   *
   * <pre>
   * The annotations map for clients to store small amounts of arbitrary data.
   * Do not put PII or other sensitive information here.
   * See https://google.aip.dev/128#annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * The annotations map for clients to store small amounts of arbitrary data.
   * Do not put PII or other sensitive information here.
   * See https://google.aip.dev/128#annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * The annotations map for clients to store small amounts of arbitrary data.
   * Do not put PII or other sensitive information here.
   * See https://google.aip.dev/128#annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * The annotations map for clients to store small amounts of arbitrary data.
   * Do not put PII or other sensitive information here.
   * See https://google.aip.dev/128#annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The annotations map for clients to store small amounts of arbitrary data.
   * Do not put PII or other sensitive information here.
   * See https://google.aip.dev/128#annotations
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The origin of the quota preference request.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaConfig.Origin request_origin = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for requestOrigin.
   */
  int getRequestOriginValue();
  /**
   *
   *
   * <pre>
   * Output only. The origin of the quota preference request.
   * </pre>
   *
   * <code>
   * .google.api.cloudquotas.v1.QuotaConfig.Origin request_origin = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The requestOrigin.
   */
  com.google.api.cloudquotas.v1.QuotaConfig.Origin getRequestOrigin();
}
