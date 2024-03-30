// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/publisher_model.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class PublisherModelProto {
  private PublisherModelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenNotebooks_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenNotebooks_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenFineTuningPipelines_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenFineTuningPipelines_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_DeployGke_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_DeployGke_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1beta1/publis" +
      "her_model.proto\022\037google.cloud.aiplatform" +
      ".v1beta1\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\0327google/clo" +
      "ud/aiplatform/v1beta1/machine_resources." +
      "proto\032+google/cloud/aiplatform/v1beta1/m" +
      "odel.proto\"\265#\n\016PublisherModel\022\021\n\004name\030\001 " +
      "\001(\tB\003\340A\003\022\032\n\nversion_id\030\002 \001(\tB\006\340A\005\340A\003\022e\n\024" +
      "open_source_category\030\007 \001(\0162B.google.clou" +
      "d.aiplatform.v1beta1.PublisherModel.Open" +
      "SourceCategoryB\003\340A\002\022K\n\006parent\030\016 \001(\01326.go" +
      "ogle.cloud.aiplatform.v1beta1.PublisherM" +
      "odel.ParentB\003\340A\001\022\\\n\021supported_actions\030\023 " +
      "\001(\0132<.google.cloud.aiplatform.v1beta1.Pu" +
      "blisherModel.CallToActionB\003\340A\001\022\027\n\nframew" +
      "orks\030\027 \003(\tB\003\340A\001\022V\n\014launch_stage\030\035 \001(\0162;." +
      "google.cloud.aiplatform.v1beta1.Publishe" +
      "rModel.LaunchStageB\003\340A\001\022X\n\rversion_state" +
      "\030% \001(\0162<.google.cloud.aiplatform.v1beta1" +
      ".PublisherModel.VersionStateB\003\340A\001\022(\n\030pub" +
      "lisher_model_template\030\036 \001(\tB\006\340A\005\340A\003\022O\n\020p" +
      "redict_schemata\030\037 \001(\01320.google.cloud.aip" +
      "latform.v1beta1.PredictSchemataB\003\340A\001\032{\n\021" +
      "ResourceReference\022\r\n\003uri\030\001 \001(\tH\000\022\027\n\rreso" +
      "urce_name\030\002 \001(\tH\000\022\026\n\010use_case\030\003 \001(\tB\002\030\001H" +
      "\000\022\031\n\013description\030\004 \001(\tB\002\030\001H\000B\013\n\treferenc" +
      "e\032~\n\006Parent\022\031\n\014display_name\030\001 \001(\tB\003\340A\002\022Y" +
      "\n\treference\030\002 \001(\0132A.google.cloud.aiplatf" +
      "orm.v1beta1.PublisherModel.ResourceRefer" +
      "enceB\003\340A\001\0329\n\rDocumentation\022\022\n\005title\030\001 \001(" +
      "\tB\003\340A\002\022\024\n\007content\030\002 \001(\tB\003\340A\002\032\332\027\n\014CallToA" +
      "ction\022d\n\rview_rest_api\030\001 \001(\0132H.google.cl" +
      "oud.aiplatform.v1beta1.PublisherModel.Ca" +
      "llToAction.ViewRestApiB\003\340A\001\022s\n\ropen_note" +
      "book\030\002 \001(\0132W.google.cloud.aiplatform.v1b" +
      "eta1.PublisherModel.CallToAction.Regiona" +
      "lResourceReferencesB\003\340A\001\022l\n\016open_noteboo" +
      "ks\030\014 \001(\0132J.google.cloud.aiplatform.v1bet" +
      "a1.PublisherModel.CallToAction.OpenNoteb" +
      "ooksB\003\340A\001H\000\210\001\001\022x\n\022create_application\030\003 \001" +
      "(\0132W.google.cloud.aiplatform.v1beta1.Pub" +
      "lisherModel.CallToAction.RegionalResourc" +
      "eReferencesB\003\340A\001\022\177\n\031open_fine_tuning_pip" +
      "eline\030\004 \001(\0132W.google.cloud.aiplatform.v1" +
      "beta1.PublisherModel.CallToAction.Region" +
      "alResourceReferencesB\003\340A\001\022\202\001\n\032open_fine_" +
      "tuning_pipelines\030\r \001(\0132T.google.cloud.ai" +
      "platform.v1beta1.PublisherModel.CallToAc" +
      "tion.OpenFineTuningPipelinesB\003\340A\001H\001\210\001\001\022\201" +
      "\001\n\033open_prompt_tuning_pipeline\030\005 \001(\0132W.g" +
      "oogle.cloud.aiplatform.v1beta1.Publisher" +
      "Model.CallToAction.RegionalResourceRefer" +
      "encesB\003\340A\001\022p\n\nopen_genie\030\006 \001(\0132W.google." +
      "cloud.aiplatform.v1beta1.PublisherModel." +
      "CallToAction.RegionalResourceReferencesB" +
      "\003\340A\001\022X\n\006deploy\030\007 \001(\0132C.google.cloud.aipl" +
      "atform.v1beta1.PublisherModel.CallToActi" +
      "on.DeployB\003\340A\001\022_\n\ndeploy_gke\030\016 \001(\0132F.goo" +
      "gle.cloud.aiplatform.v1beta1.PublisherMo" +
      "del.CallToAction.DeployGkeB\003\340A\001\022\177\n\031open_" +
      "generation_ai_studio\030\010 \001(\0132W.google.clou" +
      "d.aiplatform.v1beta1.PublisherModel.Call" +
      "ToAction.RegionalResourceReferencesB\003\340A\001" +
      "\022t\n\016request_access\030\t \001(\0132W.google.cloud." +
      "aiplatform.v1beta1.PublisherModel.CallTo" +
      "Action.RegionalResourceReferencesB\003\340A\001\022~" +
      "\n\030open_evaluation_pipeline\030\013 \001(\0132W.googl" +
      "e.cloud.aiplatform.v1beta1.PublisherMode" +
      "l.CallToAction.RegionalResourceReference" +
      "sB\003\340A\001\032\332\003\n\032RegionalResourceReferences\022\200\001" +
      "\n\nreferences\030\001 \003(\0132g.google.cloud.aiplat" +
      "form.v1beta1.PublisherModel.CallToAction" +
      ".RegionalResourceReferences.ReferencesEn" +
      "tryB\003\340A\002\022\022\n\005title\030\002 \001(\tB\003\340A\002\022 \n\016resource" +
      "_title\030\003 \001(\tB\003\340A\001H\000\210\001\001\022#\n\021resource_use_c" +
      "ase\030\004 \001(\tB\003\340A\001H\001\210\001\001\022&\n\024resource_descript" +
      "ion\030\005 \001(\tB\003\340A\001H\002\210\001\001\032t\n\017ReferencesEntry\022\013" +
      "\n\003key\030\001 \001(\t\022P\n\005value\030\002 \001(\0132A.google.clou" +
      "d.aiplatform.v1beta1.PublisherModel.Reso" +
      "urceReference:\0028\001B\021\n\017_resource_titleB\024\n\022" +
      "_resource_use_caseB\027\n\025_resource_descript" +
      "ion\032}\n\013ViewRestApi\022Z\n\016documentations\030\001 \003" +
      "(\0132=.google.cloud.aiplatform.v1beta1.Pub" +
      "lisherModel.DocumentationB\003\340A\002\022\022\n\005title\030" +
      "\002 \001(\tB\003\340A\002\032\200\001\n\rOpenNotebooks\022o\n\tnotebook" +
      "s\030\001 \003(\0132W.google.cloud.aiplatform.v1beta" +
      "1.PublisherModel.CallToAction.RegionalRe" +
      "sourceReferencesB\003\340A\002\032\226\001\n\027OpenFineTuning" +
      "Pipelines\022{\n\025fine_tuning_pipelines\030\001 \003(\013" +
      "2W.google.cloud.aiplatform.v1beta1.Publi" +
      "sherModel.CallToAction.RegionalResourceR" +
      "eferencesB\003\340A\002\032\202\004\n\006Deploy\022R\n\023dedicated_r" +
      "esources\030\005 \001(\01323.google.cloud.aiplatform" +
      ".v1beta1.DedicatedResourcesH\000\022R\n\023automat" +
      "ic_resources\030\006 \001(\01323.google.cloud.aiplat" +
      "form.v1beta1.AutomaticResourcesH\000\022\032\n\020sha" +
      "red_resources\030\007 \001(\tH\000\022\037\n\022model_display_n" +
      "ame\030\001 \001(\tB\003\340A\001\022X\n\025large_model_reference\030" +
      "\002 \001(\01324.google.cloud.aiplatform.v1beta1." +
      "LargeModelReferenceB\003\340A\001\022P\n\016container_sp" +
      "ec\030\003 \001(\01323.google.cloud.aiplatform.v1bet" +
      "a1.ModelContainerSpecB\003\340A\001\022\031\n\014artifact_u" +
      "ri\030\004 \001(\tB\003\340A\001\022\022\n\005title\030\010 \001(\tB\003\340A\002\022 \n\023pub" +
      "lic_artifact_uri\030\t \001(\tB\003\340A\001B\026\n\024predictio" +
      "n_resources\032*\n\tDeployGke\022\035\n\020gke_yaml_con" +
      "figs\030\001 \003(\tB\003\340A\001B\021\n\017_open_notebooksB\035\n\033_o" +
      "pen_fine_tuning_pipelines\"\333\001\n\022OpenSource" +
      "Category\022$\n OPEN_SOURCE_CATEGORY_UNSPECI" +
      "FIED\020\000\022\017\n\013PROPRIETARY\020\001\022+\n\'GOOGLE_OWNED_" +
      "OSS_WITH_GOOGLE_CHECKPOINT\020\002\0220\n,THIRD_PA" +
      "RTY_OWNED_OSS_WITH_GOOGLE_CHECKPOINT\020\003\022\024" +
      "\n\020GOOGLE_OWNED_OSS\020\004\022\031\n\025THIRD_PARTY_OWNE" +
      "D_OSS\020\005\"n\n\013LaunchStage\022\034\n\030LAUNCH_STAGE_U" +
      "NSPECIFIED\020\000\022\020\n\014EXPERIMENTAL\020\001\022\023\n\017PRIVAT" +
      "E_PREVIEW\020\002\022\022\n\016PUBLIC_PREVIEW\020\003\022\006\n\002GA\020\004\"" +
      "c\n\014VersionState\022\035\n\031VERSION_STATE_UNSPECI" +
      "FIED\020\000\022\030\n\024VERSION_STATE_STABLE\020\001\022\032\n\026VERS" +
      "ION_STATE_UNSTABLE\020\002:T\352AQ\n(aiplatform.go" +
      "ogleapis.com/PublisherModel\022%publishers/" +
      "{publisher}/models/{model}B\352\001\n#com.googl" +
      "e.cloud.aiplatform.v1beta1B\023PublisherMod" +
      "elProtoP\001ZCcloud.google.com/go/aiplatfor" +
      "m/apiv1beta1/aiplatformpb;aiplatformpb\252\002" +
      "\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Googl" +
      "e\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Clo" +
      "ud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor,
        new java.lang.String[] { "Name", "VersionId", "OpenSourceCategory", "Parent", "SupportedActions", "Frameworks", "LaunchStage", "VersionState", "PublisherModelTemplate", "PredictSchemata", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_ResourceReference_descriptor,
        new java.lang.String[] { "Uri", "ResourceName", "UseCase", "Description", "Reference", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Parent_descriptor,
        new java.lang.String[] { "DisplayName", "Reference", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_Documentation_descriptor,
        new java.lang.String[] { "Title", "Content", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor,
        new java.lang.String[] { "ViewRestApi", "OpenNotebook", "OpenNotebooks", "CreateApplication", "OpenFineTuningPipeline", "OpenFineTuningPipelines", "OpenPromptTuningPipeline", "OpenGenie", "Deploy", "DeployGke", "OpenGenerationAiStudio", "RequestAccess", "OpenEvaluationPipeline", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor,
        new java.lang.String[] { "References", "Title", "ResourceTitle", "ResourceUseCase", "ResourceDescription", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_ViewRestApi_descriptor,
        new java.lang.String[] { "Documentations", "Title", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenNotebooks_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenNotebooks_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenNotebooks_descriptor,
        new java.lang.String[] { "Notebooks", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenFineTuningPipelines_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenFineTuningPipelines_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_OpenFineTuningPipelines_descriptor,
        new java.lang.String[] { "FineTuningPipelines", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_Deploy_descriptor,
        new java.lang.String[] { "DedicatedResources", "AutomaticResources", "SharedResources", "ModelDisplayName", "LargeModelReference", "ContainerSpec", "ArtifactUri", "Title", "PublicArtifactUri", "PredictionResources", });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_DeployGke_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_DeployGke_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PublisherModel_CallToAction_DeployGke_descriptor,
        new java.lang.String[] { "GkeYamlConfigs", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
