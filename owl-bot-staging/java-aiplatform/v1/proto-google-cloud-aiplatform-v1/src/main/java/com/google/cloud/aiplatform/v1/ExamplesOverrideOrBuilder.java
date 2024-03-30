// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/explanation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ExamplesOverrideOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExamplesOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of neighbors to return.
   * </pre>
   *
   * <code>int32 neighbor_count = 1;</code>
   * @return The neighborCount.
   */
  int getNeighborCount();

  /**
   * <pre>
   * The number of neighbors to return that have the same crowding tag.
   * </pre>
   *
   * <code>int32 crowding_count = 2;</code>
   * @return The crowdingCount.
   */
  int getCrowdingCount();

  /**
   * <pre>
   * Restrict the resulting nearest neighbors to respect these constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace restrictions = 3;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace> 
      getRestrictionsList();
  /**
   * <pre>
   * Restrict the resulting nearest neighbors to respect these constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace restrictions = 3;</code>
   */
  com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace getRestrictions(int index);
  /**
   * <pre>
   * Restrict the resulting nearest neighbors to respect these constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace restrictions = 3;</code>
   */
  int getRestrictionsCount();
  /**
   * <pre>
   * Restrict the resulting nearest neighbors to respect these constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace restrictions = 3;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespaceOrBuilder> 
      getRestrictionsOrBuilderList();
  /**
   * <pre>
   * Restrict the resulting nearest neighbors to respect these constraints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.ExamplesRestrictionsNamespace restrictions = 3;</code>
   */
  com.google.cloud.aiplatform.v1.ExamplesRestrictionsNamespaceOrBuilder getRestrictionsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, return the embeddings instead of neighbors.
   * </pre>
   *
   * <code>bool return_embeddings = 4;</code>
   * @return The returnEmbeddings.
   */
  boolean getReturnEmbeddings();

  /**
   * <pre>
   * The format of the data being provided with each call.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExamplesOverride.DataFormat data_format = 5;</code>
   * @return The enum numeric value on the wire for dataFormat.
   */
  int getDataFormatValue();
  /**
   * <pre>
   * The format of the data being provided with each call.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExamplesOverride.DataFormat data_format = 5;</code>
   * @return The dataFormat.
   */
  com.google.cloud.aiplatform.v1.ExamplesOverride.DataFormat getDataFormat();
}
