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
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

public final class AssetServiceProto {
  private AssetServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_CreateFeedRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_CreateFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_GetFeedRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_GetFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_ListFeedsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_ListFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_ListFeedsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_ListFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_DeleteFeedRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_DeleteFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_PubsubDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_PubsubDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_asset_v1p2beta1_Feed_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p2beta1_Feed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/asset/v1p2beta1/asset_ser"
          + "vice.proto\022\034google.cloud.asset.v1p2beta1"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032)goo"
          + "gle/cloud/asset/v1p2beta1/assets.proto\032\033"
          + "google/protobuf/empty.proto\032 google/prot"
          + "obuf/field_mask.proto\"u\n\021CreateFeedReque"
          + "st\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\024\n\007feed_id\030\002 \001(\t"
          + "B\003\340A\002\0225\n\004feed\030\003 \001(\0132\".google.cloud.asset"
          + ".v1p2beta1.FeedB\003\340A\002\"F\n\016GetFeedRequest\0224"
          + "\n\004name\030\001 \001(\tB&\340A\002\372A \n\036cloudasset.googlea"
          + "pis.com/Feed\"\'\n\020ListFeedsRequest\022\023\n\006pare"
          + "nt\030\001 \001(\tB\003\340A\002\"F\n\021ListFeedsResponse\0221\n\005fe"
          + "eds\030\001 \003(\0132\".google.cloud.asset.v1p2beta1"
          + ".Feed\"\200\001\n\021UpdateFeedRequest\0225\n\004feed\030\001 \001("
          + "\0132\".google.cloud.asset.v1p2beta1.FeedB\003\340"
          + "A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.protobu"
          + "f.FieldMaskB\003\340A\002\"I\n\021DeleteFeedRequest\0224\n"
          + "\004name\030\001 \001(\tB&\340A\002\372A \n\036cloudasset.googleap"
          + "is.com/Feed\"f\n\014OutputConfig\022G\n\017gcs_desti"
          + "nation\030\001 \001(\0132,.google.cloud.asset.v1p2be"
          + "ta1.GcsDestinationH\000B\r\n\013destination\"-\n\016G"
          + "csDestination\022\r\n\003uri\030\001 \001(\tH\000B\014\n\nobject_u"
          + "ri\"\"\n\021PubsubDestination\022\r\n\005topic\030\001 \001(\t\"p"
          + "\n\020FeedOutputConfig\022M\n\022pubsub_destination"
          + "\030\001 \001(\0132/.google.cloud.asset.v1p2beta1.Pu"
          + "bsubDestinationH\000B\r\n\013destination\"\351\002\n\004Fee"
          + "d\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\023\n\013asset_names\030\002 \003("
          + "\t\022\023\n\013asset_types\030\003 \003(\t\022?\n\014content_type\030\004"
          + " \001(\0162).google.cloud.asset.v1p2beta1.Cont"
          + "entType\022O\n\022feed_output_config\030\005 \001(\0132..go"
          + "ogle.cloud.asset.v1p2beta1.FeedOutputCon"
          + "figB\003\340A\002:\221\001\352A\215\001\n\036cloudasset.googleapis.c"
          + "om/Feed\022\037projects/{project}/feeds/{feed}"
          + "\022\035folders/{folder}/feeds/{feed}\022)organiz"
          + "ations/{organization}/feeds/{feed} \001*I\n\013"
          + "ContentType\022\034\n\030CONTENT_TYPE_UNSPECIFIED\020"
          + "\000\022\014\n\010RESOURCE\020\001\022\016\n\nIAM_POLICY\020\0022\277\006\n\014Asse"
          + "tService\022\224\001\n\nCreateFeed\022/.google.cloud.a"
          + "sset.v1p2beta1.CreateFeedRequest\032\".googl"
          + "e.cloud.asset.v1p2beta1.Feed\"1\202\323\344\223\002\"\"\035/v"
          + "1p2beta1/{parent=*/*}/feeds:\001*\332A\006parent\022"
          + "\211\001\n\007GetFeed\022,.google.cloud.asset.v1p2bet"
          + "a1.GetFeedRequest\032\".google.cloud.asset.v"
          + "1p2beta1.Feed\",\202\323\344\223\002\037\022\035/v1p2beta1/{name="
          + "*/*/feeds/*}\332A\004name\022\234\001\n\tListFeeds\022..goog"
          + "le.cloud.asset.v1p2beta1.ListFeedsReques"
          + "t\032/.google.cloud.asset.v1p2beta1.ListFee"
          + "dsResponse\".\202\323\344\223\002\037\022\035/v1p2beta1/{parent=*"
          + "/*}/feeds\332A\006parent\022\227\001\n\nUpdateFeed\022/.goog"
          + "le.cloud.asset.v1p2beta1.UpdateFeedReque"
          + "st\032\".google.cloud.asset.v1p2beta1.Feed\"4"
          + "\202\323\344\223\002\'2\"/v1p2beta1/{feed.name=*/*/feeds/"
          + "*}:\001*\332A\004feed\022\203\001\n\nDeleteFeed\022/.google.clo"
          + "ud.asset.v1p2beta1.DeleteFeedRequest\032\026.g"
          + "oogle.protobuf.Empty\",\202\323\344\223\002\037*\035/v1p2beta1"
          + "/{name=*/*/feeds/*}\332A\004name\032M\312A\031cloudasse"
          + "t.googleapis.com\322A.https://www.googleapi"
          + "s.com/auth/cloud-platformB\270\001\n com.google"
          + ".cloud.asset.v1p2beta1B\021AssetServiceProt"
          + "oP\001ZAgoogle.golang.org/genproto/googleap"
          + "is/cloud/asset/v1p2beta1;asset\252\002\034Google."
          + "Cloud.Asset.V1p2Beta1\312\002\034Google\\Cloud\\Ass"
          + "et\\V1p2beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.asset.v1p2beta1.AssetProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_asset_v1p2beta1_CreateFeedRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p2beta1_CreateFeedRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_CreateFeedRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FeedId", "Feed",
            });
    internal_static_google_cloud_asset_v1p2beta1_GetFeedRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p2beta1_GetFeedRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_GetFeedRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_asset_v1p2beta1_ListFeedsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_asset_v1p2beta1_ListFeedsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_ListFeedsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_asset_v1p2beta1_ListFeedsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_asset_v1p2beta1_ListFeedsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_ListFeedsResponse_descriptor,
            new java.lang.String[] {
              "Feeds",
            });
    internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_UpdateFeedRequest_descriptor,
            new java.lang.String[] {
              "Feed", "UpdateMask",
            });
    internal_static_google_cloud_asset_v1p2beta1_DeleteFeedRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_asset_v1p2beta1_DeleteFeedRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_DeleteFeedRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_asset_v1p2beta1_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_asset_v1p2beta1_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "Destination",
            });
    internal_static_google_cloud_asset_v1p2beta1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_asset_v1p2beta1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_GcsDestination_descriptor,
            new java.lang.String[] {
              "Uri", "ObjectUri",
            });
    internal_static_google_cloud_asset_v1p2beta1_PubsubDestination_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_asset_v1p2beta1_PubsubDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_PubsubDestination_descriptor,
            new java.lang.String[] {
              "Topic",
            });
    internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_FeedOutputConfig_descriptor,
            new java.lang.String[] {
              "PubsubDestination", "Destination",
            });
    internal_static_google_cloud_asset_v1p2beta1_Feed_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_asset_v1p2beta1_Feed_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_asset_v1p2beta1_Feed_descriptor,
            new java.lang.String[] {
              "Name", "AssetNames", "AssetTypes", "ContentType", "FeedOutputConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.asset.v1p2beta1.AssetProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
