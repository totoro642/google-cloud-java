// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1beta2/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.secretmanager.v1beta2;

public interface SecretPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1beta2.SecretPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The secret data. Must be no larger than 64KiB.
   * </pre>
   *
   * <code>bytes data = 1;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * Optional. If specified,
   * [SecretManagerService][google.cloud.secretmanager.v1beta2.SecretManagerService]
   * will verify the integrity of the received
   * [data][google.cloud.secretmanager.v1beta2.SecretPayload.data] on
   * [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1beta2.SecretManagerService.AddSecretVersion]
   * calls using the crc32c checksum and store it to include in future
   * [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1beta2.SecretManagerService.AccessSecretVersion]
   * responses. If a checksum is not provided in the
   * [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1beta2.SecretManagerService.AddSecretVersion]
   * request, the
   * [SecretManagerService][google.cloud.secretmanager.v1beta2.SecretManagerService]
   * will generate and store one for you.
   *
   * The CRC32C value is encoded as a Int64 for compatibility, and can be
   * safely downconverted to uint32 in languages that support this type.
   * https://cloud.google.com/apis/design/design_patterns#integer_types
   * </pre>
   *
   * <code>optional int64 data_crc32c = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the dataCrc32c field is set.
   */
  boolean hasDataCrc32C();
  /**
   * <pre>
   * Optional. If specified,
   * [SecretManagerService][google.cloud.secretmanager.v1beta2.SecretManagerService]
   * will verify the integrity of the received
   * [data][google.cloud.secretmanager.v1beta2.SecretPayload.data] on
   * [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1beta2.SecretManagerService.AddSecretVersion]
   * calls using the crc32c checksum and store it to include in future
   * [SecretManagerService.AccessSecretVersion][google.cloud.secretmanager.v1beta2.SecretManagerService.AccessSecretVersion]
   * responses. If a checksum is not provided in the
   * [SecretManagerService.AddSecretVersion][google.cloud.secretmanager.v1beta2.SecretManagerService.AddSecretVersion]
   * request, the
   * [SecretManagerService][google.cloud.secretmanager.v1beta2.SecretManagerService]
   * will generate and store one for you.
   *
   * The CRC32C value is encoded as a Int64 for compatibility, and can be
   * safely downconverted to uint32 in languages that support this type.
   * https://cloud.google.com/apis/design/design_patterns#integer_types
   * </pre>
   *
   * <code>optional int64 data_crc32c = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The dataCrc32c.
   */
  long getDataCrc32C();
}
