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
 * Information about a particular execution stage of a job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StageSummary extends com.google.api.client.json.GenericJson {

  /**
   * End time of this stage. If the work item is completed, this is the actual end time of the
   * stage. Otherwise, it is the predicted end time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Metrics for this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricUpdate> metrics;

  static {
    // hack to force ProGuard to consider MetricUpdate used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricUpdate.class);
  }

  /**
   * Progress for this stage. Only applicable to Batch jobs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ProgressTimeseries progress;

  /**
   * ID of this stage
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stageId;

  /**
   * Start time of this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * State of this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * End time of this stage. If the work item is completed, this is the actual end time of the
   * stage. Otherwise, it is the predicted end time.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * End time of this stage. If the work item is completed, this is the actual end time of the
   * stage. Otherwise, it is the predicted end time.
   * @param endTime endTime or {@code null} for none
   */
  public StageSummary setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Metrics for this stage.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricUpdate> getMetrics() {
    return metrics;
  }

  /**
   * Metrics for this stage.
   * @param metrics metrics or {@code null} for none
   */
  public StageSummary setMetrics(java.util.List<MetricUpdate> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Progress for this stage. Only applicable to Batch jobs.
   * @return value or {@code null} for none
   */
  public ProgressTimeseries getProgress() {
    return progress;
  }

  /**
   * Progress for this stage. Only applicable to Batch jobs.
   * @param progress progress or {@code null} for none
   */
  public StageSummary setProgress(ProgressTimeseries progress) {
    this.progress = progress;
    return this;
  }

  /**
   * ID of this stage
   * @return value or {@code null} for none
   */
  public java.lang.String getStageId() {
    return stageId;
  }

  /**
   * ID of this stage
   * @param stageId stageId or {@code null} for none
   */
  public StageSummary setStageId(java.lang.String stageId) {
    this.stageId = stageId;
    return this;
  }

  /**
   * Start time of this stage.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Start time of this stage.
   * @param startTime startTime or {@code null} for none
   */
  public StageSummary setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * State of this stage.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of this stage.
   * @param state state or {@code null} for none
   */
  public StageSummary setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public StageSummary set(String fieldName, Object value) {
    return (StageSummary) super.set(fieldName, value);
  }

  @Override
  public StageSummary clone() {
    return (StageSummary) super.clone();
  }

}
