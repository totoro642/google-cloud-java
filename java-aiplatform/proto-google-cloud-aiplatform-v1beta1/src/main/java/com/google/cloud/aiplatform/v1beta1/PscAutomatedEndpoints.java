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
// source: google/cloud/aiplatform/v1beta1/service_networking.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * PscAutomatedEndpoints defines the output of the forwarding rule
 * automatically created by each PscAutomationConfig.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints}
 */
public final class PscAutomatedEndpoints extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints)
    PscAutomatedEndpointsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PscAutomatedEndpoints.newBuilder() to construct.
  private PscAutomatedEndpoints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PscAutomatedEndpoints() {
    projectId_ = "";
    network_ = "";
    matchAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PscAutomatedEndpoints();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
        .internal_static_google_cloud_aiplatform_v1beta1_PscAutomatedEndpoints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
        .internal_static_google_cloud_aiplatform_v1beta1_PscAutomatedEndpoints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints.class,
            com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   *
   *
   * <pre>
   * Corresponding project_id in pscAutomationConfigs
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Corresponding project_id in pscAutomationConfigs
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NETWORK_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object network_ = "";
  /**
   *
   *
   * <pre>
   * Corresponding network in pscAutomationConfigs.
   * </pre>
   *
   * <code>string network = 2;</code>
   *
   * @return The network.
   */
  @java.lang.Override
  public java.lang.String getNetwork() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      network_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Corresponding network in pscAutomationConfigs.
   * </pre>
   *
   * <code>string network = 2;</code>
   *
   * @return The bytes for network.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNetworkBytes() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      network_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MATCH_ADDRESS_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object matchAddress_ = "";
  /**
   *
   *
   * <pre>
   * Ip Address created by the automated forwarding rule.
   * </pre>
   *
   * <code>string match_address = 3;</code>
   *
   * @return The matchAddress.
   */
  @java.lang.Override
  public java.lang.String getMatchAddress() {
    java.lang.Object ref = matchAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      matchAddress_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Ip Address created by the automated forwarding rule.
   * </pre>
   *
   * <code>string match_address = 3;</code>
   *
   * @return The bytes for matchAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMatchAddressBytes() {
    java.lang.Object ref = matchAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      matchAddress_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, network_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(matchAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, matchAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, network_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(matchAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, matchAddress_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints other =
        (com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getNetwork().equals(other.getNetwork())) return false;
    if (!getMatchAddress().equals(other.getMatchAddress())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getNetwork().hashCode();
    hash = (37 * hash) + MATCH_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getMatchAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints prototype) {
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
   * PscAutomatedEndpoints defines the output of the forwarding rule
   * automatically created by each PscAutomationConfig.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints)
      com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpointsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
          .internal_static_google_cloud_aiplatform_v1beta1_PscAutomatedEndpoints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
          .internal_static_google_cloud_aiplatform_v1beta1_PscAutomatedEndpoints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints.class,
              com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      projectId_ = "";
      network_ = "";
      matchAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
          .internal_static_google_cloud_aiplatform_v1beta1_PscAutomatedEndpoints_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints build() {
      com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints buildPartial() {
      com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints result =
          new com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectId_ = projectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.network_ = network_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.matchAddress_ = matchAddress_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints other) {
      if (other == com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints.getDefaultInstance())
        return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNetwork().isEmpty()) {
        network_ = other.network_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMatchAddress().isEmpty()) {
        matchAddress_ = other.matchAddress_;
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
                projectId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                network_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                matchAddress_ = input.readStringRequireUtf8();
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

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * Corresponding project_id in pscAutomationConfigs
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Corresponding project_id in pscAutomationConfigs
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Corresponding project_id in pscAutomationConfigs
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Corresponding project_id in pscAutomationConfigs
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Corresponding project_id in pscAutomationConfigs
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object network_ = "";
    /**
     *
     *
     * <pre>
     * Corresponding network in pscAutomationConfigs.
     * </pre>
     *
     * <code>string network = 2;</code>
     *
     * @return The network.
     */
    public java.lang.String getNetwork() {
      java.lang.Object ref = network_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        network_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Corresponding network in pscAutomationConfigs.
     * </pre>
     *
     * <code>string network = 2;</code>
     *
     * @return The bytes for network.
     */
    public com.google.protobuf.ByteString getNetworkBytes() {
      java.lang.Object ref = network_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        network_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Corresponding network in pscAutomationConfigs.
     * </pre>
     *
     * <code>string network = 2;</code>
     *
     * @param value The network to set.
     * @return This builder for chaining.
     */
    public Builder setNetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      network_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Corresponding network in pscAutomationConfigs.
     * </pre>
     *
     * <code>string network = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNetwork() {
      network_ = getDefaultInstance().getNetwork();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Corresponding network in pscAutomationConfigs.
     * </pre>
     *
     * <code>string network = 2;</code>
     *
     * @param value The bytes for network to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      network_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object matchAddress_ = "";
    /**
     *
     *
     * <pre>
     * Ip Address created by the automated forwarding rule.
     * </pre>
     *
     * <code>string match_address = 3;</code>
     *
     * @return The matchAddress.
     */
    public java.lang.String getMatchAddress() {
      java.lang.Object ref = matchAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        matchAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Ip Address created by the automated forwarding rule.
     * </pre>
     *
     * <code>string match_address = 3;</code>
     *
     * @return The bytes for matchAddress.
     */
    public com.google.protobuf.ByteString getMatchAddressBytes() {
      java.lang.Object ref = matchAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        matchAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Ip Address created by the automated forwarding rule.
     * </pre>
     *
     * <code>string match_address = 3;</code>
     *
     * @param value The matchAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMatchAddress(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      matchAddress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ip Address created by the automated forwarding rule.
     * </pre>
     *
     * <code>string match_address = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMatchAddress() {
      matchAddress_ = getDefaultInstance().getMatchAddress();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ip Address created by the automated forwarding rule.
     * </pre>
     *
     * <code>string match_address = 3;</code>
     *
     * @param value The bytes for matchAddress to set.
     * @return This builder for chaining.
     */
    public Builder setMatchAddressBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      matchAddress_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints)
  private static final com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints();
  }

  public static com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PscAutomatedEndpoints> PARSER =
      new com.google.protobuf.AbstractParser<PscAutomatedEndpoints>() {
        @java.lang.Override
        public PscAutomatedEndpoints parsePartialFrom(
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

  public static com.google.protobuf.Parser<PscAutomatedEndpoints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PscAutomatedEndpoints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PscAutomatedEndpoints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
