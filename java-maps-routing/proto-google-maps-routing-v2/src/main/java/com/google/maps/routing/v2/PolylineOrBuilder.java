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
// source: google/maps/routing/v2/polyline.proto

package com.google.maps.routing.v2;

public interface PolylineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.Polyline)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The string encoding of the polyline using the [polyline encoding
   * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
   * </pre>
   *
   * <code>string encoded_polyline = 1;</code>
   *
   * @return Whether the encodedPolyline field is set.
   */
  boolean hasEncodedPolyline();
  /**
   *
   *
   * <pre>
   * The string encoding of the polyline using the [polyline encoding
   * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
   * </pre>
   *
   * <code>string encoded_polyline = 1;</code>
   *
   * @return The encodedPolyline.
   */
  java.lang.String getEncodedPolyline();
  /**
   *
   *
   * <pre>
   * The string encoding of the polyline using the [polyline encoding
   * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm)
   * </pre>
   *
   * <code>string encoded_polyline = 1;</code>
   *
   * @return The bytes for encodedPolyline.
   */
  com.google.protobuf.ByteString getEncodedPolylineBytes();

  /**
   *
   *
   * <pre>
   * Specifies a polyline using the [GeoJSON LineString
   * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
   * </pre>
   *
   * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
   *
   * @return Whether the geoJsonLinestring field is set.
   */
  boolean hasGeoJsonLinestring();
  /**
   *
   *
   * <pre>
   * Specifies a polyline using the [GeoJSON LineString
   * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
   * </pre>
   *
   * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
   *
   * @return The geoJsonLinestring.
   */
  com.google.protobuf.Struct getGeoJsonLinestring();
  /**
   *
   *
   * <pre>
   * Specifies a polyline using the [GeoJSON LineString
   * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
   * </pre>
   *
   * <code>.google.protobuf.Struct geo_json_linestring = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getGeoJsonLinestringOrBuilder();

  com.google.maps.routing.v2.Polyline.PolylineTypeCase getPolylineTypeCase();
}
