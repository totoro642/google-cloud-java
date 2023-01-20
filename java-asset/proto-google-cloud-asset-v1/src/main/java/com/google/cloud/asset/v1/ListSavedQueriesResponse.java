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
 * Response of listing saved queries.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.ListSavedQueriesResponse}
 */
public final class ListSavedQueriesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.ListSavedQueriesResponse)
    ListSavedQueriesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSavedQueriesResponse.newBuilder() to construct.
  private ListSavedQueriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSavedQueriesResponse() {
    savedQueries_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSavedQueriesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_ListSavedQueriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_ListSavedQueriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.ListSavedQueriesResponse.class,
            com.google.cloud.asset.v1.ListSavedQueriesResponse.Builder.class);
  }

  public static final int SAVED_QUERIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.asset.v1.SavedQuery> savedQueries_;
  /**
   *
   *
   * <pre>
   * A list of savedQueries.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.asset.v1.SavedQuery> getSavedQueriesList() {
    return savedQueries_;
  }
  /**
   *
   *
   * <pre>
   * A list of savedQueries.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.asset.v1.SavedQueryOrBuilder>
      getSavedQueriesOrBuilderList() {
    return savedQueries_;
  }
  /**
   *
   *
   * <pre>
   * A list of savedQueries.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
   */
  @java.lang.Override
  public int getSavedQueriesCount() {
    return savedQueries_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of savedQueries.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.SavedQuery getSavedQueries(int index) {
    return savedQueries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of savedQueries.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.SavedQueryOrBuilder getSavedQueriesOrBuilder(int index) {
    return savedQueries_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < savedQueries_.size(); i++) {
      output.writeMessage(1, savedQueries_.get(i));
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
    for (int i = 0; i < savedQueries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, savedQueries_.get(i));
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
    if (!(obj instanceof com.google.cloud.asset.v1.ListSavedQueriesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.ListSavedQueriesResponse other =
        (com.google.cloud.asset.v1.ListSavedQueriesResponse) obj;

    if (!getSavedQueriesList().equals(other.getSavedQueriesList())) return false;
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
    if (getSavedQueriesCount() > 0) {
      hash = (37 * hash) + SAVED_QUERIES_FIELD_NUMBER;
      hash = (53 * hash) + getSavedQueriesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.ListSavedQueriesResponse prototype) {
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
   * Response of listing saved queries.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.ListSavedQueriesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.ListSavedQueriesResponse)
      com.google.cloud.asset.v1.ListSavedQueriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_ListSavedQueriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_ListSavedQueriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.ListSavedQueriesResponse.class,
              com.google.cloud.asset.v1.ListSavedQueriesResponse.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.ListSavedQueriesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (savedQueriesBuilder_ == null) {
        savedQueries_ = java.util.Collections.emptyList();
      } else {
        savedQueries_ = null;
        savedQueriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_ListSavedQueriesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ListSavedQueriesResponse getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.ListSavedQueriesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ListSavedQueriesResponse build() {
      com.google.cloud.asset.v1.ListSavedQueriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.ListSavedQueriesResponse buildPartial() {
      com.google.cloud.asset.v1.ListSavedQueriesResponse result =
          new com.google.cloud.asset.v1.ListSavedQueriesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.asset.v1.ListSavedQueriesResponse result) {
      if (savedQueriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          savedQueries_ = java.util.Collections.unmodifiableList(savedQueries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.savedQueries_ = savedQueries_;
      } else {
        result.savedQueries_ = savedQueriesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.asset.v1.ListSavedQueriesResponse result) {
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
      if (other instanceof com.google.cloud.asset.v1.ListSavedQueriesResponse) {
        return mergeFrom((com.google.cloud.asset.v1.ListSavedQueriesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.ListSavedQueriesResponse other) {
      if (other == com.google.cloud.asset.v1.ListSavedQueriesResponse.getDefaultInstance())
        return this;
      if (savedQueriesBuilder_ == null) {
        if (!other.savedQueries_.isEmpty()) {
          if (savedQueries_.isEmpty()) {
            savedQueries_ = other.savedQueries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSavedQueriesIsMutable();
            savedQueries_.addAll(other.savedQueries_);
          }
          onChanged();
        }
      } else {
        if (!other.savedQueries_.isEmpty()) {
          if (savedQueriesBuilder_.isEmpty()) {
            savedQueriesBuilder_.dispose();
            savedQueriesBuilder_ = null;
            savedQueries_ = other.savedQueries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            savedQueriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSavedQueriesFieldBuilder()
                    : null;
          } else {
            savedQueriesBuilder_.addAllMessages(other.savedQueries_);
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
                com.google.cloud.asset.v1.SavedQuery m =
                    input.readMessage(
                        com.google.cloud.asset.v1.SavedQuery.parser(), extensionRegistry);
                if (savedQueriesBuilder_ == null) {
                  ensureSavedQueriesIsMutable();
                  savedQueries_.add(m);
                } else {
                  savedQueriesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.asset.v1.SavedQuery> savedQueries_ =
        java.util.Collections.emptyList();

    private void ensureSavedQueriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        savedQueries_ =
            new java.util.ArrayList<com.google.cloud.asset.v1.SavedQuery>(savedQueries_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1.SavedQuery,
            com.google.cloud.asset.v1.SavedQuery.Builder,
            com.google.cloud.asset.v1.SavedQueryOrBuilder>
        savedQueriesBuilder_;

    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.SavedQuery> getSavedQueriesList() {
      if (savedQueriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(savedQueries_);
      } else {
        return savedQueriesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public int getSavedQueriesCount() {
      if (savedQueriesBuilder_ == null) {
        return savedQueries_.size();
      } else {
        return savedQueriesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public com.google.cloud.asset.v1.SavedQuery getSavedQueries(int index) {
      if (savedQueriesBuilder_ == null) {
        return savedQueries_.get(index);
      } else {
        return savedQueriesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder setSavedQueries(int index, com.google.cloud.asset.v1.SavedQuery value) {
      if (savedQueriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSavedQueriesIsMutable();
        savedQueries_.set(index, value);
        onChanged();
      } else {
        savedQueriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder setSavedQueries(
        int index, com.google.cloud.asset.v1.SavedQuery.Builder builderForValue) {
      if (savedQueriesBuilder_ == null) {
        ensureSavedQueriesIsMutable();
        savedQueries_.set(index, builderForValue.build());
        onChanged();
      } else {
        savedQueriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder addSavedQueries(com.google.cloud.asset.v1.SavedQuery value) {
      if (savedQueriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSavedQueriesIsMutable();
        savedQueries_.add(value);
        onChanged();
      } else {
        savedQueriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder addSavedQueries(int index, com.google.cloud.asset.v1.SavedQuery value) {
      if (savedQueriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSavedQueriesIsMutable();
        savedQueries_.add(index, value);
        onChanged();
      } else {
        savedQueriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder addSavedQueries(com.google.cloud.asset.v1.SavedQuery.Builder builderForValue) {
      if (savedQueriesBuilder_ == null) {
        ensureSavedQueriesIsMutable();
        savedQueries_.add(builderForValue.build());
        onChanged();
      } else {
        savedQueriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder addSavedQueries(
        int index, com.google.cloud.asset.v1.SavedQuery.Builder builderForValue) {
      if (savedQueriesBuilder_ == null) {
        ensureSavedQueriesIsMutable();
        savedQueries_.add(index, builderForValue.build());
        onChanged();
      } else {
        savedQueriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder addAllSavedQueries(
        java.lang.Iterable<? extends com.google.cloud.asset.v1.SavedQuery> values) {
      if (savedQueriesBuilder_ == null) {
        ensureSavedQueriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, savedQueries_);
        onChanged();
      } else {
        savedQueriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder clearSavedQueries() {
      if (savedQueriesBuilder_ == null) {
        savedQueries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        savedQueriesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public Builder removeSavedQueries(int index) {
      if (savedQueriesBuilder_ == null) {
        ensureSavedQueriesIsMutable();
        savedQueries_.remove(index);
        onChanged();
      } else {
        savedQueriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public com.google.cloud.asset.v1.SavedQuery.Builder getSavedQueriesBuilder(int index) {
      return getSavedQueriesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public com.google.cloud.asset.v1.SavedQueryOrBuilder getSavedQueriesOrBuilder(int index) {
      if (savedQueriesBuilder_ == null) {
        return savedQueries_.get(index);
      } else {
        return savedQueriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.asset.v1.SavedQueryOrBuilder>
        getSavedQueriesOrBuilderList() {
      if (savedQueriesBuilder_ != null) {
        return savedQueriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(savedQueries_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public com.google.cloud.asset.v1.SavedQuery.Builder addSavedQueriesBuilder() {
      return getSavedQueriesFieldBuilder()
          .addBuilder(com.google.cloud.asset.v1.SavedQuery.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public com.google.cloud.asset.v1.SavedQuery.Builder addSavedQueriesBuilder(int index) {
      return getSavedQueriesFieldBuilder()
          .addBuilder(index, com.google.cloud.asset.v1.SavedQuery.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of savedQueries.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.SavedQuery saved_queries = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.SavedQuery.Builder>
        getSavedQueriesBuilderList() {
      return getSavedQueriesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1.SavedQuery,
            com.google.cloud.asset.v1.SavedQuery.Builder,
            com.google.cloud.asset.v1.SavedQueryOrBuilder>
        getSavedQueriesFieldBuilder() {
      if (savedQueriesBuilder_ == null) {
        savedQueriesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.asset.v1.SavedQuery,
                com.google.cloud.asset.v1.SavedQuery.Builder,
                com.google.cloud.asset.v1.SavedQueryOrBuilder>(
                savedQueries_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        savedQueries_ = null;
      }
      return savedQueriesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.ListSavedQueriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.ListSavedQueriesResponse)
  private static final com.google.cloud.asset.v1.ListSavedQueriesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.ListSavedQueriesResponse();
  }

  public static com.google.cloud.asset.v1.ListSavedQueriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSavedQueriesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSavedQueriesResponse>() {
        @java.lang.Override
        public ListSavedQueriesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSavedQueriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSavedQueriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.ListSavedQueriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
