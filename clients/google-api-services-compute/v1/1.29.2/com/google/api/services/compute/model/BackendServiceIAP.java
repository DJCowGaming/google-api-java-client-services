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

package com.google.api.services.compute.model;

/**
 * Identity-Aware Proxy
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendServiceIAP extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oauth2ClientId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oauth2ClientSecret;

  /**
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String oauth2ClientSecretSha256;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * @param enabled enabled or {@code null} for none
   */
  public BackendServiceIAP setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOauth2ClientId() {
    return oauth2ClientId;
  }

  /**
   * @param oauth2ClientId oauth2ClientId or {@code null} for none
   */
  public BackendServiceIAP setOauth2ClientId(java.lang.String oauth2ClientId) {
    this.oauth2ClientId = oauth2ClientId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOauth2ClientSecret() {
    return oauth2ClientSecret;
  }

  /**
   * @param oauth2ClientSecret oauth2ClientSecret or {@code null} for none
   */
  public BackendServiceIAP setOauth2ClientSecret(java.lang.String oauth2ClientSecret) {
    this.oauth2ClientSecret = oauth2ClientSecret;
    return this;
  }

  /**
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * @return value or {@code null} for none
   */
  public java.lang.String getOauth2ClientSecretSha256() {
    return oauth2ClientSecretSha256;
  }

  /**
   * [Output Only] SHA256 hash value for the field oauth2_client_secret above.
   * @param oauth2ClientSecretSha256 oauth2ClientSecretSha256 or {@code null} for none
   */
  public BackendServiceIAP setOauth2ClientSecretSha256(java.lang.String oauth2ClientSecretSha256) {
    this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
    return this;
  }

  @Override
  public BackendServiceIAP set(String fieldName, Object value) {
    return (BackendServiceIAP) super.set(fieldName, value);
  }

  @Override
  public BackendServiceIAP clone() {
    return (BackendServiceIAP) super.clone();
  }

}
