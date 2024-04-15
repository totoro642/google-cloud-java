// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

public interface HydratedDeploymentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.HydratedDeployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the hydrated deployment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the hydrated deployment.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. State of the hydrated deployment (DRAFT, APPLIED).
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of the hydrated deployment (DRAFT, APPLIED).
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment.State getState();

  /**
   * <pre>
   * Optional. File contents of a hydrated deployment.
   * When invoking UpdateHydratedBlueprint API, only the modified files should
   * be included in this. Files that are not included in the update of a
   * hydrated deployment will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.File files = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1alpha1.File> 
      getFilesList();
  /**
   * <pre>
   * Optional. File contents of a hydrated deployment.
   * When invoking UpdateHydratedBlueprint API, only the modified files should
   * be included in this. Files that are not included in the update of a
   * hydrated deployment will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.File files = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.File getFiles(int index);
  /**
   * <pre>
   * Optional. File contents of a hydrated deployment.
   * When invoking UpdateHydratedBlueprint API, only the modified files should
   * be included in this. Files that are not included in the update of a
   * hydrated deployment will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.File files = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getFilesCount();
  /**
   * <pre>
   * Optional. File contents of a hydrated deployment.
   * When invoking UpdateHydratedBlueprint API, only the modified files should
   * be included in this. Files that are not included in the update of a
   * hydrated deployment will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.File files = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.FileOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <pre>
   * Optional. File contents of a hydrated deployment.
   * When invoking UpdateHydratedBlueprint API, only the modified files should
   * be included in this. Files that are not included in the update of a
   * hydrated deployment will not be changed.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.File files = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.FileOrBuilder getFilesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. WorkloadCluster identifies which workload cluster will the
   * hydrated deployment will be deployed on.
   * </pre>
   *
   * <code>string workload_cluster = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The workloadCluster.
   */
  java.lang.String getWorkloadCluster();
  /**
   * <pre>
   * Output only. WorkloadCluster identifies which workload cluster will the
   * hydrated deployment will be deployed on.
   * </pre>
   *
   * <code>string workload_cluster = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for workloadCluster.
   */
  com.google.protobuf.ByteString
      getWorkloadClusterBytes();
}
