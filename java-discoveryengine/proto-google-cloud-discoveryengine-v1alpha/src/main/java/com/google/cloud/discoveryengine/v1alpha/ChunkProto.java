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
// source: google/cloud/discoveryengine/v1alpha/chunk.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public final class ChunkProto {
  private ChunkProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Chunk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Chunk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Chunk_DocumentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Chunk_DocumentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Chunk_PageSpan_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Chunk_PageSpan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Chunk_ChunkMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Chunk_ChunkMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/discoveryengine/v1alpha/c"
          + "hunk.proto\022$google.cloud.discoveryengine"
          + ".v1alpha\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032\034google/pro"
          + "tobuf/struct.proto\"\230\007\n\005Chunk\022\014\n\004name\030\001 \001"
          + "(\t\022\n\n\002id\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\022W\n\021docum"
          + "ent_metadata\030\005 \001(\0132<.google.cloud.discov"
          + "eryengine.v1alpha.Chunk.DocumentMetadata"
          + "\0229\n\023derived_struct_data\030\004 \001(\0132\027.google.p"
          + "rotobuf.StructB\003\340A\003\022G\n\tpage_span\030\006 \001(\01324"
          + ".google.cloud.discoveryengine.v1alpha.Ch"
          + "unk.PageSpan\022V\n\016chunk_metadata\030\007 \001(\01329.g"
          + "oogle.cloud.discoveryengine.v1alpha.Chun"
          + "k.ChunkMetadataB\003\340A\003\032.\n\020DocumentMetadata"
          + "\022\013\n\003uri\030\001 \001(\t\022\r\n\005title\030\002 \001(\t\0320\n\010PageSpan"
          + "\022\022\n\npage_start\030\001 \001(\005\022\020\n\010page_end\030\002 \001(\005\032\227"
          + "\001\n\rChunkMetadata\022D\n\017previous_chunks\030\001 \003("
          + "\0132+.google.cloud.discoveryengine.v1alpha"
          + ".Chunk\022@\n\013next_chunks\030\002 \003(\0132+.google.clo"
          + "ud.discoveryengine.v1alpha.Chunk:\262\002\352A\256\002\n"
          + "$discoveryengine.googleapis.com/Chunk\022up"
          + "rojects/{project}/locations/{location}/d"
          + "ataStores/{data_store}/branches/{branch}"
          + "/documents/{document}/chunks/{chunk}\022\216\001p"
          + "rojects/{project}/locations/{location}/c"
          + "ollections/{collection}/dataStores/{data"
          + "_store}/branches/{branch}/documents/{doc"
          + "ument}/chunks/{chunk}B\226\002\n(com.google.clo"
          + "ud.discoveryengine.v1alphaB\nChunkProtoP\001"
          + "ZRcloud.google.com/go/discoveryengine/ap"
          + "iv1alpha/discoveryenginepb;discoveryengi"
          + "nepb\242\002\017DISCOVERYENGINE\252\002$Google.Cloud.Di"
          + "scoveryEngine.V1Alpha\312\002$Google\\Cloud\\Dis"
          + "coveryEngine\\V1alpha\352\002\'Google::Cloud::Di"
          + "scoveryEngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Chunk_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Chunk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Chunk_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "Content",
              "DocumentMetadata",
              "DerivedStructData",
              "PageSpan",
              "ChunkMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Chunk_DocumentMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Chunk_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Chunk_DocumentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Chunk_DocumentMetadata_descriptor,
            new java.lang.String[] {
              "Uri", "Title",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Chunk_PageSpan_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Chunk_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Chunk_PageSpan_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Chunk_PageSpan_descriptor,
            new java.lang.String[] {
              "PageStart", "PageEnd",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Chunk_ChunkMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Chunk_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_Chunk_ChunkMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Chunk_ChunkMetadata_descriptor,
            new java.lang.String[] {
              "PreviousChunks", "NextChunks",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
