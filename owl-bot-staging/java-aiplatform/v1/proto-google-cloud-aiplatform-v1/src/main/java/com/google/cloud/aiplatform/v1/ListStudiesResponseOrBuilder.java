// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/vizier_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ListStudiesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListStudiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Study> 
      getStudiesList();
  /**
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Study getStudies(int index);
  /**
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  int getStudiesCount();
  /**
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.StudyOrBuilder> 
      getStudiesOrBuilderList();
  /**
   * <pre>
   * The studies associated with the project.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Study studies = 1;</code>
   */
  com.google.cloud.aiplatform.v1.StudyOrBuilder getStudiesOrBuilder(
      int index);

  /**
   * <pre>
   * Passes this token as the `page_token` field of the request for a
   * subsequent call.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Passes this token as the `page_token` field of the request for a
   * subsequent call.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
