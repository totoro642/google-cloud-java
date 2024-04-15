// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p3beta1;

public interface ImportProductSetsInputConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsGcsSource gcs_source = 1;</code>
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsGcsSource gcs_source = 1;</code>
   * @return The gcsSource.
   */
  com.google.cloud.vision.v1p3beta1.ImportProductSetsGcsSource getGcsSource();
  /**
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ImportProductSetsGcsSource gcs_source = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.ImportProductSetsGcsSourceOrBuilder getGcsSourceOrBuilder();

  com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig.SourceCase getSourceCase();
}
