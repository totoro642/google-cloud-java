// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.telcoautomation.v1alpha1;

public interface SearchDeploymentRevisionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.SearchDeploymentRevisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of requested deployment revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Deployment deployments = 1;</code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1alpha1.Deployment> 
      getDeploymentsList();
  /**
   * <pre>
   * The list of requested deployment revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Deployment deployments = 1;</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.Deployment getDeployments(int index);
  /**
   * <pre>
   * The list of requested deployment revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Deployment deployments = 1;</code>
   */
  int getDeploymentsCount();
  /**
   * <pre>
   * The list of requested deployment revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Deployment deployments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.DeploymentOrBuilder> 
      getDeploymentsOrBuilderList();
  /**
   * <pre>
   * The list of requested deployment revisions.
   * </pre>
   *
   * <code>repeated .google.cloud.telcoautomation.v1alpha1.Deployment deployments = 1;</code>
   */
  com.google.cloud.telcoautomation.v1alpha1.DeploymentOrBuilder getDeploymentsOrBuilder(
      int index);

  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
