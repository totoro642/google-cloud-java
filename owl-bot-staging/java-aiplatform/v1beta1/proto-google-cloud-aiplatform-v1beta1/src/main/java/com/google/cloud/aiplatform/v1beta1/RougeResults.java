// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Results for rouge metric.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.RougeResults}
 */
public final class RougeResults extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.RougeResults)
    RougeResultsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RougeResults.newBuilder() to construct.
  private RougeResults(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RougeResults() {
    rougeMetricValues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RougeResults();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeResults_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeResults_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.RougeResults.class, com.google.cloud.aiplatform.v1beta1.RougeResults.Builder.class);
  }

  public static final int ROUGE_METRIC_VALUES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.RougeMetricValue> rougeMetricValues_;
  /**
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.RougeMetricValue> getRougeMetricValuesList() {
    return rougeMetricValues_;
  }
  /**
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.RougeMetricValueOrBuilder> 
      getRougeMetricValuesOrBuilderList() {
    return rougeMetricValues_;
  }
  /**
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public int getRougeMetricValuesCount() {
    return rougeMetricValues_.size();
  }
  /**
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RougeMetricValue getRougeMetricValues(int index) {
    return rougeMetricValues_.get(index);
  }
  /**
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RougeMetricValueOrBuilder getRougeMetricValuesOrBuilder(
      int index) {
    return rougeMetricValues_.get(index);
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
    for (int i = 0; i < rougeMetricValues_.size(); i++) {
      output.writeMessage(1, rougeMetricValues_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rougeMetricValues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rougeMetricValues_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.RougeResults)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.RougeResults other = (com.google.cloud.aiplatform.v1beta1.RougeResults) obj;

    if (!getRougeMetricValuesList()
        .equals(other.getRougeMetricValuesList())) return false;
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
    if (getRougeMetricValuesCount() > 0) {
      hash = (37 * hash) + ROUGE_METRIC_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getRougeMetricValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeResults parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.RougeResults prototype) {
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
   * Results for rouge metric.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.RougeResults}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.RougeResults)
      com.google.cloud.aiplatform.v1beta1.RougeResultsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeResults_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeResults_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.RougeResults.class, com.google.cloud.aiplatform.v1beta1.RougeResults.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.RougeResults.newBuilder()
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
      if (rougeMetricValuesBuilder_ == null) {
        rougeMetricValues_ = java.util.Collections.emptyList();
      } else {
        rougeMetricValues_ = null;
        rougeMetricValuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeResults_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RougeResults getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.RougeResults.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RougeResults build() {
      com.google.cloud.aiplatform.v1beta1.RougeResults result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RougeResults buildPartial() {
      com.google.cloud.aiplatform.v1beta1.RougeResults result = new com.google.cloud.aiplatform.v1beta1.RougeResults(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1beta1.RougeResults result) {
      if (rougeMetricValuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rougeMetricValues_ = java.util.Collections.unmodifiableList(rougeMetricValues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rougeMetricValues_ = rougeMetricValues_;
      } else {
        result.rougeMetricValues_ = rougeMetricValuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.RougeResults result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.RougeResults) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.RougeResults)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.RougeResults other) {
      if (other == com.google.cloud.aiplatform.v1beta1.RougeResults.getDefaultInstance()) return this;
      if (rougeMetricValuesBuilder_ == null) {
        if (!other.rougeMetricValues_.isEmpty()) {
          if (rougeMetricValues_.isEmpty()) {
            rougeMetricValues_ = other.rougeMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRougeMetricValuesIsMutable();
            rougeMetricValues_.addAll(other.rougeMetricValues_);
          }
          onChanged();
        }
      } else {
        if (!other.rougeMetricValues_.isEmpty()) {
          if (rougeMetricValuesBuilder_.isEmpty()) {
            rougeMetricValuesBuilder_.dispose();
            rougeMetricValuesBuilder_ = null;
            rougeMetricValues_ = other.rougeMetricValues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rougeMetricValuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRougeMetricValuesFieldBuilder() : null;
          } else {
            rougeMetricValuesBuilder_.addAllMessages(other.rougeMetricValues_);
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
              com.google.cloud.aiplatform.v1beta1.RougeMetricValue m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.RougeMetricValue.parser(),
                      extensionRegistry);
              if (rougeMetricValuesBuilder_ == null) {
                ensureRougeMetricValuesIsMutable();
                rougeMetricValues_.add(m);
              } else {
                rougeMetricValuesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.RougeMetricValue> rougeMetricValues_ =
      java.util.Collections.emptyList();
    private void ensureRougeMetricValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rougeMetricValues_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.RougeMetricValue>(rougeMetricValues_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.RougeMetricValue, com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder, com.google.cloud.aiplatform.v1beta1.RougeMetricValueOrBuilder> rougeMetricValuesBuilder_;

    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.RougeMetricValue> getRougeMetricValuesList() {
      if (rougeMetricValuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rougeMetricValues_);
      } else {
        return rougeMetricValuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public int getRougeMetricValuesCount() {
      if (rougeMetricValuesBuilder_ == null) {
        return rougeMetricValues_.size();
      } else {
        return rougeMetricValuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeMetricValue getRougeMetricValues(int index) {
      if (rougeMetricValuesBuilder_ == null) {
        return rougeMetricValues_.get(index);
      } else {
        return rougeMetricValuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setRougeMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.RougeMetricValue value) {
      if (rougeMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRougeMetricValuesIsMutable();
        rougeMetricValues_.set(index, value);
        onChanged();
      } else {
        rougeMetricValuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setRougeMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder builderForValue) {
      if (rougeMetricValuesBuilder_ == null) {
        ensureRougeMetricValuesIsMutable();
        rougeMetricValues_.set(index, builderForValue.build());
        onChanged();
      } else {
        rougeMetricValuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addRougeMetricValues(com.google.cloud.aiplatform.v1beta1.RougeMetricValue value) {
      if (rougeMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRougeMetricValuesIsMutable();
        rougeMetricValues_.add(value);
        onChanged();
      } else {
        rougeMetricValuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addRougeMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.RougeMetricValue value) {
      if (rougeMetricValuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRougeMetricValuesIsMutable();
        rougeMetricValues_.add(index, value);
        onChanged();
      } else {
        rougeMetricValuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addRougeMetricValues(
        com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder builderForValue) {
      if (rougeMetricValuesBuilder_ == null) {
        ensureRougeMetricValuesIsMutable();
        rougeMetricValues_.add(builderForValue.build());
        onChanged();
      } else {
        rougeMetricValuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addRougeMetricValues(
        int index, com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder builderForValue) {
      if (rougeMetricValuesBuilder_ == null) {
        ensureRougeMetricValuesIsMutable();
        rougeMetricValues_.add(index, builderForValue.build());
        onChanged();
      } else {
        rougeMetricValuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder addAllRougeMetricValues(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.RougeMetricValue> values) {
      if (rougeMetricValuesBuilder_ == null) {
        ensureRougeMetricValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rougeMetricValues_);
        onChanged();
      } else {
        rougeMetricValuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearRougeMetricValues() {
      if (rougeMetricValuesBuilder_ == null) {
        rougeMetricValues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rougeMetricValuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder removeRougeMetricValues(int index) {
      if (rougeMetricValuesBuilder_ == null) {
        ensureRougeMetricValuesIsMutable();
        rougeMetricValues_.remove(index);
        onChanged();
      } else {
        rougeMetricValuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder getRougeMetricValuesBuilder(
        int index) {
      return getRougeMetricValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeMetricValueOrBuilder getRougeMetricValuesOrBuilder(
        int index) {
      if (rougeMetricValuesBuilder_ == null) {
        return rougeMetricValues_.get(index);  } else {
        return rougeMetricValuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.RougeMetricValueOrBuilder> 
         getRougeMetricValuesOrBuilderList() {
      if (rougeMetricValuesBuilder_ != null) {
        return rougeMetricValuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rougeMetricValues_);
      }
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder addRougeMetricValuesBuilder() {
      return getRougeMetricValuesFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1beta1.RougeMetricValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder addRougeMetricValuesBuilder(
        int index) {
      return getRougeMetricValuesFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1beta1.RougeMetricValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. Rouge metric values.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder> 
         getRougeMetricValuesBuilderList() {
      return getRougeMetricValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.RougeMetricValue, com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder, com.google.cloud.aiplatform.v1beta1.RougeMetricValueOrBuilder> 
        getRougeMetricValuesFieldBuilder() {
      if (rougeMetricValuesBuilder_ == null) {
        rougeMetricValuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RougeMetricValue, com.google.cloud.aiplatform.v1beta1.RougeMetricValue.Builder, com.google.cloud.aiplatform.v1beta1.RougeMetricValueOrBuilder>(
                rougeMetricValues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rougeMetricValues_ = null;
      }
      return rougeMetricValuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.RougeResults)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.RougeResults)
  private static final com.google.cloud.aiplatform.v1beta1.RougeResults DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.RougeResults();
  }

  public static com.google.cloud.aiplatform.v1beta1.RougeResults getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RougeResults>
      PARSER = new com.google.protobuf.AbstractParser<RougeResults>() {
    @java.lang.Override
    public RougeResults parsePartialFrom(
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

  public static com.google.protobuf.Parser<RougeResults> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RougeResults> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RougeResults getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

