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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaymentsStartRequest
 */
@JsonPropertyOrder({
  PaymentsStartRequest.JSON_PROPERTY_PAYMENT_ID,
  PaymentsStartRequest.JSON_PROPERTY_MERCHANT_ID,
  PaymentsStartRequest.JSON_PROPERTY_ATTEMPT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class PaymentsStartRequest {
  public static final String JSON_PROPERTY_PAYMENT_ID = "payment_id";
  private String paymentId;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  private String merchantId;

  public static final String JSON_PROPERTY_ATTEMPT_ID = "attempt_id";
  private String attemptId;

  public PaymentsStartRequest() {
  }

  public PaymentsStartRequest paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Unique identifier for the payment. This ensures idempotency for multiple payments that have been done by a single merchant. This field is auto generated and is returned in the API response.
   * @return paymentId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentId() {
    return paymentId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public PaymentsStartRequest merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The identifier for the Merchant Account.
   * @return merchantId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantId() {
    return merchantId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public PaymentsStartRequest attemptId(String attemptId) {
    
    this.attemptId = attemptId;
    return this;
  }

   /**
   * The identifier for the payment transaction
   * @return attemptId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAttemptId() {
    return attemptId;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttemptId(String attemptId) {
    this.attemptId = attemptId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsStartRequest paymentsStartRequest = (PaymentsStartRequest) o;
    return Objects.equals(this.paymentId, paymentsStartRequest.paymentId) &&
        Objects.equals(this.merchantId, paymentsStartRequest.merchantId) &&
        Objects.equals(this.attemptId, paymentsStartRequest.attemptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, merchantId, attemptId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsStartRequest {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    attemptId: ").append(toIndentedString(attemptId)).append("\n");
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

