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
// source: google/cloud/discoveryengine/v1alpha/site_search_engine.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public interface SiteVerificationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.SiteVerificationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Site verification state indicating the ownership and validity.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for siteVerificationState.
   */
  int getSiteVerificationStateValue();
  /**
   *
   *
   * <pre>
   * Site verification state indicating the ownership and validity.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState site_verification_state = 1;
   * </code>
   *
   * @return The siteVerificationState.
   */
  com.google.cloud.discoveryengine.v1alpha.SiteVerificationInfo.SiteVerificationState
      getSiteVerificationState();

  /**
   *
   *
   * <pre>
   * Latest site verification time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   *
   * @return Whether the verifyTime field is set.
   */
  boolean hasVerifyTime();
  /**
   *
   *
   * <pre>
   * Latest site verification time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   *
   * @return The verifyTime.
   */
  com.google.protobuf.Timestamp getVerifyTime();
  /**
   *
   *
   * <pre>
   * Latest site verification time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getVerifyTimeOrBuilder();
}
