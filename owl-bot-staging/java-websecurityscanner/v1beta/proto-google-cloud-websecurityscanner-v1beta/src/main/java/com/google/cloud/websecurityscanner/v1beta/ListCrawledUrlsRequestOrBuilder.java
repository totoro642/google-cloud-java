// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1beta;

public interface ListCrawledUrlsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.ListCrawledUrlsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource name, which should be a scan run resource name in the
   * format
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource name, which should be a scan run resource name in the
   * format
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * A token identifying a page of results to be returned. This should be a
   * `next_page_token` value returned from a previous List request.
   * If unspecified, the first page of results is returned.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A token identifying a page of results to be returned. This should be a
   * `next_page_token` value returned from a previous List request.
   * If unspecified, the first page of results is returned.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The maximum number of CrawledUrls to return, can be limited by server.
   * If not specified or not positive, the implementation will select a
   * reasonable value.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();
}
