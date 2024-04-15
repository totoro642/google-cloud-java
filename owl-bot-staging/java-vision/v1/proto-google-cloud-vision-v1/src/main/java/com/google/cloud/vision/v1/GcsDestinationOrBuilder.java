// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public interface GcsDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.GcsDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Google Cloud Storage URI prefix where the results will be stored. Results
   * will be in JSON format and preceded by its corresponding input URI prefix.
   * This field can either represent a gcs file prefix or gcs directory. In
   * either case, the uri should be unique because in order to get all of the
   * output files, you will need to do a wildcard gcs search on the uri prefix
   * you provide.
   *
   * Examples:
   *
   * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
   * will be created in gs://bucket-name/here/ and the names of the
   * output files will begin with "filenameprefix".
   *
   * *    Directory Prefix: gs://bucket-name/some/location/   The output files
   * will be created in gs://bucket-name/some/location/ and the names of the
   * output files could be anything because there was no filename prefix
   * specified.
   *
   * If multiple outputs, each response is still AnnotateFileResponse, each of
   * which contains some subset of the full list of AnnotateImageResponse.
   * Multiple outputs can happen if, for example, the output JSON is too large
   * and overflows into multiple sharded files.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Google Cloud Storage URI prefix where the results will be stored. Results
   * will be in JSON format and preceded by its corresponding input URI prefix.
   * This field can either represent a gcs file prefix or gcs directory. In
   * either case, the uri should be unique because in order to get all of the
   * output files, you will need to do a wildcard gcs search on the uri prefix
   * you provide.
   *
   * Examples:
   *
   * *    File Prefix: gs://bucket-name/here/filenameprefix   The output files
   * will be created in gs://bucket-name/here/ and the names of the
   * output files will begin with "filenameprefix".
   *
   * *    Directory Prefix: gs://bucket-name/some/location/   The output files
   * will be created in gs://bucket-name/some/location/ and the names of the
   * output files could be anything because there was no filename prefix
   * specified.
   *
   * If multiple outputs, each response is still AnnotateFileResponse, each of
   * which contains some subset of the full list of AnnotateImageResponse.
   * Multiple outputs can happen if, for example, the output JSON is too large
   * and overflows into multiple sharded files.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();
}
