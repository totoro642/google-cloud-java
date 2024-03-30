// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/match_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * The request message for
 * [MatchService.ReadIndexDatapoints][google.cloud.aiplatform.v1.MatchService.ReadIndexDatapoints].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ReadIndexDatapointsRequest}
 */
public final class ReadIndexDatapointsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ReadIndexDatapointsRequest)
    ReadIndexDatapointsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadIndexDatapointsRequest.newBuilder() to construct.
  private ReadIndexDatapointsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadIndexDatapointsRequest() {
    indexEndpoint_ = "";
    deployedIndexId_ = "";
    ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReadIndexDatapointsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.MatchServiceProto.internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MatchServiceProto.internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest.class, com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest.Builder.class);
  }

  public static final int INDEX_ENDPOINT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object indexEndpoint_ = "";
  /**
   * <pre>
   * Required. The name of the index endpoint.
   * Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The indexEndpoint.
   */
  @java.lang.Override
  public java.lang.String getIndexEndpoint() {
    java.lang.Object ref = indexEndpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      indexEndpoint_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the index endpoint.
   * Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for indexEndpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIndexEndpointBytes() {
    java.lang.Object ref = indexEndpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      indexEndpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYED_INDEX_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deployedIndexId_ = "";
  /**
   * <pre>
   * The ID of the DeployedIndex that will serve the request.
   * </pre>
   *
   * <code>string deployed_index_id = 2;</code>
   * @return The deployedIndexId.
   */
  @java.lang.Override
  public java.lang.String getDeployedIndexId() {
    java.lang.Object ref = deployedIndexId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployedIndexId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the DeployedIndex that will serve the request.
   * </pre>
   *
   * <code>string deployed_index_id = 2;</code>
   * @return The bytes for deployedIndexId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeployedIndexIdBytes() {
    java.lang.Object ref = deployedIndexId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deployedIndexId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList ids_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * IDs of the datapoints to be searched for.
   * </pre>
   *
   * <code>repeated string ids = 3;</code>
   * @return A list containing the ids.
   */
  public com.google.protobuf.ProtocolStringList
      getIdsList() {
    return ids_;
  }
  /**
   * <pre>
   * IDs of the datapoints to be searched for.
   * </pre>
   *
   * <code>repeated string ids = 3;</code>
   * @return The count of ids.
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <pre>
   * IDs of the datapoints to be searched for.
   * </pre>
   *
   * <code>repeated string ids = 3;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  public java.lang.String getIds(int index) {
    return ids_.get(index);
  }
  /**
   * <pre>
   * IDs of the datapoints to be searched for.
   * </pre>
   *
   * <code>repeated string ids = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  public com.google.protobuf.ByteString
      getIdsBytes(int index) {
    return ids_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexEndpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, indexEndpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedIndexId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deployedIndexId_);
    }
    for (int i = 0; i < ids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ids_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexEndpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, indexEndpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedIndexId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deployedIndexId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += computeStringSizeNoTag(ids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIdsList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest other = (com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest) obj;

    if (!getIndexEndpoint()
        .equals(other.getIndexEndpoint())) return false;
    if (!getDeployedIndexId()
        .equals(other.getDeployedIndexId())) return false;
    if (!getIdsList()
        .equals(other.getIdsList())) return false;
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
    hash = (37 * hash) + INDEX_ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getIndexEndpoint().hashCode();
    hash = (37 * hash) + DEPLOYED_INDEX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeployedIndexId().hashCode();
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request message for
   * [MatchService.ReadIndexDatapoints][google.cloud.aiplatform.v1.MatchService.ReadIndexDatapoints].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ReadIndexDatapointsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ReadIndexDatapointsRequest)
      com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.MatchServiceProto.internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MatchServiceProto.internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest.class, com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      indexEndpoint_ = "";
      deployedIndexId_ = "";
      ids_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MatchServiceProto.internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest build() {
      com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest buildPartial() {
      com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest result = new com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.indexEndpoint_ = indexEndpoint_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deployedIndexId_ = deployedIndexId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        ids_.makeImmutable();
        result.ids_ = ids_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest other) {
      if (other == com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest.getDefaultInstance()) return this;
      if (!other.getIndexEndpoint().isEmpty()) {
        indexEndpoint_ = other.indexEndpoint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDeployedIndexId().isEmpty()) {
        deployedIndexId_ = other.deployedIndexId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ |= 0x00000004;
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
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
            case 10: {
              indexEndpoint_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              deployedIndexId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureIdsIsMutable();
              ids_.add(s);
              break;
            } // case 26
            default: {
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

    private java.lang.Object indexEndpoint_ = "";
    /**
     * <pre>
     * Required. The name of the index endpoint.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The indexEndpoint.
     */
    public java.lang.String getIndexEndpoint() {
      java.lang.Object ref = indexEndpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        indexEndpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the index endpoint.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for indexEndpoint.
     */
    public com.google.protobuf.ByteString
        getIndexEndpointBytes() {
      java.lang.Object ref = indexEndpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        indexEndpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the index endpoint.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The indexEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setIndexEndpoint(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      indexEndpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the index endpoint.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearIndexEndpoint() {
      indexEndpoint_ = getDefaultInstance().getIndexEndpoint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the index endpoint.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for indexEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setIndexEndpointBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      indexEndpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object deployedIndexId_ = "";
    /**
     * <pre>
     * The ID of the DeployedIndex that will serve the request.
     * </pre>
     *
     * <code>string deployed_index_id = 2;</code>
     * @return The deployedIndexId.
     */
    public java.lang.String getDeployedIndexId() {
      java.lang.Object ref = deployedIndexId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployedIndexId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the DeployedIndex that will serve the request.
     * </pre>
     *
     * <code>string deployed_index_id = 2;</code>
     * @return The bytes for deployedIndexId.
     */
    public com.google.protobuf.ByteString
        getDeployedIndexIdBytes() {
      java.lang.Object ref = deployedIndexId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deployedIndexId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the DeployedIndex that will serve the request.
     * </pre>
     *
     * <code>string deployed_index_id = 2;</code>
     * @param value The deployedIndexId to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedIndexId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deployedIndexId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the DeployedIndex that will serve the request.
     * </pre>
     *
     * <code>string deployed_index_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeployedIndexId() {
      deployedIndexId_ = getDefaultInstance().getDeployedIndexId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the DeployedIndex that will serve the request.
     * </pre>
     *
     * <code>string deployed_index_id = 2;</code>
     * @param value The bytes for deployedIndexId to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedIndexIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deployedIndexId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureIdsIsMutable() {
      if (!ids_.isModifiable()) {
        ids_ = new com.google.protobuf.LazyStringArrayList(ids_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @return A list containing the ids.
     */
    public com.google.protobuf.ProtocolStringList
        getIdsList() {
      ids_.makeImmutable();
      return ids_;
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @return The count of ids.
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @param index The index of the element to return.
     * @return The ids at the given index.
     */
    public java.lang.String getIds(int index) {
      return ids_.get(index);
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the ids at the given index.
     */
    public com.google.protobuf.ByteString
        getIdsBytes(int index) {
      return ids_.getByteString(index);
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     * @return This builder for chaining.
     */
    public Builder setIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIdsIsMutable();
      ids_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @param value The ids to add.
     * @return This builder for chaining.
     */
    public Builder addIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIdsIsMutable();
      ids_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @param values The ids to add.
     * @return This builder for chaining.
     */
    public Builder addAllIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIds() {
      ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the datapoints to be searched for.
     * </pre>
     *
     * <code>repeated string ids = 3;</code>
     * @param value The bytes of the ids to add.
     * @return This builder for chaining.
     */
    public Builder addIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureIdsIsMutable();
      ids_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ReadIndexDatapointsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ReadIndexDatapointsRequest)
  private static final com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest();
  }

  public static com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadIndexDatapointsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReadIndexDatapointsRequest>() {
    @java.lang.Override
    public ReadIndexDatapointsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReadIndexDatapointsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadIndexDatapointsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ReadIndexDatapointsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

