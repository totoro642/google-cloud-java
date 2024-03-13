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
// source: google/cloud/dialogflow/v2beta1/environment.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2beta1;

public final class EnvironmentProto {
  private EnvironmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/dialogflow/v2beta1/enviro"
          + "nment.proto\022\037google.cloud.dialogflow.v2b"
          + "eta1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + "2google/cloud/dialogflow/v2beta1/audio_c"
          + "onfig.proto\0321google/cloud/dialogflow/v2b"
          + "eta1/fulfillment.proto\032\033google/protobuf/"
          + "empty.proto\032 google/protobuf/field_mask."
          + "proto\032\037google/protobuf/timestamp.proto\"\223"
          + "\005\n\013Environment\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\030\n\013des"
          + "cription\030\002 \001(\tB\003\340A\001\022@\n\ragent_version\030\003 \001"
          + "(\tB)\340A\001\372A#\n!dialogflow.googleapis.com/Ve"
          + "rsion\022F\n\005state\030\004 \001(\01622.google.cloud.dial"
          + "ogflow.v2beta1.Environment.StateB\003\340A\003\0224\n"
          + "\013update_time\030\005 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\022[\n\027text_to_speech_settings\030\007"
          + " \001(\01325.google.cloud.dialogflow.v2beta1.T"
          + "extToSpeechSettingsB\003\340A\001\022F\n\013fulfillment\030"
          + "\010 \001(\0132,.google.cloud.dialogflow.v2beta1."
          + "FulfillmentB\003\340A\001\"E\n\005State\022\025\n\021STATE_UNSPE"
          + "CIFIED\020\000\022\013\n\007STOPPED\020\001\022\013\n\007LOADING\020\002\022\013\n\007RU"
          + "NNING\020\003:\252\001\352A\246\001\n%dialogflow.googleapis.co"
          + "m/Environment\0223projects/{project}/agent/"
          + "environments/{environment}\022Hprojects/{pr"
          + "oject}/locations/{location}/agent/enviro"
          + "nments/{environment}\"\251\003\n\024TextToSpeechSet"
          + "tings\022\"\n\025enable_text_to_speech\030\001 \001(\010B\003\340A"
          + "\001\022X\n\025output_audio_encoding\030\002 \001(\01624.googl"
          + "e.cloud.dialogflow.v2beta1.OutputAudioEn"
          + "codingB\003\340A\002\022\036\n\021sample_rate_hertz\030\003 \001(\005B\003"
          + "\340A\001\022z\n\031synthesize_speech_configs\030\004 \003(\0132R"
          + ".google.cloud.dialogflow.v2beta1.TextToS"
          + "peechSettings.SynthesizeSpeechConfigsEnt"
          + "ryB\003\340A\001\032w\n\034SynthesizeSpeechConfigsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022F\n\005value\030\002 \001(\01327.google.clo"
          + "ud.dialogflow.v2beta1.SynthesizeSpeechCo"
          + "nfig:\0028\001\"\211\001\n\027ListEnvironmentsRequest\022=\n\006"
          + "parent\030\001 \001(\tB-\340A\002\372A\'\022%dialogflow.googlea"
          + "pis.com/Environment\022\026\n\tpage_size\030\002 \001(\005B\003"
          + "\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"w\n\030ListEnvi"
          + "ronmentsResponse\022B\n\014environments\030\001 \003(\0132,"
          + ".google.cloud.dialogflow.v2beta1.Environ"
          + "ment\022\027\n\017next_page_token\030\002 \001(\t\"T\n\025GetEnvi"
          + "ronmentRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%di"
          + "alogflow.googleapis.com/Environment\"\276\001\n\030"
          + "CreateEnvironmentRequest\022=\n\006parent\030\001 \001(\t"
          + "B-\340A\002\372A\'\022%dialogflow.googleapis.com/Envi"
          + "ronment\022F\n\013environment\030\002 \001(\0132,.google.cl"
          + "oud.dialogflow.v2beta1.EnvironmentB\003\340A\002\022"
          + "\033\n\016environment_id\030\003 \001(\tB\003\340A\002\"\316\001\n\030UpdateE"
          + "nvironmentRequest\022F\n\013environment\030\001 \001(\0132,"
          + ".google.cloud.dialogflow.v2beta1.Environ"
          + "mentB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google."
          + "protobuf.FieldMaskB\003\340A\002\0224\n\'allow_load_to"
          + "_draft_and_discard_changes\030\003 \001(\010B\003\340A\001\"W\n"
          + "\030DeleteEnvironmentRequest\022;\n\004name\030\001 \001(\tB"
          + "-\340A\002\372A\'\n%dialogflow.googleapis.com/Envir"
          + "onment\"\216\001\n\034GetEnvironmentHistoryRequest\022"
          + "=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\n%dialogflow.goog"
          + "leapis.com/Environment\022\026\n\tpage_size\030\002 \001("
          + "\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"\376\001\n\022Envi"
          + "ronmentHistory\022\023\n\006parent\030\001 \001(\tB\003\340A\003\022O\n\007e"
          + "ntries\030\002 \003(\01329.google.cloud.dialogflow.v"
          + "2beta1.EnvironmentHistory.EntryB\003\340A\003\022\034\n\017"
          + "next_page_token\030\003 \001(\tB\003\340A\003\032d\n\005Entry\022\025\n\ra"
          + "gent_version\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022"
          + "/\n\013create_time\030\003 \001(\0132\032.google.protobuf.T"
          + "imestamp2\277\r\n\014Environments\022\210\002\n\020ListEnviro"
          + "nments\0228.google.cloud.dialogflow.v2beta1"
          + ".ListEnvironmentsRequest\0329.google.cloud."
          + "dialogflow.v2beta1.ListEnvironmentsRespo"
          + "nse\"\177\332A\006parent\202\323\344\223\002p\022//v2beta1/{parent=p"
          + "rojects/*/agent}/environmentsZ=\022;/v2beta"
          + "1/{parent=projects/*/locations/*/agent}/"
          + "environments\022\356\001\n\016GetEnvironment\0226.google"
          + ".cloud.dialogflow.v2beta1.GetEnvironment"
          + "Request\032,.google.cloud.dialogflow.v2beta"
          + "1.Environment\"v\202\323\344\223\002p\022//v2beta1/{name=pr"
          + "ojects/*/agent/environments/*}Z=\022;/v2bet"
          + "a1/{name=projects/*/locations/*/agent/en"
          + "vironments/*}\022\220\002\n\021CreateEnvironment\0229.go"
          + "ogle.cloud.dialogflow.v2beta1.CreateEnvi"
          + "ronmentRequest\032,.google.cloud.dialogflow"
          + ".v2beta1.Environment\"\221\001\202\323\344\223\002\212\001\"//v2beta1"
          + "/{parent=projects/*/agent}/environments:"
          + "\013environmentZJ\";/v2beta1/{parent=project"
          + "s/*/locations/*/agent}/environments:\013env"
          + "ironment\022\250\002\n\021UpdateEnvironment\0229.google."
          + "cloud.dialogflow.v2beta1.UpdateEnvironme"
          + "ntRequest\032,.google.cloud.dialogflow.v2be"
          + "ta1.Environment\"\251\001\202\323\344\223\002\242\0012;/v2beta1/{env"
          + "ironment.name=projects/*/agent/environme"
          + "nts/*}:\013environmentZV2G/v2beta1/{environ"
          + "ment.name=projects/*/locations/*/agent/e"
          + "nvironments/*}:\013environment\022\336\001\n\021DeleteEn"
          + "vironment\0229.google.cloud.dialogflow.v2be"
          + "ta1.DeleteEnvironmentRequest\032\026.google.pr"
          + "otobuf.Empty\"v\202\323\344\223\002p*//v2beta1/{name=pro"
          + "jects/*/agent/environments/*}Z=*;/v2beta"
          + "1/{name=projects/*/locations/*/agent/env"
          + "ironments/*}\022\231\002\n\025GetEnvironmentHistory\022="
          + ".google.cloud.dialogflow.v2beta1.GetEnvi"
          + "ronmentHistoryRequest\0323.google.cloud.dia"
          + "logflow.v2beta1.EnvironmentHistory\"\213\001\202\323\344"
          + "\223\002\204\001\0229/v2beta1/{parent=projects/*/agent/"
          + "environments/*}/historyZG\022E/v2beta1/{par"
          + "ent=projects/*/locations/*/agent/environ"
          + "ments/*}/history\032x\312A\031dialogflow.googleap"
          + "is.com\322AYhttps://www.googleapis.com/auth"
          + "/cloud-platform,https://www.googleapis.c"
          + "om/auth/dialogflowB\250\001\n#com.google.cloud."
          + "dialogflow.v2beta1B\020EnvironmentProtoP\001ZC"
          + "cloud.google.com/go/dialogflow/apiv2beta"
          + "1/dialogflowpb;dialogflowpb\370\001\001\242\002\002DF\252\002\037Go"
          + "ogle.Cloud.Dialogflow.V2Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.FulfillmentProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_Environment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Environment_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "AgentVersion",
              "State",
              "UpdateTime",
              "TextToSpeechSettings",
              "Fulfillment",
            });
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_descriptor,
            new java.lang.String[] {
              "EnableTextToSpeech",
              "OutputAudioEncoding",
              "SampleRateHertz",
              "SynthesizeSpeechConfigs",
            });
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_TextToSpeechSettings_SynthesizeSpeechConfigsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListEnvironmentsResponse_descriptor,
            new java.lang.String[] {
              "Environments", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Environment", "EnvironmentId",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Environment", "UpdateMask", "AllowLoadToDraftAndDiscardChanges",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetEnvironmentHistoryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_descriptor,
            new java.lang.String[] {
              "Parent", "Entries", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EnvironmentHistory_Entry_descriptor,
            new java.lang.String[] {
              "AgentVersion", "Description", "CreateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.FulfillmentProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
