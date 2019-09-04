package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BankingInternationalPayeeBankDetails;
import org.openapitools.model.BankingInternationalPayeeBeneficiaryDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingInternationalPayee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-04T03:14:24.819Z[GMT]")

public class BankingInternationalPayee   {
  @JsonProperty("beneficiaryDetails")
  private BankingInternationalPayeeBeneficiaryDetails beneficiaryDetails;

  @JsonProperty("bankDetails")
  private BankingInternationalPayeeBankDetails bankDetails;

  public BankingInternationalPayee beneficiaryDetails(BankingInternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
    return this;
  }

  /**
   * Get beneficiaryDetails
   * @return beneficiaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public BankingInternationalPayeeBeneficiaryDetails getBeneficiaryDetails() {
    return beneficiaryDetails;
  }

  public void setBeneficiaryDetails(BankingInternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
  }

  public BankingInternationalPayee bankDetails(BankingInternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
    return this;
  }

  /**
   * Get bankDetails
   * @return bankDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public BankingInternationalPayeeBankDetails getBankDetails() {
    return bankDetails;
  }

  public void setBankDetails(BankingInternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingInternationalPayee bankingInternationalPayee = (BankingInternationalPayee) o;
    return Objects.equals(this.beneficiaryDetails, bankingInternationalPayee.beneficiaryDetails) &&
        Objects.equals(this.bankDetails, bankingInternationalPayee.bankDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryDetails, bankDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingInternationalPayee {\n");
    
    sb.append("    beneficiaryDetails: ").append(toIndentedString(beneficiaryDetails)).append("\n");
    sb.append("    bankDetails: ").append(toIndentedString(bankDetails)).append("\n");
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

