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
// source: google/appengine/v1/location.proto

package com.google.appengine.v1;

public final class LocationProto {
  private LocationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_LocationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_LocationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/appengine/v1/location.proto\022\023go"
          + "ogle.appengine.v1\032\037google/api/field_beha"
          + "vior.proto\"\205\001\n\020LocationMetadata\022&\n\036stand"
          + "ard_environment_available\030\002 \001(\010\022&\n\036flexi"
          + "ble_environment_available\030\004 \001(\010\022!\n\024searc"
          + "h_api_available\030\006 \001(\010B\003\340A\003B\276\001\n\027com.googl"
          + "e.appengine.v1B\rLocationProtoP\001Z;cloud.g"
          + "oogle.com/go/appengine/apiv1/appenginepb"
          + ";appenginepb\252\002\031Google.Cloud.AppEngine.V1"
          + "\312\002\031Google\\Cloud\\AppEngine\\V1\352\002\034Google::C"
          + "loud::AppEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_LocationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_LocationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_LocationMetadata_descriptor,
            new java.lang.String[] {
              "StandardEnvironmentAvailable", "FlexibleEnvironmentAvailable", "SearchApiAvailable",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
