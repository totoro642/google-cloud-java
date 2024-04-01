// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface MutateDeployedIndexResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.MutateDeployedIndexResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The DeployedIndex that had been updated in the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
   * @return Whether the deployedIndex field is set.
   */
  boolean hasDeployedIndex();
  /**
   * <pre>
   * The DeployedIndex that had been updated in the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
   * @return The deployedIndex.
   */
  com.google.cloud.aiplatform.v1.DeployedIndex getDeployedIndex();
  /**
   * <pre>
   * The DeployedIndex that had been updated in the IndexEndpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.DeployedIndex deployed_index = 1;</code>
   */
  com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder getDeployedIndexOrBuilder();
}
