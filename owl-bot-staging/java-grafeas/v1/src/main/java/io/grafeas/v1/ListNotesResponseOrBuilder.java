// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

// Protobuf Java Version: 3.25.2
package io.grafeas.v1;

public interface ListNotesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.ListNotesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  java.util.List<io.grafeas.v1.Note> 
      getNotesList();
  /**
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  io.grafeas.v1.Note getNotes(int index);
  /**
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  int getNotesCount();
  /**
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  java.util.List<? extends io.grafeas.v1.NoteOrBuilder> 
      getNotesOrBuilderList();
  /**
   * <pre>
   * The notes requested.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Note notes = 1;</code>
   */
  io.grafeas.v1.NoteOrBuilder getNotesOrBuilder(
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
