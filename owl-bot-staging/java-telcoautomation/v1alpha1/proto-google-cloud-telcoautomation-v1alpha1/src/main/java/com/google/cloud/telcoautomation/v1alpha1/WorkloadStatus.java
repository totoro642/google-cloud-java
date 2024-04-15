// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

/**
 * <pre>
 * Workload status.
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.WorkloadStatus}
 */
public final class WorkloadStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1alpha1.WorkloadStatus)
    WorkloadStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkloadStatus.newBuilder() to construct.
  private WorkloadStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkloadStatus() {
    status_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkloadStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_WorkloadStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_WorkloadStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus.class, com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus.Builder.class);
  }

  private int bitField0_;
  public static final int SITE_VERSION_FIELD_NUMBER = 1;
  private com.google.cloud.telcoautomation.v1alpha1.SiteVersion siteVersion_;
  /**
   * <pre>
   * Output only. SiteVersion running in the workload cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the siteVersion field is set.
   */
  @java.lang.Override
  public boolean hasSiteVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. SiteVersion running in the workload cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The siteVersion.
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.SiteVersion getSiteVersion() {
    return siteVersion_ == null ? com.google.cloud.telcoautomation.v1alpha1.SiteVersion.getDefaultInstance() : siteVersion_;
  }
  /**
   * <pre>
   * Output only. SiteVersion running in the workload cluster.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.SiteVersionOrBuilder getSiteVersionOrBuilder() {
    return siteVersion_ == null ? com.google.cloud.telcoautomation.v1alpha1.SiteVersion.getDefaultInstance() : siteVersion_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object status_ = "";
  /**
   * <pre>
   * Output only. Status.
   * </pre>
   *
   * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Status.
   * </pre>
   *
   * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSiteVersion());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
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
        .computeMessageSize(1, getSiteVersion());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
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
    if (!(obj instanceof com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus other = (com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus) obj;

    if (hasSiteVersion() != other.hasSiteVersion()) return false;
    if (hasSiteVersion()) {
      if (!getSiteVersion()
          .equals(other.getSiteVersion())) return false;
    }
    if (!getStatus()
        .equals(other.getStatus())) return false;
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
    if (hasSiteVersion()) {
      hash = (37 * hash) + SITE_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getSiteVersion().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus parseFrom(
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
  public static Builder newBuilder(com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus prototype) {
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
   * Workload status.
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1alpha1.WorkloadStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1alpha1.WorkloadStatus)
      com.google.cloud.telcoautomation.v1alpha1.WorkloadStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_WorkloadStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_WorkloadStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus.class, com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus.Builder.class);
    }

    // Construct using com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus.newBuilder()
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
        getSiteVersionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      siteVersion_ = null;
      if (siteVersionBuilder_ != null) {
        siteVersionBuilder_.dispose();
        siteVersionBuilder_ = null;
      }
      status_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1alpha1_WorkloadStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus build() {
      com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus buildPartial() {
      com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus result = new com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.siteVersion_ = siteVersionBuilder_ == null
            ? siteVersion_
            : siteVersionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
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
      if (other instanceof com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus) {
        return mergeFrom((com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus other) {
      if (other == com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus.getDefaultInstance()) return this;
      if (other.hasSiteVersion()) {
        mergeSiteVersion(other.getSiteVersion());
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        bitField0_ |= 0x00000002;
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
              input.readMessage(
                  getSiteVersionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              status_ = input.readStringRequireUtf8();
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

    private com.google.cloud.telcoautomation.v1alpha1.SiteVersion siteVersion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.telcoautomation.v1alpha1.SiteVersion, com.google.cloud.telcoautomation.v1alpha1.SiteVersion.Builder, com.google.cloud.telcoautomation.v1alpha1.SiteVersionOrBuilder> siteVersionBuilder_;
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the siteVersion field is set.
     */
    public boolean hasSiteVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The siteVersion.
     */
    public com.google.cloud.telcoautomation.v1alpha1.SiteVersion getSiteVersion() {
      if (siteVersionBuilder_ == null) {
        return siteVersion_ == null ? com.google.cloud.telcoautomation.v1alpha1.SiteVersion.getDefaultInstance() : siteVersion_;
      } else {
        return siteVersionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setSiteVersion(com.google.cloud.telcoautomation.v1alpha1.SiteVersion value) {
      if (siteVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        siteVersion_ = value;
      } else {
        siteVersionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setSiteVersion(
        com.google.cloud.telcoautomation.v1alpha1.SiteVersion.Builder builderForValue) {
      if (siteVersionBuilder_ == null) {
        siteVersion_ = builderForValue.build();
      } else {
        siteVersionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeSiteVersion(com.google.cloud.telcoautomation.v1alpha1.SiteVersion value) {
      if (siteVersionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          siteVersion_ != null &&
          siteVersion_ != com.google.cloud.telcoautomation.v1alpha1.SiteVersion.getDefaultInstance()) {
          getSiteVersionBuilder().mergeFrom(value);
        } else {
          siteVersion_ = value;
        }
      } else {
        siteVersionBuilder_.mergeFrom(value);
      }
      if (siteVersion_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearSiteVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      siteVersion_ = null;
      if (siteVersionBuilder_ != null) {
        siteVersionBuilder_.dispose();
        siteVersionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.SiteVersion.Builder getSiteVersionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSiteVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloud.telcoautomation.v1alpha1.SiteVersionOrBuilder getSiteVersionOrBuilder() {
      if (siteVersionBuilder_ != null) {
        return siteVersionBuilder_.getMessageOrBuilder();
      } else {
        return siteVersion_ == null ?
            com.google.cloud.telcoautomation.v1alpha1.SiteVersion.getDefaultInstance() : siteVersion_;
      }
    }
    /**
     * <pre>
     * Output only. SiteVersion running in the workload cluster.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1alpha1.SiteVersion site_version = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.telcoautomation.v1alpha1.SiteVersion, com.google.cloud.telcoautomation.v1alpha1.SiteVersion.Builder, com.google.cloud.telcoautomation.v1alpha1.SiteVersionOrBuilder> 
        getSiteVersionFieldBuilder() {
      if (siteVersionBuilder_ == null) {
        siteVersionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.telcoautomation.v1alpha1.SiteVersion, com.google.cloud.telcoautomation.v1alpha1.SiteVersion.Builder, com.google.cloud.telcoautomation.v1alpha1.SiteVersionOrBuilder>(
                getSiteVersion(),
                getParentForChildren(),
                isClean());
        siteVersion_ = null;
      }
      return siteVersionBuilder_;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     * Output only. Status.
     * </pre>
     *
     * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Status.
     * </pre>
     *
     * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Status.
     * </pre>
     *
     * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Status.
     * </pre>
     *
     * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      status_ = getDefaultInstance().getStatus();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Status.
     * </pre>
     *
     * <code>string status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      status_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1alpha1.WorkloadStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1alpha1.WorkloadStatus)
  private static final com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus();
  }

  public static com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkloadStatus>
      PARSER = new com.google.protobuf.AbstractParser<WorkloadStatus>() {
    @java.lang.Override
    public WorkloadStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkloadStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkloadStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1alpha1.WorkloadStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

