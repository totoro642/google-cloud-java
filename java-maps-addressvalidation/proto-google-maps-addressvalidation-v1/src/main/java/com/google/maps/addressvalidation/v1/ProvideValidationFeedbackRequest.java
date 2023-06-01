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
// source: google/maps/addressvalidation/v1/address_validation_service.proto

package com.google.maps.addressvalidation.v1;

/**
 *
 *
 * <pre>
 * The request for sending validation feedback.
 * </pre>
 *
 * Protobuf type {@code google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest}
 */
public final class ProvideValidationFeedbackRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest)
    ProvideValidationFeedbackRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProvideValidationFeedbackRequest.newBuilder() to construct.
  private ProvideValidationFeedbackRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProvideValidationFeedbackRequest() {
    conclusion_ = 0;
    responseId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProvideValidationFeedbackRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.addressvalidation.v1.AddressValidationServiceProto
        .internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.addressvalidation.v1.AddressValidationServiceProto
        .internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.class,
            com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The possible final outcomes of the sequence of address validation requests
   * needed to validate an address.
   * </pre>
   *
   * Protobuf enum {@code
   * google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion}
   */
  public enum ValidationConclusion implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * This value is unused.
     * If the `ProvideValidationFeedbackRequest.conclusion` field is set to
     * `VALIDATION_CONCLUSION_UNSPECIFIED`, an `INVALID_ARGUMENT` error will be
     * returned.
     * </pre>
     *
     * <code>VALIDATION_CONCLUSION_UNSPECIFIED = 0;</code>
     */
    VALIDATION_CONCLUSION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The version of the address returned by the Address Validation API was
     * used for the transaction.
     * </pre>
     *
     * <code>VALIDATED_VERSION_USED = 1;</code>
     */
    VALIDATED_VERSION_USED(1),
    /**
     *
     *
     * <pre>
     * The version of the address provided by the user was used for the
     * transaction
     * </pre>
     *
     * <code>USER_VERSION_USED = 2;</code>
     */
    USER_VERSION_USED(2),
    /**
     *
     *
     * <pre>
     * A version of the address that was entered after the last validation
     * attempt but that was not re-validated was used for the transaction.
     * </pre>
     *
     * <code>UNVALIDATED_VERSION_USED = 3;</code>
     */
    UNVALIDATED_VERSION_USED(3),
    /**
     *
     *
     * <pre>
     * The transaction was abandoned and the address was not used.
     * </pre>
     *
     * <code>UNUSED = 4;</code>
     */
    UNUSED(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * This value is unused.
     * If the `ProvideValidationFeedbackRequest.conclusion` field is set to
     * `VALIDATION_CONCLUSION_UNSPECIFIED`, an `INVALID_ARGUMENT` error will be
     * returned.
     * </pre>
     *
     * <code>VALIDATION_CONCLUSION_UNSPECIFIED = 0;</code>
     */
    public static final int VALIDATION_CONCLUSION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The version of the address returned by the Address Validation API was
     * used for the transaction.
     * </pre>
     *
     * <code>VALIDATED_VERSION_USED = 1;</code>
     */
    public static final int VALIDATED_VERSION_USED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The version of the address provided by the user was used for the
     * transaction
     * </pre>
     *
     * <code>USER_VERSION_USED = 2;</code>
     */
    public static final int USER_VERSION_USED_VALUE = 2;
    /**
     *
     *
     * <pre>
     * A version of the address that was entered after the last validation
     * attempt but that was not re-validated was used for the transaction.
     * </pre>
     *
     * <code>UNVALIDATED_VERSION_USED = 3;</code>
     */
    public static final int UNVALIDATED_VERSION_USED_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The transaction was abandoned and the address was not used.
     * </pre>
     *
     * <code>UNUSED = 4;</code>
     */
    public static final int UNUSED_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValidationConclusion valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ValidationConclusion forNumber(int value) {
      switch (value) {
        case 0:
          return VALIDATION_CONCLUSION_UNSPECIFIED;
        case 1:
          return VALIDATED_VERSION_USED;
        case 2:
          return USER_VERSION_USED;
        case 3:
          return UNVALIDATED_VERSION_USED;
        case 4:
          return UNUSED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ValidationConclusion>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ValidationConclusion>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ValidationConclusion>() {
              public ValidationConclusion findValueByNumber(int number) {
                return ValidationConclusion.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ValidationConclusion[] VALUES = values();

    public static ValidationConclusion valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ValidationConclusion(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion)
  }

  public static final int CONCLUSION_FIELD_NUMBER = 1;
  private int conclusion_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The outcome of the sequence of validation attempts.
   *
   * If this field is set to `VALIDATION_CONCLUSION_UNSPECIFIED`, an
   * `INVALID_ARGUMENT` error will be returned.
   * </pre>
   *
   * <code>
   * .google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion conclusion = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for conclusion.
   */
  @java.lang.Override
  public int getConclusionValue() {
    return conclusion_;
  }
  /**
   *
   *
   * <pre>
   * Required. The outcome of the sequence of validation attempts.
   *
   * If this field is set to `VALIDATION_CONCLUSION_UNSPECIFIED`, an
   * `INVALID_ARGUMENT` error will be returned.
   * </pre>
   *
   * <code>
   * .google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion conclusion = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conclusion.
   */
  @java.lang.Override
  public com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion
      getConclusion() {
    com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion
        result =
            com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
                .ValidationConclusion.forNumber(conclusion_);
    return result == null
        ? com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion
            .UNRECOGNIZED
        : result;
  }

  public static final int RESPONSE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object responseId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID of the response that this feedback is for. This should be
   * the
   * [response_id][google.maps.addressvalidation.v1.ValidateAddressRequest.response_id]
   * from the first response in a series of address validation attempts.
   * </pre>
   *
   * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The responseId.
   */
  @java.lang.Override
  public java.lang.String getResponseId() {
    java.lang.Object ref = responseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the response that this feedback is for. This should be
   * the
   * [response_id][google.maps.addressvalidation.v1.ValidateAddressRequest.response_id]
   * from the first response in a series of address validation attempts.
   * </pre>
   *
   * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for responseId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResponseIdBytes() {
    java.lang.Object ref = responseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      responseId_ = b;
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
    if (conclusion_
        != com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
            .ValidationConclusion.VALIDATION_CONCLUSION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, conclusion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(responseId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, responseId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conclusion_
        != com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
            .ValidationConclusion.VALIDATION_CONCLUSION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, conclusion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(responseId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, responseId_);
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
    if (!(obj instanceof com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest)) {
      return super.equals(obj);
    }
    com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest other =
        (com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest) obj;

    if (conclusion_ != other.conclusion_) return false;
    if (!getResponseId().equals(other.getResponseId())) return false;
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
    hash = (37 * hash) + CONCLUSION_FIELD_NUMBER;
    hash = (53 * hash) + conclusion_;
    hash = (37 * hash) + RESPONSE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getResponseId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest parseFrom(
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
      com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest prototype) {
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
   * The request for sending validation feedback.
   * </pre>
   *
   * Protobuf type {@code google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest)
      com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.addressvalidation.v1.AddressValidationServiceProto
          .internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.addressvalidation.v1.AddressValidationServiceProto
          .internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.class,
              com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.Builder.class);
    }

    // Construct using
    // com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      conclusion_ = 0;
      responseId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.addressvalidation.v1.AddressValidationServiceProto
          .internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor;
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
        getDefaultInstanceForType() {
      return com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest build() {
      com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest buildPartial() {
      com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest result =
          new com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conclusion_ = conclusion_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.responseId_ = responseId_;
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
      if (other instanceof com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest) {
        return mergeFrom(
            (com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest other) {
      if (other
          == com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
              .getDefaultInstance()) return this;
      if (other.conclusion_ != 0) {
        setConclusionValue(other.getConclusionValue());
      }
      if (!other.getResponseId().isEmpty()) {
        responseId_ = other.responseId_;
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
            case 8:
              {
                conclusion_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                responseId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private int conclusion_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The outcome of the sequence of validation attempts.
     *
     * If this field is set to `VALIDATION_CONCLUSION_UNSPECIFIED`, an
     * `INVALID_ARGUMENT` error will be returned.
     * </pre>
     *
     * <code>
     * .google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion conclusion = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for conclusion.
     */
    @java.lang.Override
    public int getConclusionValue() {
      return conclusion_;
    }
    /**
     *
     *
     * <pre>
     * Required. The outcome of the sequence of validation attempts.
     *
     * If this field is set to `VALIDATION_CONCLUSION_UNSPECIFIED`, an
     * `INVALID_ARGUMENT` error will be returned.
     * </pre>
     *
     * <code>
     * .google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion conclusion = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for conclusion to set.
     * @return This builder for chaining.
     */
    public Builder setConclusionValue(int value) {
      conclusion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The outcome of the sequence of validation attempts.
     *
     * If this field is set to `VALIDATION_CONCLUSION_UNSPECIFIED`, an
     * `INVALID_ARGUMENT` error will be returned.
     * </pre>
     *
     * <code>
     * .google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion conclusion = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The conclusion.
     */
    @java.lang.Override
    public com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
            .ValidationConclusion
        getConclusion() {
      com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion
          result =
              com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
                  .ValidationConclusion.forNumber(conclusion_);
      return result == null
          ? com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
              .ValidationConclusion.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The outcome of the sequence of validation attempts.
     *
     * If this field is set to `VALIDATION_CONCLUSION_UNSPECIFIED`, an
     * `INVALID_ARGUMENT` error will be returned.
     * </pre>
     *
     * <code>
     * .google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion conclusion = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The conclusion to set.
     * @return This builder for chaining.
     */
    public Builder setConclusion(
        com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion
            value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      conclusion_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The outcome of the sequence of validation attempts.
     *
     * If this field is set to `VALIDATION_CONCLUSION_UNSPECIFIED`, an
     * `INVALID_ARGUMENT` error will be returned.
     * </pre>
     *
     * <code>
     * .google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest.ValidationConclusion conclusion = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConclusion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      conclusion_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object responseId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the response that this feedback is for. This should be
     * the
     * [response_id][google.maps.addressvalidation.v1.ValidateAddressRequest.response_id]
     * from the first response in a series of address validation attempts.
     * </pre>
     *
     * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The responseId.
     */
    public java.lang.String getResponseId() {
      java.lang.Object ref = responseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the response that this feedback is for. This should be
     * the
     * [response_id][google.maps.addressvalidation.v1.ValidateAddressRequest.response_id]
     * from the first response in a series of address validation attempts.
     * </pre>
     *
     * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for responseId.
     */
    public com.google.protobuf.ByteString getResponseIdBytes() {
      java.lang.Object ref = responseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        responseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the response that this feedback is for. This should be
     * the
     * [response_id][google.maps.addressvalidation.v1.ValidateAddressRequest.response_id]
     * from the first response in a series of address validation attempts.
     * </pre>
     *
     * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The responseId to set.
     * @return This builder for chaining.
     */
    public Builder setResponseId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      responseId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the response that this feedback is for. This should be
     * the
     * [response_id][google.maps.addressvalidation.v1.ValidateAddressRequest.response_id]
     * from the first response in a series of address validation attempts.
     * </pre>
     *
     * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResponseId() {
      responseId_ = getDefaultInstance().getResponseId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the response that this feedback is for. This should be
     * the
     * [response_id][google.maps.addressvalidation.v1.ValidateAddressRequest.response_id]
     * from the first response in a series of address validation attempts.
     * </pre>
     *
     * <code>string response_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for responseId to set.
     * @return This builder for chaining.
     */
    public Builder setResponseIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      responseId_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest)
  }

  // @@protoc_insertion_point(class_scope:google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest)
  private static final com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest();
  }

  public static com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProvideValidationFeedbackRequest> PARSER =
      new com.google.protobuf.AbstractParser<ProvideValidationFeedbackRequest>() {
        @java.lang.Override
        public ProvideValidationFeedbackRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProvideValidationFeedbackRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProvideValidationFeedbackRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.addressvalidation.v1.ProvideValidationFeedbackRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
