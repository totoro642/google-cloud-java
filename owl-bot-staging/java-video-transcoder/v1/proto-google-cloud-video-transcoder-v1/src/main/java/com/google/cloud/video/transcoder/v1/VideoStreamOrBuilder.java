// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.transcoder.v1;

public interface VideoStreamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.VideoStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * H264 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.H264CodecSettings h264 = 1;</code>
   * @return Whether the h264 field is set.
   */
  boolean hasH264();
  /**
   * <pre>
   * H264 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.H264CodecSettings h264 = 1;</code>
   * @return The h264.
   */
  com.google.cloud.video.transcoder.v1.VideoStream.H264CodecSettings getH264();
  /**
   * <pre>
   * H264 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.H264CodecSettings h264 = 1;</code>
   */
  com.google.cloud.video.transcoder.v1.VideoStream.H264CodecSettingsOrBuilder getH264OrBuilder();

  /**
   * <pre>
   * H265 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.H265CodecSettings h265 = 2;</code>
   * @return Whether the h265 field is set.
   */
  boolean hasH265();
  /**
   * <pre>
   * H265 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.H265CodecSettings h265 = 2;</code>
   * @return The h265.
   */
  com.google.cloud.video.transcoder.v1.VideoStream.H265CodecSettings getH265();
  /**
   * <pre>
   * H265 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.H265CodecSettings h265 = 2;</code>
   */
  com.google.cloud.video.transcoder.v1.VideoStream.H265CodecSettingsOrBuilder getH265OrBuilder();

  /**
   * <pre>
   * VP9 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.Vp9CodecSettings vp9 = 3;</code>
   * @return Whether the vp9 field is set.
   */
  boolean hasVp9();
  /**
   * <pre>
   * VP9 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.Vp9CodecSettings vp9 = 3;</code>
   * @return The vp9.
   */
  com.google.cloud.video.transcoder.v1.VideoStream.Vp9CodecSettings getVp9();
  /**
   * <pre>
   * VP9 codec settings.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.VideoStream.Vp9CodecSettings vp9 = 3;</code>
   */
  com.google.cloud.video.transcoder.v1.VideoStream.Vp9CodecSettingsOrBuilder getVp9OrBuilder();

  com.google.cloud.video.transcoder.v1.VideoStream.CodecSettingsCase getCodecSettingsCase();
}
