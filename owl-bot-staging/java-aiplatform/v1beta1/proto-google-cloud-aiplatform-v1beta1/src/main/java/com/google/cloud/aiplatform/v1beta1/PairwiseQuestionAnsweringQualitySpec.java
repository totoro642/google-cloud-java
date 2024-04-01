// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Spec for pairwise question answering quality score metric.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec}
 */
public final class PairwiseQuestionAnsweringQualitySpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec)
    PairwiseQuestionAnsweringQualitySpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PairwiseQuestionAnsweringQualitySpec.newBuilder() to construct.
  private PairwiseQuestionAnsweringQualitySpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PairwiseQuestionAnsweringQualitySpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PairwiseQuestionAnsweringQualitySpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_PairwiseQuestionAnsweringQualitySpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_PairwiseQuestionAnsweringQualitySpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec.class, com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec.Builder.class);
  }

  public static final int USE_REFERENCE_FIELD_NUMBER = 1;
  private boolean useReference_ = false;
  /**
   * <pre>
   * Optional. Whether to use instance.reference to compute question answering
   * quality.
   * </pre>
   *
   * <code>bool use_reference = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The useReference.
   */
  @java.lang.Override
  public boolean getUseReference() {
    return useReference_;
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_ = 0;
  /**
   * <pre>
   * Optional. Which version to use for evaluation.
   * </pre>
   *
   * <code>int32 version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
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
    if (useReference_ != false) {
      output.writeBool(1, useReference_);
    }
    if (version_ != 0) {
      output.writeInt32(2, version_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (useReference_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, useReference_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, version_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec other = (com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec) obj;

    if (getUseReference()
        != other.getUseReference()) return false;
    if (getVersion()
        != other.getVersion()) return false;
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
    hash = (37 * hash) + USE_REFERENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseReference());
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec prototype) {
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
   * Spec for pairwise question answering quality score metric.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec)
      com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_PairwiseQuestionAnsweringQualitySpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_PairwiseQuestionAnsweringQualitySpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec.class, com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec.newBuilder()
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
      useReference_ = false;
      version_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_PairwiseQuestionAnsweringQualitySpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec build() {
      com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec result = new com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.useReference_ = useReference_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec.getDefaultInstance()) return this;
      if (other.getUseReference() != false) {
        setUseReference(other.getUseReference());
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
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
              useReference_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              version_ = input.readInt32();
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

    private boolean useReference_ ;
    /**
     * <pre>
     * Optional. Whether to use instance.reference to compute question answering
     * quality.
     * </pre>
     *
     * <code>bool use_reference = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The useReference.
     */
    @java.lang.Override
    public boolean getUseReference() {
      return useReference_;
    }
    /**
     * <pre>
     * Optional. Whether to use instance.reference to compute question answering
     * quality.
     * </pre>
     *
     * <code>bool use_reference = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The useReference to set.
     * @return This builder for chaining.
     */
    public Builder setUseReference(boolean value) {

      useReference_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Whether to use instance.reference to compute question answering
     * quality.
     * </pre>
     *
     * <code>bool use_reference = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearUseReference() {
      bitField0_ = (bitField0_ & ~0x00000001);
      useReference_ = false;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <pre>
     * Optional. Which version to use for evaluation.
     * </pre>
     *
     * <code>int32 version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * Optional. Which version to use for evaluation.
     * </pre>
     *
     * <code>int32 version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {

      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Which version to use for evaluation.
     * </pre>
     *
     * <code>int32 version = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      version_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec)
  private static final com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PairwiseQuestionAnsweringQualitySpec>
      PARSER = new com.google.protobuf.AbstractParser<PairwiseQuestionAnsweringQualitySpec>() {
    @java.lang.Override
    public PairwiseQuestionAnsweringQualitySpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<PairwiseQuestionAnsweringQualitySpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PairwiseQuestionAnsweringQualitySpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PairwiseQuestionAnsweringQualitySpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

