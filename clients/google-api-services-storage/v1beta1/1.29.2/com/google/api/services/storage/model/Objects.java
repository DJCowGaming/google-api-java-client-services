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

package com.google.api.services.storage.model;

/**
 * A list of objects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage JSON API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Objects extends com.google.api.client.json.GenericJson {

  /**
   * The list of items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StorageObject> items;

  static {
    // hack to force ProGuard to consider StorageObject used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(StorageObject.class);
  }

  /**
   * The kind of item this is. For lists of objects, this is always storage#objects.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of prefixes of objects matching-but-not-listed up to and including the requested
   * delimiter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> prefixes;

  /**
   * The list of items.
   * @return value or {@code null} for none
   */
  public java.util.List<StorageObject> getItems() {
    return items;
  }

  /**
   * The list of items.
   * @param items items or {@code null} for none
   */
  public Objects setItems(java.util.List<StorageObject> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind of item this is. For lists of objects, this is always storage#objects.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of item this is. For lists of objects, this is always storage#objects.
   * @param kind kind or {@code null} for none
   */
  public Objects setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public Objects setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of prefixes of objects matching-but-not-listed up to and including the requested
   * delimiter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrefixes() {
    return prefixes;
  }

  /**
   * The list of prefixes of objects matching-but-not-listed up to and including the requested
   * delimiter.
   * @param prefixes prefixes or {@code null} for none
   */
  public Objects setPrefixes(java.util.List<java.lang.String> prefixes) {
    this.prefixes = prefixes;
    return this;
  }

  @Override
  public Objects set(String fieldName, Object value) {
    return (Objects) super.set(fieldName, value);
  }

  @Override
  public Objects clone() {
    return (Objects) super.clone();
  }

}
