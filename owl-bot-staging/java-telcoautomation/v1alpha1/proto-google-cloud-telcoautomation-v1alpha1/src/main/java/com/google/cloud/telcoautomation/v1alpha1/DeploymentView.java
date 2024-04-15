// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

/**
 * <pre>
 * DeploymentView defines the type of view of the deployment.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.telcoautomation.v1alpha1.DeploymentView}
 */
public enum DeploymentView
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified enum value.
   * </pre>
   *
   * <code>DEPLOYMENT_VIEW_UNSPECIFIED = 0;</code>
   */
  DEPLOYMENT_VIEW_UNSPECIFIED(0),
  /**
   * <pre>
   * View which only contains metadata.
   * </pre>
   *
   * <code>DEPLOYMENT_VIEW_BASIC = 1;</code>
   */
  DEPLOYMENT_VIEW_BASIC(1),
  /**
   * <pre>
   * View which contains metadata and files it encapsulates.
   * </pre>
   *
   * <code>DEPLOYMENT_VIEW_FULL = 2;</code>
   */
  DEPLOYMENT_VIEW_FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified enum value.
   * </pre>
   *
   * <code>DEPLOYMENT_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int DEPLOYMENT_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * View which only contains metadata.
   * </pre>
   *
   * <code>DEPLOYMENT_VIEW_BASIC = 1;</code>
   */
  public static final int DEPLOYMENT_VIEW_BASIC_VALUE = 1;
  /**
   * <pre>
   * View which contains metadata and files it encapsulates.
   * </pre>
   *
   * <code>DEPLOYMENT_VIEW_FULL = 2;</code>
   */
  public static final int DEPLOYMENT_VIEW_FULL_VALUE = 2;


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
  public static DeploymentView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeploymentView forNumber(int value) {
    switch (value) {
      case 0: return DEPLOYMENT_VIEW_UNSPECIFIED;
      case 1: return DEPLOYMENT_VIEW_BASIC;
      case 2: return DEPLOYMENT_VIEW_FULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeploymentView>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeploymentView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeploymentView>() {
          public DeploymentView findValueByNumber(int number) {
            return DeploymentView.forNumber(number);
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
    return com.google.cloud.telcoautomation.v1alpha1.TelcoautomationProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final DeploymentView[] VALUES = values();

  public static DeploymentView valueOf(
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

  private DeploymentView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.telcoautomation.v1alpha1.DeploymentView)
}

