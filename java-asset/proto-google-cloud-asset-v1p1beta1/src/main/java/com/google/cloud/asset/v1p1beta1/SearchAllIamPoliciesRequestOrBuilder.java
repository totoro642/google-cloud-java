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
// source: google/cloud/asset/v1p1beta1/asset_service.proto

package com.google.cloud.asset.v1p1beta1;

public interface SearchAllIamPoliciesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The relative name of an asset. The search is limited to the
   * resources within the `scope`. The allowed value must be:
   * * Organization number (such as "organizations/123")
   * * Folder number (such as "folders/1234")
   * * Project number (such as "projects/12345")
   * * Project ID (such as "projects/abc")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Required. The relative name of an asset. The search is limited to the
   * resources within the `scope`. The allowed value must be:
   * * Organization number (such as "organizations/123")
   * * Folder number (such as "folders/1234")
   * * Project number (such as "projects/12345")
   * * Project ID (such as "projects/abc")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The query statement. Examples:
   * * "policy:myuser&#64;mydomain.com"
   * * "policy:(myuser&#64;mydomain.com viewer)"
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. The query statement. Examples:
   * * "policy:myuser&#64;mydomain.com"
   * * "policy:(myuser&#64;mydomain.com viewer)"
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. The page size for search result pagination. Page size is capped
   * at 500 even if a larger value is given. If set to zero, server will pick an
   * appropriate default. Returned results may be fewer than requested. When
   * this happens, there could be more results as long as `next_page_token` is
   * returned.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. If present, retrieve the next batch of results from the preceding
   * call to this method. `page_token` must be the value of `next_page_token`
   * from the previous response. The values of all other method parameters must
   * be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, retrieve the next batch of results from the preceding
   * call to this method. `page_token` must be the value of `next_page_token`
   * from the previous response. The values of all other method parameters must
   * be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
