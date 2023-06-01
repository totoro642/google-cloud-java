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
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

public final class RuntimeProto {
  private RuntimeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_Runtime_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Runtime_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_EncryptionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_EncryptionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_LocalDisk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_LocalDisk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_LocalDisk_RuntimeGuestOsFeature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_LocalDisk_RuntimeGuestOsFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_RuntimeSoftwareConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RuntimeSoftwareConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_RuntimeMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RuntimeMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_RuntimeMetrics_SystemMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RuntimeMetrics_SystemMetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_VirtualMachine_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_VirtualMachine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_BootImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_BootImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_GuestAttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_GuestAttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/notebooks/v1/runtime.prot"
          + "o\022\031google.cloud.notebooks.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032+google/cloud/notebooks/v1/envi"
          + "ronment.proto\032\037google/protobuf/timestamp"
          + ".proto\"\263\007\n\007Runtime\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022D"
          + "\n\017virtual_machine\030\002 \001(\0132).google.cloud.n"
          + "otebooks.v1.VirtualMachineH\000\022=\n\005state\030\003 "
          + "\001(\0162(.google.cloud.notebooks.v1.Runtime."
          + "StateB\004\342A\001\003\022J\n\014health_state\030\004 \001(\0162..goog"
          + "le.cloud.notebooks.v1.Runtime.HealthStat"
          + "eB\004\342A\001\003\022E\n\raccess_config\030\005 \001(\0132..google."
          + "cloud.notebooks.v1.RuntimeAccessConfig\022I"
          + "\n\017software_config\030\006 \001(\01320.google.cloud.n"
          + "otebooks.v1.RuntimeSoftwareConfig\022@\n\007met"
          + "rics\030\007 \001(\0132).google.cloud.notebooks.v1.R"
          + "untimeMetricsB\004\342A\001\003\0225\n\013create_time\030\024 \001(\013"
          + "2\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013up"
          + "date_time\030\025 \001(\0132\032.google.protobuf.Timest"
          + "ampB\004\342A\001\003\"\224\001\n\005State\022\025\n\021STATE_UNSPECIFIED"
          + "\020\000\022\014\n\010STARTING\020\001\022\020\n\014PROVISIONING\020\002\022\n\n\006AC"
          + "TIVE\020\003\022\014\n\010STOPPING\020\004\022\013\n\007STOPPED\020\005\022\014\n\010DEL"
          + "ETING\020\006\022\r\n\tUPGRADING\020\007\022\020\n\014INITIALIZING\020\010"
          + "\"w\n\013HealthState\022\034\n\030HEALTH_STATE_UNSPECIF"
          + "IED\020\000\022\013\n\007HEALTHY\020\001\022\r\n\tUNHEALTHY\020\002\022\027\n\023AGE"
          + "NT_NOT_INSTALLED\020\003\022\025\n\021AGENT_NOT_RUNNING\020"
          + "\004:a\352A^\n notebooks.googleapis.com/Runtime"
          + "\022:projects/{project}/locations/{location"
          + "}/runtimes/{runtime}B\016\n\014runtime_type\"\245\003\n"
          + "\030RuntimeAcceleratorConfig\022Q\n\004type\030\001 \001(\0162"
          + "C.google.cloud.notebooks.v1.RuntimeAccel"
          + "eratorConfig.AcceleratorType\022\022\n\ncore_cou"
          + "nt\030\002 \001(\003\"\241\002\n\017AcceleratorType\022 \n\034ACCELERA"
          + "TOR_TYPE_UNSPECIFIED\020\000\022\030\n\020NVIDIA_TESLA_K"
          + "80\020\001\032\002\010\001\022\025\n\021NVIDIA_TESLA_P100\020\002\022\025\n\021NVIDI"
          + "A_TESLA_V100\020\003\022\023\n\017NVIDIA_TESLA_P4\020\004\022\023\n\017N"
          + "VIDIA_TESLA_T4\020\005\022\025\n\021NVIDIA_TESLA_A100\020\006\022"
          + "\n\n\006TPU_V2\020\007\022\n\n\006TPU_V3\020\010\022\027\n\023NVIDIA_TESLA_"
          + "T4_VWS\020\t\022\031\n\025NVIDIA_TESLA_P100_VWS\020\n\022\027\n\023N"
          + "VIDIA_TESLA_P4_VWS\020\013\"#\n\020EncryptionConfig"
          + "\022\017\n\007kms_key\030\001 \001(\t\"\260\003\n\tLocalDisk\022\031\n\013auto_"
          + "delete\030\001 \001(\010B\004\342A\001\003\022\022\n\004boot\030\002 \001(\010B\004\342A\001\003\022\031"
          + "\n\013device_name\030\003 \001(\tB\004\342A\001\003\022[\n\021guest_os_fe"
          + "atures\030\004 \003(\0132:.google.cloud.notebooks.v1"
          + ".LocalDisk.RuntimeGuestOsFeatureB\004\342A\001\003\022\023"
          + "\n\005index\030\005 \001(\005B\004\342A\001\003\022U\n\021initialize_params"
          + "\030\006 \001(\01324.google.cloud.notebooks.v1.Local"
          + "DiskInitializeParamsB\004\342A\001\004\022\021\n\tinterface\030"
          + "\007 \001(\t\022\022\n\004kind\030\010 \001(\tB\004\342A\001\003\022\026\n\010licenses\030\t "
          + "\003(\tB\004\342A\001\003\022\014\n\004mode\030\n \001(\t\022\016\n\006source\030\013 \001(\t\022"
          + "\014\n\004type\030\014 \001(\t\032%\n\025RuntimeGuestOsFeature\022\014"
          + "\n\004type\030\001 \001(\t\"\257\003\n\031LocalDiskInitializePara"
          + "ms\022\031\n\013description\030\001 \001(\tB\004\342A\001\001\022\027\n\tdisk_na"
          + "me\030\002 \001(\tB\004\342A\001\001\022\032\n\014disk_size_gb\030\003 \001(\003B\004\342A"
          + "\001\001\022V\n\tdisk_type\030\004 \001(\0162=.google.cloud.not"
          + "ebooks.v1.LocalDiskInitializeParams.Disk"
          + "TypeB\004\342A\001\004\022V\n\006labels\030\005 \003(\0132@.google.clou"
          + "d.notebooks.v1.LocalDiskInitializeParams"
          + ".LabelsEntryB\004\342A\001\001\032-\n\013LabelsEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"c\n\010DiskType\022\031\n"
          + "\025DISK_TYPE_UNSPECIFIED\020\000\022\017\n\013PD_STANDARD\020"
          + "\001\022\n\n\006PD_SSD\020\002\022\017\n\013PD_BALANCED\020\003\022\016\n\nPD_EXT"
          + "REME\020\004\"\374\001\n\023RuntimeAccessConfig\022U\n\013access"
          + "_type\030\001 \001(\0162@.google.cloud.notebooks.v1."
          + "RuntimeAccessConfig.RuntimeAccessType\022\025\n"
          + "\rruntime_owner\030\002 \001(\t\022\027\n\tproxy_uri\030\003 \001(\tB"
          + "\004\342A\001\003\"^\n\021RuntimeAccessType\022#\n\037RUNTIME_AC"
          + "CESS_TYPE_UNSPECIFIED\020\000\022\017\n\013SINGLE_USER\020\001"
          + "\022\023\n\017SERVICE_ACCOUNT\020\002\"\347\005\n\025RuntimeSoftwar"
          + "eConfig\022!\n\031notebook_upgrade_schedule\030\001 \001"
          + "(\t\022%\n\030enable_health_monitoring\030\002 \001(\010H\000\210\001"
          + "\001\022\032\n\ridle_shutdown\030\003 \001(\010H\001\210\001\001\022\035\n\025idle_sh"
          + "utdown_timeout\030\004 \001(\005\022\032\n\022install_gpu_driv"
          + "er\030\005 \001(\010\022\036\n\026custom_gpu_driver_path\030\006 \001(\t"
          + "\022\033\n\023post_startup_script\030\007 \001(\t\022@\n\007kernels"
          + "\030\010 \003(\0132).google.cloud.notebooks.v1.Conta"
          + "inerImageB\004\342A\001\001\022\036\n\013upgradeable\030\t \001(\010B\004\342A"
          + "\001\003H\002\210\001\001\022p\n\034post_startup_script_behavior\030"
          + "\n \001(\0162J.google.cloud.notebooks.v1.Runtim"
          + "eSoftwareConfig.PostStartupScriptBehavio"
          + "r\022\035\n\020disable_terminal\030\013 \001(\010H\003\210\001\001\022\032\n\007vers"
          + "ion\030\014 \001(\tB\004\342A\001\003H\004\210\001\001\"\200\001\n\031PostStartupScri"
          + "ptBehavior\022,\n(POST_STARTUP_SCRIPT_BEHAVI"
          + "OR_UNSPECIFIED\020\000\022\023\n\017RUN_EVERY_START\020\001\022 \n"
          + "\034DOWNLOAD_AND_RUN_EVERY_START\020\002B\033\n\031_enab"
          + "le_health_monitoringB\020\n\016_idle_shutdownB\016"
          + "\n\014_upgradeableB\023\n\021_disable_terminalB\n\n\010_"
          + "version\"\242\001\n\016RuntimeMetrics\022Z\n\016system_met"
          + "rics\030\001 \003(\0132<.google.cloud.notebooks.v1.R"
          + "untimeMetrics.SystemMetricsEntryB\004\342A\001\003\0324"
          + "\n\022SystemMetricsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val"
          + "ue\030\002 \001(\t:\0028\001\"u\n\035RuntimeShieldedInstanceC"
          + "onfig\022\032\n\022enable_secure_boot\030\001 \001(\010\022\023\n\013ena"
          + "ble_vtpm\030\002 \001(\010\022#\n\033enable_integrity_monit"
          + "oring\030\003 \001(\010\"\231\001\n\016VirtualMachine\022\033\n\rinstan"
          + "ce_name\030\001 \001(\tB\004\342A\001\003\022\031\n\013instance_id\030\002 \001(\t"
          + "B\004\342A\001\003\022O\n\026virtual_machine_config\030\003 \001(\0132/"
          + ".google.cloud.notebooks.v1.VirtualMachin"
          + "eConfig\"\364\t\n\024VirtualMachineConfig\022\022\n\004zone"
          + "\030\001 \001(\tB\004\342A\001\003\022\032\n\014machine_type\030\002 \001(\tB\004\342A\001\002"
          + "\022I\n\020container_images\030\003 \003(\0132).google.clou"
          + "d.notebooks.v1.ContainerImageB\004\342A\001\001\022=\n\td"
          + "ata_disk\030\004 \001(\0132$.google.cloud.notebooks."
          + "v1.LocalDiskB\004\342A\001\002\022L\n\021encryption_config\030"
          + "\005 \001(\0132+.google.cloud.notebooks.v1.Encryp"
          + "tionConfigB\004\342A\001\001\022`\n\030shielded_instance_co"
          + "nfig\030\006 \001(\01328.google.cloud.notebooks.v1.R"
          + "untimeShieldedInstanceConfigB\004\342A\001\001\022U\n\022ac"
          + "celerator_config\030\007 \001(\01323.google.cloud.no"
          + "tebooks.v1.RuntimeAcceleratorConfigB\004\342A\001"
          + "\001\022\025\n\007network\030\010 \001(\tB\004\342A\001\001\022\024\n\006subnet\030\t \001(\t"
          + "B\004\342A\001\001\022\036\n\020internal_ip_only\030\n \001(\010B\004\342A\001\001\022\022"
          + "\n\004tags\030\r \003(\tB\004\342A\001\001\022d\n\020guest_attributes\030\016"
          + " \003(\0132D.google.cloud.notebooks.v1.Virtual"
          + "MachineConfig.GuestAttributesEntryB\004\342A\001\003"
          + "\022U\n\010metadata\030\017 \003(\0132=.google.cloud.notebo"
          + "oks.v1.VirtualMachineConfig.MetadataEntr"
          + "yB\004\342A\001\001\022Q\n\006labels\030\020 \003(\0132;.google.cloud.n"
          + "otebooks.v1.VirtualMachineConfig.LabelsE"
          + "ntryB\004\342A\001\001\022O\n\010nic_type\030\021 \001(\01627.google.cl"
          + "oud.notebooks.v1.VirtualMachineConfig.Ni"
          + "cTypeB\004\342A\001\001\022\037\n\021reserved_ip_range\030\022 \001(\tB\004"
          + "\342A\001\001\022S\n\nboot_image\030\023 \001(\01329.google.cloud."
          + "notebooks.v1.VirtualMachineConfig.BootIm"
          + "ageB\004\342A\001\001\032\013\n\tBootImage\0326\n\024GuestAttribute"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032/"
          + "\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 "
          + "\001(\t:\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\001\">\n\007NicType\022\030\n\024UNSPECIFIED"
          + "_NIC_TYPE\020\000\022\016\n\nVIRTIO_NET\020\001\022\t\n\005GVNIC\020\002B\303"
          + "\001\n\035com.google.cloud.notebooks.v1B\014Runtim"
          + "eProtoP\001Z;cloud.google.com/go/notebooks/"
          + "apiv1/notebookspb;notebookspb\252\002\031Google.C"
          + "loud.Notebooks.V1\312\002\031Google\\Cloud\\Noteboo"
          + "ks\\V1\352\002\034Google::Cloud::Notebooks::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.notebooks.v1.EnvironmentProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_notebooks_v1_Runtime_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1_Runtime_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_Runtime_descriptor,
            new java.lang.String[] {
              "Name",
              "VirtualMachine",
              "State",
              "HealthState",
              "AccessConfig",
              "SoftwareConfig",
              "Metrics",
              "CreateTime",
              "UpdateTime",
              "RuntimeType",
            });
    internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_RuntimeAcceleratorConfig_descriptor,
            new java.lang.String[] {
              "Type", "CoreCount",
            });
    internal_static_google_cloud_notebooks_v1_EncryptionConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_notebooks_v1_EncryptionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_EncryptionConfig_descriptor,
            new java.lang.String[] {
              "KmsKey",
            });
    internal_static_google_cloud_notebooks_v1_LocalDisk_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_notebooks_v1_LocalDisk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_LocalDisk_descriptor,
            new java.lang.String[] {
              "AutoDelete",
              "Boot",
              "DeviceName",
              "GuestOsFeatures",
              "Index",
              "InitializeParams",
              "Interface",
              "Kind",
              "Licenses",
              "Mode",
              "Source",
              "Type",
            });
    internal_static_google_cloud_notebooks_v1_LocalDisk_RuntimeGuestOsFeature_descriptor =
        internal_static_google_cloud_notebooks_v1_LocalDisk_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_notebooks_v1_LocalDisk_RuntimeGuestOsFeature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_LocalDisk_RuntimeGuestOsFeature_descriptor,
            new java.lang.String[] {
              "Type",
            });
    internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_descriptor,
            new java.lang.String[] {
              "Description", "DiskName", "DiskSizeGb", "DiskType", "Labels",
            });
    internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_LabelsEntry_descriptor =
        internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_LocalDiskInitializeParams_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_descriptor,
            new java.lang.String[] {
              "AccessType", "RuntimeOwner", "ProxyUri",
            });
    internal_static_google_cloud_notebooks_v1_RuntimeSoftwareConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_notebooks_v1_RuntimeSoftwareConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_RuntimeSoftwareConfig_descriptor,
            new java.lang.String[] {
              "NotebookUpgradeSchedule",
              "EnableHealthMonitoring",
              "IdleShutdown",
              "IdleShutdownTimeout",
              "InstallGpuDriver",
              "CustomGpuDriverPath",
              "PostStartupScript",
              "Kernels",
              "Upgradeable",
              "PostStartupScriptBehavior",
              "DisableTerminal",
              "Version",
              "EnableHealthMonitoring",
              "IdleShutdown",
              "Upgradeable",
              "DisableTerminal",
              "Version",
            });
    internal_static_google_cloud_notebooks_v1_RuntimeMetrics_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_notebooks_v1_RuntimeMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_RuntimeMetrics_descriptor,
            new java.lang.String[] {
              "SystemMetrics",
            });
    internal_static_google_cloud_notebooks_v1_RuntimeMetrics_SystemMetricsEntry_descriptor =
        internal_static_google_cloud_notebooks_v1_RuntimeMetrics_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_notebooks_v1_RuntimeMetrics_SystemMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_RuntimeMetrics_SystemMetricsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_descriptor,
            new java.lang.String[] {
              "EnableSecureBoot", "EnableVtpm", "EnableIntegrityMonitoring",
            });
    internal_static_google_cloud_notebooks_v1_VirtualMachine_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_notebooks_v1_VirtualMachine_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_VirtualMachine_descriptor,
            new java.lang.String[] {
              "InstanceName", "InstanceId", "VirtualMachineConfig",
            });
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_descriptor,
            new java.lang.String[] {
              "Zone",
              "MachineType",
              "ContainerImages",
              "DataDisk",
              "EncryptionConfig",
              "ShieldedInstanceConfig",
              "AcceleratorConfig",
              "Network",
              "Subnet",
              "InternalIpOnly",
              "Tags",
              "GuestAttributes",
              "Metadata",
              "Labels",
              "NicType",
              "ReservedIpRange",
              "BootImage",
            });
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_BootImage_descriptor =
        internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_BootImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_BootImage_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_GuestAttributesEntry_descriptor =
        internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_GuestAttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_GuestAttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_MetadataEntry_descriptor =
        internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_LabelsEntry_descriptor =
        internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_VirtualMachineConfig_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.notebooks.v1.EnvironmentProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
