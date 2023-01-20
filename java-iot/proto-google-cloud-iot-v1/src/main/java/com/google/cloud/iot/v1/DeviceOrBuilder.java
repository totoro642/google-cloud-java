/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

public interface DeviceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.Device)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The user-defined device identifier. The device ID must be unique
   * within a device registry.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * The user-defined device identifier. The device ID must be unique
   * within a device registry.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The resource path name. For example,
   * `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or
   * `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`.
   * When `name` is populated as a response from the service, it always ends
   * in the device numeric ID.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource path name. For example,
   * `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or
   * `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`.
   * When `name` is populated as a response from the service, it always ends
   * in the device numeric ID.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * [Output only] A server-defined unique numeric ID for the device. This is a
   * more compact way to identify devices, and it is globally unique.
   * </pre>
   *
   * <code>uint64 num_id = 3;</code>
   *
   * @return The numId.
   */
  long getNumId();

  /**
   *
   *
   * <pre>
   * The credentials used to authenticate this device. To allow credential
   * rotation without interruption, multiple device credentials can be bound to
   * this device. No more than 3 credentials can be bound to a single device at
   * a time. When new credentials are added to a device, they are verified
   * against the registry credentials. For details, see the description of the
   * `DeviceRegistry.credentials` field.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceCredential credentials = 12;</code>
   */
  java.util.List<com.google.cloud.iot.v1.DeviceCredential> getCredentialsList();
  /**
   *
   *
   * <pre>
   * The credentials used to authenticate this device. To allow credential
   * rotation without interruption, multiple device credentials can be bound to
   * this device. No more than 3 credentials can be bound to a single device at
   * a time. When new credentials are added to a device, they are verified
   * against the registry credentials. For details, see the description of the
   * `DeviceRegistry.credentials` field.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceCredential credentials = 12;</code>
   */
  com.google.cloud.iot.v1.DeviceCredential getCredentials(int index);
  /**
   *
   *
   * <pre>
   * The credentials used to authenticate this device. To allow credential
   * rotation without interruption, multiple device credentials can be bound to
   * this device. No more than 3 credentials can be bound to a single device at
   * a time. When new credentials are added to a device, they are verified
   * against the registry credentials. For details, see the description of the
   * `DeviceRegistry.credentials` field.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceCredential credentials = 12;</code>
   */
  int getCredentialsCount();
  /**
   *
   *
   * <pre>
   * The credentials used to authenticate this device. To allow credential
   * rotation without interruption, multiple device credentials can be bound to
   * this device. No more than 3 credentials can be bound to a single device at
   * a time. When new credentials are added to a device, they are verified
   * against the registry credentials. For details, see the description of the
   * `DeviceRegistry.credentials` field.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceCredential credentials = 12;</code>
   */
  java.util.List<? extends com.google.cloud.iot.v1.DeviceCredentialOrBuilder>
      getCredentialsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The credentials used to authenticate this device. To allow credential
   * rotation without interruption, multiple device credentials can be bound to
   * this device. No more than 3 credentials can be bound to a single device at
   * a time. When new credentials are added to a device, they are verified
   * against the registry credentials. For details, see the description of the
   * `DeviceRegistry.credentials` field.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceCredential credentials = 12;</code>
   */
  com.google.cloud.iot.v1.DeviceCredentialOrBuilder getCredentialsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output only] The last time an MQTT `PINGREQ` was received. This field
   * applies only to devices connecting through MQTT. MQTT clients usually only
   * send `PINGREQ` messages if the connection is idle, and no other messages
   * have been sent. Timestamps are periodically collected and written to
   * storage; they may be stale by a few minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_heartbeat_time = 7;</code>
   *
   * @return Whether the lastHeartbeatTime field is set.
   */
  boolean hasLastHeartbeatTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time an MQTT `PINGREQ` was received. This field
   * applies only to devices connecting through MQTT. MQTT clients usually only
   * send `PINGREQ` messages if the connection is idle, and no other messages
   * have been sent. Timestamps are periodically collected and written to
   * storage; they may be stale by a few minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_heartbeat_time = 7;</code>
   *
   * @return The lastHeartbeatTime.
   */
  com.google.protobuf.Timestamp getLastHeartbeatTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time an MQTT `PINGREQ` was received. This field
   * applies only to devices connecting through MQTT. MQTT clients usually only
   * send `PINGREQ` messages if the connection is idle, and no other messages
   * have been sent. Timestamps are periodically collected and written to
   * storage; they may be stale by a few minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_heartbeat_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastHeartbeatTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] The last time a telemetry event was received. Timestamps are
   * periodically collected and written to storage; they may be stale by a few
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 8;</code>
   *
   * @return Whether the lastEventTime field is set.
   */
  boolean hasLastEventTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time a telemetry event was received. Timestamps are
   * periodically collected and written to storage; they may be stale by a few
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 8;</code>
   *
   * @return The lastEventTime.
   */
  com.google.protobuf.Timestamp getLastEventTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time a telemetry event was received. Timestamps are
   * periodically collected and written to storage; they may be stale by a few
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_event_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] The last time a state event was received. Timestamps are
   * periodically collected and written to storage; they may be stale by a few
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_state_time = 20;</code>
   *
   * @return Whether the lastStateTime field is set.
   */
  boolean hasLastStateTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time a state event was received. Timestamps are
   * periodically collected and written to storage; they may be stale by a few
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_state_time = 20;</code>
   *
   * @return The lastStateTime.
   */
  com.google.protobuf.Timestamp getLastStateTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time a state event was received. Timestamps are
   * periodically collected and written to storage; they may be stale by a few
   * minutes.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_state_time = 20;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastStateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] The last time a cloud-to-device config version acknowledgment
   * was received from the device. This field is only for configurations
   * sent through MQTT.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_config_ack_time = 14;</code>
   *
   * @return Whether the lastConfigAckTime field is set.
   */
  boolean hasLastConfigAckTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time a cloud-to-device config version acknowledgment
   * was received from the device. This field is only for configurations
   * sent through MQTT.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_config_ack_time = 14;</code>
   *
   * @return The lastConfigAckTime.
   */
  com.google.protobuf.Timestamp getLastConfigAckTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time a cloud-to-device config version acknowledgment
   * was received from the device. This field is only for configurations
   * sent through MQTT.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_config_ack_time = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastConfigAckTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] The last time a cloud-to-device config version was sent to
   * the device.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_config_send_time = 18;</code>
   *
   * @return Whether the lastConfigSendTime field is set.
   */
  boolean hasLastConfigSendTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time a cloud-to-device config version was sent to
   * the device.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_config_send_time = 18;</code>
   *
   * @return The lastConfigSendTime.
   */
  com.google.protobuf.Timestamp getLastConfigSendTime();
  /**
   *
   *
   * <pre>
   * [Output only] The last time a cloud-to-device config version was sent to
   * the device.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_config_send_time = 18;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastConfigSendTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If a device is blocked, connections or requests from this device will fail.
   * Can be used to temporarily prevent the device from connecting if, for
   * example, the sensor is generating bad data and needs maintenance.
   * </pre>
   *
   * <code>bool blocked = 19;</code>
   *
   * @return The blocked.
   */
  boolean getBlocked();

  /**
   *
   *
   * <pre>
   * [Output only] The time the most recent error occurred, such as a failure to
   * publish to Cloud Pub/Sub. This field is the timestamp of
   * 'last_error_status'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_error_time = 10;</code>
   *
   * @return Whether the lastErrorTime field is set.
   */
  boolean hasLastErrorTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time the most recent error occurred, such as a failure to
   * publish to Cloud Pub/Sub. This field is the timestamp of
   * 'last_error_status'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_error_time = 10;</code>
   *
   * @return The lastErrorTime.
   */
  com.google.protobuf.Timestamp getLastErrorTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time the most recent error occurred, such as a failure to
   * publish to Cloud Pub/Sub. This field is the timestamp of
   * 'last_error_status'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_error_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastErrorTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] The error message of the most recent error, such as a failure
   * to publish to Cloud Pub/Sub. 'last_error_time' is the timestamp of this
   * field. If no errors have occurred, this field has an empty message
   * and the status code 0 == OK. Otherwise, this field is expected to have a
   * status code other than OK.
   * </pre>
   *
   * <code>.google.rpc.Status last_error_status = 11;</code>
   *
   * @return Whether the lastErrorStatus field is set.
   */
  boolean hasLastErrorStatus();
  /**
   *
   *
   * <pre>
   * [Output only] The error message of the most recent error, such as a failure
   * to publish to Cloud Pub/Sub. 'last_error_time' is the timestamp of this
   * field. If no errors have occurred, this field has an empty message
   * and the status code 0 == OK. Otherwise, this field is expected to have a
   * status code other than OK.
   * </pre>
   *
   * <code>.google.rpc.Status last_error_status = 11;</code>
   *
   * @return The lastErrorStatus.
   */
  com.google.rpc.Status getLastErrorStatus();
  /**
   *
   *
   * <pre>
   * [Output only] The error message of the most recent error, such as a failure
   * to publish to Cloud Pub/Sub. 'last_error_time' is the timestamp of this
   * field. If no errors have occurred, this field has an empty message
   * and the status code 0 == OK. Otherwise, this field is expected to have a
   * status code other than OK.
   * </pre>
   *
   * <code>.google.rpc.Status last_error_status = 11;</code>
   */
  com.google.rpc.StatusOrBuilder getLastErrorStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * The most recent device configuration, which is eventually sent from
   * Cloud IoT Core to the device. If not present on creation, the
   * configuration will be initialized with an empty payload and version value
   * of `1`. To update this field after creation, use the
   * `DeviceManager.ModifyCloudToDeviceConfig` method.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceConfig config = 13;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * The most recent device configuration, which is eventually sent from
   * Cloud IoT Core to the device. If not present on creation, the
   * configuration will be initialized with an empty payload and version value
   * of `1`. To update this field after creation, use the
   * `DeviceManager.ModifyCloudToDeviceConfig` method.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceConfig config = 13;</code>
   *
   * @return The config.
   */
  com.google.cloud.iot.v1.DeviceConfig getConfig();
  /**
   *
   *
   * <pre>
   * The most recent device configuration, which is eventually sent from
   * Cloud IoT Core to the device. If not present on creation, the
   * configuration will be initialized with an empty payload and version value
   * of `1`. To update this field after creation, use the
   * `DeviceManager.ModifyCloudToDeviceConfig` method.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceConfig config = 13;</code>
   */
  com.google.cloud.iot.v1.DeviceConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output only] The state most recently received from the device. If no state
   * has been reported, this field is not present.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceState state = 16;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * [Output only] The state most recently received from the device. If no state
   * has been reported, this field is not present.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceState state = 16;</code>
   *
   * @return The state.
   */
  com.google.cloud.iot.v1.DeviceState getState();
  /**
   *
   *
   * <pre>
   * [Output only] The state most recently received from the device. If no state
   * has been reported, this field is not present.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceState state = 16;</code>
   */
  com.google.cloud.iot.v1.DeviceStateOrBuilder getStateOrBuilder();

  /**
   *
   *
   * <pre>
   * **Beta Feature**
   * The logging verbosity for device activity. If unspecified,
   * DeviceRegistry.log_level will be used.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.LogLevel log_level = 21;</code>
   *
   * @return The enum numeric value on the wire for logLevel.
   */
  int getLogLevelValue();
  /**
   *
   *
   * <pre>
   * **Beta Feature**
   * The logging verbosity for device activity. If unspecified,
   * DeviceRegistry.log_level will be used.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.LogLevel log_level = 21;</code>
   *
   * @return The logLevel.
   */
  com.google.cloud.iot.v1.LogLevel getLogLevel();

  /**
   *
   *
   * <pre>
   * The metadata key-value pairs assigned to the device. This metadata is not
   * interpreted or indexed by Cloud IoT Core. It can be used to add contextual
   * information for the device.
   * Keys must conform to the regular expression [a-zA-Z][a-zA-Z0-9-_.+~%]+ and
   * be less than 128 bytes in length.
   * Values are free-form strings. Each value must be less than or equal to 32
   * KB in size.
   * The total size of all keys and values must be less than 256 KB, and the
   * maximum number of key-value pairs is 500.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 17;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * The metadata key-value pairs assigned to the device. This metadata is not
   * interpreted or indexed by Cloud IoT Core. It can be used to add contextual
   * information for the device.
   * Keys must conform to the regular expression [a-zA-Z][a-zA-Z0-9-_.+~%]+ and
   * be less than 128 bytes in length.
   * Values are free-form strings. Each value must be less than or equal to 32
   * KB in size.
   * The total size of all keys and values must be less than 256 KB, and the
   * maximum number of key-value pairs is 500.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 17;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * The metadata key-value pairs assigned to the device. This metadata is not
   * interpreted or indexed by Cloud IoT Core. It can be used to add contextual
   * information for the device.
   * Keys must conform to the regular expression [a-zA-Z][a-zA-Z0-9-_.+~%]+ and
   * be less than 128 bytes in length.
   * Values are free-form strings. Each value must be less than or equal to 32
   * KB in size.
   * The total size of all keys and values must be less than 256 KB, and the
   * maximum number of key-value pairs is 500.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 17;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * The metadata key-value pairs assigned to the device. This metadata is not
   * interpreted or indexed by Cloud IoT Core. It can be used to add contextual
   * information for the device.
   * Keys must conform to the regular expression [a-zA-Z][a-zA-Z0-9-_.+~%]+ and
   * be less than 128 bytes in length.
   * Values are free-form strings. Each value must be less than or equal to 32
   * KB in size.
   * The total size of all keys and values must be less than 256 KB, and the
   * maximum number of key-value pairs is 500.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 17;</code>
   */
  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The metadata key-value pairs assigned to the device. This metadata is not
   * interpreted or indexed by Cloud IoT Core. It can be used to add contextual
   * information for the device.
   * Keys must conform to the regular expression [a-zA-Z][a-zA-Z0-9-_.+~%]+ and
   * be less than 128 bytes in length.
   * Values are free-form strings. Each value must be less than or equal to 32
   * KB in size.
   * The total size of all keys and values must be less than 256 KB, and the
   * maximum number of key-value pairs is 500.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 17;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Gateway-related configuration and state.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayConfig gateway_config = 24;</code>
   *
   * @return Whether the gatewayConfig field is set.
   */
  boolean hasGatewayConfig();
  /**
   *
   *
   * <pre>
   * Gateway-related configuration and state.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayConfig gateway_config = 24;</code>
   *
   * @return The gatewayConfig.
   */
  com.google.cloud.iot.v1.GatewayConfig getGatewayConfig();
  /**
   *
   *
   * <pre>
   * Gateway-related configuration and state.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.GatewayConfig gateway_config = 24;</code>
   */
  com.google.cloud.iot.v1.GatewayConfigOrBuilder getGatewayConfigOrBuilder();
}
