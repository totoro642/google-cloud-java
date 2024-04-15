// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/scan_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1alpha;

public interface ScanConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.ScanConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the ScanConfig. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are
   * generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the ScanConfig. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are
   * generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The user provided display name of the ScanConfig.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The user provided display name of the ScanConfig.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The maximum QPS during scanning. A valid value ranges from 5 to 20
   * inclusively. If the field is unspecified or its value is set 0, server will
   * default to 15. Other values outside of [5, 20] range will be rejected with
   * INVALID_ARGUMENT error.
   * </pre>
   *
   * <code>int32 max_qps = 3;</code>
   * @return The maxQps.
   */
  int getMaxQps();

  /**
   * <pre>
   * Required. The starting URLs from which the scanner finds site pages.
   * </pre>
   *
   * <code>repeated string starting_urls = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the startingUrls.
   */
  java.util.List<java.lang.String>
      getStartingUrlsList();
  /**
   * <pre>
   * Required. The starting URLs from which the scanner finds site pages.
   * </pre>
   *
   * <code>repeated string starting_urls = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of startingUrls.
   */
  int getStartingUrlsCount();
  /**
   * <pre>
   * Required. The starting URLs from which the scanner finds site pages.
   * </pre>
   *
   * <code>repeated string starting_urls = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The startingUrls at the given index.
   */
  java.lang.String getStartingUrls(int index);
  /**
   * <pre>
   * Required. The starting URLs from which the scanner finds site pages.
   * </pre>
   *
   * <code>repeated string starting_urls = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the startingUrls at the given index.
   */
  com.google.protobuf.ByteString
      getStartingUrlsBytes(int index);

  /**
   * <pre>
   * The authentication configuration. If specified, service will use the
   * authentication configuration during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication authentication = 5;</code>
   * @return Whether the authentication field is set.
   */
  boolean hasAuthentication();
  /**
   * <pre>
   * The authentication configuration. If specified, service will use the
   * authentication configuration during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication authentication = 5;</code>
   * @return The authentication.
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication getAuthentication();
  /**
   * <pre>
   * The authentication configuration. If specified, service will use the
   * authentication configuration during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Authentication authentication = 5;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.AuthenticationOrBuilder getAuthenticationOrBuilder();

  /**
   * <pre>
   * The user agent used during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.UserAgent user_agent = 6;</code>
   * @return The enum numeric value on the wire for userAgent.
   */
  int getUserAgentValue();
  /**
   * <pre>
   * The user agent used during scanning.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.UserAgent user_agent = 6;</code>
   * @return The userAgent.
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.UserAgent getUserAgent();

  /**
   * <pre>
   * The blacklist URL patterns as described in
   * https://cloud.google.com/security-scanner/docs/excluded-urls
   * </pre>
   *
   * <code>repeated string blacklist_patterns = 7;</code>
   * @return A list containing the blacklistPatterns.
   */
  java.util.List<java.lang.String>
      getBlacklistPatternsList();
  /**
   * <pre>
   * The blacklist URL patterns as described in
   * https://cloud.google.com/security-scanner/docs/excluded-urls
   * </pre>
   *
   * <code>repeated string blacklist_patterns = 7;</code>
   * @return The count of blacklistPatterns.
   */
  int getBlacklistPatternsCount();
  /**
   * <pre>
   * The blacklist URL patterns as described in
   * https://cloud.google.com/security-scanner/docs/excluded-urls
   * </pre>
   *
   * <code>repeated string blacklist_patterns = 7;</code>
   * @param index The index of the element to return.
   * @return The blacklistPatterns at the given index.
   */
  java.lang.String getBlacklistPatterns(int index);
  /**
   * <pre>
   * The blacklist URL patterns as described in
   * https://cloud.google.com/security-scanner/docs/excluded-urls
   * </pre>
   *
   * <code>repeated string blacklist_patterns = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the blacklistPatterns at the given index.
   */
  com.google.protobuf.ByteString
      getBlacklistPatternsBytes(int index);

  /**
   * <pre>
   * The schedule of the ScanConfig.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Schedule schedule = 8;</code>
   * @return Whether the schedule field is set.
   */
  boolean hasSchedule();
  /**
   * <pre>
   * The schedule of the ScanConfig.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Schedule schedule = 8;</code>
   * @return The schedule.
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.Schedule getSchedule();
  /**
   * <pre>
   * The schedule of the ScanConfig.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanConfig.Schedule schedule = 8;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.ScheduleOrBuilder getScheduleOrBuilder();

  /**
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;</code>
   * @return A list containing the targetPlatforms.
   */
  java.util.List<com.google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform> getTargetPlatformsList();
  /**
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;</code>
   * @return The count of targetPlatforms.
   */
  int getTargetPlatformsCount();
  /**
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;</code>
   * @param index The index of the element to return.
   * @return The targetPlatforms at the given index.
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform getTargetPlatforms(int index);
  /**
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;</code>
   * @return A list containing the enum numeric values on the wire for targetPlatforms.
   */
  java.util.List<java.lang.Integer>
  getTargetPlatformsValueList();
  /**
   * <pre>
   * Set of Cloud Platforms targeted by the scan. If empty, APP_ENGINE will be
   * used as a default.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1alpha.ScanConfig.TargetPlatform target_platforms = 9;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of targetPlatforms at the given index.
   */
  int getTargetPlatformsValue(int index);

  /**
   * <pre>
   * Latest ScanRun if available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun latest_run = 11;</code>
   * @return Whether the latestRun field is set.
   */
  boolean hasLatestRun();
  /**
   * <pre>
   * Latest ScanRun if available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun latest_run = 11;</code>
   * @return The latestRun.
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanRun getLatestRun();
  /**
   * <pre>
   * Latest ScanRun if available.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ScanRun latest_run = 11;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ScanRunOrBuilder getLatestRunOrBuilder();
}
