/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/networksecurity/v1beta1/authorization_policy.proto

package com.google.cloud.networksecurity.v1beta1;

public final class AuthorizationPolicyProto {
  private AuthorizationPolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/networksecurity/v1beta1/a"
          + "uthorization_policy.proto\022$google.cloud."
          + "networksecurity.v1beta1\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032 google/protobuf/field_mask.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\"\340\t\n\023Autho"
          + "rizationPolicy\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022\031\n\013de"
          + "scription\030\002 \001(\tB\004\342A\001\001\0225\n\013create_time\030\003 \001"
          + "(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013"
          + "update_time\030\004 \001(\0132\032.google.protobuf.Time"
          + "stampB\004\342A\001\003\022[\n\006labels\030\005 \003(\0132E.google.clo"
          + "ud.networksecurity.v1beta1.Authorization"
          + "Policy.LabelsEntryB\004\342A\001\001\022V\n\006action\030\006 \001(\016"
          + "2@.google.cloud.networksecurity.v1beta1."
          + "AuthorizationPolicy.ActionB\004\342A\001\002\022S\n\005rule"
          + "s\030\007 \003(\0132>.google.cloud.networksecurity.v"
          + "1beta1.AuthorizationPolicy.RuleB\004\342A\001\001\032\252\004"
          + "\n\004Rule\022\\\n\007sources\030\001 \003(\0132E.google.cloud.n"
          + "etworksecurity.v1beta1.AuthorizationPoli"
          + "cy.Rule.SourceB\004\342A\001\001\022f\n\014destinations\030\002 \003"
          + "(\0132J.google.cloud.networksecurity.v1beta"
          + "1.AuthorizationPolicy.Rule.DestinationB\004"
          + "\342A\001\001\032;\n\006Source\022\030\n\nprincipals\030\001 \003(\tB\004\342A\001\001"
          + "\022\027\n\tip_blocks\030\002 \003(\tB\004\342A\001\001\032\236\002\n\013Destinatio"
          + "n\022\023\n\005hosts\030\001 \003(\tB\004\342A\001\002\022\023\n\005ports\030\002 \003(\rB\004\342"
          + "A\001\002\022\025\n\007methods\030\004 \003(\tB\004\342A\001\001\022{\n\021http_heade"
          + "r_match\030\005 \001(\0132Z.google.cloud.networksecu"
          + "rity.v1beta1.AuthorizationPolicy.Rule.De"
          + "stination.HttpHeaderMatchB\004\342A\001\001\032Q\n\017HttpH"
          + "eaderMatch\022\033\n\013regex_match\030\002 \001(\tB\004\342A\001\002H\000\022"
          + "\031\n\013header_name\030\001 \001(\tB\004\342A\001\002B\006\n\004type\032-\n\013La"
          + "belsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028"
          + "\001\"5\n\006Action\022\026\n\022ACTION_UNSPECIFIED\020\000\022\t\n\005A"
          + "LLOW\020\001\022\010\n\004DENY\020\002:\216\001\352A\212\001\n2networksecurity"
          + ".googleapis.com/AuthorizationPolicy\022Tpro"
          + "jects/{project}/locations/{location}/aut"
          + "horizationPolicies/{authorization_policy"
          + "}\"\205\001\n ListAuthorizationPoliciesRequest\022:"
          + "\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googl"
          + "eapis.com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n"
          + "\npage_token\030\003 \001(\t\"\227\001\n!ListAuthorizationP"
          + "oliciesResponse\022Y\n\026authorization_policie"
          + "s\030\001 \003(\01329.google.cloud.networksecurity.v"
          + "1beta1.AuthorizationPolicy\022\027\n\017next_page_"
          + "token\030\002 \001(\t\"j\n\035GetAuthorizationPolicyReq"
          + "uest\022I\n\004name\030\001 \001(\tB;\342A\001\002\372A4\n2networksecu"
          + "rity.googleapis.com/AuthorizationPolicy\""
          + "\365\001\n CreateAuthorizationPolicyRequest\022K\n\006"
          + "parent\030\001 \001(\tB;\342A\001\002\372A4\0222networksecurity.g"
          + "oogleapis.com/AuthorizationPolicy\022%\n\027aut"
          + "horization_policy_id\030\002 \001(\tB\004\342A\001\002\022]\n\024auth"
          + "orization_policy\030\003 \001(\01329.google.cloud.ne"
          + "tworksecurity.v1beta1.AuthorizationPolic"
          + "yB\004\342A\001\002\"\270\001\n UpdateAuthorizationPolicyReq"
          + "uest\0225\n\013update_mask\030\001 \001(\0132\032.google.proto"
          + "buf.FieldMaskB\004\342A\001\001\022]\n\024authorization_pol"
          + "icy\030\002 \001(\01329.google.cloud.networksecurity"
          + ".v1beta1.AuthorizationPolicyB\004\342A\001\002\"m\n De"
          + "leteAuthorizationPolicyRequest\022I\n\004name\030\001"
          + " \001(\tB;\342A\001\002\372A4\n2networksecurity.googleapi"
          + "s.com/AuthorizationPolicyB\222\002\n(com.google"
          + ".cloud.networksecurity.v1beta1B\030Authoriz"
          + "ationPolicyProtoP\001ZRcloud.google.com/go/"
          + "networksecurity/apiv1beta1/networksecuri"
          + "typb;networksecuritypb\252\002$Google.Cloud.Ne"
          + "tworkSecurity.V1Beta1\312\002$Google\\Cloud\\Net"
          + "workSecurity\\V1beta1\352\002\'Google::Cloud::Ne"
          + "tworkSecurity::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor,
            new java.lang.String[] {
              "Name", "Description", "CreateTime", "UpdateTime", "Labels", "Action", "Rules",
            });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor =
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor,
            new java.lang.String[] {
              "Sources", "Destinations",
            });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_descriptor =
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Source_descriptor,
            new java.lang.String[] {
              "Principals", "IpBlocks",
            });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_descriptor =
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_descriptor,
            new java.lang.String[] {
              "Hosts", "Ports", "Methods", "HttpHeaderMatch",
            });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor =
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_Rule_Destination_HttpHeaderMatch_descriptor,
            new java.lang.String[] {
              "RegexMatch", "HeaderName", "Type",
            });
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_descriptor =
        internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_AuthorizationPolicy_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ListAuthorizationPoliciesResponse_descriptor,
            new java.lang.String[] {
              "AuthorizationPolicies", "NextPageToken",
            });
    internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_GetAuthorizationPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_CreateAuthorizationPolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AuthorizationPolicyId", "AuthorizationPolicy",
            });
    internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_UpdateAuthorizationPolicyRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "AuthorizationPolicy",
            });
    internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_DeleteAuthorizationPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
