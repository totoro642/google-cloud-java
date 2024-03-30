// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Results for exact match metric.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExactMatchResults}
 */
public final class ExactMatchResults extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ExactMatchResults)
    ExactMatchResultsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExactMatchResults.newBuilder() to construct.
  private ExactMatchResults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExactMatchResults() {
    exactMatchMetricValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExactMatchResults();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExactMatchResults_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExactMatchResults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ExactMatchResults.class, com.google.cloud.aiplatform.v1beta1.ExactMatchResults.Builder.class);
  }

  public static final int EXACT_MATCH_METRIC_VALUES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue> exactMatchMetricValues_;
  /**
   * <pre>
   * Output only. Exact match metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue> getExactMatchMetricValuesList() {
    return exactMatchMetricValues_;
  }
  /**
   * <pre>
   * Output only. Exact match metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValueOrBuilder> 
      getExactMatchMetricValuesOrBuilderList() {
    return exactMatchMetricValues_;
  }
  /**
   * <pre>
   * Output only. Exact match metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public int getExactMatchMetricValuesCount() {
    return exactMatchMetricValues_.size();
  }
  /**
   * <pre>
   * Output only. Exact match metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue getExactMatchMetricValues(int index) {
    return exactMatchMetricValues_.get(index);
  }
  /**
   * <pre>
   * Output only. Exact match metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValueOrBuilder getExactMatchMetricValuesOrBuilder(
      int index) {
    return exactMatchMetricValues_.get(index);
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
    for (int i = 0; i < exactMatchMetricValues_.size(); i++) {
      output.writeMessage(1, exactMatchMetricValues_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < exactMatchMetricValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, exactMatchMetricValues_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ExactMatchResults)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ExactMatchResults other = (com.google.cloud.aiplatform.v1beta1.ExactMatchResults) obj;

    if (!getExactMatchMetricValuesList()
        .equals(other.getExactMatchMetricValuesList())) return false;
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
    if (getExactMatchMetricValuesCount() > 0) {
      hash = (37 * hash) + EXACT_MATCH_METRIC_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getExactMatchMetricValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ExactMatchResults prototype) {
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
   * Results for exact match metric.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExactMatchResults}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ExactMatchResults)
      com.google.cloud.aiplatform.v1beta1.ExactMatchResultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExactMatchResults_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExactMatchResults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ExactMatchResults.class, com.google.cloud.aiplatform.v1beta1.ExactMatchResults.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ExactMatchResults.newBuilder()
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
      if (exactMatchMetricValuesBuilder_ == null) {
        exactMatchMetricValues_ = java.util.Collections.emptyList();
      } else {
        exactMatchMetricValues_ = null;
        exactMatchMetricValuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExactMatchResults_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExactMatchResults getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ExactMatchResults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExactMatchResults build() {
      com.google.cloud.aiplatform.v1beta1.ExactMatchResults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExactMatchResults buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ExactMatchResults result = new com.google.cloud.aiplatform.v1beta1.ExactMatchResults(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1beta1.ExactMatchResults result) {
      if (exactMatchMetricValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          exactMatchMetricValues_ = java.util.Collections.unmodifiableList(exactMatchMetricValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.exactMatchMetricValues_ = exactMatchMetricValues_;
      } else {
        result.exactMatchMetricValues_ = exactMatchMetricValuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ExactMatchResults result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ExactMatchResults) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ExactMatchResults)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ExactMatchResults other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ExactMatchResults.getDefaultInstance()) return this;
      if (exactMatchMetricValuesBuilder_ == null) {
        if (!other.exactMatchMetricValues_.isEmpty()) {
          if (exactMatchMetricValues_.isEmpty()) {
            exactMatchMetricValues_ = other.exactMatchMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExactMatchMetricValuesIsMutable();
            exactMatchMetricValues_.addAll(other.exactMatchMetricValues_);
          }
          onChanged();
        }
      } else {
        if (!other.exactMatchMetricValues_.isEmpty()) {
          if (exactMatchMetricValuesBuilder_.isEmpty()) {
            exactMatchMetricValuesBuilder_.dispose();
            exactMatchMetricValuesBuilder_ = null;
            exactMatchMetricValues_ = other.exactMatchMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            exactMatchMetricValuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExactMatchMetricValuesFieldBuilder() : null;
          } else {
            exactMatchMetricValuesBuilder_.addAllMessages(other.exactMatchMetricValues_);
          }
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
            case 10: {
              com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.parser(),
                      extensionRegistry);
              if (exactMatchMetricValuesBuilder_ == null) {
                ensureExactMatchMetricValuesIsMutable();
                exactMatchMetricValues_.add(m);
              } else {
                exactMatchMetricValuesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue> exactMatchMetricValues_ =
      java.util.Collections.emptyList();
    private void ensureExactMatchMetricValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        exactMatchMetricValues_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue>(exactMatchMetricValues_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValueOrBuilder> exactMatchMetricValuesBuilder_;

    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue> getExactMatchMetricValuesList() {
      if (exactMatchMetricValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(exactMatchMetricValues_);
      } else {
        return exactMatchMetricValuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public int getExactMatchMetricValuesCount() {
      if (exactMatchMetricValuesBuilder_ == null) {
        return exactMatchMetricValues_.size();
      } else {
        return exactMatchMetricValuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue getExactMatchMetricValues(int index) {
      if (exactMatchMetricValuesBuilder_ == null) {
        return exactMatchMetricValues_.get(index);
      } else {
        return exactMatchMetricValuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setExactMatchMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue value) {
      if (exactMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExactMatchMetricValuesIsMutable();
        exactMatchMetricValues_.set(index, value);
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setExactMatchMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder builderForValue) {
      if (exactMatchMetricValuesBuilder_ == null) {
        ensureExactMatchMetricValuesIsMutable();
        exactMatchMetricValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addExactMatchMetricValues(com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue value) {
      if (exactMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExactMatchMetricValuesIsMutable();
        exactMatchMetricValues_.add(value);
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addExactMatchMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue value) {
      if (exactMatchMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExactMatchMetricValuesIsMutable();
        exactMatchMetricValues_.add(index, value);
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addExactMatchMetricValues(
        com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder builderForValue) {
      if (exactMatchMetricValuesBuilder_ == null) {
        ensureExactMatchMetricValuesIsMutable();
        exactMatchMetricValues_.add(builderForValue.build());
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addExactMatchMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder builderForValue) {
      if (exactMatchMetricValuesBuilder_ == null) {
        ensureExactMatchMetricValuesIsMutable();
        exactMatchMetricValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addAllExactMatchMetricValues(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue> values) {
      if (exactMatchMetricValuesBuilder_ == null) {
        ensureExactMatchMetricValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, exactMatchMetricValues_);
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearExactMatchMetricValues() {
      if (exactMatchMetricValuesBuilder_ == null) {
        exactMatchMetricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder removeExactMatchMetricValues(int index) {
      if (exactMatchMetricValuesBuilder_ == null) {
        ensureExactMatchMetricValuesIsMutable();
        exactMatchMetricValues_.remove(index);
        onChanged();
      } else {
        exactMatchMetricValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder getExactMatchMetricValuesBuilder(
        int index) {
      return getExactMatchMetricValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValueOrBuilder getExactMatchMetricValuesOrBuilder(
        int index) {
      if (exactMatchMetricValuesBuilder_ == null) {
        return exactMatchMetricValues_.get(index);  } else {
        return exactMatchMetricValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValueOrBuilder> 
         getExactMatchMetricValuesOrBuilderList() {
      if (exactMatchMetricValuesBuilder_ != null) {
        return exactMatchMetricValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(exactMatchMetricValues_);
      }
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder addExactMatchMetricValuesBuilder() {
      return getExactMatchMetricValuesFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder addExactMatchMetricValuesBuilder(
        int index) {
      return getExactMatchMetricValuesFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. Exact match metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.ExactMatchMetricValue exact_match_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder> 
         getExactMatchMetricValuesBuilderList() {
      return getExactMatchMetricValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValueOrBuilder> 
        getExactMatchMetricValuesFieldBuilder() {
      if (exactMatchMetricValuesBuilder_ == null) {
        exactMatchMetricValuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValue.Builder, com.google.cloud.aiplatform.v1beta1.ExactMatchMetricValueOrBuilder>(
                exactMatchMetricValues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        exactMatchMetricValues_ = null;
      }
      return exactMatchMetricValuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ExactMatchResults)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ExactMatchResults)
  private static final com.google.cloud.aiplatform.v1beta1.ExactMatchResults DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ExactMatchResults();
  }

  public static com.google.cloud.aiplatform.v1beta1.ExactMatchResults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExactMatchResults>
      PARSER = new com.google.protobuf.AbstractParser<ExactMatchResults>() {
    @java.lang.Override
    public ExactMatchResults parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExactMatchResults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExactMatchResults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExactMatchResults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

