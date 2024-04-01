// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Input for rouge metric.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.RougeInput}
 */
public final class RougeInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.RougeInput)
    RougeInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RougeInput.newBuilder() to construct.
  private RougeInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RougeInput() {
    instances_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RougeInput();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.RougeInput.class, com.google.cloud.aiplatform.v1beta1.RougeInput.Builder.class);
  }

  private int bitField0_;
  public static final int METRIC_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.RougeSpec metricSpec_;
  /**
   * <pre>
   * Required. Spec for rouge score metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the metricSpec field is set.
   */
  @java.lang.Override
  public boolean hasMetricSpec() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. Spec for rouge score metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The metricSpec.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RougeSpec getMetricSpec() {
    return metricSpec_ == null ? com.google.cloud.aiplatform.v1beta1.RougeSpec.getDefaultInstance() : metricSpec_;
  }
  /**
   * <pre>
   * Required. Spec for rouge score metric.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RougeSpecOrBuilder getMetricSpecOrBuilder() {
    return metricSpec_ == null ? com.google.cloud.aiplatform.v1beta1.RougeSpec.getDefaultInstance() : metricSpec_;
  }

  public static final int INSTANCES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.RougeInstance> instances_;
  /**
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.RougeInstance> getInstancesList() {
    return instances_;
  }
  /**
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.RougeInstanceOrBuilder> 
      getInstancesOrBuilderList() {
    return instances_;
  }
  /**
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getInstancesCount() {
    return instances_.size();
  }
  /**
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RougeInstance getInstances(int index) {
    return instances_.get(index);
  }
  /**
   * <pre>
   * Required. Repeated rouge instances.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RougeInstanceOrBuilder getInstancesOrBuilder(
      int index) {
    return instances_.get(index);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getMetricSpec());
    }
    for (int i = 0; i < instances_.size(); i++) {
      output.writeMessage(2, instances_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetricSpec());
    }
    for (int i = 0; i < instances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, instances_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.RougeInput)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.RougeInput other = (com.google.cloud.aiplatform.v1beta1.RougeInput) obj;

    if (hasMetricSpec() != other.hasMetricSpec()) return false;
    if (hasMetricSpec()) {
      if (!getMetricSpec()
          .equals(other.getMetricSpec())) return false;
    }
    if (!getInstancesList()
        .equals(other.getInstancesList())) return false;
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
    if (hasMetricSpec()) {
      hash = (37 * hash) + METRIC_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getMetricSpec().hashCode();
    }
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.RougeInput parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.RougeInput prototype) {
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
   * Input for rouge metric.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.RougeInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.RougeInput)
      com.google.cloud.aiplatform.v1beta1.RougeInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.RougeInput.class, com.google.cloud.aiplatform.v1beta1.RougeInput.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.RougeInput.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getMetricSpecFieldBuilder();
        getInstancesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      metricSpec_ = null;
      if (metricSpecBuilder_ != null) {
        metricSpecBuilder_.dispose();
        metricSpecBuilder_ = null;
      }
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
      } else {
        instances_ = null;
        instancesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto.internal_static_google_cloud_aiplatform_v1beta1_RougeInput_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RougeInput getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.RougeInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RougeInput build() {
      com.google.cloud.aiplatform.v1beta1.RougeInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RougeInput buildPartial() {
      com.google.cloud.aiplatform.v1beta1.RougeInput result = new com.google.cloud.aiplatform.v1beta1.RougeInput(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.aiplatform.v1beta1.RougeInput result) {
      if (instancesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          instances_ = java.util.Collections.unmodifiableList(instances_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.instances_ = instances_;
      } else {
        result.instances_ = instancesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.RougeInput result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricSpec_ = metricSpecBuilder_ == null
            ? metricSpec_
            : metricSpecBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.RougeInput) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.RougeInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.RougeInput other) {
      if (other == com.google.cloud.aiplatform.v1beta1.RougeInput.getDefaultInstance()) return this;
      if (other.hasMetricSpec()) {
        mergeMetricSpec(other.getMetricSpec());
      }
      if (instancesBuilder_ == null) {
        if (!other.instances_.isEmpty()) {
          if (instances_.isEmpty()) {
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureInstancesIsMutable();
            instances_.addAll(other.instances_);
          }
          onChanged();
        }
      } else {
        if (!other.instances_.isEmpty()) {
          if (instancesBuilder_.isEmpty()) {
            instancesBuilder_.dispose();
            instancesBuilder_ = null;
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000002);
            instancesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInstancesFieldBuilder() : null;
          } else {
            instancesBuilder_.addAllMessages(other.instances_);
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
              input.readMessage(
                  getMetricSpecFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.cloud.aiplatform.v1beta1.RougeInstance m =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1beta1.RougeInstance.parser(),
                      extensionRegistry);
              if (instancesBuilder_ == null) {
                ensureInstancesIsMutable();
                instances_.add(m);
              } else {
                instancesBuilder_.addMessage(m);
              }
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

    private com.google.cloud.aiplatform.v1beta1.RougeSpec metricSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.RougeSpec, com.google.cloud.aiplatform.v1beta1.RougeSpec.Builder, com.google.cloud.aiplatform.v1beta1.RougeSpecOrBuilder> metricSpecBuilder_;
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the metricSpec field is set.
     */
    public boolean hasMetricSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The metricSpec.
     */
    public com.google.cloud.aiplatform.v1beta1.RougeSpec getMetricSpec() {
      if (metricSpecBuilder_ == null) {
        return metricSpec_ == null ? com.google.cloud.aiplatform.v1beta1.RougeSpec.getDefaultInstance() : metricSpec_;
      } else {
        return metricSpecBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMetricSpec(com.google.cloud.aiplatform.v1beta1.RougeSpec value) {
      if (metricSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metricSpec_ = value;
      } else {
        metricSpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMetricSpec(
        com.google.cloud.aiplatform.v1beta1.RougeSpec.Builder builderForValue) {
      if (metricSpecBuilder_ == null) {
        metricSpec_ = builderForValue.build();
      } else {
        metricSpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeMetricSpec(com.google.cloud.aiplatform.v1beta1.RougeSpec value) {
      if (metricSpecBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          metricSpec_ != null &&
          metricSpec_ != com.google.cloud.aiplatform.v1beta1.RougeSpec.getDefaultInstance()) {
          getMetricSpecBuilder().mergeFrom(value);
        } else {
          metricSpec_ = value;
        }
      } else {
        metricSpecBuilder_.mergeFrom(value);
      }
      if (metricSpec_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMetricSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metricSpec_ = null;
      if (metricSpecBuilder_ != null) {
        metricSpecBuilder_.dispose();
        metricSpecBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeSpec.Builder getMetricSpecBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetricSpecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeSpecOrBuilder getMetricSpecOrBuilder() {
      if (metricSpecBuilder_ != null) {
        return metricSpecBuilder_.getMessageOrBuilder();
      } else {
        return metricSpec_ == null ?
            com.google.cloud.aiplatform.v1beta1.RougeSpec.getDefaultInstance() : metricSpec_;
      }
    }
    /**
     * <pre>
     * Required. Spec for rouge score metric.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RougeSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.RougeSpec, com.google.cloud.aiplatform.v1beta1.RougeSpec.Builder, com.google.cloud.aiplatform.v1beta1.RougeSpecOrBuilder> 
        getMetricSpecFieldBuilder() {
      if (metricSpecBuilder_ == null) {
        metricSpecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RougeSpec, com.google.cloud.aiplatform.v1beta1.RougeSpec.Builder, com.google.cloud.aiplatform.v1beta1.RougeSpecOrBuilder>(
                getMetricSpec(),
                getParentForChildren(),
                isClean());
        metricSpec_ = null;
      }
      return metricSpecBuilder_;
    }

    private java.util.List<com.google.cloud.aiplatform.v1beta1.RougeInstance> instances_ =
      java.util.Collections.emptyList();
    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        instances_ = new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.RougeInstance>(instances_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.RougeInstance, com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder, com.google.cloud.aiplatform.v1beta1.RougeInstanceOrBuilder> instancesBuilder_;

    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.RougeInstance> getInstancesList() {
      if (instancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instances_);
      } else {
        return instancesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getInstancesCount() {
      if (instancesBuilder_ == null) {
        return instances_.size();
      } else {
        return instancesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeInstance getInstances(int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);
      } else {
        return instancesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInstances(
        int index, com.google.cloud.aiplatform.v1beta1.RougeInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.set(index, value);
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setInstances(
        int index, com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.set(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addInstances(com.google.cloud.aiplatform.v1beta1.RougeInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addInstances(
        int index, com.google.cloud.aiplatform.v1beta1.RougeInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(index, value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addInstances(
        com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addInstances(
        int index, com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllInstances(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.RougeInstance> values) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, instances_);
        onChanged();
      } else {
        instancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearInstances() {
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        instancesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeInstances(int index) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.remove(index);
        onChanged();
      } else {
        instancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder getInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeInstanceOrBuilder getInstancesOrBuilder(
        int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);  } else {
        return instancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.RougeInstanceOrBuilder> 
         getInstancesOrBuilderList() {
      if (instancesBuilder_ != null) {
        return instancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instances_);
      }
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder addInstancesBuilder() {
      return getInstancesFieldBuilder().addBuilder(
          com.google.cloud.aiplatform.v1beta1.RougeInstance.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder addInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().addBuilder(
          index, com.google.cloud.aiplatform.v1beta1.RougeInstance.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. Repeated rouge instances.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.RougeInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder> 
         getInstancesBuilderList() {
      return getInstancesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.RougeInstance, com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder, com.google.cloud.aiplatform.v1beta1.RougeInstanceOrBuilder> 
        getInstancesFieldBuilder() {
      if (instancesBuilder_ == null) {
        instancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RougeInstance, com.google.cloud.aiplatform.v1beta1.RougeInstance.Builder, com.google.cloud.aiplatform.v1beta1.RougeInstanceOrBuilder>(
                instances_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        instances_ = null;
      }
      return instancesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.RougeInput)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.RougeInput)
  private static final com.google.cloud.aiplatform.v1beta1.RougeInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.RougeInput();
  }

  public static com.google.cloud.aiplatform.v1beta1.RougeInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RougeInput>
      PARSER = new com.google.protobuf.AbstractParser<RougeInput>() {
    @java.lang.Override
    public RougeInput parsePartialFrom(
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

  public static com.google.protobuf.Parser<RougeInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RougeInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RougeInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

