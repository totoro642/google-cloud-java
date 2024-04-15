// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2;

public interface GuestAttributesValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.GuestAttributesValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributesEntry items = 1;</code>
   */
  java.util.List<com.google.cloud.tpu.v2.GuestAttributesEntry> 
      getItemsList();
  /**
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributesEntry items = 1;</code>
   */
  com.google.cloud.tpu.v2.GuestAttributesEntry getItems(int index);
  /**
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributesEntry items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributesEntry items = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2.GuestAttributesEntryOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2.GuestAttributesEntry items = 1;</code>
   */
  com.google.cloud.tpu.v2.GuestAttributesEntryOrBuilder getItemsOrBuilder(
      int index);
}
