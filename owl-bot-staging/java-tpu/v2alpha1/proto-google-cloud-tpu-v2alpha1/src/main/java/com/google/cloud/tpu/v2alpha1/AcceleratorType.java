// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2alpha1;

/**
 * <pre>
 * A accelerator type that a Node can be configured with.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.AcceleratorType}
 */
public final class AcceleratorType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.AcceleratorType)
    AcceleratorTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AcceleratorType.newBuilder() to construct.
  private AcceleratorType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AcceleratorType() {
    name_ = "";
    type_ = "";
    acceleratorConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AcceleratorType();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_AcceleratorType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_AcceleratorType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.AcceleratorType.class, com.google.cloud.tpu.v2alpha1.AcceleratorType.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * The accelerator type.
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The accelerator type.
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCELERATOR_CONFIGS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.tpu.v2alpha1.AcceleratorConfig> acceleratorConfigs_;
  /**
   * <pre>
   * The accelerator config.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.tpu.v2alpha1.AcceleratorConfig> getAcceleratorConfigsList() {
    return acceleratorConfigs_;
  }
  /**
   * <pre>
   * The accelerator config.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.tpu.v2alpha1.AcceleratorConfigOrBuilder> 
      getAcceleratorConfigsOrBuilderList() {
    return acceleratorConfigs_;
  }
  /**
   * <pre>
   * The accelerator config.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
   */
  @java.lang.Override
  public int getAcceleratorConfigsCount() {
    return acceleratorConfigs_.size();
  }
  /**
   * <pre>
   * The accelerator config.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.AcceleratorConfig getAcceleratorConfigs(int index) {
    return acceleratorConfigs_.get(index);
  }
  /**
   * <pre>
   * The accelerator config.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.AcceleratorConfigOrBuilder getAcceleratorConfigsOrBuilder(
      int index) {
    return acceleratorConfigs_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    for (int i = 0; i < acceleratorConfigs_.size(); i++) {
      output.writeMessage(3, acceleratorConfigs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    for (int i = 0; i < acceleratorConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, acceleratorConfigs_.get(i));
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.AcceleratorType)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.AcceleratorType other = (com.google.cloud.tpu.v2alpha1.AcceleratorType) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getAcceleratorConfigsList()
        .equals(other.getAcceleratorConfigsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (getAcceleratorConfigsCount() > 0) {
      hash = (37 * hash) + ACCELERATOR_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getAcceleratorConfigsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.AcceleratorType parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.AcceleratorType prototype) {
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
   * A accelerator type that a Node can be configured with.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.AcceleratorType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.AcceleratorType)
      com.google.cloud.tpu.v2alpha1.AcceleratorTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_AcceleratorType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_AcceleratorType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.AcceleratorType.class, com.google.cloud.tpu.v2alpha1.AcceleratorType.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.AcceleratorType.newBuilder()
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
      name_ = "";
      type_ = "";
      if (acceleratorConfigsBuilder_ == null) {
        acceleratorConfigs_ = java.util.Collections.emptyList();
      } else {
        acceleratorConfigs_ = null;
        acceleratorConfigsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_AcceleratorType_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.AcceleratorType getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.AcceleratorType.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.AcceleratorType build() {
      com.google.cloud.tpu.v2alpha1.AcceleratorType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.AcceleratorType buildPartial() {
      com.google.cloud.tpu.v2alpha1.AcceleratorType result = new com.google.cloud.tpu.v2alpha1.AcceleratorType(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.tpu.v2alpha1.AcceleratorType result) {
      if (acceleratorConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          acceleratorConfigs_ = java.util.Collections.unmodifiableList(acceleratorConfigs_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.acceleratorConfigs_ = acceleratorConfigs_;
      } else {
        result.acceleratorConfigs_ = acceleratorConfigsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.AcceleratorType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
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
      if (other instanceof com.google.cloud.tpu.v2alpha1.AcceleratorType) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.AcceleratorType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.AcceleratorType other) {
      if (other == com.google.cloud.tpu.v2alpha1.AcceleratorType.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (acceleratorConfigsBuilder_ == null) {
        if (!other.acceleratorConfigs_.isEmpty()) {
          if (acceleratorConfigs_.isEmpty()) {
            acceleratorConfigs_ = other.acceleratorConfigs_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureAcceleratorConfigsIsMutable();
            acceleratorConfigs_.addAll(other.acceleratorConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.acceleratorConfigs_.isEmpty()) {
          if (acceleratorConfigsBuilder_.isEmpty()) {
            acceleratorConfigsBuilder_.dispose();
            acceleratorConfigsBuilder_ = null;
            acceleratorConfigs_ = other.acceleratorConfigs_;
            bitField0_ = (bitField0_ & ~0x00000004);
            acceleratorConfigsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAcceleratorConfigsFieldBuilder() : null;
          } else {
            acceleratorConfigsBuilder_.addAllMessages(other.acceleratorConfigs_);
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.google.cloud.tpu.v2alpha1.AcceleratorConfig m =
                  input.readMessage(
                      com.google.cloud.tpu.v2alpha1.AcceleratorConfig.parser(),
                      extensionRegistry);
              if (acceleratorConfigsBuilder_ == null) {
                ensureAcceleratorConfigsIsMutable();
                acceleratorConfigs_.add(m);
              } else {
                acceleratorConfigsBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The resource name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * The accelerator type.
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The accelerator type.
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The accelerator type.
     * </pre>
     *
     * <code>string type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The accelerator type.
     * </pre>
     *
     * <code>string type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The accelerator type.
     * </pre>
     *
     * <code>string type = 2;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.tpu.v2alpha1.AcceleratorConfig> acceleratorConfigs_ =
      java.util.Collections.emptyList();
    private void ensureAcceleratorConfigsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        acceleratorConfigs_ = new java.util.ArrayList<com.google.cloud.tpu.v2alpha1.AcceleratorConfig>(acceleratorConfigs_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.tpu.v2alpha1.AcceleratorConfig, com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder, com.google.cloud.tpu.v2alpha1.AcceleratorConfigOrBuilder> acceleratorConfigsBuilder_;

    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public java.util.List<com.google.cloud.tpu.v2alpha1.AcceleratorConfig> getAcceleratorConfigsList() {
      if (acceleratorConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(acceleratorConfigs_);
      } else {
        return acceleratorConfigsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public int getAcceleratorConfigsCount() {
      if (acceleratorConfigsBuilder_ == null) {
        return acceleratorConfigs_.size();
      } else {
        return acceleratorConfigsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfig getAcceleratorConfigs(int index) {
      if (acceleratorConfigsBuilder_ == null) {
        return acceleratorConfigs_.get(index);
      } else {
        return acceleratorConfigsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder setAcceleratorConfigs(
        int index, com.google.cloud.tpu.v2alpha1.AcceleratorConfig value) {
      if (acceleratorConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAcceleratorConfigsIsMutable();
        acceleratorConfigs_.set(index, value);
        onChanged();
      } else {
        acceleratorConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder setAcceleratorConfigs(
        int index, com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder builderForValue) {
      if (acceleratorConfigsBuilder_ == null) {
        ensureAcceleratorConfigsIsMutable();
        acceleratorConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        acceleratorConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder addAcceleratorConfigs(com.google.cloud.tpu.v2alpha1.AcceleratorConfig value) {
      if (acceleratorConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAcceleratorConfigsIsMutable();
        acceleratorConfigs_.add(value);
        onChanged();
      } else {
        acceleratorConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder addAcceleratorConfigs(
        int index, com.google.cloud.tpu.v2alpha1.AcceleratorConfig value) {
      if (acceleratorConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAcceleratorConfigsIsMutable();
        acceleratorConfigs_.add(index, value);
        onChanged();
      } else {
        acceleratorConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder addAcceleratorConfigs(
        com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder builderForValue) {
      if (acceleratorConfigsBuilder_ == null) {
        ensureAcceleratorConfigsIsMutable();
        acceleratorConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        acceleratorConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder addAcceleratorConfigs(
        int index, com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder builderForValue) {
      if (acceleratorConfigsBuilder_ == null) {
        ensureAcceleratorConfigsIsMutable();
        acceleratorConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        acceleratorConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder addAllAcceleratorConfigs(
        java.lang.Iterable<? extends com.google.cloud.tpu.v2alpha1.AcceleratorConfig> values) {
      if (acceleratorConfigsBuilder_ == null) {
        ensureAcceleratorConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, acceleratorConfigs_);
        onChanged();
      } else {
        acceleratorConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder clearAcceleratorConfigs() {
      if (acceleratorConfigsBuilder_ == null) {
        acceleratorConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        acceleratorConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public Builder removeAcceleratorConfigs(int index) {
      if (acceleratorConfigsBuilder_ == null) {
        ensureAcceleratorConfigsIsMutable();
        acceleratorConfigs_.remove(index);
        onChanged();
      } else {
        acceleratorConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder getAcceleratorConfigsBuilder(
        int index) {
      return getAcceleratorConfigsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfigOrBuilder getAcceleratorConfigsOrBuilder(
        int index) {
      if (acceleratorConfigsBuilder_ == null) {
        return acceleratorConfigs_.get(index);  } else {
        return acceleratorConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public java.util.List<? extends com.google.cloud.tpu.v2alpha1.AcceleratorConfigOrBuilder> 
         getAcceleratorConfigsOrBuilderList() {
      if (acceleratorConfigsBuilder_ != null) {
        return acceleratorConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(acceleratorConfigs_);
      }
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder addAcceleratorConfigsBuilder() {
      return getAcceleratorConfigsFieldBuilder().addBuilder(
          com.google.cloud.tpu.v2alpha1.AcceleratorConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder addAcceleratorConfigsBuilder(
        int index) {
      return getAcceleratorConfigsFieldBuilder().addBuilder(
          index, com.google.cloud.tpu.v2alpha1.AcceleratorConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * The accelerator config.
     * </pre>
     *
     * <code>repeated .google.cloud.tpu.v2alpha1.AcceleratorConfig accelerator_configs = 3;</code>
     */
    public java.util.List<com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder> 
         getAcceleratorConfigsBuilderList() {
      return getAcceleratorConfigsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.tpu.v2alpha1.AcceleratorConfig, com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder, com.google.cloud.tpu.v2alpha1.AcceleratorConfigOrBuilder> 
        getAcceleratorConfigsFieldBuilder() {
      if (acceleratorConfigsBuilder_ == null) {
        acceleratorConfigsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.tpu.v2alpha1.AcceleratorConfig, com.google.cloud.tpu.v2alpha1.AcceleratorConfig.Builder, com.google.cloud.tpu.v2alpha1.AcceleratorConfigOrBuilder>(
                acceleratorConfigs_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        acceleratorConfigs_ = null;
      }
      return acceleratorConfigsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.AcceleratorType)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.AcceleratorType)
  private static final com.google.cloud.tpu.v2alpha1.AcceleratorType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.AcceleratorType();
  }

  public static com.google.cloud.tpu.v2alpha1.AcceleratorType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceleratorType>
      PARSER = new com.google.protobuf.AbstractParser<AcceleratorType>() {
    @java.lang.Override
    public AcceleratorType parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcceleratorType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceleratorType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.AcceleratorType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

