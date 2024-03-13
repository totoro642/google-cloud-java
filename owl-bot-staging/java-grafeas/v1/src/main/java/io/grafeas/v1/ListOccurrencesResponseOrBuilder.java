// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

// Protobuf Java Version: 3.25.2
package io.grafeas.v1;

public interface ListOccurrencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.ListOccurrencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The occurrences requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  java.util.List<io.grafeas.v1.Occurrence> 
      getOccurrencesList();
  /**
   * <pre>
   * The occurrences requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  io.grafeas.v1.Occurrence getOccurrences(int index);
  /**
   * <pre>
   * The occurrences requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  int getOccurrencesCount();
  /**
   * <pre>
   * The occurrences requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  java.util.List<? extends io.grafeas.v1.OccurrenceOrBuilder> 
      getOccurrencesOrBuilderList();
  /**
   * <pre>
   * The occurrences requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  io.grafeas.v1.OccurrenceOrBuilder getOccurrencesOrBuilder(
      int index);

  /**
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The next pagination token in the list response. It should be used as
   * `page_token` for the following request. An empty value means no more
   * results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
