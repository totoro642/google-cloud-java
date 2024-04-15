// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.texttospeech.v1beta1;

public interface TimepointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1beta1.Timepoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timepoint name as received from the client within `&lt;mark&gt;` tag.
   * </pre>
   *
   * <code>string mark_name = 4;</code>
   * @return The markName.
   */
  java.lang.String getMarkName();
  /**
   * <pre>
   * Timepoint name as received from the client within `&lt;mark&gt;` tag.
   * </pre>
   *
   * <code>string mark_name = 4;</code>
   * @return The bytes for markName.
   */
  com.google.protobuf.ByteString
      getMarkNameBytes();

  /**
   * <pre>
   * Time offset in seconds from the start of the synthesized audio.
   * </pre>
   *
   * <code>double time_seconds = 3;</code>
   * @return The timeSeconds.
   */
  double getTimeSeconds();
}
