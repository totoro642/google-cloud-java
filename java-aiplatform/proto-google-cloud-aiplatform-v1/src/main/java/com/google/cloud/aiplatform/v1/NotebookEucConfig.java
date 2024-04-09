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
// source: google/cloud/aiplatform/v1/notebook_euc_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * The euc configuration of NotebookRuntimeTemplate.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.NotebookEucConfig}
 */
public final class NotebookEucConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.NotebookEucConfig)
    NotebookEucConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NotebookEucConfig.newBuilder() to construct.
  private NotebookEucConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NotebookEucConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NotebookEucConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.NotebookEucConfigProto
        .internal_static_google_cloud_aiplatform_v1_NotebookEucConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.NotebookEucConfigProto
        .internal_static_google_cloud_aiplatform_v1_NotebookEucConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.NotebookEucConfig.class,
            com.google.cloud.aiplatform.v1.NotebookEucConfig.Builder.class);
  }

  public static final int EUC_DISABLED_FIELD_NUMBER = 1;
  private boolean eucDisabled_ = false;
  /**
   *
   *
   * <pre>
   * Input only. Whether EUC is disabled in this NotebookRuntimeTemplate.
   * In proto3, the default value of a boolean is false. In this way, by default
   * EUC will be enabled for NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>bool euc_disabled = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The eucDisabled.
   */
  @java.lang.Override
  public boolean getEucDisabled() {
    return eucDisabled_;
  }

  public static final int BYPASS_ACTAS_CHECK_FIELD_NUMBER = 2;
  private boolean bypassActasCheck_ = false;
  /**
   *
   *
   * <pre>
   * Output only. Whether ActAs check is bypassed for service account attached
   * to the VM. If false, we need ActAs check for the default Compute Engine
   * Service account. When a Runtime is created, a VM is allocated using Default
   * Compute Engine Service Account. Any user requesting to use this Runtime
   * requires Service Account User (ActAs) permission over this SA. If true,
   * Runtime owner is using EUC and does not require the above permission as VM
   * no longer use default Compute Engine SA, but a P4SA.
   * </pre>
   *
   * <code>bool bypass_actas_check = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bypassActasCheck.
   */
  @java.lang.Override
  public boolean getBypassActasCheck() {
    return bypassActasCheck_;
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
    if (eucDisabled_ != false) {
      output.writeBool(1, eucDisabled_);
    }
    if (bypassActasCheck_ != false) {
      output.writeBool(2, bypassActasCheck_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eucDisabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, eucDisabled_);
    }
    if (bypassActasCheck_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, bypassActasCheck_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.NotebookEucConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.NotebookEucConfig other =
        (com.google.cloud.aiplatform.v1.NotebookEucConfig) obj;

    if (getEucDisabled() != other.getEucDisabled()) return false;
    if (getBypassActasCheck() != other.getBypassActasCheck()) return false;
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
    hash = (37 * hash) + EUC_DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEucDisabled());
    hash = (37 * hash) + BYPASS_ACTAS_CHECK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getBypassActasCheck());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.NotebookEucConfig prototype) {
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
   * The euc configuration of NotebookRuntimeTemplate.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.NotebookEucConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.NotebookEucConfig)
      com.google.cloud.aiplatform.v1.NotebookEucConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.NotebookEucConfigProto
          .internal_static_google_cloud_aiplatform_v1_NotebookEucConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.NotebookEucConfigProto
          .internal_static_google_cloud_aiplatform_v1_NotebookEucConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.NotebookEucConfig.class,
              com.google.cloud.aiplatform.v1.NotebookEucConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.NotebookEucConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      eucDisabled_ = false;
      bypassActasCheck_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.NotebookEucConfigProto
          .internal_static_google_cloud_aiplatform_v1_NotebookEucConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.NotebookEucConfig getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.NotebookEucConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.NotebookEucConfig build() {
      com.google.cloud.aiplatform.v1.NotebookEucConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.NotebookEucConfig buildPartial() {
      com.google.cloud.aiplatform.v1.NotebookEucConfig result =
          new com.google.cloud.aiplatform.v1.NotebookEucConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.NotebookEucConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eucDisabled_ = eucDisabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bypassActasCheck_ = bypassActasCheck_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.NotebookEucConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1.NotebookEucConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.NotebookEucConfig other) {
      if (other == com.google.cloud.aiplatform.v1.NotebookEucConfig.getDefaultInstance())
        return this;
      if (other.getEucDisabled() != false) {
        setEucDisabled(other.getEucDisabled());
      }
      if (other.getBypassActasCheck() != false) {
        setBypassActasCheck(other.getBypassActasCheck());
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
            case 8:
              {
                eucDisabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                bypassActasCheck_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private boolean eucDisabled_;
    /**
     *
     *
     * <pre>
     * Input only. Whether EUC is disabled in this NotebookRuntimeTemplate.
     * In proto3, the default value of a boolean is false. In this way, by default
     * EUC will be enabled for NotebookRuntimeTemplate.
     * </pre>
     *
     * <code>bool euc_disabled = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return The eucDisabled.
     */
    @java.lang.Override
    public boolean getEucDisabled() {
      return eucDisabled_;
    }
    /**
     *
     *
     * <pre>
     * Input only. Whether EUC is disabled in this NotebookRuntimeTemplate.
     * In proto3, the default value of a boolean is false. In this way, by default
     * EUC will be enabled for NotebookRuntimeTemplate.
     * </pre>
     *
     * <code>bool euc_disabled = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @param value The eucDisabled to set.
     * @return This builder for chaining.
     */
    public Builder setEucDisabled(boolean value) {

      eucDisabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Whether EUC is disabled in this NotebookRuntimeTemplate.
     * In proto3, the default value of a boolean is false. In this way, by default
     * EUC will be enabled for NotebookRuntimeTemplate.
     * </pre>
     *
     * <code>bool euc_disabled = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEucDisabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      eucDisabled_ = false;
      onChanged();
      return this;
    }

    private boolean bypassActasCheck_;
    /**
     *
     *
     * <pre>
     * Output only. Whether ActAs check is bypassed for service account attached
     * to the VM. If false, we need ActAs check for the default Compute Engine
     * Service account. When a Runtime is created, a VM is allocated using Default
     * Compute Engine Service Account. Any user requesting to use this Runtime
     * requires Service Account User (ActAs) permission over this SA. If true,
     * Runtime owner is using EUC and does not require the above permission as VM
     * no longer use default Compute Engine SA, but a P4SA.
     * </pre>
     *
     * <code>bool bypass_actas_check = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bypassActasCheck.
     */
    @java.lang.Override
    public boolean getBypassActasCheck() {
      return bypassActasCheck_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Whether ActAs check is bypassed for service account attached
     * to the VM. If false, we need ActAs check for the default Compute Engine
     * Service account. When a Runtime is created, a VM is allocated using Default
     * Compute Engine Service Account. Any user requesting to use this Runtime
     * requires Service Account User (ActAs) permission over this SA. If true,
     * Runtime owner is using EUC and does not require the above permission as VM
     * no longer use default Compute Engine SA, but a P4SA.
     * </pre>
     *
     * <code>bool bypass_actas_check = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bypassActasCheck to set.
     * @return This builder for chaining.
     */
    public Builder setBypassActasCheck(boolean value) {

      bypassActasCheck_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Whether ActAs check is bypassed for service account attached
     * to the VM. If false, we need ActAs check for the default Compute Engine
     * Service account. When a Runtime is created, a VM is allocated using Default
     * Compute Engine Service Account. Any user requesting to use this Runtime
     * requires Service Account User (ActAs) permission over this SA. If true,
     * Runtime owner is using EUC and does not require the above permission as VM
     * no longer use default Compute Engine SA, but a P4SA.
     * </pre>
     *
     * <code>bool bypass_actas_check = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBypassActasCheck() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bypassActasCheck_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.NotebookEucConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.NotebookEucConfig)
  private static final com.google.cloud.aiplatform.v1.NotebookEucConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.NotebookEucConfig();
  }

  public static com.google.cloud.aiplatform.v1.NotebookEucConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotebookEucConfig> PARSER =
      new com.google.protobuf.AbstractParser<NotebookEucConfig>() {
        @java.lang.Override
        public NotebookEucConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<NotebookEucConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotebookEucConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.NotebookEucConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
