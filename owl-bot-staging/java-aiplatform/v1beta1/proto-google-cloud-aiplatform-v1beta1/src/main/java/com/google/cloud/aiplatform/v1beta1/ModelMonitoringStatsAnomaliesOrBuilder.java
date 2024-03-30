// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ModelMonitoringStatsAnomaliesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Model Monitoring Objective those stats and anomalies belonging to.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveType objective = 1;</code>
   * @return The enum numeric value on the wire for objective.
   */
  int getObjectiveValue();
  /**
   * <pre>
   * Model Monitoring Objective those stats and anomalies belonging to.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveType objective = 1;</code>
   * @return The objective.
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveType getObjective();

  /**
   * <pre>
   * Deployed Model ID.
   * </pre>
   *
   * <code>string deployed_model_id = 2;</code>
   * @return The deployedModelId.
   */
  java.lang.String getDeployedModelId();
  /**
   * <pre>
   * Deployed Model ID.
   * </pre>
   *
   * <code>string deployed_model_id = 2;</code>
   * @return The bytes for deployedModelId.
   */
  com.google.protobuf.ByteString
      getDeployedModelIdBytes();

  /**
   * <pre>
   * Number of anomalies within all stats.
   * </pre>
   *
   * <code>int32 anomaly_count = 3;</code>
   * @return The anomalyCount.
   */
  int getAnomalyCount();

  /**
   * <pre>
   * A list of historical Stats and Anomalies generated for all Features.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies feature_stats = 4;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies> 
      getFeatureStatsList();
  /**
   * <pre>
   * A list of historical Stats and Anomalies generated for all Features.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies feature_stats = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies getFeatureStats(int index);
  /**
   * <pre>
   * A list of historical Stats and Anomalies generated for all Features.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies feature_stats = 4;</code>
   */
  int getFeatureStatsCount();
  /**
   * <pre>
   * A list of historical Stats and Anomalies generated for all Features.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies feature_stats = 4;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomaliesOrBuilder> 
      getFeatureStatsOrBuilderList();
  /**
   * <pre>
   * A list of historical Stats and Anomalies generated for all Features.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies feature_stats = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomaliesOrBuilder getFeatureStatsOrBuilder(
      int index);
}
