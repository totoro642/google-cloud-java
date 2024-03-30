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
// source: google/cloud/aiplatform/v1/feature_online_store.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class FeatureOnlineStoreProto {
  private FeatureOnlineStoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/feature_onl"
          + "ine_store.proto\022\032google.cloud.aiplatform"
          + ".v1\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\032\037google/protobuf"
          + "/timestamp.proto\"\377\010\n\022FeatureOnlineStore\022"
          + "K\n\010bigtable\030\010 \001(\01327.google.cloud.aiplatf"
          + "orm.v1.FeatureOnlineStore.BigtableH\000\022M\n\t"
          + "optimized\030\014 \001(\01328.google.cloud.aiplatfor"
          + "m.v1.FeatureOnlineStore.OptimizedH\000\022\021\n\004n"
          + "ame\030\001 \001(\tB\003\340A\010\0224\n\013create_time\030\003 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\0224\n\013update_t"
          + "ime\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\022\021\n\004etag\030\005 \001(\tB\003\340A\001\022O\n\006labels\030\006 \003(\0132:."
          + "google.cloud.aiplatform.v1.FeatureOnline"
          + "Store.LabelsEntryB\003\340A\001\022H\n\005state\030\007 \001(\01624."
          + "google.cloud.aiplatform.v1.FeatureOnline"
          + "Store.StateB\003\340A\003\022p\n\032dedicated_serving_en"
          + "dpoint\030\n \001(\0132G.google.cloud.aiplatform.v"
          + "1.FeatureOnlineStore.DedicatedServingEnd"
          + "pointB\003\340A\001\032\330\001\n\010Bigtable\022^\n\014auto_scaling\030"
          + "\001 \001(\0132C.google.cloud.aiplatform.v1.Featu"
          + "reOnlineStore.Bigtable.AutoScalingB\003\340A\002\032"
          + "l\n\013AutoScaling\022\033\n\016min_node_count\030\001 \001(\005B\003"
          + "\340A\002\022\033\n\016max_node_count\030\002 \001(\005B\003\340A\002\022#\n\026cpu_"
          + "utilization_target\030\003 \001(\005B\003\340A\001\032\013\n\tOptimiz"
          + "ed\032D\n\030DedicatedServingEndpoint\022(\n\033public"
          + "_endpoint_domain_name\030\002 \001(\tB\003\340A\003\032-\n\013Labe"
          + "lsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\""
          + "8\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006STABL"
          + "E\020\001\022\014\n\010UPDATING\020\002:\206\001\352A\202\001\n,aiplatform.goo"
          + "gleapis.com/FeatureOnlineStore\022Rprojects"
          + "/{project}/locations/{location}/featureO"
          + "nlineStores/{feature_online_store}B\016\n\014st"
          + "orage_typeB\325\001\n\036com.google.cloud.aiplatfo"
          + "rm.v1B\027FeatureOnlineStoreProtoP\001Z>cloud."
          + "google.com/go/aiplatform/apiv1/aiplatfor"
          + "mpb;aiplatformpb\252\002\032Google.Cloud.AIPlatfo"
          + "rm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Goo"
          + "gle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor,
            new java.lang.String[] {
              "Bigtable",
              "Optimized",
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "State",
              "DedicatedServingEndpoint",
              "StorageType",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor,
            new java.lang.String[] {
              "AutoScaling",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Bigtable_AutoScaling_descriptor,
            new java.lang.String[] {
              "MinNodeCount", "MaxNodeCount", "CpuUtilizationTarget",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_Optimized_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_DedicatedServingEndpoint_descriptor,
            new java.lang.String[] {
              "PublicEndpointDomainName",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureOnlineStore_LabelsEntry_descriptor,
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
