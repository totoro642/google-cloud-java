// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/edgenetwork/v1/service.proto

package com.google.cloud.edgenetwork.v1;

public interface DiagnoseNetworkResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgenetwork.v1.DiagnoseNetworkResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time when the network status was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The time when the network status was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The time when the network status was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * The network status of a specific network.
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.DiagnoseNetworkResponse.NetworkStatus result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * The network status of a specific network.
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.DiagnoseNetworkResponse.NetworkStatus result = 2;</code>
   * @return The result.
   */
  com.google.cloud.edgenetwork.v1.DiagnoseNetworkResponse.NetworkStatus getResult();
  /**
   * <pre>
   * The network status of a specific network.
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.DiagnoseNetworkResponse.NetworkStatus result = 2;</code>
   */
  com.google.cloud.edgenetwork.v1.DiagnoseNetworkResponse.NetworkStatusOrBuilder getResultOrBuilder();
}
