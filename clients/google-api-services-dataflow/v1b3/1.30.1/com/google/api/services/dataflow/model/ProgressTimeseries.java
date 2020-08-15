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

package com.google.api.services.dataflow.model;

/**
 * Information about the progress of some component of job execution.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProgressTimeseries extends com.google.api.client.json.GenericJson {

  /**
   * The current progress of the component, in the range [0,1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double currentProgress;

  /**
   * History of progress for the component. Points are sorted by time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Point> dataPoints;

  static {
    // hack to force ProGuard to consider Point used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Point.class);
  }

  /**
   * The current progress of the component, in the range [0,1].
   * @return value or {@code null} for none
   */
  public java.lang.Double getCurrentProgress() {
    return currentProgress;
  }

  /**
   * The current progress of the component, in the range [0,1].
   * @param currentProgress currentProgress or {@code null} for none
   */
  public ProgressTimeseries setCurrentProgress(java.lang.Double currentProgress) {
    this.currentProgress = currentProgress;
    return this;
  }

  /**
   * History of progress for the component. Points are sorted by time.
   * @return value or {@code null} for none
   */
  public java.util.List<Point> getDataPoints() {
    return dataPoints;
  }

  /**
   * History of progress for the component. Points are sorted by time.
   * @param dataPoints dataPoints or {@code null} for none
   */
  public ProgressTimeseries setDataPoints(java.util.List<Point> dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  @Override
  public ProgressTimeseries set(String fieldName, Object value) {
    return (ProgressTimeseries) super.set(fieldName, value);
  }

  @Override
  public ProgressTimeseries clone() {
    return (ProgressTimeseries) super.clone();
  }

}
