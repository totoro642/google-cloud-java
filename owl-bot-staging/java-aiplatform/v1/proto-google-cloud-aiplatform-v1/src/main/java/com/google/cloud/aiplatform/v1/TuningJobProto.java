// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tuning_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class TuningJobProto {
  private TuningJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_TuningJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TuningJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_TuningJob_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TuningJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_TunedModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TunedModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_DatasetBucket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_DatasetBucket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDataStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SupervisedTuningDataStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_TuningDataStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TuningDataStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SupervisedHyperParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SupervisedHyperParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SupervisedTuningSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1/tuning_job." +
      "proto\022\032google.cloud.aiplatform.v1\032\037googl" +
      "e/api/field_behavior.proto\032\031google/api/r" +
      "esource.proto\032(google/cloud/aiplatform/v" +
      "1/content.proto\032*google/cloud/aiplatform" +
      "/v1/job_state.proto\032\037google/protobuf/tim" +
      "estamp.proto\032\027google/rpc/status.proto\"\351\007" +
      "\n\tTuningJob\022\024\n\nbase_model\030\004 \001(\tH\000\022R\n\026sup" +
      "ervised_tuning_spec\030\005 \001(\01320.google.cloud" +
      ".aiplatform.v1.SupervisedTuningSpecH\001\022\024\n" +
      "\004name\030\001 \001(\tB\006\340A\010\340A\003\022%\n\030tuned_model_displ" +
      "ay_name\030\002 \001(\tB\003\340A\001\022\030\n\013description\030\003 \001(\tB" +
      "\003\340A\001\0228\n\005state\030\006 \001(\0162$.google.cloud.aipla" +
      "tform.v1.JobStateB\003\340A\003\0224\n\013create_time\030\007 " +
      "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\0223\n\n" +
      "start_time\030\010 \001(\0132\032.google.protobuf.Times" +
      "tampB\003\340A\003\0221\n\010end_time\030\t \001(\0132\032.google.pro" +
      "tobuf.TimestampB\003\340A\003\0224\n\013update_time\030\n \001(" +
      "\0132\032.google.protobuf.TimestampB\003\340A\003\022&\n\005er" +
      "ror\030\013 \001(\0132\022.google.rpc.StatusB\003\340A\003\022F\n\006la" +
      "bels\030\014 \003(\01321.google.cloud.aiplatform.v1." +
      "TuningJob.LabelsEntryB\003\340A\001\022=\n\nexperiment" +
      "\030\r \001(\tB)\340A\003\372A#\n!aiplatform.googleapis.co" +
      "m/Context\022@\n\013tuned_model\030\016 \001(\0132&.google." +
      "cloud.aiplatform.v1.TunedModelB\003\340A\003\022K\n\021t" +
      "uning_data_stats\030\017 \001(\0132+.google.cloud.ai" +
      "platform.v1.TuningDataStatsB\003\340A\003\032-\n\013Labe" +
      "lsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:" +
      "\200\001\352A}\n#aiplatform.googleapis.com/TuningJ" +
      "ob\022?projects/{project}/locations/{locati" +
      "on}/tuningJobs/{tuning_job}*\ntuningJobs2" +
      "\ttuningJobB\016\n\014source_modelB\r\n\013tuning_spe" +
      "c\"\202\001\n\nTunedModel\0226\n\005model\030\001 \001(\tB\'\340A\003\372A!\n" +
      "\037aiplatform.googleapis.com/Model\022<\n\010endp" +
      "oint\030\002 \001(\tB*\340A\003\372A$\n\"aiplatform.googleapi" +
      "s.com/Endpoint\"\327\002\n#SupervisedTuningDatas" +
      "etDistribution\022\020\n\003sum\030\001 \001(\003B\003\340A\003\022\020\n\003min\030" +
      "\002 \001(\001B\003\340A\003\022\020\n\003max\030\003 \001(\001B\003\340A\003\022\021\n\004mean\030\004 \001" +
      "(\001B\003\340A\003\022\023\n\006median\030\005 \001(\001B\003\340A\003\022\017\n\002p5\030\006 \001(\001" +
      "B\003\340A\003\022\020\n\003p95\030\007 \001(\001B\003\340A\003\022c\n\007buckets\030\010 \003(\013" +
      "2M.google.cloud.aiplatform.v1.Supervised" +
      "TuningDatasetDistribution.DatasetBucketB" +
      "\003\340A\003\032J\n\rDatasetBucket\022\022\n\005count\030\001 \001(\001B\003\340A" +
      "\003\022\021\n\004left\030\002 \001(\001B\003\340A\003\022\022\n\005right\030\003 \001(\001B\003\340A\003" +
      "\"\327\004\n\031SupervisedTuningDataStats\022)\n\034tuning" +
      "_dataset_example_count\030\001 \001(\003B\003\340A\003\022)\n\034tot" +
      "al_tuning_character_count\030\002 \001(\003B\003\340A\003\022+\n\036" +
      "total_billable_character_count\030\003 \001(\003B\003\340A" +
      "\003\022\036\n\021tuning_step_count\030\004 \001(\003B\003\340A\003\022k\n\035use" +
      "r_input_token_distribution\030\005 \001(\0132?.googl" +
      "e.cloud.aiplatform.v1.SupervisedTuningDa" +
      "tasetDistributionB\003\340A\003\022l\n\036user_output_to" +
      "ken_distribution\030\006 \001(\0132?.google.cloud.ai" +
      "platform.v1.SupervisedTuningDatasetDistr" +
      "ibutionB\003\340A\003\022s\n%user_message_per_example" +
      "_distribution\030\007 \001(\0132?.google.cloud.aipla" +
      "tform.v1.SupervisedTuningDatasetDistribu" +
      "tionB\003\340A\003\022G\n\025user_dataset_examples\030\010 \003(\013" +
      "2#.google.cloud.aiplatform.v1.ContentB\003\340" +
      "A\003\"\205\001\n\017TuningDataStats\022]\n\034supervised_tun" +
      "ing_data_stats\030\001 \001(\01325.google.cloud.aipl" +
      "atform.v1.SupervisedTuningDataStatsH\000B\023\n" +
      "\021tuning_data_stats\"\307\002\n\031SupervisedHyperPa" +
      "rameters\022\030\n\013epoch_count\030\001 \001(\003B\003\340A\001\022%\n\030le" +
      "arning_rate_multiplier\030\002 \001(\001B\003\340A\001\022\\\n\014ada" +
      "pter_size\030\003 \001(\0162A.google.cloud.aiplatfor" +
      "m.v1.SupervisedHyperParameters.AdapterSi" +
      "zeB\003\340A\001\"\212\001\n\013AdapterSize\022\034\n\030ADAPTER_SIZE_" +
      "UNSPECIFIED\020\000\022\024\n\020ADAPTER_SIZE_ONE\020\001\022\025\n\021A" +
      "DAPTER_SIZE_FOUR\020\002\022\026\n\022ADAPTER_SIZE_EIGHT" +
      "\020\003\022\030\n\024ADAPTER_SIZE_SIXTEEN\020\004\"\264\001\n\024Supervi" +
      "sedTuningSpec\022!\n\024training_dataset_uri\030\001 " +
      "\001(\tB\003\340A\002\022#\n\026validation_dataset_uri\030\002 \001(\t" +
      "B\003\340A\001\022T\n\020hyper_parameters\030\003 \001(\01325.google" +
      ".cloud.aiplatform.v1.SupervisedHyperPara" +
      "metersB\003\340A\001B\314\001\n\036com.google.cloud.aiplatf" +
      "orm.v1B\016TuningJobProtoP\001Z>cloud.google.c" +
      "om/go/aiplatform/apiv1/aiplatformpb;aipl" +
      "atformpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032" +
      "Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Clo" +
      "ud::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.ContentProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_TuningJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_TuningJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_TuningJob_descriptor,
        new java.lang.String[] { "BaseModel", "SupervisedTuningSpec", "Name", "TunedModelDisplayName", "Description", "State", "CreateTime", "StartTime", "EndTime", "UpdateTime", "Error", "Labels", "Experiment", "TunedModel", "TuningDataStats", "SourceModel", "TuningSpec", });
    internal_static_google_cloud_aiplatform_v1_TuningJob_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_TuningJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_TuningJob_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_TuningJob_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_TunedModel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_TunedModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_TunedModel_descriptor,
        new java.lang.String[] { "Model", "Endpoint", });
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_descriptor,
        new java.lang.String[] { "Sum", "Min", "Max", "Mean", "Median", "P5", "P95", "Buckets", });
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_DatasetBucket_descriptor =
      internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_DatasetBucket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SupervisedTuningDatasetDistribution_DatasetBucket_descriptor,
        new java.lang.String[] { "Count", "Left", "Right", });
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDataStats_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningDataStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SupervisedTuningDataStats_descriptor,
        new java.lang.String[] { "TuningDatasetExampleCount", "TotalTuningCharacterCount", "TotalBillableCharacterCount", "TuningStepCount", "UserInputTokenDistribution", "UserOutputTokenDistribution", "UserMessagePerExampleDistribution", "UserDatasetExamples", });
    internal_static_google_cloud_aiplatform_v1_TuningDataStats_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_TuningDataStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_TuningDataStats_descriptor,
        new java.lang.String[] { "SupervisedTuningDataStats", "TuningDataStats", });
    internal_static_google_cloud_aiplatform_v1_SupervisedHyperParameters_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_SupervisedHyperParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SupervisedHyperParameters_descriptor,
        new java.lang.String[] { "EpochCount", "LearningRateMultiplier", "AdapterSize", });
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningSpec_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_SupervisedTuningSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SupervisedTuningSpec_descriptor,
        new java.lang.String[] { "TrainingDatasetUri", "ValidationDatasetUri", "HyperParameters", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ContentProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
