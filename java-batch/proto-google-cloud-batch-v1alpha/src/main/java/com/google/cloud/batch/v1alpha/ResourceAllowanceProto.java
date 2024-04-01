/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/batch/v1alpha/resource_allowance.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.batch.v1alpha;

public final class ResourceAllowanceProto {
  private ResourceAllowanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ResourceAllowance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ResourceAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ResourceAllowance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ResourceAllowance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_Limit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_Limit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_LimitStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_LimitStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_PeriodConsumption_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_PeriodConsumption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_LatestPeriodConsumptionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_LatestPeriodConsumptionsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/batch/v1alpha/resource_al"
          + "lowance.proto\022\032google.cloud.batch.v1alph"
          + "a\032\037google/api/field_behavior.proto\032\033goog"
          + "le/api/field_info.proto\032\031google/api/reso"
          + "urce.proto\032-google/cloud/batch/v1alpha/n"
          + "otification.proto\032\037google/protobuf/times"
          + "tamp.proto\032\032google/type/interval.proto\"\320"
          + "\004\n\021ResourceAllowance\022V\n\030usage_resource_a"
          + "llowance\030\004 \001(\01322.google.cloud.batch.v1al"
          + "pha.UsageResourceAllowanceH\000\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\010\022\030\n\003uid\030\002 \001(\tB\013\340A\003\342\214\317\327\010\002\010\001\0224\n\013cre"
          + "ate_time\030\003 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\022N\n\006labels\030\005 \003(\01329.google.cloud.b"
          + "atch.v1alpha.ResourceAllowance.LabelsEnt"
          + "ryB\003\340A\001\022D\n\rnotifications\030\006 \003(\0132(.google."
          + "cloud.batch.v1alpha.NotificationB\003\340A\001\032-\n"
          + "\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t"
          + ":\0028\001:\244\001\352A\240\001\n&batch.googleapis.com/Resour"
          + "ceAllowance\022Oprojects/{project}/location"
          + "s/{location}/resourceAllowances/{resourc"
          + "e_allowance}*\022resourceAllowances2\021resour"
          + "ceAllowanceB\024\n\022resource_allowance\"\262\001\n\026Us"
          + "ageResourceAllowance\022I\n\004spec\030\001 \001(\01326.goo"
          + "gle.cloud.batch.v1alpha.UsageResourceAll"
          + "owanceSpecB\003\340A\002\022M\n\006status\030\002 \001(\01328.google"
          + ".cloud.batch.v1alpha.UsageResourceAllowa"
          + "nceStatusB\003\340A\003\"\206\002\n\032UsageResourceAllowanc"
          + "eSpec\022\021\n\004type\030\001 \001(\tB\003\340A\002\022P\n\005limit\030\002 \001(\0132"
          + "<.google.cloud.batch.v1alpha.UsageResour"
          + "ceAllowanceSpec.LimitB\003\340A\002\032\202\001\n\005Limit\022J\n\017"
          + "calendar_period\030\001 \001(\0162*.google.cloud.bat"
          + "ch.v1alpha.CalendarPeriodB\003\340A\001H\000\022\027\n\005limi"
          + "t\030\002 \001(\001B\003\340A\002H\001\210\001\001B\n\n\010durationB\010\n\006_limit\""
          + "\272\006\n\034UsageResourceAllowanceStatus\022F\n\005stat"
          + "e\030\001 \001(\01622.google.cloud.batch.v1alpha.Res"
          + "ourceAllowanceStateB\003\340A\003\022_\n\014limit_status"
          + "\030\002 \001(\0132D.google.cloud.batch.v1alpha.Usag"
          + "eResourceAllowanceStatus.LimitStatusB\003\340A"
          + "\003\022_\n\006report\030\003 \001(\0132J.google.cloud.batch.v"
          + "1alpha.UsageResourceAllowanceStatus.Cons"
          + "umptionReportB\003\340A\003\032r\n\013LimitStatus\0228\n\024con"
          + "sumption_interval\030\001 \001(\0132\025.google.type.In"
          + "tervalB\003\340A\003\022\022\n\005limit\030\002 \001(\001B\003\340A\003\022\025\n\010consu"
          + "med\030\003 \001(\001B\003\340A\003\032d\n\021PeriodConsumption\0228\n\024c"
          + "onsumption_interval\030\001 \001(\0132\025.google.type."
          + "IntervalB\003\340A\003\022\025\n\010consumed\030\002 \001(\001B\003\340A\003\032\265\002\n"
          + "\021ConsumptionReport\022\221\001\n\032latest_period_con"
          + "sumptions\030\001 \003(\0132h.google.cloud.batch.v1a"
          + "lpha.UsageResourceAllowanceStatus.Consum"
          + "ptionReport.LatestPeriodConsumptionsEntr"
          + "yB\003\340A\003\032\213\001\n\035LatestPeriodConsumptionsEntry"
          + "\022\013\n\003key\030\001 \001(\t\022Y\n\005value\030\002 \001(\0132J.google.cl"
          + "oud.batch.v1alpha.UsageResourceAllowance"
          + "Status.PeriodConsumption:\0028\001*f\n\016Calendar"
          + "Period\022\037\n\033CALENDAR_PERIOD_UNSPECIFIED\020\000\022"
          + "\t\n\005MONTH\020\001\022\013\n\007QUARTER\020\002\022\010\n\004YEAR\020\003\022\010\n\004WEE"
          + "K\020\004\022\007\n\003DAY\020\005*\202\001\n\026ResourceAllowanceState\022"
          + "(\n$RESOURCE_ALLOWANCE_STATE_UNSPECIFIED\020"
          + "\000\022\035\n\031RESOURCE_ALLOWANCE_ACTIVE\020\001\022\037\n\033RESO"
          + "URCE_ALLOWANCE_DEPLETED\020\002B\320\001\n\036com.google"
          + ".cloud.batch.v1alphaB\026ResourceAllowanceP"
          + "rotoP\001Z4cloud.google.com/go/batch/apiv1a"
          + "lpha/batchpb;batchpb\242\002\003GCB\252\002\032Google.Clou"
          + "d.Batch.V1Alpha\312\002\032Google\\Cloud\\Batch\\V1a"
          + "lpha\352\002\035Google::Cloud::Batch::V1alphab\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.NotificationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.IntervalProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1alpha_ResourceAllowance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_ResourceAllowance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ResourceAllowance_descriptor,
            new java.lang.String[] {
              "UsageResourceAllowance",
              "Name",
              "Uid",
              "CreateTime",
              "Labels",
              "Notifications",
              "ResourceAllowance",
            });
    internal_static_google_cloud_batch_v1alpha_ResourceAllowance_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_ResourceAllowance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_ResourceAllowance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ResourceAllowance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowance_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UsageResourceAllowance_descriptor,
            new java.lang.String[] {
              "Spec", "Status",
            });
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_descriptor,
            new java.lang.String[] {
              "Type", "Limit",
            });
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_Limit_descriptor =
        internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_Limit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceSpec_Limit_descriptor,
            new java.lang.String[] {
              "CalendarPeriod", "Limit", "Duration",
            });
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_descriptor,
            new java.lang.String[] {
              "State", "LimitStatus", "Report",
            });
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_LimitStatus_descriptor =
        internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_LimitStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_LimitStatus_descriptor,
            new java.lang.String[] {
              "ConsumptionInterval", "Limit", "Consumed",
            });
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_PeriodConsumption_descriptor =
        internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_PeriodConsumption_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_PeriodConsumption_descriptor,
            new java.lang.String[] {
              "ConsumptionInterval", "Consumed",
            });
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_descriptor =
        internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_descriptor,
            new java.lang.String[] {
              "LatestPeriodConsumptions",
            });
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_LatestPeriodConsumptionsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_LatestPeriodConsumptionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UsageResourceAllowanceStatus_ConsumptionReport_LatestPeriodConsumptionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1alpha.NotificationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
