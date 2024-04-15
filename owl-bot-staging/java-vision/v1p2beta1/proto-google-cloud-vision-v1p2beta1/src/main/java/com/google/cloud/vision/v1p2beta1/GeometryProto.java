// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p2beta1/geometry.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p2beta1;

public final class GeometryProto {
  private GeometryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1p2beta1_Vertex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p2beta1_Vertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1p2beta1_NormalizedVertex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p2beta1_NormalizedVertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1p2beta1_BoundingPoly_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p2beta1_BoundingPoly_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1p2beta1_Position_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1p2beta1_Position_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/vision/v1p2beta1/geometry" +
      ".proto\022\035google.cloud.vision.v1p2beta1\"\036\n" +
      "\006Vertex\022\t\n\001x\030\001 \001(\005\022\t\n\001y\030\002 \001(\005\"(\n\020Normali" +
      "zedVertex\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\"\225\001\n\014Boun" +
      "dingPoly\0227\n\010vertices\030\001 \003(\0132%.google.clou" +
      "d.vision.v1p2beta1.Vertex\022L\n\023normalized_" +
      "vertices\030\002 \003(\0132/.google.cloud.vision.v1p" +
      "2beta1.NormalizedVertex\"+\n\010Position\022\t\n\001x" +
      "\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\022\t\n\001z\030\003 \001(\002Br\n!com.goog" +
      "le.cloud.vision.v1p2beta1B\rGeometryProto" +
      "P\001Z9cloud.google.com/go/vision/apiv1p2be" +
      "ta1/visionpb;visionpb\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_vision_v1p2beta1_Vertex_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1p2beta1_Vertex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1p2beta1_Vertex_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_google_cloud_vision_v1p2beta1_NormalizedVertex_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1p2beta1_NormalizedVertex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1p2beta1_NormalizedVertex_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_google_cloud_vision_v1p2beta1_BoundingPoly_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vision_v1p2beta1_BoundingPoly_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1p2beta1_BoundingPoly_descriptor,
        new java.lang.String[] { "Vertices", "NormalizedVertices", });
    internal_static_google_cloud_vision_v1p2beta1_Position_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vision_v1p2beta1_Position_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1p2beta1_Position_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
