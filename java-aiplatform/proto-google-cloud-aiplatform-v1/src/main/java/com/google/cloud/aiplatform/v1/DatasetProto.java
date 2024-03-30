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
// source: google/cloud/aiplatform/v1/dataset.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class DatasetProto {
  private DatasetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Dataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExportDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExportDataConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExportFractionSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExportFractionSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExportFilterSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExportFilterSplit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1/dataset.pro"
          + "to\022\032google.cloud.aiplatform.v1\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\0320google/cloud/aiplatform/v1/e"
          + "ncryption_spec.proto\032#google/cloud/aipla"
          + "tform/v1/io.proto\032,google/cloud/aiplatfo"
          + "rm/v1/saved_query.proto\032\034google/protobuf"
          + "/struct.proto\032\037google/protobuf/timestamp"
          + ".proto\"\255\005\n\007Dataset\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030"
          + "\020 \001(\t\022 \n\023metadata_schema_uri\030\003 \001(\tB\003\340A\002\022"
          + "-\n\010metadata\030\010 \001(\0132\026.google.protobuf.Valu"
          + "eB\003\340A\002\022\034\n\017data_item_count\030\n \001(\003B\003\340A\003\0224\n\013"
          + "create_time\030\004 \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\003\0224\n\013update_time\030\005 \001(\0132\032.google"
          + ".protobuf.TimestampB\003\340A\003\022\014\n\004etag\030\006 \001(\t\022?"
          + "\n\006labels\030\007 \003(\0132/.google.cloud.aiplatform"
          + ".v1.Dataset.LabelsEntry\022=\n\rsaved_queries"
          + "\030\t \003(\0132&.google.cloud.aiplatform.v1.Save"
          + "dQuery\022C\n\017encryption_spec\030\013 \001(\0132*.google"
          + ".cloud.aiplatform.v1.EncryptionSpec\022\036\n\021m"
          + "etadata_artifact\030\021 \001(\tB\003\340A\003\032-\n\013LabelsEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:b\352A_\n"
          + "!aiplatform.googleapis.com/Dataset\022:proj"
          + "ects/{project}/locations/{location}/data"
          + "sets/{dataset}\"\244\003\n\020ImportDataConfig\022;\n\ng"
          + "cs_source\030\001 \001(\0132%.google.cloud.aiplatfor"
          + "m.v1.GcsSourceH\000\022Z\n\020data_item_labels\030\002 \003"
          + "(\0132@.google.cloud.aiplatform.v1.ImportDa"
          + "taConfig.DataItemLabelsEntry\022]\n\021annotati"
          + "on_labels\030\003 \003(\0132B.google.cloud.aiplatfor"
          + "m.v1.ImportDataConfig.AnnotationLabelsEn"
          + "try\022\036\n\021import_schema_uri\030\004 \001(\tB\003\340A\002\0325\n\023D"
          + "ataItemLabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001\0327\n\025AnnotationLabelsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\010\n\006source\"\345\003"
          + "\n\020ExportDataConfig\022E\n\017gcs_destination\030\001 "
          + "\001(\0132*.google.cloud.aiplatform.v1.GcsDest"
          + "inationH\000\022I\n\016fraction_split\030\005 \001(\0132/.goog"
          + "le.cloud.aiplatform.v1.ExportFractionSpl"
          + "itH\001\022E\n\014filter_split\030\007 \001(\0132-.google.clou"
          + "d.aiplatform.v1.ExportFilterSplitH\001\022\032\n\022a"
          + "nnotations_filter\030\002 \001(\t\022\026\n\016saved_query_i"
          + "d\030\013 \001(\t\022\035\n\025annotation_schema_uri\030\014 \001(\t\022J"
          + "\n\nexport_use\030\004 \001(\01626.google.cloud.aiplat"
          + "form.v1.ExportDataConfig.ExportUse\"A\n\tEx"
          + "portUse\022\032\n\026EXPORT_USE_UNSPECIFIED\020\000\022\030\n\024C"
          + "USTOM_CODE_TRAINING\020\006B\r\n\013destinationB\007\n\005"
          + "split\"d\n\023ExportFractionSplit\022\031\n\021training"
          + "_fraction\030\001 \001(\001\022\033\n\023validation_fraction\030\002"
          + " \001(\001\022\025\n\rtest_fraction\030\003 \001(\001\"k\n\021ExportFil"
          + "terSplit\022\034\n\017training_filter\030\001 \001(\tB\003\340A\002\022\036"
          + "\n\021validation_filter\030\002 \001(\tB\003\340A\002\022\030\n\013test_f"
          + "ilter\030\003 \001(\tB\003\340A\002B\312\001\n\036com.google.cloud.ai"
          + "platform.v1B\014DatasetProtoP\001Z>cloud.googl"
          + "e.com/go/aiplatform/apiv1/aiplatformpb;a"
          + "iplatformpb\252\002\032Google.Cloud.AIPlatform.V1"
          + "\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::"
          + "Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.SavedQueryProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Dataset_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MetadataSchemaUri",
              "Metadata",
              "DataItemCount",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "SavedQueries",
              "EncryptionSpec",
              "MetadataArtifact",
            });
    internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Dataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "DataItemLabels", "AnnotationLabels", "ImportSchemaUri", "Source",
            });
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ExportDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ExportDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExportDataConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination",
              "FractionSplit",
              "FilterSplit",
              "AnnotationsFilter",
              "SavedQueryId",
              "AnnotationSchemaUri",
              "ExportUse",
              "Destination",
              "Split",
            });
    internal_static_google_cloud_aiplatform_v1_ExportFractionSplit_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ExportFractionSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExportFractionSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction",
            });
    internal_static_google_cloud_aiplatform_v1_ExportFilterSplit_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ExportFilterSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExportFilterSplit_descriptor,
            new java.lang.String[] {
              "TrainingFilter", "ValidationFilter", "TestFilter",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.SavedQueryProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
