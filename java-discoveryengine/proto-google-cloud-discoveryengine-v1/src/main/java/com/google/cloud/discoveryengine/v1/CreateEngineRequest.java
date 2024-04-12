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
 * Request for
 * [EngineService.CreateEngine][google.cloud.discoveryengine.v1.EngineService.CreateEngine]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.CreateEngineRequest}
 */
public final class CreateEngineRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.CreateEngineRequest)
    CreateEngineRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateEngineRequest.newBuilder() to construct.
  private CreateEngineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateEngineRequest() {
    parent_ = "";
    engineId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateEngineRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.EngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_CreateEngineRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.EngineServiceProto
        .internal_static_google_cloud_discoveryengine_v1_CreateEngineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.CreateEngineRequest.class,
            com.google.cloud.discoveryengine.v1.CreateEngineRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENGINE_FIELD_NUMBER = 2;
  private com.google.cloud.discoveryengine.v1.Engine engine_;
  /**
   *
   *
   * <pre>
   * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
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
   * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
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
   * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.EngineOrBuilder getEngineOrBuilder() {
    return engine_ == null
        ? com.google.cloud.discoveryengine.v1.Engine.getDefaultInstance()
        : engine_;
  }

  public static final int ENGINE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object engineId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the
   * [Engine][google.cloud.discoveryengine.v1.Engine], which will become the
   * final component of the [Engine][google.cloud.discoveryengine.v1.Engine]'s
   * resource name.
   *
   * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string engine_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The engineId.
   */
  @java.lang.Override
  public java.lang.String getEngineId() {
    java.lang.Object ref = engineId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      engineId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the
   * [Engine][google.cloud.discoveryengine.v1.Engine], which will become the
   * final component of the [Engine][google.cloud.discoveryengine.v1.Engine]'s
   * resource name.
   *
   * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string engine_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for engineId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEngineIdBytes() {
    java.lang.Object ref = engineId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      engineId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEngine());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(engineId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, engineId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEngine());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(engineId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, engineId_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.CreateEngineRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.CreateEngineRequest other =
        (com.google.cloud.discoveryengine.v1.CreateEngineRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasEngine() != other.hasEngine()) return false;
    if (hasEngine()) {
      if (!getEngine().equals(other.getEngine())) return false;
    }
    if (!getEngineId().equals(other.getEngineId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasEngine()) {
      hash = (37 * hash) + ENGINE_FIELD_NUMBER;
      hash = (53 * hash) + getEngine().hashCode();
    }
    hash = (37 * hash) + ENGINE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEngineId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest parseFrom(
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
      com.google.cloud.discoveryengine.v1.CreateEngineRequest prototype) {
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
   * Request for
   * [EngineService.CreateEngine][google.cloud.discoveryengine.v1.EngineService.CreateEngine]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.CreateEngineRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.CreateEngineRequest)
      com.google.cloud.discoveryengine.v1.CreateEngineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_CreateEngineRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_CreateEngineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.CreateEngineRequest.class,
              com.google.cloud.discoveryengine.v1.CreateEngineRequest.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1.CreateEngineRequest.newBuilder()
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
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      engine_ = null;
      if (engineBuilder_ != null) {
        engineBuilder_.dispose();
        engineBuilder_ = null;
      }
      engineId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.EngineServiceProto
          .internal_static_google_cloud_discoveryengine_v1_CreateEngineRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.CreateEngineRequest getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.CreateEngineRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.CreateEngineRequest build() {
      com.google.cloud.discoveryengine.v1.CreateEngineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.CreateEngineRequest buildPartial() {
      com.google.cloud.discoveryengine.v1.CreateEngineRequest result =
          new com.google.cloud.discoveryengine.v1.CreateEngineRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1.CreateEngineRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.engine_ = engineBuilder_ == null ? engine_ : engineBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.engineId_ = engineId_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1.CreateEngineRequest) {
        return mergeFrom((com.google.cloud.discoveryengine.v1.CreateEngineRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1.CreateEngineRequest other) {
      if (other == com.google.cloud.discoveryengine.v1.CreateEngineRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEngine()) {
        mergeEngine(other.getEngine());
      }
      if (!other.getEngineId().isEmpty()) {
        engineId_ = other.engineId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEngineFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                engineId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, such as
     * `projects/{project}/locations/{location}/collections/{collection}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

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
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the engine field is set.
     */
    public boolean hasEngine() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEngine(com.google.cloud.discoveryengine.v1.Engine.Builder builderForValue) {
      if (engineBuilder_ == null) {
        engine_ = builderForValue.build();
      } else {
        engineBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEngine(com.google.cloud.discoveryengine.v1.Engine value) {
      if (engineBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
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
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEngine() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1.Engine.Builder getEngineBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEngineFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. The [Engine][google.cloud.discoveryengine.v1.Engine] to create.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1.Engine engine = 2 [(.google.api.field_behavior) = REQUIRED];
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

    private java.lang.Object engineId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the
     * [Engine][google.cloud.discoveryengine.v1.Engine], which will become the
     * final component of the [Engine][google.cloud.discoveryengine.v1.Engine]'s
     * resource name.
     *
     * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
     * standard with a length limit of 63 characters. Otherwise, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string engine_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The engineId.
     */
    public java.lang.String getEngineId() {
      java.lang.Object ref = engineId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        engineId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the
     * [Engine][google.cloud.discoveryengine.v1.Engine], which will become the
     * final component of the [Engine][google.cloud.discoveryengine.v1.Engine]'s
     * resource name.
     *
     * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
     * standard with a length limit of 63 characters. Otherwise, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string engine_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for engineId.
     */
    public com.google.protobuf.ByteString getEngineIdBytes() {
      java.lang.Object ref = engineId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        engineId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the
     * [Engine][google.cloud.discoveryengine.v1.Engine], which will become the
     * final component of the [Engine][google.cloud.discoveryengine.v1.Engine]'s
     * resource name.
     *
     * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
     * standard with a length limit of 63 characters. Otherwise, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string engine_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The engineId to set.
     * @return This builder for chaining.
     */
    public Builder setEngineId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      engineId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the
     * [Engine][google.cloud.discoveryengine.v1.Engine], which will become the
     * final component of the [Engine][google.cloud.discoveryengine.v1.Engine]'s
     * resource name.
     *
     * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
     * standard with a length limit of 63 characters. Otherwise, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string engine_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEngineId() {
      engineId_ = getDefaultInstance().getEngineId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the
     * [Engine][google.cloud.discoveryengine.v1.Engine], which will become the
     * final component of the [Engine][google.cloud.discoveryengine.v1.Engine]'s
     * resource name.
     *
     * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
     * standard with a length limit of 63 characters. Otherwise, an
     * INVALID_ARGUMENT error is returned.
     * </pre>
     *
     * <code>string engine_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for engineId to set.
     * @return This builder for chaining.
     */
    public Builder setEngineIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      engineId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.CreateEngineRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.CreateEngineRequest)
  private static final com.google.cloud.discoveryengine.v1.CreateEngineRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.CreateEngineRequest();
  }

  public static com.google.cloud.discoveryengine.v1.CreateEngineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEngineRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateEngineRequest>() {
        @java.lang.Override
        public CreateEngineRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEngineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEngineRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.CreateEngineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
