// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1;

public interface ExplicitContentAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.ExplicitContentAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.ExplicitContentFrame> 
      getFramesList();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentFrame getFrames(int index);
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  int getFramesCount();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.ExplicitContentFrameOrBuilder> 
      getFramesOrBuilderList();
  /**
   * <pre>
   * All video frames where explicit content was detected.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.ExplicitContentFrame frames = 1;</code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentFrameOrBuilder getFramesOrBuilder(
      int index);

  /**
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
