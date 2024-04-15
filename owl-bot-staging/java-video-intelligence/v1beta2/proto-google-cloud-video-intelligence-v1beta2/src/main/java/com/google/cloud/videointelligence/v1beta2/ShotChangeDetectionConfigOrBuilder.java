// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1beta2;

public interface ShotChangeDetectionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta2.ShotChangeDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Model to use for shot change detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Model to use for shot change detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();
}
