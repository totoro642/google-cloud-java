# Universe Domain
See [Anatomy of an Endpoint](endpoint.md#anatomy-of-an-endpoint) for more information
about how the Universe Domain is used as part of an endpoint.

## Configuring a Specific Universe Domain
Configuring the Universe Domain is done via the generated {Service}Settings. The following example
is using Java-KMS v2.42.0 as an example:

1. Set the endpoint in {Service}Settings.Builder and create the Settings object
```java
String universeDomain = "myuniversedomain.com";
KeyManagementServiceSettings keyManagementServiceSettings =
  KeyManagementServiceSettings.newBuilder()
    .setUniverseDomain(universeDomain).build();
```
2. Create the client with the Settings
```java
try (KeyManagementServiceClient keyManagementServiceClient =
  KeyManagementServiceClient.create(keyManagementServiceSettings)) {
```

With this configuration, the client library will resolve the endpoint to be:
`https://cloudkms.myuniversedomain.com:443`.

### How can I confirm the universe domain the library is using?
Assuming you have configured a custom endpoint, like:
```java
String universeDomain = "...";
KeyManagementServiceSettings keyManagementServiceSettings =
  KeyManagementServiceSettings.newBuilder()
    .setUniverseDomain(universeDomain)
    .build();
```

You can retrieve the endpoint from the Setting's `getUniverseDomain()` method. This will return
the resolved Universe Domain back.