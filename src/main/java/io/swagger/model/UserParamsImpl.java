package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * User details
 **/

@ApiModel(description = "User details")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-04T19:07:15.473+02:00")

public class UserParamsImpl   {
  
  private String email = null;
  private String phone = null;

  /**
   * User's email address
   **/
  public UserParamsImpl email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "User's email address")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * User's phone number
   **/
  public UserParamsImpl phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(value = "User's phone number")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserParamsImpl userParamsImpl = (UserParamsImpl) o;
    return Objects.equals(email, userParamsImpl.email) &&
        Objects.equals(phone, userParamsImpl.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserParamsImpl {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

