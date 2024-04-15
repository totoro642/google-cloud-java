// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/task.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tasks.v2;

public interface TaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.Task)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optionally caller-specified in
   * [CreateTask][google.cloud.tasks.v2.CloudTasks.CreateTask].
   *
   * The task name.
   *
   * The task name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the task's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),
   *   hyphens (-), or underscores (_). The maximum length is 500 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optionally caller-specified in
   * [CreateTask][google.cloud.tasks.v2.CloudTasks.CreateTask].
   *
   * The task name.
   *
   * The task name must have the following format:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   *
   * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),
   *    hyphens (-), colons (:), or periods (.).
   *    For more information, see
   *    [Identifying
   *    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
   * * `LOCATION_ID` is the canonical ID for the task's location.
   *    The list of available locations can be obtained by calling
   *    [ListLocations][google.cloud.location.Locations.ListLocations].
   *    For more information, see https://cloud.google.com/about/locations/.
   * * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or
   *   hyphens (-). The maximum length is 100 characters.
   * * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),
   *   hyphens (-), or underscores (_). The maximum length is 500 characters.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * HTTP request that is sent to the App Engine app handler.
   *
   * An App Engine task is a task that has
   * [AppEngineHttpRequest][google.cloud.tasks.v2.AppEngineHttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineHttpRequest app_engine_http_request = 2;</code>
   * @return Whether the appEngineHttpRequest field is set.
   */
  boolean hasAppEngineHttpRequest();
  /**
   * <pre>
   * HTTP request that is sent to the App Engine app handler.
   *
   * An App Engine task is a task that has
   * [AppEngineHttpRequest][google.cloud.tasks.v2.AppEngineHttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineHttpRequest app_engine_http_request = 2;</code>
   * @return The appEngineHttpRequest.
   */
  com.google.cloud.tasks.v2.AppEngineHttpRequest getAppEngineHttpRequest();
  /**
   * <pre>
   * HTTP request that is sent to the App Engine app handler.
   *
   * An App Engine task is a task that has
   * [AppEngineHttpRequest][google.cloud.tasks.v2.AppEngineHttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.AppEngineHttpRequest app_engine_http_request = 2;</code>
   */
  com.google.cloud.tasks.v2.AppEngineHttpRequestOrBuilder getAppEngineHttpRequestOrBuilder();

  /**
   * <pre>
   * HTTP request that is sent to the worker.
   *
   * An HTTP task is a task that has
   * [HttpRequest][google.cloud.tasks.v2.HttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.HttpRequest http_request = 3;</code>
   * @return Whether the httpRequest field is set.
   */
  boolean hasHttpRequest();
  /**
   * <pre>
   * HTTP request that is sent to the worker.
   *
   * An HTTP task is a task that has
   * [HttpRequest][google.cloud.tasks.v2.HttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.HttpRequest http_request = 3;</code>
   * @return The httpRequest.
   */
  com.google.cloud.tasks.v2.HttpRequest getHttpRequest();
  /**
   * <pre>
   * HTTP request that is sent to the worker.
   *
   * An HTTP task is a task that has
   * [HttpRequest][google.cloud.tasks.v2.HttpRequest] set.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.HttpRequest http_request = 3;</code>
   */
  com.google.cloud.tasks.v2.HttpRequestOrBuilder getHttpRequestOrBuilder();

  /**
   * <pre>
   * The time when the task is scheduled to be attempted or retried.
   *
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 4;</code>
   * @return Whether the scheduleTime field is set.
   */
  boolean hasScheduleTime();
  /**
   * <pre>
   * The time when the task is scheduled to be attempted or retried.
   *
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 4;</code>
   * @return The scheduleTime.
   */
  com.google.protobuf.Timestamp getScheduleTime();
  /**
   * <pre>
   * The time when the task is scheduled to be attempted or retried.
   *
   * `schedule_time` will be truncated to the nearest microsecond.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time that the task was created.
   *
   * `create_time` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time that the task was created.
   *
   * `create_time` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time that the task was created.
   *
   * `create_time` will be truncated to the nearest second.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The deadline for requests sent to the worker. If the worker does not
   * respond by this deadline then the request is cancelled and the attempt
   * is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the
   * task according to the [RetryConfig][google.cloud.tasks.v2.RetryConfig].
   *
   * Note that when the request is cancelled, Cloud Tasks will stop listening
   * for the response, but whether the worker stops processing depends on the
   * worker. For example, if the worker is stuck, it may not react to cancelled
   * requests.
   *
   * The default and maximum values depend on the type of request:
   *
   * * For [HTTP tasks][google.cloud.tasks.v2.HttpRequest], the default is 10
   * minutes. The deadline
   *   must be in the interval [15 seconds, 30 minutes].
   *
   * * For [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest], 0
   * indicates that the
   *   request has the default deadline. The default deadline depends on the
   *   [scaling
   *   type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling)
   *   of the service: 10 minutes for standard apps with automatic scaling, 24
   *   hours for standard apps with manual and basic scaling, and 60 minutes for
   *   flex apps. If the request deadline is set, it must be in the interval [15
   *   seconds, 24 hours 15 seconds]. Regardless of the task's
   *   `dispatch_deadline`, the app handler will not run for longer than than
   *   the service's timeout. We recommend setting the `dispatch_deadline` to
   *   at most a few seconds more than the app handler's timeout. For more
   *   information see
   *   [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts).
   *
   * `dispatch_deadline` will be truncated to the nearest millisecond. The
   * deadline is an approximate deadline.
   * </pre>
   *
   * <code>.google.protobuf.Duration dispatch_deadline = 6;</code>
   * @return Whether the dispatchDeadline field is set.
   */
  boolean hasDispatchDeadline();
  /**
   * <pre>
   * The deadline for requests sent to the worker. If the worker does not
   * respond by this deadline then the request is cancelled and the attempt
   * is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the
   * task according to the [RetryConfig][google.cloud.tasks.v2.RetryConfig].
   *
   * Note that when the request is cancelled, Cloud Tasks will stop listening
   * for the response, but whether the worker stops processing depends on the
   * worker. For example, if the worker is stuck, it may not react to cancelled
   * requests.
   *
   * The default and maximum values depend on the type of request:
   *
   * * For [HTTP tasks][google.cloud.tasks.v2.HttpRequest], the default is 10
   * minutes. The deadline
   *   must be in the interval [15 seconds, 30 minutes].
   *
   * * For [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest], 0
   * indicates that the
   *   request has the default deadline. The default deadline depends on the
   *   [scaling
   *   type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling)
   *   of the service: 10 minutes for standard apps with automatic scaling, 24
   *   hours for standard apps with manual and basic scaling, and 60 minutes for
   *   flex apps. If the request deadline is set, it must be in the interval [15
   *   seconds, 24 hours 15 seconds]. Regardless of the task's
   *   `dispatch_deadline`, the app handler will not run for longer than than
   *   the service's timeout. We recommend setting the `dispatch_deadline` to
   *   at most a few seconds more than the app handler's timeout. For more
   *   information see
   *   [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts).
   *
   * `dispatch_deadline` will be truncated to the nearest millisecond. The
   * deadline is an approximate deadline.
   * </pre>
   *
   * <code>.google.protobuf.Duration dispatch_deadline = 6;</code>
   * @return The dispatchDeadline.
   */
  com.google.protobuf.Duration getDispatchDeadline();
  /**
   * <pre>
   * The deadline for requests sent to the worker. If the worker does not
   * respond by this deadline then the request is cancelled and the attempt
   * is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the
   * task according to the [RetryConfig][google.cloud.tasks.v2.RetryConfig].
   *
   * Note that when the request is cancelled, Cloud Tasks will stop listening
   * for the response, but whether the worker stops processing depends on the
   * worker. For example, if the worker is stuck, it may not react to cancelled
   * requests.
   *
   * The default and maximum values depend on the type of request:
   *
   * * For [HTTP tasks][google.cloud.tasks.v2.HttpRequest], the default is 10
   * minutes. The deadline
   *   must be in the interval [15 seconds, 30 minutes].
   *
   * * For [App Engine tasks][google.cloud.tasks.v2.AppEngineHttpRequest], 0
   * indicates that the
   *   request has the default deadline. The default deadline depends on the
   *   [scaling
   *   type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling)
   *   of the service: 10 minutes for standard apps with automatic scaling, 24
   *   hours for standard apps with manual and basic scaling, and 60 minutes for
   *   flex apps. If the request deadline is set, it must be in the interval [15
   *   seconds, 24 hours 15 seconds]. Regardless of the task's
   *   `dispatch_deadline`, the app handler will not run for longer than than
   *   the service's timeout. We recommend setting the `dispatch_deadline` to
   *   at most a few seconds more than the app handler's timeout. For more
   *   information see
   *   [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts).
   *
   * `dispatch_deadline` will be truncated to the nearest millisecond. The
   * deadline is an approximate deadline.
   * </pre>
   *
   * <code>.google.protobuf.Duration dispatch_deadline = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getDispatchDeadlineOrBuilder();

  /**
   * <pre>
   * Output only. The number of attempts dispatched.
   *
   * This count includes attempts which have been dispatched but haven't
   * received a response.
   * </pre>
   *
   * <code>int32 dispatch_count = 7;</code>
   * @return The dispatchCount.
   */
  int getDispatchCount();

  /**
   * <pre>
   * Output only. The number of attempts which have received a response.
   * </pre>
   *
   * <code>int32 response_count = 8;</code>
   * @return The responseCount.
   */
  int getResponseCount();

  /**
   * <pre>
   * Output only. The status of the task's first attempt.
   *
   * Only [dispatch_time][google.cloud.tasks.v2.Attempt.dispatch_time] will be
   * set. The other [Attempt][google.cloud.tasks.v2.Attempt] information is not
   * retained by Cloud Tasks.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Attempt first_attempt = 9;</code>
   * @return Whether the firstAttempt field is set.
   */
  boolean hasFirstAttempt();
  /**
   * <pre>
   * Output only. The status of the task's first attempt.
   *
   * Only [dispatch_time][google.cloud.tasks.v2.Attempt.dispatch_time] will be
   * set. The other [Attempt][google.cloud.tasks.v2.Attempt] information is not
   * retained by Cloud Tasks.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Attempt first_attempt = 9;</code>
   * @return The firstAttempt.
   */
  com.google.cloud.tasks.v2.Attempt getFirstAttempt();
  /**
   * <pre>
   * Output only. The status of the task's first attempt.
   *
   * Only [dispatch_time][google.cloud.tasks.v2.Attempt.dispatch_time] will be
   * set. The other [Attempt][google.cloud.tasks.v2.Attempt] information is not
   * retained by Cloud Tasks.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Attempt first_attempt = 9;</code>
   */
  com.google.cloud.tasks.v2.AttemptOrBuilder getFirstAttemptOrBuilder();

  /**
   * <pre>
   * Output only. The status of the task's last attempt.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Attempt last_attempt = 10;</code>
   * @return Whether the lastAttempt field is set.
   */
  boolean hasLastAttempt();
  /**
   * <pre>
   * Output only. The status of the task's last attempt.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Attempt last_attempt = 10;</code>
   * @return The lastAttempt.
   */
  com.google.cloud.tasks.v2.Attempt getLastAttempt();
  /**
   * <pre>
   * Output only. The status of the task's last attempt.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Attempt last_attempt = 10;</code>
   */
  com.google.cloud.tasks.v2.AttemptOrBuilder getLastAttemptOrBuilder();

  /**
   * <pre>
   * Output only. The view specifies which subset of the
   * [Task][google.cloud.tasks.v2.Task] has been returned.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Task.View view = 11;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * Output only. The view specifies which subset of the
   * [Task][google.cloud.tasks.v2.Task] has been returned.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2.Task.View view = 11;</code>
   * @return The view.
   */
  com.google.cloud.tasks.v2.Task.View getView();

  com.google.cloud.tasks.v2.Task.MessageTypeCase getMessageTypeCase();
}
