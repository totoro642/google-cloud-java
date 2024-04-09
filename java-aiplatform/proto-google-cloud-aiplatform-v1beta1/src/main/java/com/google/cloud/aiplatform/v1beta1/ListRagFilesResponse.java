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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [VertexRagDataService.ListRagFiles][google.cloud.aiplatform.v1beta1.VertexRagDataService.ListRagFiles].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListRagFilesResponse}
 */
public final class ListRagFilesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListRagFilesResponse)
    ListRagFilesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListRagFilesResponse.newBuilder() to construct.
  private ListRagFilesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListRagFilesResponse() {
    ragFiles_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListRagFilesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListRagFilesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListRagFilesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse.Builder.class);
  }

  public static final int RAG_FILES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.RagFile> ragFiles_;
  /**
   *
   *
   * <pre>
   * List of RagFiles in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.RagFile> getRagFilesList() {
    return ragFiles_;
  }
  /**
   *
   *
   * <pre>
   * List of RagFiles in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder>
      getRagFilesOrBuilderList() {
    return ragFiles_;
  }
  /**
   *
   *
   * <pre>
   * List of RagFiles in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
   */
  @java.lang.Override
  public int getRagFilesCount() {
    return ragFiles_.size();
  }
  /**
   *
   *
   * <pre>
   * List of RagFiles in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RagFile getRagFiles(int index) {
    return ragFiles_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of RagFiles in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder getRagFilesOrBuilder(int index) {
    return ragFiles_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListRagFilesRequest.page_token][google.cloud.aiplatform.v1beta1.ListRagFilesRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve the next page of results.
   * Pass to
   * [ListRagFilesRequest.page_token][google.cloud.aiplatform.v1beta1.ListRagFilesRequest.page_token]
   * to obtain that page.
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
    for (int i = 0; i < ragFiles_.size(); i++) {
      output.writeMessage(1, ragFiles_.get(i));
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
    for (int i = 0; i < ragFiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, ragFiles_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse) obj;

    if (!getRagFilesList().equals(other.getRagFilesList())) return false;
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
    if (getRagFilesCount() > 0) {
      hash = (37 * hash) + RAG_FILES_FIELD_NUMBER;
      hash = (53 * hash) + getRagFilesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse prototype) {
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
   * Response message for
   * [VertexRagDataService.ListRagFiles][google.cloud.aiplatform.v1beta1.VertexRagDataService.ListRagFiles].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListRagFilesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListRagFilesResponse)
      com.google.cloud.aiplatform.v1beta1.ListRagFilesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListRagFilesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListRagFilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (ragFilesBuilder_ == null) {
        ragFiles_ = java.util.Collections.emptyList();
      } else {
        ragFiles_ = null;
        ragFilesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListRagFilesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse result) {
      if (ragFilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ragFiles_ = java.util.Collections.unmodifiableList(ragFiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ragFiles_ = ragFiles_;
      } else {
        result.ragFiles_ = ragFilesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse.getDefaultInstance())
        return this;
      if (ragFilesBuilder_ == null) {
        if (!other.ragFiles_.isEmpty()) {
          if (ragFiles_.isEmpty()) {
            ragFiles_ = other.ragFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRagFilesIsMutable();
            ragFiles_.addAll(other.ragFiles_);
          }
          onChanged();
        }
      } else {
        if (!other.ragFiles_.isEmpty()) {
          if (ragFilesBuilder_.isEmpty()) {
            ragFilesBuilder_.dispose();
            ragFilesBuilder_ = null;
            ragFiles_ = other.ragFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ragFilesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRagFilesFieldBuilder()
                    : null;
          } else {
            ragFilesBuilder_.addAllMessages(other.ragFiles_);
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
                com.google.cloud.aiplatform.v1beta1.RagFile m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.RagFile.parser(), extensionRegistry);
                if (ragFilesBuilder_ == null) {
                  ensureRagFilesIsMutable();
                  ragFiles_.add(m);
                } else {
                  ragFilesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.RagFile> ragFiles_ =
        java.util.Collections.emptyList();

    private void ensureRagFilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ragFiles_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.RagFile>(ragFiles_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RagFile,
            com.google.cloud.aiplatform.v1beta1.RagFile.Builder,
            com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder>
        ragFilesBuilder_;

    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.RagFile> getRagFilesList() {
      if (ragFilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ragFiles_);
      } else {
        return ragFilesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public int getRagFilesCount() {
      if (ragFilesBuilder_ == null) {
        return ragFiles_.size();
      } else {
        return ragFilesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RagFile getRagFiles(int index) {
      if (ragFilesBuilder_ == null) {
        return ragFiles_.get(index);
      } else {
        return ragFilesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder setRagFiles(int index, com.google.cloud.aiplatform.v1beta1.RagFile value) {
      if (ragFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRagFilesIsMutable();
        ragFiles_.set(index, value);
        onChanged();
      } else {
        ragFilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder setRagFiles(
        int index, com.google.cloud.aiplatform.v1beta1.RagFile.Builder builderForValue) {
      if (ragFilesBuilder_ == null) {
        ensureRagFilesIsMutable();
        ragFiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        ragFilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder addRagFiles(com.google.cloud.aiplatform.v1beta1.RagFile value) {
      if (ragFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRagFilesIsMutable();
        ragFiles_.add(value);
        onChanged();
      } else {
        ragFilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder addRagFiles(int index, com.google.cloud.aiplatform.v1beta1.RagFile value) {
      if (ragFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRagFilesIsMutable();
        ragFiles_.add(index, value);
        onChanged();
      } else {
        ragFilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder addRagFiles(
        com.google.cloud.aiplatform.v1beta1.RagFile.Builder builderForValue) {
      if (ragFilesBuilder_ == null) {
        ensureRagFilesIsMutable();
        ragFiles_.add(builderForValue.build());
        onChanged();
      } else {
        ragFilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder addRagFiles(
        int index, com.google.cloud.aiplatform.v1beta1.RagFile.Builder builderForValue) {
      if (ragFilesBuilder_ == null) {
        ensureRagFilesIsMutable();
        ragFiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        ragFilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder addAllRagFiles(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.RagFile> values) {
      if (ragFilesBuilder_ == null) {
        ensureRagFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ragFiles_);
        onChanged();
      } else {
        ragFilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder clearRagFiles() {
      if (ragFilesBuilder_ == null) {
        ragFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ragFilesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public Builder removeRagFiles(int index) {
      if (ragFilesBuilder_ == null) {
        ensureRagFilesIsMutable();
        ragFiles_.remove(index);
        onChanged();
      } else {
        ragFilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RagFile.Builder getRagFilesBuilder(int index) {
      return getRagFilesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder getRagFilesOrBuilder(int index) {
      if (ragFilesBuilder_ == null) {
        return ragFiles_.get(index);
      } else {
        return ragFilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder>
        getRagFilesOrBuilderList() {
      if (ragFilesBuilder_ != null) {
        return ragFilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ragFiles_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RagFile.Builder addRagFilesBuilder() {
      return getRagFilesFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RagFile.Builder addRagFilesBuilder(int index) {
      return getRagFilesFieldBuilder()
          .addBuilder(index, com.google.cloud.aiplatform.v1beta1.RagFile.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of RagFiles in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RagFile rag_files = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.RagFile.Builder>
        getRagFilesBuilderList() {
      return getRagFilesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RagFile,
            com.google.cloud.aiplatform.v1beta1.RagFile.Builder,
            com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder>
        getRagFilesFieldBuilder() {
      if (ragFilesBuilder_ == null) {
        ragFilesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.RagFile,
                com.google.cloud.aiplatform.v1beta1.RagFile.Builder,
                com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder>(
                ragFiles_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        ragFiles_ = null;
      }
      return ragFilesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListRagFilesRequest.page_token][google.cloud.aiplatform.v1beta1.ListRagFilesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListRagFilesRequest.page_token][google.cloud.aiplatform.v1beta1.ListRagFilesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListRagFilesRequest.page_token][google.cloud.aiplatform.v1beta1.ListRagFilesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListRagFilesRequest.page_token][google.cloud.aiplatform.v1beta1.ListRagFilesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListRagFilesRequest.page_token][google.cloud.aiplatform.v1beta1.ListRagFilesRequest.page_token]
     * to obtain that page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListRagFilesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListRagFilesResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRagFilesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListRagFilesResponse>() {
        @java.lang.Override
        public ListRagFilesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRagFilesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRagFilesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListRagFilesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
