/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface TokenOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.Token)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   *
   * @return The text.
   */
  com.google.cloud.language.v1.TextSpan getText();
  /**
   *
   *
   * <pre>
   * The token text.
   * </pre>
   *
   * <code>.google.cloud.language.v1.TextSpan text = 1;</code>
   */
  com.google.cloud.language.v1.TextSpanOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   *
   * @return Whether the partOfSpeech field is set.
   */
  boolean hasPartOfSpeech();
  /**
   *
   *
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   *
   * @return The partOfSpeech.
   */
  com.google.cloud.language.v1.PartOfSpeech getPartOfSpeech();
  /**
   *
   *
   * <pre>
   * Parts of speech tag for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.PartOfSpeech part_of_speech = 2;</code>
   */
  com.google.cloud.language.v1.PartOfSpeechOrBuilder getPartOfSpeechOrBuilder();

  /**
   *
   *
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   *
   * @return Whether the dependencyEdge field is set.
   */
  boolean hasDependencyEdge();
  /**
   *
   *
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   *
   * @return The dependencyEdge.
   */
  com.google.cloud.language.v1.DependencyEdge getDependencyEdge();
  /**
   *
   *
   * <pre>
   * Dependency tree parse for this token.
   * </pre>
   *
   * <code>.google.cloud.language.v1.DependencyEdge dependency_edge = 3;</code>
   */
  com.google.cloud.language.v1.DependencyEdgeOrBuilder getDependencyEdgeOrBuilder();

  /**
   *
   *
   * <pre>
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * </pre>
   *
   * <code>string lemma = 4;</code>
   *
   * @return The lemma.
   */
  java.lang.String getLemma();
  /**
   *
   *
   * <pre>
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * </pre>
   *
   * <code>string lemma = 4;</code>
   *
   * @return The bytes for lemma.
   */
  com.google.protobuf.ByteString getLemmaBytes();
}
