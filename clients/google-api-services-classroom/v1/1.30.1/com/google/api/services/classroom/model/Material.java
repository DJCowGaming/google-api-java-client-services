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

package com.google.api.services.classroom.model;

/**
 * Material attached to course work.
 *
 * When creating attachments, setting the `form` field is not supported.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Material extends com.google.api.client.json.GenericJson {

  /**
   * Google Drive file material.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SharedDriveFile driveFile;

  /**
   * Google Forms material.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Form form;

  /**
   * Link material. On creation, this is upgraded to a more appropriate type if possible, and this
   * is reflected in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Link link;

  /**
   * YouTube video material.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private YouTubeVideo youtubeVideo;

  /**
   * Google Drive file material.
   * @return value or {@code null} for none
   */
  public SharedDriveFile getDriveFile() {
    return driveFile;
  }

  /**
   * Google Drive file material.
   * @param driveFile driveFile or {@code null} for none
   */
  public Material setDriveFile(SharedDriveFile driveFile) {
    this.driveFile = driveFile;
    return this;
  }

  /**
   * Google Forms material.
   * @return value or {@code null} for none
   */
  public Form getForm() {
    return form;
  }

  /**
   * Google Forms material.
   * @param form form or {@code null} for none
   */
  public Material setForm(Form form) {
    this.form = form;
    return this;
  }

  /**
   * Link material. On creation, this is upgraded to a more appropriate type if possible, and this
   * is reflected in the response.
   * @return value or {@code null} for none
   */
  public Link getLink() {
    return link;
  }

  /**
   * Link material. On creation, this is upgraded to a more appropriate type if possible, and this
   * is reflected in the response.
   * @param link link or {@code null} for none
   */
  public Material setLink(Link link) {
    this.link = link;
    return this;
  }

  /**
   * YouTube video material.
   * @return value or {@code null} for none
   */
  public YouTubeVideo getYoutubeVideo() {
    return youtubeVideo;
  }

  /**
   * YouTube video material.
   * @param youtubeVideo youtubeVideo or {@code null} for none
   */
  public Material setYoutubeVideo(YouTubeVideo youtubeVideo) {
    this.youtubeVideo = youtubeVideo;
    return this;
  }

  @Override
  public Material set(String fieldName, Object value) {
    return (Material) super.set(fieldName, value);
  }

  @Override
  public Material clone() {
    return (Material) super.clone();
  }

}
