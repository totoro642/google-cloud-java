// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/company_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4;

/**
 * <pre>
 * The Request of the CreateCompany method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4.CreateCompanyRequest}
 */
public final class CreateCompanyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4.CreateCompanyRequest)
    CreateCompanyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCompanyRequest.newBuilder() to construct.
  private CreateCompanyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCompanyRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCompanyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.talent.v4.CompanyServiceProto.internal_static_google_cloud_talent_v4_CreateCompanyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4.CompanyServiceProto.internal_static_google_cloud_talent_v4_CreateCompanyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4.CreateCompanyRequest.class, com.google.cloud.talent.v4.CreateCompanyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. Resource name of the tenant under which the company is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenants/bar".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Resource name of the tenant under which the company is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenants/bar".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPANY_FIELD_NUMBER = 2;
  private com.google.cloud.talent.v4.Company company_;
  /**
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the company field is set.
   */
  @java.lang.Override
  public boolean hasCompany() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The company.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.Company getCompany() {
    return company_ == null ? com.google.cloud.talent.v4.Company.getDefaultInstance() : company_;
  }
  /**
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.talent.v4.CompanyOrBuilder getCompanyOrBuilder() {
    return company_ == null ? com.google.cloud.talent.v4.Company.getDefaultInstance() : company_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCompany());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCompany());
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
    if (!(obj instanceof com.google.cloud.talent.v4.CreateCompanyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4.CreateCompanyRequest other = (com.google.cloud.talent.v4.CreateCompanyRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasCompany() != other.hasCompany()) return false;
    if (hasCompany()) {
      if (!getCompany()
          .equals(other.getCompany())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasCompany()) {
      hash = (37 * hash) + COMPANY_FIELD_NUMBER;
      hash = (53 * hash) + getCompany().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4.CreateCompanyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4.CreateCompanyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.talent.v4.CreateCompanyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.talent.v4.CreateCompanyRequest prototype) {
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
   * The Request of the CreateCompany method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4.CreateCompanyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4.CreateCompanyRequest)
      com.google.cloud.talent.v4.CreateCompanyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.talent.v4.CompanyServiceProto.internal_static_google_cloud_talent_v4_CreateCompanyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4.CompanyServiceProto.internal_static_google_cloud_talent_v4_CreateCompanyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4.CreateCompanyRequest.class, com.google.cloud.talent.v4.CreateCompanyRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4.CreateCompanyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCompanyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      company_ = null;
      if (companyBuilder_ != null) {
        companyBuilder_.dispose();
        companyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.talent.v4.CompanyServiceProto.internal_static_google_cloud_talent_v4_CreateCompanyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.CreateCompanyRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4.CreateCompanyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.CreateCompanyRequest build() {
      com.google.cloud.talent.v4.CreateCompanyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4.CreateCompanyRequest buildPartial() {
      com.google.cloud.talent.v4.CreateCompanyRequest result = new com.google.cloud.talent.v4.CreateCompanyRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.talent.v4.CreateCompanyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.company_ = companyBuilder_ == null
            ? company_
            : companyBuilder_.build();
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
      if (other instanceof com.google.cloud.talent.v4.CreateCompanyRequest) {
        return mergeFrom((com.google.cloud.talent.v4.CreateCompanyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4.CreateCompanyRequest other) {
      if (other == com.google.cloud.talent.v4.CreateCompanyRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCompany()) {
        mergeCompany(other.getCompany());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCompanyFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. Resource name of the tenant under which the company is created.
     *
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the tenant under which the company is created.
     *
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Resource name of the tenant under which the company is created.
     *
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the tenant under which the company is created.
     *
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Resource name of the tenant under which the company is created.
     *
     * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
     * "projects/foo/tenants/bar".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.talent.v4.Company company_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4.Company, com.google.cloud.talent.v4.Company.Builder, com.google.cloud.talent.v4.CompanyOrBuilder> companyBuilder_;
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the company field is set.
     */
    public boolean hasCompany() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The company.
     */
    public com.google.cloud.talent.v4.Company getCompany() {
      if (companyBuilder_ == null) {
        return company_ == null ? com.google.cloud.talent.v4.Company.getDefaultInstance() : company_;
      } else {
        return companyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCompany(com.google.cloud.talent.v4.Company value) {
      if (companyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        company_ = value;
      } else {
        companyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setCompany(
        com.google.cloud.talent.v4.Company.Builder builderForValue) {
      if (companyBuilder_ == null) {
        company_ = builderForValue.build();
      } else {
        companyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeCompany(com.google.cloud.talent.v4.Company value) {
      if (companyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          company_ != null &&
          company_ != com.google.cloud.talent.v4.Company.getDefaultInstance()) {
          getCompanyBuilder().mergeFrom(value);
        } else {
          company_ = value;
        }
      } else {
        companyBuilder_.mergeFrom(value);
      }
      if (company_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearCompany() {
      bitField0_ = (bitField0_ & ~0x00000002);
      company_ = null;
      if (companyBuilder_ != null) {
        companyBuilder_.dispose();
        companyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.talent.v4.Company.Builder getCompanyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCompanyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.talent.v4.CompanyOrBuilder getCompanyOrBuilder() {
      if (companyBuilder_ != null) {
        return companyBuilder_.getMessageOrBuilder();
      } else {
        return company_ == null ?
            com.google.cloud.talent.v4.Company.getDefaultInstance() : company_;
      }
    }
    /**
     * <pre>
     * Required. The company to be created.
     * </pre>
     *
     * <code>.google.cloud.talent.v4.Company company = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.talent.v4.Company, com.google.cloud.talent.v4.Company.Builder, com.google.cloud.talent.v4.CompanyOrBuilder> 
        getCompanyFieldBuilder() {
      if (companyBuilder_ == null) {
        companyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.talent.v4.Company, com.google.cloud.talent.v4.Company.Builder, com.google.cloud.talent.v4.CompanyOrBuilder>(
                getCompany(),
                getParentForChildren(),
                isClean());
        company_ = null;
      }
      return companyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4.CreateCompanyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4.CreateCompanyRequest)
  private static final com.google.cloud.talent.v4.CreateCompanyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4.CreateCompanyRequest();
  }

  public static com.google.cloud.talent.v4.CreateCompanyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCompanyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCompanyRequest>() {
    @java.lang.Override
    public CreateCompanyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCompanyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCompanyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4.CreateCompanyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

