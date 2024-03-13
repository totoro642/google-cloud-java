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
// source: google/cloud/dialogflow/v2/validation_result.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public interface ValidationResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ValidationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Contains all validation errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ValidationError validation_errors = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.ValidationError> getValidationErrorsList();
  /**
   *
   *
   * <pre>
   * Contains all validation errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ValidationError validation_errors = 1;</code>
   */
  com.google.cloud.dialogflow.v2.ValidationError getValidationErrors(int index);
  /**
   *
   *
   * <pre>
   * Contains all validation errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ValidationError validation_errors = 1;</code>
   */
  int getValidationErrorsCount();
  /**
   *
   *
   * <pre>
   * Contains all validation errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ValidationError validation_errors = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.ValidationErrorOrBuilder>
      getValidationErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Contains all validation errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.ValidationError validation_errors = 1;</code>
   */
  com.google.cloud.dialogflow.v2.ValidationErrorOrBuilder getValidationErrorsOrBuilder(int index);
}
