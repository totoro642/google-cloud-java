// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

/**
 * <pre>
 * Status of an entity (resource, deployment).
 * </pre>
 *
 * Protobuf enum {@code google.cloud.telcoautomation.v1alpha1.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown state.
   * </pre>
   *
   * <code>STATUS_UNSPECIFIED = 0;</code>
   */
  STATUS_UNSPECIFIED(0),
  /**
   * <pre>
   * Under progress.
   * </pre>
   *
   * <code>STATUS_IN_PROGRESS = 1;</code>
   */
  STATUS_IN_PROGRESS(1),
  /**
   * <pre>
   * Running and ready to serve traffic.
   * </pre>
   *
   * <code>STATUS_ACTIVE = 2;</code>
   */
  STATUS_ACTIVE(2),
  /**
   * <pre>
   * Failed or stalled.
   * </pre>
   *
   * <code>STATUS_FAILED = 3;</code>
   */
  STATUS_FAILED(3),
  /**
   * <pre>
   * Delete in progress.
   * </pre>
   *
   * <code>STATUS_DELETING = 4;</code>
   */
  STATUS_DELETING(4),
  /**
   * <pre>
   * Deleted deployment.
   * </pre>
   *
   * <code>STATUS_DELETED = 5;</code>
   */
  STATUS_DELETED(5),
  /**
   * <pre>
   * NFDeploy specific status. Peering in progress.
   * </pre>
   *
   * <code>STATUS_PEERING = 10;</code>
   */
  STATUS_PEERING(10),
  /**
   * <pre>
   * K8s objects such as NetworkAttachmentDefinition don't have a defined
   * status.
   * </pre>
   *
   * <code>STATUS_NOT_APPLICABLE = 11;</code>
   */
  STATUS_NOT_APPLICABLE(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown state.
   * </pre>
   *
   * <code>STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Under progress.
   * </pre>
   *
   * <code>STATUS_IN_PROGRESS = 1;</code>
   */
  public static final int STATUS_IN_PROGRESS_VALUE = 1;
  /**
   * <pre>
   * Running and ready to serve traffic.
   * </pre>
   *
   * <code>STATUS_ACTIVE = 2;</code>
   */
  public static final int STATUS_ACTIVE_VALUE = 2;
  /**
   * <pre>
   * Failed or stalled.
   * </pre>
   *
   * <code>STATUS_FAILED = 3;</code>
   */
  public static final int STATUS_FAILED_VALUE = 3;
  /**
   * <pre>
   * Delete in progress.
   * </pre>
   *
   * <code>STATUS_DELETING = 4;</code>
   */
  public static final int STATUS_DELETING_VALUE = 4;
  /**
   * <pre>
   * Deleted deployment.
   * </pre>
   *
   * <code>STATUS_DELETED = 5;</code>
   */
  public static final int STATUS_DELETED_VALUE = 5;
  /**
   * <pre>
   * NFDeploy specific status. Peering in progress.
   * </pre>
   *
   * <code>STATUS_PEERING = 10;</code>
   */
  public static final int STATUS_PEERING_VALUE = 10;
  /**
   * <pre>
   * K8s objects such as NetworkAttachmentDefinition don't have a defined
   * status.
   * </pre>
   *
   * <code>STATUS_NOT_APPLICABLE = 11;</code>
   */
  public static final int STATUS_NOT_APPLICABLE_VALUE = 11;


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
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Status forNumber(int value) {
    switch (value) {
      case 0: return STATUS_UNSPECIFIED;
      case 1: return STATUS_IN_PROGRESS;
      case 2: return STATUS_ACTIVE;
      case 3: return STATUS_FAILED;
      case 4: return STATUS_DELETING;
      case 5: return STATUS_DELETED;
      case 10: return STATUS_PEERING;
      case 11: return STATUS_NOT_APPLICABLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final Status[] VALUES = values();

  public static Status valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.telcoautomation.v1alpha1.Status)
}

