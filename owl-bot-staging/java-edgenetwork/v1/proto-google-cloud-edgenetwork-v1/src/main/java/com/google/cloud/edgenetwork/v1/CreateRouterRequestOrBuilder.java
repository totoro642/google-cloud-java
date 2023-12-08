// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/edgenetwork/v1/service.proto

package com.google.cloud.edgenetwork.v1;

public interface CreateRouterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgenetwork.v1.CreateRouterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Id of the requesting object
   * If auto-generating Id server-side, remove this field and
   * router_id from the method_signature of Create RPC
   * </pre>
   *
   * <code>string router_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The routerId.
   */
  java.lang.String getRouterId();
  /**
   * <pre>
   * Required. Id of the requesting object
   * If auto-generating Id server-side, remove this field and
   * router_id from the method_signature of Create RPC
   * </pre>
   *
   * <code>string router_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for routerId.
   */
  com.google.protobuf.ByteString
      getRouterIdBytes();

  /**
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.Router router = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the router field is set.
   */
  boolean hasRouter();
  /**
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.Router router = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The router.
   */
  com.google.cloud.edgenetwork.v1.Router getRouter();
  /**
   * <pre>
   * Required. The resource being created
   * </pre>
   *
   * <code>.google.cloud.edgenetwork.v1.Router router = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.edgenetwork.v1.RouterOrBuilder getRouterOrBuilder();

  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
