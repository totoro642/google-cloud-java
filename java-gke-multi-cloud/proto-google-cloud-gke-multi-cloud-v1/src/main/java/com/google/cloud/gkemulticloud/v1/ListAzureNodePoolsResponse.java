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
// source: google/cloud/gkemulticloud/v1/azure_service.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Response message for `AzureClusters.ListAzureNodePools` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse}
 */
public final class ListAzureNodePoolsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse)
    ListAzureNodePoolsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAzureNodePoolsResponse.newBuilder() to construct.
  private ListAzureNodePoolsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAzureNodePoolsResponse() {
    azureNodePools_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAzureNodePoolsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AzureServiceProto
        .internal_static_google_cloud_gkemulticloud_v1_ListAzureNodePoolsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AzureServiceProto
        .internal_static_google_cloud_gkemulticloud_v1_ListAzureNodePoolsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse.class,
            com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse.Builder.class);
  }

  public static final int AZURE_NODE_POOLS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.gkemulticloud.v1.AzureNodePool> azureNodePools_;
  /**
   *
   *
   * <pre>
   * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
   * resources in the specified `AzureCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkemulticloud.v1.AzureNodePool> getAzureNodePoolsList() {
    return azureNodePools_;
  }
  /**
   *
   *
   * <pre>
   * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
   * resources in the specified `AzureCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder>
      getAzureNodePoolsOrBuilderList() {
    return azureNodePools_;
  }
  /**
   *
   *
   * <pre>
   * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
   * resources in the specified `AzureCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
   */
  @java.lang.Override
  public int getAzureNodePoolsCount() {
    return azureNodePools_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
   * resources in the specified `AzureCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureNodePool getAzureNodePools(int index) {
    return azureNodePools_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
   * resources in the specified `AzureCluster`.
   * </pre>
   *
   * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder getAzureNodePoolsOrBuilder(
      int index) {
    return azureNodePools_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < azureNodePools_.size(); i++) {
      output.writeMessage(1, azureNodePools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < azureNodePools_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, azureNodePools_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse other =
        (com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse) obj;

    if (!getAzureNodePoolsList().equals(other.getAzureNodePoolsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getAzureNodePoolsCount() > 0) {
      hash = (37 * hash) + AZURE_NODE_POOLS_FIELD_NUMBER;
      hash = (53 * hash) + getAzureNodePoolsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse parseFrom(
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
      com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse prototype) {
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
   * Response message for `AzureClusters.ListAzureNodePools` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse)
      com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AzureServiceProto
          .internal_static_google_cloud_gkemulticloud_v1_ListAzureNodePoolsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AzureServiceProto
          .internal_static_google_cloud_gkemulticloud_v1_ListAzureNodePoolsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse.class,
              com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (azureNodePoolsBuilder_ == null) {
        azureNodePools_ = java.util.Collections.emptyList();
      } else {
        azureNodePools_ = null;
        azureNodePoolsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AzureServiceProto
          .internal_static_google_cloud_gkemulticloud_v1_ListAzureNodePoolsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse build() {
      com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse buildPartial() {
      com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse result =
          new com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse result) {
      if (azureNodePoolsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          azureNodePools_ = java.util.Collections.unmodifiableList(azureNodePools_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.azureNodePools_ = azureNodePools_;
      } else {
        result.azureNodePools_ = azureNodePoolsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse other) {
      if (other
          == com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse.getDefaultInstance())
        return this;
      if (azureNodePoolsBuilder_ == null) {
        if (!other.azureNodePools_.isEmpty()) {
          if (azureNodePools_.isEmpty()) {
            azureNodePools_ = other.azureNodePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAzureNodePoolsIsMutable();
            azureNodePools_.addAll(other.azureNodePools_);
          }
          onChanged();
        }
      } else {
        if (!other.azureNodePools_.isEmpty()) {
          if (azureNodePoolsBuilder_.isEmpty()) {
            azureNodePoolsBuilder_.dispose();
            azureNodePoolsBuilder_ = null;
            azureNodePools_ = other.azureNodePools_;
            bitField0_ = (bitField0_ & ~0x00000001);
            azureNodePoolsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAzureNodePoolsFieldBuilder()
                    : null;
          } else {
            azureNodePoolsBuilder_.addAllMessages(other.azureNodePools_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
                com.google.cloud.gkemulticloud.v1.AzureNodePool m =
                    input.readMessage(
                        com.google.cloud.gkemulticloud.v1.AzureNodePool.parser(),
                        extensionRegistry);
                if (azureNodePoolsBuilder_ == null) {
                  ensureAzureNodePoolsIsMutable();
                  azureNodePools_.add(m);
                } else {
                  azureNodePoolsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.gkemulticloud.v1.AzureNodePool> azureNodePools_ =
        java.util.Collections.emptyList();

    private void ensureAzureNodePoolsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        azureNodePools_ =
            new java.util.ArrayList<com.google.cloud.gkemulticloud.v1.AzureNodePool>(
                azureNodePools_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.AzureNodePool,
            com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder,
            com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder>
        azureNodePoolsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AzureNodePool> getAzureNodePoolsList() {
      if (azureNodePoolsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(azureNodePools_);
      } else {
        return azureNodePoolsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public int getAzureNodePoolsCount() {
      if (azureNodePoolsBuilder_ == null) {
        return azureNodePools_.size();
      } else {
        return azureNodePoolsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureNodePool getAzureNodePools(int index) {
      if (azureNodePoolsBuilder_ == null) {
        return azureNodePools_.get(index);
      } else {
        return azureNodePoolsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder setAzureNodePools(
        int index, com.google.cloud.gkemulticloud.v1.AzureNodePool value) {
      if (azureNodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAzureNodePoolsIsMutable();
        azureNodePools_.set(index, value);
        onChanged();
      } else {
        azureNodePoolsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder setAzureNodePools(
        int index, com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder builderForValue) {
      if (azureNodePoolsBuilder_ == null) {
        ensureAzureNodePoolsIsMutable();
        azureNodePools_.set(index, builderForValue.build());
        onChanged();
      } else {
        azureNodePoolsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder addAzureNodePools(com.google.cloud.gkemulticloud.v1.AzureNodePool value) {
      if (azureNodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAzureNodePoolsIsMutable();
        azureNodePools_.add(value);
        onChanged();
      } else {
        azureNodePoolsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder addAzureNodePools(
        int index, com.google.cloud.gkemulticloud.v1.AzureNodePool value) {
      if (azureNodePoolsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAzureNodePoolsIsMutable();
        azureNodePools_.add(index, value);
        onChanged();
      } else {
        azureNodePoolsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder addAzureNodePools(
        com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder builderForValue) {
      if (azureNodePoolsBuilder_ == null) {
        ensureAzureNodePoolsIsMutable();
        azureNodePools_.add(builderForValue.build());
        onChanged();
      } else {
        azureNodePoolsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder addAzureNodePools(
        int index, com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder builderForValue) {
      if (azureNodePoolsBuilder_ == null) {
        ensureAzureNodePoolsIsMutable();
        azureNodePools_.add(index, builderForValue.build());
        onChanged();
      } else {
        azureNodePoolsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder addAllAzureNodePools(
        java.lang.Iterable<? extends com.google.cloud.gkemulticloud.v1.AzureNodePool> values) {
      if (azureNodePoolsBuilder_ == null) {
        ensureAzureNodePoolsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, azureNodePools_);
        onChanged();
      } else {
        azureNodePoolsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder clearAzureNodePools() {
      if (azureNodePoolsBuilder_ == null) {
        azureNodePools_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        azureNodePoolsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public Builder removeAzureNodePools(int index) {
      if (azureNodePoolsBuilder_ == null) {
        ensureAzureNodePoolsIsMutable();
        azureNodePools_.remove(index);
        onChanged();
      } else {
        azureNodePoolsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder getAzureNodePoolsBuilder(
        int index) {
      return getAzureNodePoolsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder getAzureNodePoolsOrBuilder(
        int index) {
      if (azureNodePoolsBuilder_ == null) {
        return azureNodePools_.get(index);
      } else {
        return azureNodePoolsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder>
        getAzureNodePoolsOrBuilderList() {
      if (azureNodePoolsBuilder_ != null) {
        return azureNodePoolsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(azureNodePools_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder addAzureNodePoolsBuilder() {
      return getAzureNodePoolsFieldBuilder()
          .addBuilder(com.google.cloud.gkemulticloud.v1.AzureNodePool.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder addAzureNodePoolsBuilder(
        int index) {
      return getAzureNodePoolsFieldBuilder()
          .addBuilder(index, com.google.cloud.gkemulticloud.v1.AzureNodePool.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of [AzureNodePool][google.cloud.gkemulticloud.v1.AzureNodePool]
     * resources in the specified `AzureCluster`.
     * </pre>
     *
     * <code>repeated .google.cloud.gkemulticloud.v1.AzureNodePool azure_node_pools = 1;</code>
     */
    public java.util.List<com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder>
        getAzureNodePoolsBuilderList() {
      return getAzureNodePoolsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.AzureNodePool,
            com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder,
            com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder>
        getAzureNodePoolsFieldBuilder() {
      if (azureNodePoolsBuilder_ == null) {
        azureNodePoolsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.gkemulticloud.v1.AzureNodePool,
                com.google.cloud.gkemulticloud.v1.AzureNodePool.Builder,
                com.google.cloud.gkemulticloud.v1.AzureNodePoolOrBuilder>(
                azureNodePools_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        azureNodePools_ = null;
      }
      return azureNodePoolsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse)
  private static final com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse();
  }

  public static com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAzureNodePoolsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAzureNodePoolsResponse>() {
        @java.lang.Override
        public ListAzureNodePoolsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAzureNodePoolsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAzureNodePoolsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.ListAzureNodePoolsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
