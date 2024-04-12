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
// source: google/cloud/discoveryengine/v1alpha/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

/**
 *
 *
 * <pre>
 * Tiers of search features. Different tiers might have different
 * pricing. To learn more, check the pricing documentation.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.discoveryengine.v1alpha.SearchTier}
 */
public enum SearchTier implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value when the enum is unspecified. This is invalid to use.
   * </pre>
   *
   * <code>SEARCH_TIER_UNSPECIFIED = 0;</code>
   */
  SEARCH_TIER_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Standard tier.
   * </pre>
   *
   * <code>SEARCH_TIER_STANDARD = 1;</code>
   */
  SEARCH_TIER_STANDARD(1),
  /**
   *
   *
   * <pre>
   * Enterprise tier.
   * </pre>
   *
   * <code>SEARCH_TIER_ENTERPRISE = 2;</code>
   */
  SEARCH_TIER_ENTERPRISE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value when the enum is unspecified. This is invalid to use.
   * </pre>
   *
   * <code>SEARCH_TIER_UNSPECIFIED = 0;</code>
   */
  public static final int SEARCH_TIER_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Standard tier.
   * </pre>
   *
   * <code>SEARCH_TIER_STANDARD = 1;</code>
   */
  public static final int SEARCH_TIER_STANDARD_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Enterprise tier.
   * </pre>
   *
   * <code>SEARCH_TIER_ENTERPRISE = 2;</code>
   */
  public static final int SEARCH_TIER_ENTERPRISE_VALUE = 2;

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
  public static SearchTier valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SearchTier forNumber(int value) {
    switch (value) {
      case 0:
        return SEARCH_TIER_UNSPECIFIED;
      case 1:
        return SEARCH_TIER_STANDARD;
      case 2:
        return SEARCH_TIER_ENTERPRISE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SearchTier> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SearchTier> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SearchTier>() {
        public SearchTier findValueByNumber(int number) {
          return SearchTier.forNumber(number);
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
    return com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor()
        .getEnumTypes()
        .get(2);
  }

  private static final SearchTier[] VALUES = values();

  public static SearchTier valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SearchTier(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.discoveryengine.v1alpha.SearchTier)
}
