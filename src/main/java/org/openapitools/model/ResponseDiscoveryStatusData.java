package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseDiscoveryStatusData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-04T03:14:24.819Z[GMT]")

public class ResponseDiscoveryStatusData   {
  /**
   * Enumeration with values. OK (implementation is fully functional). PARTIAL_FAILURE (one or more end points are unexpectedly unavailable). UNAVAILABLE (the full implementation is unexpectedly unavailable). SCHEDULED_OUTAGE (an advertised outage is in effect)
   */
  public enum StatusEnum {
    OK("OK"),
    
    PARTIAL_FAILURE("PARTIAL_FAILURE"),
    
    UNAVAILABLE("UNAVAILABLE"),
    
    SCHEDULED_OUTAGE("SCHEDULED_OUTAGE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("explanation")
  private String explanation;

  @JsonProperty("detectionTime")
  private String detectionTime;

  @JsonProperty("expectedResolutionTime")
  private String expectedResolutionTime;

  @JsonProperty("updateTime")
  private String updateTime;

  public ResponseDiscoveryStatusData status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Enumeration with values. OK (implementation is fully functional). PARTIAL_FAILURE (one or more end points are unexpectedly unavailable). UNAVAILABLE (the full implementation is unexpectedly unavailable). SCHEDULED_OUTAGE (an advertised outage is in effect)
   * @return status
  */
  @ApiModelProperty(required = true, value = "Enumeration with values. OK (implementation is fully functional). PARTIAL_FAILURE (one or more end points are unexpectedly unavailable). UNAVAILABLE (the full implementation is unexpectedly unavailable). SCHEDULED_OUTAGE (an advertised outage is in effect)")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ResponseDiscoveryStatusData explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Provides an explanation of the current outage that can be displayed to an end customer. Mandatory if the status property is any value other than OK
   * @return explanation
  */
  @ApiModelProperty(value = "Provides an explanation of the current outage that can be displayed to an end customer. Mandatory if the status property is any value other than OK")


  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public ResponseDiscoveryStatusData detectionTime(String detectionTime) {
    this.detectionTime = detectionTime;
    return this;
  }

  /**
   * The date and time that the current outage was detected. Should only be present if the status property is PARTIAL_FAILURE or UNAVAILABLE
   * @return detectionTime
  */
  @ApiModelProperty(value = "The date and time that the current outage was detected. Should only be present if the status property is PARTIAL_FAILURE or UNAVAILABLE")


  public String getDetectionTime() {
    return detectionTime;
  }

  public void setDetectionTime(String detectionTime) {
    this.detectionTime = detectionTime;
  }

  public ResponseDiscoveryStatusData expectedResolutionTime(String expectedResolutionTime) {
    this.expectedResolutionTime = expectedResolutionTime;
    return this;
  }

  /**
   * The date and time that full service is expected to resume (if known). Should not be present if the status property has a value of OK.
   * @return expectedResolutionTime
  */
  @ApiModelProperty(value = "The date and time that full service is expected to resume (if known). Should not be present if the status property has a value of OK.")


  public String getExpectedResolutionTime() {
    return expectedResolutionTime;
  }

  public void setExpectedResolutionTime(String expectedResolutionTime) {
    this.expectedResolutionTime = expectedResolutionTime;
  }

  public ResponseDiscoveryStatusData updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The date and time that this status was last updated by the Data Holder.
   * @return updateTime
  */
  @ApiModelProperty(required = true, value = "The date and time that this status was last updated by the Data Holder.")
  @NotNull


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDiscoveryStatusData responseDiscoveryStatusData = (ResponseDiscoveryStatusData) o;
    return Objects.equals(this.status, responseDiscoveryStatusData.status) &&
        Objects.equals(this.explanation, responseDiscoveryStatusData.explanation) &&
        Objects.equals(this.detectionTime, responseDiscoveryStatusData.detectionTime) &&
        Objects.equals(this.expectedResolutionTime, responseDiscoveryStatusData.expectedResolutionTime) &&
        Objects.equals(this.updateTime, responseDiscoveryStatusData.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, explanation, detectionTime, expectedResolutionTime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDiscoveryStatusData {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    detectionTime: ").append(toIndentedString(detectionTime)).append("\n");
    sb.append("    expectedResolutionTime: ").append(toIndentedString(expectedResolutionTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

