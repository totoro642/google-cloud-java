// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Specifies the size and overlap of chunks for RagFiles.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.RagFileChunkingConfig}
 */
public final class RagFileChunkingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.RagFileChunkingConfig)
    RagFileChunkingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RagFileChunkingConfig.newBuilder() to construct.
  private RagFileChunkingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RagFileChunkingConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RagFileChunkingConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.VertexRagDataProto.internal_static_google_cloud_aiplatform_v1beta1_RagFileChunkingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.VertexRagDataProto.internal_static_google_cloud_aiplatform_v1beta1_RagFileChunkingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig.class, com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig.Builder.class);
  }

  public static final int CHUNK_SIZE_FIELD_NUMBER = 1;
  private int chunkSize_ = 0;
  /**
   * <pre>
   * The size of the chunks.
   * </pre>
   *
   * <code>int32 chunk_size = 1;</code>
   * @return The chunkSize.
   */
  @java.lang.Override
  public int getChunkSize() {
    return chunkSize_;
  }

  public static final int CHUNK_OVERLAP_FIELD_NUMBER = 2;
  private int chunkOverlap_ = 0;
  /**
   * <pre>
   * The overlap between chunks.
   * </pre>
   *
   * <code>int32 chunk_overlap = 2;</code>
   * @return The chunkOverlap.
   */
  @java.lang.Override
  public int getChunkOverlap() {
    return chunkOverlap_;
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
    if (chunkSize_ != 0) {
      output.writeInt32(1, chunkSize_);
    }
    if (chunkOverlap_ != 0) {
      output.writeInt32(2, chunkOverlap_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (chunkSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, chunkSize_);
    }
    if (chunkOverlap_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, chunkOverlap_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig other = (com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig) obj;

    if (getChunkSize()
        != other.getChunkSize()) return false;
    if (getChunkOverlap()
        != other.getChunkOverlap()) return false;
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
    hash = (37 * hash) + CHUNK_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getChunkSize();
    hash = (37 * hash) + CHUNK_OVERLAP_FIELD_NUMBER;
    hash = (53 * hash) + getChunkOverlap();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig prototype) {
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
   * Specifies the size and overlap of chunks for RagFiles.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.RagFileChunkingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.RagFileChunkingConfig)
      com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataProto.internal_static_google_cloud_aiplatform_v1beta1_RagFileChunkingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataProto.internal_static_google_cloud_aiplatform_v1beta1_RagFileChunkingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig.class, com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig.newBuilder()
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
      chunkSize_ = 0;
      chunkOverlap_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagDataProto.internal_static_google_cloud_aiplatform_v1beta1_RagFileChunkingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig build() {
      com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig buildPartial() {
      com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig result = new com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.chunkSize_ = chunkSize_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chunkOverlap_ = chunkOverlap_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig other) {
      if (other == com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig.getDefaultInstance()) return this;
      if (other.getChunkSize() != 0) {
        setChunkSize(other.getChunkSize());
      }
      if (other.getChunkOverlap() != 0) {
        setChunkOverlap(other.getChunkOverlap());
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
            case 8: {
              chunkSize_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              chunkOverlap_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int chunkSize_ ;
    /**
     * <pre>
     * The size of the chunks.
     * </pre>
     *
     * <code>int32 chunk_size = 1;</code>
     * @return The chunkSize.
     */
    @java.lang.Override
    public int getChunkSize() {
      return chunkSize_;
    }
    /**
     * <pre>
     * The size of the chunks.
     * </pre>
     *
     * <code>int32 chunk_size = 1;</code>
     * @param value The chunkSize to set.
     * @return This builder for chaining.
     */
    public Builder setChunkSize(int value) {

      chunkSize_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The size of the chunks.
     * </pre>
     *
     * <code>int32 chunk_size = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChunkSize() {
      bitField0_ = (bitField0_ & ~0x00000001);
      chunkSize_ = 0;
      onChanged();
      return this;
    }

    private int chunkOverlap_ ;
    /**
     * <pre>
     * The overlap between chunks.
     * </pre>
     *
     * <code>int32 chunk_overlap = 2;</code>
     * @return The chunkOverlap.
     */
    @java.lang.Override
    public int getChunkOverlap() {
      return chunkOverlap_;
    }
    /**
     * <pre>
     * The overlap between chunks.
     * </pre>
     *
     * <code>int32 chunk_overlap = 2;</code>
     * @param value The chunkOverlap to set.
     * @return This builder for chaining.
     */
    public Builder setChunkOverlap(int value) {

      chunkOverlap_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The overlap between chunks.
     * </pre>
     *
     * <code>int32 chunk_overlap = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearChunkOverlap() {
      bitField0_ = (bitField0_ & ~0x00000002);
      chunkOverlap_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.RagFileChunkingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.RagFileChunkingConfig)
  private static final com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig();
  }

  public static com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RagFileChunkingConfig>
      PARSER = new com.google.protobuf.AbstractParser<RagFileChunkingConfig>() {
    @java.lang.Override
    public RagFileChunkingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<RagFileChunkingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RagFileChunkingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RagFileChunkingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

