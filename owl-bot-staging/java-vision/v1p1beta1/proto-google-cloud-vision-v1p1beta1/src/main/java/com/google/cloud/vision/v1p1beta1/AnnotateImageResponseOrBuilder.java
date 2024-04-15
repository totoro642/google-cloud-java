// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p1beta1;

public interface AnnotateImageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p1beta1.AnnotateImageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If present, face detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.FaceAnnotation face_annotations = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p1beta1.FaceAnnotation> 
      getFaceAnnotationsList();
  /**
   * <pre>
   * If present, face detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.FaceAnnotation face_annotations = 1;</code>
   */
  com.google.cloud.vision.v1p1beta1.FaceAnnotation getFaceAnnotations(int index);
  /**
   * <pre>
   * If present, face detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.FaceAnnotation face_annotations = 1;</code>
   */
  int getFaceAnnotationsCount();
  /**
   * <pre>
   * If present, face detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.FaceAnnotation face_annotations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p1beta1.FaceAnnotationOrBuilder> 
      getFaceAnnotationsOrBuilderList();
  /**
   * <pre>
   * If present, face detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.FaceAnnotation face_annotations = 1;</code>
   */
  com.google.cloud.vision.v1p1beta1.FaceAnnotationOrBuilder getFaceAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * If present, landmark detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation landmark_annotations = 2;</code>
   */
  java.util.List<com.google.cloud.vision.v1p1beta1.EntityAnnotation> 
      getLandmarkAnnotationsList();
  /**
   * <pre>
   * If present, landmark detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation landmark_annotations = 2;</code>
   */
  com.google.cloud.vision.v1p1beta1.EntityAnnotation getLandmarkAnnotations(int index);
  /**
   * <pre>
   * If present, landmark detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation landmark_annotations = 2;</code>
   */
  int getLandmarkAnnotationsCount();
  /**
   * <pre>
   * If present, landmark detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation landmark_annotations = 2;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p1beta1.EntityAnnotationOrBuilder> 
      getLandmarkAnnotationsOrBuilderList();
  /**
   * <pre>
   * If present, landmark detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation landmark_annotations = 2;</code>
   */
  com.google.cloud.vision.v1p1beta1.EntityAnnotationOrBuilder getLandmarkAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * If present, logo detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation logo_annotations = 3;</code>
   */
  java.util.List<com.google.cloud.vision.v1p1beta1.EntityAnnotation> 
      getLogoAnnotationsList();
  /**
   * <pre>
   * If present, logo detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation logo_annotations = 3;</code>
   */
  com.google.cloud.vision.v1p1beta1.EntityAnnotation getLogoAnnotations(int index);
  /**
   * <pre>
   * If present, logo detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation logo_annotations = 3;</code>
   */
  int getLogoAnnotationsCount();
  /**
   * <pre>
   * If present, logo detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation logo_annotations = 3;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p1beta1.EntityAnnotationOrBuilder> 
      getLogoAnnotationsOrBuilderList();
  /**
   * <pre>
   * If present, logo detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation logo_annotations = 3;</code>
   */
  com.google.cloud.vision.v1p1beta1.EntityAnnotationOrBuilder getLogoAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * If present, label detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation label_annotations = 4;</code>
   */
  java.util.List<com.google.cloud.vision.v1p1beta1.EntityAnnotation> 
      getLabelAnnotationsList();
  /**
   * <pre>
   * If present, label detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation label_annotations = 4;</code>
   */
  com.google.cloud.vision.v1p1beta1.EntityAnnotation getLabelAnnotations(int index);
  /**
   * <pre>
   * If present, label detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation label_annotations = 4;</code>
   */
  int getLabelAnnotationsCount();
  /**
   * <pre>
   * If present, label detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation label_annotations = 4;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p1beta1.EntityAnnotationOrBuilder> 
      getLabelAnnotationsOrBuilderList();
  /**
   * <pre>
   * If present, label detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation label_annotations = 4;</code>
   */
  com.google.cloud.vision.v1p1beta1.EntityAnnotationOrBuilder getLabelAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * If present, text (OCR) detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation text_annotations = 5;</code>
   */
  java.util.List<com.google.cloud.vision.v1p1beta1.EntityAnnotation> 
      getTextAnnotationsList();
  /**
   * <pre>
   * If present, text (OCR) detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation text_annotations = 5;</code>
   */
  com.google.cloud.vision.v1p1beta1.EntityAnnotation getTextAnnotations(int index);
  /**
   * <pre>
   * If present, text (OCR) detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation text_annotations = 5;</code>
   */
  int getTextAnnotationsCount();
  /**
   * <pre>
   * If present, text (OCR) detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation text_annotations = 5;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p1beta1.EntityAnnotationOrBuilder> 
      getTextAnnotationsOrBuilderList();
  /**
   * <pre>
   * If present, text (OCR) detection has completed successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.EntityAnnotation text_annotations = 5;</code>
   */
  com.google.cloud.vision.v1p1beta1.EntityAnnotationOrBuilder getTextAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   * If present, text (OCR) detection or document (OCR) text detection has
   * completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected
   * text.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.TextAnnotation full_text_annotation = 12;</code>
   * @return Whether the fullTextAnnotation field is set.
   */
  boolean hasFullTextAnnotation();
  /**
   * <pre>
   * If present, text (OCR) detection or document (OCR) text detection has
   * completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected
   * text.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.TextAnnotation full_text_annotation = 12;</code>
   * @return The fullTextAnnotation.
   */
  com.google.cloud.vision.v1p1beta1.TextAnnotation getFullTextAnnotation();
  /**
   * <pre>
   * If present, text (OCR) detection or document (OCR) text detection has
   * completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected
   * text.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.TextAnnotation full_text_annotation = 12;</code>
   */
  com.google.cloud.vision.v1p1beta1.TextAnnotationOrBuilder getFullTextAnnotationOrBuilder();

  /**
   * <pre>
   * If present, safe-search annotation has completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.SafeSearchAnnotation safe_search_annotation = 6;</code>
   * @return Whether the safeSearchAnnotation field is set.
   */
  boolean hasSafeSearchAnnotation();
  /**
   * <pre>
   * If present, safe-search annotation has completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.SafeSearchAnnotation safe_search_annotation = 6;</code>
   * @return The safeSearchAnnotation.
   */
  com.google.cloud.vision.v1p1beta1.SafeSearchAnnotation getSafeSearchAnnotation();
  /**
   * <pre>
   * If present, safe-search annotation has completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.SafeSearchAnnotation safe_search_annotation = 6;</code>
   */
  com.google.cloud.vision.v1p1beta1.SafeSearchAnnotationOrBuilder getSafeSearchAnnotationOrBuilder();

  /**
   * <pre>
   * If present, image properties were extracted successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.ImageProperties image_properties_annotation = 8;</code>
   * @return Whether the imagePropertiesAnnotation field is set.
   */
  boolean hasImagePropertiesAnnotation();
  /**
   * <pre>
   * If present, image properties were extracted successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.ImageProperties image_properties_annotation = 8;</code>
   * @return The imagePropertiesAnnotation.
   */
  com.google.cloud.vision.v1p1beta1.ImageProperties getImagePropertiesAnnotation();
  /**
   * <pre>
   * If present, image properties were extracted successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.ImageProperties image_properties_annotation = 8;</code>
   */
  com.google.cloud.vision.v1p1beta1.ImagePropertiesOrBuilder getImagePropertiesAnnotationOrBuilder();

  /**
   * <pre>
   * If present, crop hints have completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.CropHintsAnnotation crop_hints_annotation = 11;</code>
   * @return Whether the cropHintsAnnotation field is set.
   */
  boolean hasCropHintsAnnotation();
  /**
   * <pre>
   * If present, crop hints have completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.CropHintsAnnotation crop_hints_annotation = 11;</code>
   * @return The cropHintsAnnotation.
   */
  com.google.cloud.vision.v1p1beta1.CropHintsAnnotation getCropHintsAnnotation();
  /**
   * <pre>
   * If present, crop hints have completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.CropHintsAnnotation crop_hints_annotation = 11;</code>
   */
  com.google.cloud.vision.v1p1beta1.CropHintsAnnotationOrBuilder getCropHintsAnnotationOrBuilder();

  /**
   * <pre>
   * If present, web detection has completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.WebDetection web_detection = 13;</code>
   * @return Whether the webDetection field is set.
   */
  boolean hasWebDetection();
  /**
   * <pre>
   * If present, web detection has completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.WebDetection web_detection = 13;</code>
   * @return The webDetection.
   */
  com.google.cloud.vision.v1p1beta1.WebDetection getWebDetection();
  /**
   * <pre>
   * If present, web detection has completed successfully.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p1beta1.WebDetection web_detection = 13;</code>
   */
  com.google.cloud.vision.v1p1beta1.WebDetectionOrBuilder getWebDetectionOrBuilder();

  /**
   * <pre>
   * If set, represents the error message for the operation.
   * Note that filled-in image annotations are guaranteed to be
   * correct, even when `error` is set.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * If set, represents the error message for the operation.
   * Note that filled-in image annotations are guaranteed to be
   * correct, even when `error` is set.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   * <pre>
   * If set, represents the error message for the operation.
   * Note that filled-in image annotations are guaranteed to be
   * correct, even when `error` is set.
   * </pre>
   *
   * <code>.google.rpc.Status error = 9;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();
}
