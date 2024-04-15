// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1;

public interface ListHydratedDeploymentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.ListHydratedDeploymentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The deployment managing the hydrated deployments.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The deployment managing the hydrated deployments.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. The maximum number of hydrated deployments to return. The service
   * may return fewer than this value. If unspecified, at most 50 hydrated
   * deployments will be returned. The maximum value is 1000. Values above 1000
   * will be set to 1000.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The page token, received from a previous ListHydratedDeployments
   * call. Provide this to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The page token, received from a previous ListHydratedDeployments
   * call. Provide this to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
