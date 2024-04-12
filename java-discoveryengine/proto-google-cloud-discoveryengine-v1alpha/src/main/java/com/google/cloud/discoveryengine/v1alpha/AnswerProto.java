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
// source: google/cloud/discoveryengine/v1alpha/answer.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public final class AnswerProto {
  private AnswerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Citation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Citation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_CitationSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_CitationSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_DocumentMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_SearchAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_SearchAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_SnippetInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_ChunkInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_QueryClassificationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/discoveryengine/v1alpha/a"
          + "nswer.proto\022$google.cloud.discoveryengin"
          + "e.v1alpha\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\265\036\n\006Answer\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\005\022A\n\005state\030\002 \001(\01622.google.clo"
          + "ud.discoveryengine.v1alpha.Answer.State\022"
          + "\023\n\013answer_text\030\003 \001(\t\022H\n\tcitations\030\004 \003(\0132"
          + "5.google.cloud.discoveryengine.v1alpha.A"
          + "nswer.Citation\022J\n\nreferences\030\005 \003(\01326.goo"
          + "gle.cloud.discoveryengine.v1alpha.Answer"
          + ".Reference\022\031\n\021related_questions\030\006 \003(\t\022@\n"
          + "\005steps\030\007 \003(\01321.google.cloud.discoveryeng"
          + "ine.v1alpha.Answer.Step\022e\n\030query_underst"
          + "anding_info\030\n \001(\0132C.google.cloud.discove"
          + "ryengine.v1alpha.Answer.QueryUnderstandi"
          + "ngInfo\022`\n\026answer_skipped_reasons\030\013 \003(\0162@"
          + ".google.cloud.discoveryengine.v1alpha.An"
          + "swer.AnswerSkippedReason\0224\n\013create_time\030"
          + "\010 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0226"
          + "\n\rcomplete_time\030\t \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\032\200\001\n\010Citation\022\023\n\013start_ind"
          + "ex\030\001 \001(\003\022\021\n\tend_index\030\002 \001(\003\022L\n\007sources\030\003"
          + " \003(\0132;.google.cloud.discoveryengine.v1al"
          + "pha.Answer.CitationSource\032&\n\016CitationSou"
          + "rce\022\024\n\014reference_id\030\001 \001(\t\032\221\007\n\tReference\022"
          + "u\n\032unstructured_document_info\030\001 \001(\0132O.go"
          + "ogle.cloud.discoveryengine.v1alpha.Answe"
          + "r.Reference.UnstructuredDocumentInfoH\000\022V"
          + "\n\nchunk_info\030\002 \001(\0132@.google.cloud.discov"
          + "eryengine.v1alpha.Answer.Reference.Chunk"
          + "InfoH\000\032\246\002\n\030UnstructuredDocumentInfo\022>\n\010d"
          + "ocument\030\001 \001(\tB,\372A)\n\'discoveryengine.goog"
          + "leapis.com/Document\022\013\n\003uri\030\002 \001(\t\022\r\n\005titl"
          + "e\030\003 \001(\t\022t\n\016chunk_contents\030\004 \003(\0132\\.google"
          + ".cloud.discoveryengine.v1alpha.Answer.Re"
          + "ference.UnstructuredDocumentInfo.ChunkCo"
          + "ntent\0328\n\014ChunkContent\022\017\n\007content\030\001 \001(\t\022\027"
          + "\n\017page_identifier\030\002 \001(\t\032\200\003\n\tChunkInfo\0228\n"
          + "\005chunk\030\001 \001(\tB)\372A&\n$discoveryengine.googl"
          + "eapis.com/Chunk\022\017\n\007content\030\002 \001(\t\022\034\n\017rele"
          + "vance_score\030\003 \001(\002H\000\210\001\001\022l\n\021document_metad"
          + "ata\030\004 \001(\0132Q.google.cloud.discoveryengine"
          + ".v1alpha.Answer.Reference.ChunkInfo.Docu"
          + "mentMetadata\032\207\001\n\020DocumentMetadata\022>\n\010doc"
          + "ument\030\001 \001(\tB,\372A)\n\'discoveryengine.google"
          + "apis.com/Document\022\013\n\003uri\030\002 \001(\t\022\r\n\005title\030"
          + "\003 \001(\t\022\027\n\017page_identifier\030\004 \001(\tB\022\n\020_relev"
          + "ance_scoreB\t\n\007content\032\261\010\n\004Step\022F\n\005state\030"
          + "\001 \001(\01627.google.cloud.discoveryengine.v1a"
          + "lpha.Answer.Step.State\022\023\n\013description\030\002 "
          + "\001(\t\022\017\n\007thought\030\003 \001(\t\022I\n\007actions\030\004 \003(\01328."
          + "google.cloud.discoveryengine.v1alpha.Ans"
          + "wer.Step.Action\032\243\006\n\006Action\022^\n\rsearch_act"
          + "ion\030\002 \001(\0132E.google.cloud.discoveryengine"
          + ".v1alpha.Answer.Step.Action.SearchAction"
          + "H\000\022Y\n\013observation\030\003 \001(\0132D.google.cloud.d"
          + "iscoveryengine.v1alpha.Answer.Step.Actio"
          + "n.Observation\032\035\n\014SearchAction\022\r\n\005query\030\001"
          + " \001(\t\032\264\004\n\013Observation\022i\n\016search_results\030\002"
          + " \003(\0132Q.google.cloud.discoveryengine.v1al"
          + "pha.Answer.Step.Action.Observation.Searc"
          + "hResult\032\271\003\n\014SearchResult\022\020\n\010document\030\001 \001"
          + "(\t\022\013\n\003uri\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022s\n\014snippe"
          + "t_info\030\004 \003(\0132].google.cloud.discoveryeng"
          + "ine.v1alpha.Answer.Step.Action.Observati"
          + "on.SearchResult.SnippetInfo\022o\n\nchunk_inf"
          + "o\030\005 \003(\0132[.google.cloud.discoveryengine.v"
          + "1alpha.Answer.Step.Action.Observation.Se"
          + "archResult.ChunkInfo\0326\n\013SnippetInfo\022\017\n\007s"
          + "nippet\030\001 \001(\t\022\026\n\016snippet_status\030\002 \001(\t\032]\n\t"
          + "ChunkInfo\022\r\n\005chunk\030\001 \001(\t\022\017\n\007content\030\002 \001("
          + "\t\022\034\n\017relevance_score\030\003 \001(\002H\000\210\001\001B\022\n\020_rele"
          + "vance_scoreB\010\n\006action\"J\n\005State\022\025\n\021STATE_"
          + "UNSPECIFIED\020\000\022\017\n\013IN_PROGRESS\020\001\022\n\n\006FAILED"
          + "\020\002\022\r\n\tSUCCEEDED\020\003\032\211\003\n\026QueryUnderstanding"
          + "Info\022~\n\031query_classification_info\030\001 \003(\0132"
          + "[.google.cloud.discoveryengine.v1alpha.A"
          + "nswer.QueryUnderstandingInfo.QueryClassi"
          + "ficationInfo\032\356\001\n\027QueryClassificationInfo"
          + "\022n\n\004type\030\001 \001(\0162`.google.cloud.discoverye"
          + "ngine.v1alpha.Answer.QueryUnderstandingI"
          + "nfo.QueryClassificationInfo.Type\022\020\n\010posi"
          + "tive\030\002 \001(\010\"Q\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000"
          + "\022\025\n\021ADVERSARIAL_QUERY\020\001\022\034\n\030NON_ANSWER_SE"
          + "EKING_QUERY\020\002\"J\n\005State\022\025\n\021STATE_UNSPECIF"
          + "IED\020\000\022\017\n\013IN_PROGRESS\020\001\022\n\n\006FAILED\020\002\022\r\n\tSU"
          + "CCEEDED\020\003\"\302\001\n\023AnswerSkippedReason\022%\n!ANS"
          + "WER_SKIPPED_REASON_UNSPECIFIED\020\000\022\035\n\031ADVE"
          + "RSARIAL_QUERY_IGNORED\020\001\022$\n NON_ANSWER_SE"
          + "EKING_QUERY_IGNORED\020\002\022\037\n\033OUT_OF_DOMAIN_Q"
          + "UERY_IGNORED\020\003\022\036\n\032POTENTIAL_POLICY_VIOLA"
          + "TION\020\004:\205\003\352A\201\003\n%discoveryengine.googleapi"
          + "s.com/Answer\022cprojects/{project}/locatio"
          + "ns/{location}/dataStores/{data_store}/se"
          + "ssions/{session}/answers/{answer}\022|proje"
          + "cts/{project}/locations/{location}/colle"
          + "ctions/{collection}/dataStores/{data_sto"
          + "re}/sessions/{session}/answers/{answer}\022"
          + "uprojects/{project}/locations/{location}"
          + "/collections/{collection}/engines/{engin"
          + "e}/sessions/{session}/answers/{answer}B\227"
          + "\002\n(com.google.cloud.discoveryengine.v1al"
          + "phaB\013AnswerProtoP\001ZRcloud.google.com/go/"
          + "discoveryengine/apiv1alpha/discoveryengi"
          + "nepb;discoveryenginepb\242\002\017DISCOVERYENGINE"
          + "\252\002$Google.Cloud.DiscoveryEngine.V1Alpha\312"
          + "\002$Google\\Cloud\\DiscoveryEngine\\V1alpha\352\002"
          + "\'Google::Cloud::DiscoveryEngine::V1alpha"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "AnswerText",
              "Citations",
              "References",
              "RelatedQuestions",
              "Steps",
              "QueryUnderstandingInfo",
              "AnswerSkippedReasons",
              "CreateTime",
              "CompleteTime",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Citation_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Citation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Citation_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "Sources",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_CitationSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_CitationSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_CitationSource_descriptor,
            new java.lang.String[] {
              "ReferenceId",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_descriptor,
            new java.lang.String[] {
              "UnstructuredDocumentInfo", "ChunkInfo", "Content",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "ChunkContents",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_UnstructuredDocumentInfo_ChunkContent_descriptor,
            new java.lang.String[] {
              "Content", "PageIdentifier",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_descriptor,
            new java.lang.String[] {
              "Chunk", "Content", "RelevanceScore", "DocumentMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_DocumentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Reference_ChunkInfo_DocumentMetadata_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "PageIdentifier",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_descriptor,
            new java.lang.String[] {
              "State", "Description", "Thought", "Actions",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_descriptor,
            new java.lang.String[] {
              "SearchAction", "Observation", "Action",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_SearchAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_SearchAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_SearchAction_descriptor,
            new java.lang.String[] {
              "Query",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_descriptor,
            new java.lang.String[] {
              "SearchResults",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_descriptor,
            new java.lang.String[] {
              "Document", "Uri", "Title", "SnippetInfo", "ChunkInfo",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_SnippetInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_SnippetInfo_descriptor,
            new java.lang.String[] {
              "Snippet", "SnippetStatus",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_ChunkInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_Step_Action_Observation_SearchResult_ChunkInfo_descriptor,
            new java.lang.String[] {
              "Chunk", "Content", "RelevanceScore",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_descriptor,
            new java.lang.String[] {
              "QueryClassificationInfo",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_QueryClassificationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Answer_QueryUnderstandingInfo_QueryClassificationInfo_descriptor,
            new java.lang.String[] {
              "Type", "Positive",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
