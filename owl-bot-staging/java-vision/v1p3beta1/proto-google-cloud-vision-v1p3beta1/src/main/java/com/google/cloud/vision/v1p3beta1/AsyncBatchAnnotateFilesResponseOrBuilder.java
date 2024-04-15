// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p3beta1;

public interface AsyncBatchAnnotateFilesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.AsyncBatchAnnotateFilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponse> 
      getResponsesList();
  /**
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponse getResponses(int index);
  /**
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.AsyncAnnotateFileResponseOrBuilder getResponsesOrBuilder(
      int index);
}
