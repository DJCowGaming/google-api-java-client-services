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
 * Common configurations for an ExecStep.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecStepConfig extends com.google.api.client.json.GenericJson {

  /**
   * Defaults to [0]. A list of possible return values that the execution can return to indicate a
   * success.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> allowedSuccessCodes;

  /**
   * A Google Cloud Storage object containing the executable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GcsObject gcsObject;

  /**
   * The script interpreter to use to run the script. If no interpreter is specified the script will
   * be executed directly, which will likely only succeed for scripts with [shebang lines]
   * (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interpreter;

  /**
   * An absolute path to the executable on the VM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String localPath;

  /**
   * Defaults to [0]. A list of possible return values that the execution can return to indicate a
   * success.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getAllowedSuccessCodes() {
    return allowedSuccessCodes;
  }

  /**
   * Defaults to [0]. A list of possible return values that the execution can return to indicate a
   * success.
   * @param allowedSuccessCodes allowedSuccessCodes or {@code null} for none
   */
  public ExecStepConfig setAllowedSuccessCodes(java.util.List<java.lang.Integer> allowedSuccessCodes) {
    this.allowedSuccessCodes = allowedSuccessCodes;
    return this;
  }

  /**
   * A Google Cloud Storage object containing the executable.
   * @return value or {@code null} for none
   */
  public GcsObject getGcsObject() {
    return gcsObject;
  }

  /**
   * A Google Cloud Storage object containing the executable.
   * @param gcsObject gcsObject or {@code null} for none
   */
  public ExecStepConfig setGcsObject(GcsObject gcsObject) {
    this.gcsObject = gcsObject;
    return this;
  }

  /**
   * The script interpreter to use to run the script. If no interpreter is specified the script will
   * be executed directly, which will likely only succeed for scripts with [shebang lines]
   * (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
   * @return value or {@code null} for none
   */
  public java.lang.String getInterpreter() {
    return interpreter;
  }

  /**
   * The script interpreter to use to run the script. If no interpreter is specified the script will
   * be executed directly, which will likely only succeed for scripts with [shebang lines]
   * (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
   * @param interpreter interpreter or {@code null} for none
   */
  public ExecStepConfig setInterpreter(java.lang.String interpreter) {
    this.interpreter = interpreter;
    return this;
  }

  /**
   * An absolute path to the executable on the VM.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocalPath() {
    return localPath;
  }

  /**
   * An absolute path to the executable on the VM.
   * @param localPath localPath or {@code null} for none
   */
  public ExecStepConfig setLocalPath(java.lang.String localPath) {
    this.localPath = localPath;
    return this;
  }

  @Override
  public ExecStepConfig set(String fieldName, Object value) {
    return (ExecStepConfig) super.set(fieldName, value);
  }

  @Override
  public ExecStepConfig clone() {
    return (ExecStepConfig) super.clone();
  }

}
