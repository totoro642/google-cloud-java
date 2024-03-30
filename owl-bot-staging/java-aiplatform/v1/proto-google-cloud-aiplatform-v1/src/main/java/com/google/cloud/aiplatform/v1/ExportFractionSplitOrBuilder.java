// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/dataset.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ExportFractionSplitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExportFractionSplit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fraction of the input data that is to be used to train the Model.
   * </pre>
   *
   * <code>double training_fraction = 1;</code>
   * @return The trainingFraction.
   */
  double getTrainingFraction();

  /**
   * <pre>
   * The fraction of the input data that is to be used to validate the Model.
   * </pre>
   *
   * <code>double validation_fraction = 2;</code>
   * @return The validationFraction.
   */
  double getValidationFraction();

  /**
   * <pre>
   * The fraction of the input data that is to be used to evaluate the Model.
   * </pre>
   *
   * <code>double test_fraction = 3;</code>
   * @return The testFraction.
   */
  double getTestFraction();
}
