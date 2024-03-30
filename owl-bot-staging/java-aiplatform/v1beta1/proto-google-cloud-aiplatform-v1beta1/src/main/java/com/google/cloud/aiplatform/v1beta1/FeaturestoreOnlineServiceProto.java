// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_online_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class FeaturestoreOnlineServiceProto {
  private FeaturestoreOnlineServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_FeatureValuesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_FeatureValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/aiplatform/v1beta1/featur" +
      "estore_online_service.proto\022\037google.clou" +
      "d.aiplatform.v1beta1\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\0326google/cloud/aiplatform" +
      "/v1beta1/feature_selector.proto\032+google/" +
      "cloud/aiplatform/v1beta1/types.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\"\261\001\n\031WriteF" +
      "eatureValuesRequest\022A\n\013entity_type\030\001 \001(\t" +
      "B,\340A\002\372A&\n$aiplatform.googleapis.com/Enti" +
      "tyType\022Q\n\010payloads\030\002 \003(\0132:.google.cloud." +
      "aiplatform.v1beta1.WriteFeatureValuesPay" +
      "loadB\003\340A\002\"\204\002\n\031WriteFeatureValuesPayload\022" +
      "\026\n\tentity_id\030\001 \001(\tB\003\340A\002\022j\n\016feature_value" +
      "s\030\002 \003(\0132M.google.cloud.aiplatform.v1beta" +
      "1.WriteFeatureValuesPayload.FeatureValue" +
      "sEntryB\003\340A\002\032c\n\022FeatureValuesEntry\022\013\n\003key" +
      "\030\001 \001(\t\022<\n\005value\030\002 \001(\0132-.google.cloud.aip" +
      "latform.v1beta1.FeatureValue:\0028\001\"\034\n\032Writ" +
      "eFeatureValuesResponse\"\306\001\n\030ReadFeatureVa" +
      "luesRequest\022A\n\013entity_type\030\001 \001(\tB,\340A\002\372A&" +
      "\n$aiplatform.googleapis.com/EntityType\022\026" +
      "\n\tentity_id\030\002 \001(\tB\003\340A\002\022O\n\020feature_select" +
      "or\030\003 \001(\01320.google.cloud.aiplatform.v1bet" +
      "a1.FeatureSelectorB\003\340A\002\"\263\005\n\031ReadFeatureV" +
      "aluesResponse\022Q\n\006header\030\001 \001(\0132A.google.c" +
      "loud.aiplatform.v1beta1.ReadFeatureValue" +
      "sResponse.Header\022Z\n\013entity_view\030\002 \001(\0132E." +
      "google.cloud.aiplatform.v1beta1.ReadFeat" +
      "ureValuesResponse.EntityView\032\037\n\021FeatureD" +
      "escriptor\022\n\n\002id\030\001 \001(\t\032\263\001\n\006Header\022>\n\013enti" +
      "ty_type\030\001 \001(\tB)\372A&\n$aiplatform.googleapi" +
      "s.com/EntityType\022i\n\023feature_descriptors\030" +
      "\002 \003(\0132L.google.cloud.aiplatform.v1beta1." +
      "ReadFeatureValuesResponse.FeatureDescrip" +
      "tor\032\217\002\n\nEntityView\022\021\n\tentity_id\030\001 \001(\t\022X\n" +
      "\004data\030\002 \003(\0132J.google.cloud.aiplatform.v1" +
      "beta1.ReadFeatureValuesResponse.EntityVi" +
      "ew.Data\032\223\001\n\004Data\022>\n\005value\030\001 \001(\0132-.google" +
      ".cloud.aiplatform.v1beta1.FeatureValueH\000" +
      "\022C\n\006values\030\002 \001(\01321.google.cloud.aiplatfo" +
      "rm.v1beta1.FeatureValueListH\000B\006\n\004data\"\320\001" +
      "\n!StreamingReadFeatureValuesRequest\022A\n\013e" +
      "ntity_type\030\001 \001(\tB,\340A\002\372A&\n$aiplatform.goo" +
      "gleapis.com/EntityType\022\027\n\nentity_ids\030\002 \003" +
      "(\tB\003\340A\002\022O\n\020feature_selector\030\003 \001(\01320.goog" +
      "le.cloud.aiplatform.v1beta1.FeatureSelec" +
      "torB\003\340A\002\"\276\004\n\014FeatureValue\022\024\n\nbool_value\030" +
      "\001 \001(\010H\000\022\026\n\014double_value\030\002 \001(\001H\000\022\025\n\013int64" +
      "_value\030\005 \001(\003H\000\022\026\n\014string_value\030\006 \001(\tH\000\022F" +
      "\n\020bool_array_value\030\007 \001(\0132*.google.cloud." +
      "aiplatform.v1beta1.BoolArrayH\000\022J\n\022double" +
      "_array_value\030\010 \001(\0132,.google.cloud.aiplat" +
      "form.v1beta1.DoubleArrayH\000\022H\n\021int64_arra" +
      "y_value\030\013 \001(\0132+.google.cloud.aiplatform." +
      "v1beta1.Int64ArrayH\000\022J\n\022string_array_val" +
      "ue\030\014 \001(\0132,.google.cloud.aiplatform.v1bet" +
      "a1.StringArrayH\000\022\025\n\013bytes_value\030\r \001(\014H\000\022" +
      "H\n\010metadata\030\016 \001(\01326.google.cloud.aiplatf" +
      "orm.v1beta1.FeatureValue.Metadata\032=\n\010Met" +
      "adata\0221\n\rgenerate_time\030\001 \001(\0132\032.google.pr" +
      "otobuf.TimestampB\007\n\005value\"Q\n\020FeatureValu" +
      "eList\022=\n\006values\030\001 \003(\0132-.google.cloud.aip" +
      "latform.v1beta1.FeatureValue2\253\007\n Feature" +
      "storeOnlineServingService\022\202\002\n\021ReadFeatur" +
      "eValues\0229.google.cloud.aiplatform.v1beta" +
      "1.ReadFeatureValuesRequest\032:.google.clou" +
      "d.aiplatform.v1beta1.ReadFeatureValuesRe" +
      "sponse\"v\332A\013entity_type\202\323\344\223\002b\"]/v1beta1/{" +
      "entity_type=projects/*/locations/*/featu" +
      "restores/*/entityTypes/*}:readFeatureVal" +
      "ues:\001*\022\237\002\n\032StreamingReadFeatureValues\022B." +
      "google.cloud.aiplatform.v1beta1.Streamin" +
      "gReadFeatureValuesRequest\032:.google.cloud" +
      ".aiplatform.v1beta1.ReadFeatureValuesRes" +
      "ponse\"\177\332A\013entity_type\202\323\344\223\002k\"f/v1beta1/{e" +
      "ntity_type=projects/*/locations/*/featur" +
      "estores/*/entityTypes/*}:streamingReadFe" +
      "atureValues:\001*0\001\022\220\002\n\022WriteFeatureValues\022" +
      ":.google.cloud.aiplatform.v1beta1.WriteF" +
      "eatureValuesRequest\032;.google.cloud.aipla" +
      "tform.v1beta1.WriteFeatureValuesResponse" +
      "\"\200\001\332A\024entity_type,payloads\202\323\344\223\002c\"^/v1bet" +
      "a1/{entity_type=projects/*/locations/*/f" +
      "eaturestores/*/entityTypes/*}:writeFeatu" +
      "reValues:\001*\032M\312A\031aiplatform.googleapis.co" +
      "m\322A.https://www.googleapis.com/auth/clou" +
      "d-platformB\365\001\n#com.google.cloud.aiplatfo" +
      "rm.v1beta1B\036FeaturestoreOnlineServicePro" +
      "toP\001ZCcloud.google.com/go/aiplatform/api" +
      "v1beta1/aiplatformpb;aiplatformpb\252\002\037Goog" +
      "le.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Clo" +
      "ud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::A" +
      "IPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.TypesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesRequest_descriptor,
        new java.lang.String[] { "EntityType", "Payloads", });
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_descriptor,
        new java.lang.String[] { "EntityId", "FeatureValues", });
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_FeatureValuesEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_FeatureValuesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesPayload_FeatureValuesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_WriteFeatureValuesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesRequest_descriptor,
        new java.lang.String[] { "EntityType", "EntityId", "FeatureSelector", });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor,
        new java.lang.String[] { "Header", "EntityView", });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_Header_descriptor,
        new java.lang.String[] { "EntityType", "FeatureDescriptors", });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_descriptor,
        new java.lang.String[] { "EntityId", "Data", });
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ReadFeatureValuesResponse_EntityView_Data_descriptor,
        new java.lang.String[] { "Value", "Values", "Data", });
    internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_StreamingReadFeatureValuesRequest_descriptor,
        new java.lang.String[] { "EntityType", "EntityIds", "FeatureSelector", });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_descriptor,
        new java.lang.String[] { "BoolValue", "DoubleValue", "Int64Value", "StringValue", "BoolArrayValue", "DoubleArrayValue", "Int64ArrayValue", "StringArrayValue", "BytesValue", "Metadata", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_FeatureValue_Metadata_descriptor,
        new java.lang.String[] { "GenerateTime", });
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_FeatureValueList_descriptor,
        new java.lang.String[] { "Values", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureSelectorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.TypesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
