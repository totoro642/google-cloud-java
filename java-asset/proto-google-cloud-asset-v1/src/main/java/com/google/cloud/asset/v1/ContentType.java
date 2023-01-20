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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * Asset content type.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.asset.v1.ContentType}
 */
public enum ContentType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified content type.
   * </pre>
   *
   * <code>CONTENT_TYPE_UNSPECIFIED = 0;</code>
   */
  CONTENT_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Resource metadata.
   * </pre>
   *
   * <code>RESOURCE = 1;</code>
   */
  RESOURCE(1),
  /**
   *
   *
   * <pre>
   * The actual IAM policy set on a resource.
   * </pre>
   *
   * <code>IAM_POLICY = 2;</code>
   */
  IAM_POLICY(2),
  /**
   *
   *
   * <pre>
   * The organization policy set on an asset.
   * </pre>
   *
   * <code>ORG_POLICY = 4;</code>
   */
  ORG_POLICY(4),
  /**
   *
   *
   * <pre>
   * The Access Context Manager policy set on an asset.
   * </pre>
   *
   * <code>ACCESS_POLICY = 5;</code>
   */
  ACCESS_POLICY(5),
  /**
   *
   *
   * <pre>
   * The runtime OS Inventory information.
   * </pre>
   *
   * <code>OS_INVENTORY = 6;</code>
   */
  OS_INVENTORY(6),
  /**
   *
   *
   * <pre>
   * The related resources.
   * </pre>
   *
   * <code>RELATIONSHIP = 7;</code>
   */
  RELATIONSHIP(7),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified content type.
   * </pre>
   *
   * <code>CONTENT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int CONTENT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Resource metadata.
   * </pre>
   *
   * <code>RESOURCE = 1;</code>
   */
  public static final int RESOURCE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The actual IAM policy set on a resource.
   * </pre>
   *
   * <code>IAM_POLICY = 2;</code>
   */
  public static final int IAM_POLICY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The organization policy set on an asset.
   * </pre>
   *
   * <code>ORG_POLICY = 4;</code>
   */
  public static final int ORG_POLICY_VALUE = 4;
  /**
   *
   *
   * <pre>
   * The Access Context Manager policy set on an asset.
   * </pre>
   *
   * <code>ACCESS_POLICY = 5;</code>
   */
  public static final int ACCESS_POLICY_VALUE = 5;
  /**
   *
   *
   * <pre>
   * The runtime OS Inventory information.
   * </pre>
   *
   * <code>OS_INVENTORY = 6;</code>
   */
  public static final int OS_INVENTORY_VALUE = 6;
  /**
   *
   *
   * <pre>
   * The related resources.
   * </pre>
   *
   * <code>RELATIONSHIP = 7;</code>
   */
  public static final int RELATIONSHIP_VALUE = 7;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ContentType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContentType forNumber(int value) {
    switch (value) {
      case 0:
        return CONTENT_TYPE_UNSPECIFIED;
      case 1:
        return RESOURCE;
      case 2:
        return IAM_POLICY;
      case 4:
        return ORG_POLICY;
      case 5:
        return ACCESS_POLICY;
      case 6:
        return OS_INVENTORY;
      case 7:
        return RELATIONSHIP;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContentType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ContentType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ContentType>() {
        public ContentType findValueByNumber(int number) {
          return ContentType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ContentType[] VALUES = values();

  public static ContentType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ContentType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.asset.v1.ContentType)
}
