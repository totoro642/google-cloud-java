/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.batch.v1.samples;

// [START batch_v1_generated_BatchService_CreateJob_LocationnameJobString_sync]
import com.google.cloud.batch.v1.BatchServiceClient;
import com.google.cloud.batch.v1.Job;
import com.google.cloud.batch.v1.LocationName;

public class SyncCreateJobLocationnameJobString {

  public static void main(String[] args) throws Exception {
    syncCreateJobLocationnameJobString();
  }

  public static void syncCreateJobLocationnameJobString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Job job = Job.newBuilder().build();
      String jobId = "jobId101296568";
      Job response = batchServiceClient.createJob(parent, job, jobId);
    }
  }
}
// [END batch_v1_generated_BatchService_CreateJob_LocationnameJobString_sync]
