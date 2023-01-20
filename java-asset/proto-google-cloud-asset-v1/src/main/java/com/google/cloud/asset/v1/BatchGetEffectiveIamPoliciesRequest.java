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
 * A request message for
 * [AssetService.BatchGetEffectiveIamPolicies][google.cloud.asset.v1.AssetService.BatchGetEffectiveIamPolicies].
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest}
 */
public final class BatchGetEffectiveIamPoliciesRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest)
    BatchGetEffectiveIamPoliciesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchGetEffectiveIamPoliciesRequest.newBuilder() to construct.
  private BatchGetEffectiveIamPoliciesRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchGetEffectiveIamPoliciesRequest() {
    scope_ = "";
    names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchGetEffectiveIamPoliciesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_BatchGetEffectiveIamPoliciesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_BatchGetEffectiveIamPoliciesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.class,
            com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.Builder.class);
  }

  public static final int SCOPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object scope_ = "";
  /**
   *
   *
   * <pre>
   * Required. Only IAM policies on or below the scope will be returned.
   * This can only be an organization number (such as "organizations/123"), a
   * folder number (such as "folders/123"), a project ID (such as
   * "projects/my-project-id"), or a project number (such as "projects/12345").
   * To know how to get organization id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
   * To know how to get folder or project id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
   * </pre>
   *
   * <code>
   * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The scope.
   */
  @java.lang.Override
  public java.lang.String getScope() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scope_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Only IAM policies on or below the scope will be returned.
   * This can only be an organization number (such as "organizations/123"), a
   * folder number (such as "folders/123"), a project ID (such as
   * "projects/my-project-id"), or a project number (such as "projects/12345").
   * To know how to get organization id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
   * To know how to get folder or project id, visit [here
   * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
   * </pre>
   *
   * <code>
   * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for scope.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getScopeBytes() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      scope_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMES_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList names_;
  /**
   *
   *
   * <pre>
   * Required. The names refer to the [full_resource_names]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * A maximum of 20 resources' effective policies can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the names.
   */
  public com.google.protobuf.ProtocolStringList getNamesList() {
    return names_;
  }
  /**
   *
   *
   * <pre>
   * Required. The names refer to the [full_resource_names]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * A maximum of 20 resources' effective policies can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of names.
   */
  public int getNamesCount() {
    return names_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The names refer to the [full_resource_names]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * A maximum of 20 resources' effective policies can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  public java.lang.String getNames(int index) {
    return names_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The names refer to the [full_resource_names]
   * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of [searchable asset
   * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
   * A maximum of 20 resources' effective policies can be retrieved in a batch.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  public com.google.protobuf.ByteString getNamesBytes(int index) {
    return names_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scope_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scope_);
    }
    for (int i = 0; i < names_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, names_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scope_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scope_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < names_.size(); i++) {
        dataSize += computeStringSizeNoTag(names_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNamesList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest other =
        (com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest) obj;

    if (!getScope().equals(other.getScope())) return false;
    if (!getNamesList().equals(other.getNamesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + getScope().hashCode();
    if (getNamesCount() > 0) {
      hash = (37 * hash) + NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A request message for
   * [AssetService.BatchGetEffectiveIamPolicies][google.cloud.asset.v1.AssetService.BatchGetEffectiveIamPolicies].
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest)
      com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_BatchGetEffectiveIamPoliciesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_BatchGetEffectiveIamPoliciesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.class,
              com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scope_ = "";
      names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_BatchGetEffectiveIamPoliciesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest build() {
      com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest buildPartial() {
      com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest result =
          new com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        names_ = names_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.names_ = names_;
    }

    private void buildPartial0(
        com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scope_ = scope_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest) {
        return mergeFrom((com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest other) {
      if (other
          == com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest.getDefaultInstance())
        return this;
      if (!other.getScope().isEmpty()) {
        scope_ = other.scope_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.names_.isEmpty()) {
        if (names_.isEmpty()) {
          names_ = other.names_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNamesIsMutable();
          names_.addAll(other.names_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                scope_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureNamesIsMutable();
                names_.add(s);
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object scope_ = "";
    /**
     *
     *
     * <pre>
     * Required. Only IAM policies on or below the scope will be returned.
     * This can only be an organization number (such as "organizations/123"), a
     * folder number (such as "folders/123"), a project ID (such as
     * "projects/my-project-id"), or a project number (such as "projects/12345").
     * To know how to get organization id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
     * To know how to get folder or project id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * </pre>
     *
     * <code>
     * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The scope.
     */
    public java.lang.String getScope() {
      java.lang.Object ref = scope_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scope_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Only IAM policies on or below the scope will be returned.
     * This can only be an organization number (such as "organizations/123"), a
     * folder number (such as "folders/123"), a project ID (such as
     * "projects/my-project-id"), or a project number (such as "projects/12345").
     * To know how to get organization id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
     * To know how to get folder or project id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * </pre>
     *
     * <code>
     * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for scope.
     */
    public com.google.protobuf.ByteString getScopeBytes() {
      java.lang.Object ref = scope_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        scope_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Only IAM policies on or below the scope will be returned.
     * This can only be an organization number (such as "organizations/123"), a
     * folder number (such as "folders/123"), a project ID (such as
     * "projects/my-project-id"), or a project number (such as "projects/12345").
     * To know how to get organization id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
     * To know how to get folder or project id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * </pre>
     *
     * <code>
     * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The scope to set.
     * @return This builder for chaining.
     */
    public Builder setScope(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      scope_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Only IAM policies on or below the scope will be returned.
     * This can only be an organization number (such as "organizations/123"), a
     * folder number (such as "folders/123"), a project ID (such as
     * "projects/my-project-id"), or a project number (such as "projects/12345").
     * To know how to get organization id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
     * To know how to get folder or project id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * </pre>
     *
     * <code>
     * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScope() {
      scope_ = getDefaultInstance().getScope();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Only IAM policies on or below the scope will be returned.
     * This can only be an organization number (such as "organizations/123"), a
     * folder number (such as "folders/123"), a project ID (such as
     * "projects/my-project-id"), or a project number (such as "projects/12345").
     * To know how to get organization id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).
     * To know how to get folder or project id, visit [here
     * ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * </pre>
     *
     * <code>
     * string scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for scope to set.
     * @return This builder for chaining.
     */
    public Builder setScopeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      scope_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList names_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureNamesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        names_ = new com.google.protobuf.LazyStringArrayList(names_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return A list containing the names.
     */
    public com.google.protobuf.ProtocolStringList getNamesList() {
      return names_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The count of names.
     */
    public int getNamesCount() {
      return names_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the element to return.
     * @return The names at the given index.
     */
    public java.lang.String getNames(int index) {
      return names_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the names at the given index.
     */
    public com.google.protobuf.ByteString getNamesBytes(int index) {
      return names_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The names to set.
     * @return This builder for chaining.
     */
    public Builder setNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamesIsMutable();
      names_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The names to add.
     * @return This builder for chaining.
     */
    public Builder addNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamesIsMutable();
      names_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param values The names to add.
     * @return This builder for chaining.
     */
    public Builder addAllNames(java.lang.Iterable<java.lang.String> values) {
      ensureNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, names_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNames() {
      names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names refer to the [full_resource_names]
     * (https://cloud.google.com/asset-inventory/docs/resource-name-format)
     * of [searchable asset
     * types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types).
     * A maximum of 20 resources' effective policies can be retrieved in a batch.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes of the names to add.
     * @return This builder for chaining.
     */
    public Builder addNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNamesIsMutable();
      names_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest)
  private static final com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest();
  }

  public static com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchGetEffectiveIamPoliciesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchGetEffectiveIamPoliciesRequest>() {
        @java.lang.Override
        public BatchGetEffectiveIamPoliciesRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<BatchGetEffectiveIamPoliciesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchGetEffectiveIamPoliciesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.BatchGetEffectiveIamPoliciesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
