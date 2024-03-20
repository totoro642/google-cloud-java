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
// source: google/cloud/asset/v1p1beta1/assets.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1p1beta1;

public final class AssetProto {
  private AssetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p1beta1_Permissions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p1beta1_Permissions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/asset/v1p1beta1/assets.pr"
          + "oto\022\034google.cloud.asset.v1p1beta1\032\032googl"
          + "e/iam/v1/policy.proto\"\302\002\n\030StandardResour"
          + "ceMetadata\022\014\n\004name\030\001 \001(\t\022\022\n\nasset_type\030\002"
          + " \001(\t\022\017\n\007project\030\003 \001(\t\022\024\n\014display_name\030\004 "
          + "\001(\t\022\023\n\013description\030\005 \001(\t\022\035\n\025additional_a"
          + "ttributes\030\n \003(\t\022\020\n\010location\030\013 \001(\t\022R\n\006lab"
          + "els\030\014 \003(\0132B.google.cloud.asset.v1p1beta1"
          + ".StandardResourceMetadata.LabelsEntry\022\024\n"
          + "\014network_tags\030\r \003(\t\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\243\003\n\025IamPolicy"
          + "SearchResult\022\020\n\010resource\030\001 \001(\t\022\017\n\007projec"
          + "t\030\003 \001(\t\022%\n\006policy\030\004 \001(\0132\025.google.iam.v1."
          + "Policy\022T\n\013explanation\030\005 \001(\0132?.google.clo"
          + "ud.asset.v1p1beta1.IamPolicySearchResult"
          + ".Explanation\032\351\001\n\013Explanation\022t\n\023matched_"
          + "permissions\030\001 \003(\0132W.google.cloud.asset.v"
          + "1p1beta1.IamPolicySearchResult.Explanati"
          + "on.MatchedPermissionsEntry\032d\n\027MatchedPer"
          + "missionsEntry\022\013\n\003key\030\001 \001(\t\0228\n\005value\030\002 \001("
          + "\0132).google.cloud.asset.v1p1beta1.Permiss"
          + "ions:\0028\001\"\"\n\013Permissions\022\023\n\013permissions\030\001"
          + " \003(\tB\251\001\n com.google.cloud.asset.v1p1beta"
          + "1B\nAssetProtoP\001Z6cloud.google.com/go/ass"
          + "et/apiv1p1beta1/assetpb;assetpb\370\001\001\252\002\034Goo"
          + "gle.Cloud.Asset.V1P1Beta1\312\002\034Google\\Cloud"
          + "\\Asset\\V1p1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.iam.v1.PolicyProto.getDescriptor(),
            });
    internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_descriptor,
            new java.lang.String[] {
              "Name",
              "AssetType",
              "Project",
              "DisplayName",
              "Description",
              "AdditionalAttributes",
              "Location",
              "Labels",
              "NetworkTags",
            });
    internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_LabelsEntry_descriptor =
        internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_StandardResourceMetadata_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_descriptor,
            new java.lang.String[] {
              "Resource", "Project", "Policy", "Explanation",
            });
    internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_descriptor =
        internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_descriptor,
            new java.lang.String[] {
              "MatchedPermissions",
            });
    internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor =
        internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_IamPolicySearchResult_Explanation_MatchedPermissionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_asset_v1p1beta1_Permissions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1p1beta1_Permissions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p1beta1_Permissions_descriptor,
            new java.lang.String[] {
              "Permissions",
            });
    com.google.iam.v1.PolicyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
