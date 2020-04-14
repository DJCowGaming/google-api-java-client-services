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
 * Student work for an assignment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssignmentSubmission extends com.google.api.client.json.GenericJson {

  /**
   * Attachments added by the student. Drive files that correspond to materials with a share mode of
   * STUDENT_COPY may not exist yet if the student has not accessed the assignment in Classroom.
   *
   * Some attachment metadata is only populated if the requesting user has permission to access it.
   * Identifier and alternate_link fields are always available, but others (for example, title) may
   * not be.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Attachment> attachments;

  /**
   * Attachments added by the student. Drive files that correspond to materials with a share mode of
   * STUDENT_COPY may not exist yet if the student has not accessed the assignment in Classroom.
   *
   * Some attachment metadata is only populated if the requesting user has permission to access it.
   * Identifier and alternate_link fields are always available, but others (for example, title) may
   * not be.
   * @return value or {@code null} for none
   */
  public java.util.List<Attachment> getAttachments() {
    return attachments;
  }

  /**
   * Attachments added by the student. Drive files that correspond to materials with a share mode of
   * STUDENT_COPY may not exist yet if the student has not accessed the assignment in Classroom.
   *
   * Some attachment metadata is only populated if the requesting user has permission to access it.
   * Identifier and alternate_link fields are always available, but others (for example, title) may
   * not be.
   * @param attachments attachments or {@code null} for none
   */
  public AssignmentSubmission setAttachments(java.util.List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  @Override
  public AssignmentSubmission set(String fieldName, Object value) {
    return (AssignmentSubmission) super.set(fieldName, value);
  }

  @Override
  public AssignmentSubmission clone() {
    return (AssignmentSubmission) super.clone();
  }

}
