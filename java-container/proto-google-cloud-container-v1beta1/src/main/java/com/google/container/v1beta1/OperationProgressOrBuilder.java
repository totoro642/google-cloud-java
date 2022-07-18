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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface OperationProgressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.OperationProgress)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A non-parameterized string describing an operation stage.
   * Unset for single-stage operations.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * A non-parameterized string describing an operation stage.
   * Unset for single-stage operations.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Status of an operation stage.
   * Unset for single-stage operations.
   * </pre>
   *
   * <code>.google.container.v1beta1.Operation.Status status = 2;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Status of an operation stage.
   * Unset for single-stage operations.
   * </pre>
   *
   * <code>.google.container.v1beta1.Operation.Status status = 2;</code>
   *
   * @return The status.
   */
  com.google.container.v1beta1.Operation.Status getStatus();

  /**
   *
   *
   * <pre>
   * Progress metric bundle, for example:
   *   metrics: [{name: "nodes done",     int_value: 15},
   *             {name: "nodes total",    int_value: 32}]
   * or
   *   metrics: [{name: "progress",       double_value: 0.56},
   *             {name: "progress scale", double_value: 1.0}]
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress.Metric metrics = 3;</code>
   */
  java.util.List<com.google.container.v1beta1.OperationProgress.Metric> getMetricsList();
  /**
   *
   *
   * <pre>
   * Progress metric bundle, for example:
   *   metrics: [{name: "nodes done",     int_value: 15},
   *             {name: "nodes total",    int_value: 32}]
   * or
   *   metrics: [{name: "progress",       double_value: 0.56},
   *             {name: "progress scale", double_value: 1.0}]
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress.Metric metrics = 3;</code>
   */
  com.google.container.v1beta1.OperationProgress.Metric getMetrics(int index);
  /**
   *
   *
   * <pre>
   * Progress metric bundle, for example:
   *   metrics: [{name: "nodes done",     int_value: 15},
   *             {name: "nodes total",    int_value: 32}]
   * or
   *   metrics: [{name: "progress",       double_value: 0.56},
   *             {name: "progress scale", double_value: 1.0}]
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress.Metric metrics = 3;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * Progress metric bundle, for example:
   *   metrics: [{name: "nodes done",     int_value: 15},
   *             {name: "nodes total",    int_value: 32}]
   * or
   *   metrics: [{name: "progress",       double_value: 0.56},
   *             {name: "progress scale", double_value: 1.0}]
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress.Metric metrics = 3;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.OperationProgress.MetricOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Progress metric bundle, for example:
   *   metrics: [{name: "nodes done",     int_value: 15},
   *             {name: "nodes total",    int_value: 32}]
   * or
   *   metrics: [{name: "progress",       double_value: 0.56},
   *             {name: "progress scale", double_value: 1.0}]
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress.Metric metrics = 3;</code>
   */
  com.google.container.v1beta1.OperationProgress.MetricOrBuilder getMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Substages of an operation or a stage.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress stages = 4;</code>
   */
  java.util.List<com.google.container.v1beta1.OperationProgress> getStagesList();
  /**
   *
   *
   * <pre>
   * Substages of an operation or a stage.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress stages = 4;</code>
   */
  com.google.container.v1beta1.OperationProgress getStages(int index);
  /**
   *
   *
   * <pre>
   * Substages of an operation or a stage.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress stages = 4;</code>
   */
  int getStagesCount();
  /**
   *
   *
   * <pre>
   * Substages of an operation or a stage.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress stages = 4;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.OperationProgressOrBuilder>
      getStagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Substages of an operation or a stage.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.OperationProgress stages = 4;</code>
   */
  com.google.container.v1beta1.OperationProgressOrBuilder getStagesOrBuilder(int index);
}
