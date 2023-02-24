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
// source: google/maps/mapsplatformdatasets/v1alpha/maps_platform_datasets.proto

package com.google.maps.mapsplatformdatasets.v1alpha;

/**
 *
 *
 * <pre>
 * Request to update the metadata fields of the dataset.
 * </pre>
 *
 * Protobuf type {@code google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest}
 */
public final class UpdateDatasetMetadataRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest)
    UpdateDatasetMetadataRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateDatasetMetadataRequest.newBuilder() to construct.
  private UpdateDatasetMetadataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateDatasetMetadataRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateDatasetMetadataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsProto
        .internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsProto
        .internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest.class,
            com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest.Builder
                .class);
  }

  public static final int DATASET_FIELD_NUMBER = 1;
  private com.google.maps.mapsplatformdatasets.v1alpha.Dataset dataset_;
  /**
   *
   *
   * <pre>
   * Required. The dataset to update. The dataset's name is used to identify the dataset
   * to be updated. The name has the format:
   * projects/{project}/datasets/{dataset_id}
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataset field is set.
   */
  @java.lang.Override
  public boolean hasDataset() {
    return dataset_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The dataset to update. The dataset's name is used to identify the dataset
   * to be updated. The name has the format:
   * projects/{project}/datasets/{dataset_id}
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataset.
   */
  @java.lang.Override
  public com.google.maps.mapsplatformdatasets.v1alpha.Dataset getDataset() {
    return dataset_ == null
        ? com.google.maps.mapsplatformdatasets.v1alpha.Dataset.getDefaultInstance()
        : dataset_;
  }
  /**
   *
   *
   * <pre>
   * Required. The dataset to update. The dataset's name is used to identify the dataset
   * to be updated. The name has the format:
   * projects/{project}/datasets/{dataset_id}
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.maps.mapsplatformdatasets.v1alpha.DatasetOrBuilder getDatasetOrBuilder() {
    return dataset_ == null
        ? com.google.maps.mapsplatformdatasets.v1alpha.Dataset.getDefaultInstance()
        : dataset_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Support the value "*" for full
   * replacement.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Support the value "*" for full
   * replacement.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
   * The list of fields to be updated. Support the value "*" for full
   * replacement.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
    if (dataset_ != null) {
      output.writeMessage(1, getDataset());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDataset());
    }
    if (updateMask_ != null) {
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
    if (!(obj
        instanceof com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest)) {
      return super.equals(obj);
    }
    com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest other =
        (com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest) obj;

    if (hasDataset() != other.hasDataset()) return false;
    if (hasDataset()) {
      if (!getDataset().equals(other.getDataset())) return false;
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
    if (hasDataset()) {
      hash = (37 * hash) + DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getDataset().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest parseFrom(
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
      com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest prototype) {
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
   * Request to update the metadata fields of the dataset.
   * </pre>
   *
   * Protobuf type {@code google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest)
      com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsProto
          .internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsProto
          .internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest.class,
              com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataset_ = null;
      if (datasetBuilder_ != null) {
        datasetBuilder_.dispose();
        datasetBuilder_ = null;
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
      return com.google.maps.mapsplatformdatasets.v1alpha.MapsPlatformDatasetsProto
          .internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
        getDefaultInstanceForType() {
      return com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest build() {
      com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
        buildPartial() {
      com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest result =
          new com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataset_ = datasetBuilder_ == null ? dataset_ : datasetBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other
          instanceof com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest) {
        return mergeFrom(
            (com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest other) {
      if (other
          == com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
              .getDefaultInstance()) return this;
      if (other.hasDataset()) {
        mergeDataset(other.getDataset());
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
                input.readMessage(getDatasetFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.maps.mapsplatformdatasets.v1alpha.Dataset dataset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset,
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset.Builder,
            com.google.maps.mapsplatformdatasets.v1alpha.DatasetOrBuilder>
        datasetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dataset field is set.
     */
    public boolean hasDataset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dataset.
     */
    public com.google.maps.mapsplatformdatasets.v1alpha.Dataset getDataset() {
      if (datasetBuilder_ == null) {
        return dataset_ == null
            ? com.google.maps.mapsplatformdatasets.v1alpha.Dataset.getDefaultInstance()
            : dataset_;
      } else {
        return datasetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataset(com.google.maps.mapsplatformdatasets.v1alpha.Dataset value) {
      if (datasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataset_ = value;
      } else {
        datasetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataset(
        com.google.maps.mapsplatformdatasets.v1alpha.Dataset.Builder builderForValue) {
      if (datasetBuilder_ == null) {
        dataset_ = builderForValue.build();
      } else {
        datasetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDataset(com.google.maps.mapsplatformdatasets.v1alpha.Dataset value) {
      if (datasetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && dataset_ != null
            && dataset_
                != com.google.maps.mapsplatformdatasets.v1alpha.Dataset.getDefaultInstance()) {
          getDatasetBuilder().mergeFrom(value);
        } else {
          dataset_ = value;
        }
      } else {
        datasetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDataset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataset_ = null;
      if (datasetBuilder_ != null) {
        datasetBuilder_.dispose();
        datasetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.maps.mapsplatformdatasets.v1alpha.Dataset.Builder getDatasetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDatasetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.maps.mapsplatformdatasets.v1alpha.DatasetOrBuilder getDatasetOrBuilder() {
      if (datasetBuilder_ != null) {
        return datasetBuilder_.getMessageOrBuilder();
      } else {
        return dataset_ == null
            ? com.google.maps.mapsplatformdatasets.v1alpha.Dataset.getDefaultInstance()
            : dataset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The dataset to update. The dataset's name is used to identify the dataset
     * to be updated. The name has the format:
     * projects/{project}/datasets/{dataset_id}
     * </pre>
     *
     * <code>
     * .google.maps.mapsplatformdatasets.v1alpha.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset,
            com.google.maps.mapsplatformdatasets.v1alpha.Dataset.Builder,
            com.google.maps.mapsplatformdatasets.v1alpha.DatasetOrBuilder>
        getDatasetFieldBuilder() {
      if (datasetBuilder_ == null) {
        datasetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.maps.mapsplatformdatasets.v1alpha.Dataset,
                com.google.maps.mapsplatformdatasets.v1alpha.Dataset.Builder,
                com.google.maps.mapsplatformdatasets.v1alpha.DatasetOrBuilder>(
                getDataset(), getParentForChildren(), isClean());
        dataset_ = null;
      }
      return datasetBuilder_;
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
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The list of fields to be updated. Support the value "*" for full
     * replacement.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    // @@protoc_insertion_point(builder_scope:google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest)
  private static final com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest();
  }

  public static com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDatasetMetadataRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDatasetMetadataRequest>() {
        @java.lang.Override
        public UpdateDatasetMetadataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDatasetMetadataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDatasetMetadataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.mapsplatformdatasets.v1alpha.UpdateDatasetMetadataRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
