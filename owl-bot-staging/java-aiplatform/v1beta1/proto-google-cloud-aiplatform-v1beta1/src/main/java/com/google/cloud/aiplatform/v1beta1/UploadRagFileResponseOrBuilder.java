// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface UploadRagFileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UploadRagFileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   * @return Whether the ragFile field is set.
   */
  boolean hasRagFile();
  /**
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   * @return The ragFile.
   */
  com.google.cloud.aiplatform.v1beta1.RagFile getRagFile();
  /**
   * <pre>
   * The RagFile that had been uploaded into the RagCorpus.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagFile rag_file = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder getRagFileOrBuilder();

  /**
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * The error that occurred while processing the RagFile.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  com.google.cloud.aiplatform.v1beta1.UploadRagFileResponse.ResultCase getResultCase();
}
