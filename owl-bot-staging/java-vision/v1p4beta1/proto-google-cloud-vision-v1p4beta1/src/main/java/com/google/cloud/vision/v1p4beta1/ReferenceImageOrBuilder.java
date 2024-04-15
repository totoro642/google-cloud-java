// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p4beta1;

public interface ReferenceImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.ReferenceImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the reference image.
   *
   * Format is:
   *
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`.
   *
   * This field is ignored when creating a reference image.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the reference image.
   *
   * Format is:
   *
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`.
   *
   * This field is ignored when creating a reference image.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The Google Cloud Storage URI of the reference image.
   *
   * The URI must start with `gs://`.
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Required. The Google Cloud Storage URI of the reference image.
   *
   * The URI must start with `gs://`.
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * Optional. Bounding polygons around the areas of interest in the reference
   * image. If this field is empty, the system will try to detect regions of
   * interest. At most 10 bounding polygons will be used.
   *
   * The provided shape is converted into a non-rotated rectangle. Once
   * converted, the small edge of the rectangle must be greater than or equal
   * to 300 pixels. The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5
   * is not).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.BoundingPoly bounding_polys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.vision.v1p4beta1.BoundingPoly> 
      getBoundingPolysList();
  /**
   * <pre>
   * Optional. Bounding polygons around the areas of interest in the reference
   * image. If this field is empty, the system will try to detect regions of
   * interest. At most 10 bounding polygons will be used.
   *
   * The provided shape is converted into a non-rotated rectangle. Once
   * converted, the small edge of the rectangle must be greater than or equal
   * to 300 pixels. The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5
   * is not).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.BoundingPoly bounding_polys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.vision.v1p4beta1.BoundingPoly getBoundingPolys(int index);
  /**
   * <pre>
   * Optional. Bounding polygons around the areas of interest in the reference
   * image. If this field is empty, the system will try to detect regions of
   * interest. At most 10 bounding polygons will be used.
   *
   * The provided shape is converted into a non-rotated rectangle. Once
   * converted, the small edge of the rectangle must be greater than or equal
   * to 300 pixels. The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5
   * is not).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.BoundingPoly bounding_polys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getBoundingPolysCount();
  /**
   * <pre>
   * Optional. Bounding polygons around the areas of interest in the reference
   * image. If this field is empty, the system will try to detect regions of
   * interest. At most 10 bounding polygons will be used.
   *
   * The provided shape is converted into a non-rotated rectangle. Once
   * converted, the small edge of the rectangle must be greater than or equal
   * to 300 pixels. The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5
   * is not).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.BoundingPoly bounding_polys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p4beta1.BoundingPolyOrBuilder> 
      getBoundingPolysOrBuilderList();
  /**
   * <pre>
   * Optional. Bounding polygons around the areas of interest in the reference
   * image. If this field is empty, the system will try to detect regions of
   * interest. At most 10 bounding polygons will be used.
   *
   * The provided shape is converted into a non-rotated rectangle. Once
   * converted, the small edge of the rectangle must be greater than or equal
   * to 300 pixels. The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5
   * is not).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.BoundingPoly bounding_polys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.vision.v1p4beta1.BoundingPolyOrBuilder getBoundingPolysOrBuilder(
      int index);
}
