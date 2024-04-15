// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/workflows/executions/v1/executions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.workflows.executions.v1;

public final class ExecutionsProto {
  private ExecutionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_Position_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_Position_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTrace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_StackTrace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_Error_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_Error_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_Status_Step_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_Status_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_StateError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_StateError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_Execution_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_Execution_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_ListExecutionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_ListExecutionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_ListExecutionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_ListExecutionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_GetExecutionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_GetExecutionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_workflows_executions_v1_CancelExecutionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_executions_v1_CancelExecutionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/workflows/executions/v1/e" +
      "xecutions.proto\022$google.cloud.workflows." +
      "executions.v1\032\034google/api/annotations.pr" +
      "oto\032\027google/api/client.proto\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\032\036google/protobuf/duration.proto" +
      "\032\037google/protobuf/timestamp.proto\"\275\016\n\tEx" +
      "ecution\022\021\n\004name\030\001 \001(\tB\003\340A\003\0223\n\nstart_time" +
      "\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "1\n\010end_time\030\003 \001(\0132\032.google.protobuf.Time" +
      "stampB\003\340A\003\0220\n\010duration\030\014 \001(\0132\031.google.pr" +
      "otobuf.DurationB\003\340A\003\022I\n\005state\030\004 \001(\01625.go" +
      "ogle.cloud.workflows.executions.v1.Execu" +
      "tion.StateB\003\340A\003\022\020\n\010argument\030\005 \001(\t\022\023\n\006res" +
      "ult\030\006 \001(\tB\003\340A\003\022I\n\005error\030\007 \001(\01325.google.c" +
      "loud.workflows.executions.v1.Execution.E" +
      "rrorB\003\340A\003\022!\n\024workflow_revision_id\030\010 \001(\tB" +
      "\003\340A\003\022T\n\016call_log_level\030\t \001(\0162<.google.cl" +
      "oud.workflows.executions.v1.Execution.Ca" +
      "llLogLevel\022K\n\006status\030\n \001(\01326.google.clou" +
      "d.workflows.executions.v1.Execution.Stat" +
      "usB\003\340A\003\022K\n\006labels\030\013 \003(\0132;.google.cloud.w" +
      "orkflows.executions.v1.Execution.LabelsE" +
      "ntry\022T\n\013state_error\030\r \001(\0132:.google.cloud" +
      ".workflows.executions.v1.Execution.State" +
      "ErrorB\003\340A\003\032\312\001\n\021StackTraceElement\022\014\n\004step" +
      "\030\001 \001(\t\022\017\n\007routine\030\002 \001(\t\022\\\n\010position\030\003 \001(" +
      "\0132J.google.cloud.workflows.executions.v1" +
      ".Execution.StackTraceElement.Position\0328\n" +
      "\010Position\022\014\n\004line\030\001 \001(\003\022\016\n\006column\030\002 \001(\003\022" +
      "\016\n\006length\030\003 \001(\003\032a\n\nStackTrace\022S\n\010element" +
      "s\030\001 \003(\0132A.google.cloud.workflows.executi" +
      "ons.v1.Execution.StackTraceElement\032z\n\005Er" +
      "ror\022\017\n\007payload\030\001 \001(\t\022\017\n\007context\030\002 \001(\t\022O\n" +
      "\013stack_trace\030\003 \001(\0132:.google.cloud.workfl" +
      "ows.executions.v1.Execution.StackTrace\032\203" +
      "\001\n\006Status\022R\n\rcurrent_steps\030\001 \003(\0132;.googl" +
      "e.cloud.workflows.executions.v1.Executio" +
      "n.Status.Step\032%\n\004Step\022\017\n\007routine\030\001 \001(\t\022\014" +
      "\n\004step\030\002 \001(\t\032\231\001\n\nStateError\022\017\n\007details\030\001" +
      " \001(\t\022M\n\004type\030\002 \001(\0162?.google.cloud.workfl" +
      "ows.executions.v1.Execution.StateError.T" +
      "ype\"+\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\r\n\tKMS" +
      "_ERROR\020\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001\"q\n\005State\022\025\n\021STATE_UNSPEC" +
      "IFIED\020\000\022\n\n\006ACTIVE\020\001\022\r\n\tSUCCEEDED\020\002\022\n\n\006FA" +
      "ILED\020\003\022\r\n\tCANCELLED\020\004\022\017\n\013UNAVAILABLE\020\005\022\n" +
      "\n\006QUEUED\020\006\"d\n\014CallLogLevel\022\036\n\032CALL_LOG_L" +
      "EVEL_UNSPECIFIED\020\000\022\021\n\rLOG_ALL_CALLS\020\001\022\023\n" +
      "\017LOG_ERRORS_ONLY\020\002\022\014\n\010LOG_NONE\020\003:\206\001\352A\202\001\n" +
      "+workflowexecutions.googleapis.com/Execu" +
      "tion\022Sprojects/{project}/locations/{loca" +
      "tion}/workflows/{workflow}/executions/{e" +
      "xecution}\"\355\001\n\025ListExecutionsRequest\0229\n\006p" +
      "arent\030\001 \001(\tB)\340A\002\372A#\n!workflows.googleapi" +
      "s.com/Workflow\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npag" +
      "e_token\030\003 \001(\t\022F\n\004view\030\004 \001(\01623.google.clo" +
      "ud.workflows.executions.v1.ExecutionView" +
      "B\003\340A\001\022\023\n\006filter\030\005 \001(\tB\003\340A\001\022\025\n\010order_by\030\006" +
      " \001(\tB\003\340A\001\"v\n\026ListExecutionsResponse\022C\n\ne" +
      "xecutions\030\001 \003(\0132/.google.cloud.workflows" +
      ".executions.v1.Execution\022\027\n\017next_page_to" +
      "ken\030\002 \001(\t\"\234\001\n\026CreateExecutionRequest\0229\n\006" +
      "parent\030\001 \001(\tB)\340A\002\372A#\n!workflows.googleap" +
      "is.com/Workflow\022G\n\texecution\030\002 \001(\0132/.goo" +
      "gle.cloud.workflows.executions.v1.Execut" +
      "ionB\003\340A\002\"\240\001\n\023GetExecutionRequest\022A\n\004name" +
      "\030\001 \001(\tB3\340A\002\372A-\n+workflowexecutions.googl" +
      "eapis.com/Execution\022F\n\004view\030\002 \001(\01623.goog" +
      "le.cloud.workflows.executions.v1.Executi" +
      "onViewB\003\340A\001\"[\n\026CancelExecutionRequest\022A\n" +
      "\004name\030\001 \001(\tB3\340A\002\372A-\n+workflowexecutions." +
      "googleapis.com/Execution*D\n\rExecutionVie" +
      "w\022\036\n\032EXECUTION_VIEW_UNSPECIFIED\020\000\022\t\n\005BAS" +
      "IC\020\001\022\010\n\004FULL\020\0022\303\007\n\nExecutions\022\330\001\n\016ListEx" +
      "ecutions\022;.google.cloud.workflows.execut" +
      "ions.v1.ListExecutionsRequest\032<.google.c" +
      "loud.workflows.executions.v1.ListExecuti" +
      "onsResponse\"K\332A\006parent\202\323\344\223\002<\022:/v1/{paren" +
      "t=projects/*/locations/*/workflows/*}/ex" +
      "ecutions\022\342\001\n\017CreateExecution\022<.google.cl" +
      "oud.workflows.executions.v1.CreateExecut" +
      "ionRequest\032/.google.cloud.workflows.exec" +
      "utions.v1.Execution\"`\332A\020parent,execution" +
      "\202\323\344\223\002G\":/v1/{parent=projects/*/locations" +
      "/*/workflows/*}/executions:\texecution\022\305\001" +
      "\n\014GetExecution\0229.google.cloud.workflows." +
      "executions.v1.GetExecutionRequest\032/.goog" +
      "le.cloud.workflows.executions.v1.Executi" +
      "on\"I\332A\004name\202\323\344\223\002<\022:/v1/{name=projects/*/" +
      "locations/*/workflows/*/executions/*}\022\325\001" +
      "\n\017CancelExecution\022<.google.cloud.workflo" +
      "ws.executions.v1.CancelExecutionRequest\032" +
      "/.google.cloud.workflows.executions.v1.E" +
      "xecution\"S\332A\004name\202\323\344\223\002F\"A/v1/{name=proje" +
      "cts/*/locations/*/workflows/*/executions" +
      "/*}:cancel:\001*\032U\312A!workflowexecutions.goo" +
      "gleapis.com\322A.https://www.googleapis.com" +
      "/auth/cloud-platformB\353\001\n(com.google.clou" +
      "d.workflows.executions.v1B\017ExecutionsPro" +
      "toP\001ZHcloud.google.com/go/workflows/exec" +
      "utions/apiv1/executionspb;executionspb\352A" +
      "a\n!workflows.googleapis.com/Workflow\022<pr" +
      "ojects/{project}/locations/{location}/wo" +
      "rkflows/{workflow}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_workflows_executions_v1_Execution_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_workflows_executions_v1_Execution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_descriptor,
        new java.lang.String[] { "Name", "StartTime", "EndTime", "Duration", "State", "Argument", "Result", "Error", "WorkflowRevisionId", "CallLogLevel", "Status", "Labels", "StateError", });
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_descriptor =
      internal_static_google_cloud_workflows_executions_v1_Execution_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_descriptor,
        new java.lang.String[] { "Step", "Routine", "Position", });
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_Position_descriptor =
      internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_Position_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_StackTraceElement_Position_descriptor,
        new java.lang.String[] { "Line", "Column", "Length", });
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTrace_descriptor =
      internal_static_google_cloud_workflows_executions_v1_Execution_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_workflows_executions_v1_Execution_StackTrace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_StackTrace_descriptor,
        new java.lang.String[] { "Elements", });
    internal_static_google_cloud_workflows_executions_v1_Execution_Error_descriptor =
      internal_static_google_cloud_workflows_executions_v1_Execution_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_workflows_executions_v1_Execution_Error_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_Error_descriptor,
        new java.lang.String[] { "Payload", "Context", "StackTrace", });
    internal_static_google_cloud_workflows_executions_v1_Execution_Status_descriptor =
      internal_static_google_cloud_workflows_executions_v1_Execution_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_workflows_executions_v1_Execution_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_Status_descriptor,
        new java.lang.String[] { "CurrentSteps", });
    internal_static_google_cloud_workflows_executions_v1_Execution_Status_Step_descriptor =
      internal_static_google_cloud_workflows_executions_v1_Execution_Status_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_workflows_executions_v1_Execution_Status_Step_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_Status_Step_descriptor,
        new java.lang.String[] { "Routine", "Step", });
    internal_static_google_cloud_workflows_executions_v1_Execution_StateError_descriptor =
      internal_static_google_cloud_workflows_executions_v1_Execution_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_workflows_executions_v1_Execution_StateError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_StateError_descriptor,
        new java.lang.String[] { "Details", "Type", });
    internal_static_google_cloud_workflows_executions_v1_Execution_LabelsEntry_descriptor =
      internal_static_google_cloud_workflows_executions_v1_Execution_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_workflows_executions_v1_Execution_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_Execution_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_workflows_executions_v1_ListExecutionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_workflows_executions_v1_ListExecutionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_ListExecutionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "View", "Filter", "OrderBy", });
    internal_static_google_cloud_workflows_executions_v1_ListExecutionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_workflows_executions_v1_ListExecutionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_ListExecutionsResponse_descriptor,
        new java.lang.String[] { "Executions", "NextPageToken", });
    internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_CreateExecutionRequest_descriptor,
        new java.lang.String[] { "Parent", "Execution", });
    internal_static_google_cloud_workflows_executions_v1_GetExecutionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_workflows_executions_v1_GetExecutionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_GetExecutionRequest_descriptor,
        new java.lang.String[] { "Name", "View", });
    internal_static_google_cloud_workflows_executions_v1_CancelExecutionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_workflows_executions_v1_CancelExecutionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_workflows_executions_v1_CancelExecutionRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
