package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indicates that the schedule of payments is defined according to the last occurrence of a specific weekday in an interval. Mandatory if recurrenceUType is set to lastWeekDay
 */
@ApiModel(description = "Indicates that the schedule of payments is defined according to the last occurrence of a specific weekday in an interval. Mandatory if recurrenceUType is set to lastWeekDay")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-04T03:14:24.819Z[GMT]")

public class BankingScheduledPaymentRecurrenceLastWeekday   {
  @JsonProperty("finalPaymentDate")
  private String finalPaymentDate;

  @JsonProperty("paymentsRemaining")
  private Integer paymentsRemaining;

  @JsonProperty("interval")
  private String interval;

  @JsonProperty("lastWeekDay")
  private Integer lastWeekDay;

  public BankingScheduledPaymentRecurrenceLastWeekday finalPaymentDate(String finalPaymentDate) {
    this.finalPaymentDate = finalPaymentDate;
    return this;
  }

  /**
   * The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
   * @return finalPaymentDate
  */
  @ApiModelProperty(value = "The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely")


  public String getFinalPaymentDate() {
    return finalPaymentDate;
  }

  public void setFinalPaymentDate(String finalPaymentDate) {
    this.finalPaymentDate = finalPaymentDate;
  }

  public BankingScheduledPaymentRecurrenceLastWeekday paymentsRemaining(Integer paymentsRemaining) {
    this.paymentsRemaining = paymentsRemaining;
    return this;
  }

  /**
   * Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
   * @return paymentsRemaining
  */
  @ApiModelProperty(value = "Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely")


  public Integer getPaymentsRemaining() {
    return paymentsRemaining;
  }

  public void setPaymentsRemaining(Integer paymentsRemaining) {
    this.paymentsRemaining = paymentsRemaining;
  }

  public BankingScheduledPaymentRecurrenceLastWeekday interval(String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The interval for the payment. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) with components less than a day in length ignored. This duration defines the period between payments starting with nextPaymentDate
   * @return interval
  */
  @ApiModelProperty(required = true, value = "The interval for the payment. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) with components less than a day in length ignored. This duration defines the period between payments starting with nextPaymentDate")
  @NotNull


  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public BankingScheduledPaymentRecurrenceLastWeekday lastWeekDay(Integer lastWeekDay) {
    this.lastWeekDay = lastWeekDay;
    return this;
  }

  /**
   * The weekDay specified. The payment will occur on the last occurrence of this weekday in the interval. Value is constrained to 1 to 7 with 1 indicating Sunday.
   * @return lastWeekDay
  */
  @ApiModelProperty(required = true, value = "The weekDay specified. The payment will occur on the last occurrence of this weekday in the interval. Value is constrained to 1 to 7 with 1 indicating Sunday.")
  @NotNull


  public Integer getLastWeekDay() {
    return lastWeekDay;
  }

  public void setLastWeekDay(Integer lastWeekDay) {
    this.lastWeekDay = lastWeekDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingScheduledPaymentRecurrenceLastWeekday bankingScheduledPaymentRecurrenceLastWeekday = (BankingScheduledPaymentRecurrenceLastWeekday) o;
    return Objects.equals(this.finalPaymentDate, bankingScheduledPaymentRecurrenceLastWeekday.finalPaymentDate) &&
        Objects.equals(this.paymentsRemaining, bankingScheduledPaymentRecurrenceLastWeekday.paymentsRemaining) &&
        Objects.equals(this.interval, bankingScheduledPaymentRecurrenceLastWeekday.interval) &&
        Objects.equals(this.lastWeekDay, bankingScheduledPaymentRecurrenceLastWeekday.lastWeekDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalPaymentDate, paymentsRemaining, interval, lastWeekDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingScheduledPaymentRecurrenceLastWeekday {\n");
    
    sb.append("    finalPaymentDate: ").append(toIndentedString(finalPaymentDate)).append("\n");
    sb.append("    paymentsRemaining: ").append(toIndentedString(paymentsRemaining)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    lastWeekDay: ").append(toIndentedString(lastWeekDay)).append("\n");
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

