// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public interface AnnotateFileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.AnnotateFileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.InputConfig input_config = 1;</code>
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.InputConfig input_config = 1;</code>
   * @return The inputConfig.
   */
  com.google.cloud.vision.v1.InputConfig getInputConfig();
  /**
   * <pre>
   * Information about the file for which this response is generated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.InputConfig input_config = 1;</code>
   */
  com.google.cloud.vision.v1.InputConfigOrBuilder getInputConfigOrBuilder();

  /**
   * <pre>
   * Individual responses to images found within the file. This field will be
   * empty if the `error` field is set.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  java.util.List<com.google.cloud.vision.v1.AnnotateImageResponse> 
      getResponsesList();
  /**
   * <pre>
   * Individual responses to images found within the file. This field will be
   * empty if the `error` field is set.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  com.google.cloud.vision.v1.AnnotateImageResponse getResponses(int index);
  /**
   * <pre>
   * Individual responses to images found within the file. This field will be
   * empty if the `error` field is set.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * Individual responses to images found within the file. This field will be
   * empty if the `error` field is set.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.AnnotateImageResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <pre>
   * Individual responses to images found within the file. This field will be
   * empty if the `error` field is set.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageResponse responses = 2;</code>
   */
  com.google.cloud.vision.v1.AnnotateImageResponseOrBuilder getResponsesOrBuilder(
      int index);

  /**
   * <pre>
   * This field gives the total number of pages in the file.
   * </pre>
   *
   * <code>int32 total_pages = 3;</code>
   * @return The totalPages.
   */
  int getTotalPages();

  /**
   * <pre>
   * If set, represents the error message for the failed request. The
   * `responses` field will not be set in this case.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * If set, represents the error message for the failed request. The
   * `responses` field will not be set in this case.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * If set, represents the error message for the failed request. The
   * `responses` field will not be set in this case.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}
