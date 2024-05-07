/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * The quantitative measurements of a report. For example, the metric
 * `eventCount` is the total number of events. Requests are allowed up to 10
 * metrics.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.Metric}
 */
public final class Metric extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.Metric)
    MetricOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Metric.newBuilder() to construct.
  private Metric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Metric() {
    name_ = "";
    expression_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Metric();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Metric_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_Metric_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.Metric.class,
            com.google.analytics.data.v1alpha.Metric.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The name of the metric. See the [API
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
   * for the list of metric names supported by core reporting methods such
   * as `runReport` and `batchRunReports`. See
   * [Realtime
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
   * for the list of metric names supported by the `runRealtimeReport`
   * method. See
   * [Funnel
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
   * for the list of metric names supported by the `runFunnelReport`
   * method.
   *
   * If `expression` is specified, `name` can be any string that you would like
   * within the allowed character set. For example if `expression` is
   * `screenPageViews/sessions`, you could call that metric's name =
   * `viewsPerSession`. Metric names that you choose must match the regular
   * expression `^[a-zA-Z0-9_]$`.
   *
   * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
   * `expression`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the metric. See the [API
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
   * for the list of metric names supported by core reporting methods such
   * as `runReport` and `batchRunReports`. See
   * [Realtime
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
   * for the list of metric names supported by the `runRealtimeReport`
   * method. See
   * [Funnel
   * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
   * for the list of metric names supported by the `runFunnelReport`
   * method.
   *
   * If `expression` is specified, `name` can be any string that you would like
   * within the allowed character set. For example if `expression` is
   * `screenPageViews/sessions`, you could call that metric's name =
   * `viewsPerSession`. Metric names that you choose must match the regular
   * expression `^[a-zA-Z0-9_]$`.
   *
   * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
   * `expression`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPRESSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object expression_ = "";
  /**
   *
   *
   * <pre>
   * A mathematical expression for derived metrics. For example, the metric
   * Event count per user is `eventCount/totalUsers`.
   * </pre>
   *
   * <code>string expression = 2;</code>
   *
   * @return The expression.
   */
  @java.lang.Override
  public java.lang.String getExpression() {
    java.lang.Object ref = expression_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expression_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A mathematical expression for derived metrics. For example, the metric
   * Event count per user is `eventCount/totalUsers`.
   * </pre>
   *
   * <code>string expression = 2;</code>
   *
   * @return The bytes for expression.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExpressionBytes() {
    java.lang.Object ref = expression_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      expression_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INVISIBLE_FIELD_NUMBER = 3;
  private boolean invisible_ = false;
  /**
   *
   *
   * <pre>
   * Indicates if a metric is invisible in the report response. If a metric is
   * invisible, the metric will not produce a column in the response, but can be
   * used in `metricFilter`, `orderBys`, or a metric `expression`.
   * </pre>
   *
   * <code>bool invisible = 3;</code>
   *
   * @return The invisible.
   */
  @java.lang.Override
  public boolean getInvisible() {
    return invisible_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expression_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, expression_);
    }
    if (invisible_ != false) {
      output.writeBool(3, invisible_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expression_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, expression_);
    }
    if (invisible_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, invisible_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.analytics.data.v1alpha.Metric)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.Metric other = (com.google.analytics.data.v1alpha.Metric) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getExpression().equals(other.getExpression())) return false;
    if (getInvisible() != other.getInvisible()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + getExpression().hashCode();
    hash = (37 * hash) + INVISIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getInvisible());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metric parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Metric parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.Metric parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.analytics.data.v1alpha.Metric prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The quantitative measurements of a report. For example, the metric
   * `eventCount` is the total number of events. Requests are allowed up to 10
   * metrics.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.Metric}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.Metric)
      com.google.analytics.data.v1alpha.MetricOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Metric_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Metric_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.Metric.class,
              com.google.analytics.data.v1alpha.Metric.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.Metric.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      expression_ = "";
      invisible_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_Metric_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Metric getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.Metric.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Metric build() {
      com.google.analytics.data.v1alpha.Metric result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.Metric buildPartial() {
      com.google.analytics.data.v1alpha.Metric result =
          new com.google.analytics.data.v1alpha.Metric(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.Metric result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expression_ = expression_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.invisible_ = invisible_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.data.v1alpha.Metric) {
        return mergeFrom((com.google.analytics.data.v1alpha.Metric) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.Metric other) {
      if (other == com.google.analytics.data.v1alpha.Metric.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getExpression().isEmpty()) {
        expression_ = other.expression_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getInvisible() != false) {
        setInvisible(other.getInvisible());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                expression_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                invisible_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name of the metric. See the [API
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
     * for the list of metric names supported by core reporting methods such
     * as `runReport` and `batchRunReports`. See
     * [Realtime
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
     * for the list of metric names supported by the `runRealtimeReport`
     * method. See
     * [Funnel
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
     * for the list of metric names supported by the `runFunnelReport`
     * method.
     *
     * If `expression` is specified, `name` can be any string that you would like
     * within the allowed character set. For example if `expression` is
     * `screenPageViews/sessions`, you could call that metric's name =
     * `viewsPerSession`. Metric names that you choose must match the regular
     * expression `^[a-zA-Z0-9_]$`.
     *
     * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
     * `expression`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the metric. See the [API
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
     * for the list of metric names supported by core reporting methods such
     * as `runReport` and `batchRunReports`. See
     * [Realtime
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
     * for the list of metric names supported by the `runRealtimeReport`
     * method. See
     * [Funnel
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
     * for the list of metric names supported by the `runFunnelReport`
     * method.
     *
     * If `expression` is specified, `name` can be any string that you would like
     * within the allowed character set. For example if `expression` is
     * `screenPageViews/sessions`, you could call that metric's name =
     * `viewsPerSession`. Metric names that you choose must match the regular
     * expression `^[a-zA-Z0-9_]$`.
     *
     * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
     * `expression`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the metric. See the [API
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
     * for the list of metric names supported by core reporting methods such
     * as `runReport` and `batchRunReports`. See
     * [Realtime
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
     * for the list of metric names supported by the `runRealtimeReport`
     * method. See
     * [Funnel
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
     * for the list of metric names supported by the `runFunnelReport`
     * method.
     *
     * If `expression` is specified, `name` can be any string that you would like
     * within the allowed character set. For example if `expression` is
     * `screenPageViews/sessions`, you could call that metric's name =
     * `viewsPerSession`. Metric names that you choose must match the regular
     * expression `^[a-zA-Z0-9_]$`.
     *
     * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
     * `expression`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the metric. See the [API
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
     * for the list of metric names supported by core reporting methods such
     * as `runReport` and `batchRunReports`. See
     * [Realtime
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
     * for the list of metric names supported by the `runRealtimeReport`
     * method. See
     * [Funnel
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
     * for the list of metric names supported by the `runFunnelReport`
     * method.
     *
     * If `expression` is specified, `name` can be any string that you would like
     * within the allowed character set. For example if `expression` is
     * `screenPageViews/sessions`, you could call that metric's name =
     * `viewsPerSession`. Metric names that you choose must match the regular
     * expression `^[a-zA-Z0-9_]$`.
     *
     * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
     * `expression`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the metric. See the [API
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#metrics)
     * for the list of metric names supported by core reporting methods such
     * as `runReport` and `batchRunReports`. See
     * [Realtime
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#metrics)
     * for the list of metric names supported by the `runRealtimeReport`
     * method. See
     * [Funnel
     * Metrics](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#metrics)
     * for the list of metric names supported by the `runFunnelReport`
     * method.
     *
     * If `expression` is specified, `name` can be any string that you would like
     * within the allowed character set. For example if `expression` is
     * `screenPageViews/sessions`, you could call that metric's name =
     * `viewsPerSession`. Metric names that you choose must match the regular
     * expression `^[a-zA-Z0-9_]$`.
     *
     * Metrics are referenced by `name` in `metricFilter`, `orderBys`, and metric
     * `expression`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object expression_ = "";
    /**
     *
     *
     * <pre>
     * A mathematical expression for derived metrics. For example, the metric
     * Event count per user is `eventCount/totalUsers`.
     * </pre>
     *
     * <code>string expression = 2;</code>
     *
     * @return The expression.
     */
    public java.lang.String getExpression() {
      java.lang.Object ref = expression_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expression_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A mathematical expression for derived metrics. For example, the metric
     * Event count per user is `eventCount/totalUsers`.
     * </pre>
     *
     * <code>string expression = 2;</code>
     *
     * @return The bytes for expression.
     */
    public com.google.protobuf.ByteString getExpressionBytes() {
      java.lang.Object ref = expression_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        expression_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A mathematical expression for derived metrics. For example, the metric
     * Event count per user is `eventCount/totalUsers`.
     * </pre>
     *
     * <code>string expression = 2;</code>
     *
     * @param value The expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpression(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      expression_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A mathematical expression for derived metrics. For example, the metric
     * Event count per user is `eventCount/totalUsers`.
     * </pre>
     *
     * <code>string expression = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExpression() {
      expression_ = getDefaultInstance().getExpression();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A mathematical expression for derived metrics. For example, the metric
     * Event count per user is `eventCount/totalUsers`.
     * </pre>
     *
     * <code>string expression = 2;</code>
     *
     * @param value The bytes for expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpressionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      expression_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean invisible_;
    /**
     *
     *
     * <pre>
     * Indicates if a metric is invisible in the report response. If a metric is
     * invisible, the metric will not produce a column in the response, but can be
     * used in `metricFilter`, `orderBys`, or a metric `expression`.
     * </pre>
     *
     * <code>bool invisible = 3;</code>
     *
     * @return The invisible.
     */
    @java.lang.Override
    public boolean getInvisible() {
      return invisible_;
    }
    /**
     *
     *
     * <pre>
     * Indicates if a metric is invisible in the report response. If a metric is
     * invisible, the metric will not produce a column in the response, but can be
     * used in `metricFilter`, `orderBys`, or a metric `expression`.
     * </pre>
     *
     * <code>bool invisible = 3;</code>
     *
     * @param value The invisible to set.
     * @return This builder for chaining.
     */
    public Builder setInvisible(boolean value) {

      invisible_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates if a metric is invisible in the report response. If a metric is
     * invisible, the metric will not produce a column in the response, but can be
     * used in `metricFilter`, `orderBys`, or a metric `expression`.
     * </pre>
     *
     * <code>bool invisible = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInvisible() {
      bitField0_ = (bitField0_ & ~0x00000004);
      invisible_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.Metric)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.Metric)
  private static final com.google.analytics.data.v1alpha.Metric DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.Metric();
  }

  public static com.google.analytics.data.v1alpha.Metric getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metric> PARSER =
      new com.google.protobuf.AbstractParser<Metric>() {
        @java.lang.Override
        public Metric parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<Metric> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metric> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.Metric getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
