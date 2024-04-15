// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.translate.v3beta1;

public interface ListGlossariesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.ListGlossariesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the project from which to list all of the glossaries.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The name of the project from which to list all of the glossaries.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. Requested page size. The server may return fewer glossaries than
   * requested. If unspecified, the server picks an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * Typically, this is the value of [ListGlossariesResponse.next_page_token]
   * returned from the previous call to `ListGlossaries` method.
   * The first page is returned if `page_token`is empty or missing.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * Typically, this is the value of [ListGlossariesResponse.next_page_token]
   * returned from the previous call to `ListGlossaries` method.
   * The first page is returned if `page_token`is empty or missing.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional. Filter specifying constraints of a list operation.
   * Specify the constraint by the format of "key=value", where key must be
   * "src" or "tgt", and the value must be a valid language code.
   * For multiple restrictions, concatenate them by "AND" (uppercase only),
   * such as: "src=en-US AND tgt=zh-CN". Notice that the exact match is used
   * here, which means using 'en-US' and 'en' can lead to different results,
   * which depends on the language code you used when you create the glossary.
   * For the unidirectional glossaries, the "src" and "tgt" add restrictions
   * on the source and target language code separately.
   * For the equivalent term set glossaries, the "src" and/or "tgt" add
   * restrictions on the term set.
   * For example: "src=en-US AND tgt=zh-CN" will only pick the unidirectional
   * glossaries which exactly match the source language code as "en-US" and the
   * target language code "zh-CN", but all equivalent term set glossaries which
   * contain "en-US" and "zh-CN" in their language set will be picked.
   * If missing, no filtering is performed.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Optional. Filter specifying constraints of a list operation.
   * Specify the constraint by the format of "key=value", where key must be
   * "src" or "tgt", and the value must be a valid language code.
   * For multiple restrictions, concatenate them by "AND" (uppercase only),
   * such as: "src=en-US AND tgt=zh-CN". Notice that the exact match is used
   * here, which means using 'en-US' and 'en' can lead to different results,
   * which depends on the language code you used when you create the glossary.
   * For the unidirectional glossaries, the "src" and "tgt" add restrictions
   * on the source and target language code separately.
   * For the equivalent term set glossaries, the "src" and/or "tgt" add
   * restrictions on the term set.
   * For example: "src=en-US AND tgt=zh-CN" will only pick the unidirectional
   * glossaries which exactly match the source language code as "en-US" and the
   * target language code "zh-CN", but all equivalent term set glossaries which
   * contain "en-US" and "zh-CN" in their language set will be picked.
   * If missing, no filtering is performed.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
