// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/intoto_provenance.proto

// Protobuf Java Version: 3.25.2
package io.grafeas.v1;

public interface CompletenessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Completeness)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, the builder claims that recipe.arguments is complete, meaning that
   * all external inputs are properly captured in the recipe.
   * </pre>
   *
   * <code>bool arguments = 1;</code>
   * @return The arguments.
   */
  boolean getArguments();

  /**
   * <pre>
   * If true, the builder claims that recipe.environment is claimed to be
   * complete.
   * </pre>
   *
   * <code>bool environment = 2;</code>
   * @return The environment.
   */
  boolean getEnvironment();

  /**
   * <pre>
   * If true, the builder claims that materials are complete, usually through
   * some controls to prevent network access. Sometimes called "hermetic".
   * </pre>
   *
   * <code>bool materials = 3;</code>
   * @return The materials.
   */
  boolean getMaterials();
}
