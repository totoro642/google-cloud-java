// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/custom_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface PythonPackageSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PythonPackageSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The URI of a container image in Artifact Registry that will run
   * the provided Python package. Vertex AI provides a wide range of executor
   * images with pre-installed packages to meet users' various use cases. See
   * the list of [pre-built containers for
   * training](https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
   * You must use an image from this list.
   * </pre>
   *
   * <code>string executor_image_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The executorImageUri.
   */
  java.lang.String getExecutorImageUri();
  /**
   * <pre>
   * Required. The URI of a container image in Artifact Registry that will run
   * the provided Python package. Vertex AI provides a wide range of executor
   * images with pre-installed packages to meet users' various use cases. See
   * the list of [pre-built containers for
   * training](https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
   * You must use an image from this list.
   * </pre>
   *
   * <code>string executor_image_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for executorImageUri.
   */
  com.google.protobuf.ByteString
      getExecutorImageUriBytes();

  /**
   * <pre>
   * Required. The Google Cloud Storage location of the Python package files
   * which are the training program and its dependent packages. The maximum
   * number of package URIs is 100.
   * </pre>
   *
   * <code>repeated string package_uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the packageUris.
   */
  java.util.List<java.lang.String>
      getPackageUrisList();
  /**
   * <pre>
   * Required. The Google Cloud Storage location of the Python package files
   * which are the training program and its dependent packages. The maximum
   * number of package URIs is 100.
   * </pre>
   *
   * <code>repeated string package_uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of packageUris.
   */
  int getPackageUrisCount();
  /**
   * <pre>
   * Required. The Google Cloud Storage location of the Python package files
   * which are the training program and its dependent packages. The maximum
   * number of package URIs is 100.
   * </pre>
   *
   * <code>repeated string package_uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The packageUris at the given index.
   */
  java.lang.String getPackageUris(int index);
  /**
   * <pre>
   * Required. The Google Cloud Storage location of the Python package files
   * which are the training program and its dependent packages. The maximum
   * number of package URIs is 100.
   * </pre>
   *
   * <code>repeated string package_uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the packageUris at the given index.
   */
  com.google.protobuf.ByteString
      getPackageUrisBytes(int index);

  /**
   * <pre>
   * Required. The Python module name to run after installing the packages.
   * </pre>
   *
   * <code>string python_module = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The pythonModule.
   */
  java.lang.String getPythonModule();
  /**
   * <pre>
   * Required. The Python module name to run after installing the packages.
   * </pre>
   *
   * <code>string python_module = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for pythonModule.
   */
  com.google.protobuf.ByteString
      getPythonModuleBytes();

  /**
   * <pre>
   * Command line arguments to be passed to the Python task.
   * </pre>
   *
   * <code>repeated string args = 4;</code>
   * @return A list containing the args.
   */
  java.util.List<java.lang.String>
      getArgsList();
  /**
   * <pre>
   * Command line arguments to be passed to the Python task.
   * </pre>
   *
   * <code>repeated string args = 4;</code>
   * @return The count of args.
   */
  int getArgsCount();
  /**
   * <pre>
   * Command line arguments to be passed to the Python task.
   * </pre>
   *
   * <code>repeated string args = 4;</code>
   * @param index The index of the element to return.
   * @return The args at the given index.
   */
  java.lang.String getArgs(int index);
  /**
   * <pre>
   * Command line arguments to be passed to the Python task.
   * </pre>
   *
   * <code>repeated string args = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the args at the given index.
   */
  com.google.protobuf.ByteString
      getArgsBytes(int index);

  /**
   * <pre>
   * Environment variables to be passed to the python module.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 5;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.EnvVar> 
      getEnvList();
  /**
   * <pre>
   * Environment variables to be passed to the python module.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EnvVar getEnv(int index);
  /**
   * <pre>
   * Environment variables to be passed to the python module.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 5;</code>
   */
  int getEnvCount();
  /**
   * <pre>
   * Environment variables to be passed to the python module.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 5;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.EnvVarOrBuilder> 
      getEnvOrBuilderList();
  /**
   * <pre>
   * Environment variables to be passed to the python module.
   * Maximum limit is 100.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.EnvVar env = 5;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EnvVarOrBuilder getEnvOrBuilder(
      int index);
}
