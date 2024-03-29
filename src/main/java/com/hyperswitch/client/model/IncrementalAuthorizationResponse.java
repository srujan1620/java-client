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
import com.hyperswitch.client.model.AuthorizationStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IncrementalAuthorizationResponse
 */
@JsonPropertyOrder({
  IncrementalAuthorizationResponse.JSON_PROPERTY_AUTHORIZATION_ID,
  IncrementalAuthorizationResponse.JSON_PROPERTY_AMOUNT,
  IncrementalAuthorizationResponse.JSON_PROPERTY_STATUS,
  IncrementalAuthorizationResponse.JSON_PROPERTY_ERROR_CODE,
  IncrementalAuthorizationResponse.JSON_PROPERTY_ERROR_MESSAGE,
  IncrementalAuthorizationResponse.JSON_PROPERTY_PREVIOUSLY_AUTHORIZED_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class IncrementalAuthorizationResponse {
  public static final String JSON_PROPERTY_AUTHORIZATION_ID = "authorization_id";
  private String authorizationId;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AuthorizationStatus status;

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private JsonNullable<String> errorCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREVIOUSLY_AUTHORIZED_AMOUNT = "previously_authorized_amount";
  private Long previouslyAuthorizedAmount;

  public IncrementalAuthorizationResponse() {
  }

  public IncrementalAuthorizationResponse authorizationId(String authorizationId) {
    
    this.authorizationId = authorizationId;
    return this;
  }

   /**
   * The unique identifier of authorization
   * @return authorizationId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthorizationId() {
    return authorizationId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
  }


  public IncrementalAuthorizationResponse amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount the authorization has been made for
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public IncrementalAuthorizationResponse status(AuthorizationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuthorizationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(AuthorizationStatus status) {
    this.status = status;
  }


  public IncrementalAuthorizationResponse errorCode(String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
    
    return this;
  }

   /**
   * Error code sent by the connector for authorization
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getErrorCode() {
        return errorCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorCode_JsonNullable() {
    return errorCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  public void setErrorCode_JsonNullable(JsonNullable<String> errorCode) {
    this.errorCode = errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
  }


  public IncrementalAuthorizationResponse errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    
    return this;
  }

   /**
   * Error message sent by the connector for authorization
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }


  public IncrementalAuthorizationResponse previouslyAuthorizedAmount(Long previouslyAuthorizedAmount) {
    
    this.previouslyAuthorizedAmount = previouslyAuthorizedAmount;
    return this;
  }

   /**
   * Previously authorized amount for the payment
   * @return previouslyAuthorizedAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PREVIOUSLY_AUTHORIZED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPreviouslyAuthorizedAmount() {
    return previouslyAuthorizedAmount;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUSLY_AUTHORIZED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreviouslyAuthorizedAmount(Long previouslyAuthorizedAmount) {
    this.previouslyAuthorizedAmount = previouslyAuthorizedAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncrementalAuthorizationResponse incrementalAuthorizationResponse = (IncrementalAuthorizationResponse) o;
    return Objects.equals(this.authorizationId, incrementalAuthorizationResponse.authorizationId) &&
        Objects.equals(this.amount, incrementalAuthorizationResponse.amount) &&
        Objects.equals(this.status, incrementalAuthorizationResponse.status) &&
        equalsNullable(this.errorCode, incrementalAuthorizationResponse.errorCode) &&
        equalsNullable(this.errorMessage, incrementalAuthorizationResponse.errorMessage) &&
        Objects.equals(this.previouslyAuthorizedAmount, incrementalAuthorizationResponse.previouslyAuthorizedAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationId, amount, status, hashCodeNullable(errorCode), hashCodeNullable(errorMessage), previouslyAuthorizedAmount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncrementalAuthorizationResponse {\n");
    sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    previouslyAuthorizedAmount: ").append(toIndentedString(previouslyAuthorizedAmount)).append("\n");
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

