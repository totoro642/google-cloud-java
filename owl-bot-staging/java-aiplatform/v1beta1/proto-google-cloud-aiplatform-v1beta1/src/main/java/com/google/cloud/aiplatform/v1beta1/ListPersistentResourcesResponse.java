// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/persistent_resource_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Response message for
 * [PersistentResourceService.ListPersistentResources][google.cloud.aiplatform.v1beta1.PersistentResourceService.ListPersistentResources]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse}
 */
public final class ListPersistentResourcesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse)
    ListPersistentResourcesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPersistentResourcesResponse.newBuilder() to construct.
  private ListPersistentResourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPersistentResourcesResponse() {
    persistentResources_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPersistentResourcesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListPersistentResourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListPersistentResourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse.class, com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse.Builder.class);
  }

  public static final int PERSISTENT_RESOURCES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.PersistentResource> persistentResources_;
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.PersistentResource> getPersistentResourcesList() {
    return persistentResources_;
  }
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder> 
      getPersistentResourcesOrBuilderList() {
    return persistentResources_;
  }
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
   */
  @java.lang.Override
  public int getPersistentResourcesCount() {
    return persistentResources_.size();
  }
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PersistentResource getPersistentResources(int index) {
    return persistentResources_.get(index);
  }
  /**
   * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder getPersistentResourcesOrBuilder(
      int index) {
    return persistentResources_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListPersistentResourcesRequest.page_token][google.cloud.aiplatform.v1beta1.ListPersistentResourcesRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve next page of results.
   * Pass to
   * [ListPersistentResourcesRequest.page_token][google.cloud.aiplatform.v1beta1.ListPersistentResourcesRequest.page_token]
   * to obtain that page.
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
    for (int i = 0; i < persistentResources_.size(); i++) {
      output.writeMessage(1, persistentResources_.get(i));
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
    for (int i = 0; i < persistentResources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, persistentResources_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse other = (com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse) obj;

    if (!getPersistentResourcesList()
        .equals(other.getPersistentResourcesList())) return false;
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
    if (getPersistentResourcesCount() > 0) {
      hash = (37 * hash) + PERSISTENT_RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getPersistentResourcesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse prototype) {
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
   * [PersistentResourceService.ListPersistentResources][google.cloud.aiplatform.v1beta1.PersistentResourceService.ListPersistentResources]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse)
      com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListPersistentResourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListPersistentResourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse.class, com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse.newBuilder()
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
      if (persistentResourcesBuilder_ == null) {
        persistentResources_ = java.util.Collections.emptyList();
      } else {
        persistentResources_ = null;
        persistentResourcesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ListPersistentResourcesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse result = new com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse result) {
      if (persistentResourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          persistentResources_ = java.util.Collections.unmodifiableList(persistentResources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.persistentResources_ = persistentResources_;
      } else {
        result.persistentResources_ = persistentResourcesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse.getDefaultInstance()) return this;
      if (persistentResourcesBuilder_ == null) {
        if (!other.persistentResources_.isEmpty()) {
          if (persistentResources_.isEmpty()) {
            persistentResources_ = other.persistentResources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersistentResourcesIsMutable();
            persistentResources_.addAll(other.persistentResources_);
          }
          onChanged();
        }
      } else {
        if (!other.persistentResources_.isEmpty()) {
          if (persistentResourcesBuilder_.isEmpty()) {
            persistentResourcesBuilder_.dispose();
            persistentResourcesBuilder_ = null;
            persistentResources_ = other.persistentResources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            persistentResourcesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPersistentResourcesFieldBuilder() : null;
          } else {
            persistentResourcesBuilder_.addAllMessages(other.persistentResources_);
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
              com.google.cloud.aiplatform.v1beta1.PersistentResource m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.PersistentResource.parser(),
                      extensionRegistry);
              if (persistentResourcesBuilder_ == null) {
                ensurePersistentResourcesIsMutable();
                persistentResources_.add(m);
              } else {
                persistentResourcesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.PersistentResource> persistentResources_ =
      java.util.Collections.emptyList();
    private void ensurePersistentResourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        persistentResources_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.PersistentResource>(persistentResources_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.PersistentResource, com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder, com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder> persistentResourcesBuilder_;

    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.PersistentResource> getPersistentResourcesList() {
      if (persistentResourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(persistentResources_);
      } else {
        return persistentResourcesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public int getPersistentResourcesCount() {
      if (persistentResourcesBuilder_ == null) {
        return persistentResources_.size();
      } else {
        return persistentResourcesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PersistentResource getPersistentResources(int index) {
      if (persistentResourcesBuilder_ == null) {
        return persistentResources_.get(index);
      } else {
        return persistentResourcesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder setPersistentResources(
        int index, com.google.cloud.aiplatform.v1beta1.PersistentResource value) {
      if (persistentResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersistentResourcesIsMutable();
        persistentResources_.set(index, value);
        onChanged();
      } else {
        persistentResourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder setPersistentResources(
        int index, com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder builderForValue) {
      if (persistentResourcesBuilder_ == null) {
        ensurePersistentResourcesIsMutable();
        persistentResources_.set(index, builderForValue.build());
        onChanged();
      } else {
        persistentResourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder addPersistentResources(com.google.cloud.aiplatform.v1beta1.PersistentResource value) {
      if (persistentResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersistentResourcesIsMutable();
        persistentResources_.add(value);
        onChanged();
      } else {
        persistentResourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder addPersistentResources(
        int index, com.google.cloud.aiplatform.v1beta1.PersistentResource value) {
      if (persistentResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersistentResourcesIsMutable();
        persistentResources_.add(index, value);
        onChanged();
      } else {
        persistentResourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder addPersistentResources(
        com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder builderForValue) {
      if (persistentResourcesBuilder_ == null) {
        ensurePersistentResourcesIsMutable();
        persistentResources_.add(builderForValue.build());
        onChanged();
      } else {
        persistentResourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder addPersistentResources(
        int index, com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder builderForValue) {
      if (persistentResourcesBuilder_ == null) {
        ensurePersistentResourcesIsMutable();
        persistentResources_.add(index, builderForValue.build());
        onChanged();
      } else {
        persistentResourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder addAllPersistentResources(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.PersistentResource> values) {
      if (persistentResourcesBuilder_ == null) {
        ensurePersistentResourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, persistentResources_);
        onChanged();
      } else {
        persistentResourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder clearPersistentResources() {
      if (persistentResourcesBuilder_ == null) {
        persistentResources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        persistentResourcesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public Builder removePersistentResources(int index) {
      if (persistentResourcesBuilder_ == null) {
        ensurePersistentResourcesIsMutable();
        persistentResources_.remove(index);
        onChanged();
      } else {
        persistentResourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder getPersistentResourcesBuilder(
        int index) {
      return getPersistentResourcesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder getPersistentResourcesOrBuilder(
        int index) {
      if (persistentResourcesBuilder_ == null) {
        return persistentResources_.get(index);  } else {
        return persistentResourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder> 
         getPersistentResourcesOrBuilderList() {
      if (persistentResourcesBuilder_ != null) {
        return persistentResourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(persistentResources_);
      }
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder addPersistentResourcesBuilder() {
      return getPersistentResourcesFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1beta1.PersistentResource.getDefaultInstance());
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder addPersistentResourcesBuilder(
        int index) {
      return getPersistentResourcesFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1beta1.PersistentResource.getDefaultInstance());
    }
    /**
     * <code>repeated .google.cloud.aiplatform.v1beta1.PersistentResource persistent_resources = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder> 
         getPersistentResourcesBuilderList() {
      return getPersistentResourcesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.PersistentResource, com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder, com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder> 
        getPersistentResourcesFieldBuilder() {
      if (persistentResourcesBuilder_ == null) {
        persistentResourcesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.PersistentResource, com.google.cloud.aiplatform.v1beta1.PersistentResource.Builder, com.google.cloud.aiplatform.v1beta1.PersistentResourceOrBuilder>(
                persistentResources_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        persistentResources_ = null;
      }
      return persistentResourcesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [ListPersistentResourcesRequest.page_token][google.cloud.aiplatform.v1beta1.ListPersistentResourcesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListPersistentResourcesRequest.page_token][google.cloud.aiplatform.v1beta1.ListPersistentResourcesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListPersistentResourcesRequest.page_token][google.cloud.aiplatform.v1beta1.ListPersistentResourcesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListPersistentResourcesRequest.page_token][google.cloud.aiplatform.v1beta1.ListPersistentResourcesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListPersistentResourcesRequest.page_token][google.cloud.aiplatform.v1beta1.ListPersistentResourcesRequest.page_token]
     * to obtain that page.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPersistentResourcesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPersistentResourcesResponse>() {
    @java.lang.Override
    public ListPersistentResourcesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPersistentResourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPersistentResourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListPersistentResourcesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

