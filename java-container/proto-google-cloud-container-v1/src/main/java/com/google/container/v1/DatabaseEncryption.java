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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Configuration of etcd encryption.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.DatabaseEncryption}
 */
public final class DatabaseEncryption extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.DatabaseEncryption)
    DatabaseEncryptionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DatabaseEncryption.newBuilder() to construct.
  private DatabaseEncryption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DatabaseEncryption() {
    keyName_ = "";
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DatabaseEncryption();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_DatabaseEncryption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_DatabaseEncryption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.DatabaseEncryption.class,
            com.google.container.v1.DatabaseEncryption.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * State of etcd encryption.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.DatabaseEncryption.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should never be set
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     *
     *
     * <pre>
     * Secrets in etcd are encrypted.
     * </pre>
     *
     * <code>ENCRYPTED = 1;</code>
     */
    ENCRYPTED(1),
    /**
     *
     *
     * <pre>
     * Secrets in etcd are stored in plain text (at etcd level) - this is
     * unrelated to Compute Engine level full disk encryption.
     * </pre>
     *
     * <code>DECRYPTED = 2;</code>
     */
    DECRYPTED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should never be set
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Secrets in etcd are encrypted.
     * </pre>
     *
     * <code>ENCRYPTED = 1;</code>
     */
    public static final int ENCRYPTED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Secrets in etcd are stored in plain text (at etcd level) - this is
     * unrelated to Compute Engine level full disk encryption.
     * </pre>
     *
     * <code>DECRYPTED = 2;</code>
     */
    public static final int DECRYPTED_VALUE = 2;

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
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return UNKNOWN;
        case 1:
          return ENCRYPTED;
        case 2:
          return DECRYPTED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
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
      return com.google.container.v1.DatabaseEncryption.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.DatabaseEncryption.State)
  }

  public static final int KEY_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object keyName_ = "";
  /**
   *
   *
   * <pre>
   * Name of CloudKMS key to use for the encryption of secrets in etcd.
   * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
   * </pre>
   *
   * <code>string key_name = 1;</code>
   *
   * @return The keyName.
   */
  @java.lang.Override
  public java.lang.String getKeyName() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of CloudKMS key to use for the encryption of secrets in etcd.
   * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
   * </pre>
   *
   * <code>string key_name = 1;</code>
   *
   * @return The bytes for keyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyNameBytes() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_ = 0;
  /**
   *
   *
   * <pre>
   * The desired state of etcd encryption.
   * </pre>
   *
   * <code>.google.container.v1.DatabaseEncryption.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * The desired state of etcd encryption.
   * </pre>
   *
   * <code>.google.container.v1.DatabaseEncryption.State state = 2;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.container.v1.DatabaseEncryption.State getState() {
    com.google.container.v1.DatabaseEncryption.State result =
        com.google.container.v1.DatabaseEncryption.State.forNumber(state_);
    return result == null ? com.google.container.v1.DatabaseEncryption.State.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyName_);
    }
    if (state_ != com.google.container.v1.DatabaseEncryption.State.UNKNOWN.getNumber()) {
      output.writeEnum(2, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyName_);
    }
    if (state_ != com.google.container.v1.DatabaseEncryption.State.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, state_);
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
    if (!(obj instanceof com.google.container.v1.DatabaseEncryption)) {
      return super.equals(obj);
    }
    com.google.container.v1.DatabaseEncryption other =
        (com.google.container.v1.DatabaseEncryption) obj;

    if (!getKeyName().equals(other.getKeyName())) return false;
    if (state_ != other.state_) return false;
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
    hash = (37 * hash) + KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKeyName().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.DatabaseEncryption parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.DatabaseEncryption parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.DatabaseEncryption parseFrom(
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

  public static Builder newBuilder(com.google.container.v1.DatabaseEncryption prototype) {
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
   * Configuration of etcd encryption.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.DatabaseEncryption}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.DatabaseEncryption)
      com.google.container.v1.DatabaseEncryptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_DatabaseEncryption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_DatabaseEncryption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.DatabaseEncryption.class,
              com.google.container.v1.DatabaseEncryption.Builder.class);
    }

    // Construct using com.google.container.v1.DatabaseEncryption.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      keyName_ = "";
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_DatabaseEncryption_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.DatabaseEncryption getDefaultInstanceForType() {
      return com.google.container.v1.DatabaseEncryption.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.DatabaseEncryption build() {
      com.google.container.v1.DatabaseEncryption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.DatabaseEncryption buildPartial() {
      com.google.container.v1.DatabaseEncryption result =
          new com.google.container.v1.DatabaseEncryption(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.DatabaseEncryption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keyName_ = keyName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
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
      if (other instanceof com.google.container.v1.DatabaseEncryption) {
        return mergeFrom((com.google.container.v1.DatabaseEncryption) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.DatabaseEncryption other) {
      if (other == com.google.container.v1.DatabaseEncryption.getDefaultInstance()) return this;
      if (!other.getKeyName().isEmpty()) {
        keyName_ = other.keyName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
                keyName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                state_ = input.readEnum();
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

    private java.lang.Object keyName_ = "";
    /**
     *
     *
     * <pre>
     * Name of CloudKMS key to use for the encryption of secrets in etcd.
     * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @return The keyName.
     */
    public java.lang.String getKeyName() {
      java.lang.Object ref = keyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of CloudKMS key to use for the encryption of secrets in etcd.
     * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @return The bytes for keyName.
     */
    public com.google.protobuf.ByteString getKeyNameBytes() {
      java.lang.Object ref = keyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of CloudKMS key to use for the encryption of secrets in etcd.
     * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @param value The keyName to set.
     * @return This builder for chaining.
     */
    public Builder setKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      keyName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of CloudKMS key to use for the encryption of secrets in etcd.
     * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyName() {
      keyName_ = getDefaultInstance().getKeyName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of CloudKMS key to use for the encryption of secrets in etcd.
     * Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * </pre>
     *
     * <code>string key_name = 1;</code>
     *
     * @param value The bytes for keyName to set.
     * @return This builder for chaining.
     */
    public Builder setKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      keyName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * The desired state of etcd encryption.
     * </pre>
     *
     * <code>.google.container.v1.DatabaseEncryption.State state = 2;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * The desired state of etcd encryption.
     * </pre>
     *
     * <code>.google.container.v1.DatabaseEncryption.State state = 2;</code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The desired state of etcd encryption.
     * </pre>
     *
     * <code>.google.container.v1.DatabaseEncryption.State state = 2;</code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.container.v1.DatabaseEncryption.State getState() {
      com.google.container.v1.DatabaseEncryption.State result =
          com.google.container.v1.DatabaseEncryption.State.forNumber(state_);
      return result == null
          ? com.google.container.v1.DatabaseEncryption.State.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The desired state of etcd encryption.
     * </pre>
     *
     * <code>.google.container.v1.DatabaseEncryption.State state = 2;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.container.v1.DatabaseEncryption.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The desired state of etcd encryption.
     * </pre>
     *
     * <code>.google.container.v1.DatabaseEncryption.State state = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1.DatabaseEncryption)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.DatabaseEncryption)
  private static final com.google.container.v1.DatabaseEncryption DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.DatabaseEncryption();
  }

  public static com.google.container.v1.DatabaseEncryption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatabaseEncryption> PARSER =
      new com.google.protobuf.AbstractParser<DatabaseEncryption>() {
        @java.lang.Override
        public DatabaseEncryption parsePartialFrom(
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

  public static com.google.protobuf.Parser<DatabaseEncryption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatabaseEncryption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.DatabaseEncryption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
