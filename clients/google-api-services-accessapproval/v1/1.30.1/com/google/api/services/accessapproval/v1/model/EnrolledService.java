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

package com.google.api.services.accessapproval.v1.model;

/**
 * Represents the enrollment of a cloud resource into a specific service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Approval API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnrolledService extends com.google.api.client.json.GenericJson {

  /**
   * The product for which Access Approval will be enrolled. Allowed values are listed below (case-
   * sensitive): 1. all 2. appengine.googleapis.com 3. bigquery.googleapis.com 4.
   * bigtable.googleapis.com 5. cloudkms.googleapis.com 6. compute.googleapis.com 7.
   * dataflow.googleapis.com 8. iam.googleapis.com 9. pubsub.googleapis.com 10.
   * storage.googleapis.com
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudProduct;

  /**
   * The enrollment level of the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enrollmentLevel;

  /**
   * The product for which Access Approval will be enrolled. Allowed values are listed below (case-
   * sensitive): 1. all 2. appengine.googleapis.com 3. bigquery.googleapis.com 4.
   * bigtable.googleapis.com 5. cloudkms.googleapis.com 6. compute.googleapis.com 7.
   * dataflow.googleapis.com 8. iam.googleapis.com 9. pubsub.googleapis.com 10.
   * storage.googleapis.com
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudProduct() {
    return cloudProduct;
  }

  /**
   * The product for which Access Approval will be enrolled. Allowed values are listed below (case-
   * sensitive): 1. all 2. appengine.googleapis.com 3. bigquery.googleapis.com 4.
   * bigtable.googleapis.com 5. cloudkms.googleapis.com 6. compute.googleapis.com 7.
   * dataflow.googleapis.com 8. iam.googleapis.com 9. pubsub.googleapis.com 10.
   * storage.googleapis.com
   * @param cloudProduct cloudProduct or {@code null} for none
   */
  public EnrolledService setCloudProduct(java.lang.String cloudProduct) {
    this.cloudProduct = cloudProduct;
    return this;
  }

  /**
   * The enrollment level of the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnrollmentLevel() {
    return enrollmentLevel;
  }

  /**
   * The enrollment level of the service.
   * @param enrollmentLevel enrollmentLevel or {@code null} for none
   */
  public EnrolledService setEnrollmentLevel(java.lang.String enrollmentLevel) {
    this.enrollmentLevel = enrollmentLevel;
    return this;
  }

  @Override
  public EnrolledService set(String fieldName, Object value) {
    return (EnrolledService) super.set(fieldName, value);
  }

  @Override
  public EnrolledService clone() {
    return (EnrolledService) super.clone();
  }

}
