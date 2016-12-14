/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * NumberOnly
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-14T17:41:48.242+08:00")
public class NumberOnly {
  @JsonProperty("JustNumber")
  private BigDecimal justNumber = null;

  public NumberOnly justNumber(BigDecimal justNumber) {
    this.justNumber = justNumber;
    return this;
  }

   /**
   * Get justNumber
   * @return justNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getJustNumber() {
    return justNumber;
  }

  public void setJustNumber(BigDecimal justNumber) {
    this.justNumber = justNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOnly numberOnly = (NumberOnly) o;
    return Objects.equals(this.justNumber, numberOnly.justNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOnly {\n");
    
    sb.append("    justNumber: ").append(toIndentedString(justNumber)).append("\n");
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

