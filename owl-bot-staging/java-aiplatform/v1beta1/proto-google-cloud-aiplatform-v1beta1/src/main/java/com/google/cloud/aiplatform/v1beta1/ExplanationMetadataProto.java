// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation_metadata.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ExplanationMetadataProto {
  private ExplanationMetadataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_Visualization_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_Visualization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1beta1/explan" +
      "ation_metadata.proto\022\037google.cloud.aipla" +
      "tform.v1beta1\032\037google/api/field_behavior" +
      ".proto\032\034google/protobuf/struct.proto\"\206\023\n" +
      "\023ExplanationMetadata\022U\n\006inputs\030\001 \003(\0132@.g" +
      "oogle.cloud.aiplatform.v1beta1.Explanati" +
      "onMetadata.InputsEntryB\003\340A\002\022W\n\007outputs\030\002" +
      " \003(\0132A.google.cloud.aiplatform.v1beta1.E" +
      "xplanationMetadata.OutputsEntryB\003\340A\002\022\'\n\037" +
      "feature_attributions_schema_uri\030\003 \001(\t\022\033\n" +
      "\023latent_space_source\030\005 \001(\t\032\347\r\n\rInputMeta" +
      "data\022/\n\017input_baselines\030\001 \003(\0132\026.google.p" +
      "rotobuf.Value\022\031\n\021input_tensor_name\030\002 \001(\t" +
      "\022]\n\010encoding\030\003 \001(\0162K.google.cloud.aiplat" +
      "form.v1beta1.ExplanationMetadata.InputMe" +
      "tadata.Encoding\022\020\n\010modality\030\004 \001(\t\022s\n\024fea" +
      "ture_value_domain\030\005 \001(\0132U.google.cloud.a" +
      "iplatform.v1beta1.ExplanationMetadata.In" +
      "putMetadata.FeatureValueDomain\022\033\n\023indice" +
      "s_tensor_name\030\006 \001(\t\022\037\n\027dense_shape_tenso" +
      "r_name\030\007 \001(\t\022\035\n\025index_feature_mapping\030\010 " +
      "\003(\t\022\033\n\023encoded_tensor_name\030\t \001(\t\0221\n\021enco" +
      "ded_baselines\030\n \003(\0132\026.google.protobuf.Va" +
      "lue\022g\n\rvisualization\030\013 \001(\0132P.google.clou" +
      "d.aiplatform.v1beta1.ExplanationMetadata" +
      ".InputMetadata.Visualization\022\022\n\ngroup_na" +
      "me\030\014 \001(\t\032j\n\022FeatureValueDomain\022\021\n\tmin_va" +
      "lue\030\001 \001(\002\022\021\n\tmax_value\030\002 \001(\002\022\025\n\roriginal" +
      "_mean\030\003 \001(\002\022\027\n\017original_stddev\030\004 \001(\002\032\352\006\n" +
      "\rVisualization\022c\n\004type\030\001 \001(\0162U.google.cl" +
      "oud.aiplatform.v1beta1.ExplanationMetada" +
      "ta.InputMetadata.Visualization.Type\022k\n\010p" +
      "olarity\030\002 \001(\0162Y.google.cloud.aiplatform." +
      "v1beta1.ExplanationMetadata.InputMetadat" +
      "a.Visualization.Polarity\022l\n\tcolor_map\030\003 " +
      "\001(\0162Y.google.cloud.aiplatform.v1beta1.Ex" +
      "planationMetadata.InputMetadata.Visualiz" +
      "ation.ColorMap\022\037\n\027clip_percent_upperboun" +
      "d\030\004 \001(\002\022\037\n\027clip_percent_lowerbound\030\005 \001(\002" +
      "\022r\n\014overlay_type\030\006 \001(\0162\\.google.cloud.ai" +
      "platform.v1beta1.ExplanationMetadata.Inp" +
      "utMetadata.Visualization.OverlayType\"6\n\004" +
      "Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\n\n\006PIXELS\020\001\022\014" +
      "\n\010OUTLINES\020\002\"J\n\010Polarity\022\030\n\024POLARITY_UNS" +
      "PECIFIED\020\000\022\014\n\010POSITIVE\020\001\022\014\n\010NEGATIVE\020\002\022\010" +
      "\n\004BOTH\020\003\"{\n\010ColorMap\022\031\n\025COLOR_MAP_UNSPEC" +
      "IFIED\020\000\022\016\n\nPINK_GREEN\020\001\022\013\n\007VIRIDIS\020\002\022\007\n\003" +
      "RED\020\003\022\t\n\005GREEN\020\004\022\r\n\tRED_GREEN\020\006\022\024\n\020PINK_" +
      "WHITE_GREEN\020\005\"b\n\013OverlayType\022\034\n\030OVERLAY_" +
      "TYPE_UNSPECIFIED\020\000\022\010\n\004NONE\020\001\022\014\n\010ORIGINAL" +
      "\020\002\022\r\n\tGRAYSCALE\020\003\022\016\n\nMASK_BLACK\020\004\"\240\001\n\010En" +
      "coding\022\030\n\024ENCODING_UNSPECIFIED\020\000\022\014\n\010IDEN" +
      "TITY\020\001\022\023\n\017BAG_OF_FEATURES\020\002\022\032\n\026BAG_OF_FE" +
      "ATURES_SPARSE\020\003\022\r\n\tINDICATOR\020\004\022\026\n\022COMBIN" +
      "ED_EMBEDDING\020\005\022\024\n\020CONCAT_EMBEDDING\020\006\032\246\001\n" +
      "\016OutputMetadata\022<\n\032index_display_name_ma" +
      "pping\030\001 \001(\0132\026.google.protobuf.ValueH\000\022\"\n" +
      "\030display_name_mapping_key\030\002 \001(\tH\000\022\032\n\022out" +
      "put_tensor_name\030\003 \001(\tB\026\n\024display_name_ma" +
      "pping\032q\n\013InputsEntry\022\013\n\003key\030\001 \001(\t\022Q\n\005val" +
      "ue\030\002 \001(\0132B.google.cloud.aiplatform.v1bet" +
      "a1.ExplanationMetadata.InputMetadata:\0028\001" +
      "\032s\n\014OutputsEntry\022\013\n\003key\030\001 \001(\t\022R\n\005value\030\002" +
      " \001(\0132C.google.cloud.aiplatform.v1beta1.E" +
      "xplanationMetadata.OutputMetadata:\0028\001B\357\001" +
      "\n#com.google.cloud.aiplatform.v1beta1B\030E" +
      "xplanationMetadataProtoP\001ZCcloud.google." +
      "com/go/aiplatform/apiv1beta1/aiplatformp" +
      "b;aiplatformpb\252\002\037Google.Cloud.AIPlatform" +
      ".V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1bet" +
      "a1\352\002\"Google::Cloud::AIPlatform::V1beta1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor,
        new java.lang.String[] { "Inputs", "Outputs", "FeatureAttributionsSchemaUri", "LatentSpaceSource", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_descriptor,
        new java.lang.String[] { "InputBaselines", "InputTensorName", "Encoding", "Modality", "FeatureValueDomain", "IndicesTensorName", "DenseShapeTensorName", "IndexFeatureMapping", "EncodedTensorName", "EncodedBaselines", "Visualization", "GroupName", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_FeatureValueDomain_descriptor,
        new java.lang.String[] { "MinValue", "MaxValue", "OriginalMean", "OriginalStddev", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_Visualization_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_Visualization_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputMetadata_Visualization_descriptor,
        new java.lang.String[] { "Type", "Polarity", "ColorMap", "ClipPercentUpperbound", "ClipPercentLowerbound", "OverlayType", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputMetadata_descriptor,
        new java.lang.String[] { "IndexDisplayNameMapping", "DisplayNameMappingKey", "OutputTensorName", "DisplayNameMapping", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_InputsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExplanationMetadata_OutputsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
