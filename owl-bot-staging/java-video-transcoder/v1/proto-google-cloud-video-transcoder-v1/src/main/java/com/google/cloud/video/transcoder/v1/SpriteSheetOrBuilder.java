// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/transcoder/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.transcoder.v1;

public interface SpriteSheetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.SpriteSheet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Format type. The default is `jpeg`.
   *
   * Supported formats:
   *
   * - `jpeg`
   * </pre>
   *
   * <code>string format = 1;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * Format type. The default is `jpeg`.
   *
   * Supported formats:
   *
   * - `jpeg`
   * </pre>
   *
   * <code>string format = 1;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   * Required. File name prefix for the generated sprite sheets.
   *
   * Each sprite sheet has an incremental 10-digit zero-padded suffix starting
   * from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
   * </pre>
   *
   * <code>string file_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The filePrefix.
   */
  java.lang.String getFilePrefix();
  /**
   * <pre>
   * Required. File name prefix for the generated sprite sheets.
   *
   * Each sprite sheet has an incremental 10-digit zero-padded suffix starting
   * from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
   * </pre>
   *
   * <code>string file_prefix = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for filePrefix.
   */
  com.google.protobuf.ByteString
      getFilePrefixBytes();

  /**
   * <pre>
   * Required. The width of sprite in pixels. Must be an even integer. To
   * preserve the source aspect ratio, set the
   * [SpriteSheet.sprite_width_pixels][google.cloud.video.transcoder.v1.SpriteSheet.sprite_width_pixels]
   * field or the
   * [SpriteSheet.sprite_height_pixels][google.cloud.video.transcoder.v1.SpriteSheet.sprite_height_pixels]
   * field, but not both (the API will automatically calculate the missing
   * field).
   *
   * For portrait videos that contain horizontal ASR and rotation metadata,
   * provide the width, in pixels, per the horizontal ASR. The API calculates
   * the height per the horizontal ASR. The API detects any rotation metadata
   * and swaps the requested height and width for the output.
   * </pre>
   *
   * <code>int32 sprite_width_pixels = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The spriteWidthPixels.
   */
  int getSpriteWidthPixels();

  /**
   * <pre>
   * Required. The height of sprite in pixels. Must be an even integer. To
   * preserve the source aspect ratio, set the
   * [SpriteSheet.sprite_height_pixels][google.cloud.video.transcoder.v1.SpriteSheet.sprite_height_pixels]
   * field or the
   * [SpriteSheet.sprite_width_pixels][google.cloud.video.transcoder.v1.SpriteSheet.sprite_width_pixels]
   * field, but not both (the API will automatically calculate the missing
   * field).
   *
   * For portrait videos that contain horizontal ASR and rotation metadata,
   * provide the height, in pixels, per the horizontal ASR. The API calculates
   * the width per the horizontal ASR. The API detects any rotation metadata
   * and swaps the requested height and width for the output.
   * </pre>
   *
   * <code>int32 sprite_height_pixels = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The spriteHeightPixels.
   */
  int getSpriteHeightPixels();

  /**
   * <pre>
   * The maximum number of sprites per row in a sprite sheet. The default is 0,
   * which indicates no maximum limit.
   * </pre>
   *
   * <code>int32 column_count = 5;</code>
   * @return The columnCount.
   */
  int getColumnCount();

  /**
   * <pre>
   * The maximum number of rows per sprite sheet. When the sprite sheet is full,
   * a new sprite sheet is created. The default is 0, which indicates no maximum
   * limit.
   * </pre>
   *
   * <code>int32 row_count = 6;</code>
   * @return The rowCount.
   */
  int getRowCount();

  /**
   * <pre>
   * Start time in seconds, relative to the output file timeline. Determines the
   * first sprite to pick. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 7;</code>
   * @return Whether the startTimeOffset field is set.
   */
  boolean hasStartTimeOffset();
  /**
   * <pre>
   * Start time in seconds, relative to the output file timeline. Determines the
   * first sprite to pick. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 7;</code>
   * @return The startTimeOffset.
   */
  com.google.protobuf.Duration getStartTimeOffset();
  /**
   * <pre>
   * Start time in seconds, relative to the output file timeline. Determines the
   * first sprite to pick. The default is `0s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder();

  /**
   * <pre>
   * End time in seconds, relative to the output file timeline. When
   * `end_time_offset` is not specified, the sprites are generated until the end
   * of the output file.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 8;</code>
   * @return Whether the endTimeOffset field is set.
   */
  boolean hasEndTimeOffset();
  /**
   * <pre>
   * End time in seconds, relative to the output file timeline. When
   * `end_time_offset` is not specified, the sprites are generated until the end
   * of the output file.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 8;</code>
   * @return The endTimeOffset.
   */
  com.google.protobuf.Duration getEndTimeOffset();
  /**
   * <pre>
   * End time in seconds, relative to the output file timeline. When
   * `end_time_offset` is not specified, the sprites are generated until the end
   * of the output file.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndTimeOffsetOrBuilder();

  /**
   * <pre>
   * Total number of sprites. Create the specified number of sprites
   * distributed evenly across the timeline of the output media. The default
   * is 100.
   * </pre>
   *
   * <code>int32 total_count = 9;</code>
   * @return Whether the totalCount field is set.
   */
  boolean hasTotalCount();
  /**
   * <pre>
   * Total number of sprites. Create the specified number of sprites
   * distributed evenly across the timeline of the output media. The default
   * is 100.
   * </pre>
   *
   * <code>int32 total_count = 9;</code>
   * @return The totalCount.
   */
  int getTotalCount();

  /**
   * <pre>
   * Starting from `0s`, create sprites at regular intervals. Specify the
   * interval value in seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 10;</code>
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   * <pre>
   * Starting from `0s`, create sprites at regular intervals. Specify the
   * interval value in seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 10;</code>
   * @return The interval.
   */
  com.google.protobuf.Duration getInterval();
  /**
   * <pre>
   * Starting from `0s`, create sprites at regular intervals. Specify the
   * interval value in seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 10;</code>
   */
  com.google.protobuf.DurationOrBuilder getIntervalOrBuilder();

  /**
   * <pre>
   * The quality of the generated sprite sheet. Enter a value between 1
   * and 100, where 1 is the lowest quality and 100 is the highest quality.
   * The default is 100. A high quality value corresponds to a low image data
   * compression ratio.
   * </pre>
   *
   * <code>int32 quality = 11;</code>
   * @return The quality.
   */
  int getQuality();

  com.google.cloud.video.transcoder.v1.SpriteSheet.ExtractionStrategyCase getExtractionStrategyCase();
}
