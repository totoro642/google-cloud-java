/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/batch/v1alpha/task.proto

package com.google.cloud.batch.v1alpha;

/**
 *
 *
 * <pre>
 * Status event
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1alpha.StatusEvent}
 */
public final class StatusEvent extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1alpha.StatusEvent)
    StatusEventOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StatusEvent.newBuilder() to construct.
  private StatusEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StatusEvent() {
    type_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StatusEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.batch.v1alpha.TaskProto
        .internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1alpha.TaskProto
        .internal_static_google_cloud_batch_v1alpha_StatusEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1alpha.StatusEvent.class,
            com.google.cloud.batch.v1alpha.StatusEvent.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   *
   *
   * <pre>
   * Type of the event.
   * </pre>
   *
   * <code>string type = 3;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Type of the event.
   * </pre>
   *
   * <code>string type = 3;</code>
   *
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   *
   *
   * <pre>
   * Description of the event.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Description of the event.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp eventTime_;
  /**
   *
   *
   * <pre>
   * The time this event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   *
   * @return Whether the eventTime field is set.
   */
  @java.lang.Override
  public boolean hasEventTime() {
    return eventTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time this event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   *
   * @return The eventTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEventTime() {
    return eventTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : eventTime_;
  }
  /**
   *
   *
   * <pre>
   * The time this event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder() {
    return eventTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : eventTime_;
  }

  public static final int TASK_EXECUTION_FIELD_NUMBER = 4;
  private com.google.cloud.batch.v1alpha.TaskExecution taskExecution_;
  /**
   *
   *
   * <pre>
   * Task Execution
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
   *
   * @return Whether the taskExecution field is set.
   */
  @java.lang.Override
  public boolean hasTaskExecution() {
    return taskExecution_ != null;
  }
  /**
   *
   *
   * <pre>
   * Task Execution
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
   *
   * @return The taskExecution.
   */
  @java.lang.Override
  public com.google.cloud.batch.v1alpha.TaskExecution getTaskExecution() {
    return taskExecution_ == null
        ? com.google.cloud.batch.v1alpha.TaskExecution.getDefaultInstance()
        : taskExecution_;
  }
  /**
   *
   *
   * <pre>
   * Task Execution
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
   */
  @java.lang.Override
  public com.google.cloud.batch.v1alpha.TaskExecutionOrBuilder getTaskExecutionOrBuilder() {
    return taskExecution_ == null
        ? com.google.cloud.batch.v1alpha.TaskExecution.getDefaultInstance()
        : taskExecution_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    if (eventTime_ != null) {
      output.writeMessage(2, getEventTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    if (taskExecution_ != null) {
      output.writeMessage(4, getTaskExecution());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    if (eventTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEventTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    if (taskExecution_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getTaskExecution());
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
    if (!(obj instanceof com.google.cloud.batch.v1alpha.StatusEvent)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1alpha.StatusEvent other =
        (com.google.cloud.batch.v1alpha.StatusEvent) obj;

    if (!getType().equals(other.getType())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (hasEventTime() != other.hasEventTime()) return false;
    if (hasEventTime()) {
      if (!getEventTime().equals(other.getEventTime())) return false;
    }
    if (hasTaskExecution() != other.hasTaskExecution()) return false;
    if (hasTaskExecution()) {
      if (!getTaskExecution().equals(other.getTaskExecution())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasEventTime()) {
      hash = (37 * hash) + EVENT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEventTime().hashCode();
    }
    if (hasTaskExecution()) {
      hash = (37 * hash) + TASK_EXECUTION_FIELD_NUMBER;
      hash = (53 * hash) + getTaskExecution().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent parseFrom(
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

  public static Builder newBuilder(com.google.cloud.batch.v1alpha.StatusEvent prototype) {
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
   * Status event
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1alpha.StatusEvent}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1alpha.StatusEvent)
      com.google.cloud.batch.v1alpha.StatusEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.batch.v1alpha.TaskProto
          .internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1alpha.TaskProto
          .internal_static_google_cloud_batch_v1alpha_StatusEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1alpha.StatusEvent.class,
              com.google.cloud.batch.v1alpha.StatusEvent.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1alpha.StatusEvent.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = "";
      description_ = "";
      eventTime_ = null;
      if (eventTimeBuilder_ != null) {
        eventTimeBuilder_.dispose();
        eventTimeBuilder_ = null;
      }
      taskExecution_ = null;
      if (taskExecutionBuilder_ != null) {
        taskExecutionBuilder_.dispose();
        taskExecutionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.batch.v1alpha.TaskProto
          .internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.StatusEvent getDefaultInstanceForType() {
      return com.google.cloud.batch.v1alpha.StatusEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.StatusEvent build() {
      com.google.cloud.batch.v1alpha.StatusEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1alpha.StatusEvent buildPartial() {
      com.google.cloud.batch.v1alpha.StatusEvent result =
          new com.google.cloud.batch.v1alpha.StatusEvent(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.batch.v1alpha.StatusEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.eventTime_ = eventTimeBuilder_ == null ? eventTime_ : eventTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.taskExecution_ =
            taskExecutionBuilder_ == null ? taskExecution_ : taskExecutionBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.batch.v1alpha.StatusEvent) {
        return mergeFrom((com.google.cloud.batch.v1alpha.StatusEvent) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1alpha.StatusEvent other) {
      if (other == com.google.cloud.batch.v1alpha.StatusEvent.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasEventTime()) {
        mergeEventTime(other.getEventTime());
      }
      if (other.hasTaskExecution()) {
        mergeTaskExecution(other.getTaskExecution());
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
                description_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEventTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 18
            case 26:
              {
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 26
            case 34:
              {
                input.readMessage(getTaskExecutionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object type_ = "";
    /**
     *
     *
     * <pre>
     * Type of the event.
     * </pre>
     *
     * <code>string type = 3;</code>
     *
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the event.
     * </pre>
     *
     * <code>string type = 3;</code>
     *
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the event.
     * </pre>
     *
     * <code>string type = 3;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the event.
     * </pre>
     *
     * <code>string type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the event.
     * </pre>
     *
     * <code>string type = 3;</code>
     *
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * Description of the event.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Description of the event.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Description of the event.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of the event.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of the event.
     * </pre>
     *
     * <code>string description = 1;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp eventTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        eventTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     *
     * @return Whether the eventTime field is set.
     */
    public boolean hasEventTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     *
     * @return The eventTime.
     */
    public com.google.protobuf.Timestamp getEventTime() {
      if (eventTimeBuilder_ == null) {
        return eventTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : eventTime_;
      } else {
        return eventTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public Builder setEventTime(com.google.protobuf.Timestamp value) {
      if (eventTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eventTime_ = value;
      } else {
        eventTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public Builder setEventTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (eventTimeBuilder_ == null) {
        eventTime_ = builderForValue.build();
      } else {
        eventTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public Builder mergeEventTime(com.google.protobuf.Timestamp value) {
      if (eventTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && eventTime_ != null
            && eventTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEventTimeBuilder().mergeFrom(value);
        } else {
          eventTime_ = value;
        }
      } else {
        eventTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public Builder clearEventTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      eventTime_ = null;
      if (eventTimeBuilder_ != null) {
        eventTimeBuilder_.dispose();
        eventTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEventTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEventTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder() {
      if (eventTimeBuilder_ != null) {
        return eventTimeBuilder_.getMessageOrBuilder();
      } else {
        return eventTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : eventTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time this event occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp event_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getEventTimeFieldBuilder() {
      if (eventTimeBuilder_ == null) {
        eventTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getEventTime(), getParentForChildren(), isClean());
        eventTime_ = null;
      }
      return eventTimeBuilder_;
    }

    private com.google.cloud.batch.v1alpha.TaskExecution taskExecution_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.batch.v1alpha.TaskExecution,
            com.google.cloud.batch.v1alpha.TaskExecution.Builder,
            com.google.cloud.batch.v1alpha.TaskExecutionOrBuilder>
        taskExecutionBuilder_;
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     *
     * @return Whether the taskExecution field is set.
     */
    public boolean hasTaskExecution() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     *
     * @return The taskExecution.
     */
    public com.google.cloud.batch.v1alpha.TaskExecution getTaskExecution() {
      if (taskExecutionBuilder_ == null) {
        return taskExecution_ == null
            ? com.google.cloud.batch.v1alpha.TaskExecution.getDefaultInstance()
            : taskExecution_;
      } else {
        return taskExecutionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     */
    public Builder setTaskExecution(com.google.cloud.batch.v1alpha.TaskExecution value) {
      if (taskExecutionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taskExecution_ = value;
      } else {
        taskExecutionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     */
    public Builder setTaskExecution(
        com.google.cloud.batch.v1alpha.TaskExecution.Builder builderForValue) {
      if (taskExecutionBuilder_ == null) {
        taskExecution_ = builderForValue.build();
      } else {
        taskExecutionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     */
    public Builder mergeTaskExecution(com.google.cloud.batch.v1alpha.TaskExecution value) {
      if (taskExecutionBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)
            && taskExecution_ != null
            && taskExecution_
                != com.google.cloud.batch.v1alpha.TaskExecution.getDefaultInstance()) {
          getTaskExecutionBuilder().mergeFrom(value);
        } else {
          taskExecution_ = value;
        }
      } else {
        taskExecutionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     */
    public Builder clearTaskExecution() {
      bitField0_ = (bitField0_ & ~0x00000008);
      taskExecution_ = null;
      if (taskExecutionBuilder_ != null) {
        taskExecutionBuilder_.dispose();
        taskExecutionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     */
    public com.google.cloud.batch.v1alpha.TaskExecution.Builder getTaskExecutionBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getTaskExecutionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     */
    public com.google.cloud.batch.v1alpha.TaskExecutionOrBuilder getTaskExecutionOrBuilder() {
      if (taskExecutionBuilder_ != null) {
        return taskExecutionBuilder_.getMessageOrBuilder();
      } else {
        return taskExecution_ == null
            ? com.google.cloud.batch.v1alpha.TaskExecution.getDefaultInstance()
            : taskExecution_;
      }
    }
    /**
     *
     *
     * <pre>
     * Task Execution
     * </pre>
     *
     * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.batch.v1alpha.TaskExecution,
            com.google.cloud.batch.v1alpha.TaskExecution.Builder,
            com.google.cloud.batch.v1alpha.TaskExecutionOrBuilder>
        getTaskExecutionFieldBuilder() {
      if (taskExecutionBuilder_ == null) {
        taskExecutionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.batch.v1alpha.TaskExecution,
                com.google.cloud.batch.v1alpha.TaskExecution.Builder,
                com.google.cloud.batch.v1alpha.TaskExecutionOrBuilder>(
                getTaskExecution(), getParentForChildren(), isClean());
        taskExecution_ = null;
      }
      return taskExecutionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1alpha.StatusEvent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1alpha.StatusEvent)
  private static final com.google.cloud.batch.v1alpha.StatusEvent DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1alpha.StatusEvent();
  }

  public static com.google.cloud.batch.v1alpha.StatusEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatusEvent> PARSER =
      new com.google.protobuf.AbstractParser<StatusEvent>() {
        @java.lang.Override
        public StatusEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<StatusEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatusEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1alpha.StatusEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
