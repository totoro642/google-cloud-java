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

package com.google.cloud.security.privateca.v1.samples;

// [START privateca_v1_generated_certificateauthorityserviceclient_createcertificatetemplate_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.security.privateca.v1.CertificateAuthorityServiceClient;
import com.google.cloud.security.privateca.v1.CertificateTemplate;
import com.google.cloud.security.privateca.v1.CreateCertificateTemplateRequest;
import com.google.cloud.security.privateca.v1.LocationName;
import com.google.cloud.security.privateca.v1.OperationMetadata;

public class AsyncCreateCertificateTemplateLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateCertificateTemplateLRO();
  }

  public static void asyncCreateCertificateTemplateLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CertificateAuthorityServiceClient certificateAuthorityServiceClient =
        CertificateAuthorityServiceClient.create()) {
      CreateCertificateTemplateRequest request =
          CreateCertificateTemplateRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setCertificateTemplateId("certificateTemplateId1920134188")
              .setCertificateTemplate(CertificateTemplate.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<CertificateTemplate, OperationMetadata> future =
          certificateAuthorityServiceClient
              .createCertificateTemplateOperationCallable()
              .futureCall(request);
      // Do something.
      CertificateTemplate response = future.get();
    }
  }
}
// [END privateca_v1_generated_certificateauthorityserviceclient_createcertificatetemplate_lro_async]
