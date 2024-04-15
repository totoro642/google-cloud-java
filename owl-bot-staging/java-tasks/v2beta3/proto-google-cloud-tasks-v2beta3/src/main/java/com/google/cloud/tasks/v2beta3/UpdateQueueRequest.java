// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tasks.v2beta3;

/**
 * <pre>
 * Request message for
 * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta3.UpdateQueueRequest}
 */
public final class UpdateQueueRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta3.UpdateQueueRequest)
    UpdateQueueRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateQueueRequest.newBuilder() to construct.
  private UpdateQueueRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateQueueRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateQueueRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta3.UpdateQueueRequest.class, com.google.cloud.tasks.v2beta3.UpdateQueueRequest.Builder.class);
  }

  private int bitField0_;
  public static final int QUEUE_FIELD_NUMBER = 1;
  private com.google.cloud.tasks.v2beta3.Queue queue_;
  /**
   * <pre>
   * Required. The queue to create or update.
   *
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
   * specified.
   *
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
   * changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the queue field is set.
   */
  @java.lang.Override
  public boolean hasQueue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The queue to create or update.
   *
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
   * specified.
   *
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
   * changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The queue.
   */
  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.Queue getQueue() {
    return queue_ == null ? com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
  }
  /**
   * <pre>
   * Required. The queue to create or update.
   *
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
   * specified.
   *
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
   * changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.QueueOrBuilder getQueueOrBuilder() {
    return queue_ == null ? com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   *
   * If empty, then all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   *
   * If empty, then all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   *
   * If empty, then all fields will be updated.
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getQueue());
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
        .computeMessageSize(1, getQueue());
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta3.UpdateQueueRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta3.UpdateQueueRequest other = (com.google.cloud.tasks.v2beta3.UpdateQueueRequest) obj;

    if (hasQueue() != other.hasQueue()) return false;
    if (hasQueue()) {
      if (!getQueue()
          .equals(other.getQueue())) return false;
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
    if (hasQueue()) {
      hash = (37 * hash) + QUEUE_FIELD_NUMBER;
      hash = (53 * hash) + getQueue().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.tasks.v2beta3.UpdateQueueRequest prototype) {
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
   * Request message for
   * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta3.UpdateQueueRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta3.UpdateQueueRequest)
      com.google.cloud.tasks.v2beta3.UpdateQueueRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta3.UpdateQueueRequest.class, com.google.cloud.tasks.v2beta3.UpdateQueueRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta3.UpdateQueueRequest.newBuilder()
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
        getQueueFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      queue_ = null;
      if (queueBuilder_ != null) {
        queueBuilder_.dispose();
        queueBuilder_ = null;
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
      return com.google.cloud.tasks.v2beta3.CloudTasksProto.internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.UpdateQueueRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta3.UpdateQueueRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.UpdateQueueRequest build() {
      com.google.cloud.tasks.v2beta3.UpdateQueueRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.UpdateQueueRequest buildPartial() {
      com.google.cloud.tasks.v2beta3.UpdateQueueRequest result = new com.google.cloud.tasks.v2beta3.UpdateQueueRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.tasks.v2beta3.UpdateQueueRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.queue_ = queueBuilder_ == null
            ? queue_
            : queueBuilder_.build();
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
      if (other instanceof com.google.cloud.tasks.v2beta3.UpdateQueueRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta3.UpdateQueueRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta3.UpdateQueueRequest other) {
      if (other == com.google.cloud.tasks.v2beta3.UpdateQueueRequest.getDefaultInstance()) return this;
      if (other.hasQueue()) {
        mergeQueue(other.getQueue());
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
                  getQueueFieldBuilder().getBuilder(),
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

    private com.google.cloud.tasks.v2beta3.Queue queue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.tasks.v2beta3.Queue, com.google.cloud.tasks.v2beta3.Queue.Builder, com.google.cloud.tasks.v2beta3.QueueOrBuilder> queueBuilder_;
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the queue field is set.
     */
    public boolean hasQueue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The queue.
     */
    public com.google.cloud.tasks.v2beta3.Queue getQueue() {
      if (queueBuilder_ == null) {
        return queue_ == null ? com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
      } else {
        return queueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQueue(com.google.cloud.tasks.v2beta3.Queue value) {
      if (queueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queue_ = value;
      } else {
        queueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setQueue(
        com.google.cloud.tasks.v2beta3.Queue.Builder builderForValue) {
      if (queueBuilder_ == null) {
        queue_ = builderForValue.build();
      } else {
        queueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeQueue(com.google.cloud.tasks.v2beta3.Queue value) {
      if (queueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          queue_ != null &&
          queue_ != com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance()) {
          getQueueBuilder().mergeFrom(value);
        } else {
          queue_ = value;
        }
      } else {
        queueBuilder_.mergeFrom(value);
      }
      if (queue_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearQueue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      queue_ = null;
      if (queueBuilder_ != null) {
        queueBuilder_.dispose();
        queueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.tasks.v2beta3.Queue.Builder getQueueBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQueueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.tasks.v2beta3.QueueOrBuilder getQueueOrBuilder() {
      if (queueBuilder_ != null) {
        return queueBuilder_.getMessageOrBuilder();
      } else {
        return queue_ == null ?
            com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
      }
    }
    /**
     * <pre>
     * Required. The queue to create or update.
     *
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     *
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.tasks.v2beta3.Queue, com.google.cloud.tasks.v2beta3.Queue.Builder, com.google.cloud.tasks.v2beta3.QueueOrBuilder> 
        getQueueFieldBuilder() {
      if (queueBuilder_ == null) {
        queueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tasks.v2beta3.Queue, com.google.cloud.tasks.v2beta3.Queue.Builder, com.google.cloud.tasks.v2beta3.QueueOrBuilder>(
                getQueue(),
                getParentForChildren(),
                isClean());
        queue_ = null;
      }
      return queueBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
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
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
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
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
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
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * A mask used to specify which fields of the queue are being updated.
     *
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta3.UpdateQueueRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta3.UpdateQueueRequest)
  private static final com.google.cloud.tasks.v2beta3.UpdateQueueRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta3.UpdateQueueRequest();
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateQueueRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateQueueRequest>() {
    @java.lang.Override
    public UpdateQueueRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateQueueRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateQueueRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.UpdateQueueRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

