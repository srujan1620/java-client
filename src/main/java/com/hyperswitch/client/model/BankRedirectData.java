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
import com.hyperswitch.client.model.BankRedirectDataOneOf;
import com.hyperswitch.client.model.BankRedirectDataOneOf1;
import com.hyperswitch.client.model.BankRedirectDataOneOf10;
import com.hyperswitch.client.model.BankRedirectDataOneOf11;
import com.hyperswitch.client.model.BankRedirectDataOneOf11OpenBankingUk;
import com.hyperswitch.client.model.BankRedirectDataOneOf12;
import com.hyperswitch.client.model.BankRedirectDataOneOf12Przelewy24;
import com.hyperswitch.client.model.BankRedirectDataOneOf13;
import com.hyperswitch.client.model.BankRedirectDataOneOf13Sofort;
import com.hyperswitch.client.model.BankRedirectDataOneOf14;
import com.hyperswitch.client.model.BankRedirectDataOneOf14Trustly;
import com.hyperswitch.client.model.BankRedirectDataOneOf15;
import com.hyperswitch.client.model.BankRedirectDataOneOf16;
import com.hyperswitch.client.model.BankRedirectDataOneOf2;
import com.hyperswitch.client.model.BankRedirectDataOneOf2Blik;
import com.hyperswitch.client.model.BankRedirectDataOneOf3;
import com.hyperswitch.client.model.BankRedirectDataOneOf3Eps;
import com.hyperswitch.client.model.BankRedirectDataOneOf4;
import com.hyperswitch.client.model.BankRedirectDataOneOf4Giropay;
import com.hyperswitch.client.model.BankRedirectDataOneOf5;
import com.hyperswitch.client.model.BankRedirectDataOneOf6;
import com.hyperswitch.client.model.BankRedirectDataOneOf6Interac;
import com.hyperswitch.client.model.BankRedirectDataOneOf7;
import com.hyperswitch.client.model.BankRedirectDataOneOf7OnlineBankingCzechRepublic;
import com.hyperswitch.client.model.BankRedirectDataOneOf8;
import com.hyperswitch.client.model.BankRedirectDataOneOf8OnlineBankingFinland;
import com.hyperswitch.client.model.BankRedirectDataOneOf9;
import com.hyperswitch.client.model.BankRedirectDataOneOfBancontactCard;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankRedirectData
 */
