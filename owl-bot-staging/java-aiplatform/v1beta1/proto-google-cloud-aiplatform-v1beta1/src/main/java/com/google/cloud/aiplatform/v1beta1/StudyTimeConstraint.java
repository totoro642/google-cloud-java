// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/study.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Time-based Constraint for Study
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.StudyTimeConstraint}
 */
public final class StudyTimeConstraint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.StudyTimeConstraint)
    StudyTimeConstraintOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudyTimeConstraint.newBuilder() to construct.
  private StudyTimeConstraint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudyTimeConstraint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudyTimeConstraint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.StudyProto.internal_static_google_cloud_aiplatform_v1beta1_StudyTimeConstraint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.StudyProto.internal_static_google_cloud_aiplatform_v1beta1_StudyTimeConstraint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint.class, com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint.Builder.class);
  }

  private int constraintCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object constraint_;
  public enum ConstraintCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MAX_DURATION(1),
    END_TIME(2),
    CONSTRAINT_NOT_SET(0);
    private final int value;
    private ConstraintCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConstraintCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConstraintCase forNumber(int value) {
      switch (value) {
        case 1: return MAX_DURATION;
        case 2: return END_TIME;
        case 0: return CONSTRAINT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ConstraintCase
  getConstraintCase() {
    return ConstraintCase.forNumber(
        constraintCase_);
  }

  public static final int MAX_DURATION_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Counts the wallclock time passed since the creation of this Study.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 1;</code>
   * @return Whether the maxDuration field is set.
   */
  @java.lang.Override
  public boolean hasMaxDuration() {
    return constraintCase_ == 1;
  }
  /**
   * <pre>
   * Counts the wallclock time passed since the creation of this Study.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 1;</code>
   * @return The maxDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getMaxDuration() {
    if (constraintCase_ == 1) {
       return (com.google.protobuf.Duration) constraint_;
    }
    return com.google.protobuf.Duration.getDefaultInstance();
  }
  /**
   * <pre>
   * Counts the wallclock time passed since the creation of this Study.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_duration = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getMaxDurationOrBuilder() {
    if (constraintCase_ == 1) {
       return (com.google.protobuf.Duration) constraint_;
    }
    return com.google.protobuf.Duration.getDefaultInstance();
  }

  public static final int END_TIME_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Compares the wallclock time to this time. Must use UTC timezone.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return constraintCase_ == 2;
  }
  /**
   * <pre>
   * Compares the wallclock time to this time. Must use UTC timezone.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    if (constraintCase_ == 2) {
       return (com.google.protobuf.Timestamp) constraint_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }
  /**
   * <pre>
   * Compares the wallclock time to this time. Must use UTC timezone.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    if (constraintCase_ == 2) {
       return (com.google.protobuf.Timestamp) constraint_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
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
    if (constraintCase_ == 1) {
      output.writeMessage(1, (com.google.protobuf.Duration) constraint_);
    }
    if (constraintCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Timestamp) constraint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (constraintCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.protobuf.Duration) constraint_);
    }
    if (constraintCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.protobuf.Timestamp) constraint_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint other = (com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint) obj;

    if (!getConstraintCase().equals(other.getConstraintCase())) return false;
    switch (constraintCase_) {
      case 1:
        if (!getMaxDuration()
            .equals(other.getMaxDuration())) return false;
        break;
      case 2:
        if (!getEndTime()
            .equals(other.getEndTime())) return false;
        break;
      case 0:
      default:
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
    switch (constraintCase_) {
      case 1:
        hash = (37 * hash) + MAX_DURATION_FIELD_NUMBER;
        hash = (53 * hash) + getMaxDuration().hashCode();
        break;
      case 2:
        hash = (37 * hash) + END_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getEndTime().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint prototype) {
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
   * Time-based Constraint for Study
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.StudyTimeConstraint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.StudyTimeConstraint)
      com.google.cloud.aiplatform.v1beta1.StudyTimeConstraintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.StudyProto.internal_static_google_cloud_aiplatform_v1beta1_StudyTimeConstraint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.StudyProto.internal_static_google_cloud_aiplatform_v1beta1_StudyTimeConstraint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint.class, com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint.newBuilder()
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
      if (maxDurationBuilder_ != null) {
        maxDurationBuilder_.clear();
      }
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.clear();
      }
      constraintCase_ = 0;
      constraint_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.StudyProto.internal_static_google_cloud_aiplatform_v1beta1_StudyTimeConstraint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint build() {
      com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint buildPartial() {
      com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint result = new com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint result) {
      result.constraintCase_ = constraintCase_;
      result.constraint_ = this.constraint_;
      if (constraintCase_ == 1 &&
          maxDurationBuilder_ != null) {
        result.constraint_ = maxDurationBuilder_.build();
      }
      if (constraintCase_ == 2 &&
          endTimeBuilder_ != null) {
        result.constraint_ = endTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint other) {
      if (other == com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint.getDefaultInstance()) return this;
      switch (other.getConstraintCase()) {
        case MAX_DURATION: {
          mergeMaxDuration(other.getMaxDuration());
          break;
        }
        case END_TIME: {
          mergeEndTime(other.getEndTime());
          break;
        }
        case CONSTRAINT_NOT_SET: {
          break;
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
            case 10: {
              input.readMessage(
                  getMaxDurationFieldBuilder().getBuilder(),
                  extensionRegistry);
              constraintCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              constraintCase_ = 2;
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
    private int constraintCase_ = 0;
    private java.lang.Object constraint_;
    public ConstraintCase
        getConstraintCase() {
      return ConstraintCase.forNumber(
          constraintCase_);
    }

    public Builder clearConstraint() {
      constraintCase_ = 0;
      constraint_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> maxDurationBuilder_;
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     * @return Whether the maxDuration field is set.
     */
    @java.lang.Override
    public boolean hasMaxDuration() {
      return constraintCase_ == 1;
    }
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     * @return The maxDuration.
     */
    @java.lang.Override
    public com.google.protobuf.Duration getMaxDuration() {
      if (maxDurationBuilder_ == null) {
        if (constraintCase_ == 1) {
          return (com.google.protobuf.Duration) constraint_;
        }
        return com.google.protobuf.Duration.getDefaultInstance();
      } else {
        if (constraintCase_ == 1) {
          return maxDurationBuilder_.getMessage();
        }
        return com.google.protobuf.Duration.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     */
    public Builder setMaxDuration(com.google.protobuf.Duration value) {
      if (maxDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        constraint_ = value;
        onChanged();
      } else {
        maxDurationBuilder_.setMessage(value);
      }
      constraintCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     */
    public Builder setMaxDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (maxDurationBuilder_ == null) {
        constraint_ = builderForValue.build();
        onChanged();
      } else {
        maxDurationBuilder_.setMessage(builderForValue.build());
      }
      constraintCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     */
    public Builder mergeMaxDuration(com.google.protobuf.Duration value) {
      if (maxDurationBuilder_ == null) {
        if (constraintCase_ == 1 &&
            constraint_ != com.google.protobuf.Duration.getDefaultInstance()) {
          constraint_ = com.google.protobuf.Duration.newBuilder((com.google.protobuf.Duration) constraint_)
              .mergeFrom(value).buildPartial();
        } else {
          constraint_ = value;
        }
        onChanged();
      } else {
        if (constraintCase_ == 1) {
          maxDurationBuilder_.mergeFrom(value);
        } else {
          maxDurationBuilder_.setMessage(value);
        }
      }
      constraintCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     */
    public Builder clearMaxDuration() {
      if (maxDurationBuilder_ == null) {
        if (constraintCase_ == 1) {
          constraintCase_ = 0;
          constraint_ = null;
          onChanged();
        }
      } else {
        if (constraintCase_ == 1) {
          constraintCase_ = 0;
          constraint_ = null;
        }
        maxDurationBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getMaxDurationBuilder() {
      return getMaxDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.DurationOrBuilder getMaxDurationOrBuilder() {
      if ((constraintCase_ == 1) && (maxDurationBuilder_ != null)) {
        return maxDurationBuilder_.getMessageOrBuilder();
      } else {
        if (constraintCase_ == 1) {
          return (com.google.protobuf.Duration) constraint_;
        }
        return com.google.protobuf.Duration.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Counts the wallclock time passed since the creation of this Study.
     * </pre>
     *
     * <code>.google.protobuf.Duration max_duration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getMaxDurationFieldBuilder() {
      if (maxDurationBuilder_ == null) {
        if (!(constraintCase_ == 1)) {
          constraint_ = com.google.protobuf.Duration.getDefaultInstance();
        }
        maxDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                (com.google.protobuf.Duration) constraint_,
                getParentForChildren(),
                isClean());
        constraint_ = null;
      }
      constraintCase_ = 1;
      onChanged();
      return maxDurationBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endTimeBuilder_;
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     * @return Whether the endTime field is set.
     */
    @java.lang.Override
    public boolean hasEndTime() {
      return constraintCase_ == 2;
    }
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        if (constraintCase_ == 2) {
          return (com.google.protobuf.Timestamp) constraint_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      } else {
        if (constraintCase_ == 2) {
          return endTimeBuilder_.getMessage();
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        constraint_ = value;
        onChanged();
      } else {
        endTimeBuilder_.setMessage(value);
      }
      constraintCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder setEndTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        constraint_ = builderForValue.build();
        onChanged();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }
      constraintCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (constraintCase_ == 2 &&
            constraint_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          constraint_ = com.google.protobuf.Timestamp.newBuilder((com.google.protobuf.Timestamp) constraint_)
              .mergeFrom(value).buildPartial();
        } else {
          constraint_ = value;
        }
        onChanged();
      } else {
        if (constraintCase_ == 2) {
          endTimeBuilder_.mergeFrom(value);
        } else {
          endTimeBuilder_.setMessage(value);
        }
      }
      constraintCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder clearEndTime() {
      if (endTimeBuilder_ == null) {
        if (constraintCase_ == 2) {
          constraintCase_ = 0;
          constraint_ = null;
          onChanged();
        }
      } else {
        if (constraintCase_ == 2) {
          constraintCase_ = 0;
          constraint_ = null;
        }
        endTimeBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if ((constraintCase_ == 2) && (endTimeBuilder_ != null)) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        if (constraintCase_ == 2) {
          return (com.google.protobuf.Timestamp) constraint_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Compares the wallclock time to this time. Must use UTC timezone.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        if (!(constraintCase_ == 2)) {
          constraint_ = com.google.protobuf.Timestamp.getDefaultInstance();
        }
        endTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                (com.google.protobuf.Timestamp) constraint_,
                getParentForChildren(),
                isClean());
        constraint_ = null;
      }
      constraintCase_ = 2;
      onChanged();
      return endTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.StudyTimeConstraint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.StudyTimeConstraint)
  private static final com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint();
  }

  public static com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudyTimeConstraint>
      PARSER = new com.google.protobuf.AbstractParser<StudyTimeConstraint>() {
    @java.lang.Override
    public StudyTimeConstraint parsePartialFrom(
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

  public static com.google.protobuf.Parser<StudyTimeConstraint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudyTimeConstraint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.StudyTimeConstraint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

