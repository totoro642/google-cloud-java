// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmwareengine.v1;

public interface ListPeeringRoutesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.ListPeeringRoutesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the network peering to retrieve peering
   * routes from. Resource names are schemeless URIs that follow the conventions
   * in https://cloud.google.com/apis/design/resource_names. For example:
   * `projects/my-project/locations/global/networkPeerings/my-peering`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the network peering to retrieve peering
   * routes from. Resource names are schemeless URIs that follow the conventions
   * in https://cloud.google.com/apis/design/resource_names. For example:
   * `projects/my-project/locations/global/networkPeerings/my-peering`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of peering routes to return in one page.
   * The service may return fewer than this value.
   * The maximum value is coerced to 1000.
   * The default value of this field is 500.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A page token, received from a previous `ListPeeringRoutes` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListPeeringRoutes` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A page token, received from a previous `ListPeeringRoutes` call.
   * Provide this to retrieve the subsequent page.
   * When paginating, all other parameters provided to `ListPeeringRoutes` must
   * match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * A filter expression that matches resources returned in the response.
   * Currently, only filtering on the `direction` field is supported. To return
   * routes imported from the peer network, provide "direction=INCOMING". To
   * return routes exported from the VMware Engine network, provide
   * "direction=OUTGOING". Other filter expressions return an error.
   * </pre>
   *
   * <code>string filter = 6;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * A filter expression that matches resources returned in the response.
   * Currently, only filtering on the `direction` field is supported. To return
   * routes imported from the peer network, provide "direction=INCOMING". To
   * return routes exported from the VMware Engine network, provide
   * "direction=OUTGOING". Other filter expressions return an error.
   * </pre>
   *
   * <code>string filter = 6;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
