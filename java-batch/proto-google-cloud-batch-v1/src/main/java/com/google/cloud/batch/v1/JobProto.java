/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/job.proto

package com.google.cloud.batch.v1;

public final class JobProto {
  private JobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Job_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Job_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_LogsPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_LogsPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_JobStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_JobStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_JobStatus_InstanceStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_JobStatus_InstanceStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_CountsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_CountsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_JobStatus_TaskGroupsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_JobStatus_TaskGroupsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_JobNotification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_JobNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_JobNotification_Message_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_JobNotification_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_LocationPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_LocationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_Disk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_Disk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_AttachedDisk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_AttachedDisk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_Accelerator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_Accelerator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicyOrTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicyOrTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkInterface_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkInterface_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_AllocationPolicy_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_AllocationPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_TaskGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/cloud/batch/v1/job.proto\022\025googl"
          + "e.cloud.batch.v1\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032 go"
          + "ogle/cloud/batch/v1/task.proto\032\036google/p"
          + "rotobuf/duration.proto\032\037google/protobuf/"
          + "timestamp.proto\"\220\005\n\003Job\022\021\n\004name\030\001 \001(\tB\003\340"
          + "A\003\022\020\n\003uid\030\002 \001(\tB\003\340A\003\022\020\n\010priority\030\003 \001(\003\022:"
          + "\n\013task_groups\030\004 \003(\0132 .google.cloud.batch"
          + ".v1.TaskGroupB\003\340A\002\022B\n\021allocation_policy\030"
          + "\007 \001(\0132\'.google.cloud.batch.v1.Allocation"
          + "Policy\0226\n\006labels\030\010 \003(\0132&.google.cloud.ba"
          + "tch.v1.Job.LabelsEntry\0225\n\006status\030\t \001(\0132 "
          + ".google.cloud.batch.v1.JobStatusB\003\340A\003\0224\n"
          + "\013create_time\030\013 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\0224\n\013update_time\030\014 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\0226\n\013logs_policy"
          + "\030\r \001(\0132!.google.cloud.batch.v1.LogsPolic"
          + "y\022=\n\rnotifications\030\016 \003(\0132&.google.cloud."
          + "batch.v1.JobNotification\032-\n\013LabelsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:Q\352AN\n\030ba"
          + "tch.googleapis.com/Job\0222projects/{projec"
          + "t}/locations/{location}/jobs/{job}\"\254\001\n\nL"
          + "ogsPolicy\022B\n\013destination\030\001 \001(\0162-.google."
          + "cloud.batch.v1.LogsPolicy.Destination\022\021\n"
          + "\tlogs_path\030\002 \001(\t\"G\n\013Destination\022\033\n\027DESTI"
          + "NATION_UNSPECIFIED\020\000\022\021\n\rCLOUD_LOGGING\020\001\022"
          + "\010\n\004PATH\020\002\"\277\006\n\tJobStatus\0225\n\005state\030\001 \001(\0162&"
          + ".google.cloud.batch.v1.JobStatus.State\0229"
          + "\n\rstatus_events\030\002 \003(\0132\".google.cloud.bat"
          + "ch.v1.StatusEvent\022E\n\013task_groups\030\004 \003(\01320"
          + ".google.cloud.batch.v1.JobStatus.TaskGro"
          + "upsEntry\022/\n\014run_duration\030\005 \001(\0132\031.google."
          + "protobuf.Duration\032\220\001\n\016InstanceStatus\022\024\n\014"
          + "machine_type\030\001 \001(\t\022U\n\022provisioning_model"
          + "\030\002 \001(\01629.google.cloud.batch.v1.Allocatio"
          + "nPolicy.ProvisioningModel\022\021\n\ttask_pack\030\003"
          + " \001(\003\032\322\001\n\017TaskGroupStatus\022L\n\006counts\030\001 \003(\013"
          + "2<.google.cloud.batch.v1.JobStatus.TaskG"
          + "roupStatus.CountsEntry\022B\n\tinstances\030\002 \003("
          + "\0132/.google.cloud.batch.v1.JobStatus.Inst"
          + "anceStatus\032-\n\013CountsEntry\022\013\n\003key\030\001 \001(\t\022\r"
          + "\n\005value\030\002 \001(\003:\0028\001\032c\n\017TaskGroupsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022?\n\005value\030\002 \001(\01320.google.cloud."
          + "batch.v1.JobStatus.TaskGroupStatus:\0028\001\"{"
          + "\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006QUEUED"
          + "\020\001\022\r\n\tSCHEDULED\020\002\022\013\n\007RUNNING\020\003\022\r\n\tSUCCEE"
          + "DED\020\004\022\n\n\006FAILED\020\005\022\030\n\024DELETION_IN_PROGRES"
          + "S\020\006\"\374\002\n\017JobNotification\022\024\n\014pubsub_topic\030"
          + "\001 \001(\t\022?\n\007message\030\002 \001(\0132..google.cloud.ba"
          + "tch.v1.JobNotification.Message\032\304\001\n\007Messa"
          + "ge\0229\n\004type\030\001 \001(\0162+.google.cloud.batch.v1"
          + ".JobNotification.Type\022=\n\rnew_job_state\030\002"
          + " \001(\0162&.google.cloud.batch.v1.JobStatus.S"
          + "tate\022?\n\016new_task_state\030\003 \001(\0162\'.google.cl"
          + "oud.batch.v1.TaskStatus.State\"K\n\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\025\n\021JOB_STATE_CHANGED"
          + "\020\001\022\026\n\022TASK_STATE_CHANGED\020\002\"\221\013\n\020Allocatio"
          + "nPolicy\022H\n\010location\030\001 \001(\01326.google.cloud"
          + ".batch.v1.AllocationPolicy.LocationPolic"
          + "y\022S\n\tinstances\030\010 \003(\0132@.google.cloud.batc"
          + "h.v1.AllocationPolicy.InstancePolicyOrTe"
          + "mplate\022C\n\006labels\030\006 \003(\01323.google.cloud.ba"
          + "tch.v1.AllocationPolicy.LabelsEntry\022F\n\007n"
          + "etwork\030\007 \001(\01325.google.cloud.batch.v1.All"
          + "ocationPolicy.NetworkPolicy\032+\n\016LocationP"
          + "olicy\022\031\n\021allowed_locations\030\001 \003(\t\032Y\n\004Disk"
          + "\022\017\n\005image\030\004 \001(\tH\000\022\022\n\010snapshot\030\005 \001(\tH\000\022\014\n"
          + "\004type\030\001 \001(\t\022\017\n\007size_gb\030\002 \001(\003B\r\n\013data_sou"
          + "rce\032\212\001\n\014AttachedDisk\022@\n\010new_disk\030\001 \001(\0132,"
          + ".google.cloud.batch.v1.AllocationPolicy."
          + "DiskH\000\022\027\n\rexisting_disk\030\002 \001(\tH\000\022\023\n\013devic"
          + "e_name\030\003 \001(\tB\n\n\010attached\032*\n\013Accelerator\022"
          + "\014\n\004type\030\001 \001(\t\022\r\n\005count\030\002 \001(\003\032\247\002\n\016Instanc"
          + "ePolicy\022\024\n\014machine_type\030\002 \001(\t\022\030\n\020min_cpu"
          + "_platform\030\003 \001(\t\022U\n\022provisioning_model\030\004 "
          + "\001(\01629.google.cloud.batch.v1.AllocationPo"
          + "licy.ProvisioningModel\022I\n\014accelerators\030\005"
          + " \003(\01323.google.cloud.batch.v1.AllocationP"
          + "olicy.Accelerator\022C\n\005disks\030\006 \003(\01324.googl"
          + "e.cloud.batch.v1.AllocationPolicy.Attach"
          + "edDisk\032\224\001\n\030InstancePolicyOrTemplate\022H\n\006p"
          + "olicy\030\001 \001(\01326.google.cloud.batch.v1.Allo"
          + "cationPolicy.InstancePolicyH\000\022\033\n\021instanc"
          + "e_template\030\002 \001(\tH\000B\021\n\017policy_template\032W\n"
          + "\020NetworkInterface\022\017\n\007network\030\001 \001(\t\022\022\n\nsu"
          + "bnetwork\030\002 \001(\t\022\036\n\026no_external_ip_address"
          + "\030\003 \001(\010\032e\n\rNetworkPolicy\022T\n\022network_inter"
          + "faces\030\001 \003(\01328.google.cloud.batch.v1.Allo"
          + "cationPolicy.NetworkInterface\032-\n\013LabelsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"`\n\021"
          + "ProvisioningModel\022\"\n\036PROVISIONING_MODEL_"
          + "UNSPECIFIED\020\000\022\014\n\010STANDARD\020\001\022\010\n\004SPOT\020\002\022\017\n"
          + "\013PREEMPTIBLE\020\003\"\201\003\n\tTaskGroup\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\003\0227\n\ttask_spec\030\003 \001(\0132\037.google.clou"
          + "d.batch.v1.TaskSpecB\003\340A\002\022\022\n\ntask_count\030\004"
          + " \001(\003\022\023\n\013parallelism\030\005 \001(\003\022=\n\021task_enviro"
          + "nments\030\t \003(\0132\".google.cloud.batch.v1.Env"
          + "ironment\022\033\n\023task_count_per_node\030\n \001(\003\022\032\n"
          + "\022require_hosts_file\030\013 \001(\010\022\026\n\016permissive_"
          + "ssh\030\014 \001(\010:o\352Al\n\036batch.googleapis.com/Tas"
          + "kGroup\022Jprojects/{project}/locations/{lo"
          + "cation}/jobs/{job}/taskGroups/{task_grou"
          + "p}B\264\001\n\031com.google.cloud.batch.v1B\010JobPro"
          + "toP\001Z:google.golang.org/genproto/googlea"
          + "pis/cloud/batch/v1;batch\242\002\003GCB\252\002\025Google."
          + "Cloud.Batch.V1\312\002\025Google\\Cloud\\Batch\\V1\352\002"
          + "\030Google::Cloud::Batch::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1.TaskProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1_Job_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Job_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "Priority",
              "TaskGroups",
              "AllocationPolicy",
              "Labels",
              "Status",
              "CreateTime",
              "UpdateTime",
              "LogsPolicy",
              "Notifications",
            });
    internal_static_google_cloud_batch_v1_Job_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1_Job_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_Job_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Job_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1_LogsPolicy_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1_LogsPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_LogsPolicy_descriptor,
            new java.lang.String[] {
              "Destination", "LogsPath",
            });
    internal_static_google_cloud_batch_v1_JobStatus_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1_JobStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_JobStatus_descriptor,
            new java.lang.String[] {
              "State", "StatusEvents", "TaskGroups", "RunDuration",
            });
    internal_static_google_cloud_batch_v1_JobStatus_InstanceStatus_descriptor =
        internal_static_google_cloud_batch_v1_JobStatus_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_JobStatus_InstanceStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_JobStatus_InstanceStatus_descriptor,
            new java.lang.String[] {
              "MachineType", "ProvisioningModel", "TaskPack",
            });
    internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_descriptor =
        internal_static_google_cloud_batch_v1_JobStatus_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_descriptor,
            new java.lang.String[] {
              "Counts", "Instances",
            });
    internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_CountsEntry_descriptor =
        internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_CountsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_JobStatus_TaskGroupStatus_CountsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1_JobStatus_TaskGroupsEntry_descriptor =
        internal_static_google_cloud_batch_v1_JobStatus_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1_JobStatus_TaskGroupsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_JobStatus_TaskGroupsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1_JobNotification_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1_JobNotification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_JobNotification_descriptor,
            new java.lang.String[] {
              "PubsubTopic", "Message",
            });
    internal_static_google_cloud_batch_v1_JobNotification_Message_descriptor =
        internal_static_google_cloud_batch_v1_JobNotification_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_JobNotification_Message_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_JobNotification_Message_descriptor,
            new java.lang.String[] {
              "Type", "NewJobState", "NewTaskState",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1_AllocationPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor,
            new java.lang.String[] {
              "Location", "Instances", "Labels", "Network",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_LocationPolicy_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_AllocationPolicy_LocationPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_LocationPolicy_descriptor,
            new java.lang.String[] {
              "AllowedLocations",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_Disk_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1_AllocationPolicy_Disk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_Disk_descriptor,
            new java.lang.String[] {
              "Image", "Snapshot", "Type", "SizeGb", "DataSource",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_AttachedDisk_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1_AllocationPolicy_AttachedDisk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_AttachedDisk_descriptor,
            new java.lang.String[] {
              "NewDisk", "ExistingDisk", "DeviceName", "Attached",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_Accelerator_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_batch_v1_AllocationPolicy_Accelerator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_Accelerator_descriptor,
            new java.lang.String[] {
              "Type", "Count",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicy_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicy_descriptor,
            new java.lang.String[] {
              "MachineType", "MinCpuPlatform", "ProvisioningModel", "Accelerators", "Disks",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicyOrTemplate_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicyOrTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_InstancePolicyOrTemplate_descriptor,
            new java.lang.String[] {
              "Policy", "InstanceTemplate", "PolicyTemplate",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkInterface_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkInterface_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkInterface_descriptor,
            new java.lang.String[] {
              "Network", "Subnetwork", "NoExternalIpAddress",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkPolicy_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(7);
    internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_NetworkPolicy_descriptor,
            new java.lang.String[] {
              "NetworkInterfaces",
            });
    internal_static_google_cloud_batch_v1_AllocationPolicy_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1_AllocationPolicy_descriptor.getNestedTypes().get(8);
    internal_static_google_cloud_batch_v1_AllocationPolicy_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_AllocationPolicy_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1_TaskGroup_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1_TaskGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_TaskGroup_descriptor,
            new java.lang.String[] {
              "Name",
              "TaskSpec",
              "TaskCount",
              "Parallelism",
              "TaskEnvironments",
              "TaskCountPerNode",
              "RequireHostsFile",
              "PermissiveSsh",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1.TaskProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
