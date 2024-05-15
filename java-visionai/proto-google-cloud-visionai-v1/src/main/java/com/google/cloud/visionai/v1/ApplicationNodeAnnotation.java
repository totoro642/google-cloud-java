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
// source: google/cloud/visionai/v1/platform.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Message describing annotations specific to application node.
 * This message is a duplication of StreamWithAnnotation.NodeAnnotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.ApplicationNodeAnnotation}
 */
public final class ApplicationNodeAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.ApplicationNodeAnnotation)
    ApplicationNodeAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApplicationNodeAnnotation.newBuilder() to construct.
  private ApplicationNodeAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApplicationNodeAnnotation() {
    node_ = "";
    annotations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ApplicationNodeAnnotation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.PlatformProto
        .internal_static_google_cloud_visionai_v1_ApplicationNodeAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.PlatformProto
        .internal_static_google_cloud_visionai_v1_ApplicationNodeAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.ApplicationNodeAnnotation.class,
            com.google.cloud.visionai.v1.ApplicationNodeAnnotation.Builder.class);
  }

  public static final int NODE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object node_ = "";
  /**
   *
   *
   * <pre>
   * The node name of the application graph.
   * </pre>
   *
   * <code>string node = 1;</code>
   *
   * @return The node.
   */
  @java.lang.Override
  public java.lang.String getNode() {
    java.lang.Object ref = node_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      node_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The node name of the application graph.
   * </pre>
   *
   * <code>string node = 1;</code>
   *
   * @return The bytes for node.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNodeBytes() {
    java.lang.Object ref = node_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      node_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANNOTATIONS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.visionai.v1.StreamAnnotation> annotations_;
  /**
   *
   *
   * <pre>
   * The node specific stream annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.visionai.v1.StreamAnnotation> getAnnotationsList() {
    return annotations_;
  }
  /**
   *
   *
   * <pre>
   * The node specific stream annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.visionai.v1.StreamAnnotationOrBuilder>
      getAnnotationsOrBuilderList() {
    return annotations_;
  }
  /**
   *
   *
   * <pre>
   * The node specific stream annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
   */
  @java.lang.Override
  public int getAnnotationsCount() {
    return annotations_.size();
  }
  /**
   *
   *
   * <pre>
   * The node specific stream annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.StreamAnnotation getAnnotations(int index) {
    return annotations_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The node specific stream annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.StreamAnnotationOrBuilder getAnnotationsOrBuilder(int index) {
    return annotations_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(node_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, node_);
    }
    for (int i = 0; i < annotations_.size(); i++) {
      output.writeMessage(2, annotations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(node_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, node_);
    }
    for (int i = 0; i < annotations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, annotations_.get(i));
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
    if (!(obj instanceof com.google.cloud.visionai.v1.ApplicationNodeAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.ApplicationNodeAnnotation other =
        (com.google.cloud.visionai.v1.ApplicationNodeAnnotation) obj;

    if (!getNode().equals(other.getNode())) return false;
    if (!getAnnotationsList().equals(other.getAnnotationsList())) return false;
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
    hash = (37 * hash) + NODE_FIELD_NUMBER;
    hash = (53 * hash) + getNode().hashCode();
    if (getAnnotationsCount() > 0) {
      hash = (37 * hash) + ANNOTATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.visionai.v1.ApplicationNodeAnnotation prototype) {
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
   * Message describing annotations specific to application node.
   * This message is a duplication of StreamWithAnnotation.NodeAnnotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.ApplicationNodeAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.ApplicationNodeAnnotation)
      com.google.cloud.visionai.v1.ApplicationNodeAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.PlatformProto
          .internal_static_google_cloud_visionai_v1_ApplicationNodeAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.PlatformProto
          .internal_static_google_cloud_visionai_v1_ApplicationNodeAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.ApplicationNodeAnnotation.class,
              com.google.cloud.visionai.v1.ApplicationNodeAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.ApplicationNodeAnnotation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      node_ = "";
      if (annotationsBuilder_ == null) {
        annotations_ = java.util.Collections.emptyList();
      } else {
        annotations_ = null;
        annotationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.PlatformProto
          .internal_static_google_cloud_visionai_v1_ApplicationNodeAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ApplicationNodeAnnotation getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.ApplicationNodeAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ApplicationNodeAnnotation build() {
      com.google.cloud.visionai.v1.ApplicationNodeAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ApplicationNodeAnnotation buildPartial() {
      com.google.cloud.visionai.v1.ApplicationNodeAnnotation result =
          new com.google.cloud.visionai.v1.ApplicationNodeAnnotation(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.visionai.v1.ApplicationNodeAnnotation result) {
      if (annotationsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          annotations_ = java.util.Collections.unmodifiableList(annotations_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.annotations_ = annotations_;
      } else {
        result.annotations_ = annotationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.visionai.v1.ApplicationNodeAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.node_ = node_;
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
      if (other instanceof com.google.cloud.visionai.v1.ApplicationNodeAnnotation) {
        return mergeFrom((com.google.cloud.visionai.v1.ApplicationNodeAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.ApplicationNodeAnnotation other) {
      if (other == com.google.cloud.visionai.v1.ApplicationNodeAnnotation.getDefaultInstance())
        return this;
      if (!other.getNode().isEmpty()) {
        node_ = other.node_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (annotationsBuilder_ == null) {
        if (!other.annotations_.isEmpty()) {
          if (annotations_.isEmpty()) {
            annotations_ = other.annotations_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAnnotationsIsMutable();
            annotations_.addAll(other.annotations_);
          }
          onChanged();
        }
      } else {
        if (!other.annotations_.isEmpty()) {
          if (annotationsBuilder_.isEmpty()) {
            annotationsBuilder_.dispose();
            annotationsBuilder_ = null;
            annotations_ = other.annotations_;
            bitField0_ = (bitField0_ & ~0x00000002);
            annotationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnnotationsFieldBuilder()
                    : null;
          } else {
            annotationsBuilder_.addAllMessages(other.annotations_);
          }
        }
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
                node_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.cloud.visionai.v1.StreamAnnotation m =
                    input.readMessage(
                        com.google.cloud.visionai.v1.StreamAnnotation.parser(), extensionRegistry);
                if (annotationsBuilder_ == null) {
                  ensureAnnotationsIsMutable();
                  annotations_.add(m);
                } else {
                  annotationsBuilder_.addMessage(m);
                }
                break;
              } // case 18
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

    private java.lang.Object node_ = "";
    /**
     *
     *
     * <pre>
     * The node name of the application graph.
     * </pre>
     *
     * <code>string node = 1;</code>
     *
     * @return The node.
     */
    public java.lang.String getNode() {
      java.lang.Object ref = node_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        node_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The node name of the application graph.
     * </pre>
     *
     * <code>string node = 1;</code>
     *
     * @return The bytes for node.
     */
    public com.google.protobuf.ByteString getNodeBytes() {
      java.lang.Object ref = node_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        node_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The node name of the application graph.
     * </pre>
     *
     * <code>string node = 1;</code>
     *
     * @param value The node to set.
     * @return This builder for chaining.
     */
    public Builder setNode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      node_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node name of the application graph.
     * </pre>
     *
     * <code>string node = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNode() {
      node_ = getDefaultInstance().getNode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node name of the application graph.
     * </pre>
     *
     * <code>string node = 1;</code>
     *
     * @param value The bytes for node to set.
     * @return This builder for chaining.
     */
    public Builder setNodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      node_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.visionai.v1.StreamAnnotation> annotations_ =
        java.util.Collections.emptyList();

    private void ensureAnnotationsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        annotations_ =
            new java.util.ArrayList<com.google.cloud.visionai.v1.StreamAnnotation>(annotations_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1.StreamAnnotation,
            com.google.cloud.visionai.v1.StreamAnnotation.Builder,
            com.google.cloud.visionai.v1.StreamAnnotationOrBuilder>
        annotationsBuilder_;

    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1.StreamAnnotation> getAnnotationsList() {
      if (annotationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotations_);
      } else {
        return annotationsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public int getAnnotationsCount() {
      if (annotationsBuilder_ == null) {
        return annotations_.size();
      } else {
        return annotationsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public com.google.cloud.visionai.v1.StreamAnnotation getAnnotations(int index) {
      if (annotationsBuilder_ == null) {
        return annotations_.get(index);
      } else {
        return annotationsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder setAnnotations(int index, com.google.cloud.visionai.v1.StreamAnnotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.set(index, value);
        onChanged();
      } else {
        annotationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder setAnnotations(
        int index, com.google.cloud.visionai.v1.StreamAnnotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder addAnnotations(com.google.cloud.visionai.v1.StreamAnnotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.add(value);
        onChanged();
      } else {
        annotationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder addAnnotations(int index, com.google.cloud.visionai.v1.StreamAnnotation value) {
      if (annotationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationsIsMutable();
        annotations_.add(index, value);
        onChanged();
      } else {
        annotationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder addAnnotations(
        com.google.cloud.visionai.v1.StreamAnnotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.add(builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder addAnnotations(
        int index, com.google.cloud.visionai.v1.StreamAnnotation.Builder builderForValue) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder addAllAnnotations(
        java.lang.Iterable<? extends com.google.cloud.visionai.v1.StreamAnnotation> values) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, annotations_);
        onChanged();
      } else {
        annotationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder clearAnnotations() {
      if (annotationsBuilder_ == null) {
        annotations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        annotationsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public Builder removeAnnotations(int index) {
      if (annotationsBuilder_ == null) {
        ensureAnnotationsIsMutable();
        annotations_.remove(index);
        onChanged();
      } else {
        annotationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public com.google.cloud.visionai.v1.StreamAnnotation.Builder getAnnotationsBuilder(int index) {
      return getAnnotationsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public com.google.cloud.visionai.v1.StreamAnnotationOrBuilder getAnnotationsOrBuilder(
        int index) {
      if (annotationsBuilder_ == null) {
        return annotations_.get(index);
      } else {
        return annotationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.visionai.v1.StreamAnnotationOrBuilder>
        getAnnotationsOrBuilderList() {
      if (annotationsBuilder_ != null) {
        return annotationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotations_);
      }
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public com.google.cloud.visionai.v1.StreamAnnotation.Builder addAnnotationsBuilder() {
      return getAnnotationsFieldBuilder()
          .addBuilder(com.google.cloud.visionai.v1.StreamAnnotation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public com.google.cloud.visionai.v1.StreamAnnotation.Builder addAnnotationsBuilder(int index) {
      return getAnnotationsFieldBuilder()
          .addBuilder(index, com.google.cloud.visionai.v1.StreamAnnotation.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The node specific stream annotations.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.StreamAnnotation annotations = 2;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1.StreamAnnotation.Builder>
        getAnnotationsBuilderList() {
      return getAnnotationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1.StreamAnnotation,
            com.google.cloud.visionai.v1.StreamAnnotation.Builder,
            com.google.cloud.visionai.v1.StreamAnnotationOrBuilder>
        getAnnotationsFieldBuilder() {
      if (annotationsBuilder_ == null) {
        annotationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.visionai.v1.StreamAnnotation,
                com.google.cloud.visionai.v1.StreamAnnotation.Builder,
                com.google.cloud.visionai.v1.StreamAnnotationOrBuilder>(
                annotations_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        annotations_ = null;
      }
      return annotationsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.ApplicationNodeAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.ApplicationNodeAnnotation)
  private static final com.google.cloud.visionai.v1.ApplicationNodeAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.ApplicationNodeAnnotation();
  }

  public static com.google.cloud.visionai.v1.ApplicationNodeAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplicationNodeAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<ApplicationNodeAnnotation>() {
        @java.lang.Override
        public ApplicationNodeAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ApplicationNodeAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplicationNodeAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.ApplicationNodeAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
