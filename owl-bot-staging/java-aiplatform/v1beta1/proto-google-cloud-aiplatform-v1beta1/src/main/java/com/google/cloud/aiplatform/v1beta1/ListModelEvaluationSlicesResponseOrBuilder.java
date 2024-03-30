// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ListModelEvaluationSlicesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListModelEvaluationSlicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice> 
      getModelEvaluationSlicesList();
  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice getModelEvaluationSlices(int index);
  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 1;</code>
   */
  int getModelEvaluationSlicesCount();
  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelEvaluationSliceOrBuilder> 
      getModelEvaluationSlicesOrBuilderList();
  /**
   * <pre>
   * List of ModelEvaluations in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluationSliceOrBuilder getModelEvaluationSlicesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListModelEvaluationSlicesRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelEvaluationSlicesRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListModelEvaluationSlicesRequest.page_token][google.cloud.aiplatform.v1beta1.ListModelEvaluationSlicesRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
