// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p3beta1;

public interface UpdateProductRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.UpdateProductRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Product resource which replaces the one on the server.
   * product.name is immutable.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the product field is set.
   */
  boolean hasProduct();
  /**
   * <pre>
   * Required. The Product resource which replaces the one on the server.
   * product.name is immutable.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The product.
   */
  com.google.cloud.vision.v1p3beta1.Product getProduct();
  /**
   * <pre>
   * Required. The Product resource which replaces the one on the server.
   * product.name is immutable.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.Product product = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vision.v1p3beta1.ProductOrBuilder getProductOrBuilder();

  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
   * to update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask paths include `product_labels`, `display_name`, and
   * `description`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
   * to update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask paths include `product_labels`, `display_name`, and
   * `description`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields
   * to update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask paths include `product_labels`, `display_name`, and
   * `description`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
