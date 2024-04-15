// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/webrisk/v1beta1/webrisk.proto

// Protobuf Java Version: 3.25.3
package com.google.webrisk.v1beta1;

public interface RawIndicesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1beta1.RawIndices)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   * @return A list containing the indices.
   */
  java.util.List<java.lang.Integer> getIndicesList();
  /**
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   * @return The count of indices.
   */
  int getIndicesCount();
  /**
   * <pre>
   * The indices to remove from a lexicographically-sorted local list.
   * </pre>
   *
   * <code>repeated int32 indices = 1;</code>
   * @param index The index of the element to return.
   * @return The indices at the given index.
   */
  int getIndices(int index);
}
