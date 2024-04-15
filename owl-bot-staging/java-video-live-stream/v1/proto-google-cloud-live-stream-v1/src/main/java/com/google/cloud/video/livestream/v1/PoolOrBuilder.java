// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.livestream.v1;

public interface PoolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.Pool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the pool, in the form of:
   * `projects/{project}/locations/{location}/pools/{poolId}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the pool, in the form of:
   * `projects/{project}/locations/{location}/pools/{poolId}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * User-defined key/value metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Network configuration for the pool.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Pool.NetworkConfig network_config = 5;</code>
   * @return Whether the networkConfig field is set.
   */
  boolean hasNetworkConfig();
  /**
   * <pre>
   * Network configuration for the pool.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Pool.NetworkConfig network_config = 5;</code>
   * @return The networkConfig.
   */
  com.google.cloud.video.livestream.v1.Pool.NetworkConfig getNetworkConfig();
  /**
   * <pre>
   * Network configuration for the pool.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Pool.NetworkConfig network_config = 5;</code>
   */
  com.google.cloud.video.livestream.v1.Pool.NetworkConfigOrBuilder getNetworkConfigOrBuilder();
}
