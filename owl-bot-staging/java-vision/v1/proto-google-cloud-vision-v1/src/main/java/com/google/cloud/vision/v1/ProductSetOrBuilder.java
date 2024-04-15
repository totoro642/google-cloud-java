// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public interface ProductSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.ProductSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the ProductSet.
   *
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   *
   * This field is ignored when creating a ProductSet.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the ProductSet.
   *
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
   *
   * This field is ignored when creating a ProductSet.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The user-provided name for this ProductSet. Must not be empty. Must be at
   * most 4096 characters long.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The user-provided name for this ProductSet. Must not be empty. Must be at
   * most 4096 characters long.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. The time at which this ProductSet was last indexed. Query
   * results will reflect all updates before this time. If this ProductSet has
   * never been indexed, this timestamp is the default value
   * "1970-01-01T00:00:00Z".
   *
   * This field is ignored when creating a ProductSet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp index_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the indexTime field is set.
   */
  boolean hasIndexTime();
  /**
   * <pre>
   * Output only. The time at which this ProductSet was last indexed. Query
   * results will reflect all updates before this time. If this ProductSet has
   * never been indexed, this timestamp is the default value
   * "1970-01-01T00:00:00Z".
   *
   * This field is ignored when creating a ProductSet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp index_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The indexTime.
   */
  com.google.protobuf.Timestamp getIndexTime();
  /**
   * <pre>
   * Output only. The time at which this ProductSet was last indexed. Query
   * results will reflect all updates before this time. If this ProductSet has
   * never been indexed, this timestamp is the default value
   * "1970-01-01T00:00:00Z".
   *
   * This field is ignored when creating a ProductSet.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp index_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getIndexTimeOrBuilder();

  /**
   * <pre>
   * Output only. If there was an error with indexing the product set, the field
   * is populated.
   *
   * This field is ignored when creating a ProductSet.
   * </pre>
   *
   * <code>.google.rpc.Status index_error = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the indexError field is set.
   */
  boolean hasIndexError();
  /**
   * <pre>
   * Output only. If there was an error with indexing the product set, the field
   * is populated.
   *
   * This field is ignored when creating a ProductSet.
   * </pre>
   *
   * <code>.google.rpc.Status index_error = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The indexError.
   */
  com.google.rpc.Status getIndexError();
  /**
   * <pre>
   * Output only. If there was an error with indexing the product set, the field
   * is populated.
   *
   * This field is ignored when creating a ProductSet.
   * </pre>
   *
   * <code>.google.rpc.Status index_error = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getIndexErrorOrBuilder();
}
