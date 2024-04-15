// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1;

public interface VideoContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.VideoContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.VideoSegment> 
      getSegmentsList();
  /**
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegment getSegments(int index);
  /**
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  int getSegmentsCount();
  /**
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder> 
      getSegmentsOrBuilderList();
  /**
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getSegmentsOrBuilder(
      int index);

  /**
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.LabelDetectionConfig label_detection_config = 2;</code>
   * @return Whether the labelDetectionConfig field is set.
   */
  boolean hasLabelDetectionConfig();
  /**
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.LabelDetectionConfig label_detection_config = 2;</code>
   * @return The labelDetectionConfig.
   */
  com.google.cloud.videointelligence.v1.LabelDetectionConfig getLabelDetectionConfig();
  /**
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.LabelDetectionConfig label_detection_config = 2;</code>
   */
  com.google.cloud.videointelligence.v1.LabelDetectionConfigOrBuilder getLabelDetectionConfigOrBuilder();

  /**
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ShotChangeDetectionConfig shot_change_detection_config = 3;</code>
   * @return Whether the shotChangeDetectionConfig field is set.
   */
  boolean hasShotChangeDetectionConfig();
  /**
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ShotChangeDetectionConfig shot_change_detection_config = 3;</code>
   * @return The shotChangeDetectionConfig.
   */
  com.google.cloud.videointelligence.v1.ShotChangeDetectionConfig getShotChangeDetectionConfig();
  /**
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ShotChangeDetectionConfig shot_change_detection_config = 3;</code>
   */
  com.google.cloud.videointelligence.v1.ShotChangeDetectionConfigOrBuilder getShotChangeDetectionConfigOrBuilder();

  /**
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ExplicitContentDetectionConfig explicit_content_detection_config = 4;</code>
   * @return Whether the explicitContentDetectionConfig field is set.
   */
  boolean hasExplicitContentDetectionConfig();
  /**
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ExplicitContentDetectionConfig explicit_content_detection_config = 4;</code>
   * @return The explicitContentDetectionConfig.
   */
  com.google.cloud.videointelligence.v1.ExplicitContentDetectionConfig getExplicitContentDetectionConfig();
  /**
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ExplicitContentDetectionConfig explicit_content_detection_config = 4;</code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentDetectionConfigOrBuilder getExplicitContentDetectionConfigOrBuilder();

  /**
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.FaceDetectionConfig face_detection_config = 5;</code>
   * @return Whether the faceDetectionConfig field is set.
   */
  boolean hasFaceDetectionConfig();
  /**
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.FaceDetectionConfig face_detection_config = 5;</code>
   * @return The faceDetectionConfig.
   */
  com.google.cloud.videointelligence.v1.FaceDetectionConfig getFaceDetectionConfig();
  /**
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.FaceDetectionConfig face_detection_config = 5;</code>
   */
  com.google.cloud.videointelligence.v1.FaceDetectionConfigOrBuilder getFaceDetectionConfigOrBuilder();

  /**
   * <pre>
   * Config for SPEECH_TRANSCRIPTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.SpeechTranscriptionConfig speech_transcription_config = 6;</code>
   * @return Whether the speechTranscriptionConfig field is set.
   */
  boolean hasSpeechTranscriptionConfig();
  /**
   * <pre>
   * Config for SPEECH_TRANSCRIPTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.SpeechTranscriptionConfig speech_transcription_config = 6;</code>
   * @return The speechTranscriptionConfig.
   */
  com.google.cloud.videointelligence.v1.SpeechTranscriptionConfig getSpeechTranscriptionConfig();
  /**
   * <pre>
   * Config for SPEECH_TRANSCRIPTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.SpeechTranscriptionConfig speech_transcription_config = 6;</code>
   */
  com.google.cloud.videointelligence.v1.SpeechTranscriptionConfigOrBuilder getSpeechTranscriptionConfigOrBuilder();

  /**
   * <pre>
   * Config for TEXT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.TextDetectionConfig text_detection_config = 8;</code>
   * @return Whether the textDetectionConfig field is set.
   */
  boolean hasTextDetectionConfig();
  /**
   * <pre>
   * Config for TEXT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.TextDetectionConfig text_detection_config = 8;</code>
   * @return The textDetectionConfig.
   */
  com.google.cloud.videointelligence.v1.TextDetectionConfig getTextDetectionConfig();
  /**
   * <pre>
   * Config for TEXT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.TextDetectionConfig text_detection_config = 8;</code>
   */
  com.google.cloud.videointelligence.v1.TextDetectionConfigOrBuilder getTextDetectionConfigOrBuilder();

  /**
   * <pre>
   * Config for PERSON_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.PersonDetectionConfig person_detection_config = 11;</code>
   * @return Whether the personDetectionConfig field is set.
   */
  boolean hasPersonDetectionConfig();
  /**
   * <pre>
   * Config for PERSON_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.PersonDetectionConfig person_detection_config = 11;</code>
   * @return The personDetectionConfig.
   */
  com.google.cloud.videointelligence.v1.PersonDetectionConfig getPersonDetectionConfig();
  /**
   * <pre>
   * Config for PERSON_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.PersonDetectionConfig person_detection_config = 11;</code>
   */
  com.google.cloud.videointelligence.v1.PersonDetectionConfigOrBuilder getPersonDetectionConfigOrBuilder();

  /**
   * <pre>
   * Config for OBJECT_TRACKING.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ObjectTrackingConfig object_tracking_config = 13;</code>
   * @return Whether the objectTrackingConfig field is set.
   */
  boolean hasObjectTrackingConfig();
  /**
   * <pre>
   * Config for OBJECT_TRACKING.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ObjectTrackingConfig object_tracking_config = 13;</code>
   * @return The objectTrackingConfig.
   */
  com.google.cloud.videointelligence.v1.ObjectTrackingConfig getObjectTrackingConfig();
  /**
   * <pre>
   * Config for OBJECT_TRACKING.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.ObjectTrackingConfig object_tracking_config = 13;</code>
   */
  com.google.cloud.videointelligence.v1.ObjectTrackingConfigOrBuilder getObjectTrackingConfigOrBuilder();
}
