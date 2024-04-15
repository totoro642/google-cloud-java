// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

public interface GetDeploymentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.GetDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the deployment.
   * Case 1: If the name provided in the request is
   * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
   * returned.
   * Case 2: If the name provided in the request is {deployment}, then
   * the current state of the deployment is returned.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the deployment.
   * Case 1: If the name provided in the request is
   * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
   * returned.
   * Case 2: If the name provided in the request is {deployment}, then
   * the current state of the deployment is returned.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Defines the type of view of the deployment.
   * When field is not present VIEW_BASIC is considered as default.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Optional. Defines the type of view of the deployment.
   * When field is not present VIEW_BASIC is considered as default.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  com.google.cloud.telcoautomation.v1alpha1.DeploymentView getView();
}
