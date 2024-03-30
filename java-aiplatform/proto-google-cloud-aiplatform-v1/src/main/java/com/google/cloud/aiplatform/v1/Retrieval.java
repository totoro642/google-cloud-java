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
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Defines a retrieval tool that model can call to access external knowledge.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.Retrieval}
 */
public final class Retrieval extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.Retrieval)
    RetrievalOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Retrieval.newBuilder() to construct.
  private Retrieval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Retrieval() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Retrieval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ToolProto
        .internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ToolProto
        .internal_static_google_cloud_aiplatform_v1_Retrieval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.Retrieval.class,
            com.google.cloud.aiplatform.v1.Retrieval.Builder.class);
  }

  private int sourceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    VERTEX_AI_SEARCH(2),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 2:
          return VERTEX_AI_SEARCH;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int VERTEX_AI_SEARCH_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
   *
   * @return Whether the vertexAiSearch field is set.
   */
  @java.lang.Override
  public boolean hasVertexAiSearch() {
    return sourceCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
   *
   * @return The vertexAiSearch.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.VertexAISearch getVertexAiSearch() {
    if (sourceCase_ == 2) {
      return (com.google.cloud.aiplatform.v1.VertexAISearch) source_;
    }
    return com.google.cloud.aiplatform.v1.VertexAISearch.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Set to use data source powered by Vertex AI Search.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.VertexAISearchOrBuilder getVertexAiSearchOrBuilder() {
    if (sourceCase_ == 2) {
      return (com.google.cloud.aiplatform.v1.VertexAISearch) source_;
    }
    return com.google.cloud.aiplatform.v1.VertexAISearch.getDefaultInstance();
  }

  public static final int DISABLE_ATTRIBUTION_FIELD_NUMBER = 3;
  private boolean disableAttribution_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Disable using the result from this tool in detecting grounding
   * attribution. This does not affect how the result is given to the model for
   * generation.
   * </pre>
   *
   * <code>bool disable_attribution = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disableAttribution.
   */
  @java.lang.Override
  public boolean getDisableAttribution() {
    return disableAttribution_;
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
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.aiplatform.v1.VertexAISearch) source_);
    }
    if (disableAttribution_ != false) {
      output.writeBool(3, disableAttribution_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.aiplatform.v1.VertexAISearch) source_);
    }
    if (disableAttribution_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, disableAttribution_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.Retrieval)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.Retrieval other = (com.google.cloud.aiplatform.v1.Retrieval) obj;

    if (getDisableAttribution() != other.getDisableAttribution()) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 2:
        if (!getVertexAiSearch().equals(other.getVertexAiSearch())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + DISABLE_ATTRIBUTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDisableAttribution());
    switch (sourceCase_) {
      case 2:
        hash = (37 * hash) + VERTEX_AI_SEARCH_FIELD_NUMBER;
        hash = (53 * hash) + getVertexAiSearch().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Retrieval parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.Retrieval prototype) {
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
   * Defines a retrieval tool that model can call to access external knowledge.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.Retrieval}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.Retrieval)
      com.google.cloud.aiplatform.v1.RetrievalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_Retrieval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.Retrieval.class,
              com.google.cloud.aiplatform.v1.Retrieval.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.Retrieval.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (vertexAiSearchBuilder_ != null) {
        vertexAiSearchBuilder_.clear();
      }
      disableAttribution_ = false;
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ToolProto
          .internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Retrieval getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.Retrieval.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Retrieval build() {
      com.google.cloud.aiplatform.v1.Retrieval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Retrieval buildPartial() {
      com.google.cloud.aiplatform.v1.Retrieval result =
          new com.google.cloud.aiplatform.v1.Retrieval(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.Retrieval result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.disableAttribution_ = disableAttribution_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.aiplatform.v1.Retrieval result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
      if (sourceCase_ == 2 && vertexAiSearchBuilder_ != null) {
        result.source_ = vertexAiSearchBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.Retrieval) {
        return mergeFrom((com.google.cloud.aiplatform.v1.Retrieval) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.Retrieval other) {
      if (other == com.google.cloud.aiplatform.v1.Retrieval.getDefaultInstance()) return this;
      if (other.getDisableAttribution() != false) {
        setDisableAttribution(other.getDisableAttribution());
      }
      switch (other.getSourceCase()) {
        case VERTEX_AI_SEARCH:
          {
            mergeVertexAiSearch(other.getVertexAiSearch());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
          }
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
            case 18:
              {
                input.readMessage(getVertexAiSearchFieldBuilder().getBuilder(), extensionRegistry);
                sourceCase_ = 2;
                break;
              } // case 18
            case 24:
              {
                disableAttribution_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
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

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.VertexAISearch,
            com.google.cloud.aiplatform.v1.VertexAISearch.Builder,
            com.google.cloud.aiplatform.v1.VertexAISearchOrBuilder>
        vertexAiSearchBuilder_;
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     *
     * @return Whether the vertexAiSearch field is set.
     */
    @java.lang.Override
    public boolean hasVertexAiSearch() {
      return sourceCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     *
     * @return The vertexAiSearch.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.VertexAISearch getVertexAiSearch() {
      if (vertexAiSearchBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.google.cloud.aiplatform.v1.VertexAISearch) source_;
        }
        return com.google.cloud.aiplatform.v1.VertexAISearch.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return vertexAiSearchBuilder_.getMessage();
        }
        return com.google.cloud.aiplatform.v1.VertexAISearch.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     */
    public Builder setVertexAiSearch(com.google.cloud.aiplatform.v1.VertexAISearch value) {
      if (vertexAiSearchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        vertexAiSearchBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     */
    public Builder setVertexAiSearch(
        com.google.cloud.aiplatform.v1.VertexAISearch.Builder builderForValue) {
      if (vertexAiSearchBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        vertexAiSearchBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     */
    public Builder mergeVertexAiSearch(com.google.cloud.aiplatform.v1.VertexAISearch value) {
      if (vertexAiSearchBuilder_ == null) {
        if (sourceCase_ == 2
            && source_ != com.google.cloud.aiplatform.v1.VertexAISearch.getDefaultInstance()) {
          source_ =
              com.google.cloud.aiplatform.v1.VertexAISearch.newBuilder(
                      (com.google.cloud.aiplatform.v1.VertexAISearch) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          vertexAiSearchBuilder_.mergeFrom(value);
        } else {
          vertexAiSearchBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     */
    public Builder clearVertexAiSearch() {
      if (vertexAiSearchBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        vertexAiSearchBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.VertexAISearch.Builder getVertexAiSearchBuilder() {
      return getVertexAiSearchFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.VertexAISearchOrBuilder getVertexAiSearchOrBuilder() {
      if ((sourceCase_ == 2) && (vertexAiSearchBuilder_ != null)) {
        return vertexAiSearchBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.google.cloud.aiplatform.v1.VertexAISearch) source_;
        }
        return com.google.cloud.aiplatform.v1.VertexAISearch.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Set to use data source powered by Vertex AI Search.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.VertexAISearch vertex_ai_search = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.VertexAISearch,
            com.google.cloud.aiplatform.v1.VertexAISearch.Builder,
            com.google.cloud.aiplatform.v1.VertexAISearchOrBuilder>
        getVertexAiSearchFieldBuilder() {
      if (vertexAiSearchBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.google.cloud.aiplatform.v1.VertexAISearch.getDefaultInstance();
        }
        vertexAiSearchBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.VertexAISearch,
                com.google.cloud.aiplatform.v1.VertexAISearch.Builder,
                com.google.cloud.aiplatform.v1.VertexAISearchOrBuilder>(
                (com.google.cloud.aiplatform.v1.VertexAISearch) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();
      return vertexAiSearchBuilder_;
    }

    private boolean disableAttribution_;
    /**
     *
     *
     * <pre>
     * Optional. Disable using the result from this tool in detecting grounding
     * attribution. This does not affect how the result is given to the model for
     * generation.
     * </pre>
     *
     * <code>bool disable_attribution = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The disableAttribution.
     */
    @java.lang.Override
    public boolean getDisableAttribution() {
      return disableAttribution_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Disable using the result from this tool in detecting grounding
     * attribution. This does not affect how the result is given to the model for
     * generation.
     * </pre>
     *
     * <code>bool disable_attribution = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The disableAttribution to set.
     * @return This builder for chaining.
     */
    public Builder setDisableAttribution(boolean value) {

      disableAttribution_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Disable using the result from this tool in detecting grounding
     * attribution. This does not affect how the result is given to the model for
     * generation.
     * </pre>
     *
     * <code>bool disable_attribution = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisableAttribution() {
      bitField0_ = (bitField0_ & ~0x00000002);
      disableAttribution_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.Retrieval)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.Retrieval)
  private static final com.google.cloud.aiplatform.v1.Retrieval DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.Retrieval();
  }

  public static com.google.cloud.aiplatform.v1.Retrieval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Retrieval> PARSER =
      new com.google.protobuf.AbstractParser<Retrieval>() {
        @java.lang.Override
        public Retrieval parsePartialFrom(
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

  public static com.google.protobuf.Parser<Retrieval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Retrieval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Retrieval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
