// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1beta2/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.secretmanager.v1beta2;

public interface UpdateSecretRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1beta2.UpdateSecretRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. [Secret][google.cloud.secretmanager.v1beta2.Secret] with updated
   * field values.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the secret field is set.
   */
  boolean hasSecret();
  /**
   * <pre>
   * Required. [Secret][google.cloud.secretmanager.v1beta2.Secret] with updated
   * field values.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The secret.
   */
  com.google.cloud.secretmanager.v1beta2.Secret getSecret();
  /**
   * <pre>
   * Required. [Secret][google.cloud.secretmanager.v1beta2.Secret] with updated
   * field values.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1beta2.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.secretmanager.v1beta2.SecretOrBuilder getSecretOrBuilder();

  /**
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
