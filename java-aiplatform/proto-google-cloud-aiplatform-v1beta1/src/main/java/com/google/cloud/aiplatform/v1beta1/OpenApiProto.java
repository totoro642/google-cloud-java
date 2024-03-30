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
// source: google/cloud/aiplatform/v1beta1/openapi.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class OpenApiProto {
  private OpenApiProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Schema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/openap"
          + "i.proto\022\037google.cloud.aiplatform.v1beta1"
          + "\032\037google/api/field_behavior.proto\032\034googl"
          + "e/protobuf/struct.proto\"\313\003\n\006Schema\0228\n\004ty"
          + "pe\030\001 \001(\0162%.google.cloud.aiplatform.v1bet"
          + "a1.TypeB\003\340A\001\022\023\n\006format\030\007 \001(\tB\003\340A\001\022\030\n\013des"
          + "cription\030\010 \001(\tB\003\340A\001\022\025\n\010nullable\030\006 \001(\010B\003\340"
          + "A\001\022;\n\005items\030\002 \001(\0132\'.google.cloud.aiplatf"
          + "orm.v1beta1.SchemaB\003\340A\001\022\021\n\004enum\030\t \003(\tB\003\340"
          + "A\001\022P\n\nproperties\030\003 \003(\01327.google.cloud.ai"
          + "platform.v1beta1.Schema.PropertiesEntryB"
          + "\003\340A\001\022\025\n\010required\030\005 \003(\tB\003\340A\001\022,\n\007example\030\004"
          + " \001(\0132\026.google.protobuf.ValueB\003\340A\001\032Z\n\017Pro"
          + "pertiesEntry\022\013\n\003key\030\001 \001(\t\0226\n\005value\030\002 \001(\013"
          + "2\'.google.cloud.aiplatform.v1beta1.Schem"
          + "a:\0028\001*e\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\n\n\006S"
          + "TRING\020\001\022\n\n\006NUMBER\020\002\022\013\n\007INTEGER\020\003\022\013\n\007BOOL"
          + "EAN\020\004\022\t\n\005ARRAY\020\005\022\n\n\006OBJECT\020\006B\343\001\n#com.goo"
          + "gle.cloud.aiplatform.v1beta1B\014OpenApiPro"
          + "toP\001ZCcloud.google.com/go/aiplatform/api"
          + "v1beta1/aiplatformpb;aiplatformpb\252\002\037Goog"
          + "le.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Clo"
          + "ud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::A"
          + "IPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Schema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Schema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Schema_descriptor,
            new java.lang.String[] {
              "Type",
              "Format",
              "Description",
              "Nullable",
              "Items",
              "Enum",
              "Properties",
              "Required",
              "Example",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Schema_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Schema_PropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
