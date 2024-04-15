// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1;

public interface LabelDetectionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.LabelDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * What labels should be detected with LABEL_DETECTION, in addition to
   * video-level labels or segment-level labels.
   * If unspecified, defaults to `SHOT_MODE`.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
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
   * <code>.google.cloud.videointelligence.v1.LabelDetectionMode label_detection_mode = 1;</code>
   * @return The labelDetectionMode.
   */
  com.google.cloud.videointelligence.v1.LabelDetectionMode getLabelDetectionMode();

  /**
   * <pre>
   * Whether the video has been shot from a stationary (i.e., non-moving)
   * camera. When set to true, might improve detection accuracy for moving
   * objects. Should be used with `SHOT_AND_FRAME_MODE` enabled.
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

  /**
   * <pre>
   * The confidence threshold we perform filtering on the labels from
   * frame-level detection. If not set, it is set to 0.4 by default. The valid
   * range for this threshold is [0.1, 0.9]. Any value set outside of this
   * range will be clipped.
   * Note: For best results, follow the default threshold. We will update
   * the default threshold everytime when we release a new model.
   * </pre>
   *
   * <code>float frame_confidence_threshold = 4;</code>
   * @return The frameConfidenceThreshold.
   */
  float getFrameConfidenceThreshold();

  /**
   * <pre>
   * The confidence threshold we perform filtering on the labels from
   * video-level and shot-level detections. If not set, it's set to 0.3 by
   * default. The valid range for this threshold is [0.1, 0.9]. Any value set
   * outside of this range will be clipped.
   * Note: For best results, follow the default threshold. We will update
   * the default threshold everytime when we release a new model.
   * </pre>
   *
   * <code>float video_confidence_threshold = 5;</code>
   * @return The videoConfidenceThreshold.
   */
  float getVideoConfidenceThreshold();
}
