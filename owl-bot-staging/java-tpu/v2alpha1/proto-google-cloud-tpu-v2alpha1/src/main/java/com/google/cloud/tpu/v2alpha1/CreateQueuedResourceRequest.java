// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2alpha1;

/**
 * <pre>
 * Request for
 * [CreateQueuedResource][google.cloud.tpu.v2alpha1.Tpu.CreateQueuedResource].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest}
 */
public final class CreateQueuedResourceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest)
    CreateQueuedResourceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateQueuedResourceRequest.newBuilder() to construct.
  private CreateQueuedResourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateQueuedResourceRequest() {
    parent_ = "";
    queuedResourceId_ = "";
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateQueuedResourceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_CreateQueuedResourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_CreateQueuedResourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest.class, com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUEUED_RESOURCE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object queuedResourceId_ = "";
  /**
   * <pre>
   * The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
   * regex format.
   * </pre>
   *
   * <code>string queued_resource_id = 2;</code>
   * @return The queuedResourceId.
   */
  @java.lang.Override
  public java.lang.String getQueuedResourceId() {
    java.lang.Object ref = queuedResourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      queuedResourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
   * regex format.
   * </pre>
   *
   * <code>string queued_resource_id = 2;</code>
   * @return The bytes for queuedResourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQueuedResourceIdBytes() {
    java.lang.Object ref = queuedResourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      queuedResourceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUEUED_RESOURCE_FIELD_NUMBER = 3;
  private com.google.cloud.tpu.v2alpha1.QueuedResource queuedResource_;
  /**
   * <pre>
   * Required. The queued resource.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the queuedResource field is set.
   */
  @java.lang.Override
  public boolean hasQueuedResource() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The queued resource.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The queuedResource.
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.QueuedResource getQueuedResource() {
    return queuedResource_ == null ? com.google.cloud.tpu.v2alpha1.QueuedResource.getDefaultInstance() : queuedResource_;
  }
  /**
   * <pre>
   * Required. The queued resource.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.QueuedResourceOrBuilder getQueuedResourceOrBuilder() {
    return queuedResource_ == null ? com.google.cloud.tpu.v2alpha1.QueuedResource.getDefaultInstance() : queuedResource_;
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object requestId_ = "";
  /**
   * <pre>
   * Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queuedResourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, queuedResourceId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getQueuedResource());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, requestId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(queuedResourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, queuedResourceId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getQueuedResource());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, requestId_);
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
    if (!(obj instanceof com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest other = (com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getQueuedResourceId()
        .equals(other.getQueuedResourceId())) return false;
    if (hasQueuedResource() != other.hasQueuedResource()) return false;
    if (hasQueuedResource()) {
      if (!getQueuedResource()
          .equals(other.getQueuedResource())) return false;
    }
    if (!getRequestId()
        .equals(other.getRequestId())) return false;
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
    hash = (37 * hash) + QUEUED_RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getQueuedResourceId().hashCode();
    if (hasQueuedResource()) {
      hash = (37 * hash) + QUEUED_RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getQueuedResource().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest prototype) {
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
   * Request for
   * [CreateQueuedResource][google.cloud.tpu.v2alpha1.Tpu.CreateQueuedResource].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest)
      com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_CreateQueuedResourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_CreateQueuedResourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest.class, com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest.newBuilder()
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
        getQueuedResourceFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      queuedResourceId_ = "";
      queuedResource_ = null;
      if (queuedResourceBuilder_ != null) {
        queuedResourceBuilder_.dispose();
        queuedResourceBuilder_ = null;
      }
      requestId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tpu.v2alpha1.CloudTpuProto.internal_static_google_cloud_tpu_v2alpha1_CreateQueuedResourceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest build() {
      com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest buildPartial() {
      com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest result = new com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.queuedResourceId_ = queuedResourceId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.queuedResource_ = queuedResourceBuilder_ == null
            ? queuedResource_
            : queuedResourceBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.requestId_ = requestId_;
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
      if (other instanceof com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest) {
        return mergeFrom((com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest other) {
      if (other == com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getQueuedResourceId().isEmpty()) {
        queuedResourceId_ = other.queuedResourceId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasQueuedResource()) {
        mergeQueuedResource(other.getQueuedResource());
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        bitField0_ |= 0x00000008;
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
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              queuedResourceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getQueuedResourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              requestId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource name.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object queuedResourceId_ = "";
    /**
     * <pre>
     * The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
     * regex format.
     * </pre>
     *
     * <code>string queued_resource_id = 2;</code>
     * @return The queuedResourceId.
     */
    public java.lang.String getQueuedResourceId() {
      java.lang.Object ref = queuedResourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        queuedResourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
     * regex format.
     * </pre>
     *
     * <code>string queued_resource_id = 2;</code>
     * @return The bytes for queuedResourceId.
     */
    public com.google.protobuf.ByteString
        getQueuedResourceIdBytes() {
      java.lang.Object ref = queuedResourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        queuedResourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
     * regex format.
     * </pre>
     *
     * <code>string queued_resource_id = 2;</code>
     * @param value The queuedResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setQueuedResourceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      queuedResourceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
     * regex format.
     * </pre>
     *
     * <code>string queued_resource_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQueuedResourceId() {
      queuedResourceId_ = getDefaultInstance().getQueuedResourceId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unqualified resource name. Should follow the `^[A-Za-z0-9_.~+%-]+$`
     * regex format.
     * </pre>
     *
     * <code>string queued_resource_id = 2;</code>
     * @param value The bytes for queuedResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setQueuedResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      queuedResourceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.tpu.v2alpha1.QueuedResource queuedResource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.tpu.v2alpha1.QueuedResource, com.google.cloud.tpu.v2alpha1.QueuedResource.Builder, com.google.cloud.tpu.v2alpha1.QueuedResourceOrBuilder> queuedResourceBuilder_;
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the queuedResource field is set.
     */
    public boolean hasQueuedResource() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The queuedResource.
     */
    public com.google.cloud.tpu.v2alpha1.QueuedResource getQueuedResource() {
      if (queuedResourceBuilder_ == null) {
        return queuedResource_ == null ? com.google.cloud.tpu.v2alpha1.QueuedResource.getDefaultInstance() : queuedResource_;
      } else {
        return queuedResourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQueuedResource(com.google.cloud.tpu.v2alpha1.QueuedResource value) {
      if (queuedResourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queuedResource_ = value;
      } else {
        queuedResourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQueuedResource(
        com.google.cloud.tpu.v2alpha1.QueuedResource.Builder builderForValue) {
      if (queuedResourceBuilder_ == null) {
        queuedResource_ = builderForValue.build();
      } else {
        queuedResourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeQueuedResource(com.google.cloud.tpu.v2alpha1.QueuedResource value) {
      if (queuedResourceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          queuedResource_ != null &&
          queuedResource_ != com.google.cloud.tpu.v2alpha1.QueuedResource.getDefaultInstance()) {
          getQueuedResourceBuilder().mergeFrom(value);
        } else {
          queuedResource_ = value;
        }
      } else {
        queuedResourceBuilder_.mergeFrom(value);
      }
      if (queuedResource_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearQueuedResource() {
      bitField0_ = (bitField0_ & ~0x00000004);
      queuedResource_ = null;
      if (queuedResourceBuilder_ != null) {
        queuedResourceBuilder_.dispose();
        queuedResourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.tpu.v2alpha1.QueuedResource.Builder getQueuedResourceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getQueuedResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.tpu.v2alpha1.QueuedResourceOrBuilder getQueuedResourceOrBuilder() {
      if (queuedResourceBuilder_ != null) {
        return queuedResourceBuilder_.getMessageOrBuilder();
      } else {
        return queuedResource_ == null ?
            com.google.cloud.tpu.v2alpha1.QueuedResource.getDefaultInstance() : queuedResource_;
      }
    }
    /**
     * <pre>
     * Required. The queued resource.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2alpha1.QueuedResource queued_resource = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.tpu.v2alpha1.QueuedResource, com.google.cloud.tpu.v2alpha1.QueuedResource.Builder, com.google.cloud.tpu.v2alpha1.QueuedResourceOrBuilder> 
        getQueuedResourceFieldBuilder() {
      if (queuedResourceBuilder_ == null) {
        queuedResourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tpu.v2alpha1.QueuedResource, com.google.cloud.tpu.v2alpha1.QueuedResource.Builder, com.google.cloud.tpu.v2alpha1.QueuedResourceOrBuilder>(
                getQueuedResource(),
                getParentForChildren(),
                isClean());
        queuedResource_ = null;
      }
      return queuedResourceBuilder_;
    }

    private java.lang.Object requestId_ = "";
    /**
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      requestId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      requestId_ = getDefaultInstance().getRequestId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 4;</code>
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      requestId_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest)
  private static final com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest();
  }

  public static com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateQueuedResourceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateQueuedResourceRequest>() {
    @java.lang.Override
    public CreateQueuedResourceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateQueuedResourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateQueuedResourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2alpha1.CreateQueuedResourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

