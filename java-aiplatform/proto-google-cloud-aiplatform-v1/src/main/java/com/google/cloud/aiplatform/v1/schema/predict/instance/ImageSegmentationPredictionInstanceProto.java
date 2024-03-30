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
// source: google/cloud/aiplatform/v1/schema/predict/instance/image_segmentation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1.schema.predict.instance;

public final class ImageSegmentationPredictionInstanceProto {
  private ImageSegmentationPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageSegmentationPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageSegmentationPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nKgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/instance/image_segmentation.proto\0222g"
          + "oogle.cloud.aiplatform.v1.schema.predict"
          + ".instance\"I\n#ImageSegmentationPrediction"
          + "Instance\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_type\030\002"
          + " \001(\tB\335\002\n6com.google.cloud.aiplatform.v1."
          + "schema.predict.instanceB(ImageSegmentati"
          + "onPredictionInstanceProtoP\001ZRcloud.googl"
          + "e.com/go/aiplatform/apiv1/schema/predict"
          + "/instance/instancepb;instancepb\252\0022Google"
          + ".Cloud.AIPlatform.V1.Schema.Predict.Inst"
          + "ance\312\0022Google\\Cloud\\AIPlatform\\V1\\Schema"
          + "\\Predict\\Instance\352\0028Google::Cloud::AIPla"
          + "tform::V1::Schema::Predict::Instanceb\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageSegmentationPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageSegmentationPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageSegmentationPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
