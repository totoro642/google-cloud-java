// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Response message for
 * [MetadataService.ListMetadataStores][google.cloud.aiplatform.v1beta1.MetadataService.ListMetadataStores].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse}
 */
public final class ListMetadataStoresResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse)
    ListMetadataStoresResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListMetadataStoresResponse.newBuilder() to construct.
  private ListMetadataStoresResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMetadataStoresResponse() {
    metadataStores_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListMetadataStoresResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListMetadataStoresResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListMetadataStoresResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse.class, com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse.Builder.class);
  }

  public static final int METADATA_STORES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.MetadataStore> metadataStores_;
  /**
   * <pre>
   * The MetadataStores found for the Location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.MetadataStore> getMetadataStoresList() {
    return metadataStores_;
  }
  /**
   * <pre>
   * The MetadataStores found for the Location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder> 
      getMetadataStoresOrBuilderList() {
    return metadataStores_;
  }
  /**
   * <pre>
   * The MetadataStores found for the Location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
   */
  @java.lang.Override
  public int getMetadataStoresCount() {
    return metadataStores_.size();
  }
  /**
   * <pre>
   * The MetadataStores found for the Location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MetadataStore getMetadataStores(int index) {
    return metadataStores_.get(index);
  }
  /**
   * <pre>
   * The MetadataStores found for the Location.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder getMetadataStoresOrBuilder(
      int index) {
    return metadataStores_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token, which can be sent as
   * [ListMetadataStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListMetadataStoresRequest.page_token]
   * to retrieve the next page. If this field is not populated, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A token, which can be sent as
   * [ListMetadataStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListMetadataStoresRequest.page_token]
   * to retrieve the next page. If this field is not populated, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < metadataStores_.size(); i++) {
      output.writeMessage(1, metadataStores_.get(i));
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
    for (int i = 0; i < metadataStores_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, metadataStores_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse other = (com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse) obj;

    if (!getMetadataStoresList()
        .equals(other.getMetadataStoresList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getMetadataStoresCount() > 0) {
      hash = (37 * hash) + METADATA_STORES_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataStoresList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse prototype) {
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
   * Response message for
   * [MetadataService.ListMetadataStores][google.cloud.aiplatform.v1beta1.MetadataService.ListMetadataStores].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse)
      com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListMetadataStoresResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListMetadataStoresResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse.class, com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse.newBuilder()
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
      if (metadataStoresBuilder_ == null) {
        metadataStores_ = java.util.Collections.emptyList();
      } else {
        metadataStores_ = null;
        metadataStoresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListMetadataStoresResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse result = new com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse result) {
      if (metadataStoresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          metadataStores_ = java.util.Collections.unmodifiableList(metadataStores_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metadataStores_ = metadataStores_;
      } else {
        result.metadataStores_ = metadataStoresBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse.getDefaultInstance()) return this;
      if (metadataStoresBuilder_ == null) {
        if (!other.metadataStores_.isEmpty()) {
          if (metadataStores_.isEmpty()) {
            metadataStores_ = other.metadataStores_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetadataStoresIsMutable();
            metadataStores_.addAll(other.metadataStores_);
          }
          onChanged();
        }
      } else {
        if (!other.metadataStores_.isEmpty()) {
          if (metadataStoresBuilder_.isEmpty()) {
            metadataStoresBuilder_.dispose();
            metadataStoresBuilder_ = null;
            metadataStores_ = other.metadataStores_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metadataStoresBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetadataStoresFieldBuilder() : null;
          } else {
            metadataStoresBuilder_.addAllMessages(other.metadataStores_);
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
            case 10: {
              com.google.cloud.aiplatform.v1beta1.MetadataStore m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.MetadataStore.parser(),
                      extensionRegistry);
              if (metadataStoresBuilder_ == null) {
                ensureMetadataStoresIsMutable();
                metadataStores_.add(m);
              } else {
                metadataStoresBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.MetadataStore> metadataStores_ =
      java.util.Collections.emptyList();
    private void ensureMetadataStoresIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metadataStores_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.MetadataStore>(metadataStores_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.MetadataStore, com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder, com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder> metadataStoresBuilder_;

    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.MetadataStore> getMetadataStoresList() {
      if (metadataStoresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metadataStores_);
      } else {
        return metadataStoresBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public int getMetadataStoresCount() {
      if (metadataStoresBuilder_ == null) {
        return metadataStores_.size();
      } else {
        return metadataStoresBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataStore getMetadataStores(int index) {
      if (metadataStoresBuilder_ == null) {
        return metadataStores_.get(index);
      } else {
        return metadataStoresBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder setMetadataStores(
        int index, com.google.cloud.aiplatform.v1beta1.MetadataStore value) {
      if (metadataStoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataStoresIsMutable();
        metadataStores_.set(index, value);
        onChanged();
      } else {
        metadataStoresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder setMetadataStores(
        int index, com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder builderForValue) {
      if (metadataStoresBuilder_ == null) {
        ensureMetadataStoresIsMutable();
        metadataStores_.set(index, builderForValue.build());
        onChanged();
      } else {
        metadataStoresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder addMetadataStores(com.google.cloud.aiplatform.v1beta1.MetadataStore value) {
      if (metadataStoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataStoresIsMutable();
        metadataStores_.add(value);
        onChanged();
      } else {
        metadataStoresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder addMetadataStores(
        int index, com.google.cloud.aiplatform.v1beta1.MetadataStore value) {
      if (metadataStoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataStoresIsMutable();
        metadataStores_.add(index, value);
        onChanged();
      } else {
        metadataStoresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder addMetadataStores(
        com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder builderForValue) {
      if (metadataStoresBuilder_ == null) {
        ensureMetadataStoresIsMutable();
        metadataStores_.add(builderForValue.build());
        onChanged();
      } else {
        metadataStoresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder addMetadataStores(
        int index, com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder builderForValue) {
      if (metadataStoresBuilder_ == null) {
        ensureMetadataStoresIsMutable();
        metadataStores_.add(index, builderForValue.build());
        onChanged();
      } else {
        metadataStoresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder addAllMetadataStores(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.MetadataStore> values) {
      if (metadataStoresBuilder_ == null) {
        ensureMetadataStoresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metadataStores_);
        onChanged();
      } else {
        metadataStoresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder clearMetadataStores() {
      if (metadataStoresBuilder_ == null) {
        metadataStores_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metadataStoresBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public Builder removeMetadataStores(int index) {
      if (metadataStoresBuilder_ == null) {
        ensureMetadataStoresIsMutable();
        metadataStores_.remove(index);
        onChanged();
      } else {
        metadataStoresBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder getMetadataStoresBuilder(
        int index) {
      return getMetadataStoresFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder getMetadataStoresOrBuilder(
        int index) {
      if (metadataStoresBuilder_ == null) {
        return metadataStores_.get(index);  } else {
        return metadataStoresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder> 
         getMetadataStoresOrBuilderList() {
      if (metadataStoresBuilder_ != null) {
        return metadataStoresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metadataStores_);
      }
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder addMetadataStoresBuilder() {
      return getMetadataStoresFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1beta1.MetadataStore.getDefaultInstance());
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder addMetadataStoresBuilder(
        int index) {
      return getMetadataStoresFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1beta1.MetadataStore.getDefaultInstance());
    }
    /**
     * <pre>
     * The MetadataStores found for the Location.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.MetadataStore metadata_stores = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder> 
         getMetadataStoresBuilderList() {
      return getMetadataStoresFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.MetadataStore, com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder, com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder> 
        getMetadataStoresFieldBuilder() {
      if (metadataStoresBuilder_ == null) {
        metadataStoresBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.MetadataStore, com.google.cloud.aiplatform.v1beta1.MetadataStore.Builder, com.google.cloud.aiplatform.v1beta1.MetadataStoreOrBuilder>(
                metadataStores_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        metadataStores_ = null;
      }
      return metadataStoresBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token, which can be sent as
     * [ListMetadataStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListMetadataStoresRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A token, which can be sent as
     * [ListMetadataStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListMetadataStoresRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A token, which can be sent as
     * [ListMetadataStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListMetadataStoresRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token, which can be sent as
     * [ListMetadataStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListMetadataStoresRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A token, which can be sent as
     * [ListMetadataStoresRequest.page_token][google.cloud.aiplatform.v1beta1.ListMetadataStoresRequest.page_token]
     * to retrieve the next page. If this field is not populated, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMetadataStoresResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListMetadataStoresResponse>() {
    @java.lang.Override
    public ListMetadataStoresResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListMetadataStoresResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMetadataStoresResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListMetadataStoresResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

