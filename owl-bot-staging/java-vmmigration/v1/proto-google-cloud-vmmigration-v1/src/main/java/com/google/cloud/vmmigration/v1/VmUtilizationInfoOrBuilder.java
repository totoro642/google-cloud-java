// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmmigration.v1;

public interface VmUtilizationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.VmUtilizationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The description of the VM in a Source of type Vmware.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
   * @return Whether the vmwareVmDetails field is set.
   */
  boolean hasVmwareVmDetails();
  /**
   * <pre>
   * The description of the VM in a Source of type Vmware.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
   * @return The vmwareVmDetails.
   */
  com.google.cloud.vmmigration.v1.VmwareVmDetails getVmwareVmDetails();
  /**
   * <pre>
   * The description of the VM in a Source of type Vmware.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmwareVmDetails vmware_vm_details = 1;</code>
   */
  com.google.cloud.vmmigration.v1.VmwareVmDetailsOrBuilder getVmwareVmDetailsOrBuilder();

  /**
   * <pre>
   * The VM's ID in the source.
   * </pre>
   *
   * <code>string vm_id = 3;</code>
   * @return The vmId.
   */
  java.lang.String getVmId();
  /**
   * <pre>
   * The VM's ID in the source.
   * </pre>
   *
   * <code>string vm_id = 3;</code>
   * @return The bytes for vmId.
   */
  com.google.protobuf.ByteString
      getVmIdBytes();

  /**
   * <pre>
   * Utilization metrics for this VM.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
   * @return Whether the utilization field is set.
   */
  boolean hasUtilization();
  /**
   * <pre>
   * Utilization metrics for this VM.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
   * @return The utilization.
   */
  com.google.cloud.vmmigration.v1.VmUtilizationMetrics getUtilization();
  /**
   * <pre>
   * Utilization metrics for this VM.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.VmUtilizationMetrics utilization = 2;</code>
   */
  com.google.cloud.vmmigration.v1.VmUtilizationMetricsOrBuilder getUtilizationOrBuilder();

  com.google.cloud.vmmigration.v1.VmUtilizationInfo.VmDetailsCase getVmDetailsCase();
}
