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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Request message for CreateAssetRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.CreateAssetRequest}
 */
public final class CreateAssetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.CreateAssetRequest)
    CreateAssetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateAssetRequest.newBuilder() to construct.
  private CreateAssetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAssetRequest() {
    parent_ = "";
    assetId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAssetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_CreateAssetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.WarehouseProto
        .internal_static_google_cloud_visionai_v1_CreateAssetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.CreateAssetRequest.class,
            com.google.cloud.visionai.v1.CreateAssetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this asset will be created.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this asset will be created.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_FIELD_NUMBER = 2;
  private com.google.cloud.visionai.v1.Asset asset_;
  /**
   *
   *
   * <pre>
   * Required. The asset to create.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the asset field is set.
   */
  @java.lang.Override
  public boolean hasAsset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The asset to create.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The asset.
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.Asset getAsset() {
    return asset_ == null ? com.google.cloud.visionai.v1.Asset.getDefaultInstance() : asset_;
  }
  /**
   *
   *
   * <pre>
   * Required. The asset to create.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.AssetOrBuilder getAssetOrBuilder() {
    return asset_ == null ? com.google.cloud.visionai.v1.Asset.getDefaultInstance() : asset_;
  }

  public static final int ASSET_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object assetId_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the asset, which will become the final
   * component of the asset's resource name if user choose to specify.
   * Otherwise, asset id will be generated by system.
   *
   * This value should be up to 63 characters, and valid characters
   * are /[a-z][0-9]-/. The first character must be a letter, the last could be
   * a letter or a number.
   * </pre>
   *
   * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the assetId field is set.
   */
  @java.lang.Override
  public boolean hasAssetId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the asset, which will become the final
   * component of the asset's resource name if user choose to specify.
   * Otherwise, asset id will be generated by system.
   *
   * This value should be up to 63 characters, and valid characters
   * are /[a-z][0-9]-/. The first character must be a letter, the last could be
   * a letter or a number.
   * </pre>
   *
   * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The assetId.
   */
  @java.lang.Override
  public java.lang.String getAssetId() {
    java.lang.Object ref = assetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the asset, which will become the final
   * component of the asset's resource name if user choose to specify.
   * Otherwise, asset id will be generated by system.
   *
   * This value should be up to 63 characters, and valid characters
   * are /[a-z][0-9]-/. The first character must be a letter, the last could be
   * a letter or a number.
   * </pre>
   *
   * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for assetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAssetIdBytes() {
    java.lang.Object ref = assetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      assetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAsset());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, assetId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAsset());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, assetId_);
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
    if (!(obj instanceof com.google.cloud.visionai.v1.CreateAssetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.CreateAssetRequest other =
        (com.google.cloud.visionai.v1.CreateAssetRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasAsset() != other.hasAsset()) return false;
    if (hasAsset()) {
      if (!getAsset().equals(other.getAsset())) return false;
    }
    if (hasAssetId() != other.hasAssetId()) return false;
    if (hasAssetId()) {
      if (!getAssetId().equals(other.getAssetId())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasAsset()) {
      hash = (37 * hash) + ASSET_FIELD_NUMBER;
      hash = (53 * hash) + getAsset().hashCode();
    }
    if (hasAssetId()) {
      hash = (37 * hash) + ASSET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAssetId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.CreateAssetRequest prototype) {
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
   * Request message for CreateAssetRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.CreateAssetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.CreateAssetRequest)
      com.google.cloud.visionai.v1.CreateAssetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_CreateAssetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_CreateAssetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.CreateAssetRequest.class,
              com.google.cloud.visionai.v1.CreateAssetRequest.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.CreateAssetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAssetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      asset_ = null;
      if (assetBuilder_ != null) {
        assetBuilder_.dispose();
        assetBuilder_ = null;
      }
      assetId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.WarehouseProto
          .internal_static_google_cloud_visionai_v1_CreateAssetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.CreateAssetRequest getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.CreateAssetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.CreateAssetRequest build() {
      com.google.cloud.visionai.v1.CreateAssetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.CreateAssetRequest buildPartial() {
      com.google.cloud.visionai.v1.CreateAssetRequest result =
          new com.google.cloud.visionai.v1.CreateAssetRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.CreateAssetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asset_ = assetBuilder_ == null ? asset_ : assetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.assetId_ = assetId_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.visionai.v1.CreateAssetRequest) {
        return mergeFrom((com.google.cloud.visionai.v1.CreateAssetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.CreateAssetRequest other) {
      if (other == com.google.cloud.visionai.v1.CreateAssetRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAsset()) {
        mergeAsset(other.getAsset());
      }
      if (other.hasAssetId()) {
        assetId_ = other.assetId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getAssetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                assetId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this asset will be created.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this asset will be created.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this asset will be created.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this asset will be created.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this asset will be created.
     * Format:
     * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.visionai.v1.Asset asset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.Asset,
            com.google.cloud.visionai.v1.Asset.Builder,
            com.google.cloud.visionai.v1.AssetOrBuilder>
        assetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the asset field is set.
     */
    public boolean hasAsset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The asset.
     */
    public com.google.cloud.visionai.v1.Asset getAsset() {
      if (assetBuilder_ == null) {
        return asset_ == null ? com.google.cloud.visionai.v1.Asset.getDefaultInstance() : asset_;
      } else {
        return assetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAsset(com.google.cloud.visionai.v1.Asset value) {
      if (assetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asset_ = value;
      } else {
        assetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAsset(com.google.cloud.visionai.v1.Asset.Builder builderForValue) {
      if (assetBuilder_ == null) {
        asset_ = builderForValue.build();
      } else {
        assetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAsset(com.google.cloud.visionai.v1.Asset value) {
      if (assetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && asset_ != null
            && asset_ != com.google.cloud.visionai.v1.Asset.getDefaultInstance()) {
          getAssetBuilder().mergeFrom(value);
        } else {
          asset_ = value;
        }
      } else {
        assetBuilder_.mergeFrom(value);
      }
      if (asset_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAsset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      asset_ = null;
      if (assetBuilder_ != null) {
        assetBuilder_.dispose();
        assetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.visionai.v1.Asset.Builder getAssetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAssetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.visionai.v1.AssetOrBuilder getAssetOrBuilder() {
      if (assetBuilder_ != null) {
        return assetBuilder_.getMessageOrBuilder();
      } else {
        return asset_ == null ? com.google.cloud.visionai.v1.Asset.getDefaultInstance() : asset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The asset to create.
     * </pre>
     *
     * <code>.google.cloud.visionai.v1.Asset asset = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.visionai.v1.Asset,
            com.google.cloud.visionai.v1.Asset.Builder,
            com.google.cloud.visionai.v1.AssetOrBuilder>
        getAssetFieldBuilder() {
      if (assetBuilder_ == null) {
        assetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.visionai.v1.Asset,
                com.google.cloud.visionai.v1.Asset.Builder,
                com.google.cloud.visionai.v1.AssetOrBuilder>(
                getAsset(), getParentForChildren(), isClean());
        asset_ = null;
      }
      return assetBuilder_;
    }

    private java.lang.Object assetId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the asset, which will become the final
     * component of the asset's resource name if user choose to specify.
     * Otherwise, asset id will be generated by system.
     *
     * This value should be up to 63 characters, and valid characters
     * are /[a-z][0-9]-/. The first character must be a letter, the last could be
     * a letter or a number.
     * </pre>
     *
     * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the assetId field is set.
     */
    public boolean hasAssetId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the asset, which will become the final
     * component of the asset's resource name if user choose to specify.
     * Otherwise, asset id will be generated by system.
     *
     * This value should be up to 63 characters, and valid characters
     * are /[a-z][0-9]-/. The first character must be a letter, the last could be
     * a letter or a number.
     * </pre>
     *
     * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The assetId.
     */
    public java.lang.String getAssetId() {
      java.lang.Object ref = assetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the asset, which will become the final
     * component of the asset's resource name if user choose to specify.
     * Otherwise, asset id will be generated by system.
     *
     * This value should be up to 63 characters, and valid characters
     * are /[a-z][0-9]-/. The first character must be a letter, the last could be
     * a letter or a number.
     * </pre>
     *
     * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for assetId.
     */
    public com.google.protobuf.ByteString getAssetIdBytes() {
      java.lang.Object ref = assetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        assetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the asset, which will become the final
     * component of the asset's resource name if user choose to specify.
     * Otherwise, asset id will be generated by system.
     *
     * This value should be up to 63 characters, and valid characters
     * are /[a-z][0-9]-/. The first character must be a letter, the last could be
     * a letter or a number.
     * </pre>
     *
     * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      assetId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the asset, which will become the final
     * component of the asset's resource name if user choose to specify.
     * Otherwise, asset id will be generated by system.
     *
     * This value should be up to 63 characters, and valid characters
     * are /[a-z][0-9]-/. The first character must be a letter, the last could be
     * a letter or a number.
     * </pre>
     *
     * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAssetId() {
      assetId_ = getDefaultInstance().getAssetId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the asset, which will become the final
     * component of the asset's resource name if user choose to specify.
     * Otherwise, asset id will be generated by system.
     *
     * This value should be up to 63 characters, and valid characters
     * are /[a-z][0-9]-/. The first character must be a letter, the last could be
     * a letter or a number.
     * </pre>
     *
     * <code>optional string asset_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      assetId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.CreateAssetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.CreateAssetRequest)
  private static final com.google.cloud.visionai.v1.CreateAssetRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.CreateAssetRequest();
  }

  public static com.google.cloud.visionai.v1.CreateAssetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAssetRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAssetRequest>() {
        @java.lang.Override
        public CreateAssetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAssetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAssetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.CreateAssetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
