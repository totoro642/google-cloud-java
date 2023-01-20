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

package com.google.cloud.monitoring.v3.samples;

// [START monitoring_v3_generated_AlertPolicyService_GetAlertPolicy_sync]
import com.google.cloud.monitoring.v3.AlertPolicyServiceClient;
import com.google.monitoring.v3.AlertPolicy;
import com.google.monitoring.v3.AlertPolicyName;
import com.google.monitoring.v3.GetAlertPolicyRequest;

public class SyncGetAlertPolicy {

  public static void main(String[] args) throws Exception {
    syncGetAlertPolicy();
  }

  public static void syncGetAlertPolicy() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AlertPolicyServiceClient alertPolicyServiceClient = AlertPolicyServiceClient.create()) {
      GetAlertPolicyRequest request =
          GetAlertPolicyRequest.newBuilder()
              .setName(
                  AlertPolicyName.ofProjectAlertPolicyName("[PROJECT]", "[ALERT_POLICY]")
                      .toString())
              .build();
      AlertPolicy response = alertPolicyServiceClient.getAlertPolicy(request);
    }
  }
}
// [END monitoring_v3_generated_AlertPolicyService_GetAlertPolicy_sync]
