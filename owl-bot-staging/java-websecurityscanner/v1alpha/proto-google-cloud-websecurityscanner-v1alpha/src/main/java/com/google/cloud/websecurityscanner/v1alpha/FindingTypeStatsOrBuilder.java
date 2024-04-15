// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/finding_type_stats.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1alpha;

public interface FindingTypeStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.FindingTypeStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The finding type associated with the stats.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
   * @return The enum numeric value on the wire for findingType.
   */
  int getFindingTypeValue();
  /**
   * <pre>
   * The finding type associated with the stats.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 1;</code>
   * @return The findingType.
   */
  com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType getFindingType();

  /**
   * <pre>
   * The count of findings belonging to this finding type.
   * </pre>
   *
   * <code>int32 finding_count = 2;</code>
   * @return The findingCount.
   */
  int getFindingCount();
}
