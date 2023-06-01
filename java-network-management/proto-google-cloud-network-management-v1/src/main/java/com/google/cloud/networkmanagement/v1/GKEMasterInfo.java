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
// source: google/cloud/networkmanagement/v1/trace.proto

package com.google.cloud.networkmanagement.v1;

/**
 *
 *
 * <pre>
 * For display only. Metadata associated with a Google Kubernetes Engine (GKE)
 * cluster master.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkmanagement.v1.GKEMasterInfo}
 */
public final class GKEMasterInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkmanagement.v1.GKEMasterInfo)
    GKEMasterInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GKEMasterInfo.newBuilder() to construct.
  private GKEMasterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GKEMasterInfo() {
    clusterUri_ = "";
    clusterNetworkUri_ = "";
    internalIp_ = "";
    externalIp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GKEMasterInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkmanagement.v1.TraceProto
        .internal_static_google_cloud_networkmanagement_v1_GKEMasterInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkmanagement.v1.TraceProto
        .internal_static_google_cloud_networkmanagement_v1_GKEMasterInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkmanagement.v1.GKEMasterInfo.class,
            com.google.cloud.networkmanagement.v1.GKEMasterInfo.Builder.class);
  }

  public static final int CLUSTER_URI_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object clusterUri_ = "";
  /**
   *
   *
   * <pre>
   * URI of a GKE cluster.
   * </pre>
   *
   * <code>string cluster_uri = 2;</code>
   *
   * @return The clusterUri.
   */
  @java.lang.Override
  public java.lang.String getClusterUri() {
    java.lang.Object ref = clusterUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URI of a GKE cluster.
   * </pre>
   *
   * <code>string cluster_uri = 2;</code>
   *
   * @return The bytes for clusterUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClusterUriBytes() {
    java.lang.Object ref = clusterUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      clusterUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_NETWORK_URI_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object clusterNetworkUri_ = "";
  /**
   *
   *
   * <pre>
   * URI of a GKE cluster network.
   * </pre>
   *
   * <code>string cluster_network_uri = 4;</code>
   *
   * @return The clusterNetworkUri.
   */
  @java.lang.Override
  public java.lang.String getClusterNetworkUri() {
    java.lang.Object ref = clusterNetworkUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterNetworkUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URI of a GKE cluster network.
   * </pre>
   *
   * <code>string cluster_network_uri = 4;</code>
   *
   * @return The bytes for clusterNetworkUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClusterNetworkUriBytes() {
    java.lang.Object ref = clusterNetworkUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      clusterNetworkUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTERNAL_IP_FIELD_NUMBER = 5;

  @SuppressWarnings("serial")
  private volatile java.lang.Object internalIp_ = "";
  /**
   *
   *
   * <pre>
   * Internal IP address of a GKE cluster master.
   * </pre>
   *
   * <code>string internal_ip = 5;</code>
   *
   * @return The internalIp.
   */
  @java.lang.Override
  public java.lang.String getInternalIp() {
    java.lang.Object ref = internalIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      internalIp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Internal IP address of a GKE cluster master.
   * </pre>
   *
   * <code>string internal_ip = 5;</code>
   *
   * @return The bytes for internalIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInternalIpBytes() {
    java.lang.Object ref = internalIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      internalIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTERNAL_IP_FIELD_NUMBER = 6;

  @SuppressWarnings("serial")
  private volatile java.lang.Object externalIp_ = "";
  /**
   *
   *
   * <pre>
   * External IP address of a GKE cluster master.
   * </pre>
   *
   * <code>string external_ip = 6;</code>
   *
   * @return The externalIp.
   */
  @java.lang.Override
  public java.lang.String getExternalIp() {
    java.lang.Object ref = externalIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalIp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * External IP address of a GKE cluster master.
   * </pre>
   *
   * <code>string external_ip = 6;</code>
   *
   * @return The bytes for externalIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExternalIpBytes() {
    java.lang.Object ref = externalIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      externalIp_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clusterUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterNetworkUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, clusterNetworkUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(internalIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, internalIp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, externalIp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clusterUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterNetworkUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, clusterNetworkUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(internalIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, internalIp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, externalIp_);
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
    if (!(obj instanceof com.google.cloud.networkmanagement.v1.GKEMasterInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.networkmanagement.v1.GKEMasterInfo other =
        (com.google.cloud.networkmanagement.v1.GKEMasterInfo) obj;

    if (!getClusterUri().equals(other.getClusterUri())) return false;
    if (!getClusterNetworkUri().equals(other.getClusterNetworkUri())) return false;
    if (!getInternalIp().equals(other.getInternalIp())) return false;
    if (!getExternalIp().equals(other.getExternalIp())) return false;
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
    hash = (37 * hash) + CLUSTER_URI_FIELD_NUMBER;
    hash = (53 * hash) + getClusterUri().hashCode();
    hash = (37 * hash) + CLUSTER_NETWORK_URI_FIELD_NUMBER;
    hash = (53 * hash) + getClusterNetworkUri().hashCode();
    hash = (37 * hash) + INTERNAL_IP_FIELD_NUMBER;
    hash = (53 * hash) + getInternalIp().hashCode();
    hash = (37 * hash) + EXTERNAL_IP_FIELD_NUMBER;
    hash = (53 * hash) + getExternalIp().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.networkmanagement.v1.GKEMasterInfo prototype) {
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
   * For display only. Metadata associated with a Google Kubernetes Engine (GKE)
   * cluster master.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkmanagement.v1.GKEMasterInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkmanagement.v1.GKEMasterInfo)
      com.google.cloud.networkmanagement.v1.GKEMasterInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkmanagement.v1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1_GKEMasterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkmanagement.v1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1_GKEMasterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkmanagement.v1.GKEMasterInfo.class,
              com.google.cloud.networkmanagement.v1.GKEMasterInfo.Builder.class);
    }

    // Construct using com.google.cloud.networkmanagement.v1.GKEMasterInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      clusterUri_ = "";
      clusterNetworkUri_ = "";
      internalIp_ = "";
      externalIp_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkmanagement.v1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1_GKEMasterInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1.GKEMasterInfo getDefaultInstanceForType() {
      return com.google.cloud.networkmanagement.v1.GKEMasterInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1.GKEMasterInfo build() {
      com.google.cloud.networkmanagement.v1.GKEMasterInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1.GKEMasterInfo buildPartial() {
      com.google.cloud.networkmanagement.v1.GKEMasterInfo result =
          new com.google.cloud.networkmanagement.v1.GKEMasterInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.networkmanagement.v1.GKEMasterInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clusterUri_ = clusterUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clusterNetworkUri_ = clusterNetworkUri_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.internalIp_ = internalIp_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.externalIp_ = externalIp_;
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
      if (other instanceof com.google.cloud.networkmanagement.v1.GKEMasterInfo) {
        return mergeFrom((com.google.cloud.networkmanagement.v1.GKEMasterInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkmanagement.v1.GKEMasterInfo other) {
      if (other == com.google.cloud.networkmanagement.v1.GKEMasterInfo.getDefaultInstance())
        return this;
      if (!other.getClusterUri().isEmpty()) {
        clusterUri_ = other.clusterUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClusterNetworkUri().isEmpty()) {
        clusterNetworkUri_ = other.clusterNetworkUri_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getInternalIp().isEmpty()) {
        internalIp_ = other.internalIp_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getExternalIp().isEmpty()) {
        externalIp_ = other.externalIp_;
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
            case 18:
              {
                clusterUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 18
            case 34:
              {
                clusterNetworkUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 34
            case 42:
              {
                internalIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 42
            case 50:
              {
                externalIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 50
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

    private java.lang.Object clusterUri_ = "";
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster.
     * </pre>
     *
     * <code>string cluster_uri = 2;</code>
     *
     * @return The clusterUri.
     */
    public java.lang.String getClusterUri() {
      java.lang.Object ref = clusterUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster.
     * </pre>
     *
     * <code>string cluster_uri = 2;</code>
     *
     * @return The bytes for clusterUri.
     */
    public com.google.protobuf.ByteString getClusterUriBytes() {
      java.lang.Object ref = clusterUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        clusterUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster.
     * </pre>
     *
     * <code>string cluster_uri = 2;</code>
     *
     * @param value The clusterUri to set.
     * @return This builder for chaining.
     */
    public Builder setClusterUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      clusterUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster.
     * </pre>
     *
     * <code>string cluster_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClusterUri() {
      clusterUri_ = getDefaultInstance().getClusterUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster.
     * </pre>
     *
     * <code>string cluster_uri = 2;</code>
     *
     * @param value The bytes for clusterUri to set.
     * @return This builder for chaining.
     */
    public Builder setClusterUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      clusterUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object clusterNetworkUri_ = "";
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster network.
     * </pre>
     *
     * <code>string cluster_network_uri = 4;</code>
     *
     * @return The clusterNetworkUri.
     */
    public java.lang.String getClusterNetworkUri() {
      java.lang.Object ref = clusterNetworkUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterNetworkUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster network.
     * </pre>
     *
     * <code>string cluster_network_uri = 4;</code>
     *
     * @return The bytes for clusterNetworkUri.
     */
    public com.google.protobuf.ByteString getClusterNetworkUriBytes() {
      java.lang.Object ref = clusterNetworkUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        clusterNetworkUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster network.
     * </pre>
     *
     * <code>string cluster_network_uri = 4;</code>
     *
     * @param value The clusterNetworkUri to set.
     * @return This builder for chaining.
     */
    public Builder setClusterNetworkUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      clusterNetworkUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster network.
     * </pre>
     *
     * <code>string cluster_network_uri = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClusterNetworkUri() {
      clusterNetworkUri_ = getDefaultInstance().getClusterNetworkUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URI of a GKE cluster network.
     * </pre>
     *
     * <code>string cluster_network_uri = 4;</code>
     *
     * @param value The bytes for clusterNetworkUri to set.
     * @return This builder for chaining.
     */
    public Builder setClusterNetworkUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      clusterNetworkUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object internalIp_ = "";
    /**
     *
     *
     * <pre>
     * Internal IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string internal_ip = 5;</code>
     *
     * @return The internalIp.
     */
    public java.lang.String getInternalIp() {
      java.lang.Object ref = internalIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        internalIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Internal IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string internal_ip = 5;</code>
     *
     * @return The bytes for internalIp.
     */
    public com.google.protobuf.ByteString getInternalIpBytes() {
      java.lang.Object ref = internalIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        internalIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Internal IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string internal_ip = 5;</code>
     *
     * @param value The internalIp to set.
     * @return This builder for chaining.
     */
    public Builder setInternalIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      internalIp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Internal IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string internal_ip = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInternalIp() {
      internalIp_ = getDefaultInstance().getInternalIp();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Internal IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string internal_ip = 5;</code>
     *
     * @param value The bytes for internalIp to set.
     * @return This builder for chaining.
     */
    public Builder setInternalIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      internalIp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object externalIp_ = "";
    /**
     *
     *
     * <pre>
     * External IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string external_ip = 6;</code>
     *
     * @return The externalIp.
     */
    public java.lang.String getExternalIp() {
      java.lang.Object ref = externalIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * External IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string external_ip = 6;</code>
     *
     * @return The bytes for externalIp.
     */
    public com.google.protobuf.ByteString getExternalIpBytes() {
      java.lang.Object ref = externalIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        externalIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * External IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string external_ip = 6;</code>
     *
     * @param value The externalIp to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      externalIp_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * External IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string external_ip = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExternalIp() {
      externalIp_ = getDefaultInstance().getExternalIp();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * External IP address of a GKE cluster master.
     * </pre>
     *
     * <code>string external_ip = 6;</code>
     *
     * @param value The bytes for externalIp to set.
     * @return This builder for chaining.
     */
    public Builder setExternalIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      externalIp_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkmanagement.v1.GKEMasterInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkmanagement.v1.GKEMasterInfo)
  private static final com.google.cloud.networkmanagement.v1.GKEMasterInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkmanagement.v1.GKEMasterInfo();
  }

  public static com.google.cloud.networkmanagement.v1.GKEMasterInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GKEMasterInfo> PARSER =
      new com.google.protobuf.AbstractParser<GKEMasterInfo>() {
        @java.lang.Override
        public GKEMasterInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<GKEMasterInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GKEMasterInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkmanagement.v1.GKEMasterInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
