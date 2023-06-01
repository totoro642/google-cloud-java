/*
 * Copyright 2020 Google LLC
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
// source: google/maps/routing/v2/routes_service.proto

package com.google.maps.routing.v2;

public interface ComputeRoutesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.ComputeRoutesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Origin waypoint.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint origin = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the origin field is set.
   */
  boolean hasOrigin();
  /**
   *
   *
   * <pre>
   * Required. Origin waypoint.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint origin = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The origin.
   */
  com.google.maps.routing.v2.Waypoint getOrigin();
  /**
   *
   *
   * <pre>
   * Required. Origin waypoint.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint origin = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.maps.routing.v2.WaypointOrBuilder getOriginOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Destination waypoint.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.Waypoint destination = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   *
   *
   * <pre>
   * Required. Destination waypoint.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.Waypoint destination = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The destination.
   */
  com.google.maps.routing.v2.Waypoint getDestination();
  /**
   *
   *
   * <pre>
   * Required. Destination waypoint.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.Waypoint destination = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.maps.routing.v2.WaypointOrBuilder getDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.Waypoint intermediates = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.maps.routing.v2.Waypoint> getIntermediatesList();
  /**
   *
   *
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.Waypoint intermediates = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.routing.v2.Waypoint getIntermediates(int index);
  /**
   *
   *
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.Waypoint intermediates = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getIntermediatesCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.Waypoint intermediates = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.maps.routing.v2.WaypointOrBuilder>
      getIntermediatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. A set of waypoints along the route (excluding terminal points),
   * for either stopping at or passing by. Up to 25 intermediate waypoints are
   * supported.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.Waypoint intermediates = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.routing.v2.WaypointOrBuilder getIntermediatesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Specifies the mode of transportation.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RouteTravelMode travel_mode = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for travelMode.
   */
  int getTravelModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the mode of transportation.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RouteTravelMode travel_mode = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The travelMode.
   */
  com.google.maps.routing.v2.RouteTravelMode getTravelMode();

  /**
   *
   *
   * <pre>
   * Optional. Specifies how to compute the route. The server
   * attempts to use the selected routing preference to compute the route. If
   *  the routing preference results in an error or an extra long latency, then
   * an error is returned. You can specify this option only when the
   * `travel_mode` is `DRIVE` or `TWO_WHEELER`, otherwise the request fails.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RoutingPreference routing_preference = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for routingPreference.
   */
  int getRoutingPreferenceValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies how to compute the route. The server
   * attempts to use the selected routing preference to compute the route. If
   *  the routing preference results in an error or an extra long latency, then
   * an error is returned. You can specify this option only when the
   * `travel_mode` is `DRIVE` or `TWO_WHEELER`, otherwise the request fails.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RoutingPreference routing_preference = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The routingPreference.
   */
  com.google.maps.routing.v2.RoutingPreference getRoutingPreference();

  /**
   *
   *
   * <pre>
   * Optional. Specifies your preference for the quality of the polyline.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.PolylineQuality polyline_quality = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for polylineQuality.
   */
  int getPolylineQualityValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies your preference for the quality of the polyline.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.PolylineQuality polyline_quality = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The polylineQuality.
   */
  com.google.maps.routing.v2.PolylineQuality getPolylineQuality();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the preferred encoding for the polyline.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.PolylineEncoding polyline_encoding = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for polylineEncoding.
   */
  int getPolylineEncodingValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the preferred encoding for the polyline.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.PolylineEncoding polyline_encoding = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The polylineEncoding.
   */
  com.google.maps.routing.v2.PolylineEncoding getPolylineEncoding();

  /**
   *
   *
   * <pre>
   * Optional. The departure time. If you don't set this value, then this value
   * defaults to the time that you made the request. If you set this value to a
   * time that has already occurred, then the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the departureTime field is set.
   */
  boolean hasDepartureTime();
  /**
   *
   *
   * <pre>
   * Optional. The departure time. If you don't set this value, then this value
   * defaults to the time that you made the request. If you set this value to a
   * time that has already occurred, then the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The departureTime.
   */
  com.google.protobuf.Timestamp getDepartureTime();
  /**
   *
   *
   * <pre>
   * Optional. The departure time. If you don't set this value, then this value
   * defaults to the time that you made the request. If you set this value to a
   * time that has already occurred, then the request fails.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp departure_time = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDepartureTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Specifies whether to calculate alternate routes in addition to
   * the route. No alternative routes are returned for requests that have
   * intermediate waypoints.
   * </pre>
   *
   * <code>bool compute_alternative_routes = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The computeAlternativeRoutes.
   */
  boolean getComputeAlternativeRoutes();

  /**
   *
   *
   * <pre>
   * Optional. A set of conditions to satisfy that affect the way routes are
   * calculated.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RouteModifiers route_modifiers = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the routeModifiers field is set.
   */
  boolean hasRouteModifiers();
  /**
   *
   *
   * <pre>
   * Optional. A set of conditions to satisfy that affect the way routes are
   * calculated.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RouteModifiers route_modifiers = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The routeModifiers.
   */
  com.google.maps.routing.v2.RouteModifiers getRouteModifiers();
  /**
   *
   *
   * <pre>
   * Optional. A set of conditions to satisfy that affect the way routes are
   * calculated.
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RouteModifiers route_modifiers = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.routing.v2.RouteModifiersOrBuilder getRouteModifiersOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. See
   * [Language Support](https://developers.google.com/maps/faq#languagesupport)
   * for the list of supported languages. When you don't provide this value, the
   * display language is inferred from the location of the route request.
   * </pre>
   *
   * <code>string language_code = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. See
   * [Language Support](https://developers.google.com/maps/faq#languagesupport)
   * for the list of supported languages. When you don't provide this value, the
   * display language is inferred from the location of the route request.
   * </pre>
   *
   * <code>string language_code = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The region code, specified as a ccTLD ("top-level domain")
   * two-character value. For more information see
   * https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains#Country_code_top-level_domains
   * </pre>
   *
   * <code>string region_code = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();
  /**
   *
   *
   * <pre>
   * Optional. The region code, specified as a ccTLD ("top-level domain")
   * two-character value. For more information see
   * https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains#Country_code_top-level_domains
   * </pre>
   *
   * <code>string region_code = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the units of measure for the display fields. This
   * includes the `instruction` field in
   * [NavigationInstruction][google.maps.routing.v2.NavigationInstruction]. The
   * units of measure used for the route, leg, step distance, and duration are
   * not affected by this value. If you don't provide this value, then the
   * display units are inferred from the location of the request.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Units units = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for units.
   */
  int getUnitsValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the units of measure for the display fields. This
   * includes the `instruction` field in
   * [NavigationInstruction][google.maps.routing.v2.NavigationInstruction]. The
   * units of measure used for the route, leg, step distance, and duration are
   * not affected by this value. If you don't provide this value, then the
   * display units are inferred from the location of the request.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Units units = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The units.
   */
  com.google.maps.routing.v2.Units getUnits();

  /**
   *
   *
   * <pre>
   * Optional. Specifies what reference routes to calculate as part of the
   * request in addition to the default route. A reference route is a route with
   * a different route calculation objective than the default route. For example
   * a `FUEL_EFFICIENT` reference route calculation takes into account various
   * parameters that would generate an optimal fuel efficient route.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ReferenceRoute requested_reference_routes = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the requestedReferenceRoutes.
   */
  java.util.List<com.google.maps.routing.v2.ComputeRoutesRequest.ReferenceRoute>
      getRequestedReferenceRoutesList();
  /**
   *
   *
   * <pre>
   * Optional. Specifies what reference routes to calculate as part of the
   * request in addition to the default route. A reference route is a route with
   * a different route calculation objective than the default route. For example
   * a `FUEL_EFFICIENT` reference route calculation takes into account various
   * parameters that would generate an optimal fuel efficient route.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ReferenceRoute requested_reference_routes = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of requestedReferenceRoutes.
   */
  int getRequestedReferenceRoutesCount();
  /**
   *
   *
   * <pre>
   * Optional. Specifies what reference routes to calculate as part of the
   * request in addition to the default route. A reference route is a route with
   * a different route calculation objective than the default route. For example
   * a `FUEL_EFFICIENT` reference route calculation takes into account various
   * parameters that would generate an optimal fuel efficient route.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ReferenceRoute requested_reference_routes = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The requestedReferenceRoutes at the given index.
   */
  com.google.maps.routing.v2.ComputeRoutesRequest.ReferenceRoute getRequestedReferenceRoutes(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. Specifies what reference routes to calculate as part of the
   * request in addition to the default route. A reference route is a route with
   * a different route calculation objective than the default route. For example
   * a `FUEL_EFFICIENT` reference route calculation takes into account various
   * parameters that would generate an optimal fuel efficient route.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ReferenceRoute requested_reference_routes = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for requestedReferenceRoutes.
   */
  java.util.List<java.lang.Integer> getRequestedReferenceRoutesValueList();
  /**
   *
   *
   * <pre>
   * Optional. Specifies what reference routes to calculate as part of the
   * request in addition to the default route. A reference route is a route with
   * a different route calculation objective than the default route. For example
   * a `FUEL_EFFICIENT` reference route calculation takes into account various
   * parameters that would generate an optimal fuel efficient route.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ReferenceRoute requested_reference_routes = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of requestedReferenceRoutes at the given index.
   */
  int getRequestedReferenceRoutesValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of extra computations which may be used to complete the
   * request. Note: These extra computations may return extra fields on the
   * response. These extra fields must also be specified in the field mask to be
   * returned in the response.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ExtraComputation extra_computations = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the extraComputations.
   */
  java.util.List<com.google.maps.routing.v2.ComputeRoutesRequest.ExtraComputation>
      getExtraComputationsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of extra computations which may be used to complete the
   * request. Note: These extra computations may return extra fields on the
   * response. These extra fields must also be specified in the field mask to be
   * returned in the response.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ExtraComputation extra_computations = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of extraComputations.
   */
  int getExtraComputationsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of extra computations which may be used to complete the
   * request. Note: These extra computations may return extra fields on the
   * response. These extra fields must also be specified in the field mask to be
   * returned in the response.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ExtraComputation extra_computations = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The extraComputations at the given index.
   */
  com.google.maps.routing.v2.ComputeRoutesRequest.ExtraComputation getExtraComputations(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of extra computations which may be used to complete the
   * request. Note: These extra computations may return extra fields on the
   * response. These extra fields must also be specified in the field mask to be
   * returned in the response.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ExtraComputation extra_computations = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for extraComputations.
   */
  java.util.List<java.lang.Integer> getExtraComputationsValueList();
  /**
   *
   *
   * <pre>
   * Optional. A list of extra computations which may be used to complete the
   * request. Note: These extra computations may return extra fields on the
   * response. These extra fields must also be specified in the field mask to be
   * returned in the response.
   * </pre>
   *
   * <code>
   * repeated .google.maps.routing.v2.ComputeRoutesRequest.ExtraComputation extra_computations = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of extraComputations at the given index.
   */
  int getExtraComputationsValue(int index);
}
