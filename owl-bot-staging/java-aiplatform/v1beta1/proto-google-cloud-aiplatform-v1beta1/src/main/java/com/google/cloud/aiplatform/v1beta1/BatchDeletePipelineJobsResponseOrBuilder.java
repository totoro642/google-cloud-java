// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/pipeline_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface BatchDeletePipelineJobsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.BatchDeletePipelineJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.PipelineJob> 
      getPipelineJobsList();
  /**
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineJob getPipelineJobs(int index);
  /**
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  int getPipelineJobsCount();
  /**
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder> 
      getPipelineJobsOrBuilderList();
  /**
   * <pre>
   * PipelineJobs deleted.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.PipelineJob pipeline_jobs = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineJobOrBuilder getPipelineJobsOrBuilder(
      int index);
}
