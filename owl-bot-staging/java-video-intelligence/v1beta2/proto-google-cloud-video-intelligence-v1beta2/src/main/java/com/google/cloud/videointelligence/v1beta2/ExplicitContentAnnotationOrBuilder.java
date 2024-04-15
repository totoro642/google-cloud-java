// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1beta2;

public interface ExplicitContentAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta2.ExplicitContentAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.ExplicitContentFrame frames = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame> 
      getFramesList();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.ExplicitContentFrame frames = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta2.ExplicitContentFrame getFrames(int index);
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.ExplicitContentFrame frames = 1;</code>
   */
  int getFramesCount();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.ExplicitContentFrame frames = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta2.ExplicitContentFrameOrBuilder> 
      getFramesOrBuilderList();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.ExplicitContentFrame frames = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta2.ExplicitContentFrameOrBuilder getFramesOrBuilder(
      int index);
}
