// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ModelDeploymentMonitoringJobProto {
  private ModelDeploymentMonitoringJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/cloud/aiplatform/v1beta1/model_" +
      "deployment_monitoring_job.proto\022\037google." +
      "cloud.aiplatform.v1beta1\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\0325google/cloud/aiplatform/v1beta1/en" +
      "cryption_spec.proto\032>google/cloud/aiplat" +
      "form/v1beta1/feature_monitoring_stats.pr" +
      "oto\032(google/cloud/aiplatform/v1beta1/io." +
      "proto\032/google/cloud/aiplatform/v1beta1/j" +
      "ob_state.proto\0326google/cloud/aiplatform/" +
      "v1beta1/model_monitoring.proto\032\036google/p" +
      "rotobuf/duration.proto\032\034google/protobuf/" +
      "struct.proto\032\037google/protobuf/timestamp." +
      "proto\032\027google/rpc/status.proto\"\345\020\n\034Model" +
      "DeploymentMonitoringJob\022\021\n\004name\030\001 \001(\tB\003\340" +
      "A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022<\n\010endpoin" +
      "t\030\003 \001(\tB*\340A\002\372A$\n\"aiplatform.googleapis.c" +
      "om/Endpoint\022=\n\005state\030\004 \001(\0162).google.clou" +
      "d.aiplatform.v1beta1.JobStateB\003\340A\003\022r\n\016sc" +
      "hedule_state\030\005 \001(\0162U.google.cloud.aiplat" +
      "form.v1beta1.ModelDeploymentMonitoringJo" +
      "b.MonitoringScheduleStateB\003\340A\003\022\220\001\n#lates" +
      "t_monitoring_pipeline_metadata\030\031 \001(\0132^.g" +
      "oogle.cloud.aiplatform.v1beta1.ModelDepl" +
      "oymentMonitoringJob.LatestMonitoringPipe" +
      "lineMetadataB\003\340A\003\022\205\001\n-model_deployment_m" +
      "onitoring_objective_configs\030\006 \003(\0132I.goog" +
      "le.cloud.aiplatform.v1beta1.ModelDeploym" +
      "entMonitoringObjectiveConfigB\003\340A\002\022\202\001\n+mo" +
      "del_deployment_monitoring_schedule_confi" +
      "g\030\007 \001(\0132H.google.cloud.aiplatform.v1beta" +
      "1.ModelDeploymentMonitoringScheduleConfi" +
      "gB\003\340A\002\022Y\n\031logging_sampling_strategy\030\010 \001(" +
      "\01321.google.cloud.aiplatform.v1beta1.Samp" +
      "lingStrategyB\003\340A\002\022b\n\035model_monitoring_al" +
      "ert_config\030\017 \001(\0132;.google.cloud.aiplatfo" +
      "rm.v1beta1.ModelMonitoringAlertConfig\022#\n" +
      "\033predict_instance_schema_uri\030\t \001(\t\0227\n\027sa" +
      "mple_predict_instance\030\023 \001(\0132\026.google.pro" +
      "tobuf.Value\022$\n\034analysis_instance_schema_" +
      "uri\030\020 \001(\t\022e\n\017bigquery_tables\030\n \003(\0132G.goo" +
      "gle.cloud.aiplatform.v1beta1.ModelDeploy" +
      "mentMonitoringBigQueryTableB\003\340A\003\022*\n\007log_" +
      "ttl\030\021 \001(\0132\031.google.protobuf.Duration\022Y\n\006" +
      "labels\030\013 \003(\0132I.google.cloud.aiplatform.v" +
      "1beta1.ModelDeploymentMonitoringJob.Labe" +
      "lsEntry\0224\n\013create_time\030\014 \001(\0132\032.google.pr" +
      "otobuf.TimestampB\003\340A\003\0224\n\013update_time\030\r \001" +
      "(\0132\032.google.protobuf.TimestampB\003\340A\003\022;\n\022n" +
      "ext_schedule_time\030\016 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\003\022W\n\036stats_anomalies_base" +
      "_directory\030\024 \001(\0132/.google.cloud.aiplatfo" +
      "rm.v1beta1.GcsDestination\022H\n\017encryption_" +
      "spec\030\025 \001(\0132/.google.cloud.aiplatform.v1b" +
      "eta1.EncryptionSpec\022\'\n\037enable_monitoring" +
      "_pipeline_logs\030\026 \001(\010\022&\n\005error\030\027 \001(\0132\022.go" +
      "ogle.rpc.StatusB\003\340A\003\032t\n LatestMonitoring" +
      "PipelineMetadata\022,\n\010run_time\030\001 \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\022\"\n\006status\030\002 \001(\0132\022" +
      ".google.rpc.Status\032-\n\013LabelsEntry\022\013\n\003key" +
      "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"k\n\027MonitoringS" +
      "cheduleState\022)\n%MONITORING_SCHEDULE_STAT" +
      "E_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007OFFLINE\020" +
      "\002\022\013\n\007RUNNING\020\003:\245\001\352A\241\001\n6aiplatform.google" +
      "apis.com/ModelDeploymentMonitoringJob\022gp" +
      "rojects/{project}/locations/{location}/m" +
      "odelDeploymentMonitoringJobs/{model_depl" +
      "oyment_monitoring_job}\"\310\003\n&ModelDeployme" +
      "ntMonitoringBigQueryTable\022e\n\nlog_source\030" +
      "\001 \001(\0162Q.google.cloud.aiplatform.v1beta1." +
      "ModelDeploymentMonitoringBigQueryTable.L" +
      "ogSource\022a\n\010log_type\030\002 \001(\0162O.google.clou" +
      "d.aiplatform.v1beta1.ModelDeploymentMoni" +
      "toringBigQueryTable.LogType\022\033\n\023bigquery_" +
      "table_path\030\003 \001(\t\0224\n\'request_response_log" +
      "ging_schema_version\030\004 \001(\tB\003\340A\003\"B\n\tLogSou" +
      "rce\022\032\n\026LOG_SOURCE_UNSPECIFIED\020\000\022\014\n\010TRAIN" +
      "ING\020\001\022\013\n\007SERVING\020\002\"=\n\007LogType\022\030\n\024LOG_TYP" +
      "E_UNSPECIFIED\020\000\022\013\n\007PREDICT\020\001\022\013\n\007EXPLAIN\020" +
      "\002\"\240\001\n(ModelDeploymentMonitoringObjective" +
      "Config\022\031\n\021deployed_model_id\030\001 \001(\t\022Y\n\020obj" +
      "ective_config\030\002 \001(\0132?.google.cloud.aipla" +
      "tform.v1beta1.ModelMonitoringObjectiveCo" +
      "nfig\"\226\001\n\'ModelDeploymentMonitoringSchedu" +
      "leConfig\0228\n\020monitor_interval\030\001 \001(\0132\031.goo" +
      "gle.protobuf.DurationB\003\340A\002\0221\n\016monitor_wi" +
      "ndow\030\002 \001(\0132\031.google.protobuf.Duration\"\305\004" +
      "\n\035ModelMonitoringStatsAnomalies\022Z\n\tobjec" +
      "tive\030\001 \001(\0162G.google.cloud.aiplatform.v1b" +
      "eta1.ModelDeploymentMonitoringObjectiveT" +
      "ype\022\031\n\021deployed_model_id\030\002 \001(\t\022\025\n\ranomal" +
      "y_count\030\003 \001(\005\022s\n\rfeature_stats\030\004 \003(\0132\\.g" +
      "oogle.cloud.aiplatform.v1beta1.ModelMoni" +
      "toringStatsAnomalies.FeatureHistoricStat" +
      "sAnomalies\032\240\002\n\035FeatureHistoricStatsAnoma" +
      "lies\022\034\n\024feature_display_name\030\001 \001(\t\022C\n\tth" +
      "reshold\030\003 \001(\01320.google.cloud.aiplatform." +
      "v1beta1.ThresholdConfig\022L\n\016training_stat" +
      "s\030\004 \001(\01324.google.cloud.aiplatform.v1beta" +
      "1.FeatureStatsAnomaly\022N\n\020prediction_stat" +
      "s\030\005 \003(\01324.google.cloud.aiplatform.v1beta" +
      "1.FeatureStatsAnomaly*\316\001\n&ModelDeploymen" +
      "tMonitoringObjectiveType\022:\n6MODEL_DEPLOY" +
      "MENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFI" +
      "ED\020\000\022\024\n\020RAW_FEATURE_SKEW\020\001\022\025\n\021RAW_FEATUR" +
      "E_DRIFT\020\002\022\034\n\030FEATURE_ATTRIBUTION_SKEW\020\003\022" +
      "\035\n\031FEATURE_ATTRIBUTION_DRIFT\020\004B\370\001\n#com.g" +
      "oogle.cloud.aiplatform.v1beta1B!ModelDep" +
      "loymentMonitoringJobProtoP\001ZCcloud.googl" +
      "e.com/go/aiplatform/apiv1beta1/aiplatfor" +
      "mpb;aiplatformpb\252\002\037Google.Cloud.AIPlatfo" +
      "rm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1b" +
      "eta1\352\002\"Google::Cloud::AIPlatform::V1beta" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Endpoint", "State", "ScheduleState", "LatestMonitoringPipelineMetadata", "ModelDeploymentMonitoringObjectiveConfigs", "ModelDeploymentMonitoringScheduleConfig", "LoggingSamplingStrategy", "ModelMonitoringAlertConfig", "PredictInstanceSchemaUri", "SamplePredictInstance", "AnalysisInstanceSchemaUri", "BigqueryTables", "LogTtl", "Labels", "CreateTime", "UpdateTime", "NextScheduleTime", "StatsAnomaliesBaseDirectory", "EncryptionSpec", "EnableMonitoringPipelineLogs", "Error", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_descriptor,
        new java.lang.String[] { "RunTime", "Status", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor,
        new java.lang.String[] { "LogSource", "LogType", "BigqueryTablePath", "RequestResponseLoggingSchemaVersion", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor,
        new java.lang.String[] { "DeployedModelId", "ObjectiveConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor,
        new java.lang.String[] { "MonitorInterval", "MonitorWindow", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor,
        new java.lang.String[] { "Objective", "DeployedModelId", "AnomalyCount", "FeatureStats", });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor,
        new java.lang.String[] { "FeatureDisplayName", "Threshold", "TrainingStats", "PredictionStats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
