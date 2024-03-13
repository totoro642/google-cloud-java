// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/image.proto

// Protobuf Java Version: 3.25.2
package io.grafeas.v1;

public interface LayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Layer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The recovered Dockerfile directive used to construct this layer.
   * See https://docs.docker.com/engine/reference/builder/ for more information.
   * </pre>
   *
   * <code>string directive = 1;</code>
   * @return The directive.
   */
  java.lang.String getDirective();
  /**
   * <pre>
   * Required. The recovered Dockerfile directive used to construct this layer.
   * See https://docs.docker.com/engine/reference/builder/ for more information.
   * </pre>
   *
   * <code>string directive = 1;</code>
   * @return The bytes for directive.
   */
  com.google.protobuf.ByteString
      getDirectiveBytes();

  /**
   * <pre>
   * The recovered arguments to the Dockerfile directive.
   * </pre>
   *
   * <code>string arguments = 2;</code>
   * @return The arguments.
   */
  java.lang.String getArguments();
  /**
   * <pre>
   * The recovered arguments to the Dockerfile directive.
   * </pre>
   *
   * <code>string arguments = 2;</code>
   * @return The bytes for arguments.
   */
  com.google.protobuf.ByteString
      getArgumentsBytes();
}
