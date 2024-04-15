// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/events.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.stitcher.v1;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Describes the event that occurred.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.Event.EventType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Describes the event that occurred.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.Event.EventType type = 1;</code>
   * @return The type.
   */
  com.google.cloud.video.stitcher.v1.Event.EventType getType();

  /**
   * <pre>
   * The URI to trigger for this event.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * The URI to trigger for this event.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * The ID of the event.
   * </pre>
   *
   * <code>string id = 3;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the event.
   * </pre>
   *
   * <code>string id = 3;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The offset in seconds if the event type is `PROGRESS`.
   * </pre>
   *
   * <code>.google.protobuf.Duration offset = 4;</code>
   * @return Whether the offset field is set.
   */
  boolean hasOffset();
  /**
   * <pre>
   * The offset in seconds if the event type is `PROGRESS`.
   * </pre>
   *
   * <code>.google.protobuf.Duration offset = 4;</code>
   * @return The offset.
   */
  com.google.protobuf.Duration getOffset();
  /**
   * <pre>
   * The offset in seconds if the event type is `PROGRESS`.
   * </pre>
   *
   * <code>.google.protobuf.Duration offset = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getOffsetOrBuilder();
}
