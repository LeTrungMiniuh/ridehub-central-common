package com.ridehub.msroute.client.api;

import com.ridehub.msroute.client.invoker.ApiClient;
import com.ridehub.msroute.client.invoker.EncodingUtils;
import com.ridehub.msroute.client.model.ApiResponse;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.ridehub.msroute.client.model.RouteDTO;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface RouteResourceMsrouteApi extends ApiClient.Api {


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
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param distanceKmGreaterThan  (optional)
   * @param distanceKmLessThan  (optional)
   * @param distanceKmGreaterThanOrEqual  (optional)
   * @param distanceKmLessThanOrEqual  (optional)
   * @param distanceKmEquals  (optional)
   * @param distanceKmNotEquals  (optional)
   * @param distanceKmSpecified  (optional)
   * @param distanceKmIn  (optional)
   * @param distanceKmNotIn  (optional)
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
   * @param originIdGreaterThan  (optional)
   * @param originIdLessThan  (optional)
   * @param originIdGreaterThanOrEqual  (optional)
   * @param originIdLessThanOrEqual  (optional)
   * @param originIdEquals  (optional)
   * @param originIdNotEquals  (optional)
   * @param originIdSpecified  (optional)
   * @param originIdIn  (optional)
   * @param originIdNotIn  (optional)
   * @param destinationIdGreaterThan  (optional)
   * @param destinationIdLessThan  (optional)
   * @param destinationIdGreaterThanOrEqual  (optional)
   * @param destinationIdLessThanOrEqual  (optional)
   * @param destinationIdEquals  (optional)
   * @param destinationIdNotEquals  (optional)
   * @param destinationIdSpecified  (optional)
   * @param destinationIdIn  (optional)
   * @param destinationIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/routes/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&distanceKm.greaterThan={distanceKmGreaterThan}&distanceKm.lessThan={distanceKmLessThan}&distanceKm.greaterThanOrEqual={distanceKmGreaterThanOrEqual}&distanceKm.lessThanOrEqual={distanceKmLessThanOrEqual}&distanceKm.equals={distanceKmEquals}&distanceKm.notEquals={distanceKmNotEquals}&distanceKm.specified={distanceKmSpecified}&distanceKm.in={distanceKmIn}&distanceKm.notIn={distanceKmNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originId.greaterThan={originIdGreaterThan}&originId.lessThan={originIdLessThan}&originId.greaterThanOrEqual={originIdGreaterThanOrEqual}&originId.lessThanOrEqual={originIdLessThanOrEqual}&originId.equals={originIdEquals}&originId.notEquals={originIdNotEquals}&originId.specified={originIdSpecified}&originId.in={originIdIn}&originId.notIn={originIdNotIn}&destinationId.greaterThan={destinationIdGreaterThan}&destinationId.lessThan={destinationIdLessThan}&destinationId.greaterThanOrEqual={destinationIdGreaterThanOrEqual}&destinationId.lessThanOrEqual={destinationIdLessThanOrEqual}&destinationId.equals={destinationIdEquals}&destinationId.notEquals={destinationIdNotEquals}&destinationId.specified={destinationIdSpecified}&destinationId.in={destinationIdIn}&destinationId.notIn={destinationIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countRoutes(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("distanceKmGreaterThan") @jakarta.annotation.Nullable BigDecimal distanceKmGreaterThan, @Param("distanceKmLessThan") @jakarta.annotation.Nullable BigDecimal distanceKmLessThan, @Param("distanceKmGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal distanceKmGreaterThanOrEqual, @Param("distanceKmLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal distanceKmLessThanOrEqual, @Param("distanceKmEquals") @jakarta.annotation.Nullable BigDecimal distanceKmEquals, @Param("distanceKmNotEquals") @jakarta.annotation.Nullable BigDecimal distanceKmNotEquals, @Param("distanceKmSpecified") @jakarta.annotation.Nullable Boolean distanceKmSpecified, @Param("distanceKmIn") @jakarta.annotation.Nullable List<BigDecimal> distanceKmIn, @Param("distanceKmNotIn") @jakarta.annotation.Nullable List<BigDecimal> distanceKmNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("originIdGreaterThan") @jakarta.annotation.Nullable Long originIdGreaterThan, @Param("originIdLessThan") @jakarta.annotation.Nullable Long originIdLessThan, @Param("originIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long originIdGreaterThanOrEqual, @Param("originIdLessThanOrEqual") @jakarta.annotation.Nullable Long originIdLessThanOrEqual, @Param("originIdEquals") @jakarta.annotation.Nullable Long originIdEquals, @Param("originIdNotEquals") @jakarta.annotation.Nullable Long originIdNotEquals, @Param("originIdSpecified") @jakarta.annotation.Nullable Boolean originIdSpecified, @Param("originIdIn") @jakarta.annotation.Nullable List<Long> originIdIn, @Param("originIdNotIn") @jakarta.annotation.Nullable List<Long> originIdNotIn, @Param("destinationIdGreaterThan") @jakarta.annotation.Nullable Long destinationIdGreaterThan, @Param("destinationIdLessThan") @jakarta.annotation.Nullable Long destinationIdLessThan, @Param("destinationIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long destinationIdGreaterThanOrEqual, @Param("destinationIdLessThanOrEqual") @jakarta.annotation.Nullable Long destinationIdLessThanOrEqual, @Param("destinationIdEquals") @jakarta.annotation.Nullable Long destinationIdEquals, @Param("destinationIdNotEquals") @jakarta.annotation.Nullable Long destinationIdNotEquals, @Param("destinationIdSpecified") @jakarta.annotation.Nullable Boolean destinationIdSpecified, @Param("destinationIdIn") @jakarta.annotation.Nullable List<Long> destinationIdIn, @Param("destinationIdNotIn") @jakarta.annotation.Nullable List<Long> destinationIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countRoutes</code> but it also returns the http response headers .
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
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param distanceKmGreaterThan  (optional)
   * @param distanceKmLessThan  (optional)
   * @param distanceKmGreaterThanOrEqual  (optional)
   * @param distanceKmLessThanOrEqual  (optional)
   * @param distanceKmEquals  (optional)
   * @param distanceKmNotEquals  (optional)
   * @param distanceKmSpecified  (optional)
   * @param distanceKmIn  (optional)
   * @param distanceKmNotIn  (optional)
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
   * @param originIdGreaterThan  (optional)
   * @param originIdLessThan  (optional)
   * @param originIdGreaterThanOrEqual  (optional)
   * @param originIdLessThanOrEqual  (optional)
   * @param originIdEquals  (optional)
   * @param originIdNotEquals  (optional)
   * @param originIdSpecified  (optional)
   * @param originIdIn  (optional)
   * @param originIdNotIn  (optional)
   * @param destinationIdGreaterThan  (optional)
   * @param destinationIdLessThan  (optional)
   * @param destinationIdGreaterThanOrEqual  (optional)
   * @param destinationIdLessThanOrEqual  (optional)
   * @param destinationIdEquals  (optional)
   * @param destinationIdNotEquals  (optional)
   * @param destinationIdSpecified  (optional)
   * @param destinationIdIn  (optional)
   * @param destinationIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/routes/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&distanceKm.greaterThan={distanceKmGreaterThan}&distanceKm.lessThan={distanceKmLessThan}&distanceKm.greaterThanOrEqual={distanceKmGreaterThanOrEqual}&distanceKm.lessThanOrEqual={distanceKmLessThanOrEqual}&distanceKm.equals={distanceKmEquals}&distanceKm.notEquals={distanceKmNotEquals}&distanceKm.specified={distanceKmSpecified}&distanceKm.in={distanceKmIn}&distanceKm.notIn={distanceKmNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originId.greaterThan={originIdGreaterThan}&originId.lessThan={originIdLessThan}&originId.greaterThanOrEqual={originIdGreaterThanOrEqual}&originId.lessThanOrEqual={originIdLessThanOrEqual}&originId.equals={originIdEquals}&originId.notEquals={originIdNotEquals}&originId.specified={originIdSpecified}&originId.in={originIdIn}&originId.notIn={originIdNotIn}&destinationId.greaterThan={destinationIdGreaterThan}&destinationId.lessThan={destinationIdLessThan}&destinationId.greaterThanOrEqual={destinationIdGreaterThanOrEqual}&destinationId.lessThanOrEqual={destinationIdLessThanOrEqual}&destinationId.equals={destinationIdEquals}&destinationId.notEquals={destinationIdNotEquals}&destinationId.specified={destinationIdSpecified}&destinationId.in={destinationIdIn}&destinationId.notIn={destinationIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countRoutesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("distanceKmGreaterThan") @jakarta.annotation.Nullable BigDecimal distanceKmGreaterThan, @Param("distanceKmLessThan") @jakarta.annotation.Nullable BigDecimal distanceKmLessThan, @Param("distanceKmGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal distanceKmGreaterThanOrEqual, @Param("distanceKmLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal distanceKmLessThanOrEqual, @Param("distanceKmEquals") @jakarta.annotation.Nullable BigDecimal distanceKmEquals, @Param("distanceKmNotEquals") @jakarta.annotation.Nullable BigDecimal distanceKmNotEquals, @Param("distanceKmSpecified") @jakarta.annotation.Nullable Boolean distanceKmSpecified, @Param("distanceKmIn") @jakarta.annotation.Nullable List<BigDecimal> distanceKmIn, @Param("distanceKmNotIn") @jakarta.annotation.Nullable List<BigDecimal> distanceKmNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("originIdGreaterThan") @jakarta.annotation.Nullable Long originIdGreaterThan, @Param("originIdLessThan") @jakarta.annotation.Nullable Long originIdLessThan, @Param("originIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long originIdGreaterThanOrEqual, @Param("originIdLessThanOrEqual") @jakarta.annotation.Nullable Long originIdLessThanOrEqual, @Param("originIdEquals") @jakarta.annotation.Nullable Long originIdEquals, @Param("originIdNotEquals") @jakarta.annotation.Nullable Long originIdNotEquals, @Param("originIdSpecified") @jakarta.annotation.Nullable Boolean originIdSpecified, @Param("originIdIn") @jakarta.annotation.Nullable List<Long> originIdIn, @Param("originIdNotIn") @jakarta.annotation.Nullable List<Long> originIdNotIn, @Param("destinationIdGreaterThan") @jakarta.annotation.Nullable Long destinationIdGreaterThan, @Param("destinationIdLessThan") @jakarta.annotation.Nullable Long destinationIdLessThan, @Param("destinationIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long destinationIdGreaterThanOrEqual, @Param("destinationIdLessThanOrEqual") @jakarta.annotation.Nullable Long destinationIdLessThanOrEqual, @Param("destinationIdEquals") @jakarta.annotation.Nullable Long destinationIdEquals, @Param("destinationIdNotEquals") @jakarta.annotation.Nullable Long destinationIdNotEquals, @Param("destinationIdSpecified") @jakarta.annotation.Nullable Boolean destinationIdSpecified, @Param("destinationIdIn") @jakarta.annotation.Nullable List<Long> destinationIdIn, @Param("destinationIdNotIn") @jakarta.annotation.Nullable List<Long> destinationIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countRoutes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountRoutesQueryParams} class that allows for
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
   *   <li>routeCodeContains -  (optional)</li>
   *   <li>routeCodeDoesNotContain -  (optional)</li>
   *   <li>routeCodeEquals -  (optional)</li>
   *   <li>routeCodeNotEquals -  (optional)</li>
   *   <li>routeCodeSpecified -  (optional)</li>
   *   <li>routeCodeIn -  (optional)</li>
   *   <li>routeCodeNotIn -  (optional)</li>
   *   <li>distanceKmGreaterThan -  (optional)</li>
   *   <li>distanceKmLessThan -  (optional)</li>
   *   <li>distanceKmGreaterThanOrEqual -  (optional)</li>
   *   <li>distanceKmLessThanOrEqual -  (optional)</li>
   *   <li>distanceKmEquals -  (optional)</li>
   *   <li>distanceKmNotEquals -  (optional)</li>
   *   <li>distanceKmSpecified -  (optional)</li>
   *   <li>distanceKmIn -  (optional)</li>
   *   <li>distanceKmNotIn -  (optional)</li>
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
   *   <li>originIdGreaterThan -  (optional)</li>
   *   <li>originIdLessThan -  (optional)</li>
   *   <li>originIdGreaterThanOrEqual -  (optional)</li>
   *   <li>originIdLessThanOrEqual -  (optional)</li>
   *   <li>originIdEquals -  (optional)</li>
   *   <li>originIdNotEquals -  (optional)</li>
   *   <li>originIdSpecified -  (optional)</li>
   *   <li>originIdIn -  (optional)</li>
   *   <li>originIdNotIn -  (optional)</li>
   *   <li>destinationIdGreaterThan -  (optional)</li>
   *   <li>destinationIdLessThan -  (optional)</li>
   *   <li>destinationIdGreaterThanOrEqual -  (optional)</li>
   *   <li>destinationIdLessThanOrEqual -  (optional)</li>
   *   <li>destinationIdEquals -  (optional)</li>
   *   <li>destinationIdNotEquals -  (optional)</li>
   *   <li>destinationIdSpecified -  (optional)</li>
   *   <li>destinationIdIn -  (optional)</li>
   *   <li>destinationIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/routes/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&distanceKm.greaterThan={distanceKmGreaterThan}&distanceKm.lessThan={distanceKmLessThan}&distanceKm.greaterThanOrEqual={distanceKmGreaterThanOrEqual}&distanceKm.lessThanOrEqual={distanceKmLessThanOrEqual}&distanceKm.equals={distanceKmEquals}&distanceKm.notEquals={distanceKmNotEquals}&distanceKm.specified={distanceKmSpecified}&distanceKm.in={distanceKmIn}&distanceKm.notIn={distanceKmNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originId.greaterThan={originIdGreaterThan}&originId.lessThan={originIdLessThan}&originId.greaterThanOrEqual={originIdGreaterThanOrEqual}&originId.lessThanOrEqual={originIdLessThanOrEqual}&originId.equals={originIdEquals}&originId.notEquals={originIdNotEquals}&originId.specified={originIdSpecified}&originId.in={originIdIn}&originId.notIn={originIdNotIn}&destinationId.greaterThan={destinationIdGreaterThan}&destinationId.lessThan={destinationIdLessThan}&destinationId.greaterThanOrEqual={destinationIdGreaterThanOrEqual}&destinationId.lessThanOrEqual={destinationIdLessThanOrEqual}&destinationId.equals={destinationIdEquals}&destinationId.notEquals={destinationIdNotEquals}&destinationId.specified={destinationIdSpecified}&destinationId.in={destinationIdIn}&destinationId.notIn={destinationIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countRoutes(@QueryMap(encoded=true) CountRoutesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countRoutes</code> that receives the query parameters as a map,
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
          *   <li>routeCodeContains -  (optional)</li>
          *   <li>routeCodeDoesNotContain -  (optional)</li>
          *   <li>routeCodeEquals -  (optional)</li>
          *   <li>routeCodeNotEquals -  (optional)</li>
          *   <li>routeCodeSpecified -  (optional)</li>
          *   <li>routeCodeIn -  (optional)</li>
          *   <li>routeCodeNotIn -  (optional)</li>
          *   <li>distanceKmGreaterThan -  (optional)</li>
          *   <li>distanceKmLessThan -  (optional)</li>
          *   <li>distanceKmGreaterThanOrEqual -  (optional)</li>
          *   <li>distanceKmLessThanOrEqual -  (optional)</li>
          *   <li>distanceKmEquals -  (optional)</li>
          *   <li>distanceKmNotEquals -  (optional)</li>
          *   <li>distanceKmSpecified -  (optional)</li>
          *   <li>distanceKmIn -  (optional)</li>
          *   <li>distanceKmNotIn -  (optional)</li>
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
          *   <li>originIdGreaterThan -  (optional)</li>
          *   <li>originIdLessThan -  (optional)</li>
          *   <li>originIdGreaterThanOrEqual -  (optional)</li>
          *   <li>originIdLessThanOrEqual -  (optional)</li>
          *   <li>originIdEquals -  (optional)</li>
          *   <li>originIdNotEquals -  (optional)</li>
          *   <li>originIdSpecified -  (optional)</li>
          *   <li>originIdIn -  (optional)</li>
          *   <li>originIdNotIn -  (optional)</li>
          *   <li>destinationIdGreaterThan -  (optional)</li>
          *   <li>destinationIdLessThan -  (optional)</li>
          *   <li>destinationIdGreaterThanOrEqual -  (optional)</li>
          *   <li>destinationIdLessThanOrEqual -  (optional)</li>
          *   <li>destinationIdEquals -  (optional)</li>
          *   <li>destinationIdNotEquals -  (optional)</li>
          *   <li>destinationIdSpecified -  (optional)</li>
          *   <li>destinationIdIn -  (optional)</li>
          *   <li>destinationIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/routes/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&distanceKm.greaterThan={distanceKmGreaterThan}&distanceKm.lessThan={distanceKmLessThan}&distanceKm.greaterThanOrEqual={distanceKmGreaterThanOrEqual}&distanceKm.lessThanOrEqual={distanceKmLessThanOrEqual}&distanceKm.equals={distanceKmEquals}&distanceKm.notEquals={distanceKmNotEquals}&distanceKm.specified={distanceKmSpecified}&distanceKm.in={distanceKmIn}&distanceKm.notIn={distanceKmNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originId.greaterThan={originIdGreaterThan}&originId.lessThan={originIdLessThan}&originId.greaterThanOrEqual={originIdGreaterThanOrEqual}&originId.lessThanOrEqual={originIdLessThanOrEqual}&originId.equals={originIdEquals}&originId.notEquals={originIdNotEquals}&originId.specified={originIdSpecified}&originId.in={originIdIn}&originId.notIn={originIdNotIn}&destinationId.greaterThan={destinationIdGreaterThan}&destinationId.lessThan={destinationIdLessThan}&destinationId.greaterThanOrEqual={destinationIdGreaterThanOrEqual}&destinationId.lessThanOrEqual={destinationIdLessThanOrEqual}&destinationId.equals={destinationIdEquals}&destinationId.notEquals={destinationIdNotEquals}&destinationId.specified={destinationIdSpecified}&destinationId.in={destinationIdIn}&destinationId.notIn={destinationIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countRoutesWithHttpInfo(@QueryMap(encoded=true) CountRoutesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countRoutes</code> method in a fluent style.
   */
  public static class CountRoutesQueryParams extends HashMap<String, Object> {
    public CountRoutesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams routeCodeContains(@jakarta.annotation.Nullable final String value) {
      put("routeCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams routeCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("routeCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams routeCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams routeCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams routeCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams routeCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams routeCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams distanceKmGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams distanceKmLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams distanceKmGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams distanceKmLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams distanceKmEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams distanceKmNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams distanceKmSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("distanceKm.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams distanceKmIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("distanceKm.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams distanceKmNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("distanceKm.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams originIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("originId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams originIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("originId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams originIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("originId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams originIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("originId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams originIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("originId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams originIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("originId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams originIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams originIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("originId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams originIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("originId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams destinationIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams destinationIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams destinationIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams destinationIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams destinationIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams destinationIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams destinationIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destinationId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountRoutesQueryParams destinationIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("destinationId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams destinationIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("destinationId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountRoutesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param routeDTO  (required)
   * @return RouteDTO
   */
  @RequestLine("POST /api/routes")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  RouteDTO createRoute(@jakarta.annotation.Nonnull RouteDTO routeDTO);

  /**
   * 
   * Similar to <code>createRoute</code> but it also returns the http response headers .
   * 
   * @param routeDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/routes")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<RouteDTO> createRouteWithHttpInfo(@jakarta.annotation.Nonnull RouteDTO routeDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/routes/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteRoute(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteRoute</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/routes/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteRouteWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param distanceKmGreaterThan  (optional)
   * @param distanceKmLessThan  (optional)
   * @param distanceKmGreaterThanOrEqual  (optional)
   * @param distanceKmLessThanOrEqual  (optional)
   * @param distanceKmEquals  (optional)
   * @param distanceKmNotEquals  (optional)
   * @param distanceKmSpecified  (optional)
   * @param distanceKmIn  (optional)
   * @param distanceKmNotIn  (optional)
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
   * @param originIdGreaterThan  (optional)
   * @param originIdLessThan  (optional)
   * @param originIdGreaterThanOrEqual  (optional)
   * @param originIdLessThanOrEqual  (optional)
   * @param originIdEquals  (optional)
   * @param originIdNotEquals  (optional)
   * @param originIdSpecified  (optional)
   * @param originIdIn  (optional)
   * @param originIdNotIn  (optional)
   * @param destinationIdGreaterThan  (optional)
   * @param destinationIdLessThan  (optional)
   * @param destinationIdGreaterThanOrEqual  (optional)
   * @param destinationIdLessThanOrEqual  (optional)
   * @param destinationIdEquals  (optional)
   * @param destinationIdNotEquals  (optional)
   * @param destinationIdSpecified  (optional)
   * @param destinationIdIn  (optional)
   * @param destinationIdNotIn  (optional)
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;RouteDTO&gt;
   */
  @RequestLine("GET /api/routes?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&distanceKm.greaterThan={distanceKmGreaterThan}&distanceKm.lessThan={distanceKmLessThan}&distanceKm.greaterThanOrEqual={distanceKmGreaterThanOrEqual}&distanceKm.lessThanOrEqual={distanceKmLessThanOrEqual}&distanceKm.equals={distanceKmEquals}&distanceKm.notEquals={distanceKmNotEquals}&distanceKm.specified={distanceKmSpecified}&distanceKm.in={distanceKmIn}&distanceKm.notIn={distanceKmNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originId.greaterThan={originIdGreaterThan}&originId.lessThan={originIdLessThan}&originId.greaterThanOrEqual={originIdGreaterThanOrEqual}&originId.lessThanOrEqual={originIdLessThanOrEqual}&originId.equals={originIdEquals}&originId.notEquals={originIdNotEquals}&originId.specified={originIdSpecified}&originId.in={originIdIn}&originId.notIn={originIdNotIn}&destinationId.greaterThan={destinationIdGreaterThan}&destinationId.lessThan={destinationIdLessThan}&destinationId.greaterThanOrEqual={destinationIdGreaterThanOrEqual}&destinationId.lessThanOrEqual={destinationIdLessThanOrEqual}&destinationId.equals={destinationIdEquals}&destinationId.notEquals={destinationIdNotEquals}&destinationId.specified={destinationIdSpecified}&destinationId.in={destinationIdIn}&destinationId.notIn={destinationIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<RouteDTO> getAllRoutes(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("distanceKmGreaterThan") @jakarta.annotation.Nullable BigDecimal distanceKmGreaterThan, @Param("distanceKmLessThan") @jakarta.annotation.Nullable BigDecimal distanceKmLessThan, @Param("distanceKmGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal distanceKmGreaterThanOrEqual, @Param("distanceKmLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal distanceKmLessThanOrEqual, @Param("distanceKmEquals") @jakarta.annotation.Nullable BigDecimal distanceKmEquals, @Param("distanceKmNotEquals") @jakarta.annotation.Nullable BigDecimal distanceKmNotEquals, @Param("distanceKmSpecified") @jakarta.annotation.Nullable Boolean distanceKmSpecified, @Param("distanceKmIn") @jakarta.annotation.Nullable List<BigDecimal> distanceKmIn, @Param("distanceKmNotIn") @jakarta.annotation.Nullable List<BigDecimal> distanceKmNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("originIdGreaterThan") @jakarta.annotation.Nullable Long originIdGreaterThan, @Param("originIdLessThan") @jakarta.annotation.Nullable Long originIdLessThan, @Param("originIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long originIdGreaterThanOrEqual, @Param("originIdLessThanOrEqual") @jakarta.annotation.Nullable Long originIdLessThanOrEqual, @Param("originIdEquals") @jakarta.annotation.Nullable Long originIdEquals, @Param("originIdNotEquals") @jakarta.annotation.Nullable Long originIdNotEquals, @Param("originIdSpecified") @jakarta.annotation.Nullable Boolean originIdSpecified, @Param("originIdIn") @jakarta.annotation.Nullable List<Long> originIdIn, @Param("originIdNotIn") @jakarta.annotation.Nullable List<Long> originIdNotIn, @Param("destinationIdGreaterThan") @jakarta.annotation.Nullable Long destinationIdGreaterThan, @Param("destinationIdLessThan") @jakarta.annotation.Nullable Long destinationIdLessThan, @Param("destinationIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long destinationIdGreaterThanOrEqual, @Param("destinationIdLessThanOrEqual") @jakarta.annotation.Nullable Long destinationIdLessThanOrEqual, @Param("destinationIdEquals") @jakarta.annotation.Nullable Long destinationIdEquals, @Param("destinationIdNotEquals") @jakarta.annotation.Nullable Long destinationIdNotEquals, @Param("destinationIdSpecified") @jakarta.annotation.Nullable Boolean destinationIdSpecified, @Param("destinationIdIn") @jakarta.annotation.Nullable List<Long> destinationIdIn, @Param("destinationIdNotIn") @jakarta.annotation.Nullable List<Long> destinationIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>getAllRoutes</code> but it also returns the http response headers .
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
   * @param routeCodeContains  (optional)
   * @param routeCodeDoesNotContain  (optional)
   * @param routeCodeEquals  (optional)
   * @param routeCodeNotEquals  (optional)
   * @param routeCodeSpecified  (optional)
   * @param routeCodeIn  (optional)
   * @param routeCodeNotIn  (optional)
   * @param distanceKmGreaterThan  (optional)
   * @param distanceKmLessThan  (optional)
   * @param distanceKmGreaterThanOrEqual  (optional)
   * @param distanceKmLessThanOrEqual  (optional)
   * @param distanceKmEquals  (optional)
   * @param distanceKmNotEquals  (optional)
   * @param distanceKmSpecified  (optional)
   * @param distanceKmIn  (optional)
   * @param distanceKmNotIn  (optional)
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
   * @param originIdGreaterThan  (optional)
   * @param originIdLessThan  (optional)
   * @param originIdGreaterThanOrEqual  (optional)
   * @param originIdLessThanOrEqual  (optional)
   * @param originIdEquals  (optional)
   * @param originIdNotEquals  (optional)
   * @param originIdSpecified  (optional)
   * @param originIdIn  (optional)
   * @param originIdNotIn  (optional)
   * @param destinationIdGreaterThan  (optional)
   * @param destinationIdLessThan  (optional)
   * @param destinationIdGreaterThanOrEqual  (optional)
   * @param destinationIdLessThanOrEqual  (optional)
   * @param destinationIdEquals  (optional)
   * @param destinationIdNotEquals  (optional)
   * @param destinationIdSpecified  (optional)
   * @param destinationIdIn  (optional)
   * @param destinationIdNotIn  (optional)
   * @param distinct  (optional)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/routes?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&distanceKm.greaterThan={distanceKmGreaterThan}&distanceKm.lessThan={distanceKmLessThan}&distanceKm.greaterThanOrEqual={distanceKmGreaterThanOrEqual}&distanceKm.lessThanOrEqual={distanceKmLessThanOrEqual}&distanceKm.equals={distanceKmEquals}&distanceKm.notEquals={distanceKmNotEquals}&distanceKm.specified={distanceKmSpecified}&distanceKm.in={distanceKmIn}&distanceKm.notIn={distanceKmNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originId.greaterThan={originIdGreaterThan}&originId.lessThan={originIdLessThan}&originId.greaterThanOrEqual={originIdGreaterThanOrEqual}&originId.lessThanOrEqual={originIdLessThanOrEqual}&originId.equals={originIdEquals}&originId.notEquals={originIdNotEquals}&originId.specified={originIdSpecified}&originId.in={originIdIn}&originId.notIn={originIdNotIn}&destinationId.greaterThan={destinationIdGreaterThan}&destinationId.lessThan={destinationIdLessThan}&destinationId.greaterThanOrEqual={destinationIdGreaterThanOrEqual}&destinationId.lessThanOrEqual={destinationIdLessThanOrEqual}&destinationId.equals={destinationIdEquals}&destinationId.notEquals={destinationIdNotEquals}&destinationId.specified={destinationIdSpecified}&destinationId.in={destinationIdIn}&destinationId.notIn={destinationIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<RouteDTO>> getAllRoutesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("routeCodeContains") @jakarta.annotation.Nullable String routeCodeContains, @Param("routeCodeDoesNotContain") @jakarta.annotation.Nullable String routeCodeDoesNotContain, @Param("routeCodeEquals") @jakarta.annotation.Nullable String routeCodeEquals, @Param("routeCodeNotEquals") @jakarta.annotation.Nullable String routeCodeNotEquals, @Param("routeCodeSpecified") @jakarta.annotation.Nullable Boolean routeCodeSpecified, @Param("routeCodeIn") @jakarta.annotation.Nullable List<String> routeCodeIn, @Param("routeCodeNotIn") @jakarta.annotation.Nullable List<String> routeCodeNotIn, @Param("distanceKmGreaterThan") @jakarta.annotation.Nullable BigDecimal distanceKmGreaterThan, @Param("distanceKmLessThan") @jakarta.annotation.Nullable BigDecimal distanceKmLessThan, @Param("distanceKmGreaterThanOrEqual") @jakarta.annotation.Nullable BigDecimal distanceKmGreaterThanOrEqual, @Param("distanceKmLessThanOrEqual") @jakarta.annotation.Nullable BigDecimal distanceKmLessThanOrEqual, @Param("distanceKmEquals") @jakarta.annotation.Nullable BigDecimal distanceKmEquals, @Param("distanceKmNotEquals") @jakarta.annotation.Nullable BigDecimal distanceKmNotEquals, @Param("distanceKmSpecified") @jakarta.annotation.Nullable Boolean distanceKmSpecified, @Param("distanceKmIn") @jakarta.annotation.Nullable List<BigDecimal> distanceKmIn, @Param("distanceKmNotIn") @jakarta.annotation.Nullable List<BigDecimal> distanceKmNotIn, @Param("createdAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThan, @Param("createdAtLessThan") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThan, @Param("createdAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtGreaterThanOrEqual, @Param("createdAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime createdAtLessThanOrEqual, @Param("createdAtEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtEquals, @Param("createdAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime createdAtNotEquals, @Param("createdAtSpecified") @jakarta.annotation.Nullable Boolean createdAtSpecified, @Param("createdAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtIn, @Param("createdAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> createdAtNotIn, @Param("updatedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThan, @Param("updatedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThan, @Param("updatedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtGreaterThanOrEqual, @Param("updatedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime updatedAtLessThanOrEqual, @Param("updatedAtEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtEquals, @Param("updatedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime updatedAtNotEquals, @Param("updatedAtSpecified") @jakarta.annotation.Nullable Boolean updatedAtSpecified, @Param("updatedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtIn, @Param("updatedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> updatedAtNotIn, @Param("isDeletedEquals") @jakarta.annotation.Nullable Boolean isDeletedEquals, @Param("isDeletedNotEquals") @jakarta.annotation.Nullable Boolean isDeletedNotEquals, @Param("isDeletedSpecified") @jakarta.annotation.Nullable Boolean isDeletedSpecified, @Param("isDeletedIn") @jakarta.annotation.Nullable List<Boolean> isDeletedIn, @Param("isDeletedNotIn") @jakarta.annotation.Nullable List<Boolean> isDeletedNotIn, @Param("deletedAtGreaterThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThan, @Param("deletedAtLessThan") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThan, @Param("deletedAtGreaterThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtGreaterThanOrEqual, @Param("deletedAtLessThanOrEqual") @jakarta.annotation.Nullable OffsetDateTime deletedAtLessThanOrEqual, @Param("deletedAtEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtEquals, @Param("deletedAtNotEquals") @jakarta.annotation.Nullable OffsetDateTime deletedAtNotEquals, @Param("deletedAtSpecified") @jakarta.annotation.Nullable Boolean deletedAtSpecified, @Param("deletedAtIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtIn, @Param("deletedAtNotIn") @jakarta.annotation.Nullable List<OffsetDateTime> deletedAtNotIn, @Param("deletedByEquals") @jakarta.annotation.Nullable UUID deletedByEquals, @Param("deletedByNotEquals") @jakarta.annotation.Nullable UUID deletedByNotEquals, @Param("deletedBySpecified") @jakarta.annotation.Nullable Boolean deletedBySpecified, @Param("deletedByIn") @jakarta.annotation.Nullable List<UUID> deletedByIn, @Param("deletedByNotIn") @jakarta.annotation.Nullable List<UUID> deletedByNotIn, @Param("originIdGreaterThan") @jakarta.annotation.Nullable Long originIdGreaterThan, @Param("originIdLessThan") @jakarta.annotation.Nullable Long originIdLessThan, @Param("originIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long originIdGreaterThanOrEqual, @Param("originIdLessThanOrEqual") @jakarta.annotation.Nullable Long originIdLessThanOrEqual, @Param("originIdEquals") @jakarta.annotation.Nullable Long originIdEquals, @Param("originIdNotEquals") @jakarta.annotation.Nullable Long originIdNotEquals, @Param("originIdSpecified") @jakarta.annotation.Nullable Boolean originIdSpecified, @Param("originIdIn") @jakarta.annotation.Nullable List<Long> originIdIn, @Param("originIdNotIn") @jakarta.annotation.Nullable List<Long> originIdNotIn, @Param("destinationIdGreaterThan") @jakarta.annotation.Nullable Long destinationIdGreaterThan, @Param("destinationIdLessThan") @jakarta.annotation.Nullable Long destinationIdLessThan, @Param("destinationIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long destinationIdGreaterThanOrEqual, @Param("destinationIdLessThanOrEqual") @jakarta.annotation.Nullable Long destinationIdLessThanOrEqual, @Param("destinationIdEquals") @jakarta.annotation.Nullable Long destinationIdEquals, @Param("destinationIdNotEquals") @jakarta.annotation.Nullable Long destinationIdNotEquals, @Param("destinationIdSpecified") @jakarta.annotation.Nullable Boolean destinationIdSpecified, @Param("destinationIdIn") @jakarta.annotation.Nullable List<Long> destinationIdIn, @Param("destinationIdNotIn") @jakarta.annotation.Nullable List<Long> destinationIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllRoutes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllRoutesQueryParams} class that allows for
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
   *   <li>routeCodeContains -  (optional)</li>
   *   <li>routeCodeDoesNotContain -  (optional)</li>
   *   <li>routeCodeEquals -  (optional)</li>
   *   <li>routeCodeNotEquals -  (optional)</li>
   *   <li>routeCodeSpecified -  (optional)</li>
   *   <li>routeCodeIn -  (optional)</li>
   *   <li>routeCodeNotIn -  (optional)</li>
   *   <li>distanceKmGreaterThan -  (optional)</li>
   *   <li>distanceKmLessThan -  (optional)</li>
   *   <li>distanceKmGreaterThanOrEqual -  (optional)</li>
   *   <li>distanceKmLessThanOrEqual -  (optional)</li>
   *   <li>distanceKmEquals -  (optional)</li>
   *   <li>distanceKmNotEquals -  (optional)</li>
   *   <li>distanceKmSpecified -  (optional)</li>
   *   <li>distanceKmIn -  (optional)</li>
   *   <li>distanceKmNotIn -  (optional)</li>
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
   *   <li>originIdGreaterThan -  (optional)</li>
   *   <li>originIdLessThan -  (optional)</li>
   *   <li>originIdGreaterThanOrEqual -  (optional)</li>
   *   <li>originIdLessThanOrEqual -  (optional)</li>
   *   <li>originIdEquals -  (optional)</li>
   *   <li>originIdNotEquals -  (optional)</li>
   *   <li>originIdSpecified -  (optional)</li>
   *   <li>originIdIn -  (optional)</li>
   *   <li>originIdNotIn -  (optional)</li>
   *   <li>destinationIdGreaterThan -  (optional)</li>
   *   <li>destinationIdLessThan -  (optional)</li>
   *   <li>destinationIdGreaterThanOrEqual -  (optional)</li>
   *   <li>destinationIdLessThanOrEqual -  (optional)</li>
   *   <li>destinationIdEquals -  (optional)</li>
   *   <li>destinationIdNotEquals -  (optional)</li>
   *   <li>destinationIdSpecified -  (optional)</li>
   *   <li>destinationIdIn -  (optional)</li>
   *   <li>destinationIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
   *   <li>size - The size of the page to be returned (optional, default to 20)</li>
   *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;RouteDTO&gt;
   */
  @RequestLine("GET /api/routes?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&distanceKm.greaterThan={distanceKmGreaterThan}&distanceKm.lessThan={distanceKmLessThan}&distanceKm.greaterThanOrEqual={distanceKmGreaterThanOrEqual}&distanceKm.lessThanOrEqual={distanceKmLessThanOrEqual}&distanceKm.equals={distanceKmEquals}&distanceKm.notEquals={distanceKmNotEquals}&distanceKm.specified={distanceKmSpecified}&distanceKm.in={distanceKmIn}&distanceKm.notIn={distanceKmNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originId.greaterThan={originIdGreaterThan}&originId.lessThan={originIdLessThan}&originId.greaterThanOrEqual={originIdGreaterThanOrEqual}&originId.lessThanOrEqual={originIdLessThanOrEqual}&originId.equals={originIdEquals}&originId.notEquals={originIdNotEquals}&originId.specified={originIdSpecified}&originId.in={originIdIn}&originId.notIn={originIdNotIn}&destinationId.greaterThan={destinationIdGreaterThan}&destinationId.lessThan={destinationIdLessThan}&destinationId.greaterThanOrEqual={destinationIdGreaterThanOrEqual}&destinationId.lessThanOrEqual={destinationIdLessThanOrEqual}&destinationId.equals={destinationIdEquals}&destinationId.notEquals={destinationIdNotEquals}&destinationId.specified={destinationIdSpecified}&destinationId.in={destinationIdIn}&destinationId.notIn={destinationIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<RouteDTO> getAllRoutes(@QueryMap(encoded=true) GetAllRoutesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllRoutes</code> that receives the query parameters as a map,
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
          *   <li>routeCodeContains -  (optional)</li>
          *   <li>routeCodeDoesNotContain -  (optional)</li>
          *   <li>routeCodeEquals -  (optional)</li>
          *   <li>routeCodeNotEquals -  (optional)</li>
          *   <li>routeCodeSpecified -  (optional)</li>
          *   <li>routeCodeIn -  (optional)</li>
          *   <li>routeCodeNotIn -  (optional)</li>
          *   <li>distanceKmGreaterThan -  (optional)</li>
          *   <li>distanceKmLessThan -  (optional)</li>
          *   <li>distanceKmGreaterThanOrEqual -  (optional)</li>
          *   <li>distanceKmLessThanOrEqual -  (optional)</li>
          *   <li>distanceKmEquals -  (optional)</li>
          *   <li>distanceKmNotEquals -  (optional)</li>
          *   <li>distanceKmSpecified -  (optional)</li>
          *   <li>distanceKmIn -  (optional)</li>
          *   <li>distanceKmNotIn -  (optional)</li>
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
          *   <li>originIdGreaterThan -  (optional)</li>
          *   <li>originIdLessThan -  (optional)</li>
          *   <li>originIdGreaterThanOrEqual -  (optional)</li>
          *   <li>originIdLessThanOrEqual -  (optional)</li>
          *   <li>originIdEquals -  (optional)</li>
          *   <li>originIdNotEquals -  (optional)</li>
          *   <li>originIdSpecified -  (optional)</li>
          *   <li>originIdIn -  (optional)</li>
          *   <li>originIdNotIn -  (optional)</li>
          *   <li>destinationIdGreaterThan -  (optional)</li>
          *   <li>destinationIdLessThan -  (optional)</li>
          *   <li>destinationIdGreaterThanOrEqual -  (optional)</li>
          *   <li>destinationIdLessThanOrEqual -  (optional)</li>
          *   <li>destinationIdEquals -  (optional)</li>
          *   <li>destinationIdNotEquals -  (optional)</li>
          *   <li>destinationIdSpecified -  (optional)</li>
          *   <li>destinationIdIn -  (optional)</li>
          *   <li>destinationIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
          *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
          *   <li>size - The size of the page to be returned (optional, default to 20)</li>
          *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
      *   </ul>
          * @return List&lt;RouteDTO&gt;
      */
      @RequestLine("GET /api/routes?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&routeCode.contains={routeCodeContains}&routeCode.doesNotContain={routeCodeDoesNotContain}&routeCode.equals={routeCodeEquals}&routeCode.notEquals={routeCodeNotEquals}&routeCode.specified={routeCodeSpecified}&routeCode.in={routeCodeIn}&routeCode.notIn={routeCodeNotIn}&distanceKm.greaterThan={distanceKmGreaterThan}&distanceKm.lessThan={distanceKmLessThan}&distanceKm.greaterThanOrEqual={distanceKmGreaterThanOrEqual}&distanceKm.lessThanOrEqual={distanceKmLessThanOrEqual}&distanceKm.equals={distanceKmEquals}&distanceKm.notEquals={distanceKmNotEquals}&distanceKm.specified={distanceKmSpecified}&distanceKm.in={distanceKmIn}&distanceKm.notIn={distanceKmNotIn}&createdAt.greaterThan={createdAtGreaterThan}&createdAt.lessThan={createdAtLessThan}&createdAt.greaterThanOrEqual={createdAtGreaterThanOrEqual}&createdAt.lessThanOrEqual={createdAtLessThanOrEqual}&createdAt.equals={createdAtEquals}&createdAt.notEquals={createdAtNotEquals}&createdAt.specified={createdAtSpecified}&createdAt.in={createdAtIn}&createdAt.notIn={createdAtNotIn}&updatedAt.greaterThan={updatedAtGreaterThan}&updatedAt.lessThan={updatedAtLessThan}&updatedAt.greaterThanOrEqual={updatedAtGreaterThanOrEqual}&updatedAt.lessThanOrEqual={updatedAtLessThanOrEqual}&updatedAt.equals={updatedAtEquals}&updatedAt.notEquals={updatedAtNotEquals}&updatedAt.specified={updatedAtSpecified}&updatedAt.in={updatedAtIn}&updatedAt.notIn={updatedAtNotIn}&isDeleted.equals={isDeletedEquals}&isDeleted.notEquals={isDeletedNotEquals}&isDeleted.specified={isDeletedSpecified}&isDeleted.in={isDeletedIn}&isDeleted.notIn={isDeletedNotIn}&deletedAt.greaterThan={deletedAtGreaterThan}&deletedAt.lessThan={deletedAtLessThan}&deletedAt.greaterThanOrEqual={deletedAtGreaterThanOrEqual}&deletedAt.lessThanOrEqual={deletedAtLessThanOrEqual}&deletedAt.equals={deletedAtEquals}&deletedAt.notEquals={deletedAtNotEquals}&deletedAt.specified={deletedAtSpecified}&deletedAt.in={deletedAtIn}&deletedAt.notIn={deletedAtNotIn}&deletedBy.equals={deletedByEquals}&deletedBy.notEquals={deletedByNotEquals}&deletedBy.specified={deletedBySpecified}&deletedBy.in={deletedByIn}&deletedBy.notIn={deletedByNotIn}&originId.greaterThan={originIdGreaterThan}&originId.lessThan={originIdLessThan}&originId.greaterThanOrEqual={originIdGreaterThanOrEqual}&originId.lessThanOrEqual={originIdLessThanOrEqual}&originId.equals={originIdEquals}&originId.notEquals={originIdNotEquals}&originId.specified={originIdSpecified}&originId.in={originIdIn}&originId.notIn={originIdNotIn}&destinationId.greaterThan={destinationIdGreaterThan}&destinationId.lessThan={destinationIdLessThan}&destinationId.greaterThanOrEqual={destinationIdGreaterThanOrEqual}&destinationId.lessThanOrEqual={destinationIdLessThanOrEqual}&destinationId.equals={destinationIdEquals}&destinationId.notEquals={destinationIdNotEquals}&destinationId.specified={destinationIdSpecified}&destinationId.in={destinationIdIn}&destinationId.notIn={destinationIdNotIn}&distinct={distinct}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<RouteDTO>> getAllRoutesWithHttpInfo(@QueryMap(encoded=true) GetAllRoutesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllRoutes</code> method in a fluent style.
   */
  public static class GetAllRoutesQueryParams extends HashMap<String, Object> {
    public GetAllRoutesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams routeCodeContains(@jakarta.annotation.Nullable final String value) {
      put("routeCode.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams routeCodeDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("routeCode.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams routeCodeEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams routeCodeNotEquals(@jakarta.annotation.Nullable final String value) {
      put("routeCode.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams routeCodeSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("routeCode.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams routeCodeIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams routeCodeNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("routeCode.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmGreaterThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmLessThan(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmGreaterThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmLessThanOrEqual(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmNotEquals(@jakarta.annotation.Nullable final BigDecimal value) {
      put("distanceKm.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("distanceKm.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("distanceKm.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams distanceKmNotIn(@jakarta.annotation.Nullable final List<BigDecimal> value) {
      put("distanceKm.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams createdAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams createdAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams createdAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams createdAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams createdAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams createdAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("createdAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams createdAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("createdAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams createdAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams createdAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("createdAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("updatedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("updatedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams updatedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("updatedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams isDeletedEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams isDeletedNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams isDeletedSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("isDeleted.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams isDeletedIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams isDeletedNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("isDeleted.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtGreaterThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtLessThan(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtGreaterThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtLessThanOrEqual(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtNotEquals(@jakarta.annotation.Nullable final OffsetDateTime value) {
      put("deletedAt.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedAt.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams deletedAtNotIn(@jakarta.annotation.Nullable final List<OffsetDateTime> value) {
      put("deletedAt.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams deletedByEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedByNotEquals(@jakarta.annotation.Nullable final UUID value) {
      put("deletedBy.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedBySpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("deletedBy.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams deletedByIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams deletedByNotIn(@jakarta.annotation.Nullable final List<UUID> value) {
      put("deletedBy.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams originIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("originId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams originIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("originId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams originIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("originId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams originIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("originId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams originIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("originId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams originIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("originId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams originIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("originId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams originIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("originId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams originIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("originId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("destinationId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("destinationId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("destinationId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams destinationIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("destinationId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllRoutesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public GetAllRoutesQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return RouteDTO
   */
  @RequestLine("GET /api/routes/{id}")
  @Headers({
    "Accept: */*",
  })
  RouteDTO getRoute(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getRoute</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/routes/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<RouteDTO> getRouteWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param routeDTO  (required)
   * @return RouteDTO
   */
  @RequestLine("PATCH /api/routes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  RouteDTO partialUpdateRoute(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RouteDTO routeDTO);

  /**
   * 
   * Similar to <code>partialUpdateRoute</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param routeDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/routes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<RouteDTO> partialUpdateRouteWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RouteDTO routeDTO);



  /**
   * 
   * 
   * @param query  (required)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return List&lt;RouteDTO&gt;
   */
  @RequestLine("GET /api/routes/_search?query={query}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  List<RouteDTO> searchRoutes(@Param("query") @jakarta.annotation.Nonnull String query, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);

  /**
   * 
   * Similar to <code>searchRoutes</code> but it also returns the http response headers .
   * 
   * @param query  (required)
   * @param page Zero-based page index (0..N) (optional, default to 0)
   * @param size The size of the page to be returned (optional, default to 20)
   * @param sort Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/routes/_search?query={query}&page={page}&size={size}&sort={sort}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<RouteDTO>> searchRoutesWithHttpInfo(@Param("query") @jakarta.annotation.Nonnull String query, @Param("page") @jakarta.annotation.Nullable Integer page, @Param("size") @jakarta.annotation.Nullable Integer size, @Param("sort") @jakarta.annotation.Nullable List<String> sort);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>searchRoutes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SearchRoutesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>query -  (required)</li>
   *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
   *   <li>size - The size of the page to be returned (optional, default to 20)</li>
   *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
   *   </ul>
   * @return List&lt;RouteDTO&gt;
   */
  @RequestLine("GET /api/routes/_search?query={query}&page={page}&size={size}&sort={sort}")
  @Headers({
  "Accept: */*",
  })
  List<RouteDTO> searchRoutes(@QueryMap(encoded=true) SearchRoutesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>searchRoutes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>query -  (required)</li>
          *   <li>page - Zero-based page index (0..N) (optional, default to 0)</li>
          *   <li>size - The size of the page to be returned (optional, default to 20)</li>
          *   <li>sort - Sorting criteria in the format: property,(asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)</li>
      *   </ul>
          * @return List&lt;RouteDTO&gt;
      */
      @RequestLine("GET /api/routes/_search?query={query}&page={page}&size={size}&sort={sort}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<RouteDTO>> searchRoutesWithHttpInfo(@QueryMap(encoded=true) SearchRoutesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>searchRoutes</code> method in a fluent style.
   */
  public static class SearchRoutesQueryParams extends HashMap<String, Object> {
    public SearchRoutesQueryParams query(@jakarta.annotation.Nonnull final String value) {
      put("query", EncodingUtils.encode(value));
      return this;
    }
    public SearchRoutesQueryParams page(@jakarta.annotation.Nullable final Integer value) {
      put("page", EncodingUtils.encode(value));
      return this;
    }
    public SearchRoutesQueryParams size(@jakarta.annotation.Nullable final Integer value) {
      put("size", EncodingUtils.encode(value));
      return this;
    }
    public SearchRoutesQueryParams sort(@jakarta.annotation.Nullable final List<String> value) {
      put("sort", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @param routeDTO  (required)
   * @return RouteDTO
   */
  @RequestLine("PUT /api/routes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  RouteDTO updateRoute(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RouteDTO routeDTO);

  /**
   * 
   * Similar to <code>updateRoute</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param routeDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/routes/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<RouteDTO> updateRouteWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull RouteDTO routeDTO);


}
