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
// source: google/maps/routing/v2/routes_service.proto

package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * A single destination for ComputeRouteMatrixRequest
 * </pre>
 *
 * Protobuf type {@code google.maps.routing.v2.RouteMatrixDestination}
 */
public final class RouteMatrixDestination extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.routing.v2.RouteMatrixDestination)
    RouteMatrixDestinationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RouteMatrixDestination.newBuilder() to construct.
  private RouteMatrixDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RouteMatrixDestination() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RouteMatrixDestination();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.routing.v2.RoutesServiceProto
        .internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routing.v2.RoutesServiceProto
        .internal_static_google_maps_routing_v2_RouteMatrixDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routing.v2.RouteMatrixDestination.class,
            com.google.maps.routing.v2.RouteMatrixDestination.Builder.class);
  }

  public static final int WAYPOINT_FIELD_NUMBER = 1;
  private com.google.maps.routing.v2.Waypoint waypoint_;
  /**
   *
   *
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the waypoint field is set.
   */
  @java.lang.Override
  public boolean hasWaypoint() {
    return waypoint_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The waypoint.
   */
  @java.lang.Override
  public com.google.maps.routing.v2.Waypoint getWaypoint() {
    return waypoint_ == null ? com.google.maps.routing.v2.Waypoint.getDefaultInstance() : waypoint_;
  }
  /**
   *
   *
   * <pre>
   * Required. Destination waypoint
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.maps.routing.v2.WaypointOrBuilder getWaypointOrBuilder() {
    return waypoint_ == null ? com.google.maps.routing.v2.Waypoint.getDefaultInstance() : waypoint_;
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
    if (waypoint_ != null) {
      output.writeMessage(1, getWaypoint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (waypoint_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWaypoint());
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
    if (!(obj instanceof com.google.maps.routing.v2.RouteMatrixDestination)) {
      return super.equals(obj);
    }
    com.google.maps.routing.v2.RouteMatrixDestination other =
        (com.google.maps.routing.v2.RouteMatrixDestination) obj;

    if (hasWaypoint() != other.hasWaypoint()) return false;
    if (hasWaypoint()) {
      if (!getWaypoint().equals(other.getWaypoint())) return false;
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
    if (hasWaypoint()) {
      hash = (37 * hash) + WAYPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getWaypoint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination parseFrom(
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

  public static Builder newBuilder(com.google.maps.routing.v2.RouteMatrixDestination prototype) {
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
   * A single destination for ComputeRouteMatrixRequest
   * </pre>
   *
   * Protobuf type {@code google.maps.routing.v2.RouteMatrixDestination}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.routing.v2.RouteMatrixDestination)
      com.google.maps.routing.v2.RouteMatrixDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.routing.v2.RoutesServiceProto
          .internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routing.v2.RoutesServiceProto
          .internal_static_google_maps_routing_v2_RouteMatrixDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routing.v2.RouteMatrixDestination.class,
              com.google.maps.routing.v2.RouteMatrixDestination.Builder.class);
    }

    // Construct using com.google.maps.routing.v2.RouteMatrixDestination.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      waypoint_ = null;
      if (waypointBuilder_ != null) {
        waypointBuilder_.dispose();
        waypointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.routing.v2.RoutesServiceProto
          .internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.RouteMatrixDestination getDefaultInstanceForType() {
      return com.google.maps.routing.v2.RouteMatrixDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routing.v2.RouteMatrixDestination build() {
      com.google.maps.routing.v2.RouteMatrixDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.RouteMatrixDestination buildPartial() {
      com.google.maps.routing.v2.RouteMatrixDestination result =
          new com.google.maps.routing.v2.RouteMatrixDestination(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.routing.v2.RouteMatrixDestination result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.waypoint_ = waypointBuilder_ == null ? waypoint_ : waypointBuilder_.build();
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
      if (other instanceof com.google.maps.routing.v2.RouteMatrixDestination) {
        return mergeFrom((com.google.maps.routing.v2.RouteMatrixDestination) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routing.v2.RouteMatrixDestination other) {
      if (other == com.google.maps.routing.v2.RouteMatrixDestination.getDefaultInstance())
        return this;
      if (other.hasWaypoint()) {
        mergeWaypoint(other.getWaypoint());
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
                input.readMessage(getWaypointFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.maps.routing.v2.Waypoint waypoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routing.v2.Waypoint,
            com.google.maps.routing.v2.Waypoint.Builder,
            com.google.maps.routing.v2.WaypointOrBuilder>
        waypointBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the waypoint field is set.
     */
    public boolean hasWaypoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The waypoint.
     */
    public com.google.maps.routing.v2.Waypoint getWaypoint() {
      if (waypointBuilder_ == null) {
        return waypoint_ == null
            ? com.google.maps.routing.v2.Waypoint.getDefaultInstance()
            : waypoint_;
      } else {
        return waypointBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWaypoint(com.google.maps.routing.v2.Waypoint value) {
      if (waypointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        waypoint_ = value;
      } else {
        waypointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWaypoint(com.google.maps.routing.v2.Waypoint.Builder builderForValue) {
      if (waypointBuilder_ == null) {
        waypoint_ = builderForValue.build();
      } else {
        waypointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWaypoint(com.google.maps.routing.v2.Waypoint value) {
      if (waypointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && waypoint_ != null
            && waypoint_ != com.google.maps.routing.v2.Waypoint.getDefaultInstance()) {
          getWaypointBuilder().mergeFrom(value);
        } else {
          waypoint_ = value;
        }
      } else {
        waypointBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWaypoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      waypoint_ = null;
      if (waypointBuilder_ != null) {
        waypointBuilder_.dispose();
        waypointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.maps.routing.v2.Waypoint.Builder getWaypointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWaypointFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.maps.routing.v2.WaypointOrBuilder getWaypointOrBuilder() {
      if (waypointBuilder_ != null) {
        return waypointBuilder_.getMessageOrBuilder();
      } else {
        return waypoint_ == null
            ? com.google.maps.routing.v2.Waypoint.getDefaultInstance()
            : waypoint_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Destination waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routing.v2.Waypoint,
            com.google.maps.routing.v2.Waypoint.Builder,
            com.google.maps.routing.v2.WaypointOrBuilder>
        getWaypointFieldBuilder() {
      if (waypointBuilder_ == null) {
        waypointBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.maps.routing.v2.Waypoint,
                com.google.maps.routing.v2.Waypoint.Builder,
                com.google.maps.routing.v2.WaypointOrBuilder>(
                getWaypoint(), getParentForChildren(), isClean());
        waypoint_ = null;
      }
      return waypointBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.maps.routing.v2.RouteMatrixDestination)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routing.v2.RouteMatrixDestination)
  private static final com.google.maps.routing.v2.RouteMatrixDestination DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.routing.v2.RouteMatrixDestination();
  }

  public static com.google.maps.routing.v2.RouteMatrixDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteMatrixDestination> PARSER =
      new com.google.protobuf.AbstractParser<RouteMatrixDestination>() {
        @java.lang.Override
        public RouteMatrixDestination parsePartialFrom(
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

  public static com.google.protobuf.Parser<RouteMatrixDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteMatrixDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routing.v2.RouteMatrixDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
