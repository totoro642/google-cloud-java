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
// source: google/cloud/gkemulticloud/v1/common_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Parameters that describe the Logging configuration in a cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.LoggingConfig}
 */
public final class LoggingConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.LoggingConfig)
    LoggingConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LoggingConfig.newBuilder() to construct.
  private LoggingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LoggingConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LoggingConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.CommonResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.CommonResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.LoggingConfig.class,
            com.google.cloud.gkemulticloud.v1.LoggingConfig.Builder.class);
  }

  public static final int COMPONENT_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.gkemulticloud.v1.LoggingComponentConfig componentConfig_;
  /**
   *
   *
   * <pre>
   * The configuration of the logging components;
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
   *
   * @return Whether the componentConfig field is set.
   */
  @java.lang.Override
  public boolean hasComponentConfig() {
    return componentConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * The configuration of the logging components;
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
   *
   * @return The componentConfig.
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.LoggingComponentConfig getComponentConfig() {
    return componentConfig_ == null
        ? com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.getDefaultInstance()
        : componentConfig_;
  }
  /**
   *
   *
   * <pre>
   * The configuration of the logging components;
   * </pre>
   *
   * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.LoggingComponentConfigOrBuilder
      getComponentConfigOrBuilder() {
    return componentConfig_ == null
        ? com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.getDefaultInstance()
        : componentConfig_;
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
    if (componentConfig_ != null) {
      output.writeMessage(1, getComponentConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (componentConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getComponentConfig());
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.LoggingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.LoggingConfig other =
        (com.google.cloud.gkemulticloud.v1.LoggingConfig) obj;

    if (hasComponentConfig() != other.hasComponentConfig()) return false;
    if (hasComponentConfig()) {
      if (!getComponentConfig().equals(other.getComponentConfig())) return false;
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
    if (hasComponentConfig()) {
      hash = (37 * hash) + COMPONENT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getComponentConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.LoggingConfig prototype) {
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
   * Parameters that describe the Logging configuration in a cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.LoggingConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.LoggingConfig)
      com.google.cloud.gkemulticloud.v1.LoggingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.CommonResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.CommonResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.LoggingConfig.class,
              com.google.cloud.gkemulticloud.v1.LoggingConfig.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.LoggingConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      componentConfig_ = null;
      if (componentConfigBuilder_ != null) {
        componentConfigBuilder_.dispose();
        componentConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.CommonResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.LoggingConfig getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.LoggingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.LoggingConfig build() {
      com.google.cloud.gkemulticloud.v1.LoggingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.LoggingConfig buildPartial() {
      com.google.cloud.gkemulticloud.v1.LoggingConfig result =
          new com.google.cloud.gkemulticloud.v1.LoggingConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.LoggingConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.componentConfig_ =
            componentConfigBuilder_ == null ? componentConfig_ : componentConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.LoggingConfig) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.LoggingConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.LoggingConfig other) {
      if (other == com.google.cloud.gkemulticloud.v1.LoggingConfig.getDefaultInstance())
        return this;
      if (other.hasComponentConfig()) {
        mergeComponentConfig(other.getComponentConfig());
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
                input.readMessage(getComponentConfigFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.gkemulticloud.v1.LoggingComponentConfig componentConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.LoggingComponentConfig,
            com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.Builder,
            com.google.cloud.gkemulticloud.v1.LoggingComponentConfigOrBuilder>
        componentConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     *
     * @return Whether the componentConfig field is set.
     */
    public boolean hasComponentConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     *
     * @return The componentConfig.
     */
    public com.google.cloud.gkemulticloud.v1.LoggingComponentConfig getComponentConfig() {
      if (componentConfigBuilder_ == null) {
        return componentConfig_ == null
            ? com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.getDefaultInstance()
            : componentConfig_;
      } else {
        return componentConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     */
    public Builder setComponentConfig(
        com.google.cloud.gkemulticloud.v1.LoggingComponentConfig value) {
      if (componentConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        componentConfig_ = value;
      } else {
        componentConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     */
    public Builder setComponentConfig(
        com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.Builder builderForValue) {
      if (componentConfigBuilder_ == null) {
        componentConfig_ = builderForValue.build();
      } else {
        componentConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     */
    public Builder mergeComponentConfig(
        com.google.cloud.gkemulticloud.v1.LoggingComponentConfig value) {
      if (componentConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && componentConfig_ != null
            && componentConfig_
                != com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.getDefaultInstance()) {
          getComponentConfigBuilder().mergeFrom(value);
        } else {
          componentConfig_ = value;
        }
      } else {
        componentConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     */
    public Builder clearComponentConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      componentConfig_ = null;
      if (componentConfigBuilder_ != null) {
        componentConfigBuilder_.dispose();
        componentConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.Builder
        getComponentConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getComponentConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     */
    public com.google.cloud.gkemulticloud.v1.LoggingComponentConfigOrBuilder
        getComponentConfigOrBuilder() {
      if (componentConfigBuilder_ != null) {
        return componentConfigBuilder_.getMessageOrBuilder();
      } else {
        return componentConfig_ == null
            ? com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.getDefaultInstance()
            : componentConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * The configuration of the logging components;
     * </pre>
     *
     * <code>.google.cloud.gkemulticloud.v1.LoggingComponentConfig component_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkemulticloud.v1.LoggingComponentConfig,
            com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.Builder,
            com.google.cloud.gkemulticloud.v1.LoggingComponentConfigOrBuilder>
        getComponentConfigFieldBuilder() {
      if (componentConfigBuilder_ == null) {
        componentConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkemulticloud.v1.LoggingComponentConfig,
                com.google.cloud.gkemulticloud.v1.LoggingComponentConfig.Builder,
                com.google.cloud.gkemulticloud.v1.LoggingComponentConfigOrBuilder>(
                getComponentConfig(), getParentForChildren(), isClean());
        componentConfig_ = null;
      }
      return componentConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.LoggingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.LoggingConfig)
  private static final com.google.cloud.gkemulticloud.v1.LoggingConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.LoggingConfig();
  }

  public static com.google.cloud.gkemulticloud.v1.LoggingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoggingConfig> PARSER =
      new com.google.protobuf.AbstractParser<LoggingConfig>() {
        @java.lang.Override
        public LoggingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoggingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoggingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.LoggingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