@JsonPropertyOrder({
  BankRedirectData.JSON_PROPERTY_BANCONTACT_CARD,
  BankRedirectData.JSON_PROPERTY_BIZUM,
  BankRedirectData.JSON_PROPERTY_BLIK,
  BankRedirectData.JSON_PROPERTY_EPS,
  BankRedirectData.JSON_PROPERTY_GIROPAY,
  BankRedirectData.JSON_PROPERTY_IDEAL,
  BankRedirectData.JSON_PROPERTY_INTERAC,
  BankRedirectData.JSON_PROPERTY_ONLINE_BANKING_CZECH_REPUBLIC,
  BankRedirectData.JSON_PROPERTY_ONLINE_BANKING_FINLAND,
  BankRedirectData.JSON_PROPERTY_ONLINE_BANKING_POLAND,
  BankRedirectData.JSON_PROPERTY_ONLINE_BANKING_SLOVAKIA,
  BankRedirectData.JSON_PROPERTY_OPEN_BANKING_UK,
  BankRedirectData.JSON_PROPERTY_PRZELEWY24,
  BankRedirectData.JSON_PROPERTY_SOFORT,
  BankRedirectData.JSON_PROPERTY_TRUSTLY,
  BankRedirectData.JSON_PROPERTY_ONLINE_BANKING_FPX,
  BankRedirectData.JSON_PROPERTY_ONLINE_BANKING_THAILAND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class BankRedirectData {
  public static final String JSON_PROPERTY_BANCONTACT_CARD = "bancontact_card";
  private BankRedirectDataOneOfBancontactCard bancontactCard;

  public static final String JSON_PROPERTY_BIZUM = "bizum";
  private Object bizum;

  public static final String JSON_PROPERTY_BLIK = "blik";
  private BankRedirectDataOneOf2Blik blik;

  public static final String JSON_PROPERTY_EPS = "eps";
  private BankRedirectDataOneOf3Eps eps;

  public static final String JSON_PROPERTY_GIROPAY = "giropay";
  private BankRedirectDataOneOf4Giropay giropay;

  public static final String JSON_PROPERTY_IDEAL = "ideal";
  private BankRedirectDataOneOf3Eps ideal;

  public static final String JSON_PROPERTY_INTERAC = "interac";
  private BankRedirectDataOneOf6Interac interac;

  public static final String JSON_PROPERTY_ONLINE_BANKING_CZECH_REPUBLIC = "online_banking_czech_republic";
  private BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingCzechRepublic;

  public static final String JSON_PROPERTY_ONLINE_BANKING_FINLAND = "online_banking_finland";
  private BankRedirectDataOneOf8OnlineBankingFinland onlineBankingFinland;

  public static final String JSON_PROPERTY_ONLINE_BANKING_POLAND = "online_banking_poland";
  private BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingPoland;

  public static final String JSON_PROPERTY_ONLINE_BANKING_SLOVAKIA = "online_banking_slovakia";
  private BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingSlovakia;

  public static final String JSON_PROPERTY_OPEN_BANKING_UK = "open_banking_uk";
  private BankRedirectDataOneOf11OpenBankingUk openBankingUk;

  public static final String JSON_PROPERTY_PRZELEWY24 = "przelewy24";
  private BankRedirectDataOneOf12Przelewy24 przelewy24;

  public static final String JSON_PROPERTY_SOFORT = "sofort";
  private BankRedirectDataOneOf13Sofort sofort;

  public static final String JSON_PROPERTY_TRUSTLY = "trustly";
  private BankRedirectDataOneOf14Trustly trustly;

  public static final String JSON_PROPERTY_ONLINE_BANKING_FPX = "online_banking_fpx";
  private BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingFpx;

  public static final String JSON_PROPERTY_ONLINE_BANKING_THAILAND = "online_banking_thailand";
  private BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingThailand;

  public BankRedirectData() {
  }

  public BankRedirectData bancontactCard(BankRedirectDataOneOfBancontactCard bancontactCard) {
    
    this.bancontactCard = bancontactCard;
    return this;
  }

   /**
   * Get bancontactCard
   * @return bancontactCard
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANCONTACT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOfBancontactCard getBancontactCard() {
    return bancontactCard;
  }


  @JsonProperty(JSON_PROPERTY_BANCONTACT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBancontactCard(BankRedirectDataOneOfBancontactCard bancontactCard) {
    this.bancontactCard = bancontactCard;
  }


  public BankRedirectData bizum(Object bizum) {
    
    this.bizum = bizum;
    return this;
  }

   /**
   * Get bizum
   * @return bizum
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BIZUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBizum() {
    return bizum;
  }


  @JsonProperty(JSON_PROPERTY_BIZUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBizum(Object bizum) {
    this.bizum = bizum;
  }


  public BankRedirectData blik(BankRedirectDataOneOf2Blik blik) {
    
    this.blik = blik;
    return this;
  }

   /**
   * Get blik
   * @return blik
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLIK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf2Blik getBlik() {
    return blik;
  }


  @JsonProperty(JSON_PROPERTY_BLIK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlik(BankRedirectDataOneOf2Blik blik) {
    this.blik = blik;
  }


  public BankRedirectData eps(BankRedirectDataOneOf3Eps eps) {
    
    this.eps = eps;
    return this;
  }

   /**
   * Get eps
   * @return eps
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf3Eps getEps() {
    return eps;
  }


  @JsonProperty(JSON_PROPERTY_EPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEps(BankRedirectDataOneOf3Eps eps) {
    this.eps = eps;
  }


  public BankRedirectData giropay(BankRedirectDataOneOf4Giropay giropay) {
    
    this.giropay = giropay;
    return this;
  }

   /**
   * Get giropay
   * @return giropay
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GIROPAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf4Giropay getGiropay() {
    return giropay;
  }


  @JsonProperty(JSON_PROPERTY_GIROPAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGiropay(BankRedirectDataOneOf4Giropay giropay) {
    this.giropay = giropay;
  }


  public BankRedirectData ideal(BankRedirectDataOneOf3Eps ideal) {
    
    this.ideal = ideal;
    return this;
  }

   /**
   * Get ideal
   * @return ideal
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IDEAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf3Eps getIdeal() {
    return ideal;
  }


  @JsonProperty(JSON_PROPERTY_IDEAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdeal(BankRedirectDataOneOf3Eps ideal) {
    this.ideal = ideal;
  }


  public BankRedirectData interac(BankRedirectDataOneOf6Interac interac) {
    
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


  public BankRedirectData onlineBankingCzechRepublic(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingCzechRepublic) {
    
    this.onlineBankingCzechRepublic = onlineBankingCzechRepublic;
    return this;
  }

   /**
   * Get onlineBankingCzechRepublic
   * @return onlineBankingCzechRepublic
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_CZECH_REPUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf7OnlineBankingCzechRepublic getOnlineBankingCzechRepublic() {
    return onlineBankingCzechRepublic;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_CZECH_REPUBLIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlineBankingCzechRepublic(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingCzechRepublic) {
    this.onlineBankingCzechRepublic = onlineBankingCzechRepublic;
  }


  public BankRedirectData onlineBankingFinland(BankRedirectDataOneOf8OnlineBankingFinland onlineBankingFinland) {
    
    this.onlineBankingFinland = onlineBankingFinland;
    return this;
  }

   /**
   * Get onlineBankingFinland
   * @return onlineBankingFinland
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_FINLAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf8OnlineBankingFinland getOnlineBankingFinland() {
    return onlineBankingFinland;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_FINLAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlineBankingFinland(BankRedirectDataOneOf8OnlineBankingFinland onlineBankingFinland) {
    this.onlineBankingFinland = onlineBankingFinland;
  }


  public BankRedirectData onlineBankingPoland(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingPoland) {
    
    this.onlineBankingPoland = onlineBankingPoland;
    return this;
  }

   /**
   * Get onlineBankingPoland
   * @return onlineBankingPoland
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_POLAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf7OnlineBankingCzechRepublic getOnlineBankingPoland() {
    return onlineBankingPoland;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_POLAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlineBankingPoland(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingPoland) {
    this.onlineBankingPoland = onlineBankingPoland;
  }


  public BankRedirectData onlineBankingSlovakia(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingSlovakia) {
    
    this.onlineBankingSlovakia = onlineBankingSlovakia;
    return this;
  }

   /**
   * Get onlineBankingSlovakia
   * @return onlineBankingSlovakia
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_SLOVAKIA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf7OnlineBankingCzechRepublic getOnlineBankingSlovakia() {
    return onlineBankingSlovakia;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_SLOVAKIA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlineBankingSlovakia(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingSlovakia) {
    this.onlineBankingSlovakia = onlineBankingSlovakia;
  }


  public BankRedirectData openBankingUk(BankRedirectDataOneOf11OpenBankingUk openBankingUk) {
    
    this.openBankingUk = openBankingUk;
    return this;
  }

   /**
   * Get openBankingUk
   * @return openBankingUk
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPEN_BANKING_UK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf11OpenBankingUk getOpenBankingUk() {
    return openBankingUk;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_BANKING_UK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenBankingUk(BankRedirectDataOneOf11OpenBankingUk openBankingUk) {
    this.openBankingUk = openBankingUk;
  }


  public BankRedirectData przelewy24(BankRedirectDataOneOf12Przelewy24 przelewy24) {
    
    this.przelewy24 = przelewy24;
    return this;
  }

   /**
   * Get przelewy24
   * @return przelewy24
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRZELEWY24)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf12Przelewy24 getPrzelewy24() {
    return przelewy24;
  }


  @JsonProperty(JSON_PROPERTY_PRZELEWY24)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrzelewy24(BankRedirectDataOneOf12Przelewy24 przelewy24) {
    this.przelewy24 = przelewy24;
  }


  public BankRedirectData sofort(BankRedirectDataOneOf13Sofort sofort) {
    
    this.sofort = sofort;
    return this;
  }

   /**
   * Get sofort
   * @return sofort
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOFORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf13Sofort getSofort() {
    return sofort;
  }


  @JsonProperty(JSON_PROPERTY_SOFORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSofort(BankRedirectDataOneOf13Sofort sofort) {
    this.sofort = sofort;
  }


  public BankRedirectData trustly(BankRedirectDataOneOf14Trustly trustly) {
    
    this.trustly = trustly;
    return this;
  }

   /**
   * Get trustly
   * @return trustly
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRUSTLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf14Trustly getTrustly() {
    return trustly;
  }


  @JsonProperty(JSON_PROPERTY_TRUSTLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrustly(BankRedirectDataOneOf14Trustly trustly) {
    this.trustly = trustly;
  }


  public BankRedirectData onlineBankingFpx(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingFpx) {
    
    this.onlineBankingFpx = onlineBankingFpx;
    return this;
  }

   /**
   * Get onlineBankingFpx
   * @return onlineBankingFpx
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_FPX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf7OnlineBankingCzechRepublic getOnlineBankingFpx() {
    return onlineBankingFpx;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_FPX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlineBankingFpx(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingFpx) {
    this.onlineBankingFpx = onlineBankingFpx;
  }


  public BankRedirectData onlineBankingThailand(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingThailand) {
    
    this.onlineBankingThailand = onlineBankingThailand;
    return this;
  }

   /**
   * Get onlineBankingThailand
   * @return onlineBankingThailand
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_THAILAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectDataOneOf7OnlineBankingCzechRepublic getOnlineBankingThailand() {
    return onlineBankingThailand;
  }


  @JsonProperty(JSON_PROPERTY_ONLINE_BANKING_THAILAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnlineBankingThailand(BankRedirectDataOneOf7OnlineBankingCzechRepublic onlineBankingThailand) {
    this.onlineBankingThailand = onlineBankingThailand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRedirectData bankRedirectData = (BankRedirectData) o;
    return Objects.equals(this.bancontactCard, bankRedirectData.bancontactCard) &&
        Objects.equals(this.bizum, bankRedirectData.bizum) &&
        Objects.equals(this.blik, bankRedirectData.blik) &&
        Objects.equals(this.eps, bankRedirectData.eps) &&
        Objects.equals(this.giropay, bankRedirectData.giropay) &&
        Objects.equals(this.ideal, bankRedirectData.ideal) &&
        Objects.equals(this.interac, bankRedirectData.interac) &&
        Objects.equals(this.onlineBankingCzechRepublic, bankRedirectData.onlineBankingCzechRepublic) &&
        Objects.equals(this.onlineBankingFinland, bankRedirectData.onlineBankingFinland) &&
        Objects.equals(this.onlineBankingPoland, bankRedirectData.onlineBankingPoland) &&
        Objects.equals(this.onlineBankingSlovakia, bankRedirectData.onlineBankingSlovakia) &&
        Objects.equals(this.openBankingUk, bankRedirectData.openBankingUk) &&
        Objects.equals(this.przelewy24, bankRedirectData.przelewy24) &&
        Objects.equals(this.sofort, bankRedirectData.sofort) &&
        Objects.equals(this.trustly, bankRedirectData.trustly) &&
        Objects.equals(this.onlineBankingFpx, bankRedirectData.onlineBankingFpx) &&
        Objects.equals(this.onlineBankingThailand, bankRedirectData.onlineBankingThailand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bancontactCard, bizum, blik, eps, giropay, ideal, interac, onlineBankingCzechRepublic, onlineBankingFinland, onlineBankingPoland, onlineBankingSlovakia, openBankingUk, przelewy24, sofort, trustly, onlineBankingFpx, onlineBankingThailand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankRedirectData {\n");
    sb.append("    bancontactCard: ").append(toIndentedString(bancontactCard)).append("\n");
    sb.append("    bizum: ").append(toIndentedString(bizum)).append("\n");
    sb.append("    blik: ").append(toIndentedString(blik)).append("\n");
    sb.append("    eps: ").append(toIndentedString(eps)).append("\n");
    sb.append("    giropay: ").append(toIndentedString(giropay)).append("\n");
    sb.append("    ideal: ").append(toIndentedString(ideal)).append("\n");
    sb.append("    interac: ").append(toIndentedString(interac)).append("\n");
    sb.append("    onlineBankingCzechRepublic: ").append(toIndentedString(onlineBankingCzechRepublic)).append("\n");
    sb.append("    onlineBankingFinland: ").append(toIndentedString(onlineBankingFinland)).append("\n");
    sb.append("    onlineBankingPoland: ").append(toIndentedString(onlineBankingPoland)).append("\n");
    sb.append("    onlineBankingSlovakia: ").append(toIndentedString(onlineBankingSlovakia)).append("\n");
    sb.append("    openBankingUk: ").append(toIndentedString(openBankingUk)).append("\n");
    sb.append("    przelewy24: ").append(toIndentedString(przelewy24)).append("\n");
    sb.append("    sofort: ").append(toIndentedString(sofort)).append("\n");
    sb.append("    trustly: ").append(toIndentedString(trustly)).append("\n");
    sb.append("    onlineBankingFpx: ").append(toIndentedString(onlineBankingFpx)).append("\n");
    sb.append("    onlineBankingThailand: ").append(toIndentedString(onlineBankingThailand)).append("\n");
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

