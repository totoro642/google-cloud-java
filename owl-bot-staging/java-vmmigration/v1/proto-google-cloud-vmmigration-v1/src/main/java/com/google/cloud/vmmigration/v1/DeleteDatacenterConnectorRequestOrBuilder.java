// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmmigration.v1;

public interface DeleteDatacenterConnectorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.DeleteDatacenterConnectorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The DatacenterConnector name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The DatacenterConnector name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   *
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes after the first request.
   *
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
