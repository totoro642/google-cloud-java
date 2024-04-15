// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

public interface ManagementConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.ManagementConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configuration of the standard (GKE) cluster management
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
   * @return Whether the standardManagementConfig field is set.
   */
  boolean hasStandardManagementConfig();
  /**
   * <pre>
   * Configuration of the standard (GKE) cluster management
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
   * @return The standardManagementConfig.
   */
  com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig getStandardManagementConfig();
  /**
   * <pre>
   * Configuration of the standard (GKE) cluster management
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.StandardManagementConfig standard_management_config = 1;</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.StandardManagementConfigOrBuilder getStandardManagementConfigOrBuilder();

  /**
   * <pre>
   * Configuration of the full (Autopilot) cluster management. Full cluster
   * management is a preview feature.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
   * @return Whether the fullManagementConfig field is set.
   */
  boolean hasFullManagementConfig();
  /**
   * <pre>
   * Configuration of the full (Autopilot) cluster management. Full cluster
   * management is a preview feature.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
   * @return The fullManagementConfig.
   */
  com.google.cloud.telcoautomation.v1alpha1.FullManagementConfig getFullManagementConfig();
  /**
   * <pre>
   * Configuration of the full (Autopilot) cluster management. Full cluster
   * management is a preview feature.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.FullManagementConfig full_management_config = 2;</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.FullManagementConfigOrBuilder getFullManagementConfigOrBuilder();

  com.google.cloud.telcoautomation.v1alpha1.ManagementConfig.OneofConfigCase getOneofConfigCase();
}
