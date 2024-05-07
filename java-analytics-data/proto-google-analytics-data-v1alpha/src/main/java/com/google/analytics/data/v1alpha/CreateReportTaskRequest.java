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
// source: google/analytics/data/v1alpha/analytics_data_api.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * A request to create a report task.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.CreateReportTaskRequest}
 */
public final class CreateReportTaskRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.CreateReportTaskRequest)
    CreateReportTaskRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateReportTaskRequest.newBuilder() to construct.
  private CreateReportTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateReportTaskRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateReportTaskRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_CreateReportTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
        .internal_static_google_analytics_data_v1alpha_CreateReportTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.CreateReportTaskRequest.class,
            com.google.analytics.data.v1alpha.CreateReportTaskRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this report task will be created.
   * Format: `properties/{propertyId}`
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
   * Required. The parent resource where this report task will be created.
   * Format: `properties/{propertyId}`
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

  public static final int REPORT_TASK_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.ReportTask reportTask_;
  /**
   *
   *
   * <pre>
   * Required. The report task configuration to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the reportTask field is set.
   */
  @java.lang.Override
  public boolean hasReportTask() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The report task configuration to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The reportTask.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.ReportTask getReportTask() {
    return reportTask_ == null
        ? com.google.analytics.data.v1alpha.ReportTask.getDefaultInstance()
        : reportTask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The report task configuration to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.ReportTaskOrBuilder getReportTaskOrBuilder() {
    return reportTask_ == null
        ? com.google.analytics.data.v1alpha.ReportTask.getDefaultInstance()
        : reportTask_;
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
      output.writeMessage(2, getReportTask());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReportTask());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.CreateReportTaskRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.CreateReportTaskRequest other =
        (com.google.analytics.data.v1alpha.CreateReportTaskRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasReportTask() != other.hasReportTask()) return false;
    if (hasReportTask()) {
      if (!getReportTask().equals(other.getReportTask())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasReportTask()) {
      hash = (37 * hash) + REPORT_TASK_FIELD_NUMBER;
      hash = (53 * hash) + getReportTask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest parseFrom(
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
      com.google.analytics.data.v1alpha.CreateReportTaskRequest prototype) {
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
   * A request to create a report task.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.CreateReportTaskRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.CreateReportTaskRequest)
      com.google.analytics.data.v1alpha.CreateReportTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_CreateReportTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_CreateReportTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.CreateReportTaskRequest.class,
              com.google.analytics.data.v1alpha.CreateReportTaskRequest.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.CreateReportTaskRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getReportTaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      reportTask_ = null;
      if (reportTaskBuilder_ != null) {
        reportTaskBuilder_.dispose();
        reportTaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto
          .internal_static_google_analytics_data_v1alpha_CreateReportTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CreateReportTaskRequest getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.CreateReportTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CreateReportTaskRequest build() {
      com.google.analytics.data.v1alpha.CreateReportTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.CreateReportTaskRequest buildPartial() {
      com.google.analytics.data.v1alpha.CreateReportTaskRequest result =
          new com.google.analytics.data.v1alpha.CreateReportTaskRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.CreateReportTaskRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reportTask_ = reportTaskBuilder_ == null ? reportTask_ : reportTaskBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.CreateReportTaskRequest) {
        return mergeFrom((com.google.analytics.data.v1alpha.CreateReportTaskRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.CreateReportTaskRequest other) {
      if (other == com.google.analytics.data.v1alpha.CreateReportTaskRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReportTask()) {
        mergeReportTask(other.getReportTask());
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
                input.readMessage(getReportTaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this report task will be created.
     * Format: `properties/{propertyId}`
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
     * Required. The parent resource where this report task will be created.
     * Format: `properties/{propertyId}`
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
     * Required. The parent resource where this report task will be created.
     * Format: `properties/{propertyId}`
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
     * Required. The parent resource where this report task will be created.
     * Format: `properties/{propertyId}`
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
     * Required. The parent resource where this report task will be created.
     * Format: `properties/{propertyId}`
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

    private com.google.analytics.data.v1alpha.ReportTask reportTask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.ReportTask,
            com.google.analytics.data.v1alpha.ReportTask.Builder,
            com.google.analytics.data.v1alpha.ReportTaskOrBuilder>
        reportTaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the reportTask field is set.
     */
    public boolean hasReportTask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The reportTask.
     */
    public com.google.analytics.data.v1alpha.ReportTask getReportTask() {
      if (reportTaskBuilder_ == null) {
        return reportTask_ == null
            ? com.google.analytics.data.v1alpha.ReportTask.getDefaultInstance()
            : reportTask_;
      } else {
        return reportTaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReportTask(com.google.analytics.data.v1alpha.ReportTask value) {
      if (reportTaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reportTask_ = value;
      } else {
        reportTaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReportTask(
        com.google.analytics.data.v1alpha.ReportTask.Builder builderForValue) {
      if (reportTaskBuilder_ == null) {
        reportTask_ = builderForValue.build();
      } else {
        reportTaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReportTask(com.google.analytics.data.v1alpha.ReportTask value) {
      if (reportTaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && reportTask_ != null
            && reportTask_ != com.google.analytics.data.v1alpha.ReportTask.getDefaultInstance()) {
          getReportTaskBuilder().mergeFrom(value);
        } else {
          reportTask_ = value;
        }
      } else {
        reportTaskBuilder_.mergeFrom(value);
      }
      if (reportTask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReportTask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reportTask_ = null;
      if (reportTaskBuilder_ != null) {
        reportTaskBuilder_.dispose();
        reportTaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.data.v1alpha.ReportTask.Builder getReportTaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReportTaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.data.v1alpha.ReportTaskOrBuilder getReportTaskOrBuilder() {
      if (reportTaskBuilder_ != null) {
        return reportTaskBuilder_.getMessageOrBuilder();
      } else {
        return reportTask_ == null
            ? com.google.analytics.data.v1alpha.ReportTask.getDefaultInstance()
            : reportTask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The report task configuration to create.
     * </pre>
     *
     * <code>
     * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.ReportTask,
            com.google.analytics.data.v1alpha.ReportTask.Builder,
            com.google.analytics.data.v1alpha.ReportTaskOrBuilder>
        getReportTaskFieldBuilder() {
      if (reportTaskBuilder_ == null) {
        reportTaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.ReportTask,
                com.google.analytics.data.v1alpha.ReportTask.Builder,
                com.google.analytics.data.v1alpha.ReportTaskOrBuilder>(
                getReportTask(), getParentForChildren(), isClean());
        reportTask_ = null;
      }
      return reportTaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.CreateReportTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.CreateReportTaskRequest)
  private static final com.google.analytics.data.v1alpha.CreateReportTaskRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.CreateReportTaskRequest();
  }

  public static com.google.analytics.data.v1alpha.CreateReportTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateReportTaskRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateReportTaskRequest>() {
        @java.lang.Override
        public CreateReportTaskRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateReportTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateReportTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.CreateReportTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
