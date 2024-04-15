// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.translate.v3beta1;

/**
 * <pre>
 * A translated document message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3beta1.DocumentTranslation}
 */
public final class DocumentTranslation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3beta1.DocumentTranslation)
    DocumentTranslationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocumentTranslation.newBuilder() to construct.
  private DocumentTranslation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentTranslation() {
    byteStreamOutputs_ = emptyList(com.google.protobuf.ByteString.class);
    mimeType_ = "";
    detectedLanguageCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DocumentTranslation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_DocumentTranslation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_DocumentTranslation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3beta1.DocumentTranslation.class, com.google.cloud.translate.v3beta1.DocumentTranslation.Builder.class);
  }

  public static final int BYTE_STREAM_OUTPUTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> byteStreamOutputs_ =
      emptyList(com.google.protobuf.ByteString.class);
  /**
   * <pre>
   * The array of translated documents. It is expected to be size 1 for now. We
   * may produce multiple translated documents in the future for other type of
   * file formats.
   * </pre>
   *
   * <code>repeated bytes byte_stream_outputs = 1;</code>
   * @return A list containing the byteStreamOutputs.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getByteStreamOutputsList() {
    return byteStreamOutputs_;
  }
  /**
   * <pre>
   * The array of translated documents. It is expected to be size 1 for now. We
   * may produce multiple translated documents in the future for other type of
   * file formats.
   * </pre>
   *
   * <code>repeated bytes byte_stream_outputs = 1;</code>
   * @return The count of byteStreamOutputs.
   */
  public int getByteStreamOutputsCount() {
    return byteStreamOutputs_.size();
  }
  /**
   * <pre>
   * The array of translated documents. It is expected to be size 1 for now. We
   * may produce multiple translated documents in the future for other type of
   * file formats.
   * </pre>
   *
   * <code>repeated bytes byte_stream_outputs = 1;</code>
   * @param index The index of the element to return.
   * @return The byteStreamOutputs at the given index.
   */
  public com.google.protobuf.ByteString getByteStreamOutputs(int index) {
    return byteStreamOutputs_.get(index);
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object mimeType_ = "";
  /**
   * <pre>
   * The translated document's mime type.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   * @return The mimeType.
   */
  @java.lang.Override
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The translated document's mime type.
   * </pre>
   *
   * <code>string mime_type = 2;</code>
   * @return The bytes for mimeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mimeType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DETECTED_LANGUAGE_CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object detectedLanguageCode_ = "";
  /**
   * <pre>
   * The detected language for the input document.
   * If the user did not provide the source language for the input document,
   * this field will have the language code automatically detected. If the
   * source language was passed, auto-detection of the language does not occur
   * and this field is empty.
   * </pre>
   *
   * <code>string detected_language_code = 3;</code>
   * @return The detectedLanguageCode.
   */
  @java.lang.Override
  public java.lang.String getDetectedLanguageCode() {
    java.lang.Object ref = detectedLanguageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detectedLanguageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The detected language for the input document.
   * If the user did not provide the source language for the input document,
   * this field will have the language code automatically detected. If the
   * source language was passed, auto-detection of the language does not occur
   * and this field is empty.
   * </pre>
   *
   * <code>string detected_language_code = 3;</code>
   * @return The bytes for detectedLanguageCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDetectedLanguageCodeBytes() {
    java.lang.Object ref = detectedLanguageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detectedLanguageCode_ = b;
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
    for (int i = 0; i < byteStreamOutputs_.size(); i++) {
      output.writeBytes(1, byteStreamOutputs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mimeType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(detectedLanguageCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, detectedLanguageCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < byteStreamOutputs_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(byteStreamOutputs_.get(i));
      }
      size += dataSize;
      size += 1 * getByteStreamOutputsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mimeType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(detectedLanguageCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, detectedLanguageCode_);
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
    if (!(obj instanceof com.google.cloud.translate.v3beta1.DocumentTranslation)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3beta1.DocumentTranslation other = (com.google.cloud.translate.v3beta1.DocumentTranslation) obj;

    if (!getByteStreamOutputsList()
        .equals(other.getByteStreamOutputsList())) return false;
    if (!getMimeType()
        .equals(other.getMimeType())) return false;
    if (!getDetectedLanguageCode()
        .equals(other.getDetectedLanguageCode())) return false;
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
    if (getByteStreamOutputsCount() > 0) {
      hash = (37 * hash) + BYTE_STREAM_OUTPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getByteStreamOutputsList().hashCode();
    }
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (37 * hash) + DETECTED_LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getDetectedLanguageCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3beta1.DocumentTranslation parseFrom(
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
  public static Builder newBuilder(com.google.cloud.translate.v3beta1.DocumentTranslation prototype) {
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
   * A translated document message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3beta1.DocumentTranslation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3beta1.DocumentTranslation)
      com.google.cloud.translate.v3beta1.DocumentTranslationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_DocumentTranslation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_DocumentTranslation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3beta1.DocumentTranslation.class, com.google.cloud.translate.v3beta1.DocumentTranslation.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3beta1.DocumentTranslation.newBuilder()
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
      byteStreamOutputs_ = emptyList(com.google.protobuf.ByteString.class);
      mimeType_ = "";
      detectedLanguageCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.translate.v3beta1.TranslationServiceProto.internal_static_google_cloud_translation_v3beta1_DocumentTranslation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.DocumentTranslation getDefaultInstanceForType() {
      return com.google.cloud.translate.v3beta1.DocumentTranslation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.DocumentTranslation build() {
      com.google.cloud.translate.v3beta1.DocumentTranslation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3beta1.DocumentTranslation buildPartial() {
      com.google.cloud.translate.v3beta1.DocumentTranslation result = new com.google.cloud.translate.v3beta1.DocumentTranslation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.translate.v3beta1.DocumentTranslation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        byteStreamOutputs_.makeImmutable();
        result.byteStreamOutputs_ = byteStreamOutputs_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mimeType_ = mimeType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.detectedLanguageCode_ = detectedLanguageCode_;
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
      if (other instanceof com.google.cloud.translate.v3beta1.DocumentTranslation) {
        return mergeFrom((com.google.cloud.translate.v3beta1.DocumentTranslation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3beta1.DocumentTranslation other) {
      if (other == com.google.cloud.translate.v3beta1.DocumentTranslation.getDefaultInstance()) return this;
      if (!other.byteStreamOutputs_.isEmpty()) {
        if (byteStreamOutputs_.isEmpty()) {
          byteStreamOutputs_ = other.byteStreamOutputs_;
          byteStreamOutputs_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureByteStreamOutputsIsMutable();
          byteStreamOutputs_.addAll(other.byteStreamOutputs_);
        }
        onChanged();
      }
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDetectedLanguageCode().isEmpty()) {
        detectedLanguageCode_ = other.detectedLanguageCode_;
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
            case 10: {
              com.google.protobuf.ByteString v = input.readBytes();
              ensureByteStreamOutputsIsMutable();
              byteStreamOutputs_.add(v);
              break;
            } // case 10
            case 18: {
              mimeType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              detectedLanguageCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> byteStreamOutputs_ = emptyList(com.google.protobuf.ByteString.class);
    private void ensureByteStreamOutputsIsMutable() {
      if (!byteStreamOutputs_.isModifiable()) {
        byteStreamOutputs_ = makeMutableCopy(byteStreamOutputs_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The array of translated documents. It is expected to be size 1 for now. We
     * may produce multiple translated documents in the future for other type of
     * file formats.
     * </pre>
     *
     * <code>repeated bytes byte_stream_outputs = 1;</code>
     * @return A list containing the byteStreamOutputs.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getByteStreamOutputsList() {
      byteStreamOutputs_.makeImmutable();
      return byteStreamOutputs_;
    }
    /**
     * <pre>
     * The array of translated documents. It is expected to be size 1 for now. We
     * may produce multiple translated documents in the future for other type of
     * file formats.
     * </pre>
     *
     * <code>repeated bytes byte_stream_outputs = 1;</code>
     * @return The count of byteStreamOutputs.
     */
    public int getByteStreamOutputsCount() {
      return byteStreamOutputs_.size();
    }
    /**
     * <pre>
     * The array of translated documents. It is expected to be size 1 for now. We
     * may produce multiple translated documents in the future for other type of
     * file formats.
     * </pre>
     *
     * <code>repeated bytes byte_stream_outputs = 1;</code>
     * @param index The index of the element to return.
     * @return The byteStreamOutputs at the given index.
     */
    public com.google.protobuf.ByteString getByteStreamOutputs(int index) {
      return byteStreamOutputs_.get(index);
    }
    /**
     * <pre>
     * The array of translated documents. It is expected to be size 1 for now. We
     * may produce multiple translated documents in the future for other type of
     * file formats.
     * </pre>
     *
     * <code>repeated bytes byte_stream_outputs = 1;</code>
     * @param index The index to set the value at.
     * @param value The byteStreamOutputs to set.
     * @return This builder for chaining.
     */
    public Builder setByteStreamOutputs(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureByteStreamOutputsIsMutable();
      byteStreamOutputs_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The array of translated documents. It is expected to be size 1 for now. We
     * may produce multiple translated documents in the future for other type of
     * file formats.
     * </pre>
     *
     * <code>repeated bytes byte_stream_outputs = 1;</code>
     * @param value The byteStreamOutputs to add.
     * @return This builder for chaining.
     */
    public Builder addByteStreamOutputs(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureByteStreamOutputsIsMutable();
      byteStreamOutputs_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The array of translated documents. It is expected to be size 1 for now. We
     * may produce multiple translated documents in the future for other type of
     * file formats.
     * </pre>
     *
     * <code>repeated bytes byte_stream_outputs = 1;</code>
     * @param values The byteStreamOutputs to add.
     * @return This builder for chaining.
     */
    public Builder addAllByteStreamOutputs(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureByteStreamOutputsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, byteStreamOutputs_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The array of translated documents. It is expected to be size 1 for now. We
     * may produce multiple translated documents in the future for other type of
     * file formats.
     * </pre>
     *
     * <code>repeated bytes byte_stream_outputs = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearByteStreamOutputs() {
      byteStreamOutputs_ = emptyList(com.google.protobuf.ByteString.class);
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     * <pre>
     * The translated document's mime type.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The translated document's mime type.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString
        getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The translated document's mime type.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      mimeType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The translated document's mime type.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {
      mimeType_ = getDefaultInstance().getMimeType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The translated document's mime type.
     * </pre>
     *
     * <code>string mime_type = 2;</code>
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      mimeType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object detectedLanguageCode_ = "";
    /**
     * <pre>
     * The detected language for the input document.
     * If the user did not provide the source language for the input document,
     * this field will have the language code automatically detected. If the
     * source language was passed, auto-detection of the language does not occur
     * and this field is empty.
     * </pre>
     *
     * <code>string detected_language_code = 3;</code>
     * @return The detectedLanguageCode.
     */
    public java.lang.String getDetectedLanguageCode() {
      java.lang.Object ref = detectedLanguageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detectedLanguageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The detected language for the input document.
     * If the user did not provide the source language for the input document,
     * this field will have the language code automatically detected. If the
     * source language was passed, auto-detection of the language does not occur
     * and this field is empty.
     * </pre>
     *
     * <code>string detected_language_code = 3;</code>
     * @return The bytes for detectedLanguageCode.
     */
    public com.google.protobuf.ByteString
        getDetectedLanguageCodeBytes() {
      java.lang.Object ref = detectedLanguageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detectedLanguageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The detected language for the input document.
     * If the user did not provide the source language for the input document,
     * this field will have the language code automatically detected. If the
     * source language was passed, auto-detection of the language does not occur
     * and this field is empty.
     * </pre>
     *
     * <code>string detected_language_code = 3;</code>
     * @param value The detectedLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setDetectedLanguageCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      detectedLanguageCode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The detected language for the input document.
     * If the user did not provide the source language for the input document,
     * this field will have the language code automatically detected. If the
     * source language was passed, auto-detection of the language does not occur
     * and this field is empty.
     * </pre>
     *
     * <code>string detected_language_code = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDetectedLanguageCode() {
      detectedLanguageCode_ = getDefaultInstance().getDetectedLanguageCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The detected language for the input document.
     * If the user did not provide the source language for the input document,
     * this field will have the language code automatically detected. If the
     * source language was passed, auto-detection of the language does not occur
     * and this field is empty.
     * </pre>
     *
     * <code>string detected_language_code = 3;</code>
     * @param value The bytes for detectedLanguageCode to set.
     * @return This builder for chaining.
     */
    public Builder setDetectedLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      detectedLanguageCode_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3beta1.DocumentTranslation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3beta1.DocumentTranslation)
  private static final com.google.cloud.translate.v3beta1.DocumentTranslation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3beta1.DocumentTranslation();
  }

  public static com.google.cloud.translate.v3beta1.DocumentTranslation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentTranslation>
      PARSER = new com.google.protobuf.AbstractParser<DocumentTranslation>() {
    @java.lang.Override
    public DocumentTranslation parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentTranslation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentTranslation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3beta1.DocumentTranslation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

