// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface FunctionDeclarationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.FunctionDeclaration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the function to call.
   * Must start with a letter or an underscore.
   * Must be a-z, A-Z, 0-9, or contain underscores, dots and dashes, with a
   * maximum length of 64.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the function to call.
   * Must start with a letter or an underscore.
   * Must be a-z, A-Z, 0-9, or contain underscores, dots and dashes, with a
   * maximum length of 64.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Description and purpose of the function.
   * Model uses it to decide how and whether to call the function.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Description and purpose of the function.
   * Model uses it to decide how and whether to call the function.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Optional. Describes the parameters to this function in JSON Schema Object
   * format. Reflects the Open API 3.03 Parameter Object. string Key: the name
   * of the parameter. Parameter names are case sensitive. Schema Value: the
   * Schema defining the type used for the parameter. For function with no
   * parameters, this can be left unset. Parameter names must start with a
   * letter or an underscore and must only contain chars a-z, A-Z, 0-9, or
   * underscores with a maximum length of 64. Example with 1 required and 1
   * optional parameter: type: OBJECT properties:
   *  param1:
   *    type: STRING
   *  param2:
   *    type: INTEGER
   * required:
   *  - param1
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Schema parameters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * Optional. Describes the parameters to this function in JSON Schema Object
   * format. Reflects the Open API 3.03 Parameter Object. string Key: the name
   * of the parameter. Parameter names are case sensitive. Schema Value: the
   * Schema defining the type used for the parameter. For function with no
   * parameters, this can be left unset. Parameter names must start with a
   * letter or an underscore and must only contain chars a-z, A-Z, 0-9, or
   * underscores with a maximum length of 64. Example with 1 required and 1
   * optional parameter: type: OBJECT properties:
   *  param1:
   *    type: STRING
   *  param2:
   *    type: INTEGER
   * required:
   *  - param1
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Schema parameters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The parameters.
   */
  com.google.cloud.aiplatform.v1.Schema getParameters();
  /**
   * <pre>
   * Optional. Describes the parameters to this function in JSON Schema Object
   * format. Reflects the Open API 3.03 Parameter Object. string Key: the name
   * of the parameter. Parameter names are case sensitive. Schema Value: the
   * Schema defining the type used for the parameter. For function with no
   * parameters, this can be left unset. Parameter names must start with a
   * letter or an underscore and must only contain chars a-z, A-Z, 0-9, or
   * underscores with a maximum length of 64. Example with 1 required and 1
   * optional parameter: type: OBJECT properties:
   *  param1:
   *    type: STRING
   *  param2:
   *    type: INTEGER
   * required:
   *  - param1
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Schema parameters = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.aiplatform.v1.SchemaOrBuilder getParametersOrBuilder();
}
