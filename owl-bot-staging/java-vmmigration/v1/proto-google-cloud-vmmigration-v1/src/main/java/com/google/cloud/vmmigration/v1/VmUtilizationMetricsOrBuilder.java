// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmmigration.v1;

public interface VmUtilizationMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.VmUtilizationMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Max CPU usage, percent.
   * </pre>
   *
   * <code>int32 cpu_max_percent = 9;</code>
   * @return The cpuMaxPercent.
   */
  int getCpuMaxPercent();

  /**
   * <pre>
   * Average CPU usage, percent.
   * </pre>
   *
   * <code>int32 cpu_average_percent = 10;</code>
   * @return The cpuAveragePercent.
   */
  int getCpuAveragePercent();

  /**
   * <pre>
   * Max memory usage, percent.
   * </pre>
   *
   * <code>int32 memory_max_percent = 11;</code>
   * @return The memoryMaxPercent.
   */
  int getMemoryMaxPercent();

  /**
   * <pre>
   * Average memory usage, percent.
   * </pre>
   *
   * <code>int32 memory_average_percent = 12;</code>
   * @return The memoryAveragePercent.
   */
  int getMemoryAveragePercent();

  /**
   * <pre>
   * Max disk IO rate, in kilobytes per second.
   * </pre>
   *
   * <code>int64 disk_io_rate_max_kbps = 13;</code>
   * @return The diskIoRateMaxKbps.
   */
  long getDiskIoRateMaxKbps();

  /**
   * <pre>
   * Average disk IO rate, in kilobytes per second.
   * </pre>
   *
   * <code>int64 disk_io_rate_average_kbps = 14;</code>
   * @return The diskIoRateAverageKbps.
   */
  long getDiskIoRateAverageKbps();

  /**
   * <pre>
   * Max network throughput (combined transmit-rates and receive-rates), in
   * kilobytes per second.
   * </pre>
   *
   * <code>int64 network_throughput_max_kbps = 15;</code>
   * @return The networkThroughputMaxKbps.
   */
  long getNetworkThroughputMaxKbps();

  /**
   * <pre>
   * Average network throughput (combined transmit-rates and receive-rates), in
   * kilobytes per second.
   * </pre>
   *
   * <code>int64 network_throughput_average_kbps = 16;</code>
   * @return The networkThroughputAverageKbps.
   */
  long getNetworkThroughputAverageKbps();
}
