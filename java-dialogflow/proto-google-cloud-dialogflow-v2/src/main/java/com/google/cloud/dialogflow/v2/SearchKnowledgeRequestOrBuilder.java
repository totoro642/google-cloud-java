/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public interface SearchKnowledgeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.SearchKnowledgeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource contains the conversation profile
   * Format: 'projects/&lt;Project ID&gt;' or `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 6;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource contains the conversation profile
   * Format: 'projects/&lt;Project ID&gt;' or `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string parent = 6;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The natural language text query for knowledge search.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.TextInput query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   *
   *
   * <pre>
   * Required. The natural language text query for knowledge search.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.TextInput query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The query.
   */
  com.google.cloud.dialogflow.v2.TextInput getQuery();
  /**
   *
   *
   * <pre>
   * Required. The natural language text query for knowledge search.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.TextInput query = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.TextInputOrBuilder getQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The conversation profile used to configure the search.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>
   * string conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The conversationProfile.
   */
  java.lang.String getConversationProfile();
  /**
   *
   *
   * <pre>
   * Required. The conversation profile used to configure the search.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>
   * string conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for conversationProfile.
   */
  com.google.protobuf.ByteString getConversationProfileBytes();

  /**
   *
   *
   * <pre>
   * The ID of the search session.
   * The session_id can be combined with Dialogflow V3 Agent ID retrieved from
   * conversation profile or on its own to identify a search session. The search
   * history of the same session will impact the search result. It's up to the
   * API caller to choose an appropriate `Session ID`. It can be a random number
   * or some type of session identifiers (preferably hashed). The length must
   * not exceed 36 characters.
   * </pre>
   *
   * <code>string session_id = 3;</code>
   *
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   *
   *
   * <pre>
   * The ID of the search session.
   * The session_id can be combined with Dialogflow V3 Agent ID retrieved from
   * conversation profile or on its own to identify a search session. The search
   * history of the same session will impact the search result. It's up to the
   * API caller to choose an appropriate `Session ID`. It can be a random number
   * or some type of session identifiers (preferably hashed). The length must
   * not exceed 36 characters.
   * </pre>
   *
   * <code>string session_id = 3;</code>
   *
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString getSessionIdBytes();

  /**
   *
   *
   * <pre>
   * The conversation (between human agent and end user) where the search
   * request is triggered. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string conversation = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The conversation.
   */
  java.lang.String getConversation();
  /**
   *
   *
   * <pre>
   * The conversation (between human agent and end user) where the search
   * request is triggered. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string conversation = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for conversation.
   */
  com.google.protobuf.ByteString getConversationBytes();

  /**
   *
   *
   * <pre>
   * The name of the latest conversation message when the request is
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The latestMessage.
   */
  java.lang.String getLatestMessage();
  /**
   *
   *
   * <pre>
   * The name of the latest conversation message when the request is
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for latestMessage.
   */
  com.google.protobuf.ByteString getLatestMessageBytes();
}
