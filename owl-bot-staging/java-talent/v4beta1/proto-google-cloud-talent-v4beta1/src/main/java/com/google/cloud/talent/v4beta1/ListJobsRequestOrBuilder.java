// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4beta1;

public interface ListJobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ListJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The filter string specifies the jobs to be enumerated.
   *
   * Supported operator: =, AND
   *
   * The fields eligible for filtering are:
   *
   * * `companyName`
   * * `requisitionId`
   * * `status` Available values: OPEN, EXPIRED, ALL. Defaults to
   * OPEN if no value is specified.
   *
   * At least one of `companyName` and `requisitionId` must present or an
   * INVALID_ARGUMENT error is thrown.
   *
   * Sample Query:
   *
   * * companyName = "projects/foo/tenants/bar/companies/baz"
   * * companyName = "projects/foo/tenants/bar/companies/baz" AND
   * requisitionId = "req-1"
   * * companyName = "projects/foo/tenants/bar/companies/baz" AND
   * status = "EXPIRED"
   * * requisitionId = "req-1"
   * * requisitionId = "req-1" AND status = "EXPIRED"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Required. The filter string specifies the jobs to be enumerated.
   *
   * Supported operator: =, AND
   *
   * The fields eligible for filtering are:
   *
   * * `companyName`
   * * `requisitionId`
   * * `status` Available values: OPEN, EXPIRED, ALL. Defaults to
   * OPEN if no value is specified.
   *
   * At least one of `companyName` and `requisitionId` must present or an
   * INVALID_ARGUMENT error is thrown.
   *
   * Sample Query:
   *
   * * companyName = "projects/foo/tenants/bar/companies/baz"
   * * companyName = "projects/foo/tenants/bar/companies/baz" AND
   * requisitionId = "req-1"
   * * companyName = "projects/foo/tenants/bar/companies/baz" AND
   * status = "EXPIRED"
   * * requisitionId = "req-1"
   * * requisitionId = "req-1" AND status = "EXPIRED"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The starting point of a query result.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The starting point of a query result.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The maximum number of jobs to be returned per page of results.
   *
   * If [job_view][google.cloud.talent.v4beta1.ListJobsRequest.job_view] is set
   * to
   * [JobView.JOB_VIEW_ID_ONLY][google.cloud.talent.v4beta1.JobView.JOB_VIEW_ID_ONLY],
   * the maximum allowed page size is 1000. Otherwise, the maximum allowed page
   * size is 100.
   *
   * Default is 100 if empty or a number &lt; 1 is specified.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The desired job attributes returned for jobs in the
   * search response. Defaults to
   * [JobView.JOB_VIEW_FULL][google.cloud.talent.v4beta1.JobView.JOB_VIEW_FULL]
   * if no value is specified.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobView job_view = 5;</code>
   * @return The enum numeric value on the wire for jobView.
   */
  int getJobViewValue();
  /**
   * <pre>
   * The desired job attributes returned for jobs in the
   * search response. Defaults to
   * [JobView.JOB_VIEW_FULL][google.cloud.talent.v4beta1.JobView.JOB_VIEW_FULL]
   * if no value is specified.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.JobView job_view = 5;</code>
   * @return The jobView.
   */
  com.google.cloud.talent.v4beta1.JobView getJobView();
}
