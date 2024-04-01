// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ImportRagFilesOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ImportRagFilesOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadata getGenericMetadata();
  /**
   * <pre>
   * The operation generic information.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder();

  /**
   * <pre>
   * The resource ID of RagCorpus that this operation is executed on.
   * </pre>
   *
   * <code>int64 rag_corpus_id = 2;</code>
   * @return The ragCorpusId.
   */
  long getRagCorpusId();
}
