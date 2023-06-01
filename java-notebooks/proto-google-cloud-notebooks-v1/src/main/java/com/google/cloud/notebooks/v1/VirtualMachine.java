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
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Runtime using Virtual Machine for computing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.VirtualMachine}
 */
public final class VirtualMachine extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.VirtualMachine)
    VirtualMachineOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VirtualMachine.newBuilder() to construct.
  private VirtualMachine(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VirtualMachine() {
    instanceName_ = "";
    instanceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VirtualMachine();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1.RuntimeProto
        .internal_static_google_cloud_notebooks_v1_VirtualMachine_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.RuntimeProto
        .internal_static_google_cloud_notebooks_v1_VirtualMachine_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.VirtualMachine.class,
            com.google.cloud.notebooks.v1.VirtualMachine.Builder.class);
  }

  public static final int INSTANCE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceName_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The user-friendly name of the Managed Compute Engine instance.
   * </pre>
   *
   * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceName.
   */
  @java.lang.Override
  public java.lang.String getInstanceName() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The user-friendly name of the Managed Compute Engine instance.
   * </pre>
   *
   * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for instanceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceNameBytes() {
    java.lang.Object ref = instanceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object instanceId_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of the Managed Compute Engine instance.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceId.
   */
  @java.lang.Override
  public java.lang.String getInstanceId() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of the Managed Compute Engine instance.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for instanceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInstanceIdBytes() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      instanceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIRTUAL_MACHINE_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.notebooks.v1.VirtualMachineConfig virtualMachineConfig_;
  /**
   *
   *
   * <pre>
   * Virtual Machine configuration settings.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
   *
   * @return Whether the virtualMachineConfig field is set.
   */
  @java.lang.Override
  public boolean hasVirtualMachineConfig() {
    return virtualMachineConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Virtual Machine configuration settings.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
   *
   * @return The virtualMachineConfig.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.VirtualMachineConfig getVirtualMachineConfig() {
    return virtualMachineConfig_ == null
        ? com.google.cloud.notebooks.v1.VirtualMachineConfig.getDefaultInstance()
        : virtualMachineConfig_;
  }
  /**
   *
   *
   * <pre>
   * Virtual Machine configuration settings.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.VirtualMachineConfigOrBuilder
      getVirtualMachineConfigOrBuilder() {
    return virtualMachineConfig_ == null
        ? com.google.cloud.notebooks.v1.VirtualMachineConfig.getDefaultInstance()
        : virtualMachineConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instanceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instanceId_);
    }
    if (virtualMachineConfig_ != null) {
      output.writeMessage(3, getVirtualMachineConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instanceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instanceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instanceId_);
    }
    if (virtualMachineConfig_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(3, getVirtualMachineConfig());
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.VirtualMachine)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.VirtualMachine other =
        (com.google.cloud.notebooks.v1.VirtualMachine) obj;

    if (!getInstanceName().equals(other.getInstanceName())) return false;
    if (!getInstanceId().equals(other.getInstanceId())) return false;
    if (hasVirtualMachineConfig() != other.hasVirtualMachineConfig()) return false;
    if (hasVirtualMachineConfig()) {
      if (!getVirtualMachineConfig().equals(other.getVirtualMachineConfig())) return false;
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
    hash = (37 * hash) + INSTANCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceName().hashCode();
    hash = (37 * hash) + INSTANCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceId().hashCode();
    if (hasVirtualMachineConfig()) {
      hash = (37 * hash) + VIRTUAL_MACHINE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getVirtualMachineConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine parseFrom(
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

  public static Builder newBuilder(com.google.cloud.notebooks.v1.VirtualMachine prototype) {
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
   * Runtime using Virtual Machine for computing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.VirtualMachine}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.VirtualMachine)
      com.google.cloud.notebooks.v1.VirtualMachineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_VirtualMachine_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_VirtualMachine_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.VirtualMachine.class,
              com.google.cloud.notebooks.v1.VirtualMachine.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.VirtualMachine.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instanceName_ = "";
      instanceId_ = "";
      virtualMachineConfig_ = null;
      if (virtualMachineConfigBuilder_ != null) {
        virtualMachineConfigBuilder_.dispose();
        virtualMachineConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_VirtualMachine_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.VirtualMachine getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.VirtualMachine.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.VirtualMachine build() {
      com.google.cloud.notebooks.v1.VirtualMachine result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.VirtualMachine buildPartial() {
      com.google.cloud.notebooks.v1.VirtualMachine result =
          new com.google.cloud.notebooks.v1.VirtualMachine(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v1.VirtualMachine result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instanceName_ = instanceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.instanceId_ = instanceId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.virtualMachineConfig_ =
            virtualMachineConfigBuilder_ == null
                ? virtualMachineConfig_
                : virtualMachineConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.notebooks.v1.VirtualMachine) {
        return mergeFrom((com.google.cloud.notebooks.v1.VirtualMachine) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.VirtualMachine other) {
      if (other == com.google.cloud.notebooks.v1.VirtualMachine.getDefaultInstance()) return this;
      if (!other.getInstanceName().isEmpty()) {
        instanceName_ = other.instanceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getInstanceId().isEmpty()) {
        instanceId_ = other.instanceId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasVirtualMachineConfig()) {
        mergeVirtualMachineConfig(other.getVirtualMachineConfig());
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
                instanceName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                instanceId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(
                    getVirtualMachineConfigFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object instanceName_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The user-friendly name of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The instanceName.
     */
    public java.lang.String getInstanceName() {
      java.lang.Object ref = instanceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The user-friendly name of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for instanceName.
     */
    public com.google.protobuf.ByteString getInstanceNameBytes() {
      java.lang.Object ref = instanceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The user-friendly name of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The instanceName to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instanceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The user-friendly name of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceName() {
      instanceName_ = getDefaultInstance().getInstanceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The user-friendly name of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for instanceName to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instanceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object instanceId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The unique identifier of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The instanceId.
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique identifier of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for instanceId.
     */
    public com.google.protobuf.ByteString getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique identifier of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instanceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique identifier of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceId() {
      instanceId_ = getDefaultInstance().getInstanceId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The unique identifier of the Managed Compute Engine instance.
     * </pre>
     *
     * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for instanceId to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instanceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.notebooks.v1.VirtualMachineConfig virtualMachineConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.VirtualMachineConfig,
            com.google.cloud.notebooks.v1.VirtualMachineConfig.Builder,
            com.google.cloud.notebooks.v1.VirtualMachineConfigOrBuilder>
        virtualMachineConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     *
     * @return Whether the virtualMachineConfig field is set.
     */
    public boolean hasVirtualMachineConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     *
     * @return The virtualMachineConfig.
     */
    public com.google.cloud.notebooks.v1.VirtualMachineConfig getVirtualMachineConfig() {
      if (virtualMachineConfigBuilder_ == null) {
        return virtualMachineConfig_ == null
            ? com.google.cloud.notebooks.v1.VirtualMachineConfig.getDefaultInstance()
            : virtualMachineConfig_;
      } else {
        return virtualMachineConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     */
    public Builder setVirtualMachineConfig(
        com.google.cloud.notebooks.v1.VirtualMachineConfig value) {
      if (virtualMachineConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        virtualMachineConfig_ = value;
      } else {
        virtualMachineConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     */
    public Builder setVirtualMachineConfig(
        com.google.cloud.notebooks.v1.VirtualMachineConfig.Builder builderForValue) {
      if (virtualMachineConfigBuilder_ == null) {
        virtualMachineConfig_ = builderForValue.build();
      } else {
        virtualMachineConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     */
    public Builder mergeVirtualMachineConfig(
        com.google.cloud.notebooks.v1.VirtualMachineConfig value) {
      if (virtualMachineConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && virtualMachineConfig_ != null
            && virtualMachineConfig_
                != com.google.cloud.notebooks.v1.VirtualMachineConfig.getDefaultInstance()) {
          getVirtualMachineConfigBuilder().mergeFrom(value);
        } else {
          virtualMachineConfig_ = value;
        }
      } else {
        virtualMachineConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     */
    public Builder clearVirtualMachineConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      virtualMachineConfig_ = null;
      if (virtualMachineConfigBuilder_ != null) {
        virtualMachineConfigBuilder_.dispose();
        virtualMachineConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     */
    public com.google.cloud.notebooks.v1.VirtualMachineConfig.Builder
        getVirtualMachineConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getVirtualMachineConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     */
    public com.google.cloud.notebooks.v1.VirtualMachineConfigOrBuilder
        getVirtualMachineConfigOrBuilder() {
      if (virtualMachineConfigBuilder_ != null) {
        return virtualMachineConfigBuilder_.getMessageOrBuilder();
      } else {
        return virtualMachineConfig_ == null
            ? com.google.cloud.notebooks.v1.VirtualMachineConfig.getDefaultInstance()
            : virtualMachineConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Virtual Machine configuration settings.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.VirtualMachineConfig,
            com.google.cloud.notebooks.v1.VirtualMachineConfig.Builder,
            com.google.cloud.notebooks.v1.VirtualMachineConfigOrBuilder>
        getVirtualMachineConfigFieldBuilder() {
      if (virtualMachineConfigBuilder_ == null) {
        virtualMachineConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.notebooks.v1.VirtualMachineConfig,
                com.google.cloud.notebooks.v1.VirtualMachineConfig.Builder,
                com.google.cloud.notebooks.v1.VirtualMachineConfigOrBuilder>(
                getVirtualMachineConfig(), getParentForChildren(), isClean());
        virtualMachineConfig_ = null;
      }
      return virtualMachineConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.VirtualMachine)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.VirtualMachine)
  private static final com.google.cloud.notebooks.v1.VirtualMachine DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.VirtualMachine();
  }

  public static com.google.cloud.notebooks.v1.VirtualMachine getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirtualMachine> PARSER =
      new com.google.protobuf.AbstractParser<VirtualMachine>() {
        @java.lang.Override
        public VirtualMachine parsePartialFrom(
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

  public static com.google.protobuf.Parser<VirtualMachine> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirtualMachine> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.VirtualMachine getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
