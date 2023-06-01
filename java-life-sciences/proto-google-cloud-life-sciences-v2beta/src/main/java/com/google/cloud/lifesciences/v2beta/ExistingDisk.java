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
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

/**
 *
 *
 * <pre>
 * Configuration for an existing disk to be attached to the VM.
 * </pre>
 *
 * Protobuf type {@code google.cloud.lifesciences.v2beta.ExistingDisk}
 */
public final class ExistingDisk extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.lifesciences.v2beta.ExistingDisk)
    ExistingDiskOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExistingDisk.newBuilder() to construct.
  private ExistingDisk(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExistingDisk() {
    disk_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExistingDisk();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto
        .internal_static_google_cloud_lifesciences_v2beta_ExistingDisk_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.lifesciences.v2beta.WorkflowsProto
        .internal_static_google_cloud_lifesciences_v2beta_ExistingDisk_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.lifesciences.v2beta.ExistingDisk.class,
            com.google.cloud.lifesciences.v2beta.ExistingDisk.Builder.class);
  }

  public static final int DISK_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object disk_ = "";
  /**
   *
   *
   * <pre>
   * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is
   * a complete URL for the disk.  If `disk` does not contain slashes, the Cloud
   * Life Sciences API assumes that the disk is a zonal disk and a URL will be
   * generated of the form `zones/&lt;zone&gt;/disks/&lt;disk&gt;`, where `&lt;zone&gt;` is the
   * zone in which the instance is allocated. The disk must be ext4 formatted.
   *
   * If all `Mount` references to this disk have the `read_only` flag set to
   * true, the disk will be attached in `read-only` mode and can be shared with
   * other instances. Otherwise, the disk will be available for writing but
   * cannot be shared.
   * </pre>
   *
   * <code>string disk = 1;</code>
   *
   * @return The disk.
   */
  @java.lang.Override
  public java.lang.String getDisk() {
    java.lang.Object ref = disk_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      disk_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is
   * a complete URL for the disk.  If `disk` does not contain slashes, the Cloud
   * Life Sciences API assumes that the disk is a zonal disk and a URL will be
   * generated of the form `zones/&lt;zone&gt;/disks/&lt;disk&gt;`, where `&lt;zone&gt;` is the
   * zone in which the instance is allocated. The disk must be ext4 formatted.
   *
   * If all `Mount` references to this disk have the `read_only` flag set to
   * true, the disk will be attached in `read-only` mode and can be shared with
   * other instances. Otherwise, the disk will be available for writing but
   * cannot be shared.
   * </pre>
   *
   * <code>string disk = 1;</code>
   *
   * @return The bytes for disk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDiskBytes() {
    java.lang.Object ref = disk_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      disk_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(disk_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, disk_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(disk_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, disk_);
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
    if (!(obj instanceof com.google.cloud.lifesciences.v2beta.ExistingDisk)) {
      return super.equals(obj);
    }
    com.google.cloud.lifesciences.v2beta.ExistingDisk other =
        (com.google.cloud.lifesciences.v2beta.ExistingDisk) obj;

    if (!getDisk().equals(other.getDisk())) return false;
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
    hash = (37 * hash) + DISK_FIELD_NUMBER;
    hash = (53 * hash) + getDisk().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk parseFrom(
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

  public static Builder newBuilder(com.google.cloud.lifesciences.v2beta.ExistingDisk prototype) {
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
   * Configuration for an existing disk to be attached to the VM.
   * </pre>
   *
   * Protobuf type {@code google.cloud.lifesciences.v2beta.ExistingDisk}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.lifesciences.v2beta.ExistingDisk)
      com.google.cloud.lifesciences.v2beta.ExistingDiskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_ExistingDisk_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_ExistingDisk_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.lifesciences.v2beta.ExistingDisk.class,
              com.google.cloud.lifesciences.v2beta.ExistingDisk.Builder.class);
    }

    // Construct using com.google.cloud.lifesciences.v2beta.ExistingDisk.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      disk_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.lifesciences.v2beta.WorkflowsProto
          .internal_static_google_cloud_lifesciences_v2beta_ExistingDisk_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ExistingDisk getDefaultInstanceForType() {
      return com.google.cloud.lifesciences.v2beta.ExistingDisk.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ExistingDisk build() {
      com.google.cloud.lifesciences.v2beta.ExistingDisk result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.lifesciences.v2beta.ExistingDisk buildPartial() {
      com.google.cloud.lifesciences.v2beta.ExistingDisk result =
          new com.google.cloud.lifesciences.v2beta.ExistingDisk(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.lifesciences.v2beta.ExistingDisk result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.disk_ = disk_;
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
      if (other instanceof com.google.cloud.lifesciences.v2beta.ExistingDisk) {
        return mergeFrom((com.google.cloud.lifesciences.v2beta.ExistingDisk) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.lifesciences.v2beta.ExistingDisk other) {
      if (other == com.google.cloud.lifesciences.v2beta.ExistingDisk.getDefaultInstance())
        return this;
      if (!other.getDisk().isEmpty()) {
        disk_ = other.disk_;
        bitField0_ |= 0x00000001;
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
                disk_ = input.readStringRequireUtf8();
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

    private java.lang.Object disk_ = "";
    /**
     *
     *
     * <pre>
     * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is
     * a complete URL for the disk.  If `disk` does not contain slashes, the Cloud
     * Life Sciences API assumes that the disk is a zonal disk and a URL will be
     * generated of the form `zones/&lt;zone&gt;/disks/&lt;disk&gt;`, where `&lt;zone&gt;` is the
     * zone in which the instance is allocated. The disk must be ext4 formatted.
     *
     * If all `Mount` references to this disk have the `read_only` flag set to
     * true, the disk will be attached in `read-only` mode and can be shared with
     * other instances. Otherwise, the disk will be available for writing but
     * cannot be shared.
     * </pre>
     *
     * <code>string disk = 1;</code>
     *
     * @return The disk.
     */
    public java.lang.String getDisk() {
      java.lang.Object ref = disk_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        disk_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is
     * a complete URL for the disk.  If `disk` does not contain slashes, the Cloud
     * Life Sciences API assumes that the disk is a zonal disk and a URL will be
     * generated of the form `zones/&lt;zone&gt;/disks/&lt;disk&gt;`, where `&lt;zone&gt;` is the
     * zone in which the instance is allocated. The disk must be ext4 formatted.
     *
     * If all `Mount` references to this disk have the `read_only` flag set to
     * true, the disk will be attached in `read-only` mode and can be shared with
     * other instances. Otherwise, the disk will be available for writing but
     * cannot be shared.
     * </pre>
     *
     * <code>string disk = 1;</code>
     *
     * @return The bytes for disk.
     */
    public com.google.protobuf.ByteString getDiskBytes() {
      java.lang.Object ref = disk_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        disk_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is
     * a complete URL for the disk.  If `disk` does not contain slashes, the Cloud
     * Life Sciences API assumes that the disk is a zonal disk and a URL will be
     * generated of the form `zones/&lt;zone&gt;/disks/&lt;disk&gt;`, where `&lt;zone&gt;` is the
     * zone in which the instance is allocated. The disk must be ext4 formatted.
     *
     * If all `Mount` references to this disk have the `read_only` flag set to
     * true, the disk will be attached in `read-only` mode and can be shared with
     * other instances. Otherwise, the disk will be available for writing but
     * cannot be shared.
     * </pre>
     *
     * <code>string disk = 1;</code>
     *
     * @param value The disk to set.
     * @return This builder for chaining.
     */
    public Builder setDisk(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      disk_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is
     * a complete URL for the disk.  If `disk` does not contain slashes, the Cloud
     * Life Sciences API assumes that the disk is a zonal disk and a URL will be
     * generated of the form `zones/&lt;zone&gt;/disks/&lt;disk&gt;`, where `&lt;zone&gt;` is the
     * zone in which the instance is allocated. The disk must be ext4 formatted.
     *
     * If all `Mount` references to this disk have the `read_only` flag set to
     * true, the disk will be attached in `read-only` mode and can be shared with
     * other instances. Otherwise, the disk will be available for writing but
     * cannot be shared.
     * </pre>
     *
     * <code>string disk = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisk() {
      disk_ = getDefaultInstance().getDisk();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is
     * a complete URL for the disk.  If `disk` does not contain slashes, the Cloud
     * Life Sciences API assumes that the disk is a zonal disk and a URL will be
     * generated of the form `zones/&lt;zone&gt;/disks/&lt;disk&gt;`, where `&lt;zone&gt;` is the
     * zone in which the instance is allocated. The disk must be ext4 formatted.
     *
     * If all `Mount` references to this disk have the `read_only` flag set to
     * true, the disk will be attached in `read-only` mode and can be shared with
     * other instances. Otherwise, the disk will be available for writing but
     * cannot be shared.
     * </pre>
     *
     * <code>string disk = 1;</code>
     *
     * @param value The bytes for disk to set.
     * @return This builder for chaining.
     */
    public Builder setDiskBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      disk_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.lifesciences.v2beta.ExistingDisk)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.lifesciences.v2beta.ExistingDisk)
  private static final com.google.cloud.lifesciences.v2beta.ExistingDisk DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.lifesciences.v2beta.ExistingDisk();
  }

  public static com.google.cloud.lifesciences.v2beta.ExistingDisk getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExistingDisk> PARSER =
      new com.google.protobuf.AbstractParser<ExistingDisk>() {
        @java.lang.Override
        public ExistingDisk parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExistingDisk> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExistingDisk> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.lifesciences.v2beta.ExistingDisk getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
