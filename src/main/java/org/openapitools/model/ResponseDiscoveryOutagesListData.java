package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DiscoveryOutage;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseDiscoveryOutagesListData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-09-04T03:14:24.819Z[GMT]")

public class ResponseDiscoveryOutagesListData   {
  @JsonProperty("outages")
  @Valid
  private List<DiscoveryOutage> outages = new ArrayList<>();

  public ResponseDiscoveryOutagesListData outages(List<DiscoveryOutage> outages) {
    this.outages = outages;
    return this;
  }

  public ResponseDiscoveryOutagesListData addOutagesItem(DiscoveryOutage outagesItem) {
    this.outages.add(outagesItem);
    return this;
  }

  /**
   * List of scheduled outages. Property is mandatory but may contain and empty list if no outages are scheduled
   * @return outages
  */
  @ApiModelProperty(required = true, value = "List of scheduled outages. Property is mandatory but may contain and empty list if no outages are scheduled")
  @NotNull

  @Valid

  public List<DiscoveryOutage> getOutages() {
    return outages;
  }

  public void setOutages(List<DiscoveryOutage> outages) {
    this.outages = outages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDiscoveryOutagesListData responseDiscoveryOutagesListData = (ResponseDiscoveryOutagesListData) o;
    return Objects.equals(this.outages, responseDiscoveryOutagesListData.outages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDiscoveryOutagesListData {\n");
    
    sb.append("    outages: ").append(toIndentedString(outages)).append("\n");
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

