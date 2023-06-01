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
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

/**
 *
 *
 * <pre>
 * A request message for updating an SSH public key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oslogin.v1.UpdateSshPublicKeyRequest}
 */
public final class UpdateSshPublicKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
    UpdateSshPublicKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateSshPublicKeyRequest.newBuilder() to construct.
  private UpdateSshPublicKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateSshPublicKeyRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateSshPublicKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.oslogin.v1.OsLoginProto
        .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oslogin.v1.OsLoginProto
        .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.class,
            com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The fingerprint of the public key to update. Public keys are
   * identified by their SHA-256 fingerprint. The fingerprint of the public key
   * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The fingerprint of the public key to update. Public keys are
   * identified by their SHA-256 fingerprint. The fingerprint of the public key
   * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSH_PUBLIC_KEY_FIELD_NUMBER = 2;
  private com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey sshPublicKey_;
  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the sshPublicKey field is set.
   */
  @java.lang.Override
  public boolean hasSshPublicKey() {
    return sshPublicKey_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sshPublicKey.
   */
  @java.lang.Override
  public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey() {
    return sshPublicKey_ == null
        ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()
        : sshPublicKey_;
  }
  /**
   *
   *
   * <pre>
   * Required. The SSH public key and expiration time.
   * </pre>
   *
   * <code>
   * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder
      getSshPublicKeyOrBuilder() {
    return sshPublicKey_ == null
        ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()
        : sshPublicKey_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Mask to control which fields get updated. Updates all if not present.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (sshPublicKey_ != null) {
      output.writeMessage(2, getSshPublicKey());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
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
    if (sshPublicKey_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSshPublicKey());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest other =
        (com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasSshPublicKey() != other.hasSshPublicKey()) return false;
    if (hasSshPublicKey()) {
      if (!getSshPublicKey().equals(other.getSshPublicKey())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasSshPublicKey()) {
      hash = (37 * hash) + SSH_PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getSshPublicKey().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest parseFrom(
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
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest prototype) {
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
   * A request message for updating an SSH public key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oslogin.v1.UpdateSshPublicKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.class,
              com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      sshPublicKey_ = null;
      if (sshPublicKeyBuilder_ != null) {
        sshPublicKeyBuilder_.dispose();
        sshPublicKeyBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_UpdateSshPublicKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest build() {
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest buildPartial() {
      com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest result =
          new com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sshPublicKey_ =
            sshPublicKeyBuilder_ == null ? sshPublicKey_ : sshPublicKeyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) {
        return mergeFrom((com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest other) {
      if (other == com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSshPublicKey()) {
        mergeSshPublicKey(other.getSshPublicKey());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getSshPublicKeyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are
     * identified by their SHA-256 fingerprint. The fingerprint of the public key
     * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are
     * identified by their SHA-256 fingerprint. The fingerprint of the public key
     * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are
     * identified by their SHA-256 fingerprint. The fingerprint of the public key
     * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are
     * identified by their SHA-256 fingerprint. The fingerprint of the public key
     * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The fingerprint of the public key to update. Public keys are
     * identified by their SHA-256 fingerprint. The fingerprint of the public key
     * is in format `users/{user}/sshPublicKeys/{fingerprint}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey sshPublicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder>
        sshPublicKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the sshPublicKey field is set.
     */
    public boolean hasSshPublicKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The sshPublicKey.
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKey() {
      if (sshPublicKeyBuilder_ == null) {
        return sshPublicKey_ == null
            ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()
            : sshPublicKey_;
      } else {
        return sshPublicKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSshPublicKey(
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey value) {
      if (sshPublicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sshPublicKey_ = value;
      } else {
        sshPublicKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSshPublicKey(
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder builderForValue) {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKey_ = builderForValue.build();
      } else {
        sshPublicKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSshPublicKey(
        com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey value) {
      if (sshPublicKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && sshPublicKey_ != null
            && sshPublicKey_
                != com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()) {
          getSshPublicKeyBuilder().mergeFrom(value);
        } else {
          sshPublicKey_ = value;
        }
      } else {
        sshPublicKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSshPublicKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sshPublicKey_ = null;
      if (sshPublicKeyBuilder_ != null) {
        sshPublicKeyBuilder_.dispose();
        sshPublicKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder
        getSshPublicKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSshPublicKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder
        getSshPublicKeyOrBuilder() {
      if (sshPublicKeyBuilder_ != null) {
        return sshPublicKeyBuilder_.getMessageOrBuilder();
      } else {
        return sshPublicKey_ == null
            ? com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.getDefaultInstance()
            : sshPublicKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SSH public key and expiration time.
     * </pre>
     *
     * <code>
     * .google.cloud.oslogin.common.SshPublicKey ssh_public_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder,
            com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder>
        getSshPublicKeyFieldBuilder() {
      if (sshPublicKeyBuilder_ == null) {
        sshPublicKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey,
                com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey.Builder,
                com.google.cloud.oslogin.common.OsLoginProto.SshPublicKeyOrBuilder>(
                getSshPublicKey(), getParentForChildren(), isClean());
        sshPublicKey_ = null;
      }
      return sshPublicKeyBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000004);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Mask to control which fields get updated. Updates all if not present.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oslogin.v1.UpdateSshPublicKeyRequest)
  private static final com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest();
  }

  public static com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSshPublicKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateSshPublicKeyRequest>() {
        @java.lang.Override
        public UpdateSshPublicKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSshPublicKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSshPublicKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oslogin.v1.UpdateSshPublicKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
