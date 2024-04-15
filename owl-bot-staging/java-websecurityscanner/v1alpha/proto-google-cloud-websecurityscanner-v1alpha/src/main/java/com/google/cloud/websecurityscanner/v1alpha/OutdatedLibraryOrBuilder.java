// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/finding_addon.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1alpha;

public interface OutdatedLibraryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.OutdatedLibrary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the outdated library.
   * </pre>
   *
   * <code>string library_name = 1;</code>
   * @return The libraryName.
   */
  java.lang.String getLibraryName();
  /**
   * <pre>
   * The name of the outdated library.
   * </pre>
   *
   * <code>string library_name = 1;</code>
   * @return The bytes for libraryName.
   */
  com.google.protobuf.ByteString
      getLibraryNameBytes();

  /**
   * <pre>
   * The version number.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The version number.
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   * @return A list containing the learnMoreUrls.
   */
  java.util.List<java.lang.String>
      getLearnMoreUrlsList();
  /**
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   * @return The count of learnMoreUrls.
   */
  int getLearnMoreUrlsCount();
  /**
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   * @param index The index of the element to return.
   * @return The learnMoreUrls at the given index.
   */
  java.lang.String getLearnMoreUrls(int index);
  /**
   * <pre>
   * URLs to learn more information about the vulnerabilities in the library.
   * </pre>
   *
   * <code>repeated string learn_more_urls = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the learnMoreUrls at the given index.
   */
  com.google.protobuf.ByteString
      getLearnMoreUrlsBytes(int index);
}
