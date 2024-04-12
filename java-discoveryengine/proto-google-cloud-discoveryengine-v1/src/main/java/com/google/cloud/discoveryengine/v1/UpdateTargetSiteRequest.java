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
// source: google/cloud/discoveryengine/v1/site_search_engine_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [SiteSearchEngineService.UpdateTargetSite][google.cloud.discoveryengine.v1.SiteSearchEngineService.UpdateTargetSite]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.UpdateTargetSiteRequest}
 */
public final class UpdateTargetSiteRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.UpdateTargetSiteRequest)
    UpdateTargetSiteRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateTargetSiteRequest.newBuilder() to construct.
  private UpdateTargetSiteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTargetSiteRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateTargetSiteRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_UpdateTargetSiteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_UpdateTargetSiteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest.class,
            com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TARGET_SITE_FIELD_NUMBER = 1;
  private com.google.cloud.discoveryengine.v1.TargetSite targetSite_;
  /**
   *
   *
   * <pre>
   * Required. The target site to update.
   * If the caller does not have permission to update the
   * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
   * does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the targetSite field is set.
   */
  @java.lang.Override
  public boolean hasTargetSite() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The target site to update.
   * If the caller does not have permission to update the
   * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
   * does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The targetSite.
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.TargetSite getTargetSite() {
    return targetSite_ == null
        ? com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance()
        : targetSite_;
  }
  /**
   *
   *
   * <pre>
   * Required. The target site to update.
   * If the caller does not have permission to update the
   * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
   * does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder getTargetSiteOrBuilder() {
    return targetSite_ == null
        ? com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance()
        : targetSite_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getTargetSite());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTargetSite());
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest other =
        (com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest) obj;

    if (hasTargetSite() != other.hasTargetSite()) return false;
    if (hasTargetSite()) {
      if (!getTargetSite().equals(other.getTargetSite())) return false;
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
    if (hasTargetSite()) {
      hash = (37 * hash) + TARGET_SITE_FIELD_NUMBER;
      hash = (53 * hash) + getTargetSite().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest parseFrom(
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
      com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest prototype) {
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
   * Request message for
   * [SiteSearchEngineService.UpdateTargetSite][google.cloud.discoveryengine.v1.SiteSearchEngineService.UpdateTargetSite]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.UpdateTargetSiteRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.UpdateTargetSiteRequest)
      com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_UpdateTargetSiteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_UpdateTargetSiteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest.class,
              com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTargetSiteFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      targetSite_ = null;
      if (targetSiteBuilder_ != null) {
        targetSiteBuilder_.dispose();
        targetSiteBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.SiteSearchEngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_UpdateTargetSiteRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest build() {
      com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest buildPartial() {
      com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest result =
          new com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetSite_ = targetSiteBuilder_ == null ? targetSite_ : targetSiteBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest) {
        return mergeFrom((com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest other) {
      if (other == com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest.getDefaultInstance())
        return this;
      if (other.hasTargetSite()) {
        mergeTargetSite(other.getTargetSite());
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
                input.readMessage(getTargetSiteFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.discoveryengine.v1.TargetSite targetSite_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.TargetSite,
            com.google.cloud.discoveryengine.v1.TargetSite.Builder,
            com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
        targetSiteBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the targetSite field is set.
     */
    public boolean hasTargetSite() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The targetSite.
     */
    public com.google.cloud.discoveryengine.v1.TargetSite getTargetSite() {
      if (targetSiteBuilder_ == null) {
        return targetSite_ == null
            ? com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance()
            : targetSite_;
      } else {
        return targetSiteBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTargetSite(com.google.cloud.discoveryengine.v1.TargetSite value) {
      if (targetSiteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetSite_ = value;
      } else {
        targetSiteBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTargetSite(
        com.google.cloud.discoveryengine.v1.TargetSite.Builder builderForValue) {
      if (targetSiteBuilder_ == null) {
        targetSite_ = builderForValue.build();
      } else {
        targetSiteBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTargetSite(com.google.cloud.discoveryengine.v1.TargetSite value) {
      if (targetSiteBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && targetSite_ != null
            && targetSite_ != com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance()) {
          getTargetSiteBuilder().mergeFrom(value);
        } else {
          targetSite_ = value;
        }
      } else {
        targetSiteBuilder_.mergeFrom(value);
      }
      if (targetSite_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTargetSite() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetSite_ = null;
      if (targetSiteBuilder_ != null) {
        targetSiteBuilder_.dispose();
        targetSiteBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSite.Builder getTargetSiteBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTargetSiteFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder getTargetSiteOrBuilder() {
      if (targetSiteBuilder_ != null) {
        return targetSiteBuilder_.getMessageOrBuilder();
      } else {
        return targetSite_ == null
            ? com.google.cloud.discoveryengine.v1.TargetSite.getDefaultInstance()
            : targetSite_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The target site to update.
     * If the caller does not have permission to update the
     * [TargetSite][google.cloud.discoveryengine.v1.TargetSite], regardless of
     * whether or not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [TargetSite][google.cloud.discoveryengine.v1.TargetSite] to update
     * does not exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.TargetSite target_site = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.TargetSite,
            com.google.cloud.discoveryengine.v1.TargetSite.Builder,
            com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>
        getTargetSiteFieldBuilder() {
      if (targetSiteBuilder_ == null) {
        targetSiteBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.discoveryengine.v1.TargetSite,
                com.google.cloud.discoveryengine.v1.TargetSite.Builder,
                com.google.cloud.discoveryengine.v1.TargetSiteOrBuilder>(
                getTargetSite(), getParentForChildren(), isClean());
        targetSite_ = null;
      }
      return targetSiteBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.UpdateTargetSiteRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.UpdateTargetSiteRequest)
  private static final com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest();
  }

  public static com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTargetSiteRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTargetSiteRequest>() {
        @java.lang.Override
        public UpdateTargetSiteRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTargetSiteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTargetSiteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.UpdateTargetSiteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
