// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1p2beta1;

public interface LabelFrameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p2beta1.LabelFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();

  /**
   * <pre>
   * Confidence that the label is accurate. Range: [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   * @return The confidence.
   */
  float getConfidence();
}
