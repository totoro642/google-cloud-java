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
// source: google/cloud/visionai/v1/streaming_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Request message for renewing a lease.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.RenewLeaseRequest}
 */
public final class RenewLeaseRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.RenewLeaseRequest)
    RenewLeaseRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RenewLeaseRequest.newBuilder() to construct.
  private RenewLeaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RenewLeaseRequest() {
    id_ = "";
    series_ = "";
    owner_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RenewLeaseRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.StreamingServiceProto
        .internal_static_google_cloud_visionai_v1_RenewLeaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.StreamingServiceProto
        .internal_static_google_cloud_visionai_v1_RenewLeaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.RenewLeaseRequest.class,
            com.google.cloud.visionai.v1.RenewLeaseRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   *
   *
   * <pre>
   * Lease id.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Lease id.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERIES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object series_ = "";
  /**
   *
   *
   * <pre>
   * Series name.
   * </pre>
   *
   * <code>string series = 2;</code>
   *
   * @return The series.
   */
  @java.lang.Override
  public java.lang.String getSeries() {
    java.lang.Object ref = series_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      series_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Series name.
   * </pre>
   *
   * <code>string series = 2;</code>
   *
   * @return The bytes for series.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSeriesBytes() {
    java.lang.Object ref = series_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      series_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OWNER_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object owner_ = "";
  /**
   *
   *
   * <pre>
   * Lease owner.
   * </pre>
   *
   * <code>string owner = 3;</code>
   *
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Lease owner.
   * </pre>
   *
   * <code>string owner = 3;</code>
   *
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TERM_FIELD_NUMBER = 4;
  private com.google.protobuf.Duration term_;
  /**
   *
   *
   * <pre>
   * Lease term.
   * </pre>
   *
   * <code>.google.protobuf.Duration term = 4;</code>
   *
   * @return Whether the term field is set.
   */
  @java.lang.Override
  public boolean hasTerm() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Lease term.
   * </pre>
   *
   * <code>.google.protobuf.Duration term = 4;</code>
   *
   * @return The term.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTerm() {
    return term_ == null ? com.google.protobuf.Duration.getDefaultInstance() : term_;
  }
  /**
   *
   *
   * <pre>
   * Lease term.
   * </pre>
   *
   * <code>.google.protobuf.Duration term = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTermOrBuilder() {
    return term_ == null ? com.google.protobuf.Duration.getDefaultInstance() : term_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(series_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, series_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, owner_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getTerm());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(series_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, series_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(owner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, owner_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getTerm());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.RenewLeaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.RenewLeaseRequest other =
        (com.google.cloud.visionai.v1.RenewLeaseRequest) obj;

    if (!getId().equals(other.getId())) return false;
    if (!getSeries().equals(other.getSeries())) return false;
    if (!getOwner().equals(other.getOwner())) return false;
    if (hasTerm() != other.hasTerm()) return false;
    if (hasTerm()) {
      if (!getTerm().equals(other.getTerm())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + SERIES_FIELD_NUMBER;
    hash = (53 * hash) + getSeries().hashCode();
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    if (hasTerm()) {
      hash = (37 * hash) + TERM_FIELD_NUMBER;
      hash = (53 * hash) + getTerm().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.RenewLeaseRequest prototype) {
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
   * Request message for renewing a lease.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.RenewLeaseRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.RenewLeaseRequest)
      com.google.cloud.visionai.v1.RenewLeaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_RenewLeaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_RenewLeaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.RenewLeaseRequest.class,
              com.google.cloud.visionai.v1.RenewLeaseRequest.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.RenewLeaseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTermFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      series_ = "";
      owner_ = "";
      term_ = null;
      if (termBuilder_ != null) {
        termBuilder_.dispose();
        termBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_RenewLeaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RenewLeaseRequest getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.RenewLeaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RenewLeaseRequest build() {
      com.google.cloud.visionai.v1.RenewLeaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.RenewLeaseRequest buildPartial() {
      com.google.cloud.visionai.v1.RenewLeaseRequest result =
          new com.google.cloud.visionai.v1.RenewLeaseRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.RenewLeaseRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.series_ = series_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.owner_ = owner_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.term_ = termBuilder_ == null ? term_ : termBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.RenewLeaseRequest) {
        return mergeFrom((com.google.cloud.visionai.v1.RenewLeaseRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.RenewLeaseRequest other) {
      if (other == com.google.cloud.visionai.v1.RenewLeaseRequest.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSeries().isEmpty()) {
        series_ = other.series_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasTerm()) {
        mergeTerm(other.getTerm());
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
                id_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                series_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                owner_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                input.readMessage(getTermFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object id_ = "";
    /**
     *
     *
     * <pre>
     * Lease id.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Lease id.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Lease id.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lease id.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lease id.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object series_ = "";
    /**
     *
     *
     * <pre>
     * Series name.
     * </pre>
     *
     * <code>string series = 2;</code>
     *
     * @return The series.
     */
    public java.lang.String getSeries() {
      java.lang.Object ref = series_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        series_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Series name.
     * </pre>
     *
     * <code>string series = 2;</code>
     *
     * @return The bytes for series.
     */
    public com.google.protobuf.ByteString getSeriesBytes() {
      java.lang.Object ref = series_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        series_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Series name.
     * </pre>
     *
     * <code>string series = 2;</code>
     *
     * @param value The series to set.
     * @return This builder for chaining.
     */
    public Builder setSeries(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      series_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Series name.
     * </pre>
     *
     * <code>string series = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSeries() {
      series_ = getDefaultInstance().getSeries();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Series name.
     * </pre>
     *
     * <code>string series = 2;</code>
     *
     * @param value The bytes for series to set.
     * @return This builder for chaining.
     */
    public Builder setSeriesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      series_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object owner_ = "";
    /**
     *
     *
     * <pre>
     * Lease owner.
     * </pre>
     *
     * <code>string owner = 3;</code>
     *
     * @return The owner.
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Lease owner.
     * </pre>
     *
     * <code>string owner = 3;</code>
     *
     * @return The bytes for owner.
     */
    public com.google.protobuf.ByteString getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Lease owner.
     * </pre>
     *
     * <code>string owner = 3;</code>
     *
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      owner_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lease owner.
     * </pre>
     *
     * <code>string owner = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      owner_ = getDefaultInstance().getOwner();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lease owner.
     * </pre>
     *
     * <code>string owner = 3;</code>
     *
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      owner_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration term_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        termBuilder_;
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     *
     * @return Whether the term field is set.
     */
    public boolean hasTerm() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     *
     * @return The term.
     */
    public com.google.protobuf.Duration getTerm() {
      if (termBuilder_ == null) {
        return term_ == null ? com.google.protobuf.Duration.getDefaultInstance() : term_;
      } else {
        return termBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     */
    public Builder setTerm(com.google.protobuf.Duration value) {
      if (termBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        term_ = value;
      } else {
        termBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     */
    public Builder setTerm(com.google.protobuf.Duration.Builder builderForValue) {
      if (termBuilder_ == null) {
        term_ = builderForValue.build();
      } else {
        termBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     */
    public Builder mergeTerm(com.google.protobuf.Duration value) {
      if (termBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)
            && term_ != null
            && term_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTermBuilder().mergeFrom(value);
        } else {
          term_ = value;
        }
      } else {
        termBuilder_.mergeFrom(value);
      }
      if (term_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     */
    public Builder clearTerm() {
      bitField0_ = (bitField0_ & ~0x00000008);
      term_ = null;
      if (termBuilder_ != null) {
        termBuilder_.dispose();
        termBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     */
    public com.google.protobuf.Duration.Builder getTermBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getTermFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTermOrBuilder() {
      if (termBuilder_ != null) {
        return termBuilder_.getMessageOrBuilder();
      } else {
        return term_ == null ? com.google.protobuf.Duration.getDefaultInstance() : term_;
      }
    }
    /**
     *
     *
     * <pre>
     * Lease term.
     * </pre>
     *
     * <code>.google.protobuf.Duration term = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTermFieldBuilder() {
      if (termBuilder_ == null) {
        termBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTerm(), getParentForChildren(), isClean());
        term_ = null;
      }
      return termBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.RenewLeaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.RenewLeaseRequest)
  private static final com.google.cloud.visionai.v1.RenewLeaseRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.RenewLeaseRequest();
  }

  public static com.google.cloud.visionai.v1.RenewLeaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RenewLeaseRequest> PARSER =
      new com.google.protobuf.AbstractParser<RenewLeaseRequest>() {
        @java.lang.Override
        public RenewLeaseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RenewLeaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RenewLeaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.RenewLeaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
