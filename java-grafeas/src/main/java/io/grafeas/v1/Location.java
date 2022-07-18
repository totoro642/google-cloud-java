/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/package.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * An occurrence of a particular package installation found within a system's
 * filesystem. E.g., glibc was found in `/var/lib/dpkg/status`.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.Location}
 */
public final class Location extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.Location)
    LocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Location.newBuilder() to construct.
  private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Location() {
    cpeUri_ = "";
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Location();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Location(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              cpeUri_ = s;
              break;
            }
          case 18:
            {
              io.grafeas.v1.Version.Builder subBuilder = null;
              if (version_ != null) {
                subBuilder = version_.toBuilder();
              }
              version_ = input.readMessage(io.grafeas.v1.Version.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(version_);
                version_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              path_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Package.internal_static_grafeas_v1_Location_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Package.internal_static_grafeas_v1_Location_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.Location.class, io.grafeas.v1.Location.Builder.class);
  }

  public static final int CPE_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object cpeUri_;
  /**
   *
   *
   * <pre>
   * Deprecated.
   * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   *
   * @return The cpeUri.
   */
  @java.lang.Override
  public java.lang.String getCpeUri() {
    java.lang.Object ref = cpeUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cpeUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Deprecated.
   * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
   * </pre>
   *
   * <code>string cpe_uri = 1;</code>
   *
   * @return The bytes for cpeUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCpeUriBytes() {
    java.lang.Object ref = cpeUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cpeUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private io.grafeas.v1.Version version_;
  /**
   *
   *
   * <pre>
   * Deprecated.
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 2;</code>
   *
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return version_ != null;
  }
  /**
   *
   *
   * <pre>
   * Deprecated.
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 2;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public io.grafeas.v1.Version getVersion() {
    return version_ == null ? io.grafeas.v1.Version.getDefaultInstance() : version_;
  }
  /**
   *
   *
   * <pre>
   * Deprecated.
   * The version installed at this location.
   * </pre>
   *
   * <code>.grafeas.v1.Version version = 2;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.VersionOrBuilder getVersionOrBuilder() {
    return getVersion();
  }

  public static final int PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object path_;
  /**
   *
   *
   * <pre>
   * The path from which we gathered that this package/version is installed.
   * </pre>
   *
   * <code>string path = 3;</code>
   *
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The path from which we gathered that this package/version is installed.
   * </pre>
   *
   * <code>string path = 3;</code>
   *
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      path_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpeUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cpeUri_);
    }
    if (version_ != null) {
      output.writeMessage(2, getVersion());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, path_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cpeUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cpeUri_);
    }
    if (version_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getVersion());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, path_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.grafeas.v1.Location)) {
      return super.equals(obj);
    }
    io.grafeas.v1.Location other = (io.grafeas.v1.Location) obj;

    if (!getCpeUri().equals(other.getCpeUri())) return false;
    if (hasVersion() != other.hasVersion()) return false;
    if (hasVersion()) {
      if (!getVersion().equals(other.getVersion())) return false;
    }
    if (!getPath().equals(other.getPath())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CPE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getCpeUri().hashCode();
    if (hasVersion()) {
      hash = (37 * hash) + VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getVersion().hashCode();
    }
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.Location parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Location parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Location parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Location parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Location parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Location parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Location parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Location parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Location parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Location parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Location parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Location parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.Location prototype) {
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
   * An occurrence of a particular package installation found within a system's
   * filesystem. E.g., glibc was found in `/var/lib/dpkg/status`.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.Location}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.Location)
      io.grafeas.v1.LocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_Location_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_Location_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.Location.class, io.grafeas.v1.Location.Builder.class);
    }

    // Construct using io.grafeas.v1.Location.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      cpeUri_ = "";

      if (versionBuilder_ == null) {
        version_ = null;
      } else {
        version_ = null;
        versionBuilder_ = null;
      }
      path_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_Location_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.Location getDefaultInstanceForType() {
      return io.grafeas.v1.Location.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.Location build() {
      io.grafeas.v1.Location result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.Location buildPartial() {
      io.grafeas.v1.Location result = new io.grafeas.v1.Location(this);
      result.cpeUri_ = cpeUri_;
      if (versionBuilder_ == null) {
        result.version_ = version_;
      } else {
        result.version_ = versionBuilder_.build();
      }
      result.path_ = path_;
      onBuilt();
      return result;
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
      if (other instanceof io.grafeas.v1.Location) {
        return mergeFrom((io.grafeas.v1.Location) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.Location other) {
      if (other == io.grafeas.v1.Location.getDefaultInstance()) return this;
      if (!other.getCpeUri().isEmpty()) {
        cpeUri_ = other.cpeUri_;
        onChanged();
      }
      if (other.hasVersion()) {
        mergeVersion(other.getVersion());
      }
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.grafeas.v1.Location parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1.Location) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object cpeUri_ = "";
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @return The cpeUri.
     */
    public java.lang.String getCpeUri() {
      java.lang.Object ref = cpeUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cpeUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @return The bytes for cpeUri.
     */
    public com.google.protobuf.ByteString getCpeUriBytes() {
      java.lang.Object ref = cpeUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cpeUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @param value The cpeUri to set.
     * @return This builder for chaining.
     */
    public Builder setCpeUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      cpeUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpeUri() {

      cpeUri_ = getDefaultInstance().getCpeUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The CPE URI in [CPE format](https://cpe.mitre.org/specification/)
     * </pre>
     *
     * <code>string cpe_uri = 1;</code>
     *
     * @param value The bytes for cpeUri to set.
     * @return This builder for chaining.
     */
    public Builder setCpeUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      cpeUri_ = value;
      onChanged();
      return this;
    }

    private io.grafeas.v1.Version version_;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.Version, io.grafeas.v1.Version.Builder, io.grafeas.v1.VersionOrBuilder>
        versionBuilder_;
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     *
     * @return Whether the version field is set.
     */
    public boolean hasVersion() {
      return versionBuilder_ != null || version_ != null;
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     *
     * @return The version.
     */
    public io.grafeas.v1.Version getVersion() {
      if (versionBuilder_ == null) {
        return version_ == null ? io.grafeas.v1.Version.getDefaultInstance() : version_;
      } else {
        return versionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     */
    public Builder setVersion(io.grafeas.v1.Version value) {
      if (versionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        version_ = value;
        onChanged();
      } else {
        versionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     */
    public Builder setVersion(io.grafeas.v1.Version.Builder builderForValue) {
      if (versionBuilder_ == null) {
        version_ = builderForValue.build();
        onChanged();
      } else {
        versionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     */
    public Builder mergeVersion(io.grafeas.v1.Version value) {
      if (versionBuilder_ == null) {
        if (version_ != null) {
          version_ = io.grafeas.v1.Version.newBuilder(version_).mergeFrom(value).buildPartial();
        } else {
          version_ = value;
        }
        onChanged();
      } else {
        versionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     */
    public Builder clearVersion() {
      if (versionBuilder_ == null) {
        version_ = null;
        onChanged();
      } else {
        version_ = null;
        versionBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     */
    public io.grafeas.v1.Version.Builder getVersionBuilder() {

      onChanged();
      return getVersionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     */
    public io.grafeas.v1.VersionOrBuilder getVersionOrBuilder() {
      if (versionBuilder_ != null) {
        return versionBuilder_.getMessageOrBuilder();
      } else {
        return version_ == null ? io.grafeas.v1.Version.getDefaultInstance() : version_;
      }
    }
    /**
     *
     *
     * <pre>
     * Deprecated.
     * The version installed at this location.
     * </pre>
     *
     * <code>.grafeas.v1.Version version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.Version, io.grafeas.v1.Version.Builder, io.grafeas.v1.VersionOrBuilder>
        getVersionFieldBuilder() {
      if (versionBuilder_ == null) {
        versionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1.Version,
                io.grafeas.v1.Version.Builder,
                io.grafeas.v1.VersionOrBuilder>(getVersion(), getParentForChildren(), isClean());
        version_ = null;
      }
      return versionBuilder_;
    }

    private java.lang.Object path_ = "";
    /**
     *
     *
     * <pre>
     * The path from which we gathered that this package/version is installed.
     * </pre>
     *
     * <code>string path = 3;</code>
     *
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The path from which we gathered that this package/version is installed.
     * </pre>
     *
     * <code>string path = 3;</code>
     *
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The path from which we gathered that this package/version is installed.
     * </pre>
     *
     * <code>string path = 3;</code>
     *
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      path_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path from which we gathered that this package/version is installed.
     * </pre>
     *
     * <code>string path = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPath() {

      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path from which we gathered that this package/version is installed.
     * </pre>
     *
     * <code>string path = 3;</code>
     *
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      path_ = value;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.Location)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.Location)
  private static final io.grafeas.v1.Location DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.Location();
  }

  public static io.grafeas.v1.Location getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Location> PARSER =
      new com.google.protobuf.AbstractParser<Location>() {
        @java.lang.Override
        public Location parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Location(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Location> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Location> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.Location getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
