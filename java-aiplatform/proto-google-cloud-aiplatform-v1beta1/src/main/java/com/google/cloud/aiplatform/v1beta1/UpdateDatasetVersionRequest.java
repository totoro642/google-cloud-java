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
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [DatasetService.UpdateDatasetVersion][google.cloud.aiplatform.v1beta1.DatasetService.UpdateDatasetVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest}
 */
public final class UpdateDatasetVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest)
    UpdateDatasetVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateDatasetVersionRequest.newBuilder() to construct.
  private UpdateDatasetVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateDatasetVersionRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateDatasetVersionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UpdateDatasetVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UpdateDatasetVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest.class,
            com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DATASET_VERSION_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.DatasetVersion datasetVersion_;
  /**
   *
   *
   * <pre>
   * Required. The DatasetVersion which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the datasetVersion field is set.
   */
  @java.lang.Override
  public boolean hasDatasetVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The DatasetVersion which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The datasetVersion.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DatasetVersion getDatasetVersion() {
    return datasetVersion_ == null
        ? com.google.cloud.aiplatform.v1beta1.DatasetVersion.getDefaultInstance()
        : datasetVersion_;
  }
  /**
   *
   *
   * <pre>
   * Required. The DatasetVersion which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DatasetVersionOrBuilder getDatasetVersionOrBuilder() {
    return datasetVersion_ == null
        ? com.google.cloud.aiplatform.v1beta1.DatasetVersion.getDefaultInstance()
        : datasetVersion_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
   *
   *   * `display_name`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
   *
   *   * `display_name`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
   *
   *   * `display_name`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getDatasetVersion());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDatasetVersion());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest other =
        (com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest) obj;

    if (hasDatasetVersion() != other.hasDatasetVersion()) return false;
    if (hasDatasetVersion()) {
      if (!getDatasetVersion().equals(other.getDatasetVersion())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasDatasetVersion()) {
      hash = (37 * hash) + DATASET_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getDatasetVersion().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest prototype) {
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
   * [DatasetService.UpdateDatasetVersion][google.cloud.aiplatform.v1beta1.DatasetService.UpdateDatasetVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest)
      com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateDatasetVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateDatasetVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest.class,
              com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDatasetVersionFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      datasetVersion_ = null;
      if (datasetVersionBuilder_ != null) {
        datasetVersionBuilder_.dispose();
        datasetVersionBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UpdateDatasetVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest build() {
      com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest result =
          new com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.datasetVersion_ =
            datasetVersionBuilder_ == null ? datasetVersion_ : datasetVersionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest.getDefaultInstance())
        return this;
      if (other.hasDatasetVersion()) {
        mergeDatasetVersion(other.getDatasetVersion());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getDatasetVersionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.cloud.aiplatform.v1beta1.DatasetVersion datasetVersion_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DatasetVersion,
            com.google.cloud.aiplatform.v1beta1.DatasetVersion.Builder,
            com.google.cloud.aiplatform.v1beta1.DatasetVersionOrBuilder>
        datasetVersionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the datasetVersion field is set.
     */
    public boolean hasDatasetVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The datasetVersion.
     */
    public com.google.cloud.aiplatform.v1beta1.DatasetVersion getDatasetVersion() {
      if (datasetVersionBuilder_ == null) {
        return datasetVersion_ == null
            ? com.google.cloud.aiplatform.v1beta1.DatasetVersion.getDefaultInstance()
            : datasetVersion_;
      } else {
        return datasetVersionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDatasetVersion(com.google.cloud.aiplatform.v1beta1.DatasetVersion value) {
      if (datasetVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        datasetVersion_ = value;
      } else {
        datasetVersionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDatasetVersion(
        com.google.cloud.aiplatform.v1beta1.DatasetVersion.Builder builderForValue) {
      if (datasetVersionBuilder_ == null) {
        datasetVersion_ = builderForValue.build();
      } else {
        datasetVersionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDatasetVersion(com.google.cloud.aiplatform.v1beta1.DatasetVersion value) {
      if (datasetVersionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && datasetVersion_ != null
            && datasetVersion_
                != com.google.cloud.aiplatform.v1beta1.DatasetVersion.getDefaultInstance()) {
          getDatasetVersionBuilder().mergeFrom(value);
        } else {
          datasetVersion_ = value;
        }
      } else {
        datasetVersionBuilder_.mergeFrom(value);
      }
      if (datasetVersion_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDatasetVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      datasetVersion_ = null;
      if (datasetVersionBuilder_ != null) {
        datasetVersionBuilder_.dispose();
        datasetVersionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.DatasetVersion.Builder getDatasetVersionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDatasetVersionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.DatasetVersionOrBuilder
        getDatasetVersionOrBuilder() {
      if (datasetVersionBuilder_ != null) {
        return datasetVersionBuilder_.getMessageOrBuilder();
      } else {
        return datasetVersion_ == null
            ? com.google.cloud.aiplatform.v1beta1.DatasetVersion.getDefaultInstance()
            : datasetVersion_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The DatasetVersion which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.DatasetVersion dataset_version = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DatasetVersion,
            com.google.cloud.aiplatform.v1beta1.DatasetVersion.Builder,
            com.google.cloud.aiplatform.v1beta1.DatasetVersionOrBuilder>
        getDatasetVersionFieldBuilder() {
      if (datasetVersionBuilder_ == null) {
        datasetVersionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.DatasetVersion,
                com.google.cloud.aiplatform.v1beta1.DatasetVersion.Builder,
                com.google.cloud.aiplatform.v1beta1.DatasetVersionOrBuilder>(
                getDatasetVersion(), getParentForChildren(), isClean());
        datasetVersion_ = null;
      }
      return datasetVersionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * [google.protobuf.FieldMask][google.protobuf.FieldMask]. Updatable fields:
     *
     *   * `display_name`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest)
  private static final com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDatasetVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDatasetVersionRequest>() {
        @java.lang.Override
        public UpdateDatasetVersionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDatasetVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDatasetVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UpdateDatasetVersionRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
