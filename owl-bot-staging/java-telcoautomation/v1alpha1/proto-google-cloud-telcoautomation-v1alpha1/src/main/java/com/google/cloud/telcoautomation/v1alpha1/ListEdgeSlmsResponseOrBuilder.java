// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

public interface ListEdgeSlmsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.ListEdgeSlmsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of EdgeSlm
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.EdgeSlm edge_slms = 1;</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1alpha1.EdgeSlm> 
      getEdgeSlmsList();
  /**
   * <pre>
   * The list of EdgeSlm
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.EdgeSlm edge_slms = 1;</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.EdgeSlm getEdgeSlms(int index);
  /**
   * <pre>
   * The list of EdgeSlm
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.EdgeSlm edge_slms = 1;</code>
   */
  int getEdgeSlmsCount();
  /**
   * <pre>
   * The list of EdgeSlm
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.EdgeSlm edge_slms = 1;</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.EdgeSlmOrBuilder> 
      getEdgeSlmsOrBuilderList();
  /**
   * <pre>
   * The list of EdgeSlm
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.EdgeSlm edge_slms = 1;</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.EdgeSlmOrBuilder getEdgeSlmsOrBuilder(
      int index);

  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
