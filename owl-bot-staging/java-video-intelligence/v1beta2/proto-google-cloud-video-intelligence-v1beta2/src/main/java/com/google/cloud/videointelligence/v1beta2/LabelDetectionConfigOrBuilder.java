// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1beta2;

public interface LabelDetectionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta2.LabelDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * What labels should be detected with LABEL_DETECTION, in addition to
   * video-level labels or segment-level labels.
   * If unspecified, defaults to `SHOT_MODE`.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.LabelDetectionMode label_detection_mode = 1;</code>
   * @return The enum numeric value on the wire for labelDetectionMode.
   */
  int getLabelDetectionModeValue();
  /**
   * <pre>
   * What labels should be detected with LABEL_DETECTION, in addition to
   * video-level labels or segment-level labels.
   * If unspecified, defaults to `SHOT_MODE`.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.LabelDetectionMode label_detection_mode = 1;</code>
   * @return The labelDetectionMode.
   */
  com.google.cloud.videointelligence.v1beta2.LabelDetectionMode getLabelDetectionMode();

  /**
   * <pre>
   * Whether the video has been shot from a stationary (i.e. non-moving) camera.
   * When set to true, might improve detection accuracy for moving objects.
   * Should be used with `SHOT_AND_FRAME_MODE` enabled.
   * </pre>
   *
   * <code>bool stationary_camera = 2;</code>
   * @return The stationaryCamera.
   */
  boolean getStationaryCamera();

  /**
   * <pre>
   * Model to use for label detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Model to use for label detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();
}
