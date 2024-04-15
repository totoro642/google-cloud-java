// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4/filters.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4;

public interface JobQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.JobQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The query string that matches against the job title, description, and
   * location fields.
   *
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 1;</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * The query string that matches against the job title, description, and
   * location fields.
   *
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 1;</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * The language code of [query][google.cloud.talent.v4.JobQuery.query]. For
   * example, "en-US". This field helps to better interpret the query.
   *
   * If a value isn't specified, the query language code is automatically
   * detected, which may not be accurate.
   *
   * Language code should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * </pre>
   *
   * <code>string query_language_code = 14;</code>
   * @return The queryLanguageCode.
   */
  java.lang.String getQueryLanguageCode();
  /**
   * <pre>
   * The language code of [query][google.cloud.talent.v4.JobQuery.query]. For
   * example, "en-US". This field helps to better interpret the query.
   *
   * If a value isn't specified, the query language code is automatically
   * detected, which may not be accurate.
   *
   * Language code should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * </pre>
   *
   * <code>string query_language_code = 14;</code>
   * @return The bytes for queryLanguageCode.
   */
  com.google.protobuf.ByteString
      getQueryLanguageCodeBytes();

  /**
   * <pre>
   * This filter specifies the company entities to search against.
   *
   * If a value isn't specified, jobs are searched for against all
   * companies.
   *
   * If multiple values are specified, jobs are searched against the
   * companies specified.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}". For
   * example, "projects/foo/tenants/bar/companies/baz".
   *
   * At most 20 company filters are allowed.
   * </pre>
   *
   * <code>repeated string companies = 2;</code>
   * @return A list containing the companies.
   */
  java.util.List<java.lang.String>
      getCompaniesList();
  /**
   * <pre>
   * This filter specifies the company entities to search against.
   *
   * If a value isn't specified, jobs are searched for against all
   * companies.
   *
   * If multiple values are specified, jobs are searched against the
   * companies specified.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}". For
   * example, "projects/foo/tenants/bar/companies/baz".
   *
   * At most 20 company filters are allowed.
   * </pre>
   *
   * <code>repeated string companies = 2;</code>
   * @return The count of companies.
   */
  int getCompaniesCount();
  /**
   * <pre>
   * This filter specifies the company entities to search against.
   *
   * If a value isn't specified, jobs are searched for against all
   * companies.
   *
   * If multiple values are specified, jobs are searched against the
   * companies specified.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}". For
   * example, "projects/foo/tenants/bar/companies/baz".
   *
   * At most 20 company filters are allowed.
   * </pre>
   *
   * <code>repeated string companies = 2;</code>
   * @param index The index of the element to return.
   * @return The companies at the given index.
   */
  java.lang.String getCompanies(int index);
  /**
   * <pre>
   * This filter specifies the company entities to search against.
   *
   * If a value isn't specified, jobs are searched for against all
   * companies.
   *
   * If multiple values are specified, jobs are searched against the
   * companies specified.
   *
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}". For
   * example, "projects/foo/tenants/bar/companies/baz".
   *
   * At most 20 company filters are allowed.
   * </pre>
   *
   * <code>repeated string companies = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the companies at the given index.
   */
  com.google.protobuf.ByteString
      getCompaniesBytes(int index);

  /**
   * <pre>
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4.LocationFilter]
   * for more information.
   *
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   *
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4.LocationFilter.distance_in_miles]
   * parameter, the maximum provided distance is used for all locations.
   *
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.LocationFilter location_filters = 3;</code>
   */
  java.util.List<com.google.cloud.talent.v4.LocationFilter> 
      getLocationFiltersList();
  /**
   * <pre>
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4.LocationFilter]
   * for more information.
   *
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   *
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4.LocationFilter.distance_in_miles]
   * parameter, the maximum provided distance is used for all locations.
   *
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.LocationFilter location_filters = 3;</code>
   */
  com.google.cloud.talent.v4.LocationFilter getLocationFilters(int index);
  /**
   * <pre>
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4.LocationFilter]
   * for more information.
   *
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   *
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4.LocationFilter.distance_in_miles]
   * parameter, the maximum provided distance is used for all locations.
   *
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.LocationFilter location_filters = 3;</code>
   */
  int getLocationFiltersCount();
  /**
   * <pre>
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4.LocationFilter]
   * for more information.
   *
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   *
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4.LocationFilter.distance_in_miles]
   * parameter, the maximum provided distance is used for all locations.
   *
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.LocationFilter location_filters = 3;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4.LocationFilterOrBuilder> 
      getLocationFiltersOrBuilderList();
  /**
   * <pre>
   * The location filter specifies geo-regions containing the jobs to
   * search against. See [LocationFilter][google.cloud.talent.v4.LocationFilter]
   * for more information.
   *
   * If a location value isn't specified, jobs fitting the other search
   * criteria are retrieved regardless of where they're located.
   *
   * If multiple values are specified, jobs are retrieved from any of the
   * specified locations. If different values are specified for the
   * [LocationFilter.distance_in_miles][google.cloud.talent.v4.LocationFilter.distance_in_miles]
   * parameter, the maximum provided distance is used for all locations.
   *
   * At most 5 location filters are allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.LocationFilter location_filters = 3;</code>
   */
  com.google.cloud.talent.v4.LocationFilterOrBuilder getLocationFiltersOrBuilder(
      int index);

  /**
   * <pre>
   * The category filter specifies the categories of jobs to search against.
   * See [JobCategory][google.cloud.talent.v4.JobCategory] for more information.
   *
   * If a value isn't specified, jobs from any category are searched against.
   *
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobCategory job_categories = 4;</code>
   * @return A list containing the jobCategories.
   */
  java.util.List<com.google.cloud.talent.v4.JobCategory> getJobCategoriesList();
  /**
   * <pre>
   * The category filter specifies the categories of jobs to search against.
   * See [JobCategory][google.cloud.talent.v4.JobCategory] for more information.
   *
   * If a value isn't specified, jobs from any category are searched against.
   *
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobCategory job_categories = 4;</code>
   * @return The count of jobCategories.
   */
  int getJobCategoriesCount();
  /**
   * <pre>
   * The category filter specifies the categories of jobs to search against.
   * See [JobCategory][google.cloud.talent.v4.JobCategory] for more information.
   *
   * If a value isn't specified, jobs from any category are searched against.
   *
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobCategory job_categories = 4;</code>
   * @param index The index of the element to return.
   * @return The jobCategories at the given index.
   */
  com.google.cloud.talent.v4.JobCategory getJobCategories(int index);
  /**
   * <pre>
   * The category filter specifies the categories of jobs to search against.
   * See [JobCategory][google.cloud.talent.v4.JobCategory] for more information.
   *
   * If a value isn't specified, jobs from any category are searched against.
   *
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobCategory job_categories = 4;</code>
   * @return A list containing the enum numeric values on the wire for jobCategories.
   */
  java.util.List<java.lang.Integer>
  getJobCategoriesValueList();
  /**
   * <pre>
   * The category filter specifies the categories of jobs to search against.
   * See [JobCategory][google.cloud.talent.v4.JobCategory] for more information.
   *
   * If a value isn't specified, jobs from any category are searched against.
   *
   * If multiple values are specified, jobs from any of the specified
   * categories are searched against.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.JobCategory job_categories = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of jobCategories at the given index.
   */
  int getJobCategoriesValue(int index);

  /**
   * <pre>
   * Allows filtering jobs by commute time with different travel methods (for
   *  example, driving or public transit).
   *
   * Note: This only works when you specify a
   * [CommuteMethod][google.cloud.talent.v4.CommuteMethod]. In this case,
   * [location_filters][google.cloud.talent.v4.JobQuery.location_filters] is
   * ignored.
   *
   *  Currently we don't support sorting by commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.CommuteFilter commute_filter = 5;</code>
   * @return Whether the commuteFilter field is set.
   */
  boolean hasCommuteFilter();
  /**
   * <pre>
   * Allows filtering jobs by commute time with different travel methods (for
   *  example, driving or public transit).
   *
   * Note: This only works when you specify a
   * [CommuteMethod][google.cloud.talent.v4.CommuteMethod]. In this case,
   * [location_filters][google.cloud.talent.v4.JobQuery.location_filters] is
   * ignored.
   *
   *  Currently we don't support sorting by commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.CommuteFilter commute_filter = 5;</code>
   * @return The commuteFilter.
   */
  com.google.cloud.talent.v4.CommuteFilter getCommuteFilter();
  /**
   * <pre>
   * Allows filtering jobs by commute time with different travel methods (for
   *  example, driving or public transit).
   *
   * Note: This only works when you specify a
   * [CommuteMethod][google.cloud.talent.v4.CommuteMethod]. In this case,
   * [location_filters][google.cloud.talent.v4.JobQuery.location_filters] is
   * ignored.
   *
   *  Currently we don't support sorting by commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.CommuteFilter commute_filter = 5;</code>
   */
  com.google.cloud.talent.v4.CommuteFilterOrBuilder getCommuteFilterOrBuilder();

  /**
   * <pre>
   * This filter specifies the company
   * [Company.display_name][google.cloud.talent.v4.Company.display_name] of the
   * jobs to search against. The company name must match the value exactly.
   *
   * Alternatively, the value being searched for can be wrapped in different
   * match operators.
   * `SUBSTRING_MATCH([value])`
   * The company name must contain a case insensitive substring match of the
   * value. Using this function may increase latency.
   *
   * Sample Value: `SUBSTRING_MATCH(google)`
   *
   * `MULTI_WORD_TOKEN_MATCH([value])`
   * The value will be treated as a multi word token and the company name must
   * contain a case insensitive match of the value. Using this function may
   * increase latency.
   *
   * Sample Value: `MULTI_WORD_TOKEN_MATCH(google)`
   *
   * If a value isn't specified, jobs within the search results are
   * associated with any company.
   *
   * If multiple values are specified, jobs within the search results may be
   * associated with any of the specified companies.
   *
   * At most 20 company display name filters are allowed.
   * </pre>
   *
   * <code>repeated string company_display_names = 6;</code>
   * @return A list containing the companyDisplayNames.
   */
  java.util.List<java.lang.String>
      getCompanyDisplayNamesList();
  /**
   * <pre>
   * This filter specifies the company
   * [Company.display_name][google.cloud.talent.v4.Company.display_name] of the
   * jobs to search against. The company name must match the value exactly.
   *
   * Alternatively, the value being searched for can be wrapped in different
   * match operators.
   * `SUBSTRING_MATCH([value])`
   * The company name must contain a case insensitive substring match of the
   * value. Using this function may increase latency.
   *
   * Sample Value: `SUBSTRING_MATCH(google)`
   *
   * `MULTI_WORD_TOKEN_MATCH([value])`
   * The value will be treated as a multi word token and the company name must
   * contain a case insensitive match of the value. Using this function may
   * increase latency.
   *
   * Sample Value: `MULTI_WORD_TOKEN_MATCH(google)`
   *
   * If a value isn't specified, jobs within the search results are
   * associated with any company.
   *
   * If multiple values are specified, jobs within the search results may be
   * associated with any of the specified companies.
   *
   * At most 20 company display name filters are allowed.
   * </pre>
   *
   * <code>repeated string company_display_names = 6;</code>
   * @return The count of companyDisplayNames.
   */
  int getCompanyDisplayNamesCount();
  /**
   * <pre>
   * This filter specifies the company
   * [Company.display_name][google.cloud.talent.v4.Company.display_name] of the
   * jobs to search against. The company name must match the value exactly.
   *
   * Alternatively, the value being searched for can be wrapped in different
   * match operators.
   * `SUBSTRING_MATCH([value])`
   * The company name must contain a case insensitive substring match of the
   * value. Using this function may increase latency.
   *
   * Sample Value: `SUBSTRING_MATCH(google)`
   *
   * `MULTI_WORD_TOKEN_MATCH([value])`
   * The value will be treated as a multi word token and the company name must
   * contain a case insensitive match of the value. Using this function may
   * increase latency.
   *
   * Sample Value: `MULTI_WORD_TOKEN_MATCH(google)`
   *
   * If a value isn't specified, jobs within the search results are
   * associated with any company.
   *
   * If multiple values are specified, jobs within the search results may be
   * associated with any of the specified companies.
   *
   * At most 20 company display name filters are allowed.
   * </pre>
   *
   * <code>repeated string company_display_names = 6;</code>
   * @param index The index of the element to return.
   * @return The companyDisplayNames at the given index.
   */
  java.lang.String getCompanyDisplayNames(int index);
  /**
   * <pre>
   * This filter specifies the company
   * [Company.display_name][google.cloud.talent.v4.Company.display_name] of the
   * jobs to search against. The company name must match the value exactly.
   *
   * Alternatively, the value being searched for can be wrapped in different
   * match operators.
   * `SUBSTRING_MATCH([value])`
   * The company name must contain a case insensitive substring match of the
   * value. Using this function may increase latency.
   *
   * Sample Value: `SUBSTRING_MATCH(google)`
   *
   * `MULTI_WORD_TOKEN_MATCH([value])`
   * The value will be treated as a multi word token and the company name must
   * contain a case insensitive match of the value. Using this function may
   * increase latency.
   *
   * Sample Value: `MULTI_WORD_TOKEN_MATCH(google)`
   *
   * If a value isn't specified, jobs within the search results are
   * associated with any company.
   *
   * If multiple values are specified, jobs within the search results may be
   * associated with any of the specified companies.
   *
   * At most 20 company display name filters are allowed.
   * </pre>
   *
   * <code>repeated string company_display_names = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the companyDisplayNames at the given index.
   */
  com.google.protobuf.ByteString
      getCompanyDisplayNamesBytes(int index);

  /**
   * <pre>
   * This search filter is applied only to
   * [Job.compensation_info][google.cloud.talent.v4.Job.compensation_info]. For
   * example, if the filter is specified as "Hourly job with per-hour
   * compensation &gt; $15", only jobs meeting these criteria are searched. If a
   * filter isn't defined, all open jobs are searched.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.CompensationFilter compensation_filter = 7;</code>
   * @return Whether the compensationFilter field is set.
   */
  boolean hasCompensationFilter();
  /**
   * <pre>
   * This search filter is applied only to
   * [Job.compensation_info][google.cloud.talent.v4.Job.compensation_info]. For
   * example, if the filter is specified as "Hourly job with per-hour
   * compensation &gt; $15", only jobs meeting these criteria are searched. If a
   * filter isn't defined, all open jobs are searched.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.CompensationFilter compensation_filter = 7;</code>
   * @return The compensationFilter.
   */
  com.google.cloud.talent.v4.CompensationFilter getCompensationFilter();
  /**
   * <pre>
   * This search filter is applied only to
   * [Job.compensation_info][google.cloud.talent.v4.Job.compensation_info]. For
   * example, if the filter is specified as "Hourly job with per-hour
   * compensation &gt; $15", only jobs meeting these criteria are searched. If a
   * filter isn't defined, all open jobs are searched.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.CompensationFilter compensation_filter = 7;</code>
   */
  com.google.cloud.talent.v4.CompensationFilterOrBuilder getCompensationFilterOrBuilder();

  /**
   * <pre>
   * This filter specifies a structured syntax to match against the
   * [Job.custom_attributes][google.cloud.talent.v4.Job.custom_attributes]
   * marked as `filterable`.
   *
   * The syntax for this expression is a subset of SQL syntax.
   *
   * Supported operators are: `=`, `!=`, `&lt;`, `&lt;=`, `&gt;`, and `&gt;=` where the
   * left of the operator is a custom field key and the right of the operator
   * is a number or a quoted string. You must escape backslash (&#92;&#92;) and
   * quote (&#92;") characters.
   *
   * Supported functions are `LOWER([field_name])` to
   * perform a case insensitive match and `EMPTY([field_name])` to filter on the
   * existence of a key.
   *
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of
   * nesting (for example, "((A AND B AND C) OR NOT D) AND E"), a maximum of 100
   * comparisons or functions are allowed in the expression. The expression
   * must be &lt; 10000 bytes in length.
   *
   * Sample Query:
   * `(LOWER(driving_license)="class &#92;"a&#92;"" OR EMPTY(driving_license)) AND
   * driving_years &gt; 10`
   * </pre>
   *
   * <code>string custom_attribute_filter = 8;</code>
   * @return The customAttributeFilter.
   */
  java.lang.String getCustomAttributeFilter();
  /**
   * <pre>
   * This filter specifies a structured syntax to match against the
   * [Job.custom_attributes][google.cloud.talent.v4.Job.custom_attributes]
   * marked as `filterable`.
   *
   * The syntax for this expression is a subset of SQL syntax.
   *
   * Supported operators are: `=`, `!=`, `&lt;`, `&lt;=`, `&gt;`, and `&gt;=` where the
   * left of the operator is a custom field key and the right of the operator
   * is a number or a quoted string. You must escape backslash (&#92;&#92;) and
   * quote (&#92;") characters.
   *
   * Supported functions are `LOWER([field_name])` to
   * perform a case insensitive match and `EMPTY([field_name])` to filter on the
   * existence of a key.
   *
   * Boolean expressions (AND/OR/NOT) are supported up to 3 levels of
   * nesting (for example, "((A AND B AND C) OR NOT D) AND E"), a maximum of 100
   * comparisons or functions are allowed in the expression. The expression
   * must be &lt; 10000 bytes in length.
   *
   * Sample Query:
   * `(LOWER(driving_license)="class &#92;"a&#92;"" OR EMPTY(driving_license)) AND
   * driving_years &gt; 10`
   * </pre>
   *
   * <code>string custom_attribute_filter = 8;</code>
   * @return The bytes for customAttributeFilter.
   */
  com.google.protobuf.ByteString
      getCustomAttributeFilterBytes();

  /**
   * <pre>
   * This flag controls the spell-check feature. If false, the
   * service attempts to correct a misspelled query,
   * for example, "enginee" is corrected to "engineer".
   *
   * Defaults to false: a spell check is performed.
   * </pre>
   *
   * <code>bool disable_spell_check = 9;</code>
   * @return The disableSpellCheck.
   */
  boolean getDisableSpellCheck();

  /**
   * <pre>
   * The employment type filter specifies the employment type of jobs to
   * search against, such as
   * [EmploymentType.FULL_TIME][google.cloud.talent.v4.EmploymentType.FULL_TIME].
   *
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   *
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.EmploymentType employment_types = 10;</code>
   * @return A list containing the employmentTypes.
   */
  java.util.List<com.google.cloud.talent.v4.EmploymentType> getEmploymentTypesList();
  /**
   * <pre>
   * The employment type filter specifies the employment type of jobs to
   * search against, such as
   * [EmploymentType.FULL_TIME][google.cloud.talent.v4.EmploymentType.FULL_TIME].
   *
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   *
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.EmploymentType employment_types = 10;</code>
   * @return The count of employmentTypes.
   */
  int getEmploymentTypesCount();
  /**
   * <pre>
   * The employment type filter specifies the employment type of jobs to
   * search against, such as
   * [EmploymentType.FULL_TIME][google.cloud.talent.v4.EmploymentType.FULL_TIME].
   *
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   *
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.EmploymentType employment_types = 10;</code>
   * @param index The index of the element to return.
   * @return The employmentTypes at the given index.
   */
  com.google.cloud.talent.v4.EmploymentType getEmploymentTypes(int index);
  /**
   * <pre>
   * The employment type filter specifies the employment type of jobs to
   * search against, such as
   * [EmploymentType.FULL_TIME][google.cloud.talent.v4.EmploymentType.FULL_TIME].
   *
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   *
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.EmploymentType employment_types = 10;</code>
   * @return A list containing the enum numeric values on the wire for employmentTypes.
   */
  java.util.List<java.lang.Integer>
  getEmploymentTypesValueList();
  /**
   * <pre>
   * The employment type filter specifies the employment type of jobs to
   * search against, such as
   * [EmploymentType.FULL_TIME][google.cloud.talent.v4.EmploymentType.FULL_TIME].
   *
   * If a value isn't specified, jobs in the search results includes any
   * employment type.
   *
   * If multiple values are specified, jobs in the search results include
   * any of the specified employment types.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4.EmploymentType employment_types = 10;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of employmentTypes at the given index.
   */
  int getEmploymentTypesValue(int index);

  /**
   * <pre>
   * This filter specifies the locale of jobs to search against,
   * for example, "en-US".
   *
   * If a value isn't specified, the search results can contain jobs in any
   * locale.
   *
   *
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   *
   * At most 10 language code filters are allowed.
   * </pre>
   *
   * <code>repeated string language_codes = 11;</code>
   * @return A list containing the languageCodes.
   */
  java.util.List<java.lang.String>
      getLanguageCodesList();
  /**
   * <pre>
   * This filter specifies the locale of jobs to search against,
   * for example, "en-US".
   *
   * If a value isn't specified, the search results can contain jobs in any
   * locale.
   *
   *
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   *
   * At most 10 language code filters are allowed.
   * </pre>
   *
   * <code>repeated string language_codes = 11;</code>
   * @return The count of languageCodes.
   */
  int getLanguageCodesCount();
  /**
   * <pre>
   * This filter specifies the locale of jobs to search against,
   * for example, "en-US".
   *
   * If a value isn't specified, the search results can contain jobs in any
   * locale.
   *
   *
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   *
   * At most 10 language code filters are allowed.
   * </pre>
   *
   * <code>repeated string language_codes = 11;</code>
   * @param index The index of the element to return.
   * @return The languageCodes at the given index.
   */
  java.lang.String getLanguageCodes(int index);
  /**
   * <pre>
   * This filter specifies the locale of jobs to search against,
   * for example, "en-US".
   *
   * If a value isn't specified, the search results can contain jobs in any
   * locale.
   *
   *
   * Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   *
   * At most 10 language code filters are allowed.
   * </pre>
   *
   * <code>repeated string language_codes = 11;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageCodes at the given index.
   */
  com.google.protobuf.ByteString
      getLanguageCodesBytes(int index);

  /**
   * <pre>
   * Jobs published within a range specified by this filter are searched
   * against.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.TimestampRange publish_time_range = 12;</code>
   * @return Whether the publishTimeRange field is set.
   */
  boolean hasPublishTimeRange();
  /**
   * <pre>
   * Jobs published within a range specified by this filter are searched
   * against.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.TimestampRange publish_time_range = 12;</code>
   * @return The publishTimeRange.
   */
  com.google.cloud.talent.v4.TimestampRange getPublishTimeRange();
  /**
   * <pre>
   * Jobs published within a range specified by this filter are searched
   * against.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.TimestampRange publish_time_range = 12;</code>
   */
  com.google.cloud.talent.v4.TimestampRangeOrBuilder getPublishTimeRangeOrBuilder();

  /**
   * <pre>
   * This filter specifies a list of job names to be excluded during search.
   *
   * At most 400 excluded job names are allowed.
   * </pre>
   *
   * <code>repeated string excluded_jobs = 13;</code>
   * @return A list containing the excludedJobs.
   */
  java.util.List<java.lang.String>
      getExcludedJobsList();
  /**
   * <pre>
   * This filter specifies a list of job names to be excluded during search.
   *
   * At most 400 excluded job names are allowed.
   * </pre>
   *
   * <code>repeated string excluded_jobs = 13;</code>
   * @return The count of excludedJobs.
   */
  int getExcludedJobsCount();
  /**
   * <pre>
   * This filter specifies a list of job names to be excluded during search.
   *
   * At most 400 excluded job names are allowed.
   * </pre>
   *
   * <code>repeated string excluded_jobs = 13;</code>
   * @param index The index of the element to return.
   * @return The excludedJobs at the given index.
   */
  java.lang.String getExcludedJobs(int index);
  /**
   * <pre>
   * This filter specifies a list of job names to be excluded during search.
   *
   * At most 400 excluded job names are allowed.
   * </pre>
   *
   * <code>repeated string excluded_jobs = 13;</code>
   * @param index The index of the value to return.
   * @return The bytes of the excludedJobs at the given index.
   */
  com.google.protobuf.ByteString
      getExcludedJobsBytes(int index);
}
