// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/geometry.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

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
    internal_static_google_cloud_vision_v1_Vertex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_Vertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_NormalizedVertex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_NormalizedVertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_BoundingPoly_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_BoundingPoly_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_Position_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_Position_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/vision/v1/geometry.proto\022" +
      "\026google.cloud.vision.v1\"\036\n\006Vertex\022\t\n\001x\030\001" +
      " \001(\005\022\t\n\001y\030\002 \001(\005\"(\n\020NormalizedVertex\022\t\n\001x" +
      "\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\"\207\001\n\014BoundingPoly\0220\n\010ve" +
      "rtices\030\001 \003(\0132\036.google.cloud.vision.v1.Ve" +
      "rtex\022E\n\023normalized_vertices\030\002 \003(\0132(.goog" +
      "le.cloud.vision.v1.NormalizedVertex\"+\n\010P" +
      "osition\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\022\t\n\001z\030\003 \001(\002" +
      "Bn\n\032com.google.cloud.vision.v1B\rGeometry" +
      "ProtoP\001Z5cloud.google.com/go/vision/v2/a" +
      "piv1/visionpb;visionpb\370\001\001\242\002\004GCVNb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_vision_v1_Vertex_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1_Vertex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_Vertex_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_google_cloud_vision_v1_NormalizedVertex_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1_NormalizedVertex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_NormalizedVertex_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_google_cloud_vision_v1_BoundingPoly_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vision_v1_BoundingPoly_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_BoundingPoly_descriptor,
        new java.lang.String[] { "Vertices", "NormalizedVertices", });
    internal_static_google_cloud_vision_v1_Position_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vision_v1_Position_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_Position_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
