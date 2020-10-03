/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.osconfig.v1beta.model;

/**
 * Represents a time zone from the [IANA Time Zone Database](https://www.iana.org/time-zones).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeZone extends com.google.api.client.json.GenericJson {

  /**
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * @param id id or {@code null} for none
   */
  public TimeZone setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * @param version version or {@code null} for none
   */
  public TimeZone setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public TimeZone set(String fieldName, Object value) {
    return (TimeZone) super.set(fieldName, value);
  }

  @Override
  public TimeZone clone() {
    return (TimeZone) super.clone();
  }

}
