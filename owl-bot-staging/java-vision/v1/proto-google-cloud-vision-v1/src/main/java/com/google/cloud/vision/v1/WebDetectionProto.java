// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/web_detection.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public final class WebDetectionProto {
  private WebDetectionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_WebDetection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_WebDetection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_WebDetection_WebEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_WebDetection_WebEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_WebDetection_WebImage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_WebDetection_WebImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_WebDetection_WebPage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_WebDetection_WebPage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_WebDetection_WebLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_WebDetection_WebLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/vision/v1/web_detection.p" +
      "roto\022\026google.cloud.vision.v1\"\324\006\n\014WebDete" +
      "ction\022D\n\014web_entities\030\001 \003(\0132..google.clo" +
      "ud.vision.v1.WebDetection.WebEntity\022K\n\024f" +
      "ull_matching_images\030\002 \003(\0132-.google.cloud" +
      ".vision.v1.WebDetection.WebImage\022N\n\027part" +
      "ial_matching_images\030\003 \003(\0132-.google.cloud" +
      ".vision.v1.WebDetection.WebImage\022P\n\032page" +
      "s_with_matching_images\030\004 \003(\0132,.google.cl" +
      "oud.vision.v1.WebDetection.WebPage\022N\n\027vi" +
      "sually_similar_images\030\006 \003(\0132-.google.clo" +
      "ud.vision.v1.WebDetection.WebImage\022H\n\021be" +
      "st_guess_labels\030\010 \003(\0132-.google.cloud.vis" +
      "ion.v1.WebDetection.WebLabel\032B\n\tWebEntit" +
      "y\022\021\n\tentity_id\030\001 \001(\t\022\r\n\005score\030\002 \001(\002\022\023\n\013d" +
      "escription\030\003 \001(\t\032&\n\010WebImage\022\013\n\003url\030\001 \001(" +
      "\t\022\r\n\005score\030\002 \001(\002\032\326\001\n\007WebPage\022\013\n\003url\030\001 \001(" +
      "\t\022\r\n\005score\030\002 \001(\002\022\022\n\npage_title\030\003 \001(\t\022K\n\024" +
      "full_matching_images\030\004 \003(\0132-.google.clou" +
      "d.vision.v1.WebDetection.WebImage\022N\n\027par" +
      "tial_matching_images\030\005 \003(\0132-.google.clou" +
      "d.vision.v1.WebDetection.WebImage\0320\n\010Web" +
      "Label\022\r\n\005label\030\001 \001(\t\022\025\n\rlanguage_code\030\002 " +
      "\001(\tBr\n\032com.google.cloud.vision.v1B\021WebDe" +
      "tectionProtoP\001Z5cloud.google.com/go/visi" +
      "on/v2/apiv1/visionpb;visionpb\370\001\001\242\002\004GCVNb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_vision_v1_WebDetection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1_WebDetection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_WebDetection_descriptor,
        new java.lang.String[] { "WebEntities", "FullMatchingImages", "PartialMatchingImages", "PagesWithMatchingImages", "VisuallySimilarImages", "BestGuessLabels", });
    internal_static_google_cloud_vision_v1_WebDetection_WebEntity_descriptor =
      internal_static_google_cloud_vision_v1_WebDetection_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_vision_v1_WebDetection_WebEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_WebDetection_WebEntity_descriptor,
        new java.lang.String[] { "EntityId", "Score", "Description", });
    internal_static_google_cloud_vision_v1_WebDetection_WebImage_descriptor =
      internal_static_google_cloud_vision_v1_WebDetection_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_vision_v1_WebDetection_WebImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_WebDetection_WebImage_descriptor,
        new java.lang.String[] { "Url", "Score", });
    internal_static_google_cloud_vision_v1_WebDetection_WebPage_descriptor =
      internal_static_google_cloud_vision_v1_WebDetection_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_vision_v1_WebDetection_WebPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_WebDetection_WebPage_descriptor,
        new java.lang.String[] { "Url", "Score", "PageTitle", "FullMatchingImages", "PartialMatchingImages", });
    internal_static_google_cloud_vision_v1_WebDetection_WebLabel_descriptor =
      internal_static_google_cloud_vision_v1_WebDetection_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_vision_v1_WebDetection_WebLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_WebDetection_WebLabel_descriptor,
        new java.lang.String[] { "Label", "LanguageCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
