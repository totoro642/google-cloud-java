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
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

/** Protobuf type {@code google.iam.admin.v1.UndeleteServiceAccountResponse} */
public final class UndeleteServiceAccountResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.UndeleteServiceAccountResponse)
    UndeleteServiceAccountResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UndeleteServiceAccountResponse.newBuilder() to construct.
  private UndeleteServiceAccountResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UndeleteServiceAccountResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UndeleteServiceAccountResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_UndeleteServiceAccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_UndeleteServiceAccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.UndeleteServiceAccountResponse.class,
            com.google.iam.admin.v1.UndeleteServiceAccountResponse.Builder.class);
  }

  public static final int RESTORED_ACCOUNT_FIELD_NUMBER = 1;
  private com.google.iam.admin.v1.ServiceAccount restoredAccount_;
  /**
   *
   *
   * <pre>
   * Metadata for the restored service account.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
   *
   * @return Whether the restoredAccount field is set.
   */
  @java.lang.Override
  public boolean hasRestoredAccount() {
    return restoredAccount_ != null;
  }
  /**
   *
   *
   * <pre>
   * Metadata for the restored service account.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
   *
   * @return The restoredAccount.
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccount getRestoredAccount() {
    return restoredAccount_ == null
        ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
        : restoredAccount_;
  }
  /**
   *
   *
   * <pre>
   * Metadata for the restored service account.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
   */
  @java.lang.Override
  public com.google.iam.admin.v1.ServiceAccountOrBuilder getRestoredAccountOrBuilder() {
    return restoredAccount_ == null
        ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
        : restoredAccount_;
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
    if (restoredAccount_ != null) {
      output.writeMessage(1, getRestoredAccount());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (restoredAccount_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRestoredAccount());
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
    if (!(obj instanceof com.google.iam.admin.v1.UndeleteServiceAccountResponse)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.UndeleteServiceAccountResponse other =
        (com.google.iam.admin.v1.UndeleteServiceAccountResponse) obj;

    if (hasRestoredAccount() != other.hasRestoredAccount()) return false;
    if (hasRestoredAccount()) {
      if (!getRestoredAccount().equals(other.getRestoredAccount())) return false;
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
    if (hasRestoredAccount()) {
      hash = (37 * hash) + RESTORED_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getRestoredAccount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse parseFrom(
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
      com.google.iam.admin.v1.UndeleteServiceAccountResponse prototype) {
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
  /** Protobuf type {@code google.iam.admin.v1.UndeleteServiceAccountResponse} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.UndeleteServiceAccountResponse)
      com.google.iam.admin.v1.UndeleteServiceAccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_UndeleteServiceAccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_UndeleteServiceAccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.UndeleteServiceAccountResponse.class,
              com.google.iam.admin.v1.UndeleteServiceAccountResponse.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.UndeleteServiceAccountResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      restoredAccount_ = null;
      if (restoredAccountBuilder_ != null) {
        restoredAccountBuilder_.dispose();
        restoredAccountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_UndeleteServiceAccountResponse_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.UndeleteServiceAccountResponse getDefaultInstanceForType() {
      return com.google.iam.admin.v1.UndeleteServiceAccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.UndeleteServiceAccountResponse build() {
      com.google.iam.admin.v1.UndeleteServiceAccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.UndeleteServiceAccountResponse buildPartial() {
      com.google.iam.admin.v1.UndeleteServiceAccountResponse result =
          new com.google.iam.admin.v1.UndeleteServiceAccountResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.admin.v1.UndeleteServiceAccountResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.restoredAccount_ =
            restoredAccountBuilder_ == null ? restoredAccount_ : restoredAccountBuilder_.build();
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
      if (other instanceof com.google.iam.admin.v1.UndeleteServiceAccountResponse) {
        return mergeFrom((com.google.iam.admin.v1.UndeleteServiceAccountResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.UndeleteServiceAccountResponse other) {
      if (other == com.google.iam.admin.v1.UndeleteServiceAccountResponse.getDefaultInstance())
        return this;
      if (other.hasRestoredAccount()) {
        mergeRestoredAccount(other.getRestoredAccount());
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
                input.readMessage(getRestoredAccountFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.iam.admin.v1.ServiceAccount restoredAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.admin.v1.ServiceAccount,
            com.google.iam.admin.v1.ServiceAccount.Builder,
            com.google.iam.admin.v1.ServiceAccountOrBuilder>
        restoredAccountBuilder_;
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     *
     * @return Whether the restoredAccount field is set.
     */
    public boolean hasRestoredAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     *
     * @return The restoredAccount.
     */
    public com.google.iam.admin.v1.ServiceAccount getRestoredAccount() {
      if (restoredAccountBuilder_ == null) {
        return restoredAccount_ == null
            ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
            : restoredAccount_;
      } else {
        return restoredAccountBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     */
    public Builder setRestoredAccount(com.google.iam.admin.v1.ServiceAccount value) {
      if (restoredAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        restoredAccount_ = value;
      } else {
        restoredAccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     */
    public Builder setRestoredAccount(
        com.google.iam.admin.v1.ServiceAccount.Builder builderForValue) {
      if (restoredAccountBuilder_ == null) {
        restoredAccount_ = builderForValue.build();
      } else {
        restoredAccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     */
    public Builder mergeRestoredAccount(com.google.iam.admin.v1.ServiceAccount value) {
      if (restoredAccountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && restoredAccount_ != null
            && restoredAccount_ != com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()) {
          getRestoredAccountBuilder().mergeFrom(value);
        } else {
          restoredAccount_ = value;
        }
      } else {
        restoredAccountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     */
    public Builder clearRestoredAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      restoredAccount_ = null;
      if (restoredAccountBuilder_ != null) {
        restoredAccountBuilder_.dispose();
        restoredAccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     */
    public com.google.iam.admin.v1.ServiceAccount.Builder getRestoredAccountBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRestoredAccountFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     */
    public com.google.iam.admin.v1.ServiceAccountOrBuilder getRestoredAccountOrBuilder() {
      if (restoredAccountBuilder_ != null) {
        return restoredAccountBuilder_.getMessageOrBuilder();
      } else {
        return restoredAccount_ == null
            ? com.google.iam.admin.v1.ServiceAccount.getDefaultInstance()
            : restoredAccount_;
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the restored service account.
     * </pre>
     *
     * <code>.google.iam.admin.v1.ServiceAccount restored_account = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.iam.admin.v1.ServiceAccount,
            com.google.iam.admin.v1.ServiceAccount.Builder,
            com.google.iam.admin.v1.ServiceAccountOrBuilder>
        getRestoredAccountFieldBuilder() {
      if (restoredAccountBuilder_ == null) {
        restoredAccountBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.iam.admin.v1.ServiceAccount,
                com.google.iam.admin.v1.ServiceAccount.Builder,
                com.google.iam.admin.v1.ServiceAccountOrBuilder>(
                getRestoredAccount(), getParentForChildren(), isClean());
        restoredAccount_ = null;
      }
      return restoredAccountBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.UndeleteServiceAccountResponse)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.UndeleteServiceAccountResponse)
  private static final com.google.iam.admin.v1.UndeleteServiceAccountResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.UndeleteServiceAccountResponse();
  }

  public static com.google.iam.admin.v1.UndeleteServiceAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UndeleteServiceAccountResponse> PARSER =
      new com.google.protobuf.AbstractParser<UndeleteServiceAccountResponse>() {
        @java.lang.Override
        public UndeleteServiceAccountResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UndeleteServiceAccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UndeleteServiceAccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.UndeleteServiceAccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
