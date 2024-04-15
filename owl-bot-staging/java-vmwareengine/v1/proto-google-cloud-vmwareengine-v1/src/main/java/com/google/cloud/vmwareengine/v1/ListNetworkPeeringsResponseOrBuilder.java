// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmwareengine.v1;

public interface ListNetworkPeeringsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.ListNetworkPeeringsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of network peerings.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.NetworkPeering network_peerings = 1;</code>
   */
  java.util.List<com.google.cloud.vmwareengine.v1.NetworkPeering> 
      getNetworkPeeringsList();
  /**
   * <pre>
   * A list of network peerings.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.NetworkPeering network_peerings = 1;</code>
   */
  com.google.cloud.vmwareengine.v1.NetworkPeering getNetworkPeerings(int index);
  /**
   * <pre>
   * A list of network peerings.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.NetworkPeering network_peerings = 1;</code>
   */
  int getNetworkPeeringsCount();
  /**
   * <pre>
   * A list of network peerings.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.NetworkPeering network_peerings = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vmwareengine.v1.NetworkPeeringOrBuilder> 
      getNetworkPeeringsOrBuilderList();
  /**
   * <pre>
   * A list of network peerings.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.NetworkPeering network_peerings = 1;</code>
   */
  com.google.cloud.vmwareengine.v1.NetworkPeeringOrBuilder getNetworkPeeringsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
