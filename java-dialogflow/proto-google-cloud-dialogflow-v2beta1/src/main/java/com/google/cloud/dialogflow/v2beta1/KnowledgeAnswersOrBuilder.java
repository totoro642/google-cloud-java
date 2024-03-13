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
// source: google/cloud/dialogflow/v2beta1/session.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2beta1;

public interface KnowledgeAnswersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.KnowledgeAnswers)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of answers from Knowledge Connector.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer answers = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer> getAnswersList();
  /**
   *
   *
   * <pre>
   * A list of answers from Knowledge Connector.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer answers = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer getAnswers(int index);
  /**
   *
   *
   * <pre>
   * A list of answers from Knowledge Connector.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer answers = 1;</code>
   */
  int getAnswersCount();
  /**
   *
   *
   * <pre>
   * A list of answers from Knowledge Connector.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer answers = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.AnswerOrBuilder>
      getAnswersOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of answers from Knowledge Connector.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.KnowledgeAnswers.Answer answers = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.KnowledgeAnswers.AnswerOrBuilder getAnswersOrBuilder(
      int index);
}
