/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.BankRedirectDataOneOf6Interac;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankRedirectDataOneOf6
 */
@JsonPropertyOrder({
  BankRedirectDataOneOf6.JSON_PROPERTY_INTERAC
})
@JsonTypeName("BankRedirectData_oneOf_6")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class BankRedirectDataOneOf6 {
  public static final String JSON_PROPERTY_INTERAC = "interac";
  private BankRedirectDataOneOf6Interac interac;

  public BankRedirectDataOneOf6() {
  }

  public BankRedirectDataOneOf6 interac(BankRedirectDataOneOf6Interac interac) {
    
    this.interac = interac;
    return this;
  }

   /**
   * Get interac
   * @return interac
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTERAC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf6Interac getInterac() {
    return interac;
  }


  @JsonProperty(JSON_PROPERTY_INTERAC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterac(BankRedirectDataOneOf6Interac interac) {
    this.interac = interac;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRedirectDataOneOf6 bankRedirectDataOneOf6 = (BankRedirectDataOneOf6) o;
    return Objects.equals(this.interac, bankRedirectDataOneOf6.interac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interac);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankRedirectDataOneOf6 {\n");
    sb.append("    interac: ").append(toIndentedString(interac)).append("\n");
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
