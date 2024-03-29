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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GpayAllowedMethodsParameters
 */
@JsonPropertyOrder({
  GpayAllowedMethodsParameters.JSON_PROPERTY_ALLOWED_AUTH_METHODS,
  GpayAllowedMethodsParameters.JSON_PROPERTY_ALLOWED_CARD_NETWORKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class GpayAllowedMethodsParameters {
  public static final String JSON_PROPERTY_ALLOWED_AUTH_METHODS = "allowed_auth_methods";
  private List<String> allowedAuthMethods = new ArrayList<>();

  public static final String JSON_PROPERTY_ALLOWED_CARD_NETWORKS = "allowed_card_networks";
  private List<String> allowedCardNetworks = new ArrayList<>();

  public GpayAllowedMethodsParameters() {
  }

  public GpayAllowedMethodsParameters allowedAuthMethods(List<String> allowedAuthMethods) {
    
    this.allowedAuthMethods = allowedAuthMethods;
    return this;
  }

  public GpayAllowedMethodsParameters addAllowedAuthMethodsItem(String allowedAuthMethodsItem) {
    if (this.allowedAuthMethods == null) {
      this.allowedAuthMethods = new ArrayList<>();
    }
    this.allowedAuthMethods.add(allowedAuthMethodsItem);
    return this;
  }

   /**
   * The list of allowed auth methods (ex: 3DS, No3DS, PAN_ONLY etc)
   * @return allowedAuthMethods
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_AUTH_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAllowedAuthMethods() {
    return allowedAuthMethods;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_AUTH_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedAuthMethods(List<String> allowedAuthMethods) {
    this.allowedAuthMethods = allowedAuthMethods;
  }


  public GpayAllowedMethodsParameters allowedCardNetworks(List<String> allowedCardNetworks) {
    
    this.allowedCardNetworks = allowedCardNetworks;
    return this;
  }

  public GpayAllowedMethodsParameters addAllowedCardNetworksItem(String allowedCardNetworksItem) {
    if (this.allowedCardNetworks == null) {
      this.allowedCardNetworks = new ArrayList<>();
    }
    this.allowedCardNetworks.add(allowedCardNetworksItem);
    return this;
  }

   /**
   * The list of allowed card networks (ex: AMEX,JCB etc)
   * @return allowedCardNetworks
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_CARD_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAllowedCardNetworks() {
    return allowedCardNetworks;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_CARD_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedCardNetworks(List<String> allowedCardNetworks) {
    this.allowedCardNetworks = allowedCardNetworks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpayAllowedMethodsParameters gpayAllowedMethodsParameters = (GpayAllowedMethodsParameters) o;
    return Objects.equals(this.allowedAuthMethods, gpayAllowedMethodsParameters.allowedAuthMethods) &&
        Objects.equals(this.allowedCardNetworks, gpayAllowedMethodsParameters.allowedCardNetworks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedAuthMethods, allowedCardNetworks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpayAllowedMethodsParameters {\n");
    sb.append("    allowedAuthMethods: ").append(toIndentedString(allowedAuthMethods)).append("\n");
    sb.append("    allowedCardNetworks: ").append(toIndentedString(allowedCardNetworks)).append("\n");
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

