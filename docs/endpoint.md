# Client Library Endpoint
Client libraries will automatically resolve an endpoint for the client to use.
The default endpoint will attempt to connect to Google servers.

## Anatomy of an Endpoint
Using the default Java-Speech endpoint as an example: `https://speech.googleapis.com:443`:

| Scheme   	| Service Name 	| Universe Domain 	| Port 	|
|----------	|--------------	|-----------------	|------	|
| https:// 	| speech       	| googleapis.com  	| 443  	|

Default Values for client libraries:
- Scheme: https://
- [Universe Domain](universe_domain.md): googleapis.com
- Port: 443

## Configuring a Specific Endpoint
There are two ways to configure the endpoint in Java Client Libraries.

### Set through the generated {Service}Settings
The following example is using Java-KMS v2.42.0 as an example:

1. Set the endpoint in {Service}Settings.Builder and create the Settings object
```java
String endpoint = "mycoolendpoint.com";
KeyManagementServiceSettings keyManagementServiceSettings =
  KeyManagementServiceSettings.newBuilder()
    .setEndpoint(endpoint)
    .build();
```
2. Create the client with the Settings
```java
try (KeyManagementServiceClient keyManagementServiceClient =
  KeyManagementServiceClient.create(keyManagementServiceSettings)) {
```

This is the recommend way to set the endpoint.

### Set through the Instantiating{Transport}ChannelProvider
The following example is using Java-KMS v2.42.0 as an example:

1. Create the transport specific TransportChannelProvider
```java
String endpoint = "mycoolendpoint.com";
InstantiatingGrpcChannelProvider instantiatingGrpcChannelProvider =
    InstantiatingGrpcChannelProvider.newBuilder()
    .setEndpoint(endpoint)
    // ... Other required configurations
    .build();
```
2. Pass the TransportChannelProvider to the Settings
```java
KeyManagementServiceSettings keyManagementServiceSettings =
  KeyManagementServiceSettings.newBuilder()
    .setTransportChannelProvider(instantiatingGrpcChannelProvider)
    .build();
```
3. Create the client with the Settings
```java
try (KeyManagementServiceClient keyManagementServiceClient =
  KeyManagementServiceClient.create(keyManagementServiceSettings)) {
```

### Set through both ways
If you are setting an endpoint via both methods above, like:
```java
String endpoint1 = "transportEndpoint.com";
    InstantiatingGrpcChannelProvider instantiatingGrpcChannelProvider =
    InstantiatingGrpcChannelProvider.newBuilder()
    .setEndpoint(endpoint2)
    // ... Other required configurations
    .build();

String endpoint2 = "settingsEndpoint.com";
KeyManagementServiceSettings keyManagementServiceSettings =
  KeyManagementServiceSettings.newBuilder()
    .setEndpoint(endpoint1)
    .setTransportChannelProvider(instantiatingGrpcChannelProvider)
    .build();
```

The endpoint that the client library uses will be the from the TransportChannelProvider.
If set, the endpoint passed in the TransportChannelProvider is used.

### Endpoint Hierarchy
1. If set in the TransportChannelProvider, use this endpoint. Otherwise, go to the next step.
2. If set via the ClientSettings, use this endpoint. Otherwise, go to the next step.
3. Use the default endpoint (Default endpoint will hit Google servers)

### How can I confirm the endpoint the library is using
Assuming you have configured a custom endpoint, like: 
```java
String endpoint = "...";
KeyManagementServiceSettings keyManagementServiceSettings =
  KeyManagementServiceSettings.newBuilder()
    .setEndpoint(endpoint)
    .build();
```

You can retrieve the endpoint from the Setting's `getEndpoint()` method. This will return
the resolved endpoint back.

## When should I specify my custom endpoint
There are a few use cases:
1. Service offers [regional endpoints](https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library)
2. You do not want to use https (i.e. local testing)