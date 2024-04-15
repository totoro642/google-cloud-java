// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p3beta1;

public interface AsyncAnnotateFileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The output location and metadata from AsyncAnnotateFileRequest.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.OutputConfig output_config = 1;</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * The output location and metadata from AsyncAnnotateFileRequest.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.OutputConfig output_config = 1;</code>
   * @return The outputConfig.
   */
  com.google.cloud.vision.v1p3beta1.OutputConfig getOutputConfig();
  /**
   * <pre>
   * The output location and metadata from AsyncAnnotateFileRequest.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.OutputConfig output_config = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.OutputConfigOrBuilder getOutputConfigOrBuilder();
}
