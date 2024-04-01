// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ListRagFilesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListRagFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the RagCorpus from which to list the
   * RagFiles. Format:
   * `projects/{project}/locations/{location}/ragCorpora/{rag_corpus}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the RagCorpus from which to list the
   * RagFiles. Format:
   * `projects/{project}/locations/{location}/ragCorpora/{rag_corpus}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListRagFilesResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListRagFilesResponse.next_page_token]
   * of the previous
   * [VertexRagDataService.ListRagFiles][google.cloud.aiplatform.v1beta1.VertexRagDataService.ListRagFiles]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListRagFilesResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListRagFilesResponse.next_page_token]
   * of the previous
   * [VertexRagDataService.ListRagFiles][google.cloud.aiplatform.v1beta1.VertexRagDataService.ListRagFiles]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
