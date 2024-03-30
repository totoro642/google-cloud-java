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
// source: google/cloud/aiplatform/v1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class FeatureOnlineStoreServiceProto {
  private FeatureOnlineStoreServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_CompositeKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_CompositeKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Embedding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Embedding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_StringFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_StringFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Parameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Parameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighbors_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighbors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighbors_Neighbor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighbors_Neighbor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/aiplatform/v1/feature_onl"
          + "ine_store_service.proto\022\032google.cloud.ai"
          + "platform.v1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032<google/cloud/aiplatform/v1/featu"
          + "restore_online_service.proto\032\034google/pro"
          + "tobuf/struct.proto\"\245\001\n\022FeatureViewDataKe"
          + "y\022\r\n\003key\030\001 \001(\tH\000\022T\n\rcomposite_key\030\002 \001(\0132"
          + ";.google.cloud.aiplatform.v1.FeatureView"
          + "DataKey.CompositeKeyH\000\032\035\n\014CompositeKey\022\r"
          + "\n\005parts\030\001 \003(\tB\013\n\tkey_oneof\"\364\001\n\031FetchFeat"
          + "ureValuesRequest\022C\n\014feature_view\030\001 \001(\tB-"
          + "\340A\002\372A\'\n%aiplatform.googleapis.com/Featur"
          + "eView\022E\n\010data_key\030\006 \001(\0132..google.cloud.a"
          + "iplatform.v1.FeatureViewDataKeyB\003\340A\001\022K\n\013"
          + "data_format\030\007 \001(\01621.google.cloud.aiplatf"
          + "orm.v1.FeatureViewDataFormatB\003\340A\001\"\376\003\n\032Fe"
          + "tchFeatureValuesResponse\022e\n\nkey_values\030\003"
          + " \001(\0132O.google.cloud.aiplatform.v1.FetchF"
          + "eatureValuesResponse.FeatureNameValuePai"
          + "rListH\000\022/\n\014proto_struct\030\002 \001(\0132\027.google.p"
          + "rotobuf.StructH\000\022@\n\010data_key\030\004 \001(\0132..goo"
          + "gle.cloud.aiplatform.v1.FeatureViewDataK"
          + "ey\032\373\001\n\030FeatureNameValuePairList\022v\n\010featu"
          + "res\030\001 \003(\0132d.google.cloud.aiplatform.v1.F"
          + "etchFeatureValuesResponse.FeatureNameVal"
          + "uePairList.FeatureNameValuePair\032g\n\024Featu"
          + "reNameValuePair\0229\n\005value\030\002 \001(\0132(.google."
          + "cloud.aiplatform.v1.FeatureValueH\000\022\014\n\004na"
          + "me\030\001 \001(\tB\006\n\004dataB\010\n\006format\"\363\004\n\024NearestNe"
          + "ighborQuery\022\030\n\tentity_id\030\001 \001(\tB\003\340A\001H\000\022T\n"
          + "\tembedding\030\002 \001(\0132:.google.cloud.aiplatfo"
          + "rm.v1.NearestNeighborQuery.EmbeddingB\003\340A"
          + "\001H\000\022\033\n\016neighbor_count\030\003 \001(\005B\003\340A\001\022Z\n\016stri"
          + "ng_filters\030\004 \003(\0132=.google.cloud.aiplatfo"
          + "rm.v1.NearestNeighborQuery.StringFilterB"
          + "\003\340A\001\0222\n%per_crowding_attribute_neighbor_"
          + "count\030\005 \001(\005B\003\340A\001\022T\n\nparameters\030\007 \001(\0132;.g"
          + "oogle.cloud.aiplatform.v1.NearestNeighbo"
          + "rQuery.ParametersB\003\340A\001\032\037\n\tEmbedding\022\022\n\005v"
          + "alue\030\001 \003(\002B\003\340A\001\032V\n\014StringFilter\022\021\n\004name\030"
          + "\001 \001(\tB\003\340A\002\022\031\n\014allow_tokens\030\002 \003(\tB\003\340A\001\022\030\n"
          + "\013deny_tokens\030\003 \003(\tB\003\340A\001\032c\n\nParameters\022,\n"
          + "\037approximate_neighbor_candidates\030\001 \001(\005B\003"
          + "\340A\001\022\'\n\032leaf_nodes_search_fraction\030\002 \001(\001B"
          + "\003\340A\001B\n\n\010instance\"\312\001\n\034SearchNearestEntiti"
          + "esRequest\022C\n\014feature_view\030\001 \001(\tB-\340A\002\372A\'\n"
          + "%aiplatform.googleapis.com/FeatureView\022D"
          + "\n\005query\030\002 \001(\01320.google.cloud.aiplatform."
          + "v1.NearestNeighborQueryB\003\340A\002\022\037\n\022return_f"
          + "ull_entity\030\003 \001(\010B\003\340A\001\"\341\001\n\020NearestNeighbo"
          + "rs\022H\n\tneighbors\030\001 \003(\01325.google.cloud.aip"
          + "latform.v1.NearestNeighbors.Neighbor\032\202\001\n"
          + "\010Neighbor\022\021\n\tentity_id\030\001 \001(\t\022\020\n\010distance"
          + "\030\002 \001(\001\022Q\n\021entity_key_values\030\003 \001(\01326.goog"
          + "le.cloud.aiplatform.v1.FetchFeatureValue"
          + "sResponse\"h\n\035SearchNearestEntitiesRespon"
          + "se\022G\n\021nearest_neighbors\030\001 \001(\0132,.google.c"
          + "loud.aiplatform.v1.NearestNeighbors*b\n\025F"
          + "eatureViewDataFormat\022(\n$FEATURE_VIEW_DAT"
          + "A_FORMAT_UNSPECIFIED\020\000\022\r\n\tKEY_VALUE\020\001\022\020\n"
          + "\014PROTO_STRUCT\020\0022\370\004\n\031FeatureOnlineStoreSe"
          + "rvice\022\213\002\n\022FetchFeatureValues\0225.google.cl"
          + "oud.aiplatform.v1.FetchFeatureValuesRequ"
          + "est\0326.google.cloud.aiplatform.v1.FetchFe"
          + "atureValuesResponse\"\205\001\332A\026feature_view, d"
          + "ata_key\202\323\344\223\002f\"a/v1/{feature_view=project"
          + "s/*/locations/*/featureOnlineStores/*/fe"
          + "atureViews/*}:fetchFeatureValues:\001*\022\375\001\n\025"
          + "SearchNearestEntities\0228.google.cloud.aip"
          + "latform.v1.SearchNearestEntitiesRequest\032"
          + "9.google.cloud.aiplatform.v1.SearchNeare"
          + "stEntitiesResponse\"o\202\323\344\223\002i\"d/v1/{feature"
          + "_view=projects/*/locations/*/featureOnli"
          + "neStores/*/featureViews/*}:searchNearest"
          + "Entities:\001*\032M\312A\031aiplatform.googleapis.co"
          + "m\322A.https://www.googleapis.com/auth/clou"
          + "d-platformB\334\001\n\036com.google.cloud.aiplatfo"
          + "rm.v1B\036FeatureOnlineStoreServiceProtoP\001Z"
          + ">cloud.google.com/go/aiplatform/apiv1/ai"
          + "platformpb;aiplatformpb\252\002\032Google.Cloud.A"
          + "IPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V"
          + "1\352\002\035Google::Cloud::AIPlatform::V1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_descriptor,
            new java.lang.String[] {
              "Key", "CompositeKey", "KeyOneof",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_CompositeKey_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_CompositeKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_CompositeKey_descriptor,
            new java.lang.String[] {
              "Parts",
            });
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor,
            new java.lang.String[] {
              "FeatureView", "DataKey", "DataFormat",
            });
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_descriptor,
            new java.lang.String[] {
              "KeyValues", "ProtoStruct", "DataKey", "Format",
            });
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_descriptor =
        internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_descriptor,
            new java.lang.String[] {
              "Features",
            });
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_descriptor =
        internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_descriptor,
            new java.lang.String[] {
              "Value", "Name", "Data",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_descriptor,
            new java.lang.String[] {
              "EntityId",
              "Embedding",
              "NeighborCount",
              "StringFilters",
              "PerCrowdingAttributeNeighborCount",
              "Parameters",
              "Instance",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Embedding_descriptor =
        internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Embedding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Embedding_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_StringFilter_descriptor =
        internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_StringFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_StringFilter_descriptor,
            new java.lang.String[] {
              "Name", "AllowTokens", "DenyTokens",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Parameters_descriptor =
        internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Parameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborQuery_Parameters_descriptor,
            new java.lang.String[] {
              "ApproximateNeighborCandidates", "LeafNodesSearchFraction",
            });
    internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesRequest_descriptor,
            new java.lang.String[] {
              "FeatureView", "Query", "ReturnFullEntity",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighbors_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_NearestNeighbors_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighbors_descriptor,
            new java.lang.String[] {
              "Neighbors",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighbors_Neighbor_descriptor =
        internal_static_google_cloud_aiplatform_v1_NearestNeighbors_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_NearestNeighbors_Neighbor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighbors_Neighbor_descriptor,
            new java.lang.String[] {
              "EntityId", "Distance", "EntityKeyValues",
            });
    internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_descriptor,
            new java.lang.String[] {
              "NearestNeighbors",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
