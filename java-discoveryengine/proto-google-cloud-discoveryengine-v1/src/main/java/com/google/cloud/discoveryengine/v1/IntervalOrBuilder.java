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
// source: google/cloud/discoveryengine/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1;

public interface IntervalOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.Interval)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Inclusive lower bound.
   * </pre>
   *
   * <code>double minimum = 1;</code>
   *
   * @return Whether the minimum field is set.
   */
  boolean hasMinimum();
  /**
   *
   *
   * <pre>
   * Inclusive lower bound.
   * </pre>
   *
   * <code>double minimum = 1;</code>
   *
   * @return The minimum.
   */
  double getMinimum();

  /**
   *
   *
   * <pre>
   * Exclusive lower bound.
   * </pre>
   *
   * <code>double exclusive_minimum = 2;</code>
   *
   * @return Whether the exclusiveMinimum field is set.
   */
  boolean hasExclusiveMinimum();
  /**
   *
   *
   * <pre>
   * Exclusive lower bound.
   * </pre>
   *
   * <code>double exclusive_minimum = 2;</code>
   *
   * @return The exclusiveMinimum.
   */
  double getExclusiveMinimum();

  /**
   *
   *
   * <pre>
   * Inclusive upper bound.
   * </pre>
   *
   * <code>double maximum = 3;</code>
   *
   * @return Whether the maximum field is set.
   */
  boolean hasMaximum();
  /**
   *
   *
   * <pre>
   * Inclusive upper bound.
   * </pre>
   *
   * <code>double maximum = 3;</code>
   *
   * @return The maximum.
   */
  double getMaximum();

  /**
   *
   *
   * <pre>
   * Exclusive upper bound.
   * </pre>
   *
   * <code>double exclusive_maximum = 4;</code>
   *
   * @return Whether the exclusiveMaximum field is set.
   */
  boolean hasExclusiveMaximum();
  /**
   *
   *
   * <pre>
   * Exclusive upper bound.
   * </pre>
   *
   * <code>double exclusive_maximum = 4;</code>
   *
   * @return The exclusiveMaximum.
   */
  double getExclusiveMaximum();

  com.google.cloud.discoveryengine.v1.Interval.MinCase getMinCase();

  com.google.cloud.discoveryengine.v1.Interval.MaxCase getMaxCase();
}
