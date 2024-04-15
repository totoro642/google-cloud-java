// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmwareengine.v1;

public interface StretchedClusterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.StretchedClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Zone that will remain operational when connection between the two
   * zones is lost. Specify the resource name of a zone that belongs to the
   * region of the private cloud. For example:
   * `projects/{project}/locations/europe-west3-a` where `{project}` can either
   * be a project number or a project ID.
   * </pre>
   *
   * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The preferredLocation.
   */
  java.lang.String getPreferredLocation();
  /**
   * <pre>
   * Required. Zone that will remain operational when connection between the two
   * zones is lost. Specify the resource name of a zone that belongs to the
   * region of the private cloud. For example:
   * `projects/{project}/locations/europe-west3-a` where `{project}` can either
   * be a project number or a project ID.
   * </pre>
   *
   * <code>string preferred_location = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for preferredLocation.
   */
  com.google.protobuf.ByteString
      getPreferredLocationBytes();

  /**
   * <pre>
   * Required. Additional zone for a higher level of availability and load
   * balancing. Specify the resource name of a zone that belongs to the region
   * of the private cloud. For example:
   * `projects/{project}/locations/europe-west3-b` where `{project}` can either
   * be a project number or a project ID.
   * </pre>
   *
   * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The secondaryLocation.
   */
  java.lang.String getSecondaryLocation();
  /**
   * <pre>
   * Required. Additional zone for a higher level of availability and load
   * balancing. Specify the resource name of a zone that belongs to the region
   * of the private cloud. For example:
   * `projects/{project}/locations/europe-west3-b` where `{project}` can either
   * be a project number or a project ID.
   * </pre>
   *
   * <code>string secondary_location = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for secondaryLocation.
   */
  com.google.protobuf.ByteString
      getSecondaryLocationBytes();
}
