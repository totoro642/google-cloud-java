// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v1/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v1;

public interface NodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v1.Node)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Immutable. The name of the TPU
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Immutable. The name of the TPU
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The user-supplied description of the TPU. Maximum of 512 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The user-supplied description of the TPU. Maximum of 512 characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Required. The type of hardware accelerators associated with this node.
   * </pre>
   *
   * <code>string accelerator_type = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The acceleratorType.
   */
  java.lang.String getAcceleratorType();
  /**
   * <pre>
   * Required. The type of hardware accelerators associated with this node.
   * </pre>
   *
   * <code>string accelerator_type = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for acceleratorType.
   */
  com.google.protobuf.ByteString
      getAcceleratorTypeBytes();

  /**
   * <pre>
   * Output only. DEPRECATED! Use network_endpoints instead.
   * The network address for the TPU Node as visible to Compute Engine
   * instances.
   * </pre>
   *
   * <code>string ip_address = 8 [deprecated = true];</code>
   * @deprecated google.cloud.tpu.v1.Node.ip_address is deprecated.
   *     See google/cloud/tpu/v1/cloud_tpu.proto;l=279
   * @return The ipAddress.
   */
  @java.lang.Deprecated java.lang.String getIpAddress();
  /**
   * <pre>
   * Output only. DEPRECATED! Use network_endpoints instead.
   * The network address for the TPU Node as visible to Compute Engine
   * instances.
   * </pre>
   *
   * <code>string ip_address = 8 [deprecated = true];</code>
   * @deprecated google.cloud.tpu.v1.Node.ip_address is deprecated.
   *     See google/cloud/tpu/v1/cloud_tpu.proto;l=279
   * @return The bytes for ipAddress.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getIpAddressBytes();

  /**
   * <pre>
   * Output only. DEPRECATED! Use network_endpoints instead.
   * The network port for the TPU Node as visible to Compute Engine instances.
   * </pre>
   *
   * <code>string port = 14 [deprecated = true];</code>
   * @deprecated google.cloud.tpu.v1.Node.port is deprecated.
   *     See google/cloud/tpu/v1/cloud_tpu.proto;l=283
   * @return The port.
   */
  @java.lang.Deprecated java.lang.String getPort();
  /**
   * <pre>
   * Output only. DEPRECATED! Use network_endpoints instead.
   * The network port for the TPU Node as visible to Compute Engine instances.
   * </pre>
   *
   * <code>string port = 14 [deprecated = true];</code>
   * @deprecated google.cloud.tpu.v1.Node.port is deprecated.
   *     See google/cloud/tpu/v1/cloud_tpu.proto;l=283
   * @return The bytes for port.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getPortBytes();

  /**
   * <pre>
   * Output only. The current state for the TPU Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.Node.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. The current state for the TPU Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.Node.State state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.tpu.v1.Node.State getState();

  /**
   * <pre>
   * Output only. If this field is populated, it contains a description of why
   * the TPU Node is unhealthy.
   * </pre>
   *
   * <code>string health_description = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The healthDescription.
   */
  java.lang.String getHealthDescription();
  /**
   * <pre>
   * Output only. If this field is populated, it contains a description of why
   * the TPU Node is unhealthy.
   * </pre>
   *
   * <code>string health_description = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for healthDescription.
   */
  com.google.protobuf.ByteString
      getHealthDescriptionBytes();

  /**
   * <pre>
   * Required. The version of Tensorflow running in the Node.
   * </pre>
   *
   * <code>string tensorflow_version = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tensorflowVersion.
   */
  java.lang.String getTensorflowVersion();
  /**
   * <pre>
   * Required. The version of Tensorflow running in the Node.
   * </pre>
   *
   * <code>string tensorflow_version = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for tensorflowVersion.
   */
  com.google.protobuf.ByteString
      getTensorflowVersionBytes();

  /**
   * <pre>
   * The name of a network they wish to peer the TPU node to. It must be a
   * preexisting Compute Engine network inside of the project on which this API
   * has been activated. If none is provided, "default" will be used.
   * </pre>
   *
   * <code>string network = 12;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * The name of a network they wish to peer the TPU node to. It must be a
   * preexisting Compute Engine network inside of the project on which this API
   * has been activated. If none is provided, "default" will be used.
   * </pre>
   *
   * <code>string network = 12;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * The CIDR block that the TPU node will use when selecting an IP address.
   * This CIDR block must be a /29 block; the Compute Engine networks API
   * forbids a smaller block, and using a larger block would be wasteful (a
   * node can only consume one IP address). Errors will occur if the CIDR block
   * has already been used for a currently existing TPU node, the CIDR block
   * conflicts with any subnetworks in the user's provided network, or the
   * provided network is peered with another network that is using that CIDR
   * block.
   * </pre>
   *
   * <code>string cidr_block = 13;</code>
   * @return The cidrBlock.
   */
  java.lang.String getCidrBlock();
  /**
   * <pre>
   * The CIDR block that the TPU node will use when selecting an IP address.
   * This CIDR block must be a /29 block; the Compute Engine networks API
   * forbids a smaller block, and using a larger block would be wasteful (a
   * node can only consume one IP address). Errors will occur if the CIDR block
   * has already been used for a currently existing TPU node, the CIDR block
   * conflicts with any subnetworks in the user's provided network, or the
   * provided network is peered with another network that is using that CIDR
   * block.
   * </pre>
   *
   * <code>string cidr_block = 13;</code>
   * @return The bytes for cidrBlock.
   */
  com.google.protobuf.ByteString
      getCidrBlockBytes();

  /**
   * <pre>
   * Output only. The service account used to run the tensor flow services
   * within the node. To share resources, including Google Cloud Storage data,
   * with the Tensorflow job running in the Node, this account must have
   * permissions to that data.
   * </pre>
   *
   * <code>string service_account = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   * <pre>
   * Output only. The service account used to run the tensor flow services
   * within the node. To share resources, including Google Cloud Storage data,
   * with the Tensorflow job running in the Node, this account must have
   * permissions to that data.
   * </pre>
   *
   * <code>string service_account = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString
      getServiceAccountBytes();

  /**
   * <pre>
   * Output only. The time when the node was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time when the node was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time when the node was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The scheduling options for this node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.SchedulingConfig scheduling_config = 17;</code>
   * @return Whether the schedulingConfig field is set.
   */
  boolean hasSchedulingConfig();
  /**
   * <pre>
   * The scheduling options for this node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.SchedulingConfig scheduling_config = 17;</code>
   * @return The schedulingConfig.
   */
  com.google.cloud.tpu.v1.SchedulingConfig getSchedulingConfig();
  /**
   * <pre>
   * The scheduling options for this node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.SchedulingConfig scheduling_config = 17;</code>
   */
  com.google.cloud.tpu.v1.SchedulingConfigOrBuilder getSchedulingConfigOrBuilder();

  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that Tensorflow clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.tpu.v1.NetworkEndpoint> 
      getNetworkEndpointsList();
  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that Tensorflow clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v1.NetworkEndpoint getNetworkEndpoints(int index);
  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that Tensorflow clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getNetworkEndpointsCount();
  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that Tensorflow clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v1.NetworkEndpointOrBuilder> 
      getNetworkEndpointsOrBuilderList();
  /**
   * <pre>
   * Output only. The network endpoints where TPU workers can be accessed and
   * sent work. It is recommended that Tensorflow clients of the node reach out
   * to the 0th entry in this map first.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.NetworkEndpoint network_endpoints = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v1.NetworkEndpointOrBuilder getNetworkEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * The health status of the TPU node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.Node.Health health = 22;</code>
   * @return The enum numeric value on the wire for health.
   */
  int getHealthValue();
  /**
   * <pre>
   * The health status of the TPU node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.Node.Health health = 22;</code>
   * @return The health.
   */
  com.google.cloud.tpu.v1.Node.Health getHealth();

  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 24;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Whether the VPC peering for the node is set up through Service Networking
   * API. The VPC Peering should be set up before provisioning the node.
   * If this field is set, cidr_block field should not be specified. If the
   * network, that you want to peer the TPU Node to, is Shared VPC networks,
   * the node must be created with this this field enabled.
   * </pre>
   *
   * <code>bool use_service_networking = 27;</code>
   * @return The useServiceNetworking.
   */
  boolean getUseServiceNetworking();

  /**
   * <pre>
   * Output only. The API version that created this Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.Node.ApiVersion api_version = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for apiVersion.
   */
  int getApiVersionValue();
  /**
   * <pre>
   * Output only. The API version that created this Node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v1.Node.ApiVersion api_version = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The apiVersion.
   */
  com.google.cloud.tpu.v1.Node.ApiVersion getApiVersion();

  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.tpu.v1.Symptom> 
      getSymptomsList();
  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v1.Symptom getSymptoms(int index);
  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getSymptomsCount();
  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v1.SymptomOrBuilder> 
      getSymptomsOrBuilderList();
  /**
   * <pre>
   * Output only. The Symptoms that have occurred to the TPU Node.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v1.Symptom symptoms = 39 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v1.SymptomOrBuilder getSymptomsOrBuilder(
      int index);
}
