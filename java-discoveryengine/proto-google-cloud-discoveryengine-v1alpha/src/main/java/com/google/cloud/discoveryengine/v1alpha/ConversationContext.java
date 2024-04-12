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
// source: google/cloud/discoveryengine/v1alpha/conversation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

/**
 *
 *
 * <pre>
 * Defines context of the conversation
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1alpha.ConversationContext}
 */
public final class ConversationContext extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1alpha.ConversationContext)
    ConversationContextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConversationContext.newBuilder() to construct.
  private ConversationContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConversationContext() {
    contextDocuments_ = com.google.protobuf.LazyStringArrayList.emptyList();
    activeDocument_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConversationContext();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1alpha.ConversationProto
        .internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1alpha.ConversationProto
        .internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1alpha.ConversationContext.class,
            com.google.cloud.discoveryengine.v1alpha.ConversationContext.Builder.class);
  }

  public static final int CONTEXT_DOCUMENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList contextDocuments_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The current list of documents the user is seeing.
   * It contains the document resource references.
   * </pre>
   *
   * <code>repeated string context_documents = 1;</code>
   *
   * @return A list containing the contextDocuments.
   */
  public com.google.protobuf.ProtocolStringList getContextDocumentsList() {
    return contextDocuments_;
  }
  /**
   *
   *
   * <pre>
   * The current list of documents the user is seeing.
   * It contains the document resource references.
   * </pre>
   *
   * <code>repeated string context_documents = 1;</code>
   *
   * @return The count of contextDocuments.
   */
  public int getContextDocumentsCount() {
    return contextDocuments_.size();
  }
  /**
   *
   *
   * <pre>
   * The current list of documents the user is seeing.
   * It contains the document resource references.
   * </pre>
   *
   * <code>repeated string context_documents = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The contextDocuments at the given index.
   */
  public java.lang.String getContextDocuments(int index) {
    return contextDocuments_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The current list of documents the user is seeing.
   * It contains the document resource references.
   * </pre>
   *
   * <code>repeated string context_documents = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the contextDocuments at the given index.
   */
  public com.google.protobuf.ByteString getContextDocumentsBytes(int index) {
    return contextDocuments_.getByteString(index);
  }

  public static final int ACTIVE_DOCUMENT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object activeDocument_ = "";
  /**
   *
   *
   * <pre>
   * The current active document the user opened.
   * It contains the document resource reference.
   * </pre>
   *
   * <code>string active_document = 2;</code>
   *
   * @return The activeDocument.
   */
  @java.lang.Override
  public java.lang.String getActiveDocument() {
    java.lang.Object ref = activeDocument_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      activeDocument_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The current active document the user opened.
   * It contains the document resource reference.
   * </pre>
   *
   * <code>string active_document = 2;</code>
   *
   * @return The bytes for activeDocument.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getActiveDocumentBytes() {
    java.lang.Object ref = activeDocument_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      activeDocument_ = b;
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
    for (int i = 0; i < contextDocuments_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contextDocuments_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(activeDocument_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, activeDocument_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < contextDocuments_.size(); i++) {
        dataSize += computeStringSizeNoTag(contextDocuments_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getContextDocumentsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(activeDocument_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, activeDocument_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1alpha.ConversationContext)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1alpha.ConversationContext other =
        (com.google.cloud.discoveryengine.v1alpha.ConversationContext) obj;

    if (!getContextDocumentsList().equals(other.getContextDocumentsList())) return false;
    if (!getActiveDocument().equals(other.getActiveDocument())) return false;
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
    if (getContextDocumentsCount() > 0) {
      hash = (37 * hash) + CONTEXT_DOCUMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getContextDocumentsList().hashCode();
    }
    hash = (37 * hash) + ACTIVE_DOCUMENT_FIELD_NUMBER;
    hash = (53 * hash) + getActiveDocument().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext parseFrom(
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
      com.google.cloud.discoveryengine.v1alpha.ConversationContext prototype) {
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
   * Defines context of the conversation
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1alpha.ConversationContext}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1alpha.ConversationContext)
      com.google.cloud.discoveryengine.v1alpha.ConversationContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.ConversationProto
          .internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1alpha.ConversationProto
          .internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1alpha.ConversationContext.class,
              com.google.cloud.discoveryengine.v1alpha.ConversationContext.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1alpha.ConversationContext.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      contextDocuments_ = com.google.protobuf.LazyStringArrayList.emptyList();
      activeDocument_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1alpha.ConversationProto
          .internal_static_google_cloud_discoveryengine_v1alpha_ConversationContext_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.ConversationContext
        getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1alpha.ConversationContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.ConversationContext build() {
      com.google.cloud.discoveryengine.v1alpha.ConversationContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1alpha.ConversationContext buildPartial() {
      com.google.cloud.discoveryengine.v1alpha.ConversationContext result =
          new com.google.cloud.discoveryengine.v1alpha.ConversationContext(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.discoveryengine.v1alpha.ConversationContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        contextDocuments_.makeImmutable();
        result.contextDocuments_ = contextDocuments_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.activeDocument_ = activeDocument_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1alpha.ConversationContext) {
        return mergeFrom((com.google.cloud.discoveryengine.v1alpha.ConversationContext) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1alpha.ConversationContext other) {
      if (other
          == com.google.cloud.discoveryengine.v1alpha.ConversationContext.getDefaultInstance())
        return this;
      if (!other.contextDocuments_.isEmpty()) {
        if (contextDocuments_.isEmpty()) {
          contextDocuments_ = other.contextDocuments_;
          bitField0_ |= 0x00000001;
        } else {
          ensureContextDocumentsIsMutable();
          contextDocuments_.addAll(other.contextDocuments_);
        }
        onChanged();
      }
      if (!other.getActiveDocument().isEmpty()) {
        activeDocument_ = other.activeDocument_;
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureContextDocumentsIsMutable();
                contextDocuments_.add(s);
                break;
              } // case 10
            case 18:
              {
                activeDocument_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.LazyStringArrayList contextDocuments_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureContextDocumentsIsMutable() {
      if (!contextDocuments_.isModifiable()) {
        contextDocuments_ = new com.google.protobuf.LazyStringArrayList(contextDocuments_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @return A list containing the contextDocuments.
     */
    public com.google.protobuf.ProtocolStringList getContextDocumentsList() {
      contextDocuments_.makeImmutable();
      return contextDocuments_;
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @return The count of contextDocuments.
     */
    public int getContextDocumentsCount() {
      return contextDocuments_.size();
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The contextDocuments at the given index.
     */
    public java.lang.String getContextDocuments(int index) {
      return contextDocuments_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the contextDocuments at the given index.
     */
    public com.google.protobuf.ByteString getContextDocumentsBytes(int index) {
      return contextDocuments_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The contextDocuments to set.
     * @return This builder for chaining.
     */
    public Builder setContextDocuments(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureContextDocumentsIsMutable();
      contextDocuments_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @param value The contextDocuments to add.
     * @return This builder for chaining.
     */
    public Builder addContextDocuments(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureContextDocumentsIsMutable();
      contextDocuments_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @param values The contextDocuments to add.
     * @return This builder for chaining.
     */
    public Builder addAllContextDocuments(java.lang.Iterable<java.lang.String> values) {
      ensureContextDocumentsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, contextDocuments_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContextDocuments() {
      contextDocuments_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current list of documents the user is seeing.
     * It contains the document resource references.
     * </pre>
     *
     * <code>repeated string context_documents = 1;</code>
     *
     * @param value The bytes of the contextDocuments to add.
     * @return This builder for chaining.
     */
    public Builder addContextDocumentsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureContextDocumentsIsMutable();
      contextDocuments_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object activeDocument_ = "";
    /**
     *
     *
     * <pre>
     * The current active document the user opened.
     * It contains the document resource reference.
     * </pre>
     *
     * <code>string active_document = 2;</code>
     *
     * @return The activeDocument.
     */
    public java.lang.String getActiveDocument() {
      java.lang.Object ref = activeDocument_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        activeDocument_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The current active document the user opened.
     * It contains the document resource reference.
     * </pre>
     *
     * <code>string active_document = 2;</code>
     *
     * @return The bytes for activeDocument.
     */
    public com.google.protobuf.ByteString getActiveDocumentBytes() {
      java.lang.Object ref = activeDocument_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        activeDocument_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The current active document the user opened.
     * It contains the document resource reference.
     * </pre>
     *
     * <code>string active_document = 2;</code>
     *
     * @param value The activeDocument to set.
     * @return This builder for chaining.
     */
    public Builder setActiveDocument(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      activeDocument_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current active document the user opened.
     * It contains the document resource reference.
     * </pre>
     *
     * <code>string active_document = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearActiveDocument() {
      activeDocument_ = getDefaultInstance().getActiveDocument();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current active document the user opened.
     * It contains the document resource reference.
     * </pre>
     *
     * <code>string active_document = 2;</code>
     *
     * @param value The bytes for activeDocument to set.
     * @return This builder for chaining.
     */
    public Builder setActiveDocumentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      activeDocument_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1alpha.ConversationContext)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1alpha.ConversationContext)
  private static final com.google.cloud.discoveryengine.v1alpha.ConversationContext
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1alpha.ConversationContext();
  }

  public static com.google.cloud.discoveryengine.v1alpha.ConversationContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversationContext> PARSER =
      new com.google.protobuf.AbstractParser<ConversationContext>() {
        @java.lang.Override
        public ConversationContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversationContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversationContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1alpha.ConversationContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
