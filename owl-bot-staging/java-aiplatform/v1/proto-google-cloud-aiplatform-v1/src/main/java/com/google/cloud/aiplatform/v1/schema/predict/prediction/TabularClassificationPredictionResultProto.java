// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/prediction/tabular_classification.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1.schema.predict.prediction;

public final class TabularClassificationPredictionResultProto {
  private TabularClassificationPredictionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nQgoogle/cloud/aiplatform/v1/schema/pred" +
      "ict/prediction/tabular_classification.pr" +
      "oto\0224google.cloud.aiplatform.v1.schema.p" +
      "redict.prediction\"H\n%TabularClassificati" +
      "onPredictionResult\022\017\n\007classes\030\001 \003(\t\022\016\n\006s" +
      "cores\030\002 \003(\002B\355\002\n8com.google.cloud.aiplatf" +
      "orm.v1.schema.predict.predictionB*Tabula" +
      "rClassificationPredictionResultProtoP\001ZX" +
      "cloud.google.com/go/aiplatform/apiv1/sch" +
      "ema/predict/prediction/predictionpb;pred" +
      "ictionpb\252\0024Google.Cloud.AIPlatform.V1.Sc" +
      "hema.Predict.Prediction\312\0024Google\\Cloud\\A" +
      "IPlatform\\V1\\Schema\\Predict\\Prediction\352\002" +
      ":Google::Cloud::AIPlatform::V1::Schema::" +
      "Predict::Predictionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_predict_prediction_TabularClassificationPredictionResult_descriptor,
        new java.lang.String[] { "Classes", "Scores", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
