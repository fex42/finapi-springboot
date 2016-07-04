package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Update all transactions parameters
 **/

@ApiModel(description = "Update all transactions parameters")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-04T19:07:15.473+02:00")

public class UpdateAllTransactionsParams   {
  
  private Boolean isNew = false;
  private Boolean isPotentialDuplicate = false;

  /**
   * Whether this transactions should be flagged as 'new' or not. Any newly imported transaction will have this flag initially set to true. How you use this field is up to your interpretation. For example, you might want to set it to false once a user has clicked on/seen the transaction.
   **/
  public UpdateAllTransactionsParams isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this transactions should be flagged as 'new' or not. Any newly imported transaction will have this flag initially set to true. How you use this field is up to your interpretation. For example, you might want to set it to false once a user has clicked on/seen the transaction.")
  @JsonProperty("isNew")
  public Boolean getIsNew() {
    return isNew;
  }
  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }

  /**
   * You can set this field only to 'false'. finAPI marks transactions as a potential duplicates  when its internal duplicate detection algorithm is signaling so. Transactions that are flagged as duplicates can be deleted by the user. To prevent the user from deleting original transactions, which might lead to incorrect balances, it is not possible to manually set this flag to 'true'.
   **/
  public UpdateAllTransactionsParams isPotentialDuplicate(Boolean isPotentialDuplicate) {
    this.isPotentialDuplicate = isPotentialDuplicate;
    return this;
  }

  
  @ApiModelProperty(value = "You can set this field only to 'false'. finAPI marks transactions as a potential duplicates  when its internal duplicate detection algorithm is signaling so. Transactions that are flagged as duplicates can be deleted by the user. To prevent the user from deleting original transactions, which might lead to incorrect balances, it is not possible to manually set this flag to 'true'.")
  @JsonProperty("isPotentialDuplicate")
  public Boolean getIsPotentialDuplicate() {
    return isPotentialDuplicate;
  }
  public void setIsPotentialDuplicate(Boolean isPotentialDuplicate) {
    this.isPotentialDuplicate = isPotentialDuplicate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAllTransactionsParams updateAllTransactionsParams = (UpdateAllTransactionsParams) o;
    return Objects.equals(isNew, updateAllTransactionsParams.isNew) &&
        Objects.equals(isPotentialDuplicate, updateAllTransactionsParams.isPotentialDuplicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isNew, isPotentialDuplicate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAllTransactionsParams {\n");
    
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    isPotentialDuplicate: ").append(toIndentedString(isPotentialDuplicate)).append("\n");
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

