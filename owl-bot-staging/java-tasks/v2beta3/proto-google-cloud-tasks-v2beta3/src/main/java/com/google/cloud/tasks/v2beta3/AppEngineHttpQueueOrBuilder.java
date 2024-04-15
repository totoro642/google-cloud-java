// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/target.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tasks.v2beta3;

public interface AppEngineHttpQueueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.AppEngineHttpQueue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Overrides for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta3.AppEngineHttpRequest.app_engine_routing].
   *
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta3.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.AppEngineRouting app_engine_routing_override = 1;</code>
   * @return Whether the appEngineRoutingOverride field is set.
   */
  boolean hasAppEngineRoutingOverride();
  /**
   * <pre>
   * Overrides for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta3.AppEngineHttpRequest.app_engine_routing].
   *
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta3.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.AppEngineRouting app_engine_routing_override = 1;</code>
   * @return The appEngineRoutingOverride.
   */
  com.google.cloud.tasks.v2beta3.AppEngineRouting getAppEngineRoutingOverride();
  /**
   * <pre>
   * Overrides for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta3.AppEngineHttpRequest.app_engine_routing].
   *
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta3.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.AppEngineRouting app_engine_routing_override = 1;</code>
   */
  com.google.cloud.tasks.v2beta3.AppEngineRoutingOrBuilder getAppEngineRoutingOverrideOrBuilder();
}
