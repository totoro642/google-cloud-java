// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public interface ImageContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.ImageContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.LatLongRect lat_long_rect = 1;</code>
   * @return Whether the latLongRect field is set.
   */
  boolean hasLatLongRect();
  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.LatLongRect lat_long_rect = 1;</code>
   * @return The latLongRect.
   */
  com.google.cloud.vision.v1.LatLongRect getLatLongRect();
  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.LatLongRect lat_long_rect = 1;</code>
   */
  com.google.cloud.vision.v1.LatLongRectOrBuilder getLatLongRectOrBuilder();

  /**
   * <pre>
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an
   * error if one or more of the specified languages is not one of the
   * [supported languages](https://cloud.google.com/vision/docs/languages).
   * </pre>
   *
   * <code>repeated string language_hints = 2;</code>
   * @return A list containing the languageHints.
   */
  java.util.List<java.lang.String>
      getLanguageHintsList();
  /**
   * <pre>
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an
   * error if one or more of the specified languages is not one of the
   * [supported languages](https://cloud.google.com/vision/docs/languages).
   * </pre>
   *
   * <code>repeated string language_hints = 2;</code>
   * @return The count of languageHints.
   */
  int getLanguageHintsCount();
  /**
   * <pre>
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an
   * error if one or more of the specified languages is not one of the
   * [supported languages](https://cloud.google.com/vision/docs/languages).
   * </pre>
   *
   * <code>repeated string language_hints = 2;</code>
   * @param index The index of the element to return.
   * @return The languageHints at the given index.
   */
  java.lang.String getLanguageHints(int index);
  /**
   * <pre>
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an
   * error if one or more of the specified languages is not one of the
   * [supported languages](https://cloud.google.com/vision/docs/languages).
   * </pre>
   *
   * <code>repeated string language_hints = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageHints at the given index.
   */
  com.google.protobuf.ByteString
      getLanguageHintsBytes(int index);

  /**
   * <pre>
   * Parameters for crop hints annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.CropHintsParams crop_hints_params = 4;</code>
   * @return Whether the cropHintsParams field is set.
   */
  boolean hasCropHintsParams();
  /**
   * <pre>
   * Parameters for crop hints annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.CropHintsParams crop_hints_params = 4;</code>
   * @return The cropHintsParams.
   */
  com.google.cloud.vision.v1.CropHintsParams getCropHintsParams();
  /**
   * <pre>
   * Parameters for crop hints annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.CropHintsParams crop_hints_params = 4;</code>
   */
  com.google.cloud.vision.v1.CropHintsParamsOrBuilder getCropHintsParamsOrBuilder();

  /**
   * <pre>
   * Parameters for product search.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSearchParams product_search_params = 5;</code>
   * @return Whether the productSearchParams field is set.
   */
  boolean hasProductSearchParams();
  /**
   * <pre>
   * Parameters for product search.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSearchParams product_search_params = 5;</code>
   * @return The productSearchParams.
   */
  com.google.cloud.vision.v1.ProductSearchParams getProductSearchParams();
  /**
   * <pre>
   * Parameters for product search.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSearchParams product_search_params = 5;</code>
   */
  com.google.cloud.vision.v1.ProductSearchParamsOrBuilder getProductSearchParamsOrBuilder();

  /**
   * <pre>
   * Parameters for web detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.WebDetectionParams web_detection_params = 6;</code>
   * @return Whether the webDetectionParams field is set.
   */
  boolean hasWebDetectionParams();
  /**
   * <pre>
   * Parameters for web detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.WebDetectionParams web_detection_params = 6;</code>
   * @return The webDetectionParams.
   */
  com.google.cloud.vision.v1.WebDetectionParams getWebDetectionParams();
  /**
   * <pre>
   * Parameters for web detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.WebDetectionParams web_detection_params = 6;</code>
   */
  com.google.cloud.vision.v1.WebDetectionParamsOrBuilder getWebDetectionParamsOrBuilder();

  /**
   * <pre>
   * Parameters for text detection and document text detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextDetectionParams text_detection_params = 12;</code>
   * @return Whether the textDetectionParams field is set.
   */
  boolean hasTextDetectionParams();
  /**
   * <pre>
   * Parameters for text detection and document text detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextDetectionParams text_detection_params = 12;</code>
   * @return The textDetectionParams.
   */
  com.google.cloud.vision.v1.TextDetectionParams getTextDetectionParams();
  /**
   * <pre>
   * Parameters for text detection and document text detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextDetectionParams text_detection_params = 12;</code>
   */
  com.google.cloud.vision.v1.TextDetectionParamsOrBuilder getTextDetectionParamsOrBuilder();
}
