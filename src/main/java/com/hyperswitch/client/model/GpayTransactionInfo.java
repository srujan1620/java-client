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
import com.hyperswitch.client.model.CountryAlpha2;
import com.hyperswitch.client.model.Currency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GpayTransactionInfo
 */
@JsonPropertyOrder({
  GpayTransactionInfo.JSON_PROPERTY_COUNTRY_CODE,
  GpayTransactionInfo.JSON_PROPERTY_CURRENCY_CODE,
  GpayTransactionInfo.JSON_PROPERTY_TOTAL_PRICE_STATUS,
  GpayTransactionInfo.JSON_PROPERTY_TOTAL_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class GpayTransactionInfo {
  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private CountryAlpha2 countryCode;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currency_code";
  private Currency currencyCode;

  public static final String JSON_PROPERTY_TOTAL_PRICE_STATUS = "total_price_status";
  private String totalPriceStatus;

  public static final String JSON_PROPERTY_TOTAL_PRICE = "total_price";
  private String totalPrice;

  public GpayTransactionInfo() {
  }

  public GpayTransactionInfo countryCode(CountryAlpha2 countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CountryAlpha2 getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(CountryAlpha2 countryCode) {
    this.countryCode = countryCode;
  }


  public GpayTransactionInfo currencyCode(Currency currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
  }


  public GpayTransactionInfo totalPriceStatus(String totalPriceStatus) {
    
    this.totalPriceStatus = totalPriceStatus;
    return this;
  }

   /**
   * The total price status (ex: &#39;FINAL&#39;)
   * @return totalPriceStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_PRICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalPriceStatus() {
    return totalPriceStatus;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PRICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalPriceStatus(String totalPriceStatus) {
    this.totalPriceStatus = totalPriceStatus;
  }


  public GpayTransactionInfo totalPrice(String totalPrice) {
    
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * The total price
   * @return totalPrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalPrice() {
    return totalPrice;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpayTransactionInfo gpayTransactionInfo = (GpayTransactionInfo) o;
    return Objects.equals(this.countryCode, gpayTransactionInfo.countryCode) &&
        Objects.equals(this.currencyCode, gpayTransactionInfo.currencyCode) &&
        Objects.equals(this.totalPriceStatus, gpayTransactionInfo.totalPriceStatus) &&
        Objects.equals(this.totalPrice, gpayTransactionInfo.totalPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, currencyCode, totalPriceStatus, totalPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GpayTransactionInfo {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    totalPriceStatus: ").append(toIndentedString(totalPriceStatus)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
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
