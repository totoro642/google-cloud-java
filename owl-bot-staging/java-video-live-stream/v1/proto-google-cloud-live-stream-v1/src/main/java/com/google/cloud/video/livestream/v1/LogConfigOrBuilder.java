// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.livestream.v1;

public interface LogConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.LogConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The severity level of platform logging for this resource.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
   * @return The enum numeric value on the wire for logSeverity.
   */
  int getLogSeverityValue();
  /**
   * <pre>
   * The severity level of platform logging for this resource.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.LogConfig.LogSeverity log_severity = 1;</code>
   * @return The logSeverity.
   */
  com.google.cloud.video.livestream.v1.LogConfig.LogSeverity getLogSeverity();
}
