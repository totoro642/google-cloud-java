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
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1;

public interface UpdateDomainRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedidentities.v1.UpdateDomainRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in this
   * field. The elements of the repeated paths field may only include
   * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
   *  * `labels`
   *  * `locations`
   *  * `authorized_networks`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in this
   * field. The elements of the repeated paths field may only include
   * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
   *  * `labels`
   *  * `locations`
   *  * `authorized_networks`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in this
   * field. The elements of the repeated paths field may only include
   * fields from [Domain][google.cloud.managedidentities.v1.Domain]:
   *  * `labels`
   *  * `locations`
   *  * `authorized_networks`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Domain message with updated fields. Only supported fields specified in
   * update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the domain field is set.
   */
  boolean hasDomain();
  /**
   *
   *
   * <pre>
   * Required. Domain message with updated fields. Only supported fields specified in
   * update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The domain.
   */
  com.google.cloud.managedidentities.v1.Domain getDomain();
  /**
   *
   *
   * <pre>
   * Required. Domain message with updated fields. Only supported fields specified in
   * update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.managedidentities.v1.DomainOrBuilder getDomainOrBuilder();
}
