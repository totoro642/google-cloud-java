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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

/**
 *
 *
 * <pre>
 * The Recovery settings of an environment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig}
 */
public final class RecoveryConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig)
    RecoveryConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecoveryConfig.newBuilder() to construct.
  private RecoveryConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecoveryConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RecoveryConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1beta1_RecoveryConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1beta1_RecoveryConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig.class,
            com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig.Builder.class);
  }

  public static final int SCHEDULED_SNAPSHOTS_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
      scheduledSnapshotsConfig_;
  /**
   *
   *
   * <pre>
   * Optional. The configuration for scheduled snapshot creation mechanism.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the scheduledSnapshotsConfig field is set.
   */
  @java.lang.Override
  public boolean hasScheduledSnapshotsConfig() {
    return scheduledSnapshotsConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. The configuration for scheduled snapshot creation mechanism.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scheduledSnapshotsConfig.
   */
  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
      getScheduledSnapshotsConfig() {
    return scheduledSnapshotsConfig_ == null
        ? com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
            .getDefaultInstance()
        : scheduledSnapshotsConfig_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The configuration for scheduled snapshot creation mechanism.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfigOrBuilder
      getScheduledSnapshotsConfigOrBuilder() {
    return scheduledSnapshotsConfig_ == null
        ? com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
            .getDefaultInstance()
        : scheduledSnapshotsConfig_;
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
    if (scheduledSnapshotsConfig_ != null) {
      output.writeMessage(1, getScheduledSnapshotsConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scheduledSnapshotsConfig_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, getScheduledSnapshotsConfig());
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
    if (!(obj instanceof com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig other =
        (com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig) obj;

    if (hasScheduledSnapshotsConfig() != other.hasScheduledSnapshotsConfig()) return false;
    if (hasScheduledSnapshotsConfig()) {
      if (!getScheduledSnapshotsConfig().equals(other.getScheduledSnapshotsConfig())) return false;
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
    if (hasScheduledSnapshotsConfig()) {
      hash = (37 * hash) + SCHEDULED_SNAPSHOTS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getScheduledSnapshotsConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig parseFrom(
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
      com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig prototype) {
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
   * The Recovery settings of an environment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig)
      com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1beta1_RecoveryConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1beta1_RecoveryConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig.class,
              com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig.Builder.class);
    }

    // Construct using
    // com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scheduledSnapshotsConfig_ = null;
      if (scheduledSnapshotsConfigBuilder_ != null) {
        scheduledSnapshotsConfigBuilder_.dispose();
        scheduledSnapshotsConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1beta1_RecoveryConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig build() {
      com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig result =
          new com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scheduledSnapshotsConfig_ =
            scheduledSnapshotsConfigBuilder_ == null
                ? scheduledSnapshotsConfig_
                : scheduledSnapshotsConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig) {
        return mergeFrom(
            (com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig
              .getDefaultInstance()) return this;
      if (other.hasScheduledSnapshotsConfig()) {
        mergeScheduledSnapshotsConfig(other.getScheduledSnapshotsConfig());
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
                input.readMessage(
                    getScheduledSnapshotsConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
        scheduledSnapshotsConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig,
            com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig.Builder,
            com.google.cloud.orchestration.airflow.service.v1beta1
                .ScheduledSnapshotsConfigOrBuilder>
        scheduledSnapshotsConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the scheduledSnapshotsConfig field is set.
     */
    public boolean hasScheduledSnapshotsConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The scheduledSnapshotsConfig.
     */
    public com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
        getScheduledSnapshotsConfig() {
      if (scheduledSnapshotsConfigBuilder_ == null) {
        return scheduledSnapshotsConfig_ == null
            ? com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
                .getDefaultInstance()
            : scheduledSnapshotsConfig_;
      } else {
        return scheduledSnapshotsConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setScheduledSnapshotsConfig(
        com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig value) {
      if (scheduledSnapshotsConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scheduledSnapshotsConfig_ = value;
      } else {
        scheduledSnapshotsConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setScheduledSnapshotsConfig(
        com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig.Builder
            builderForValue) {
      if (scheduledSnapshotsConfigBuilder_ == null) {
        scheduledSnapshotsConfig_ = builderForValue.build();
      } else {
        scheduledSnapshotsConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeScheduledSnapshotsConfig(
        com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig value) {
      if (scheduledSnapshotsConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && scheduledSnapshotsConfig_ != null
            && scheduledSnapshotsConfig_
                != com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
                    .getDefaultInstance()) {
          getScheduledSnapshotsConfigBuilder().mergeFrom(value);
        } else {
          scheduledSnapshotsConfig_ = value;
        }
      } else {
        scheduledSnapshotsConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearScheduledSnapshotsConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scheduledSnapshotsConfig_ = null;
      if (scheduledSnapshotsConfigBuilder_ != null) {
        scheduledSnapshotsConfigBuilder_.dispose();
        scheduledSnapshotsConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig.Builder
        getScheduledSnapshotsConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScheduledSnapshotsConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfigOrBuilder
        getScheduledSnapshotsConfigOrBuilder() {
      if (scheduledSnapshotsConfigBuilder_ != null) {
        return scheduledSnapshotsConfigBuilder_.getMessageOrBuilder();
      } else {
        return scheduledSnapshotsConfig_ == null
            ? com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
                .getDefaultInstance()
            : scheduledSnapshotsConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The configuration for scheduled snapshot creation mechanism.
     * </pre>
     *
     * <code>
     * .google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig,
            com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig.Builder,
            com.google.cloud.orchestration.airflow.service.v1beta1
                .ScheduledSnapshotsConfigOrBuilder>
        getScheduledSnapshotsConfigFieldBuilder() {
      if (scheduledSnapshotsConfigBuilder_ == null) {
        scheduledSnapshotsConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig,
                com.google.cloud.orchestration.airflow.service.v1beta1.ScheduledSnapshotsConfig
                    .Builder,
                com.google.cloud.orchestration.airflow.service.v1beta1
                    .ScheduledSnapshotsConfigOrBuilder>(
                getScheduledSnapshotsConfig(), getParentForChildren(), isClean());
        scheduledSnapshotsConfig_ = null;
      }
      return scheduledSnapshotsConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig)
  private static final com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig();
  }

  public static com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecoveryConfig> PARSER =
      new com.google.protobuf.AbstractParser<RecoveryConfig>() {
        @java.lang.Override
        public RecoveryConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecoveryConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecoveryConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1beta1.RecoveryConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
