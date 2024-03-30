// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/extension.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ExtensionProto {
  private ExtensionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Extension_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Extension_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_ApiSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_ApiSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExtensionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_ApiKeyConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_ApiKeyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_HttpBasicAuthConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_HttpBasicAuthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_GoogleServiceAccountConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_GoogleServiceAccountConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OauthConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OauthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OidcConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OidcConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_CodeInterpreterRuntimeConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_CodeInterpreterRuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_VertexAISearchRuntimeConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_VertexAISearchRuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionPrivateServiceConnectConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExtensionPrivateServiceConnectConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/aiplatform/v1beta1/extens" +
      "ion.proto\022\037google.cloud.aiplatform.v1bet" +
      "a1\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032*google/cloud/aip" +
      "latform/v1beta1/tool.proto\032\034google/proto" +
      "buf/struct.proto\032\037google/protobuf/timest" +
      "amp.proto\"\210\006\n\tExtension\022\021\n\004name\030\001 \001(\tB\003\340" +
      "A\010\022\031\n\014display_name\030\003 \001(\tB\003\340A\002\022\030\n\013descrip" +
      "tion\030\004 \001(\tB\003\340A\001\0224\n\013create_time\030\005 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\003\340A\003\0224\n\013update_" +
      "time\030\006 \001(\0132\032.google.protobuf.TimestampB\003" +
      "\340A\003\022\021\n\004etag\030\007 \001(\tB\003\340A\001\022I\n\010manifest\030\t \001(\013" +
      "22.google.cloud.aiplatform.v1beta1.Exten" +
      "sionManifestB\003\340A\002\022V\n\024extension_operation" +
      "s\030\013 \003(\01323.google.cloud.aiplatform.v1beta" +
      "1.ExtensionOperationB\003\340A\003\022K\n\016runtime_con" +
      "fig\030\r \001(\0132..google.cloud.aiplatform.v1be" +
      "ta1.RuntimeConfigB\003\340A\001\022O\n\021tool_use_examp" +
      "les\030\017 \003(\0132/.google.cloud.aiplatform.v1be" +
      "ta1.ToolUseExampleB\003\340A\001\022r\n\036private_servi" +
      "ce_connect_config\030\020 \001(\0132E.google.cloud.a" +
      "iplatform.v1beta1.ExtensionPrivateServic" +
      "eConnectConfigB\003\340A\001:\177\352A|\n#aiplatform.goo" +
      "gleapis.com/Extension\022>projects/{project" +
      "}/locations/{location}/extensions/{exten" +
      "sion}*\nextensions2\textension\"\254\002\n\021Extensi" +
      "onManifest\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\030\n\013descrip" +
      "tion\030\002 \001(\tB\003\340A\002\022T\n\010api_spec\030\003 \001(\0132:.goog" +
      "le.cloud.aiplatform.v1beta1.ExtensionMan" +
      "ifest.ApiSpecB\006\340A\005\340A\002\022H\n\013auth_config\030\005 \001" +
      "(\0132+.google.cloud.aiplatform.v1beta1.Aut" +
      "hConfigB\006\340A\005\340A\002\032J\n\007ApiSpec\022\027\n\ropen_api_y" +
      "aml\030\001 \001(\tH\000\022\032\n\020open_api_gcs_uri\030\002 \001(\tH\000B" +
      "\n\n\010api_spec\"\203\001\n\022ExtensionOperation\022\024\n\014op" +
      "eration_id\030\001 \001(\t\022W\n\024function_declaration" +
      "\030\003 \001(\01324.google.cloud.aiplatform.v1beta1" +
      ".FunctionDeclarationB\003\340A\003\"\253\010\n\nAuthConfig" +
      "\022R\n\016api_key_config\030\002 \001(\01328.google.cloud." +
      "aiplatform.v1beta1.AuthConfig.ApiKeyConf" +
      "igH\000\022a\n\026http_basic_auth_config\030\003 \001(\0132?.g" +
      "oogle.cloud.aiplatform.v1beta1.AuthConfi" +
      "g.HttpBasicAuthConfigH\000\022o\n\035google_servic" +
      "e_account_config\030\004 \001(\0132F.google.cloud.ai" +
      "platform.v1beta1.AuthConfig.GoogleServic" +
      "eAccountConfigH\000\022O\n\014oauth_config\030\005 \001(\01327" +
      ".google.cloud.aiplatform.v1beta1.AuthCon" +
      "fig.OauthConfigH\000\022M\n\013oidc_config\030\007 \001(\01326" +
      ".google.cloud.aiplatform.v1beta1.AuthCon" +
      "fig.OidcConfigH\000\022<\n\tauth_type\030e \001(\0162).go" +
      "ogle.cloud.aiplatform.v1beta1.AuthType\032\307" +
      "\001\n\014ApiKeyConfig\022\021\n\004name\030\001 \001(\tB\003\340A\002\022J\n\016ap" +
      "i_key_secret\030\002 \001(\tB2\340A\002\372A,\n*secretmanage" +
      "r.googleapis.com/SecretVersion\022X\n\025http_e" +
      "lement_location\030\003 \001(\01624.google.cloud.aip" +
      "latform.v1beta1.HttpElementLocationB\003\340A\002" +
      "\032d\n\023HttpBasicAuthConfig\022M\n\021credential_se" +
      "cret\030\002 \001(\tB2\340A\002\372A,\n*secretmanager.google" +
      "apis.com/SecretVersion\032:\n\032GoogleServiceA" +
      "ccountConfig\022\034\n\017service_account\030\001 \001(\tB\003\340" +
      "A\001\032P\n\013OauthConfig\022\026\n\014access_token\030\001 \001(\tH" +
      "\000\022\031\n\017service_account\030\002 \001(\tH\000B\016\n\014oauth_co" +
      "nfig\032J\n\nOidcConfig\022\022\n\010id_token\030\001 \001(\tH\000\022\031" +
      "\n\017service_account\030\002 \001(\tH\000B\r\n\013oidc_config" +
      "B\r\n\013auth_config\"\201\004\n\rRuntimeConfig\022v\n\037cod" +
      "e_interpreter_runtime_config\030\002 \001(\0132K.goo" +
      "gle.cloud.aiplatform.v1beta1.RuntimeConf" +
      "ig.CodeInterpreterRuntimeConfigH\000\022u\n\037ver" +
      "tex_ai_search_runtime_config\030\006 \001(\0132J.goo" +
      "gle.cloud.aiplatform.v1beta1.RuntimeConf" +
      "ig.VertexAISearchRuntimeConfigH\000\0224\n\016defa" +
      "ult_params\030\004 \001(\0132\027.google.protobuf.Struc" +
      "tB\003\340A\001\032g\n\034CodeInterpreterRuntimeConfig\022\"" +
      "\n\025file_input_gcs_bucket\030\001 \001(\tB\003\340A\001\022#\n\026fi" +
      "le_output_gcs_bucket\030\002 \001(\tB\003\340A\001\032?\n\033Verte" +
      "xAISearchRuntimeConfig\022 \n\023serving_config" +
      "_name\030\001 \001(\tB\003\340A\002B!\n\037GoogleFirstPartyExte" +
      "nsionConfig\"r\n$ExtensionPrivateServiceCo" +
      "nnectConfig\022J\n\021service_directory\030\001 \001(\tB/" +
      "\340A\002\372A)\n\'servicedirectory.googleapis.com/" +
      "Service*\215\001\n\023HttpElementLocation\022\027\n\023HTTP_" +
      "IN_UNSPECIFIED\020\000\022\021\n\rHTTP_IN_QUERY\020\001\022\022\n\016H" +
      "TTP_IN_HEADER\020\002\022\020\n\014HTTP_IN_PATH\020\003\022\020\n\014HTT" +
      "P_IN_BODY\020\004\022\022\n\016HTTP_IN_COOKIE\020\005*\224\001\n\010Auth" +
      "Type\022\031\n\025AUTH_TYPE_UNSPECIFIED\020\000\022\013\n\007NO_AU" +
      "TH\020\001\022\020\n\014API_KEY_AUTH\020\002\022\023\n\017HTTP_BASIC_AUT" +
      "H\020\003\022\037\n\033GOOGLE_SERVICE_ACCOUNT_AUTH\020\004\022\t\n\005" +
      "OAUTH\020\006\022\r\n\tOIDC_AUTH\020\010B\247\004\n#com.google.cl" +
      "oud.aiplatform.v1beta1B\016ExtensionProtoP\001" +
      "ZCcloud.google.com/go/aiplatform/apiv1be" +
      "ta1/aiplatformpb;aiplatformpb\252\002\037Google.C" +
      "loud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\A" +
      "IPlatform\\V1beta1\352\002\"Google::Cloud::AIPla" +
      "tform::V1beta1\352A\277\001\n*secretmanager.google" +
      "apis.com/SecretVersion\022=projects/{projec" +
      "t}/secrets/{secret}/versions/{secret_ver" +
      "sion}\022Rprojects/{project}/locations/{loc" +
      "ation}/secrets/{secret}/versions/{secret" +
      "_version}\352A|\n\'servicedirectory.googleapi" +
      "s.com/Service\022Qprojects/{project}/locati" +
      "ons/{location}/namespaces/{namespace}/se" +
      "rvices/{service}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.ToolProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Extension_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Extension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Extension_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "CreateTime", "UpdateTime", "Etag", "Manifest", "ExtensionOperations", "RuntimeConfig", "ToolUseExamples", "PrivateServiceConnectConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_descriptor,
        new java.lang.String[] { "Name", "Description", "ApiSpec", "AuthConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_ApiSpec_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_ApiSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExtensionManifest_ApiSpec_descriptor,
        new java.lang.String[] { "OpenApiYaml", "OpenApiGcsUri", "ApiSpec", });
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExtensionOperation_descriptor,
        new java.lang.String[] { "OperationId", "FunctionDeclaration", });
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_descriptor,
        new java.lang.String[] { "ApiKeyConfig", "HttpBasicAuthConfig", "GoogleServiceAccountConfig", "OauthConfig", "OidcConfig", "AuthType", "AuthConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_ApiKeyConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_ApiKeyConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_ApiKeyConfig_descriptor,
        new java.lang.String[] { "Name", "ApiKeySecret", "HttpElementLocation", });
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_HttpBasicAuthConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_HttpBasicAuthConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_HttpBasicAuthConfig_descriptor,
        new java.lang.String[] { "CredentialSecret", });
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_GoogleServiceAccountConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_GoogleServiceAccountConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_GoogleServiceAccountConfig_descriptor,
        new java.lang.String[] { "ServiceAccount", });
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OauthConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OauthConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OauthConfig_descriptor,
        new java.lang.String[] { "AccessToken", "ServiceAccount", "OauthConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OidcConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OidcConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_AuthConfig_OidcConfig_descriptor,
        new java.lang.String[] { "IdToken", "ServiceAccount", "OidcConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_descriptor,
        new java.lang.String[] { "CodeInterpreterRuntimeConfig", "VertexAiSearchRuntimeConfig", "DefaultParams", "GoogleFirstPartyExtensionConfig", });
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_CodeInterpreterRuntimeConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_CodeInterpreterRuntimeConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_CodeInterpreterRuntimeConfig_descriptor,
        new java.lang.String[] { "FileInputGcsBucket", "FileOutputGcsBucket", });
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_VertexAISearchRuntimeConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_VertexAISearchRuntimeConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_RuntimeConfig_VertexAISearchRuntimeConfig_descriptor,
        new java.lang.String[] { "ServingConfigName", });
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionPrivateServiceConnectConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ExtensionPrivateServiceConnectConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ExtensionPrivateServiceConnectConfig_descriptor,
        new java.lang.String[] { "ServiceDirectory", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ToolProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
