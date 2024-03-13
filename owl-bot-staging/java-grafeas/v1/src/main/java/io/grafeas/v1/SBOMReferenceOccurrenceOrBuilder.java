// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/sbom.proto

// Protobuf Java Version: 3.25.2
package io.grafeas.v1;

public interface SBOMReferenceOccurrenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.SBOMReferenceOccurrence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The actual payload that contains the SBOM reference data.
   * </pre>
   *
   * <code>.grafeas.v1.SbomReferenceIntotoPayload payload = 1;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * The actual payload that contains the SBOM reference data.
   * </pre>
   *
   * <code>.grafeas.v1.SbomReferenceIntotoPayload payload = 1;</code>
   * @return The payload.
   */
  io.grafeas.v1.SbomReferenceIntotoPayload getPayload();
  /**
   * <pre>
   * The actual payload that contains the SBOM reference data.
   * </pre>
   *
   * <code>.grafeas.v1.SbomReferenceIntotoPayload payload = 1;</code>
   */
  io.grafeas.v1.SbomReferenceIntotoPayloadOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * The kind of payload that SbomReferenceIntotoPayload takes. Since it's in
   * the intoto format, this value is expected to be
   * 'application/vnd.in-toto+json'.
   * </pre>
   *
   * <code>string payload_type = 2;</code>
   * @return The payloadType.
   */
  java.lang.String getPayloadType();
  /**
   * <pre>
   * The kind of payload that SbomReferenceIntotoPayload takes. Since it's in
   * the intoto format, this value is expected to be
   * 'application/vnd.in-toto+json'.
   * </pre>
   *
   * <code>string payload_type = 2;</code>
   * @return The bytes for payloadType.
   */
  com.google.protobuf.ByteString
      getPayloadTypeBytes();

  /**
   * <pre>
   * The signatures over the payload.
   * </pre>
   *
   * <code>repeated .grafeas.v1.EnvelopeSignature signatures = 3;</code>
   */
  java.util.List<io.grafeas.v1.EnvelopeSignature> 
      getSignaturesList();
  /**
   * <pre>
   * The signatures over the payload.
   * </pre>
   *
   * <code>repeated .grafeas.v1.EnvelopeSignature signatures = 3;</code>
   */
  io.grafeas.v1.EnvelopeSignature getSignatures(int index);
  /**
   * <pre>
   * The signatures over the payload.
   * </pre>
   *
   * <code>repeated .grafeas.v1.EnvelopeSignature signatures = 3;</code>
   */
  int getSignaturesCount();
  /**
   * <pre>
   * The signatures over the payload.
   * </pre>
   *
   * <code>repeated .grafeas.v1.EnvelopeSignature signatures = 3;</code>
   */
  java.util.List<? extends io.grafeas.v1.EnvelopeSignatureOrBuilder> 
      getSignaturesOrBuilderList();
  /**
   * <pre>
   * The signatures over the payload.
   * </pre>
   *
   * <code>repeated .grafeas.v1.EnvelopeSignature signatures = 3;</code>
   */
  io.grafeas.v1.EnvelopeSignatureOrBuilder getSignaturesOrBuilder(
      int index);
}
