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
import java.time.OffsetDateTime;
import com.hyperswitch.client.model.DisputeStage;
import com.hyperswitch.client.model.DisputeStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DisputeResponse
 */
@JsonPropertyOrder({
  DisputeResponse.JSON_PROPERTY_DISPUTE_ID,
  DisputeResponse.JSON_PROPERTY_PAYMENT_ID,
  DisputeResponse.JSON_PROPERTY_ATTEMPT_ID,
  DisputeResponse.JSON_PROPERTY_AMOUNT,
  DisputeResponse.JSON_PROPERTY_CURRENCY,
  DisputeResponse.JSON_PROPERTY_DISPUTE_STAGE,
  DisputeResponse.JSON_PROPERTY_DISPUTE_STATUS,
  DisputeResponse.JSON_PROPERTY_CONNECTOR,
  DisputeResponse.JSON_PROPERTY_CONNECTOR_STATUS,
  DisputeResponse.JSON_PROPERTY_CONNECTOR_DISPUTE_ID,
  DisputeResponse.JSON_PROPERTY_CONNECTOR_REASON,
  DisputeResponse.JSON_PROPERTY_CONNECTOR_REASON_CODE,
  DisputeResponse.JSON_PROPERTY_CHALLENGE_REQUIRED_BY,
  DisputeResponse.JSON_PROPERTY_CONNECTOR_CREATED_AT,
  DisputeResponse.JSON_PROPERTY_CONNECTOR_UPDATED_AT,
  DisputeResponse.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T20:00:07.865622+05:30[Asia/Kolkata]")
public class DisputeResponse {
  public static final String JSON_PROPERTY_DISPUTE_ID = "dispute_id";
  private String disputeId;

  public static final String JSON_PROPERTY_PAYMENT_ID = "payment_id";
  private String paymentId;

  public static final String JSON_PROPERTY_ATTEMPT_ID = "attempt_id";
  private String attemptId;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DISPUTE_STAGE = "dispute_stage";
  private DisputeStage disputeStage;

  public static final String JSON_PROPERTY_DISPUTE_STATUS = "dispute_status";
  private DisputeStatus disputeStatus;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private String connector;

  public static final String JSON_PROPERTY_CONNECTOR_STATUS = "connector_status";
  private String connectorStatus;

  public static final String JSON_PROPERTY_CONNECTOR_DISPUTE_ID = "connector_dispute_id";
  private String connectorDisputeId;

  public static final String JSON_PROPERTY_CONNECTOR_REASON = "connector_reason";
  private JsonNullable<String> connectorReason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_REASON_CODE = "connector_reason_code";
  private JsonNullable<String> connectorReasonCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CHALLENGE_REQUIRED_BY = "challenge_required_by";
  private JsonNullable<OffsetDateTime> challengeRequiredBy = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_CREATED_AT = "connector_created_at";
  private JsonNullable<OffsetDateTime> connectorCreatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_UPDATED_AT = "connector_updated_at";
  private JsonNullable<OffsetDateTime> connectorUpdatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public DisputeResponse() {
  }

  public DisputeResponse disputeId(String disputeId) {
    
    this.disputeId = disputeId;
    return this;
  }

   /**
   * The identifier for dispute
   * @return disputeId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisputeId() {
    return disputeId;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisputeId(String disputeId) {
    this.disputeId = disputeId;
  }


  public DisputeResponse paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The identifier for payment_intent
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


  public DisputeResponse attemptId(String attemptId) {
    
    this.attemptId = attemptId;
    return this;
  }

   /**
   * The identifier for payment_attempt
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


  public DisputeResponse amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The dispute amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public DisputeResponse currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter ISO currency code
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public DisputeResponse disputeStage(DisputeStage disputeStage) {
    
    this.disputeStage = disputeStage;
    return this;
  }

   /**
   * Get disputeStage
   * @return disputeStage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPUTE_STAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DisputeStage getDisputeStage() {
    return disputeStage;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_STAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisputeStage(DisputeStage disputeStage) {
    this.disputeStage = disputeStage;
  }


  public DisputeResponse disputeStatus(DisputeStatus disputeStatus) {
    
    this.disputeStatus = disputeStatus;
    return this;
  }

   /**
   * Get disputeStatus
   * @return disputeStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPUTE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DisputeStatus getDisputeStatus() {
    return disputeStatus;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisputeStatus(DisputeStatus disputeStatus) {
    this.disputeStatus = disputeStatus;
  }


  public DisputeResponse connector(String connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * connector to which dispute is associated with
   * @return connector
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(String connector) {
    this.connector = connector;
  }


  public DisputeResponse connectorStatus(String connectorStatus) {
    
    this.connectorStatus = connectorStatus;
    return this;
  }

   /**
   * Status of the dispute sent by connector
   * @return connectorStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectorStatus() {
    return connectorStatus;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorStatus(String connectorStatus) {
    this.connectorStatus = connectorStatus;
  }


  public DisputeResponse connectorDisputeId(String connectorDisputeId) {
    
    this.connectorDisputeId = connectorDisputeId;
    return this;
  }

   /**
   * Dispute id sent by connector
   * @return connectorDisputeId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectorDisputeId() {
    return connectorDisputeId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorDisputeId(String connectorDisputeId) {
    this.connectorDisputeId = connectorDisputeId;
  }


  public DisputeResponse connectorReason(String connectorReason) {
    this.connectorReason = JsonNullable.<String>of(connectorReason);
    
    return this;
  }

   /**
   * Reason of dispute sent by connector
   * @return connectorReason
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getConnectorReason() {
        return connectorReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorReason_JsonNullable() {
    return connectorReason;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_REASON)
  public void setConnectorReason_JsonNullable(JsonNullable<String> connectorReason) {
    this.connectorReason = connectorReason;
  }

  public void setConnectorReason(String connectorReason) {
    this.connectorReason = JsonNullable.<String>of(connectorReason);
  }


  public DisputeResponse connectorReasonCode(String connectorReasonCode) {
    this.connectorReasonCode = JsonNullable.<String>of(connectorReasonCode);
    
    return this;
  }

   /**
   * Reason code of dispute sent by connector
   * @return connectorReasonCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getConnectorReasonCode() {
        return connectorReasonCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorReasonCode_JsonNullable() {
    return connectorReasonCode;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_REASON_CODE)
  public void setConnectorReasonCode_JsonNullable(JsonNullable<String> connectorReasonCode) {
    this.connectorReasonCode = connectorReasonCode;
  }

  public void setConnectorReasonCode(String connectorReasonCode) {
    this.connectorReasonCode = JsonNullable.<String>of(connectorReasonCode);
  }


  public DisputeResponse challengeRequiredBy(OffsetDateTime challengeRequiredBy) {
    this.challengeRequiredBy = JsonNullable.<OffsetDateTime>of(challengeRequiredBy);
    
    return this;
  }

   /**
   * Evidence deadline of dispute sent by connector
   * @return challengeRequiredBy
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getChallengeRequiredBy() {
        return challengeRequiredBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHALLENGE_REQUIRED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getChallengeRequiredBy_JsonNullable() {
    return challengeRequiredBy;
  }
  
  @JsonProperty(JSON_PROPERTY_CHALLENGE_REQUIRED_BY)
  public void setChallengeRequiredBy_JsonNullable(JsonNullable<OffsetDateTime> challengeRequiredBy) {
    this.challengeRequiredBy = challengeRequiredBy;
  }

  public void setChallengeRequiredBy(OffsetDateTime challengeRequiredBy) {
    this.challengeRequiredBy = JsonNullable.<OffsetDateTime>of(challengeRequiredBy);
  }


  public DisputeResponse connectorCreatedAt(OffsetDateTime connectorCreatedAt) {
    this.connectorCreatedAt = JsonNullable.<OffsetDateTime>of(connectorCreatedAt);
    
    return this;
  }

   /**
   * Dispute created time sent by connector
   * @return connectorCreatedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getConnectorCreatedAt() {
        return connectorCreatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getConnectorCreatedAt_JsonNullable() {
    return connectorCreatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_CREATED_AT)
  public void setConnectorCreatedAt_JsonNullable(JsonNullable<OffsetDateTime> connectorCreatedAt) {
    this.connectorCreatedAt = connectorCreatedAt;
  }

  public void setConnectorCreatedAt(OffsetDateTime connectorCreatedAt) {
    this.connectorCreatedAt = JsonNullable.<OffsetDateTime>of(connectorCreatedAt);
  }


  public DisputeResponse connectorUpdatedAt(OffsetDateTime connectorUpdatedAt) {
    this.connectorUpdatedAt = JsonNullable.<OffsetDateTime>of(connectorUpdatedAt);
    
    return this;
  }

   /**
   * Dispute updated time sent by connector
   * @return connectorUpdatedAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getConnectorUpdatedAt() {
        return connectorUpdatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getConnectorUpdatedAt_JsonNullable() {
    return connectorUpdatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_UPDATED_AT)
  public void setConnectorUpdatedAt_JsonNullable(JsonNullable<OffsetDateTime> connectorUpdatedAt) {
    this.connectorUpdatedAt = connectorUpdatedAt;
  }

  public void setConnectorUpdatedAt(OffsetDateTime connectorUpdatedAt) {
    this.connectorUpdatedAt = JsonNullable.<OffsetDateTime>of(connectorUpdatedAt);
  }


  public DisputeResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time at which dispute is received
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeResponse disputeResponse = (DisputeResponse) o;
    return Objects.equals(this.disputeId, disputeResponse.disputeId) &&
        Objects.equals(this.paymentId, disputeResponse.paymentId) &&
        Objects.equals(this.attemptId, disputeResponse.attemptId) &&
        Objects.equals(this.amount, disputeResponse.amount) &&
        Objects.equals(this.currency, disputeResponse.currency) &&
        Objects.equals(this.disputeStage, disputeResponse.disputeStage) &&
        Objects.equals(this.disputeStatus, disputeResponse.disputeStatus) &&
        Objects.equals(this.connector, disputeResponse.connector) &&
        Objects.equals(this.connectorStatus, disputeResponse.connectorStatus) &&
        Objects.equals(this.connectorDisputeId, disputeResponse.connectorDisputeId) &&
        equalsNullable(this.connectorReason, disputeResponse.connectorReason) &&
        equalsNullable(this.connectorReasonCode, disputeResponse.connectorReasonCode) &&
        equalsNullable(this.challengeRequiredBy, disputeResponse.challengeRequiredBy) &&
        equalsNullable(this.connectorCreatedAt, disputeResponse.connectorCreatedAt) &&
        equalsNullable(this.connectorUpdatedAt, disputeResponse.connectorUpdatedAt) &&
        Objects.equals(this.createdAt, disputeResponse.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputeId, paymentId, attemptId, amount, currency, disputeStage, disputeStatus, connector, connectorStatus, connectorDisputeId, hashCodeNullable(connectorReason), hashCodeNullable(connectorReasonCode), hashCodeNullable(challengeRequiredBy), hashCodeNullable(connectorCreatedAt), hashCodeNullable(connectorUpdatedAt), createdAt);
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
    sb.append("class DisputeResponse {\n");
    sb.append("    disputeId: ").append(toIndentedString(disputeId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    attemptId: ").append(toIndentedString(attemptId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    disputeStage: ").append(toIndentedString(disputeStage)).append("\n");
    sb.append("    disputeStatus: ").append(toIndentedString(disputeStatus)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    connectorStatus: ").append(toIndentedString(connectorStatus)).append("\n");
    sb.append("    connectorDisputeId: ").append(toIndentedString(connectorDisputeId)).append("\n");
    sb.append("    connectorReason: ").append(toIndentedString(connectorReason)).append("\n");
    sb.append("    connectorReasonCode: ").append(toIndentedString(connectorReasonCode)).append("\n");
    sb.append("    challengeRequiredBy: ").append(toIndentedString(challengeRequiredBy)).append("\n");
    sb.append("    connectorCreatedAt: ").append(toIndentedString(connectorCreatedAt)).append("\n");
    sb.append("    connectorUpdatedAt: ").append(toIndentedString(connectorUpdatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
