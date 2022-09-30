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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Status information for a link proposal.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.LinkProposalStatusDetails}
 */
public final class LinkProposalStatusDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.LinkProposalStatusDetails)
    LinkProposalStatusDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LinkProposalStatusDetails.newBuilder() to construct.
  private LinkProposalStatusDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LinkProposalStatusDetails() {
    linkProposalInitiatingProduct_ = 0;
    requestorEmail_ = "";
    linkProposalState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LinkProposalStatusDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LinkProposalStatusDetails(
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
          case 8:
            {
              int rawValue = input.readEnum();

              linkProposalInitiatingProduct_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              requestorEmail_ = s;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              linkProposalState_ = rawValue;
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
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_LinkProposalStatusDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_LinkProposalStatusDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.LinkProposalStatusDetails.class,
            com.google.analytics.admin.v1alpha.LinkProposalStatusDetails.Builder.class);
  }

  public static final int LINK_PROPOSAL_INITIATING_PRODUCT_FIELD_NUMBER = 1;
  private int linkProposalInitiatingProduct_;
  /**
   *
   *
   * <pre>
   * Output only. The source of this proposal.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.LinkProposalInitiatingProduct link_proposal_initiating_product = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for linkProposalInitiatingProduct.
   */
  @java.lang.Override
  public int getLinkProposalInitiatingProductValue() {
    return linkProposalInitiatingProduct_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The source of this proposal.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.LinkProposalInitiatingProduct link_proposal_initiating_product = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The linkProposalInitiatingProduct.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct
      getLinkProposalInitiatingProduct() {
    @SuppressWarnings("deprecation")
    com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct result =
        com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct.valueOf(
            linkProposalInitiatingProduct_);
    return result == null
        ? com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct.UNRECOGNIZED
        : result;
  }

  public static final int REQUESTOR_EMAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object requestorEmail_;
  /**
   *
   *
   * <pre>
   * Output only. The email address of the user that proposed this linkage.
   * </pre>
   *
   * <code>string requestor_email = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The requestorEmail.
   */
  @java.lang.Override
  public java.lang.String getRequestorEmail() {
    java.lang.Object ref = requestorEmail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestorEmail_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The email address of the user that proposed this linkage.
   * </pre>
   *
   * <code>string requestor_email = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for requestorEmail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRequestorEmailBytes() {
    java.lang.Object ref = requestorEmail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      requestorEmail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINK_PROPOSAL_STATE_FIELD_NUMBER = 3;
  private int linkProposalState_;
  /**
   *
   *
   * <pre>
   * Output only. The state of this proposal.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.LinkProposalState link_proposal_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for linkProposalState.
   */
  @java.lang.Override
  public int getLinkProposalStateValue() {
    return linkProposalState_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The state of this proposal.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.LinkProposalState link_proposal_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The linkProposalState.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.LinkProposalState getLinkProposalState() {
    @SuppressWarnings("deprecation")
    com.google.analytics.admin.v1alpha.LinkProposalState result =
        com.google.analytics.admin.v1alpha.LinkProposalState.valueOf(linkProposalState_);
    return result == null
        ? com.google.analytics.admin.v1alpha.LinkProposalState.UNRECOGNIZED
        : result;
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
    if (linkProposalInitiatingProduct_
        != com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct
            .LINK_PROPOSAL_INITIATING_PRODUCT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, linkProposalInitiatingProduct_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestorEmail_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requestorEmail_);
    }
    if (linkProposalState_
        != com.google.analytics.admin.v1alpha.LinkProposalState.LINK_PROPOSAL_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, linkProposalState_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (linkProposalInitiatingProduct_
        != com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct
            .LINK_PROPOSAL_INITIATING_PRODUCT_UNSPECIFIED
            .getNumber()) {
      size +=
          com.google.protobuf.CodedOutputStream.computeEnumSize(1, linkProposalInitiatingProduct_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestorEmail_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, requestorEmail_);
    }
    if (linkProposalState_
        != com.google.analytics.admin.v1alpha.LinkProposalState.LINK_PROPOSAL_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, linkProposalState_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.LinkProposalStatusDetails)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.LinkProposalStatusDetails other =
        (com.google.analytics.admin.v1alpha.LinkProposalStatusDetails) obj;

    if (linkProposalInitiatingProduct_ != other.linkProposalInitiatingProduct_) return false;
    if (!getRequestorEmail().equals(other.getRequestorEmail())) return false;
    if (linkProposalState_ != other.linkProposalState_) return false;
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
    hash = (37 * hash) + LINK_PROPOSAL_INITIATING_PRODUCT_FIELD_NUMBER;
    hash = (53 * hash) + linkProposalInitiatingProduct_;
    hash = (37 * hash) + REQUESTOR_EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getRequestorEmail().hashCode();
    hash = (37 * hash) + LINK_PROPOSAL_STATE_FIELD_NUMBER;
    hash = (53 * hash) + linkProposalState_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parseFrom(
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
      com.google.analytics.admin.v1alpha.LinkProposalStatusDetails prototype) {
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
   * Status information for a link proposal.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.LinkProposalStatusDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.LinkProposalStatusDetails)
      com.google.analytics.admin.v1alpha.LinkProposalStatusDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_LinkProposalStatusDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_LinkProposalStatusDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.LinkProposalStatusDetails.class,
              com.google.analytics.admin.v1alpha.LinkProposalStatusDetails.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.LinkProposalStatusDetails.newBuilder()
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
      linkProposalInitiatingProduct_ = 0;

      requestorEmail_ = "";

      linkProposalState_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_LinkProposalStatusDetails_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.LinkProposalStatusDetails
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.LinkProposalStatusDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.LinkProposalStatusDetails build() {
      com.google.analytics.admin.v1alpha.LinkProposalStatusDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.LinkProposalStatusDetails buildPartial() {
      com.google.analytics.admin.v1alpha.LinkProposalStatusDetails result =
          new com.google.analytics.admin.v1alpha.LinkProposalStatusDetails(this);
      result.linkProposalInitiatingProduct_ = linkProposalInitiatingProduct_;
      result.requestorEmail_ = requestorEmail_;
      result.linkProposalState_ = linkProposalState_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.LinkProposalStatusDetails) {
        return mergeFrom((com.google.analytics.admin.v1alpha.LinkProposalStatusDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.LinkProposalStatusDetails other) {
      if (other
          == com.google.analytics.admin.v1alpha.LinkProposalStatusDetails.getDefaultInstance())
        return this;
      if (other.linkProposalInitiatingProduct_ != 0) {
        setLinkProposalInitiatingProductValue(other.getLinkProposalInitiatingProductValue());
      }
      if (!other.getRequestorEmail().isEmpty()) {
        requestorEmail_ = other.requestorEmail_;
        onChanged();
      }
      if (other.linkProposalState_ != 0) {
        setLinkProposalStateValue(other.getLinkProposalStateValue());
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
      com.google.analytics.admin.v1alpha.LinkProposalStatusDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.LinkProposalStatusDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int linkProposalInitiatingProduct_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. The source of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalInitiatingProduct link_proposal_initiating_product = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for linkProposalInitiatingProduct.
     */
    @java.lang.Override
    public int getLinkProposalInitiatingProductValue() {
      return linkProposalInitiatingProduct_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The source of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalInitiatingProduct link_proposal_initiating_product = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for linkProposalInitiatingProduct to set.
     * @return This builder for chaining.
     */
    public Builder setLinkProposalInitiatingProductValue(int value) {

      linkProposalInitiatingProduct_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The source of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalInitiatingProduct link_proposal_initiating_product = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The linkProposalInitiatingProduct.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct
        getLinkProposalInitiatingProduct() {
      @SuppressWarnings("deprecation")
      com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct result =
          com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct.valueOf(
              linkProposalInitiatingProduct_);
      return result == null
          ? com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. The source of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalInitiatingProduct link_proposal_initiating_product = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The linkProposalInitiatingProduct to set.
     * @return This builder for chaining.
     */
    public Builder setLinkProposalInitiatingProduct(
        com.google.analytics.admin.v1alpha.LinkProposalInitiatingProduct value) {
      if (value == null) {
        throw new NullPointerException();
      }

      linkProposalInitiatingProduct_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The source of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalInitiatingProduct link_proposal_initiating_product = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLinkProposalInitiatingProduct() {

      linkProposalInitiatingProduct_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object requestorEmail_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The email address of the user that proposed this linkage.
     * </pre>
     *
     * <code>string requestor_email = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The requestorEmail.
     */
    public java.lang.String getRequestorEmail() {
      java.lang.Object ref = requestorEmail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestorEmail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The email address of the user that proposed this linkage.
     * </pre>
     *
     * <code>string requestor_email = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for requestorEmail.
     */
    public com.google.protobuf.ByteString getRequestorEmailBytes() {
      java.lang.Object ref = requestorEmail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestorEmail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The email address of the user that proposed this linkage.
     * </pre>
     *
     * <code>string requestor_email = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The requestorEmail to set.
     * @return This builder for chaining.
     */
    public Builder setRequestorEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      requestorEmail_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The email address of the user that proposed this linkage.
     * </pre>
     *
     * <code>string requestor_email = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequestorEmail() {

      requestorEmail_ = getDefaultInstance().getRequestorEmail();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The email address of the user that proposed this linkage.
     * </pre>
     *
     * <code>string requestor_email = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for requestorEmail to set.
     * @return This builder for chaining.
     */
    public Builder setRequestorEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      requestorEmail_ = value;
      onChanged();
      return this;
    }

    private int linkProposalState_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. The state of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalState link_proposal_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for linkProposalState.
     */
    @java.lang.Override
    public int getLinkProposalStateValue() {
      return linkProposalState_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The state of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalState link_proposal_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for linkProposalState to set.
     * @return This builder for chaining.
     */
    public Builder setLinkProposalStateValue(int value) {

      linkProposalState_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The state of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalState link_proposal_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The linkProposalState.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1alpha.LinkProposalState getLinkProposalState() {
      @SuppressWarnings("deprecation")
      com.google.analytics.admin.v1alpha.LinkProposalState result =
          com.google.analytics.admin.v1alpha.LinkProposalState.valueOf(linkProposalState_);
      return result == null
          ? com.google.analytics.admin.v1alpha.LinkProposalState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. The state of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalState link_proposal_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The linkProposalState to set.
     * @return This builder for chaining.
     */
    public Builder setLinkProposalState(
        com.google.analytics.admin.v1alpha.LinkProposalState value) {
      if (value == null) {
        throw new NullPointerException();
      }

      linkProposalState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The state of this proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.LinkProposalState link_proposal_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLinkProposalState() {

      linkProposalState_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.LinkProposalStatusDetails)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.LinkProposalStatusDetails)
  private static final com.google.analytics.admin.v1alpha.LinkProposalStatusDetails
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.LinkProposalStatusDetails();
  }

  public static com.google.analytics.admin.v1alpha.LinkProposalStatusDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinkProposalStatusDetails> PARSER =
      new com.google.protobuf.AbstractParser<LinkProposalStatusDetails>() {
        @java.lang.Override
        public LinkProposalStatusDetails parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LinkProposalStatusDetails(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LinkProposalStatusDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinkProposalStatusDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.LinkProposalStatusDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
