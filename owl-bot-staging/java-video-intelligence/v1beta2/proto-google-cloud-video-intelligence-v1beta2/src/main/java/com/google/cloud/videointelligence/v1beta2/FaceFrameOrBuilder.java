// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1beta2;

public interface FaceFrameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta2.FaceFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.NormalizedBoundingBox normalized_bounding_boxes = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox> 
      getNormalizedBoundingBoxesList();
  /**
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.NormalizedBoundingBox normalized_bounding_boxes = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBox getNormalizedBoundingBoxes(int index);
  /**
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.NormalizedBoundingBox normalized_bounding_boxes = 1;</code>
   */
  int getNormalizedBoundingBoxesCount();
  /**
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.NormalizedBoundingBox normalized_bounding_boxes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBoxOrBuilder> 
      getNormalizedBoundingBoxesOrBuilderList();
  /**
   * <pre>
   * Normalized Bounding boxes in a frame.
   * There can be more than one boxes if the same face is detected in multiple
   * locations within the current frame.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.NormalizedBoundingBox normalized_bounding_boxes = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta2.NormalizedBoundingBoxOrBuilder getNormalizedBoundingBoxesOrBuilder(
      int index);

  /**
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   * @return The timeOffset.
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   * <pre>
   * Time-offset, relative to the beginning of the video,
   * corresponding to the video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();
}
