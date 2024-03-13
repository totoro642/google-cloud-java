// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

// Protobuf Java Version: 3.25.2
package io.grafeas.v1;

public interface GetNoteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.GetNoteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
