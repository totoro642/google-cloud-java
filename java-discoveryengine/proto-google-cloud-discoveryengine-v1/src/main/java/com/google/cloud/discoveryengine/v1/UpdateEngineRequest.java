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
// source: google/cloud/discoveryengine/v1/engine_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [EngineService.UpdateEngine][google.cloud.discoveryengine.v1.EngineService.UpdateEngine]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.UpdateEngineRequest}
 */
public final class UpdateEngineRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.UpdateEngineRequest)
    UpdateEngineRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateEngineRequest.newBuilder() to construct.
  private UpdateEngineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEngineRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateEngineRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.EngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_UpdateEngineRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.EngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_UpdateEngineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.UpdateEngineRequest.class,
            com.google.cloud.discoveryengine.v1.UpdateEngineRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ENGINE_FIELD_NUMBER = 1;
  private com.google.cloud.discoveryengine.v1.Engine engine_;
  /**
   *
   *
   * <pre>
   * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
   *
   * If the caller does not have permission to update the
   * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
   * exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the engine field is set.
   */
  @java.lang.Override
  public boolean hasEngine() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
   *
   * If the caller does not have permission to update the
   * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
   * exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The engine.
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.Engine getEngine() {
    return engine_ == null
        ? com.google.cloud.discoveryengine.v1.Engine.getDefaultInstance()
        : engine_;
  }
  /**
   *
   *
   * <pre>
   * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
   *
   * If the caller does not have permission to update the
   * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
   * exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.EngineOrBuilder getEngineOrBuilder() {
    return engine_ == null
        ? com.google.cloud.discoveryengine.v1.Engine.getDefaultInstance()
        : engine_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEngine());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEngine());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.UpdateEngineRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.UpdateEngineRequest other =
        (com.google.cloud.discoveryengine.v1.UpdateEngineRequest) obj;

    if (hasEngine() != other.hasEngine()) return false;
    if (hasEngine()) {
      if (!getEngine().equals(other.getEngine())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasEngine()) {
      hash = (37 * hash) + ENGINE_FIELD_NUMBER;
      hash = (53 * hash) + getEngine().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest parseFrom(
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
      com.google.cloud.discoveryengine.v1.UpdateEngineRequest prototype) {
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
   * Request message for
   * [EngineService.UpdateEngine][google.cloud.discoveryengine.v1.EngineService.UpdateEngine]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.UpdateEngineRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.UpdateEngineRequest)
      com.google.cloud.discoveryengine.v1.UpdateEngineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_UpdateEngineRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_UpdateEngineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.UpdateEngineRequest.class,
              com.google.cloud.discoveryengine.v1.UpdateEngineRequest.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1.UpdateEngineRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEngineFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      engine_ = null;
      if (engineBuilder_ != null) {
        engineBuilder_.dispose();
        engineBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_UpdateEngineRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.UpdateEngineRequest getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.UpdateEngineRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.UpdateEngineRequest build() {
      com.google.cloud.discoveryengine.v1.UpdateEngineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.UpdateEngineRequest buildPartial() {
      com.google.cloud.discoveryengine.v1.UpdateEngineRequest result =
          new com.google.cloud.discoveryengine.v1.UpdateEngineRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1.UpdateEngineRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.engine_ = engineBuilder_ == null ? engine_ : engineBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.discoveryengine.v1.UpdateEngineRequest) {
        return mergeFrom((com.google.cloud.discoveryengine.v1.UpdateEngineRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1.UpdateEngineRequest other) {
      if (other == com.google.cloud.discoveryengine.v1.UpdateEngineRequest.getDefaultInstance())
        return this;
      if (other.hasEngine()) {
        mergeEngine(other.getEngine());
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
            case 10:
              {
                input.readMessage(getEngineFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.discoveryengine.v1.Engine engine_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.Engine,
            com.google.cloud.discoveryengine.v1.Engine.Builder,
            com.google.cloud.discoveryengine.v1.EngineOrBuilder>
        engineBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the engine field is set.
     */
    public boolean hasEngine() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The engine.
     */
    public com.google.cloud.discoveryengine.v1.Engine getEngine() {
      if (engineBuilder_ == null) {
        return engine_ == null
            ? com.google.cloud.discoveryengine.v1.Engine.getDefaultInstance()
            : engine_;
      } else {
        return engineBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEngine(com.google.cloud.discoveryengine.v1.Engine value) {
      if (engineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        engine_ = value;
      } else {
        engineBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEngine(com.google.cloud.discoveryengine.v1.Engine.Builder builderForValue) {
      if (engineBuilder_ == null) {
        engine_ = builderForValue.build();
      } else {
        engineBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEngine(com.google.cloud.discoveryengine.v1.Engine value) {
      if (engineBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && engine_ != null
            && engine_ != com.google.cloud.discoveryengine.v1.Engine.getDefaultInstance()) {
          getEngineBuilder().mergeFrom(value);
        } else {
          engine_ = value;
        }
      } else {
        engineBuilder_.mergeFrom(value);
      }
      if (engine_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEngine() {
      bitField0_ = (bitField0_ & ~0x00000001);
      engine_ = null;
      if (engineBuilder_ != null) {
        engineBuilder_.dispose();
        engineBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1.Engine.Builder getEngineBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEngineFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1.EngineOrBuilder getEngineOrBuilder() {
      if (engineBuilder_ != null) {
        return engineBuilder_.getMessageOrBuilder();
      } else {
        return engine_ == null
            ? com.google.cloud.discoveryengine.v1.Engine.getDefaultInstance()
            : engine_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If the caller does not have permission to update the
     * [Engine][google.cloud.discoveryengine.v1.Engine], regardless of whether or
     * not it exists, a PERMISSION_DENIED error is returned.
     *
     * If the [Engine][google.cloud.discoveryengine.v1.Engine] to update does not
     * exist, a NOT_FOUND error is returned.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.Engine,
            com.google.cloud.discoveryengine.v1.Engine.Builder,
            com.google.cloud.discoveryengine.v1.EngineOrBuilder>
        getEngineFieldBuilder() {
      if (engineBuilder_ == null) {
        engineBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.discoveryengine.v1.Engine,
                com.google.cloud.discoveryengine.v1.Engine.Builder,
                com.google.cloud.discoveryengine.v1.EngineOrBuilder>(
                getEngine(), getParentForChildren(), isClean());
        engine_ = null;
      }
      return engineBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
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
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
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
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [Engine][google.cloud.discoveryengine.v1.Engine] to update.
     *
     * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
     * is returned.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.UpdateEngineRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.UpdateEngineRequest)
  private static final com.google.cloud.discoveryengine.v1.UpdateEngineRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.UpdateEngineRequest();
  }

  public static com.google.cloud.discoveryengine.v1.UpdateEngineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEngineRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEngineRequest>() {
        @java.lang.Override
        public UpdateEngineRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEngineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEngineRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.UpdateEngineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
