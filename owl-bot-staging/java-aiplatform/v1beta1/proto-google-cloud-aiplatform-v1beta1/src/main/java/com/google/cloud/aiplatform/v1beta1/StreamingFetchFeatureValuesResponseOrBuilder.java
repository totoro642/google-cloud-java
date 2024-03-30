// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface StreamingFetchFeatureValuesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.StreamingFetchFeatureValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Response status.
   * If OK, then
   * [StreamingFetchFeatureValuesResponse.data][google.cloud.aiplatform.v1beta1.StreamingFetchFeatureValuesResponse.data]
   * will be populated. Otherwise
   * [StreamingFetchFeatureValuesResponse.data_keys_with_error][google.cloud.aiplatform.v1beta1.StreamingFetchFeatureValuesResponse.data_keys_with_error]
   * will be populated with the appropriate data keys. The error only applies to
   * the listed data keys - the stream will remain open for further
   * [FeatureOnlineStoreService.StreamingFetchFeatureValuesRequest][] requests.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Response status.
   * If OK, then
   * [StreamingFetchFeatureValuesResponse.data][google.cloud.aiplatform.v1beta1.StreamingFetchFeatureValuesResponse.data]
   * will be populated. Otherwise
   * [StreamingFetchFeatureValuesResponse.data_keys_with_error][google.cloud.aiplatform.v1beta1.StreamingFetchFeatureValuesResponse.data_keys_with_error]
   * will be populated with the appropriate data keys. The error only applies to
   * the listed data keys - the stream will remain open for further
   * [FeatureOnlineStoreService.StreamingFetchFeatureValuesRequest][] requests.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * Response status.
   * If OK, then
   * [StreamingFetchFeatureValuesResponse.data][google.cloud.aiplatform.v1beta1.StreamingFetchFeatureValuesResponse.data]
   * will be populated. Otherwise
   * [StreamingFetchFeatureValuesResponse.data_keys_with_error][google.cloud.aiplatform.v1beta1.StreamingFetchFeatureValuesResponse.data_keys_with_error]
   * will be populated with the appropriate data keys. The error only applies to
   * the listed data keys - the stream will remain open for further
   * [FeatureOnlineStoreService.StreamingFetchFeatureValuesRequest][] requests.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse data = 2;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse> 
      getDataList();
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse data = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse getData(int index);
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse data = 2;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponseOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponse data = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FetchFeatureValuesResponseOrBuilder getDataOrBuilder(
      int index);

  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys_with_error = 3;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FeatureViewDataKey> 
      getDataKeysWithErrorList();
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys_with_error = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKey getDataKeysWithError(int index);
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys_with_error = 3;</code>
   */
  int getDataKeysWithErrorCount();
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys_with_error = 3;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureViewDataKeyOrBuilder> 
      getDataKeysWithErrorOrBuilderList();
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys_with_error = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKeyOrBuilder getDataKeysWithErrorOrBuilder(
      int index);
}
