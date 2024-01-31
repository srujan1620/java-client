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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Contains duration for displaying a wait screen, wait screen with timer is displayed by sdk
 */
@JsonPropertyOrder({
  NextActionDataOneOf5.JSON_PROPERTY_DISPLAY_FROM_TIMESTAMP,
  NextActionDataOneOf5.JSON_PROPERTY_DISPLAY_TO_TIMESTAMP,
  NextActionDataOneOf5.JSON_PROPERTY_TYPE
})
@JsonTypeName("NextActionData_oneOf_5")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class NextActionDataOneOf5 {
  public static final String JSON_PROPERTY_DISPLAY_FROM_TIMESTAMP = "display_from_timestamp";
  private Integer displayFromTimestamp;

  public static final String JSON_PROPERTY_DISPLAY_TO_TIMESTAMP = "display_to_timestamp";
  private JsonNullable<Integer> displayToTimestamp = JsonNullable.<Integer>undefined();

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    WAIT_SCREEN_INFORMATION("wait_screen_information");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public NextActionDataOneOf5() {
  }

  public NextActionDataOneOf5 displayFromTimestamp(Integer displayFromTimestamp) {
    
    this.displayFromTimestamp = displayFromTimestamp;
    return this;
  }

   /**
   * Get displayFromTimestamp
   * @return displayFromTimestamp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_FROM_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDisplayFromTimestamp() {
    return displayFromTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_FROM_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayFromTimestamp(Integer displayFromTimestamp) {
    this.displayFromTimestamp = displayFromTimestamp;
  }


  public NextActionDataOneOf5 displayToTimestamp(Integer displayToTimestamp) {
    this.displayToTimestamp = JsonNullable.<Integer>of(displayToTimestamp);
    
    return this;
  }

   /**
   * Get displayToTimestamp
   * @return displayToTimestamp
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getDisplayToTimestamp() {
        return displayToTimestamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_TO_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getDisplayToTimestamp_JsonNullable() {
    return displayToTimestamp;
  }
  
  @JsonProperty(JSON_PROPERTY_DISPLAY_TO_TIMESTAMP)
  public void setDisplayToTimestamp_JsonNullable(JsonNullable<Integer> displayToTimestamp) {
    this.displayToTimestamp = displayToTimestamp;
  }

  public void setDisplayToTimestamp(Integer displayToTimestamp) {
    this.displayToTimestamp = JsonNullable.<Integer>of(displayToTimestamp);
  }


  public NextActionDataOneOf5 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextActionDataOneOf5 nextActionDataOneOf5 = (NextActionDataOneOf5) o;
    return Objects.equals(this.displayFromTimestamp, nextActionDataOneOf5.displayFromTimestamp) &&
        equalsNullable(this.displayToTimestamp, nextActionDataOneOf5.displayToTimestamp) &&
        Objects.equals(this.type, nextActionDataOneOf5.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayFromTimestamp, hashCodeNullable(displayToTimestamp), type);
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
    sb.append("class NextActionDataOneOf5 {\n");
    sb.append("    displayFromTimestamp: ").append(toIndentedString(displayFromTimestamp)).append("\n");
    sb.append("    displayToTimestamp: ").append(toIndentedString(displayToTimestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
