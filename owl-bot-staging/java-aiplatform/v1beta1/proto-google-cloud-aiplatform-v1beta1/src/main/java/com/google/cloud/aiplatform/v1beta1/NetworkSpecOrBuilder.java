// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/network_spec.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface NetworkSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.NetworkSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether to enable public internet access. Default false.
   * </pre>
   *
   * <code>bool enable_internet_access = 1;</code>
   * @return The enableInternetAccess.
   */
  boolean getEnableInternetAccess();

  /**
   * <pre>
   * The full name of the Google Compute Engine
   * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
   * </pre>
   *
   * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * The full name of the Google Compute Engine
   * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
   * </pre>
   *
   * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * The name of the subnet that this instance is in.
   * Format:
   * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
   * </pre>
   *
   * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   * <pre>
   * The name of the subnet that this instance is in.
   * Format:
   * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
   * </pre>
   *
   * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString
      getSubnetworkBytes();
}
