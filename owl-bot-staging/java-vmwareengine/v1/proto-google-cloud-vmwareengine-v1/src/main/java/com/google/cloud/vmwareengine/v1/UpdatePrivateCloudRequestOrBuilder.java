// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmwareengine.v1;

public interface UpdatePrivateCloudRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.UpdatePrivateCloudRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Private cloud description.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.PrivateCloud private_cloud = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the privateCloud field is set.
   */
  boolean hasPrivateCloud();
  /**
   * <pre>
   * Required. Private cloud description.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.PrivateCloud private_cloud = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The privateCloud.
   */
  com.google.cloud.vmwareengine.v1.PrivateCloud getPrivateCloud();
  /**
   * <pre>
   * Required. Private cloud description.
   * </pre>
   *
   * <code>.google.cloud.vmwareengine.v1.PrivateCloud private_cloud = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.vmwareengine.v1.PrivateCloudOrBuilder getPrivateCloudOrBuilder();

  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * `PrivateCloud` resource by the update. The fields specified in `updateMask`
   * are relative to the resource, not the full request. A field will be
   * overwritten if it is in the mask. If the user does not provide a mask then
   * all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * `PrivateCloud` resource by the update. The fields specified in `updateMask`
   * are relative to the resource, not the full request. A field will be
   * overwritten if it is in the mask. If the user does not provide a mask then
   * all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * `PrivateCloud` resource by the update. The fields specified in `updateMask`
   * are relative to the resource, not the full request. A field will be
   * overwritten if it is in the mask. If the user does not provide a mask then
   * all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Optional. The request ID must be a valid UUID with the exception that zero
   * UUID is not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. The request ID must be a valid UUID with the exception that zero
   * UUID is not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
