// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/stitcher/v1/sessions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.stitcher.v1;

/**
 * <pre>
 * Filters for a video or muxed redition.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.RenditionFilter}
 */
public final class RenditionFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.RenditionFilter)
    RenditionFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RenditionFilter.newBuilder() to construct.
  private RenditionFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RenditionFilter() {
    codecs_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RenditionFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_RenditionFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_RenditionFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.RenditionFilter.class, com.google.cloud.video.stitcher.v1.RenditionFilter.Builder.class);
  }

  public static final int BITRATE_BPS_FIELD_NUMBER = 1;
  private int bitrateBps_ = 0;
  /**
   * <pre>
   * Bitrate in bits per second for the rendition. If set, only renditions with
   * the exact bitrate will match.
   * </pre>
   *
   * <code>int32 bitrate_bps = 1;</code>
   * @return The bitrateBps.
   */
  @java.lang.Override
  public int getBitrateBps() {
    return bitrateBps_;
  }

  public static final int CODECS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object codecs_ = "";
  /**
   * <pre>
   * Codecs for the rendition. If set, only renditions with the exact value
   * will match.
   * </pre>
   *
   * <code>string codecs = 2;</code>
   * @return The codecs.
   */
  @java.lang.Override
  public java.lang.String getCodecs() {
    java.lang.Object ref = codecs_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codecs_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Codecs for the rendition. If set, only renditions with the exact value
   * will match.
   * </pre>
   *
   * <code>string codecs = 2;</code>
   * @return The bytes for codecs.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodecsBytes() {
    java.lang.Object ref = codecs_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codecs_ = b;
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
    if (bitrateBps_ != 0) {
      output.writeInt32(1, bitrateBps_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codecs_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, codecs_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bitrateBps_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bitrateBps_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codecs_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, codecs_);
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.RenditionFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.RenditionFilter other = (com.google.cloud.video.stitcher.v1.RenditionFilter) obj;

    if (getBitrateBps()
        != other.getBitrateBps()) return false;
    if (!getCodecs()
        .equals(other.getCodecs())) return false;
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
    hash = (37 * hash) + BITRATE_BPS_FIELD_NUMBER;
    hash = (53 * hash) + getBitrateBps();
    hash = (37 * hash) + CODECS_FIELD_NUMBER;
    hash = (53 * hash) + getCodecs().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.video.stitcher.v1.RenditionFilter parseFrom(
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
  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.RenditionFilter prototype) {
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
   * Filters for a video or muxed redition.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.RenditionFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.RenditionFilter)
      com.google.cloud.video.stitcher.v1.RenditionFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_RenditionFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_RenditionFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.RenditionFilter.class, com.google.cloud.video.stitcher.v1.RenditionFilter.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.RenditionFilter.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      bitrateBps_ = 0;
      codecs_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.SessionsProto.internal_static_google_cloud_video_stitcher_v1_RenditionFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.RenditionFilter getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.RenditionFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.RenditionFilter build() {
      com.google.cloud.video.stitcher.v1.RenditionFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.RenditionFilter buildPartial() {
      com.google.cloud.video.stitcher.v1.RenditionFilter result = new com.google.cloud.video.stitcher.v1.RenditionFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.stitcher.v1.RenditionFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bitrateBps_ = bitrateBps_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.codecs_ = codecs_;
      }
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
      if (other instanceof com.google.cloud.video.stitcher.v1.RenditionFilter) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.RenditionFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.RenditionFilter other) {
      if (other == com.google.cloud.video.stitcher.v1.RenditionFilter.getDefaultInstance()) return this;
      if (other.getBitrateBps() != 0) {
        setBitrateBps(other.getBitrateBps());
      }
      if (!other.getCodecs().isEmpty()) {
        codecs_ = other.codecs_;
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
            case 8: {
              bitrateBps_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              codecs_ = input.readStringRequireUtf8();
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

    private int bitrateBps_ ;
    /**
     * <pre>
     * Bitrate in bits per second for the rendition. If set, only renditions with
     * the exact bitrate will match.
     * </pre>
     *
     * <code>int32 bitrate_bps = 1;</code>
     * @return The bitrateBps.
     */
    @java.lang.Override
    public int getBitrateBps() {
      return bitrateBps_;
    }
    /**
     * <pre>
     * Bitrate in bits per second for the rendition. If set, only renditions with
     * the exact bitrate will match.
     * </pre>
     *
     * <code>int32 bitrate_bps = 1;</code>
     * @param value The bitrateBps to set.
     * @return This builder for chaining.
     */
    public Builder setBitrateBps(int value) {

      bitrateBps_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bitrate in bits per second for the rendition. If set, only renditions with
     * the exact bitrate will match.
     * </pre>
     *
     * <code>int32 bitrate_bps = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBitrateBps() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bitrateBps_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object codecs_ = "";
    /**
     * <pre>
     * Codecs for the rendition. If set, only renditions with the exact value
     * will match.
     * </pre>
     *
     * <code>string codecs = 2;</code>
     * @return The codecs.
     */
    public java.lang.String getCodecs() {
      java.lang.Object ref = codecs_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codecs_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Codecs for the rendition. If set, only renditions with the exact value
     * will match.
     * </pre>
     *
     * <code>string codecs = 2;</code>
     * @return The bytes for codecs.
     */
    public com.google.protobuf.ByteString
        getCodecsBytes() {
      java.lang.Object ref = codecs_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codecs_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Codecs for the rendition. If set, only renditions with the exact value
     * will match.
     * </pre>
     *
     * <code>string codecs = 2;</code>
     * @param value The codecs to set.
     * @return This builder for chaining.
     */
    public Builder setCodecs(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      codecs_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Codecs for the rendition. If set, only renditions with the exact value
     * will match.
     * </pre>
     *
     * <code>string codecs = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodecs() {
      codecs_ = getDefaultInstance().getCodecs();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Codecs for the rendition. If set, only renditions with the exact value
     * will match.
     * </pre>
     *
     * <code>string codecs = 2;</code>
     * @param value The bytes for codecs to set.
     * @return This builder for chaining.
     */
    public Builder setCodecsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      codecs_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.RenditionFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.RenditionFilter)
  private static final com.google.cloud.video.stitcher.v1.RenditionFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.RenditionFilter();
  }

  public static com.google.cloud.video.stitcher.v1.RenditionFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RenditionFilter>
      PARSER = new com.google.protobuf.AbstractParser<RenditionFilter>() {
    @java.lang.Override
    public RenditionFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<RenditionFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RenditionFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.RenditionFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

