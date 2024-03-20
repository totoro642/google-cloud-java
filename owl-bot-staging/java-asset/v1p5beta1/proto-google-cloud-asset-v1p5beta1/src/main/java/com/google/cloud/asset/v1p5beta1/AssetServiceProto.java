// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p5beta1/asset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.asset.v1p5beta1;

public final class AssetServiceProto {
  private AssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p5beta1_ListAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p5beta1_ListAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_asset_v1p5beta1_ListAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_asset_v1p5beta1_ListAssetsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/asset/v1p5beta1/asset_ser" +
      "vice.proto\022\034google.cloud.asset.v1p5beta1" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032)goo" +
      "gle/cloud/asset/v1p5beta1/assets.proto\032\037" +
      "google/protobuf/timestamp.proto\"\370\001\n\021List" +
      "AssetsRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037c" +
      "loudasset.googleapis.com/Asset\022-\n\tread_t" +
      "ime\030\002 \001(\0132\032.google.protobuf.Timestamp\022\023\n" +
      "\013asset_types\030\003 \003(\t\022?\n\014content_type\030\004 \001(\016" +
      "2).google.cloud.asset.v1p5beta1.ContentT" +
      "ype\022\021\n\tpage_size\030\005 \001(\005\022\022\n\npage_token\030\006 \001" +
      "(\t\"\221\001\n\022ListAssetsResponse\022-\n\tread_time\030\001" +
      " \001(\0132\032.google.protobuf.Timestamp\0223\n\006asse" +
      "ts\030\002 \003(\0132#.google.cloud.asset.v1p5beta1." +
      "Asset\022\027\n\017next_page_token\030\003 \001(\t*l\n\013Conten" +
      "tType\022\034\n\030CONTENT_TYPE_UNSPECIFIED\020\000\022\014\n\010R" +
      "ESOURCE\020\001\022\016\n\nIAM_POLICY\020\002\022\016\n\nORG_POLICY\020" +
      "\004\022\021\n\rACCESS_POLICY\020\0052\200\002\n\014AssetService\022\240\001" +
      "\n\nListAssets\022/.google.cloud.asset.v1p5be" +
      "ta1.ListAssetsRequest\0320.google.cloud.ass" +
      "et.v1p5beta1.ListAssetsResponse\"/\332A\006pare" +
      "nt\202\323\344\223\002 \022\036/v1p5beta1/{parent=*/*}/assets" +
      "\032M\312A\031cloudasset.googleapis.com\322A.https:/" +
      "/www.googleapis.com/auth/cloud-platformB" +
      "\255\001\n com.google.cloud.asset.v1p5beta1B\021As" +
      "setServiceProtoP\001Z6cloud.google.com/go/a" +
      "sset/apiv1p5beta1/assetpb;assetpb\252\002\034Goog" +
      "le.Cloud.Asset.V1P5Beta1\312\002\034Google\\Cloud\\" +
      "Asset\\V1p5beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.asset.v1p5beta1.AssetProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_asset_v1p5beta1_ListAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_asset_v1p5beta1_ListAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p5beta1_ListAssetsRequest_descriptor,
        new java.lang.String[] { "Parent", "ReadTime", "AssetTypes", "ContentType", "PageSize", "PageToken", });
    internal_static_google_cloud_asset_v1p5beta1_ListAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_asset_v1p5beta1_ListAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_asset_v1p5beta1_ListAssetsResponse_descriptor,
        new java.lang.String[] { "ReadTime", "Assets", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.asset.v1p5beta1.AssetProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
