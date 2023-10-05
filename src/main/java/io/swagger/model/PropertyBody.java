package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PropertyBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-10-01T20:14:45.365242941Z[GMT]")


public class PropertyBody   {
  @JsonProperty("address")
  private String street = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  @JsonProperty("rentalPeriod")
  private Integer rentalPeriod = null;

  public PropertyBody street(String street, BigDecimal price, Integer rentalPeriod) {
    this.street = street;
    this.price = price;
    this.rentalPeriod = rentalPeriod;
    return this;
  }


  @Schema(description = "")
  
    public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  @Schema(description = "")
  
    @Valid
    public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Schema(description = "")
  
    public Integer getRentalPeriod() {
    return rentalPeriod;
  }

  public void setRentalPeriod(Integer rentalPeriod) {
    this.rentalPeriod = rentalPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyBody propertyBody = (PropertyBody) o;
    return Objects.equals(this.street, propertyBody.street) &&
        Objects.equals(this.price, propertyBody.price) &&
        Objects.equals(this.rentalPeriod, propertyBody.rentalPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, price, rentalPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyBody {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    rentalPeriod: ").append(toIndentedString(rentalPeriod)).append("\n");
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
