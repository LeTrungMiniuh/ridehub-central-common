package com.ridehub.msroute.client.api;

import com.ridehub.msroute.client.invoker.ApiClient;
import com.ridehub.msroute.client.invoker.EncodingUtils;
import com.ridehub.msroute.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.ridehub.msroute.client.model.TripSeatDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface TripSeatResourceMsrouteApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param idGreaterThan  (optional)
   * @param idLessThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idEquals  (optional)
   * @param idNotEquals  (optional)
   * @param idSpecified  (optional)
   * @param idIn  (optional)
   * @param idNotIn  (optional)
   * @param seatNoContains  (optional)
   * @param seatNoDoesNotContain  (optional)
   * @param seatNoEquals  (optional)
   * @param seatNoNotEquals  (optional)
   * @param seatNoSpecified  (optional)
   * @param seatNoIn  (optional)
   * @param seatNoNotIn  (optional)
   * @param floorNoGreaterThan  (optional)
   * @param floorNoLessThan  (optional)
   * @param floorNoGreaterThanOrEqual  (optional)
   * @param floorNoLessThanOrEqual  (optional)
   * @param floorNoEquals  (optional)
   * @param floorNoNotEquals  (optional)
   * @param floorNoSpecified  (optional)
   * @param floorNoIn  (optional)
   * @param floorNoNotIn  (optional)
   * @param bookedEquals  (optional)
   * @param bookedNotEquals  (optional)
   * @param bookedSpecified  (optional)
   * @param bookedIn  (optional)
   * @param bookedNotIn  (optional)
   * @param priceFactorGreaterThan  (optional)
   * @param priceFactorLessThan  (optional)
   * @param priceFactorGreaterThanOrEqual  (optional)
   * @param priceFactorLessThanOrEqual  (optional)
   * @param priceFactorEquals  (optional)
   * @param priceFactorNotEquals  (optional)
   * @param priceFactorSpecified  (optional)
   * @param priceFactorIn  (optional)
   * @param priceFactorNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param updatedAtGreaterThan  (optional)
   * @param updatedAtLessThan  (optional)
   * @param updatedAtGreaterThanOrEqual  (optional)
   * @param updatedAtLessThanOrEqual  (optional)
   * @param updatedAtEquals  (optional)
   * @param updatedAtNotEquals  (optional)
   * @param updatedAtSpecified  (optional)
   * @param updatedAtIn  (optional)
   * @param updatedAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedAtGreaterThan  (optional)
   * @param deletedAtLessThan  (optional)
   * @param deletedAtGreaterThanOrEqual  (optional)
   * @param deletedAtLessThanOrEqual  (optional)
   * @param deletedAtEquals  (optional)
   * @param deletedAtNotEquals  (optional)
   * @param deletedAtSpecified  (optional)
   * @param deletedAtIn  (optional)
   * @param deletedAtNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param tripIdGreaterThan  (optional)
   * @param tripIdLessThan  (optional)
   * @param tripIdGreaterThanOrEqual  (optional)
   * @param tripIdLessThanOrEqual  (optional)
   * @param tripIdEquals  (optional)
   * @param tripIdNotEquals  (optional)
   * @param tripIdSpecified  (optional)
   * @param tripIdIn  (optional)
   * @param tripIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/trip-seats/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&seatNo.contains={seatNoContains}&seatNo.doesNotContain={seatNoDoesNotContain}&seatNo.equals={seatNoEquals}&seatNo.notEquals={seatNoNotEquals}&seatNo.specified={seatNoSpecified}&seatNo.in={seatNoIn}&seatNo.notIn={seatNoNotIn}&floorNo.greaterThan={floorNoGreaterThan}&floorNo.lessThan={floorNoLessThan}&floorNo.greaterThanOrEqual={floorNoGreaterThanOrEqual}&floorNo.lessThanOrEqual={floorNoLessThanOrEqual}&floorNo.equals={floorNoEquals}&floorNo.notEquals={floorNoNotEquals}&floorNo.specified={floorNoSpecified}&floorNo.in={floorNoIn}&floorNo.notIn={floorNoNotIn}&booked.equals={bookedEquals}&booked.notEquals={bookedNotEquals}&booked.specified={bookedSpecified}&booked.in={bookedIn}&booked.notIn={bookedNotIn}&priceFactor.greaterThan={priceFactorGreaterThan}&priceFactor.lessThan={priceFactorLessThan}&priceFactor.greaterThanOrEqual={priceFactorGreaterThanOrEqual}&priceFactor.lessThanOrEqual={priceFactorLessThanOrEqual}&priceFactor.equals={priceFactorEquals}&priceFactor.notEquals={priceFactorNotEquals}&priceFactor.specified={priceFactorSpecified}&priceFactor.in={priceFactorIn}&priceFactor.notIn={priceFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countTripSeats(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("seatNoContains") @jakarta.annotation.Nullable String seatNoContains, @Param("seatNoDoesNotContain") @jakarta.annotation.Nullable String seatNoDoesNotContain, @Param("seatNoEquals") @jakarta.annotation.Nullable String seatNoEquals, @Param("seatNoNotEquals") @jakarta.annotation.Nullable String seatNoNotEquals, @Param("seatNoSpecified") @jakarta.annotation.Nullable Boolean seatNoSpecified, @Param("seatNoIn") @jakarta.annotation.Nullable List<String> seatNoIn, @Param("seatNoNotIn") @jakarta.annotation.Nullable List<String> seatNoNotIn, @Param("floorNoGreaterThan") @jakarta.annotation.Nullable Integer floorNoGreaterThan, @Param("floorNoLessThan") @jakarta.annotation.Nullable Integer floorNoLessThan, @Param("floorNoGreaterThanOrEqual") @jakarta.annotation.Nullable Integer floorNoGreaterThanOrEqual, @Param("floorNoLessThanOrEqual") @jakarta.annotation.Nullable Integer floorNoLessThanOrEqual, @Param("floorNoEquals") @jakarta.annotation.Nullable Integer floorNoEquals, @Param("floorNoNotEquals") @jakarta.annotation.Nullable Integer floorNoNotEquals, @Param("floorNoSpecified") @jakarta.annotation.Nullable Boolean floorNoSpecified, @Param("floorNoIn") @jakarta.annotation.Nullable List<Integer> floorNoIn, @Param("floorNoNotIn") @jakarta.annotation.Nullable List<Integer> floorNoNotIn, @Param("bookedEquals") @jakarta.annotation.Nullable Boolean bookedEquals, @Param("bookedNotEquals") @jakarta.annotation.Nullable Boolean bookedNotEquals, @Param("bookedSpecified") @jakarta.annotation.Nullable Boolean bookedSpecified, @Param("bookedIn") @jakarta.annotation.Nullable List<Boolean> bookedIn, @Param("bookedNotIn") @jakarta.annotation.Nullable List<Boolean> bookedNotIn, @Param("priceFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal priceFactorGreaterThan, @Param("priceFactorLessThan") @jakarta.annotation.Nullable BigDecimal priceFactorLessThan, @Param("priceFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceFactorGreaterThanOrEqual, @Param("priceFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceFactorLessThanOrEqual, @Param("priceFactorEquals") @jakarta.annotation.Nullable BigDecimal priceFactorEquals, @Param("priceFactorNotEquals") @jakarta.annotation.Nullable BigDecimal priceFactorNotEquals, @Param("priceFactorSpecified") @jakarta.annotation.Nullable Boolean priceFactorSpecified, @Param("priceFactorIn") @jakarta.annotation.Nullable List<BigDecimal> priceFactorIn, @Param("priceFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> priceFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("tripIdGreaterThan") @jakarta.annotation.Nullable Long tripIdGreaterThan, @Param("tripIdLessThan") @jakarta.annotation.Nullable Long tripIdLessThan, @Param("tripIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long tripIdGreaterThanOrEqual, @Param("tripIdLessThanOrEqual") @jakarta.annotation.Nullable Long tripIdLessThanOrEqual, @Param("tripIdEquals") @jakarta.annotation.Nullable Long tripIdEquals, @Param("tripIdNotEquals") @jakarta.annotation.Nullable Long tripIdNotEquals, @Param("tripIdSpecified") @jakarta.annotation.Nullable Boolean tripIdSpecified, @Param("tripIdIn") @jakarta.annotation.Nullable List<Long> tripIdIn, @Param("tripIdNotIn") @jakarta.annotation.Nullable List<Long> tripIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countTripSeats</code> but it also returns the http response headers .
   * 
   * @param idGreaterThan  (optional)
   * @param idLessThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idEquals  (optional)
   * @param idNotEquals  (optional)
   * @param idSpecified  (optional)
   * @param idIn  (optional)
   * @param idNotIn  (optional)
   * @param seatNoContains  (optional)
   * @param seatNoDoesNotContain  (optional)
   * @param seatNoEquals  (optional)
   * @param seatNoNotEquals  (optional)
   * @param seatNoSpecified  (optional)
   * @param seatNoIn  (optional)
   * @param seatNoNotIn  (optional)
   * @param floorNoGreaterThan  (optional)
   * @param floorNoLessThan  (optional)
   * @param floorNoGreaterThanOrEqual  (optional)
   * @param floorNoLessThanOrEqual  (optional)
   * @param floorNoEquals  (optional)
   * @param floorNoNotEquals  (optional)
   * @param floorNoSpecified  (optional)
   * @param floorNoIn  (optional)
   * @param floorNoNotIn  (optional)
   * @param bookedEquals  (optional)
   * @param bookedNotEquals  (optional)
   * @param bookedSpecified  (optional)
   * @param bookedIn  (optional)
   * @param bookedNotIn  (optional)
   * @param priceFactorGreaterThan  (optional)
   * @param priceFactorLessThan  (optional)
   * @param priceFactorGreaterThanOrEqual  (optional)
   * @param priceFactorLessThanOrEqual  (optional)
   * @param priceFactorEquals  (optional)
   * @param priceFactorNotEquals  (optional)
   * @param priceFactorSpecified  (optional)
   * @param priceFactorIn  (optional)
   * @param priceFactorNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param updatedAtGreaterThan  (optional)
   * @param updatedAtLessThan  (optional)
   * @param updatedAtGreaterThanOrEqual  (optional)
   * @param updatedAtLessThanOrEqual  (optional)
   * @param updatedAtEquals  (optional)
   * @param updatedAtNotEquals  (optional)
   * @param updatedAtSpecified  (optional)
   * @param updatedAtIn  (optional)
   * @param updatedAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedAtGreaterThan  (optional)
   * @param deletedAtLessThan  (optional)
   * @param deletedAtGreaterThanOrEqual  (optional)
   * @param deletedAtLessThanOrEqual  (optional)
   * @param deletedAtEquals  (optional)
   * @param deletedAtNotEquals  (optional)
   * @param deletedAtSpecified  (optional)
   * @param deletedAtIn  (optional)
   * @param deletedAtNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param tripIdGreaterThan  (optional)
   * @param tripIdLessThan  (optional)
   * @param tripIdGreaterThanOrEqual  (optional)
   * @param tripIdLessThanOrEqual  (optional)
   * @param tripIdEquals  (optional)
   * @param tripIdNotEquals  (optional)
   * @param tripIdSpecified  (optional)
   * @param tripIdIn  (optional)
   * @param tripIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trip-seats/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&seatNo.contains={seatNoContains}&seatNo.doesNotContain={seatNoDoesNotContain}&seatNo.equals={seatNoEquals}&seatNo.notEquals={seatNoNotEquals}&seatNo.specified={seatNoSpecified}&seatNo.in={seatNoIn}&seatNo.notIn={seatNoNotIn}&floorNo.greaterThan={floorNoGreaterThan}&floorNo.lessThan={floorNoLessThan}&floorNo.greaterThanOrEqual={floorNoGreaterThanOrEqual}&floorNo.lessThanOrEqual={floorNoLessThanOrEqual}&floorNo.equals={floorNoEquals}&floorNo.notEquals={floorNoNotEquals}&floorNo.specified={floorNoSpecified}&floorNo.in={floorNoIn}&floorNo.notIn={floorNoNotIn}&booked.equals={bookedEquals}&booked.notEquals={bookedNotEquals}&booked.specified={bookedSpecified}&booked.in={bookedIn}&booked.notIn={bookedNotIn}&priceFactor.greaterThan={priceFactorGreaterThan}&priceFactor.lessThan={priceFactorLessThan}&priceFactor.greaterThanOrEqual={priceFactorGreaterThanOrEqual}&priceFactor.lessThanOrEqual={priceFactorLessThanOrEqual}&priceFactor.equals={priceFactorEquals}&priceFactor.notEquals={priceFactorNotEquals}&priceFactor.specified={priceFactorSpecified}&priceFactor.in={priceFactorIn}&priceFactor.notIn={priceFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countTripSeatsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("seatNoContains") @jakarta.annotation.Nullable String seatNoContains, @Param("seatNoDoesNotContain") @jakarta.annotation.Nullable String seatNoDoesNotContain, @Param("seatNoEquals") @jakarta.annotation.Nullable String seatNoEquals, @Param("seatNoNotEquals") @jakarta.annotation.Nullable String seatNoNotEquals, @Param("seatNoSpecified") @jakarta.annotation.Nullable Boolean seatNoSpecified, @Param("seatNoIn") @jakarta.annotation.Nullable List<String> seatNoIn, @Param("seatNoNotIn") @jakarta.annotation.Nullable List<String> seatNoNotIn, @Param("floorNoGreaterThan") @jakarta.annotation.Nullable Integer floorNoGreaterThan, @Param("floorNoLessThan") @jakarta.annotation.Nullable Integer floorNoLessThan, @Param("floorNoGreaterThanOrEqual") @jakarta.annotation.Nullable Integer floorNoGreaterThanOrEqual, @Param("floorNoLessThanOrEqual") @jakarta.annotation.Nullable Integer floorNoLessThanOrEqual, @Param("floorNoEquals") @jakarta.annotation.Nullable Integer floorNoEquals, @Param("floorNoNotEquals") @jakarta.annotation.Nullable Integer floorNoNotEquals, @Param("floorNoSpecified") @jakarta.annotation.Nullable Boolean floorNoSpecified, @Param("floorNoIn") @jakarta.annotation.Nullable List<Integer> floorNoIn, @Param("floorNoNotIn") @jakarta.annotation.Nullable List<Integer> floorNoNotIn, @Param("bookedEquals") @jakarta.annotation.Nullable Boolean bookedEquals, @Param("bookedNotEquals") @jakarta.annotation.Nullable Boolean bookedNotEquals, @Param("bookedSpecified") @jakarta.annotation.Nullable Boolean bookedSpecified, @Param("bookedIn") @jakarta.annotation.Nullable List<Boolean> bookedIn, @Param("bookedNotIn") @jakarta.annotation.Nullable List<Boolean> bookedNotIn, @Param("priceFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal priceFactorGreaterThan, @Param("priceFactorLessThan") @jakarta.annotation.Nullable BigDecimal priceFactorLessThan, @Param("priceFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceFactorGreaterThanOrEqual, @Param("priceFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceFactorLessThanOrEqual, @Param("priceFactorEquals") @jakarta.annotation.Nullable BigDecimal priceFactorEquals, @Param("priceFactorNotEquals") @jakarta.annotation.Nullable BigDecimal priceFactorNotEquals, @Param("priceFactorSpecified") @jakarta.annotation.Nullable Boolean priceFactorSpecified, @Param("priceFactorIn") @jakarta.annotation.Nullable List<BigDecimal> priceFactorIn, @Param("priceFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> priceFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("tripIdGreaterThan") @jakarta.annotation.Nullable Long tripIdGreaterThan, @Param("tripIdLessThan") @jakarta.annotation.Nullable Long tripIdLessThan, @Param("tripIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long tripIdGreaterThanOrEqual, @Param("tripIdLessThanOrEqual") @jakarta.annotation.Nullable Long tripIdLessThanOrEqual, @Param("tripIdEquals") @jakarta.annotation.Nullable Long tripIdEquals, @Param("tripIdNotEquals") @jakarta.annotation.Nullable Long tripIdNotEquals, @Param("tripIdSpecified") @jakarta.annotation.Nullable Boolean tripIdSpecified, @Param("tripIdIn") @jakarta.annotation.Nullable List<Long> tripIdIn, @Param("tripIdNotIn") @jakarta.annotation.Nullable List<Long> tripIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countTripSeats</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountTripSeatsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>idGreaterThan -  (optional)</li>
   *   <li>idLessThan -  (optional)</li>
   *   <li>idGreaterThanOrEqual -  (optional)</li>
   *   <li>idLessThanOrEqual -  (optional)</li>
   *   <li>idEquals -  (optional)</li>
   *   <li>idNotEquals -  (optional)</li>
   *   <li>idSpecified -  (optional)</li>
   *   <li>idIn -  (optional)</li>
   *   <li>idNotIn -  (optional)</li>
   *   <li>seatNoContains -  (optional)</li>
   *   <li>seatNoDoesNotContain -  (optional)</li>
   *   <li>seatNoEquals -  (optional)</li>
   *   <li>seatNoNotEquals -  (optional)</li>
   *   <li>seatNoSpecified -  (optional)</li>
   *   <li>seatNoIn -  (optional)</li>
   *   <li>seatNoNotIn -  (optional)</li>
   *   <li>floorNoGreaterThan -  (optional)</li>
   *   <li>floorNoLessThan -  (optional)</li>
   *   <li>floorNoGreaterThanOrEqual -  (optional)</li>
   *   <li>floorNoLessThanOrEqual -  (optional)</li>
   *   <li>floorNoEquals -  (optional)</li>
   *   <li>floorNoNotEquals -  (optional)</li>
   *   <li>floorNoSpecified -  (optional)</li>
   *   <li>floorNoIn -  (optional)</li>
   *   <li>floorNoNotIn -  (optional)</li>
   *   <li>bookedEquals -  (optional)</li>
   *   <li>bookedNotEquals -  (optional)</li>
   *   <li>bookedSpecified -  (optional)</li>
   *   <li>bookedIn -  (optional)</li>
   *   <li>bookedNotIn -  (optional)</li>
   *   <li>priceFactorGreaterThan -  (optional)</li>
   *   <li>priceFactorLessThan -  (optional)</li>
   *   <li>priceFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>priceFactorLessThanOrEqual -  (optional)</li>
   *   <li>priceFactorEquals -  (optional)</li>
   *   <li>priceFactorNotEquals -  (optional)</li>
   *   <li>priceFactorSpecified -  (optional)</li>
   *   <li>priceFactorIn -  (optional)</li>
   *   <li>priceFactorNotIn -  (optional)</li>
   *   <li>createdAtGreaterThan -  (optional)</li>
   *   <li>createdAtLessThan -  (optional)</li>
   *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
   *   <li>createdAtLessThanOrEqual -  (optional)</li>
   *   <li>createdAtEquals -  (optional)</li>
   *   <li>createdAtNotEquals -  (optional)</li>
   *   <li>createdAtSpecified -  (optional)</li>
   *   <li>createdAtIn -  (optional)</li>
   *   <li>createdAtNotIn -  (optional)</li>
   *   <li>updatedAtGreaterThan -  (optional)</li>
   *   <li>updatedAtLessThan -  (optional)</li>
   *   <li>updatedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>updatedAtLessThanOrEqual -  (optional)</li>
   *   <li>updatedAtEquals -  (optional)</li>
   *   <li>updatedAtNotEquals -  (optional)</li>
   *   <li>updatedAtSpecified -  (optional)</li>
   *   <li>updatedAtIn -  (optional)</li>
   *   <li>updatedAtNotIn -  (optional)</li>
   *   <li>isDeletedEquals -  (optional)</li>
   *   <li>isDeletedNotEquals -  (optional)</li>
   *   <li>isDeletedSpecified -  (optional)</li>
   *   <li>isDeletedIn -  (optional)</li>
   *   <li>isDeletedNotIn -  (optional)</li>
   *   <li>deletedAtGreaterThan -  (optional)</li>
   *   <li>deletedAtLessThan -  (optional)</li>
   *   <li>deletedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>deletedAtLessThanOrEqual -  (optional)</li>
   *   <li>deletedAtEquals -  (optional)</li>
   *   <li>deletedAtNotEquals -  (optional)</li>
   *   <li>deletedAtSpecified -  (optional)</li>
   *   <li>deletedAtIn -  (optional)</li>
   *   <li>deletedAtNotIn -  (optional)</li>
   *   <li>deletedByEquals -  (optional)</li>
   *   <li>deletedByNotEquals -  (optional)</li>
   *   <li>deletedBySpecified -  (optional)</li>
   *   <li>deletedByIn -  (optional)</li>
   *   <li>deletedByNotIn -  (optional)</li>
   *   <li>tripIdGreaterThan -  (optional)</li>
   *   <li>tripIdLessThan -  (optional)</li>
   *   <li>tripIdGreaterThanOrEqual -  (optional)</li>
   *   <li>tripIdLessThanOrEqual -  (optional)</li>
   *   <li>tripIdEquals -  (optional)</li>
   *   <li>tripIdNotEquals -  (optional)</li>
   *   <li>tripIdSpecified -  (optional)</li>
   *   <li>tripIdIn -  (optional)</li>
   *   <li>tripIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/trip-seats/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&seatNo.contains={seatNoContains}&seatNo.doesNotContain={seatNoDoesNotContain}&seatNo.equals={seatNoEquals}&seatNo.notEquals={seatNoNotEquals}&seatNo.specified={seatNoSpecified}&seatNo.in={seatNoIn}&seatNo.notIn={seatNoNotIn}&floorNo.greaterThan={floorNoGreaterThan}&floorNo.lessThan={floorNoLessThan}&floorNo.greaterThanOrEqual={floorNoGreaterThanOrEqual}&floorNo.lessThanOrEqual={floorNoLessThanOrEqual}&floorNo.equals={floorNoEquals}&floorNo.notEquals={floorNoNotEquals}&floorNo.specified={floorNoSpecified}&floorNo.in={floorNoIn}&floorNo.notIn={floorNoNotIn}&booked.equals={bookedEquals}&booked.notEquals={bookedNotEquals}&booked.specified={bookedSpecified}&booked.in={bookedIn}&booked.notIn={bookedNotIn}&priceFactor.greaterThan={priceFactorGreaterThan}&priceFactor.lessThan={priceFactorLessThan}&priceFactor.greaterThanOrEqual={priceFactorGreaterThanOrEqual}&priceFactor.lessThanOrEqual={priceFactorLessThanOrEqual}&priceFactor.equals={priceFactorEquals}&priceFactor.notEquals={priceFactorNotEquals}&priceFactor.specified={priceFactorSpecified}&priceFactor.in={priceFactorIn}&priceFactor.notIn={priceFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countTripSeats(@QueryMap(encoded=true) CountTripSeatsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countTripSeats</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>idGreaterThan -  (optional)</li>
          *   <li>idLessThan -  (optional)</li>
          *   <li>idGreaterThanOrEqual -  (optional)</li>
          *   <li>idLessThanOrEqual -  (optional)</li>
          *   <li>idEquals -  (optional)</li>
          *   <li>idNotEquals -  (optional)</li>
          *   <li>idSpecified -  (optional)</li>
          *   <li>idIn -  (optional)</li>
          *   <li>idNotIn -  (optional)</li>
          *   <li>seatNoContains -  (optional)</li>
          *   <li>seatNoDoesNotContain -  (optional)</li>
          *   <li>seatNoEquals -  (optional)</li>
          *   <li>seatNoNotEquals -  (optional)</li>
          *   <li>seatNoSpecified -  (optional)</li>
          *   <li>seatNoIn -  (optional)</li>
          *   <li>seatNoNotIn -  (optional)</li>
          *   <li>floorNoGreaterThan -  (optional)</li>
          *   <li>floorNoLessThan -  (optional)</li>
          *   <li>floorNoGreaterThanOrEqual -  (optional)</li>
          *   <li>floorNoLessThanOrEqual -  (optional)</li>
          *   <li>floorNoEquals -  (optional)</li>
          *   <li>floorNoNotEquals -  (optional)</li>
          *   <li>floorNoSpecified -  (optional)</li>
          *   <li>floorNoIn -  (optional)</li>
          *   <li>floorNoNotIn -  (optional)</li>
          *   <li>bookedEquals -  (optional)</li>
          *   <li>bookedNotEquals -  (optional)</li>
          *   <li>bookedSpecified -  (optional)</li>
          *   <li>bookedIn -  (optional)</li>
          *   <li>bookedNotIn -  (optional)</li>
          *   <li>priceFactorGreaterThan -  (optional)</li>
          *   <li>priceFactorLessThan -  (optional)</li>
          *   <li>priceFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>priceFactorLessThanOrEqual -  (optional)</li>
          *   <li>priceFactorEquals -  (optional)</li>
          *   <li>priceFactorNotEquals -  (optional)</li>
          *   <li>priceFactorSpecified -  (optional)</li>
          *   <li>priceFactorIn -  (optional)</li>
          *   <li>priceFactorNotIn -  (optional)</li>
          *   <li>createdAtGreaterThan -  (optional)</li>
          *   <li>createdAtLessThan -  (optional)</li>
          *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
          *   <li>createdAtLessThanOrEqual -  (optional)</li>
          *   <li>createdAtEquals -  (optional)</li>
          *   <li>createdAtNotEquals -  (optional)</li>
          *   <li>createdAtSpecified -  (optional)</li>
          *   <li>createdAtIn -  (optional)</li>
          *   <li>createdAtNotIn -  (optional)</li>
          *   <li>updatedAtGreaterThan -  (optional)</li>
          *   <li>updatedAtLessThan -  (optional)</li>
          *   <li>updatedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>updatedAtLessThanOrEqual -  (optional)</li>
          *   <li>updatedAtEquals -  (optional)</li>
          *   <li>updatedAtNotEquals -  (optional)</li>
          *   <li>updatedAtSpecified -  (optional)</li>
          *   <li>updatedAtIn -  (optional)</li>
          *   <li>updatedAtNotIn -  (optional)</li>
          *   <li>isDeletedEquals -  (optional)</li>
          *   <li>isDeletedNotEquals -  (optional)</li>
          *   <li>isDeletedSpecified -  (optional)</li>
          *   <li>isDeletedIn -  (optional)</li>
          *   <li>isDeletedNotIn -  (optional)</li>
          *   <li>deletedAtGreaterThan -  (optional)</li>
          *   <li>deletedAtLessThan -  (optional)</li>
          *   <li>deletedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>deletedAtLessThanOrEqual -  (optional)</li>
          *   <li>deletedAtEquals -  (optional)</li>
          *   <li>deletedAtNotEquals -  (optional)</li>
          *   <li>deletedAtSpecified -  (optional)</li>
          *   <li>deletedAtIn -  (optional)</li>
          *   <li>deletedAtNotIn -  (optional)</li>
          *   <li>deletedByEquals -  (optional)</li>
          *   <li>deletedByNotEquals -  (optional)</li>
          *   <li>deletedBySpecified -  (optional)</li>
          *   <li>deletedByIn -  (optional)</li>
          *   <li>deletedByNotIn -  (optional)</li>
          *   <li>tripIdGreaterThan -  (optional)</li>
          *   <li>tripIdLessThan -  (optional)</li>
          *   <li>tripIdGreaterThanOrEqual -  (optional)</li>
          *   <li>tripIdLessThanOrEqual -  (optional)</li>
          *   <li>tripIdEquals -  (optional)</li>
          *   <li>tripIdNotEquals -  (optional)</li>
          *   <li>tripIdSpecified -  (optional)</li>
          *   <li>tripIdIn -  (optional)</li>
          *   <li>tripIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/trip-seats/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&seatNo.contains={seatNoContains}&seatNo.doesNotContain={seatNoDoesNotContain}&seatNo.equals={seatNoEquals}&seatNo.notEquals={seatNoNotEquals}&seatNo.specified={seatNoSpecified}&seatNo.in={seatNoIn}&seatNo.notIn={seatNoNotIn}&floorNo.greaterThan={floorNoGreaterThan}&floorNo.lessThan={floorNoLessThan}&floorNo.greaterThanOrEqual={floorNoGreaterThanOrEqual}&floorNo.lessThanOrEqual={floorNoLessThanOrEqual}&floorNo.equals={floorNoEquals}&floorNo.notEquals={floorNoNotEquals}&floorNo.specified={floorNoSpecified}&floorNo.in={floorNoIn}&floorNo.notIn={floorNoNotIn}&booked.equals={bookedEquals}&booked.notEquals={bookedNotEquals}&booked.specified={bookedSpecified}&booked.in={bookedIn}&booked.notIn={bookedNotIn}&priceFactor.greaterThan={priceFactorGreaterThan}&priceFactor.lessThan={priceFactorLessThan}&priceFactor.greaterThanOrEqual={priceFactorGreaterThanOrEqual}&priceFactor.lessThanOrEqual={priceFactorLessThanOrEqual}&priceFactor.equals={priceFactorEquals}&priceFactor.notEquals={priceFactorNotEquals}&priceFactor.specified={priceFactorSpecified}&priceFactor.in={priceFactorIn}&priceFactor.notIn={priceFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countTripSeatsWithHttpInfo(@QueryMap(encoded=true) CountTripSeatsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countTripSeats</code> method in a fluent style.
   */
  public static class CountTripSeatsQueryParams extends HashMap<String, Object> {
    public CountTripSeatsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams seatNoContains(@jakarta.annotation.Nullable final String value) {
      put("seatNo.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams seatNoDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("seatNo.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams seatNoEquals(@jakarta.annotation.Nullable final String value) {
      put("seatNo.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams seatNoNotEquals(@jakarta.annotation.Nullable final String value) {
      put("seatNo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams seatNoSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatNo.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams seatNoIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatNo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams seatNoNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatNo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams floorNoGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams floorNoLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams floorNoGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams floorNoLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams floorNoEquals(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams floorNoNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams floorNoSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("floorNo.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams floorNoIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("floorNo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams floorNoNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("floorNo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams bookedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("booked.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams bookedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("booked.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams bookedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("booked.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams bookedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("booked.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams bookedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("booked.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("priceFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("priceFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams priceFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("priceFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams tripIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("tripId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams tripIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("tripId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams tripIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("tripId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams tripIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("tripId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams tripIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("tripId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams tripIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("tripId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams tripIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("tripId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountTripSeatsQueryParams tripIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("tripId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams tripIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("tripId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountTripSeatsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param tripSeatDTO  (required)
   * @return TripSeatDTO
   */
  @RequestLine("POST /api/trip-seats")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripSeatDTO createTripSeat(@jakarta.annotation.Nonnull TripSeatDTO tripSeatDTO);

  /**
   * 
   * Similar to <code>createTripSeat</code> but it also returns the http response headers .
   * 
   * @param tripSeatDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/trip-seats")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripSeatDTO> createTripSeatWithHttpInfo(@jakarta.annotation.Nonnull TripSeatDTO tripSeatDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/trip-seats/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteTripSeat(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteTripSeat</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/trip-seats/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteTripSeatWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param idGreaterThan  (optional)
   * @param idLessThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idEquals  (optional)
   * @param idNotEquals  (optional)
   * @param idSpecified  (optional)
   * @param idIn  (optional)
   * @param idNotIn  (optional)
   * @param seatNoContains  (optional)
   * @param seatNoDoesNotContain  (optional)
   * @param seatNoEquals  (optional)
   * @param seatNoNotEquals  (optional)
   * @param seatNoSpecified  (optional)
   * @param seatNoIn  (optional)
   * @param seatNoNotIn  (optional)
   * @param floorNoGreaterThan  (optional)
   * @param floorNoLessThan  (optional)
   * @param floorNoGreaterThanOrEqual  (optional)
   * @param floorNoLessThanOrEqual  (optional)
   * @param floorNoEquals  (optional)
   * @param floorNoNotEquals  (optional)
   * @param floorNoSpecified  (optional)
   * @param floorNoIn  (optional)
   * @param floorNoNotIn  (optional)
   * @param bookedEquals  (optional)
   * @param bookedNotEquals  (optional)
   * @param bookedSpecified  (optional)
   * @param bookedIn  (optional)
   * @param bookedNotIn  (optional)
   * @param priceFactorGreaterThan  (optional)
   * @param priceFactorLessThan  (optional)
   * @param priceFactorGreaterThanOrEqual  (optional)
   * @param priceFactorLessThanOrEqual  (optional)
   * @param priceFactorEquals  (optional)
   * @param priceFactorNotEquals  (optional)
   * @param priceFactorSpecified  (optional)
   * @param priceFactorIn  (optional)
   * @param priceFactorNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param updatedAtGreaterThan  (optional)
   * @param updatedAtLessThan  (optional)
   * @param updatedAtGreaterThanOrEqual  (optional)
   * @param updatedAtLessThanOrEqual  (optional)
   * @param updatedAtEquals  (optional)
   * @param updatedAtNotEquals  (optional)
   * @param updatedAtSpecified  (optional)
   * @param updatedAtIn  (optional)
   * @param updatedAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedAtGreaterThan  (optional)
   * @param deletedAtLessThan  (optional)
   * @param deletedAtGreaterThanOrEqual  (optional)
   * @param deletedAtLessThanOrEqual  (optional)
   * @param deletedAtEquals  (optional)
   * @param deletedAtNotEquals  (optional)
   * @param deletedAtSpecified  (optional)
   * @param deletedAtIn  (optional)
   * @param deletedAtNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param tripIdGreaterThan  (optional)
   * @param tripIdLessThan  (optional)
   * @param tripIdGreaterThanOrEqual  (optional)
   * @param tripIdLessThanOrEqual  (optional)
   * @param tripIdEquals  (optional)
   * @param tripIdNotEquals  (optional)
   * @param tripIdSpecified  (optional)
   * @param tripIdIn  (optional)
   * @param tripIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;TripSeatDTO&gt;
   */
  @RequestLine("GET /api/trip-seats?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&seatNo.contains={seatNoContains}&seatNo.doesNotContain={seatNoDoesNotContain}&seatNo.equals={seatNoEquals}&seatNo.notEquals={seatNoNotEquals}&seatNo.specified={seatNoSpecified}&seatNo.in={seatNoIn}&seatNo.notIn={seatNoNotIn}&floorNo.greaterThan={floorNoGreaterThan}&floorNo.lessThan={floorNoLessThan}&floorNo.greaterThanOrEqual={floorNoGreaterThanOrEqual}&floorNo.lessThanOrEqual={floorNoLessThanOrEqual}&floorNo.equals={floorNoEquals}&floorNo.notEquals={floorNoNotEquals}&floorNo.specified={floorNoSpecified}&floorNo.in={floorNoIn}&floorNo.notIn={floorNoNotIn}&booked.equals={bookedEquals}&booked.notEquals={bookedNotEquals}&booked.specified={bookedSpecified}&booked.in={bookedIn}&booked.notIn={bookedNotIn}&priceFactor.greaterThan={priceFactorGreaterThan}&priceFactor.lessThan={priceFactorLessThan}&priceFactor.greaterThanOrEqual={priceFactorGreaterThanOrEqual}&priceFactor.lessThanOrEqual={priceFactorLessThanOrEqual}&priceFactor.equals={priceFactorEquals}&priceFactor.notEquals={priceFactorNotEquals}&priceFactor.specified={priceFactorSpecified}&priceFactor.in={priceFactorIn}&priceFactor.notIn={priceFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<TripSeatDTO> getAllTripSeats(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("seatNoContains") @jakarta.annotation.Nullable String seatNoContains, @Param("seatNoDoesNotContain") @jakarta.annotation.Nullable String seatNoDoesNotContain, @Param("seatNoEquals") @jakarta.annotation.Nullable String seatNoEquals, @Param("seatNoNotEquals") @jakarta.annotation.Nullable String seatNoNotEquals, @Param("seatNoSpecified") @jakarta.annotation.Nullable Boolean seatNoSpecified, @Param("seatNoIn") @jakarta.annotation.Nullable List<String> seatNoIn, @Param("seatNoNotIn") @jakarta.annotation.Nullable List<String> seatNoNotIn, @Param("floorNoGreaterThan") @jakarta.annotation.Nullable Integer floorNoGreaterThan, @Param("floorNoLessThan") @jakarta.annotation.Nullable Integer floorNoLessThan, @Param("floorNoGreaterThanOrEqual") @jakarta.annotation.Nullable Integer floorNoGreaterThanOrEqual, @Param("floorNoLessThanOrEqual") @jakarta.annotation.Nullable Integer floorNoLessThanOrEqual, @Param("floorNoEquals") @jakarta.annotation.Nullable Integer floorNoEquals, @Param("floorNoNotEquals") @jakarta.annotation.Nullable Integer floorNoNotEquals, @Param("floorNoSpecified") @jakarta.annotation.Nullable Boolean floorNoSpecified, @Param("floorNoIn") @jakarta.annotation.Nullable List<Integer> floorNoIn, @Param("floorNoNotIn") @jakarta.annotation.Nullable List<Integer> floorNoNotIn, @Param("bookedEquals") @jakarta.annotation.Nullable Boolean bookedEquals, @Param("bookedNotEquals") @jakarta.annotation.Nullable Boolean bookedNotEquals, @Param("bookedSpecified") @jakarta.annotation.Nullable Boolean bookedSpecified, @Param("bookedIn") @jakarta.annotation.Nullable List<Boolean> bookedIn, @Param("bookedNotIn") @jakarta.annotation.Nullable List<Boolean> bookedNotIn, @Param("priceFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal priceFactorGreaterThan, @Param("priceFactorLessThan") @jakarta.annotation.Nullable BigDecimal priceFactorLessThan, @Param("priceFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceFactorGreaterThanOrEqual, @Param("priceFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceFactorLessThanOrEqual, @Param("priceFactorEquals") @jakarta.annotation.Nullable BigDecimal priceFactorEquals, @Param("priceFactorNotEquals") @jakarta.annotation.Nullable BigDecimal priceFactorNotEquals, @Param("priceFactorSpecified") @jakarta.annotation.Nullable Boolean priceFactorSpecified, @Param("priceFactorIn") @jakarta.annotation.Nullable List<BigDecimal> priceFactorIn, @Param("priceFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> priceFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("tripIdGreaterThan") @jakarta.annotation.Nullable Long tripIdGreaterThan, @Param("tripIdLessThan") @jakarta.annotation.Nullable Long tripIdLessThan, @Param("tripIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long tripIdGreaterThanOrEqual, @Param("tripIdLessThanOrEqual") @jakarta.annotation.Nullable Long tripIdLessThanOrEqual, @Param("tripIdEquals") @jakarta.annotation.Nullable Long tripIdEquals, @Param("tripIdNotEquals") @jakarta.annotation.Nullable Long tripIdNotEquals, @Param("tripIdSpecified") @jakarta.annotation.Nullable Boolean tripIdSpecified, @Param("tripIdIn") @jakarta.annotation.Nullable List<Long> tripIdIn, @Param("tripIdNotIn") @jakarta.annotation.Nullable List<Long> tripIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllTripSeats</code> but it also returns the http response headers .
   * 
   * @param idGreaterThan  (optional)
   * @param idLessThan  (optional)
   * @param idGreaterThanOrEqual  (optional)
   * @param idLessThanOrEqual  (optional)
   * @param idEquals  (optional)
   * @param idNotEquals  (optional)
   * @param idSpecified  (optional)
   * @param idIn  (optional)
   * @param idNotIn  (optional)
   * @param seatNoContains  (optional)
   * @param seatNoDoesNotContain  (optional)
   * @param seatNoEquals  (optional)
   * @param seatNoNotEquals  (optional)
   * @param seatNoSpecified  (optional)
   * @param seatNoIn  (optional)
   * @param seatNoNotIn  (optional)
   * @param floorNoGreaterThan  (optional)
   * @param floorNoLessThan  (optional)
   * @param floorNoGreaterThanOrEqual  (optional)
   * @param floorNoLessThanOrEqual  (optional)
   * @param floorNoEquals  (optional)
   * @param floorNoNotEquals  (optional)
   * @param floorNoSpecified  (optional)
   * @param floorNoIn  (optional)
   * @param floorNoNotIn  (optional)
   * @param bookedEquals  (optional)
   * @param bookedNotEquals  (optional)
   * @param bookedSpecified  (optional)
   * @param bookedIn  (optional)
   * @param bookedNotIn  (optional)
   * @param priceFactorGreaterThan  (optional)
   * @param priceFactorLessThan  (optional)
   * @param priceFactorGreaterThanOrEqual  (optional)
   * @param priceFactorLessThanOrEqual  (optional)
   * @param priceFactorEquals  (optional)
   * @param priceFactorNotEquals  (optional)
   * @param priceFactorSpecified  (optional)
   * @param priceFactorIn  (optional)
   * @param priceFactorNotIn  (optional)
   * @param createdAtGreaterThan  (optional)
   * @param createdAtLessThan  (optional)
   * @param createdAtGreaterThanOrEqual  (optional)
   * @param createdAtLessThanOrEqual  (optional)
   * @param createdAtEquals  (optional)
   * @param createdAtNotEquals  (optional)
   * @param createdAtSpecified  (optional)
   * @param createdAtIn  (optional)
   * @param createdAtNotIn  (optional)
   * @param updatedAtGreaterThan  (optional)
   * @param updatedAtLessThan  (optional)
   * @param updatedAtGreaterThanOrEqual  (optional)
   * @param updatedAtLessThanOrEqual  (optional)
   * @param updatedAtEquals  (optional)
   * @param updatedAtNotEquals  (optional)
   * @param updatedAtSpecified  (optional)
   * @param updatedAtIn  (optional)
   * @param updatedAtNotIn  (optional)
   * @param isDeletedEquals  (optional)
   * @param isDeletedNotEquals  (optional)
   * @param isDeletedSpecified  (optional)
   * @param isDeletedIn  (optional)
   * @param isDeletedNotIn  (optional)
   * @param deletedAtGreaterThan  (optional)
   * @param deletedAtLessThan  (optional)
   * @param deletedAtGreaterThanOrEqual  (optional)
   * @param deletedAtLessThanOrEqual  (optional)
   * @param deletedAtEquals  (optional)
   * @param deletedAtNotEquals  (optional)
   * @param deletedAtSpecified  (optional)
   * @param deletedAtIn  (optional)
   * @param deletedAtNotIn  (optional)
   * @param deletedByEquals  (optional)
   * @param deletedByNotEquals  (optional)
   * @param deletedBySpecified  (optional)
   * @param deletedByIn  (optional)
   * @param deletedByNotIn  (optional)
   * @param tripIdGreaterThan  (optional)
   * @param tripIdLessThan  (optional)
   * @param tripIdGreaterThanOrEqual  (optional)
   * @param tripIdLessThanOrEqual  (optional)
   * @param tripIdEquals  (optional)
   * @param tripIdNotEquals  (optional)
   * @param tripIdSpecified  (optional)
   * @param tripIdIn  (optional)
   * @param tripIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trip-seats?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&seatNo.contains={seatNoContains}&seatNo.doesNotContain={seatNoDoesNotContain}&seatNo.equals={seatNoEquals}&seatNo.notEquals={seatNoNotEquals}&seatNo.specified={seatNoSpecified}&seatNo.in={seatNoIn}&seatNo.notIn={seatNoNotIn}&floorNo.greaterThan={floorNoGreaterThan}&floorNo.lessThan={floorNoLessThan}&floorNo.greaterThanOrEqual={floorNoGreaterThanOrEqual}&floorNo.lessThanOrEqual={floorNoLessThanOrEqual}&floorNo.equals={floorNoEquals}&floorNo.notEquals={floorNoNotEquals}&floorNo.specified={floorNoSpecified}&floorNo.in={floorNoIn}&floorNo.notIn={floorNoNotIn}&booked.equals={bookedEquals}&booked.notEquals={bookedNotEquals}&booked.specified={bookedSpecified}&booked.in={bookedIn}&booked.notIn={bookedNotIn}&priceFactor.greaterThan={priceFactorGreaterThan}&priceFactor.lessThan={priceFactorLessThan}&priceFactor.greaterThanOrEqual={priceFactorGreaterThanOrEqual}&priceFactor.lessThanOrEqual={priceFactorLessThanOrEqual}&priceFactor.equals={priceFactorEquals}&priceFactor.notEquals={priceFactorNotEquals}&priceFactor.specified={priceFactorSpecified}&priceFactor.in={priceFactorIn}&priceFactor.notIn={priceFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<TripSeatDTO>> getAllTripSeatsWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("seatNoContains") @jakarta.annotation.Nullable String seatNoContains, @Param("seatNoDoesNotContain") @jakarta.annotation.Nullable String seatNoDoesNotContain, @Param("seatNoEquals") @jakarta.annotation.Nullable String seatNoEquals, @Param("seatNoNotEquals") @jakarta.annotation.Nullable String seatNoNotEquals, @Param("seatNoSpecified") @jakarta.annotation.Nullable Boolean seatNoSpecified, @Param("seatNoIn") @jakarta.annotation.Nullable List<String> seatNoIn, @Param("seatNoNotIn") @jakarta.annotation.Nullable List<String> seatNoNotIn, @Param("floorNoGreaterThan") @jakarta.annotation.Nullable Integer floorNoGreaterThan, @Param("floorNoLessThan") @jakarta.annotation.Nullable Integer floorNoLessThan, @Param("floorNoGreaterThanOrEqual") @jakarta.annotation.Nullable Integer floorNoGreaterThanOrEqual, @Param("floorNoLessThanOrEqual") @jakarta.annotation.Nullable Integer floorNoLessThanOrEqual, @Param("floorNoEquals") @jakarta.annotation.Nullable Integer floorNoEquals, @Param("floorNoNotEquals") @jakarta.annotation.Nullable Integer floorNoNotEquals, @Param("floorNoSpecified") @jakarta.annotation.Nullable Boolean floorNoSpecified, @Param("floorNoIn") @jakarta.annotation.Nullable List<Integer> floorNoIn, @Param("floorNoNotIn") @jakarta.annotation.Nullable List<Integer> floorNoNotIn, @Param("bookedEquals") @jakarta.annotation.Nullable Boolean bookedEquals, @Param("bookedNotEquals") @jakarta.annotation.Nullable Boolean bookedNotEquals, @Param("bookedSpecified") @jakarta.annotation.Nullable Boolean bookedSpecified, @Param("bookedIn") @jakarta.annotation.Nullable List<Boolean> bookedIn, @Param("bookedNotIn") @jakarta.annotation.Nullable List<Boolean> bookedNotIn, @Param("priceFactorGreaterThan") @jakarta.annotation.Nullable BigDecimal priceFactorGreaterThan, @Param("priceFactorLessThan") @jakarta.annotation.Nullable BigDecimal priceFactorLessThan, @Param("priceFactorGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceFactorGreaterThanOrEqual, @Param("priceFactorLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal priceFactorLessThanOrEqual, @Param("priceFactorEquals") @jakarta.annotation.Nullable BigDecimal priceFactorEquals, @Param("priceFactorNotEquals") @jakarta.annotation.Nullable BigDecimal priceFactorNotEquals, @Param("priceFactorSpecified") @jakarta.annotation.Nullable Boolean priceFactorSpecified, @Param("priceFactorIn") @jakarta.annotation.Nullable List<BigDecimal> priceFactorIn, @Param("priceFactorNotIn") @jakarta.annotation.Nullable List<BigDecimal> priceFactorNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("tripIdGreaterThan") @jakarta.annotation.Nullable Long tripIdGreaterThan, @Param("tripIdLessThan") @jakarta.annotation.Nullable Long tripIdLessThan, @Param("tripIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long tripIdGreaterThanOrEqual, @Param("tripIdLessThanOrEqual") @jakarta.annotation.Nullable Long tripIdLessThanOrEqual, @Param("tripIdEquals") @jakarta.annotation.Nullable Long tripIdEquals, @Param("tripIdNotEquals") @jakarta.annotation.Nullable Long tripIdNotEquals, @Param("tripIdSpecified") @jakarta.annotation.Nullable Boolean tripIdSpecified, @Param("tripIdIn") @jakarta.annotation.Nullable List<Long> tripIdIn, @Param("tripIdNotIn") @jakarta.annotation.Nullable List<Long> tripIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllTripSeats</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllTripSeatsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>idGreaterThan -  (optional)</li>
   *   <li>idLessThan -  (optional)</li>
   *   <li>idGreaterThanOrEqual -  (optional)</li>
   *   <li>idLessThanOrEqual -  (optional)</li>
   *   <li>idEquals -  (optional)</li>
   *   <li>idNotEquals -  (optional)</li>
   *   <li>idSpecified -  (optional)</li>
   *   <li>idIn -  (optional)</li>
   *   <li>idNotIn -  (optional)</li>
   *   <li>seatNoContains -  (optional)</li>
   *   <li>seatNoDoesNotContain -  (optional)</li>
   *   <li>seatNoEquals -  (optional)</li>
   *   <li>seatNoNotEquals -  (optional)</li>
   *   <li>seatNoSpecified -  (optional)</li>
   *   <li>seatNoIn -  (optional)</li>
   *   <li>seatNoNotIn -  (optional)</li>
   *   <li>floorNoGreaterThan -  (optional)</li>
   *   <li>floorNoLessThan -  (optional)</li>
   *   <li>floorNoGreaterThanOrEqual -  (optional)</li>
   *   <li>floorNoLessThanOrEqual -  (optional)</li>
   *   <li>floorNoEquals -  (optional)</li>
   *   <li>floorNoNotEquals -  (optional)</li>
   *   <li>floorNoSpecified -  (optional)</li>
   *   <li>floorNoIn -  (optional)</li>
   *   <li>floorNoNotIn -  (optional)</li>
   *   <li>bookedEquals -  (optional)</li>
   *   <li>bookedNotEquals -  (optional)</li>
   *   <li>bookedSpecified -  (optional)</li>
   *   <li>bookedIn -  (optional)</li>
   *   <li>bookedNotIn -  (optional)</li>
   *   <li>priceFactorGreaterThan -  (optional)</li>
   *   <li>priceFactorLessThan -  (optional)</li>
   *   <li>priceFactorGreaterThanOrEqual -  (optional)</li>
   *   <li>priceFactorLessThanOrEqual -  (optional)</li>
   *   <li>priceFactorEquals -  (optional)</li>
   *   <li>priceFactorNotEquals -  (optional)</li>
   *   <li>priceFactorSpecified -  (optional)</li>
   *   <li>priceFactorIn -  (optional)</li>
   *   <li>priceFactorNotIn -  (optional)</li>
   *   <li>createdAtGreaterThan -  (optional)</li>
   *   <li>createdAtLessThan -  (optional)</li>
   *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
   *   <li>createdAtLessThanOrEqual -  (optional)</li>
   *   <li>createdAtEquals -  (optional)</li>
   *   <li>createdAtNotEquals -  (optional)</li>
   *   <li>createdAtSpecified -  (optional)</li>
   *   <li>createdAtIn -  (optional)</li>
   *   <li>createdAtNotIn -  (optional)</li>
   *   <li>updatedAtGreaterThan -  (optional)</li>
   *   <li>updatedAtLessThan -  (optional)</li>
   *   <li>updatedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>updatedAtLessThanOrEqual -  (optional)</li>
   *   <li>updatedAtEquals -  (optional)</li>
   *   <li>updatedAtNotEquals -  (optional)</li>
   *   <li>updatedAtSpecified -  (optional)</li>
   *   <li>updatedAtIn -  (optional)</li>
   *   <li>updatedAtNotIn -  (optional)</li>
   *   <li>isDeletedEquals -  (optional)</li>
   *   <li>isDeletedNotEquals -  (optional)</li>
   *   <li>isDeletedSpecified -  (optional)</li>
   *   <li>isDeletedIn -  (optional)</li>
   *   <li>isDeletedNotIn -  (optional)</li>
   *   <li>deletedAtGreaterThan -  (optional)</li>
   *   <li>deletedAtLessThan -  (optional)</li>
   *   <li>deletedAtGreaterThanOrEqual -  (optional)</li>
   *   <li>deletedAtLessThanOrEqual -  (optional)</li>
   *   <li>deletedAtEquals -  (optional)</li>
   *   <li>deletedAtNotEquals -  (optional)</li>
   *   <li>deletedAtSpecified -  (optional)</li>
   *   <li>deletedAtIn -  (optional)</li>
   *   <li>deletedAtNotIn -  (optional)</li>
   *   <li>deletedByEquals -  (optional)</li>
   *   <li>deletedByNotEquals -  (optional)</li>
   *   <li>deletedBySpecified -  (optional)</li>
   *   <li>deletedByIn -  (optional)</li>
   *   <li>deletedByNotIn -  (optional)</li>
   *   <li>tripIdGreaterThan -  (optional)</li>
   *   <li>tripIdLessThan -  (optional)</li>
   *   <li>tripIdGreaterThanOrEqual -  (optional)</li>
   *   <li>tripIdLessThanOrEqual -  (optional)</li>
   *   <li>tripIdEquals -  (optional)</li>
   *   <li>tripIdNotEquals -  (optional)</li>
   *   <li>tripIdSpecified -  (optional)</li>
   *   <li>tripIdIn -  (optional)</li>
   *   <li>tripIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;TripSeatDTO&gt;
   */
  @RequestLine("GET /api/trip-seats?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&seatNo.contains={seatNoContains}&seatNo.doesNotContain={seatNoDoesNotContain}&seatNo.equals={seatNoEquals}&seatNo.notEquals={seatNoNotEquals}&seatNo.specified={seatNoSpecified}&seatNo.in={seatNoIn}&seatNo.notIn={seatNoNotIn}&floorNo.greaterThan={floorNoGreaterThan}&floorNo.lessThan={floorNoLessThan}&floorNo.greaterThanOrEqual={floorNoGreaterThanOrEqual}&floorNo.lessThanOrEqual={floorNoLessThanOrEqual}&floorNo.equals={floorNoEquals}&floorNo.notEquals={floorNoNotEquals}&floorNo.specified={floorNoSpecified}&floorNo.in={floorNoIn}&floorNo.notIn={floorNoNotIn}&booked.equals={bookedEquals}&booked.notEquals={bookedNotEquals}&booked.specified={bookedSpecified}&booked.in={bookedIn}&booked.notIn={bookedNotIn}&priceFactor.greaterThan={priceFactorGreaterThan}&priceFactor.lessThan={priceFactorLessThan}&priceFactor.greaterThanOrEqual={priceFactorGreaterThanOrEqual}&priceFactor.lessThanOrEqual={priceFactorLessThanOrEqual}&priceFactor.equals={priceFactorEquals}&priceFactor.notEquals={priceFactorNotEquals}&priceFactor.specified={priceFactorSpecified}&priceFactor.in={priceFactorIn}&priceFactor.notIn={priceFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<TripSeatDTO> getAllTripSeats(@QueryMap(encoded=true) GetAllTripSeatsQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllTripSeats</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>idGreaterThan -  (optional)</li>
          *   <li>idLessThan -  (optional)</li>
          *   <li>idGreaterThanOrEqual -  (optional)</li>
          *   <li>idLessThanOrEqual -  (optional)</li>
          *   <li>idEquals -  (optional)</li>
          *   <li>idNotEquals -  (optional)</li>
          *   <li>idSpecified -  (optional)</li>
          *   <li>idIn -  (optional)</li>
          *   <li>idNotIn -  (optional)</li>
          *   <li>seatNoContains -  (optional)</li>
          *   <li>seatNoDoesNotContain -  (optional)</li>
          *   <li>seatNoEquals -  (optional)</li>
          *   <li>seatNoNotEquals -  (optional)</li>
          *   <li>seatNoSpecified -  (optional)</li>
          *   <li>seatNoIn -  (optional)</li>
          *   <li>seatNoNotIn -  (optional)</li>
          *   <li>floorNoGreaterThan -  (optional)</li>
          *   <li>floorNoLessThan -  (optional)</li>
          *   <li>floorNoGreaterThanOrEqual -  (optional)</li>
          *   <li>floorNoLessThanOrEqual -  (optional)</li>
          *   <li>floorNoEquals -  (optional)</li>
          *   <li>floorNoNotEquals -  (optional)</li>
          *   <li>floorNoSpecified -  (optional)</li>
          *   <li>floorNoIn -  (optional)</li>
          *   <li>floorNoNotIn -  (optional)</li>
          *   <li>bookedEquals -  (optional)</li>
          *   <li>bookedNotEquals -  (optional)</li>
          *   <li>bookedSpecified -  (optional)</li>
          *   <li>bookedIn -  (optional)</li>
          *   <li>bookedNotIn -  (optional)</li>
          *   <li>priceFactorGreaterThan -  (optional)</li>
          *   <li>priceFactorLessThan -  (optional)</li>
          *   <li>priceFactorGreaterThanOrEqual -  (optional)</li>
          *   <li>priceFactorLessThanOrEqual -  (optional)</li>
          *   <li>priceFactorEquals -  (optional)</li>
          *   <li>priceFactorNotEquals -  (optional)</li>
          *   <li>priceFactorSpecified -  (optional)</li>
          *   <li>priceFactorIn -  (optional)</li>
          *   <li>priceFactorNotIn -  (optional)</li>
          *   <li>createdAtGreaterThan -  (optional)</li>
          *   <li>createdAtLessThan -  (optional)</li>
          *   <li>createdAtGreaterThanOrEqual -  (optional)</li>
          *   <li>createdAtLessThanOrEqual -  (optional)</li>
          *   <li>createdAtEquals -  (optional)</li>
          *   <li>createdAtNotEquals -  (optional)</li>
          *   <li>createdAtSpecified -  (optional)</li>
          *   <li>createdAtIn -  (optional)</li>
          *   <li>createdAtNotIn -  (optional)</li>
          *   <li>updatedAtGreaterThan -  (optional)</li>
          *   <li>updatedAtLessThan -  (optional)</li>
          *   <li>updatedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>updatedAtLessThanOrEqual -  (optional)</li>
          *   <li>updatedAtEquals -  (optional)</li>
          *   <li>updatedAtNotEquals -  (optional)</li>
          *   <li>updatedAtSpecified -  (optional)</li>
          *   <li>updatedAtIn -  (optional)</li>
          *   <li>updatedAtNotIn -  (optional)</li>
          *   <li>isDeletedEquals -  (optional)</li>
          *   <li>isDeletedNotEquals -  (optional)</li>
          *   <li>isDeletedSpecified -  (optional)</li>
          *   <li>isDeletedIn -  (optional)</li>
          *   <li>isDeletedNotIn -  (optional)</li>
          *   <li>deletedAtGreaterThan -  (optional)</li>
          *   <li>deletedAtLessThan -  (optional)</li>
          *   <li>deletedAtGreaterThanOrEqual -  (optional)</li>
          *   <li>deletedAtLessThanOrEqual -  (optional)</li>
          *   <li>deletedAtEquals -  (optional)</li>
          *   <li>deletedAtNotEquals -  (optional)</li>
          *   <li>deletedAtSpecified -  (optional)</li>
          *   <li>deletedAtIn -  (optional)</li>
          *   <li>deletedAtNotIn -  (optional)</li>
          *   <li>deletedByEquals -  (optional)</li>
          *   <li>deletedByNotEquals -  (optional)</li>
          *   <li>deletedBySpecified -  (optional)</li>
          *   <li>deletedByIn -  (optional)</li>
          *   <li>deletedByNotIn -  (optional)</li>
          *   <li>tripIdGreaterThan -  (optional)</li>
          *   <li>tripIdLessThan -  (optional)</li>
          *   <li>tripIdGreaterThanOrEqual -  (optional)</li>
          *   <li>tripIdLessThanOrEqual -  (optional)</li>
          *   <li>tripIdEquals -  (optional)</li>
          *   <li>tripIdNotEquals -  (optional)</li>
          *   <li>tripIdSpecified -  (optional)</li>
          *   <li>tripIdIn -  (optional)</li>
          *   <li>tripIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;TripSeatDTO&gt;
      */
      @RequestLine("GET /api/trip-seats?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&seatNo.contains={seatNoContains}&seatNo.doesNotContain={seatNoDoesNotContain}&seatNo.equals={seatNoEquals}&seatNo.notEquals={seatNoNotEquals}&seatNo.specified={seatNoSpecified}&seatNo.in={seatNoIn}&seatNo.notIn={seatNoNotIn}&floorNo.greaterThan={floorNoGreaterThan}&floorNo.lessThan={floorNoLessThan}&floorNo.greaterThanOrEqual={floorNoGreaterThanOrEqual}&floorNo.lessThanOrEqual={floorNoLessThanOrEqual}&floorNo.equals={floorNoEquals}&floorNo.notEquals={floorNoNotEquals}&floorNo.specified={floorNoSpecified}&floorNo.in={floorNoIn}&floorNo.notIn={floorNoNotIn}&booked.equals={bookedEquals}&booked.notEquals={bookedNotEquals}&booked.specified={bookedSpecified}&booked.in={bookedIn}&booked.notIn={bookedNotIn}&priceFactor.greaterThan={priceFactorGreaterThan}&priceFactor.lessThan={priceFactorLessThan}&priceFactor.greaterThanOrEqual={priceFactorGreaterThanOrEqual}&priceFactor.lessThanOrEqual={priceFactorLessThanOrEqual}&priceFactor.equals={priceFactorEquals}&priceFactor.notEquals={priceFactorNotEquals}&priceFactor.specified={priceFactorSpecified}&priceFactor.in={priceFactorIn}&priceFactor.notIn={priceFactorNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&tripId.greaterThan={tripIdGreaterThan}&tripId.lessThan={tripIdLessThan}&tripId.greaterThanOrEqual={tripIdGreaterThanOrEqual}&tripId.lessThanOrEqual={tripIdLessThanOrEqual}&tripId.equals={tripIdEquals}&tripId.notEquals={tripIdNotEquals}&tripId.specified={tripIdSpecified}&tripId.in={tripIdIn}&tripId.notIn={tripIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<TripSeatDTO>> getAllTripSeatsWithHttpInfo(@QueryMap(encoded=true) GetAllTripSeatsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllTripSeats</code> method in a fluent style.
   */
  public static class GetAllTripSeatsQueryParams extends HashMap<String, Object> {
    public GetAllTripSeatsQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams seatNoContains(@jakarta.annotation.Nullable final String value) {
      put("seatNo.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams seatNoDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("seatNo.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams seatNoEquals(@jakarta.annotation.Nullable final String value) {
      put("seatNo.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams seatNoNotEquals(@jakarta.annotation.Nullable final String value) {
      put("seatNo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams seatNoSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("seatNo.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams seatNoIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatNo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams seatNoNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("seatNo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoGreaterThan(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoLessThan(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoGreaterThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoLessThanOrEqual(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoEquals(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoNotEquals(@jakarta.annotation.Nullable final Integer value) {
      put("floorNo.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("floorNo.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("floorNo.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams floorNoNotIn(@jakarta.annotation.Nullable final List<Integer> value) {
      put("floorNo.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams bookedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("booked.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams bookedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("booked.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams bookedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("booked.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams bookedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("booked.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams bookedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("booked.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("priceFactor.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("priceFactor.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("priceFactor.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams priceFactorNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("priceFactor.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("tripId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("tripId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("tripId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("tripId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("tripId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("tripId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("tripId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("tripId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams tripIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("tripId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllTripSeatsQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return TripSeatDTO
   */
  @RequestLine("GET /api/trip-seats/{id}")
  @Headers({
    "Accept: */*",
  })
  TripSeatDTO getTripSeat(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getTripSeat</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/trip-seats/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<TripSeatDTO> getTripSeatWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param tripSeatDTO  (required)
   * @return TripSeatDTO
   */
  @RequestLine("PATCH /api/trip-seats/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripSeatDTO partialUpdateTripSeat(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripSeatDTO tripSeatDTO);

  /**
   * 
   * Similar to <code>partialUpdateTripSeat</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param tripSeatDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/trip-seats/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripSeatDTO> partialUpdateTripSeatWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripSeatDTO tripSeatDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param tripSeatDTO  (required)
   * @return TripSeatDTO
   */
  @RequestLine("PUT /api/trip-seats/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  TripSeatDTO updateTripSeat(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripSeatDTO tripSeatDTO);

  /**
   * 
   * Similar to <code>updateTripSeat</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param tripSeatDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/trip-seats/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<TripSeatDTO> updateTripSeatWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull TripSeatDTO tripSeatDTO);


}
