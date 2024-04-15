// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public interface BatchAnnotateImagesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.BatchAnnotateImagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.vision.v1.AnnotateImageRequest> 
      getRequestsList();
  /**
   * <pre>
   * Required. Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vision.v1.AnnotateImageRequest getRequests(int index);
  /**
   * <pre>
   * Required. Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getRequestsCount();
  /**
   * <pre>
   * Required. Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.AnnotateImageRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <pre>
   * Required. Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateImageRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vision.v1.AnnotateImageRequestOrBuilder getRequestsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Target project and location to make a call.
   *
   * Format: `projects/{project-id}/locations/{location-id}`.
   *
   * If no parent is specified, a region will be chosen automatically.
   *
   * Supported location-ids:
   *     `us`: USA country only,
   *     `asia`: East asia areas, like Japan, Taiwan,
   *     `eu`: The European Union.
   *
   * Example: `projects/project-A/locations/eu`.
   * </pre>
   *
   * <code>string parent = 4;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Optional. Target project and location to make a call.
   *
   * Format: `projects/{project-id}/locations/{location-id}`.
   *
   * If no parent is specified, a region will be chosen automatically.
   *
   * Supported location-ids:
   *     `us`: USA country only,
   *     `asia`: East asia areas, like Japan, Taiwan,
   *     `eu`: The European Union.
   *
   * Example: `projects/project-A/locations/eu`.
   * </pre>
   *
   * <code>string parent = 4;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
