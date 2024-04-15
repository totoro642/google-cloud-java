// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.texttospeech.v1beta1;

public interface ListVoicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1beta1.ListVoicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Recommended.
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * If not specified, the API will return all supported voices.
   * If specified, the ListVoices call will only return voices that can be used
   * to synthesize this language_code. For example, if you specify `"en-NZ"`,
   * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
   * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
   * returned.
   * </pre>
   *
   * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * Optional. Recommended.
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
   * If not specified, the API will return all supported voices.
   * If specified, the ListVoices call will only return voices that can be used
   * to synthesize this language_code. For example, if you specify `"en-NZ"`,
   * all `"en-NZ"` voices will be returned. If you specify `"no"`, both
   * `"no-&#92;*"` (Norwegian) and `"nb-&#92;*"` (Norwegian Bokmal) voices will be
   * returned.
   * </pre>
   *
   * <code>string language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
