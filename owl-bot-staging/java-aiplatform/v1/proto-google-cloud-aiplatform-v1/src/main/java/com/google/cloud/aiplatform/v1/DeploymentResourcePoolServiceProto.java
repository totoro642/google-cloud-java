// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/deployment_resource_pool_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class DeploymentResourcePoolServiceProto {
  private DeploymentResourcePoolServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/aiplatform/v1/deployment_" +
      "resource_pool_service.proto\022\032google.clou" +
      "d.aiplatform.v1\032\034google/api/annotations." +
      "proto\032\027google/api/client.proto\032\037google/a" +
      "pi/field_behavior.proto\032\031google/api/reso" +
      "urce.proto\0323google/cloud/aiplatform/v1/d" +
      "eployed_model_ref.proto\0329google/cloud/ai" +
      "platform/v1/deployment_resource_pool.pro" +
      "to\032)google/cloud/aiplatform/v1/endpoint." +
      "proto\032*google/cloud/aiplatform/v1/operat" +
      "ion.proto\032#google/longrunning/operations" +
      ".proto\032\033google/protobuf/empty.proto\"\345\001\n#" +
      "CreateDeploymentResourcePoolRequest\0229\n\006p" +
      "arent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapi" +
      "s.com/Location\022Y\n\030deployment_resource_po" +
      "ol\030\002 \001(\01322.google.cloud.aiplatform.v1.De" +
      "ploymentResourcePoolB\003\340A\002\022(\n\033deployment_" +
      "resource_pool_id\030\003 \001(\tB\003\340A\002\"\177\n-CreateDep" +
      "loymentResourcePoolOperationMetadata\022N\n\020" +
      "generic_metadata\030\001 \001(\01324.google.cloud.ai" +
      "platform.v1.GenericOperationMetadata\"j\n " +
      "GetDeploymentResourcePoolRequest\022F\n\004name" +
      "\030\001 \001(\tB8\340A\002\372A2\n0aiplatform.googleapis.co" +
      "m/DeploymentResourcePool\"\206\001\n\"ListDeploym" +
      "entResourcePoolsRequest\0229\n\006parent\030\001 \001(\tB" +
      ")\340A\002\372A#\022!locations.googleapis.com/Locati" +
      "on\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(" +
      "\t\"\225\001\n#ListDeploymentResourcePoolsRespons" +
      "e\022U\n\031deployment_resource_pools\030\001 \003(\01322.g" +
      "oogle.cloud.aiplatform.v1.DeploymentReso" +
      "urcePool\022\027\n\017next_page_token\030\002 \001(\t\"\177\n-Upd" +
      "ateDeploymentResourcePoolOperationMetada" +
      "ta\022N\n\020generic_metadata\030\001 \001(\01324.google.cl" +
      "oud.aiplatform.v1.GenericOperationMetada" +
      "ta\"m\n#DeleteDeploymentResourcePoolReques" +
      "t\022F\n\004name\030\001 \001(\tB8\340A\002\372A2\n0aiplatform.goog" +
      "leapis.com/DeploymentResourcePool\"j\n\032Que" +
      "ryDeployedModelsRequest\022%\n\030deployment_re" +
      "source_pool\030\001 \001(\tB\003\340A\002\022\021\n\tpage_size\030\002 \001(" +
      "\005\022\022\n\npage_token\030\003 \001(\t\"\213\002\n\033QueryDeployedM" +
      "odelsResponse\022F\n\017deployed_models\030\001 \003(\0132)" +
      ".google.cloud.aiplatform.v1.DeployedMode" +
      "lB\002\030\001\022\027\n\017next_page_token\030\002 \001(\t\022I\n\023deploy" +
      "ed_model_refs\030\003 \003(\0132,.google.cloud.aipla" +
      "tform.v1.DeployedModelRef\022\"\n\032total_deplo" +
      "yed_model_count\030\004 \001(\005\022\034\n\024total_endpoint_" +
      "count\030\005 \001(\0052\235\013\n\035DeploymentResourcePoolSe" +
      "rvice\022\317\002\n\034CreateDeploymentResourcePool\022?" +
      ".google.cloud.aiplatform.v1.CreateDeploy" +
      "mentResourcePoolRequest\032\035.google.longrun" +
      "ning.Operation\"\316\001\312AG\n\026DeploymentResource" +
      "Pool\022-CreateDeploymentResourcePoolOperat" +
      "ionMetadata\332A;parent,deployment_resource" +
      "_pool,deployment_resource_pool_id\202\323\344\223\002@\"" +
      ";/v1/{parent=projects/*/locations/*}/dep" +
      "loymentResourcePools:\001*\022\331\001\n\031GetDeploymen" +
      "tResourcePool\022<.google.cloud.aiplatform." +
      "v1.GetDeploymentResourcePoolRequest\0322.go" +
      "ogle.cloud.aiplatform.v1.DeploymentResou" +
      "rcePool\"J\332A\004name\202\323\344\223\002=\022;/v1/{name=projec" +
      "ts/*/locations/*/deploymentResourcePools" +
      "/*}\022\354\001\n\033ListDeploymentResourcePools\022>.go" +
      "ogle.cloud.aiplatform.v1.ListDeploymentR" +
      "esourcePoolsRequest\032?.google.cloud.aipla" +
      "tform.v1.ListDeploymentResourcePoolsResp" +
      "onse\"L\332A\006parent\202\323\344\223\002=\022;/v1/{parent=proje" +
      "cts/*/locations/*}/deploymentResourcePoo" +
      "ls\022\375\001\n\034DeleteDeploymentResourcePool\022?.go" +
      "ogle.cloud.aiplatform.v1.DeleteDeploymen" +
      "tResourcePoolRequest\032\035.google.longrunnin" +
      "g.Operation\"}\312A0\n\025google.protobuf.Empty\022" +
      "\027DeleteOperationMetadata\332A\004name\202\323\344\223\002=*;/" +
      "v1/{name=projects/*/locations/*/deployme" +
      "ntResourcePools/*}\022\217\002\n\023QueryDeployedMode" +
      "ls\0226.google.cloud.aiplatform.v1.QueryDep" +
      "loyedModelsRequest\0327.google.cloud.aiplat" +
      "form.v1.QueryDeployedModelsResponse\"\206\001\332A" +
      "\030deployment_resource_pool\202\323\344\223\002e\022c/v1/{de" +
      "ployment_resource_pool=projects/*/locati" +
      "ons/*/deploymentResourcePools/*}:queryDe" +
      "ployedModels\032M\312A\031aiplatform.googleapis.c" +
      "om\322A.https://www.googleapis.com/auth/clo" +
      "ud-platformB\340\001\n\036com.google.cloud.aiplatf" +
      "orm.v1B\"DeploymentResourcePoolServicePro" +
      "toP\001Z>cloud.google.com/go/aiplatform/api" +
      "v1/aiplatformpb;aiplatformpb\252\002\032Google.Cl" +
      "oud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatf" +
      "orm\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.DeploymentResourcePoolProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.EndpointProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Parent", "DeploymentResourcePool", "DeploymentResourcePoolId", });
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_CreateDeploymentResourcePoolOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_GetDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ListDeploymentResourcePoolsResponse_descriptor,
        new java.lang.String[] { "DeploymentResourcePools", "NextPageToken", });
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_UpdateDeploymentResourcePoolOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DeleteDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsRequest_descriptor,
        new java.lang.String[] { "DeploymentResourcePool", "PageSize", "PageToken", });
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_QueryDeployedModelsResponse_descriptor,
        new java.lang.String[] { "DeployedModels", "NextPageToken", "DeployedModelRefs", "TotalDeployedModelCount", "TotalEndpointCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeploymentResourcePoolProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
