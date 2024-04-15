// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

public interface WorkloadStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.WorkloadStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. SiteVersion running in the workload cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the siteVersion field is set.
   */
  boolean hasSiteVersion();
  /**
   * <pre>
   * Output only. SiteVersion running in the workload cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The siteVersion.
   */
  com.google.cloud.telcoautomation.v1alpha1.SiteVersion getSiteVersion();
  /**
   * <pre>
   * Output only. SiteVersion running in the workload cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.SiteVersionOrBuilder getSiteVersionOrBuilder();

  /**
   * <pre>
   * Output only. Status.
   * </pre>
   *
   * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * Output only. Status.
   * </pre>
   *
   * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
