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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * AdditionalPodRangesConfig is the configuration for additional pod secondary
 * ranges supporting the ClusterUpdate message.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.AdditionalPodRangesConfig}
 */
public final class AdditionalPodRangesConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.AdditionalPodRangesConfig)
    AdditionalPodRangesConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AdditionalPodRangesConfig.newBuilder() to construct.
  private AdditionalPodRangesConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AdditionalPodRangesConfig() {
    podRangeNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AdditionalPodRangesConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AdditionalPodRangesConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AdditionalPodRangesConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.AdditionalPodRangesConfig.class,
            com.google.container.v1.AdditionalPodRangesConfig.Builder.class);
  }

  public static final int POD_RANGE_NAMES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList podRangeNames_;
  /**
   *
   *
   * <pre>
   * Name for pod secondary ipv4 range which has the actual range defined ahead.
   * </pre>
   *
   * <code>repeated string pod_range_names = 1;</code>
   *
   * @return A list containing the podRangeNames.
   */
  public com.google.protobuf.ProtocolStringList getPodRangeNamesList() {
    return podRangeNames_;
  }
  /**
   *
   *
   * <pre>
   * Name for pod secondary ipv4 range which has the actual range defined ahead.
   * </pre>
   *
   * <code>repeated string pod_range_names = 1;</code>
   *
   * @return The count of podRangeNames.
   */
  public int getPodRangeNamesCount() {
    return podRangeNames_.size();
  }
  /**
   *
   *
   * <pre>
   * Name for pod secondary ipv4 range which has the actual range defined ahead.
   * </pre>
   *
   * <code>repeated string pod_range_names = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The podRangeNames at the given index.
   */
  public java.lang.String getPodRangeNames(int index) {
    return podRangeNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Name for pod secondary ipv4 range which has the actual range defined ahead.
   * </pre>
   *
   * <code>repeated string pod_range_names = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the podRangeNames at the given index.
   */
  public com.google.protobuf.ByteString getPodRangeNamesBytes(int index) {
    return podRangeNames_.getByteString(index);
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
    for (int i = 0; i < podRangeNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, podRangeNames_.getRaw(i));
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
      for (int i = 0; i < podRangeNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(podRangeNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPodRangeNamesList().size();
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
    if (!(obj instanceof com.google.container.v1.AdditionalPodRangesConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.AdditionalPodRangesConfig other =
        (com.google.container.v1.AdditionalPodRangesConfig) obj;

    if (!getPodRangeNamesList().equals(other.getPodRangeNamesList())) return false;
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
    if (getPodRangeNamesCount() > 0) {
      hash = (37 * hash) + POD_RANGE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getPodRangeNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AdditionalPodRangesConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.AdditionalPodRangesConfig prototype) {
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
   * AdditionalPodRangesConfig is the configuration for additional pod secondary
   * ranges supporting the ClusterUpdate message.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.AdditionalPodRangesConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.AdditionalPodRangesConfig)
      com.google.container.v1.AdditionalPodRangesConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AdditionalPodRangesConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AdditionalPodRangesConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.AdditionalPodRangesConfig.class,
              com.google.container.v1.AdditionalPodRangesConfig.Builder.class);
    }

    // Construct using com.google.container.v1.AdditionalPodRangesConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      podRangeNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AdditionalPodRangesConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.AdditionalPodRangesConfig getDefaultInstanceForType() {
      return com.google.container.v1.AdditionalPodRangesConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.AdditionalPodRangesConfig build() {
      com.google.container.v1.AdditionalPodRangesConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.AdditionalPodRangesConfig buildPartial() {
      com.google.container.v1.AdditionalPodRangesConfig result =
          new com.google.container.v1.AdditionalPodRangesConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.container.v1.AdditionalPodRangesConfig result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        podRangeNames_ = podRangeNames_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.podRangeNames_ = podRangeNames_;
    }

    private void buildPartial0(com.google.container.v1.AdditionalPodRangesConfig result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.container.v1.AdditionalPodRangesConfig) {
        return mergeFrom((com.google.container.v1.AdditionalPodRangesConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.AdditionalPodRangesConfig other) {
      if (other == com.google.container.v1.AdditionalPodRangesConfig.getDefaultInstance())
        return this;
      if (!other.podRangeNames_.isEmpty()) {
        if (podRangeNames_.isEmpty()) {
          podRangeNames_ = other.podRangeNames_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePodRangeNamesIsMutable();
          podRangeNames_.addAll(other.podRangeNames_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensurePodRangeNamesIsMutable();
                podRangeNames_.add(s);
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

    private com.google.protobuf.LazyStringList podRangeNames_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensurePodRangeNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        podRangeNames_ = new com.google.protobuf.LazyStringArrayList(podRangeNames_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @return A list containing the podRangeNames.
     */
    public com.google.protobuf.ProtocolStringList getPodRangeNamesList() {
      return podRangeNames_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @return The count of podRangeNames.
     */
    public int getPodRangeNamesCount() {
      return podRangeNames_.size();
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The podRangeNames at the given index.
     */
    public java.lang.String getPodRangeNames(int index) {
      return podRangeNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the podRangeNames at the given index.
     */
    public com.google.protobuf.ByteString getPodRangeNamesBytes(int index) {
      return podRangeNames_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The podRangeNames to set.
     * @return This builder for chaining.
     */
    public Builder setPodRangeNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePodRangeNamesIsMutable();
      podRangeNames_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @param value The podRangeNames to add.
     * @return This builder for chaining.
     */
    public Builder addPodRangeNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePodRangeNamesIsMutable();
      podRangeNames_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @param values The podRangeNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllPodRangeNames(java.lang.Iterable<java.lang.String> values) {
      ensurePodRangeNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, podRangeNames_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPodRangeNames() {
      podRangeNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name for pod secondary ipv4 range which has the actual range defined ahead.
     * </pre>
     *
     * <code>repeated string pod_range_names = 1;</code>
     *
     * @param value The bytes of the podRangeNames to add.
     * @return This builder for chaining.
     */
    public Builder addPodRangeNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePodRangeNamesIsMutable();
      podRangeNames_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.AdditionalPodRangesConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.AdditionalPodRangesConfig)
  private static final com.google.container.v1.AdditionalPodRangesConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.AdditionalPodRangesConfig();
  }

  public static com.google.container.v1.AdditionalPodRangesConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdditionalPodRangesConfig> PARSER =
      new com.google.protobuf.AbstractParser<AdditionalPodRangesConfig>() {
        @java.lang.Override
        public AdditionalPodRangesConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdditionalPodRangesConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdditionalPodRangesConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.AdditionalPodRangesConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
