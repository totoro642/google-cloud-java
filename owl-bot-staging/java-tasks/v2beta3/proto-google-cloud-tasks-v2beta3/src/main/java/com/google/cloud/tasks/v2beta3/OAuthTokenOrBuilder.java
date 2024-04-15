// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/target.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tasks.v2beta3;

public interface OAuthTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.OAuthToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OAuth token.
   * The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service
   * account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OAuth token.
   * The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service
   * account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString
      getServiceAccountEmailBytes();

  /**
   * <pre>
   * OAuth scope to be used for generating OAuth access token.
   * If not specified, "https://www.googleapis.com/auth/cloud-platform"
   * will be used.
   * </pre>
   *
   * <code>string scope = 2;</code>
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   * <pre>
   * OAuth scope to be used for generating OAuth access token.
   * If not specified, "https://www.googleapis.com/auth/cloud-platform"
   * will be used.
   * </pre>
   *
   * <code>string scope = 2;</code>
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString
      getScopeBytes();
}
