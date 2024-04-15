// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1;

/**
 * <pre>
 * Request object for `GetDeployment`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.telcoautomation.v1.GetDeploymentRequest}
 */
public final class GetDeploymentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.telcoautomation.v1.GetDeploymentRequest)
    GetDeploymentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDeploymentRequest.newBuilder() to construct.
  private GetDeploymentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDeploymentRequest() {
    name_ = "";
    view_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDeploymentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_GetDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_GetDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.telcoautomation.v1.GetDeploymentRequest.class, com.google.cloud.telcoautomation.v1.GetDeploymentRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The name of the deployment.
   * Case 1: If the name provided in the request is
   * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
   * returned.
   * Case 2: If the name provided in the request is {deployment}, then
   * the current state of the deployment is returned.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the deployment.
   * Case 1: If the name provided in the request is
   * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
   * returned.
   * Case 2: If the name provided in the request is {deployment}, then
   * the current state of the deployment is returned.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 2;
  private int view_ = 0;
  /**
   * <pre>
   * Optional. Defines the type of view of the deployment.
   * When field is not present VIEW_BASIC is considered as default.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override public int getViewValue() {
    return view_;
  }
  /**
   * <pre>
   * Optional. Defines the type of view of the deployment.
   * When field is not present VIEW_BASIC is considered as default.
   * </pre>
   *
   * <code>.google.cloud.telcoautomation.v1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The view.
   */
  @java.lang.Override public com.google.cloud.telcoautomation.v1.DeploymentView getView() {
    com.google.cloud.telcoautomation.v1.DeploymentView result = com.google.cloud.telcoautomation.v1.DeploymentView.forNumber(view_);
    return result == null ? com.google.cloud.telcoautomation.v1.DeploymentView.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (view_ != com.google.cloud.telcoautomation.v1.DeploymentView.DEPLOYMENT_VIEW_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, view_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (view_ != com.google.cloud.telcoautomation.v1.DeploymentView.DEPLOYMENT_VIEW_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, view_);
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
    if (!(obj instanceof com.google.cloud.telcoautomation.v1.GetDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.telcoautomation.v1.GetDeploymentRequest other = (com.google.cloud.telcoautomation.v1.GetDeploymentRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (view_ != other.view_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.telcoautomation.v1.GetDeploymentRequest prototype) {
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
   * Request object for `GetDeployment`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.telcoautomation.v1.GetDeploymentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.telcoautomation.v1.GetDeploymentRequest)
      com.google.cloud.telcoautomation.v1.GetDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_GetDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_GetDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.telcoautomation.v1.GetDeploymentRequest.class, com.google.cloud.telcoautomation.v1.GetDeploymentRequest.Builder.class);
    }

    // Construct using com.google.cloud.telcoautomation.v1.GetDeploymentRequest.newBuilder()
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
      name_ = "";
      view_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.telcoautomation.v1.TelcoautomationProto.internal_static_google_cloud_telcoautomation_v1_GetDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.GetDeploymentRequest getDefaultInstanceForType() {
      return com.google.cloud.telcoautomation.v1.GetDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.GetDeploymentRequest build() {
      com.google.cloud.telcoautomation.v1.GetDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.GetDeploymentRequest buildPartial() {
      com.google.cloud.telcoautomation.v1.GetDeploymentRequest result = new com.google.cloud.telcoautomation.v1.GetDeploymentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.telcoautomation.v1.GetDeploymentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.view_ = view_;
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
      if (other instanceof com.google.cloud.telcoautomation.v1.GetDeploymentRequest) {
        return mergeFrom((com.google.cloud.telcoautomation.v1.GetDeploymentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.telcoautomation.v1.GetDeploymentRequest other) {
      if (other == com.google.cloud.telcoautomation.v1.GetDeploymentRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              view_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The name of the deployment.
     * Case 1: If the name provided in the request is
     * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
     * returned.
     * Case 2: If the name provided in the request is {deployment}, then
     * the current state of the deployment is returned.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the deployment.
     * Case 1: If the name provided in the request is
     * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
     * returned.
     * Case 2: If the name provided in the request is {deployment}, then
     * the current state of the deployment is returned.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the deployment.
     * Case 1: If the name provided in the request is
     * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
     * returned.
     * Case 2: If the name provided in the request is {deployment}, then
     * the current state of the deployment is returned.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the deployment.
     * Case 1: If the name provided in the request is
     * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
     * returned.
     * Case 2: If the name provided in the request is {deployment}, then
     * the current state of the deployment is returned.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the deployment.
     * Case 1: If the name provided in the request is
     * {deployment_id}&#64;{revision_id}, then the revision with revision_id will be
     * returned.
     * Case 2: If the name provided in the request is {deployment}, then
     * the current state of the deployment is returned.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     * <pre>
     * Optional. Defines the type of view of the deployment.
     * When field is not present VIEW_BASIC is considered as default.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override public int getViewValue() {
      return view_;
    }
    /**
     * <pre>
     * Optional. Defines the type of view of the deployment.
     * When field is not present VIEW_BASIC is considered as default.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {
      view_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Defines the type of view of the deployment.
     * When field is not present VIEW_BASIC is considered as default.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The view.
     */
    @java.lang.Override
    public com.google.cloud.telcoautomation.v1.DeploymentView getView() {
      com.google.cloud.telcoautomation.v1.DeploymentView result = com.google.cloud.telcoautomation.v1.DeploymentView.forNumber(view_);
      return result == null ? com.google.cloud.telcoautomation.v1.DeploymentView.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional. Defines the type of view of the deployment.
     * When field is not present VIEW_BASIC is considered as default.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.cloud.telcoautomation.v1.DeploymentView value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Defines the type of view of the deployment.
     * When field is not present VIEW_BASIC is considered as default.
     * </pre>
     *
     * <code>.google.cloud.telcoautomation.v1.DeploymentView view = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000002);
      view_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.telcoautomation.v1.GetDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.telcoautomation.v1.GetDeploymentRequest)
  private static final com.google.cloud.telcoautomation.v1.GetDeploymentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.telcoautomation.v1.GetDeploymentRequest();
  }

  public static com.google.cloud.telcoautomation.v1.GetDeploymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDeploymentRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetDeploymentRequest>() {
    @java.lang.Override
    public GetDeploymentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.telcoautomation.v1.GetDeploymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

