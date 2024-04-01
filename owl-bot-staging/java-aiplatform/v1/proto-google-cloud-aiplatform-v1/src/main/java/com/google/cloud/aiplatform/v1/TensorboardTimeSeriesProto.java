// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_time_series.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class TensorboardTimeSeriesProto {
  private TensorboardTimeSeriesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1/tensorboard" +
      "_time_series.proto\022\032google.cloud.aiplatf" +
      "orm.v1\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\032\037google/proto" +
      "buf/timestamp.proto\"\277\006\n\025TensorboardTimeS" +
      "eries\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name" +
      "\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022W\n\nvalu" +
      "e_type\030\004 \001(\0162;.google.cloud.aiplatform.v" +
      "1.TensorboardTimeSeries.ValueTypeB\006\340A\002\340A" +
      "\005\0224\n\013create_time\030\005 \001(\0132\032.google.protobuf" +
      ".TimestampB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\003\340A\003\022\014\n\004etag\030\007 " +
      "\001(\t\022\030\n\013plugin_name\030\010 \001(\tB\003\340A\005\022\023\n\013plugin_" +
      "data\030\t \001(\014\022Q\n\010metadata\030\n \001(\0132:.google.cl" +
      "oud.aiplatform.v1.TensorboardTimeSeries." +
      "MetadataB\003\340A\003\032\200\001\n\010Metadata\022\025\n\010max_step\030\001" +
      " \001(\003B\003\340A\003\0226\n\rmax_wall_time\030\002 \001(\0132\032.googl" +
      "e.protobuf.TimestampB\003\340A\003\022%\n\030max_blob_se" +
      "quence_length\030\003 \001(\003B\003\340A\003\"R\n\tValueType\022\032\n" +
      "\026VALUE_TYPE_UNSPECIFIED\020\000\022\n\n\006SCALAR\020\001\022\n\n" +
      "\006TENSOR\020\002\022\021\n\rBLOB_SEQUENCE\020\003:\266\001\352A\262\001\n/aip" +
      "latform.googleapis.com/TensorboardTimeSe" +
      "ries\022\177projects/{project}/locations/{loca" +
      "tion}/tensorboards/{tensorboard}/experim" +
      "ents/{experiment}/runs/{run}/timeSeries/" +
      "{time_series}B\330\001\n\036com.google.cloud.aipla" +
      "tform.v1B\032TensorboardTimeSeriesProtoP\001Z>" +
      "cloud.google.com/go/aiplatform/apiv1/aip" +
      "latformpb;aiplatformpb\252\002\032Google.Cloud.AI" +
      "Platform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1" +
      "\352\002\035Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "ValueType", "CreateTime", "UpdateTime", "Etag", "PluginName", "PluginData", "Metadata", });
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_descriptor =
      internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_TensorboardTimeSeries_Metadata_descriptor,
        new java.lang.String[] { "MaxStep", "MaxWallTime", "MaxBlobSequenceLength", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
