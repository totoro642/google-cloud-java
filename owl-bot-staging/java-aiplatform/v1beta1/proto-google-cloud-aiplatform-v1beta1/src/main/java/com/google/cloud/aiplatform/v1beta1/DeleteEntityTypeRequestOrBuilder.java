// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface DeleteEntityTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DeleteEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the EntityType to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the EntityType to be deleted.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set to true, any Features for this EntityType will also be deleted.
   * (Otherwise, the request will only work if the EntityType has no Features.)
   * </pre>
   *
   * <code>bool force = 2;</code>
   * @return The force.
   */
  boolean getForce();
}
