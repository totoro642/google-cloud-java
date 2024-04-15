// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1;

/**
 * <pre>
 * Request object for `UpdateHydratedDeployment`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest}
 */
public final class UpdateHydratedDeploymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest)
    UpdateHydratedDeploymentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateHydratedDeploymentRequest.newBuilder() to construct.
  private UpdateHydratedDeploymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateHydratedDeploymentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateHydratedDeploymentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_UpdateHydratedDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_UpdateHydratedDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest.class, com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest.Builder.class);
  }

  private int bitField0_;
  public static final int HYDRATED_DEPLOYMENT_FIELD_NUMBER = 1;
  private com.google.cloud.telcoautomation.v1.HydratedDeployment hydratedDeployment_;
  /**
   * <pre>
   * Required. The hydrated deployment to update.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the hydratedDeployment field is set.
   */
  @java.lang.Override
  public boolean hasHydratedDeployment() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The hydrated deployment to update.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The hydratedDeployment.
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.HydratedDeployment getHydratedDeployment() {
    return hydratedDeployment_ == null ? com.google.cloud.telcoautomation.v1.HydratedDeployment.getDefaultInstance() : hydratedDeployment_;
  }
  /**
   * <pre>
   * Required. The hydrated deployment to update.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.HydratedDeploymentOrBuilder getHydratedDeploymentOrBuilder() {
    return hydratedDeployment_ == null ? com.google.cloud.telcoautomation.v1.HydratedDeployment.getDefaultInstance() : hydratedDeployment_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The list of fields to update. Update mask supports a special
   * value `*` which fully replaces (equivalent to PUT) the resource provided.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Required. The list of fields to update. Update mask supports a special
   * value `*` which fully replaces (equivalent to PUT) the resource provided.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The list of fields to update. Update mask supports a special
   * value `*` which fully replaces (equivalent to PUT) the resource provided.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getHydratedDeployment());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
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
        .computeMessageSize(1, getHydratedDeployment());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest other = (com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest) obj;

    if (hasHydratedDeployment() != other.hasHydratedDeployment()) return false;
    if (hasHydratedDeployment()) {
      if (!getHydratedDeployment()
          .equals(other.getHydratedDeployment())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasHydratedDeployment()) {
      hash = (37 * hash) + HYDRATED_DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getHydratedDeployment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest prototype) {
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
   * Request object for `UpdateHydratedDeployment`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest)
      com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_UpdateHydratedDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_UpdateHydratedDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest.class, com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest.Builder.class);
    }

    // Construct using com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest.newBuilder()
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
        getHydratedDeploymentFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hydratedDeployment_ = null;
      if (hydratedDeploymentBuilder_ != null) {
        hydratedDeploymentBuilder_.dispose();
        hydratedDeploymentBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_UpdateHydratedDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest build() {
      com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest buildPartial() {
      com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest result = new com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hydratedDeployment_ = hydratedDeploymentBuilder_ == null
            ? hydratedDeployment_
            : hydratedDeploymentBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest) {
        return mergeFrom((com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest other) {
      if (other == com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest.getDefaultInstance()) return this;
      if (other.hasHydratedDeployment()) {
        mergeHydratedDeployment(other.getHydratedDeployment());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getHydratedDeploymentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private com.google.cloud.telcoautomation.v1.HydratedDeployment hydratedDeployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.telcoautomation.v1.HydratedDeployment, com.google.cloud.telcoautomation.v1.HydratedDeployment.Builder, com.google.cloud.telcoautomation.v1.HydratedDeploymentOrBuilder> hydratedDeploymentBuilder_;
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the hydratedDeployment field is set.
     */
    public boolean hasHydratedDeployment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The hydratedDeployment.
     */
    public com.google.cloud.telcoautomation.v1.HydratedDeployment getHydratedDeployment() {
      if (hydratedDeploymentBuilder_ == null) {
        return hydratedDeployment_ == null ? com.google.cloud.telcoautomation.v1.HydratedDeployment.getDefaultInstance() : hydratedDeployment_;
      } else {
        return hydratedDeploymentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setHydratedDeployment(com.google.cloud.telcoautomation.v1.HydratedDeployment value) {
      if (hydratedDeploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hydratedDeployment_ = value;
      } else {
        hydratedDeploymentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setHydratedDeployment(
        com.google.cloud.telcoautomation.v1.HydratedDeployment.Builder builderForValue) {
      if (hydratedDeploymentBuilder_ == null) {
        hydratedDeployment_ = builderForValue.build();
      } else {
        hydratedDeploymentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeHydratedDeployment(com.google.cloud.telcoautomation.v1.HydratedDeployment value) {
      if (hydratedDeploymentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          hydratedDeployment_ != null &&
          hydratedDeployment_ != com.google.cloud.telcoautomation.v1.HydratedDeployment.getDefaultInstance()) {
          getHydratedDeploymentBuilder().mergeFrom(value);
        } else {
          hydratedDeployment_ = value;
        }
      } else {
        hydratedDeploymentBuilder_.mergeFrom(value);
      }
      if (hydratedDeployment_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearHydratedDeployment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hydratedDeployment_ = null;
      if (hydratedDeploymentBuilder_ != null) {
        hydratedDeploymentBuilder_.dispose();
        hydratedDeploymentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.telcoautomation.v1.HydratedDeployment.Builder getHydratedDeploymentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHydratedDeploymentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.telcoautomation.v1.HydratedDeploymentOrBuilder getHydratedDeploymentOrBuilder() {
      if (hydratedDeploymentBuilder_ != null) {
        return hydratedDeploymentBuilder_.getMessageOrBuilder();
      } else {
        return hydratedDeployment_ == null ?
            com.google.cloud.telcoautomation.v1.HydratedDeployment.getDefaultInstance() : hydratedDeployment_;
      }
    }
    /**
     * <pre>
     * Required. The hydrated deployment to update.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.telcoautomation.v1.HydratedDeployment, com.google.cloud.telcoautomation.v1.HydratedDeployment.Builder, com.google.cloud.telcoautomation.v1.HydratedDeploymentOrBuilder> 
        getHydratedDeploymentFieldBuilder() {
      if (hydratedDeploymentBuilder_ == null) {
        hydratedDeploymentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.telcoautomation.v1.HydratedDeployment, com.google.cloud.telcoautomation.v1.HydratedDeployment.Builder, com.google.cloud.telcoautomation.v1.HydratedDeploymentOrBuilder>(
                getHydratedDeployment(),
                getParentForChildren(),
                isClean());
        hydratedDeployment_ = null;
      }
      return hydratedDeploymentBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. The list of fields to update. Update mask supports a special
     * value `*` which fully replaces (equivalent to PUT) the resource provided.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest)
  private static final com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest();
  }

  public static com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateHydratedDeploymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateHydratedDeploymentRequest>() {
    @java.lang.Override
    public UpdateHydratedDeploymentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateHydratedDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateHydratedDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.UpdateHydratedDeploymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

