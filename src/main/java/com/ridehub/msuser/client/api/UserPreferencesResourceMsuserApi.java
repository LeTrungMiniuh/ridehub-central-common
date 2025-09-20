package com.ridehub.msuser.client.api;

import com.ridehub.msuser.client.invoker.ApiClient;
import com.ridehub.msuser.client.invoker.EncodingUtils;
import com.ridehub.msuser.client.model.ApiResponse;

import com.ridehub.msuser.client.model.UserPreferencesDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public interface UserPreferencesResourceMsuserApi extends ApiClient.Api {


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
   * @param preferredLanguageContains  (optional)
   * @param preferredLanguageDoesNotContain  (optional)
   * @param preferredLanguageEquals  (optional)
   * @param preferredLanguageNotEquals  (optional)
   * @param preferredLanguageSpecified  (optional)
   * @param preferredLanguageIn  (optional)
   * @param preferredLanguageNotIn  (optional)
   * @param emailNotificationsEquals  (optional)
   * @param emailNotificationsNotEquals  (optional)
   * @param emailNotificationsSpecified  (optional)
   * @param emailNotificationsIn  (optional)
   * @param emailNotificationsNotIn  (optional)
   * @param smsNotificationsEquals  (optional)
   * @param smsNotificationsNotEquals  (optional)
   * @param smsNotificationsSpecified  (optional)
   * @param smsNotificationsIn  (optional)
   * @param smsNotificationsNotIn  (optional)
   * @param pushNotificationsEquals  (optional)
   * @param pushNotificationsNotEquals  (optional)
   * @param pushNotificationsSpecified  (optional)
   * @param pushNotificationsIn  (optional)
   * @param pushNotificationsNotIn  (optional)
   * @param phoneContains  (optional)
   * @param phoneDoesNotContain  (optional)
   * @param phoneEquals  (optional)
   * @param phoneNotEquals  (optional)
   * @param phoneSpecified  (optional)
   * @param phoneIn  (optional)
   * @param phoneNotIn  (optional)
   * @param emailContains  (optional)
   * @param emailDoesNotContain  (optional)
   * @param emailEquals  (optional)
   * @param emailNotEquals  (optional)
   * @param emailSpecified  (optional)
   * @param emailIn  (optional)
   * @param emailNotIn  (optional)
   * @param appUserIdGreaterThan  (optional)
   * @param appUserIdLessThan  (optional)
   * @param appUserIdGreaterThanOrEqual  (optional)
   * @param appUserIdLessThanOrEqual  (optional)
   * @param appUserIdEquals  (optional)
   * @param appUserIdNotEquals  (optional)
   * @param appUserIdSpecified  (optional)
   * @param appUserIdIn  (optional)
   * @param appUserIdNotIn  (optional)
   * @param distinct  (optional)
   * @return Long
   */
  @RequestLine("GET /api/user-preferences/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&preferredLanguage.contains={preferredLanguageContains}&preferredLanguage.doesNotContain={preferredLanguageDoesNotContain}&preferredLanguage.equals={preferredLanguageEquals}&preferredLanguage.notEquals={preferredLanguageNotEquals}&preferredLanguage.specified={preferredLanguageSpecified}&preferredLanguage.in={preferredLanguageIn}&preferredLanguage.notIn={preferredLanguageNotIn}&emailNotifications.equals={emailNotificationsEquals}&emailNotifications.notEquals={emailNotificationsNotEquals}&emailNotifications.specified={emailNotificationsSpecified}&emailNotifications.in={emailNotificationsIn}&emailNotifications.notIn={emailNotificationsNotIn}&smsNotifications.equals={smsNotificationsEquals}&smsNotifications.notEquals={smsNotificationsNotEquals}&smsNotifications.specified={smsNotificationsSpecified}&smsNotifications.in={smsNotificationsIn}&smsNotifications.notIn={smsNotificationsNotIn}&pushNotifications.equals={pushNotificationsEquals}&pushNotifications.notEquals={pushNotificationsNotEquals}&pushNotifications.specified={pushNotificationsSpecified}&pushNotifications.in={pushNotificationsIn}&pushNotifications.notIn={pushNotificationsNotIn}&phone.contains={phoneContains}&phone.doesNotContain={phoneDoesNotContain}&phone.equals={phoneEquals}&phone.notEquals={phoneNotEquals}&phone.specified={phoneSpecified}&phone.in={phoneIn}&phone.notIn={phoneNotIn}&email.contains={emailContains}&email.doesNotContain={emailDoesNotContain}&email.equals={emailEquals}&email.notEquals={emailNotEquals}&email.specified={emailSpecified}&email.in={emailIn}&email.notIn={emailNotIn}&appUserId.greaterThan={appUserIdGreaterThan}&appUserId.lessThan={appUserIdLessThan}&appUserId.greaterThanOrEqual={appUserIdGreaterThanOrEqual}&appUserId.lessThanOrEqual={appUserIdLessThanOrEqual}&appUserId.equals={appUserIdEquals}&appUserId.notEquals={appUserIdNotEquals}&appUserId.specified={appUserIdSpecified}&appUserId.in={appUserIdIn}&appUserId.notIn={appUserIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  Long countUserPreferences(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("preferredLanguageContains") @jakarta.annotation.Nullable String preferredLanguageContains, @Param("preferredLanguageDoesNotContain") @jakarta.annotation.Nullable String preferredLanguageDoesNotContain, @Param("preferredLanguageEquals") @jakarta.annotation.Nullable String preferredLanguageEquals, @Param("preferredLanguageNotEquals") @jakarta.annotation.Nullable String preferredLanguageNotEquals, @Param("preferredLanguageSpecified") @jakarta.annotation.Nullable Boolean preferredLanguageSpecified, @Param("preferredLanguageIn") @jakarta.annotation.Nullable List<String> preferredLanguageIn, @Param("preferredLanguageNotIn") @jakarta.annotation.Nullable List<String> preferredLanguageNotIn, @Param("emailNotificationsEquals") @jakarta.annotation.Nullable Boolean emailNotificationsEquals, @Param("emailNotificationsNotEquals") @jakarta.annotation.Nullable Boolean emailNotificationsNotEquals, @Param("emailNotificationsSpecified") @jakarta.annotation.Nullable Boolean emailNotificationsSpecified, @Param("emailNotificationsIn") @jakarta.annotation.Nullable List<Boolean> emailNotificationsIn, @Param("emailNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> emailNotificationsNotIn, @Param("smsNotificationsEquals") @jakarta.annotation.Nullable Boolean smsNotificationsEquals, @Param("smsNotificationsNotEquals") @jakarta.annotation.Nullable Boolean smsNotificationsNotEquals, @Param("smsNotificationsSpecified") @jakarta.annotation.Nullable Boolean smsNotificationsSpecified, @Param("smsNotificationsIn") @jakarta.annotation.Nullable List<Boolean> smsNotificationsIn, @Param("smsNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> smsNotificationsNotIn, @Param("pushNotificationsEquals") @jakarta.annotation.Nullable Boolean pushNotificationsEquals, @Param("pushNotificationsNotEquals") @jakarta.annotation.Nullable Boolean pushNotificationsNotEquals, @Param("pushNotificationsSpecified") @jakarta.annotation.Nullable Boolean pushNotificationsSpecified, @Param("pushNotificationsIn") @jakarta.annotation.Nullable List<Boolean> pushNotificationsIn, @Param("pushNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> pushNotificationsNotIn, @Param("phoneContains") @jakarta.annotation.Nullable String phoneContains, @Param("phoneDoesNotContain") @jakarta.annotation.Nullable String phoneDoesNotContain, @Param("phoneEquals") @jakarta.annotation.Nullable String phoneEquals, @Param("phoneNotEquals") @jakarta.annotation.Nullable String phoneNotEquals, @Param("phoneSpecified") @jakarta.annotation.Nullable Boolean phoneSpecified, @Param("phoneIn") @jakarta.annotation.Nullable List<String> phoneIn, @Param("phoneNotIn") @jakarta.annotation.Nullable List<String> phoneNotIn, @Param("emailContains") @jakarta.annotation.Nullable String emailContains, @Param("emailDoesNotContain") @jakarta.annotation.Nullable String emailDoesNotContain, @Param("emailEquals") @jakarta.annotation.Nullable String emailEquals, @Param("emailNotEquals") @jakarta.annotation.Nullable String emailNotEquals, @Param("emailSpecified") @jakarta.annotation.Nullable Boolean emailSpecified, @Param("emailIn") @jakarta.annotation.Nullable List<String> emailIn, @Param("emailNotIn") @jakarta.annotation.Nullable List<String> emailNotIn, @Param("appUserIdGreaterThan") @jakarta.annotation.Nullable Long appUserIdGreaterThan, @Param("appUserIdLessThan") @jakarta.annotation.Nullable Long appUserIdLessThan, @Param("appUserIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long appUserIdGreaterThanOrEqual, @Param("appUserIdLessThanOrEqual") @jakarta.annotation.Nullable Long appUserIdLessThanOrEqual, @Param("appUserIdEquals") @jakarta.annotation.Nullable Long appUserIdEquals, @Param("appUserIdNotEquals") @jakarta.annotation.Nullable Long appUserIdNotEquals, @Param("appUserIdSpecified") @jakarta.annotation.Nullable Boolean appUserIdSpecified, @Param("appUserIdIn") @jakarta.annotation.Nullable List<Long> appUserIdIn, @Param("appUserIdNotIn") @jakarta.annotation.Nullable List<Long> appUserIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>countUserPreferences</code> but it also returns the http response headers .
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
   * @param preferredLanguageContains  (optional)
   * @param preferredLanguageDoesNotContain  (optional)
   * @param preferredLanguageEquals  (optional)
   * @param preferredLanguageNotEquals  (optional)
   * @param preferredLanguageSpecified  (optional)
   * @param preferredLanguageIn  (optional)
   * @param preferredLanguageNotIn  (optional)
   * @param emailNotificationsEquals  (optional)
   * @param emailNotificationsNotEquals  (optional)
   * @param emailNotificationsSpecified  (optional)
   * @param emailNotificationsIn  (optional)
   * @param emailNotificationsNotIn  (optional)
   * @param smsNotificationsEquals  (optional)
   * @param smsNotificationsNotEquals  (optional)
   * @param smsNotificationsSpecified  (optional)
   * @param smsNotificationsIn  (optional)
   * @param smsNotificationsNotIn  (optional)
   * @param pushNotificationsEquals  (optional)
   * @param pushNotificationsNotEquals  (optional)
   * @param pushNotificationsSpecified  (optional)
   * @param pushNotificationsIn  (optional)
   * @param pushNotificationsNotIn  (optional)
   * @param phoneContains  (optional)
   * @param phoneDoesNotContain  (optional)
   * @param phoneEquals  (optional)
   * @param phoneNotEquals  (optional)
   * @param phoneSpecified  (optional)
   * @param phoneIn  (optional)
   * @param phoneNotIn  (optional)
   * @param emailContains  (optional)
   * @param emailDoesNotContain  (optional)
   * @param emailEquals  (optional)
   * @param emailNotEquals  (optional)
   * @param emailSpecified  (optional)
   * @param emailIn  (optional)
   * @param emailNotIn  (optional)
   * @param appUserIdGreaterThan  (optional)
   * @param appUserIdLessThan  (optional)
   * @param appUserIdGreaterThanOrEqual  (optional)
   * @param appUserIdLessThanOrEqual  (optional)
   * @param appUserIdEquals  (optional)
   * @param appUserIdNotEquals  (optional)
   * @param appUserIdSpecified  (optional)
   * @param appUserIdIn  (optional)
   * @param appUserIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-preferences/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&preferredLanguage.contains={preferredLanguageContains}&preferredLanguage.doesNotContain={preferredLanguageDoesNotContain}&preferredLanguage.equals={preferredLanguageEquals}&preferredLanguage.notEquals={preferredLanguageNotEquals}&preferredLanguage.specified={preferredLanguageSpecified}&preferredLanguage.in={preferredLanguageIn}&preferredLanguage.notIn={preferredLanguageNotIn}&emailNotifications.equals={emailNotificationsEquals}&emailNotifications.notEquals={emailNotificationsNotEquals}&emailNotifications.specified={emailNotificationsSpecified}&emailNotifications.in={emailNotificationsIn}&emailNotifications.notIn={emailNotificationsNotIn}&smsNotifications.equals={smsNotificationsEquals}&smsNotifications.notEquals={smsNotificationsNotEquals}&smsNotifications.specified={smsNotificationsSpecified}&smsNotifications.in={smsNotificationsIn}&smsNotifications.notIn={smsNotificationsNotIn}&pushNotifications.equals={pushNotificationsEquals}&pushNotifications.notEquals={pushNotificationsNotEquals}&pushNotifications.specified={pushNotificationsSpecified}&pushNotifications.in={pushNotificationsIn}&pushNotifications.notIn={pushNotificationsNotIn}&phone.contains={phoneContains}&phone.doesNotContain={phoneDoesNotContain}&phone.equals={phoneEquals}&phone.notEquals={phoneNotEquals}&phone.specified={phoneSpecified}&phone.in={phoneIn}&phone.notIn={phoneNotIn}&email.contains={emailContains}&email.doesNotContain={emailDoesNotContain}&email.equals={emailEquals}&email.notEquals={emailNotEquals}&email.specified={emailSpecified}&email.in={emailIn}&email.notIn={emailNotIn}&appUserId.greaterThan={appUserIdGreaterThan}&appUserId.lessThan={appUserIdLessThan}&appUserId.greaterThanOrEqual={appUserIdGreaterThanOrEqual}&appUserId.lessThanOrEqual={appUserIdLessThanOrEqual}&appUserId.equals={appUserIdEquals}&appUserId.notEquals={appUserIdNotEquals}&appUserId.specified={appUserIdSpecified}&appUserId.in={appUserIdIn}&appUserId.notIn={appUserIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<Long> countUserPreferencesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("preferredLanguageContains") @jakarta.annotation.Nullable String preferredLanguageContains, @Param("preferredLanguageDoesNotContain") @jakarta.annotation.Nullable String preferredLanguageDoesNotContain, @Param("preferredLanguageEquals") @jakarta.annotation.Nullable String preferredLanguageEquals, @Param("preferredLanguageNotEquals") @jakarta.annotation.Nullable String preferredLanguageNotEquals, @Param("preferredLanguageSpecified") @jakarta.annotation.Nullable Boolean preferredLanguageSpecified, @Param("preferredLanguageIn") @jakarta.annotation.Nullable List<String> preferredLanguageIn, @Param("preferredLanguageNotIn") @jakarta.annotation.Nullable List<String> preferredLanguageNotIn, @Param("emailNotificationsEquals") @jakarta.annotation.Nullable Boolean emailNotificationsEquals, @Param("emailNotificationsNotEquals") @jakarta.annotation.Nullable Boolean emailNotificationsNotEquals, @Param("emailNotificationsSpecified") @jakarta.annotation.Nullable Boolean emailNotificationsSpecified, @Param("emailNotificationsIn") @jakarta.annotation.Nullable List<Boolean> emailNotificationsIn, @Param("emailNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> emailNotificationsNotIn, @Param("smsNotificationsEquals") @jakarta.annotation.Nullable Boolean smsNotificationsEquals, @Param("smsNotificationsNotEquals") @jakarta.annotation.Nullable Boolean smsNotificationsNotEquals, @Param("smsNotificationsSpecified") @jakarta.annotation.Nullable Boolean smsNotificationsSpecified, @Param("smsNotificationsIn") @jakarta.annotation.Nullable List<Boolean> smsNotificationsIn, @Param("smsNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> smsNotificationsNotIn, @Param("pushNotificationsEquals") @jakarta.annotation.Nullable Boolean pushNotificationsEquals, @Param("pushNotificationsNotEquals") @jakarta.annotation.Nullable Boolean pushNotificationsNotEquals, @Param("pushNotificationsSpecified") @jakarta.annotation.Nullable Boolean pushNotificationsSpecified, @Param("pushNotificationsIn") @jakarta.annotation.Nullable List<Boolean> pushNotificationsIn, @Param("pushNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> pushNotificationsNotIn, @Param("phoneContains") @jakarta.annotation.Nullable String phoneContains, @Param("phoneDoesNotContain") @jakarta.annotation.Nullable String phoneDoesNotContain, @Param("phoneEquals") @jakarta.annotation.Nullable String phoneEquals, @Param("phoneNotEquals") @jakarta.annotation.Nullable String phoneNotEquals, @Param("phoneSpecified") @jakarta.annotation.Nullable Boolean phoneSpecified, @Param("phoneIn") @jakarta.annotation.Nullable List<String> phoneIn, @Param("phoneNotIn") @jakarta.annotation.Nullable List<String> phoneNotIn, @Param("emailContains") @jakarta.annotation.Nullable String emailContains, @Param("emailDoesNotContain") @jakarta.annotation.Nullable String emailDoesNotContain, @Param("emailEquals") @jakarta.annotation.Nullable String emailEquals, @Param("emailNotEquals") @jakarta.annotation.Nullable String emailNotEquals, @Param("emailSpecified") @jakarta.annotation.Nullable Boolean emailSpecified, @Param("emailIn") @jakarta.annotation.Nullable List<String> emailIn, @Param("emailNotIn") @jakarta.annotation.Nullable List<String> emailNotIn, @Param("appUserIdGreaterThan") @jakarta.annotation.Nullable Long appUserIdGreaterThan, @Param("appUserIdLessThan") @jakarta.annotation.Nullable Long appUserIdLessThan, @Param("appUserIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long appUserIdGreaterThanOrEqual, @Param("appUserIdLessThanOrEqual") @jakarta.annotation.Nullable Long appUserIdLessThanOrEqual, @Param("appUserIdEquals") @jakarta.annotation.Nullable Long appUserIdEquals, @Param("appUserIdNotEquals") @jakarta.annotation.Nullable Long appUserIdNotEquals, @Param("appUserIdSpecified") @jakarta.annotation.Nullable Boolean appUserIdSpecified, @Param("appUserIdIn") @jakarta.annotation.Nullable List<Long> appUserIdIn, @Param("appUserIdNotIn") @jakarta.annotation.Nullable List<Long> appUserIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>countUserPreferences</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CountUserPreferencesQueryParams} class that allows for
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
   *   <li>preferredLanguageContains -  (optional)</li>
   *   <li>preferredLanguageDoesNotContain -  (optional)</li>
   *   <li>preferredLanguageEquals -  (optional)</li>
   *   <li>preferredLanguageNotEquals -  (optional)</li>
   *   <li>preferredLanguageSpecified -  (optional)</li>
   *   <li>preferredLanguageIn -  (optional)</li>
   *   <li>preferredLanguageNotIn -  (optional)</li>
   *   <li>emailNotificationsEquals -  (optional)</li>
   *   <li>emailNotificationsNotEquals -  (optional)</li>
   *   <li>emailNotificationsSpecified -  (optional)</li>
   *   <li>emailNotificationsIn -  (optional)</li>
   *   <li>emailNotificationsNotIn -  (optional)</li>
   *   <li>smsNotificationsEquals -  (optional)</li>
   *   <li>smsNotificationsNotEquals -  (optional)</li>
   *   <li>smsNotificationsSpecified -  (optional)</li>
   *   <li>smsNotificationsIn -  (optional)</li>
   *   <li>smsNotificationsNotIn -  (optional)</li>
   *   <li>pushNotificationsEquals -  (optional)</li>
   *   <li>pushNotificationsNotEquals -  (optional)</li>
   *   <li>pushNotificationsSpecified -  (optional)</li>
   *   <li>pushNotificationsIn -  (optional)</li>
   *   <li>pushNotificationsNotIn -  (optional)</li>
   *   <li>phoneContains -  (optional)</li>
   *   <li>phoneDoesNotContain -  (optional)</li>
   *   <li>phoneEquals -  (optional)</li>
   *   <li>phoneNotEquals -  (optional)</li>
   *   <li>phoneSpecified -  (optional)</li>
   *   <li>phoneIn -  (optional)</li>
   *   <li>phoneNotIn -  (optional)</li>
   *   <li>emailContains -  (optional)</li>
   *   <li>emailDoesNotContain -  (optional)</li>
   *   <li>emailEquals -  (optional)</li>
   *   <li>emailNotEquals -  (optional)</li>
   *   <li>emailSpecified -  (optional)</li>
   *   <li>emailIn -  (optional)</li>
   *   <li>emailNotIn -  (optional)</li>
   *   <li>appUserIdGreaterThan -  (optional)</li>
   *   <li>appUserIdLessThan -  (optional)</li>
   *   <li>appUserIdGreaterThanOrEqual -  (optional)</li>
   *   <li>appUserIdLessThanOrEqual -  (optional)</li>
   *   <li>appUserIdEquals -  (optional)</li>
   *   <li>appUserIdNotEquals -  (optional)</li>
   *   <li>appUserIdSpecified -  (optional)</li>
   *   <li>appUserIdIn -  (optional)</li>
   *   <li>appUserIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return Long
   */
  @RequestLine("GET /api/user-preferences/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&preferredLanguage.contains={preferredLanguageContains}&preferredLanguage.doesNotContain={preferredLanguageDoesNotContain}&preferredLanguage.equals={preferredLanguageEquals}&preferredLanguage.notEquals={preferredLanguageNotEquals}&preferredLanguage.specified={preferredLanguageSpecified}&preferredLanguage.in={preferredLanguageIn}&preferredLanguage.notIn={preferredLanguageNotIn}&emailNotifications.equals={emailNotificationsEquals}&emailNotifications.notEquals={emailNotificationsNotEquals}&emailNotifications.specified={emailNotificationsSpecified}&emailNotifications.in={emailNotificationsIn}&emailNotifications.notIn={emailNotificationsNotIn}&smsNotifications.equals={smsNotificationsEquals}&smsNotifications.notEquals={smsNotificationsNotEquals}&smsNotifications.specified={smsNotificationsSpecified}&smsNotifications.in={smsNotificationsIn}&smsNotifications.notIn={smsNotificationsNotIn}&pushNotifications.equals={pushNotificationsEquals}&pushNotifications.notEquals={pushNotificationsNotEquals}&pushNotifications.specified={pushNotificationsSpecified}&pushNotifications.in={pushNotificationsIn}&pushNotifications.notIn={pushNotificationsNotIn}&phone.contains={phoneContains}&phone.doesNotContain={phoneDoesNotContain}&phone.equals={phoneEquals}&phone.notEquals={phoneNotEquals}&phone.specified={phoneSpecified}&phone.in={phoneIn}&phone.notIn={phoneNotIn}&email.contains={emailContains}&email.doesNotContain={emailDoesNotContain}&email.equals={emailEquals}&email.notEquals={emailNotEquals}&email.specified={emailSpecified}&email.in={emailIn}&email.notIn={emailNotIn}&appUserId.greaterThan={appUserIdGreaterThan}&appUserId.lessThan={appUserIdLessThan}&appUserId.greaterThanOrEqual={appUserIdGreaterThanOrEqual}&appUserId.lessThanOrEqual={appUserIdLessThanOrEqual}&appUserId.equals={appUserIdEquals}&appUserId.notEquals={appUserIdNotEquals}&appUserId.specified={appUserIdSpecified}&appUserId.in={appUserIdIn}&appUserId.notIn={appUserIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  Long countUserPreferences(@QueryMap(encoded=true) CountUserPreferencesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>countUserPreferences</code> that receives the query parameters as a map,
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
          *   <li>preferredLanguageContains -  (optional)</li>
          *   <li>preferredLanguageDoesNotContain -  (optional)</li>
          *   <li>preferredLanguageEquals -  (optional)</li>
          *   <li>preferredLanguageNotEquals -  (optional)</li>
          *   <li>preferredLanguageSpecified -  (optional)</li>
          *   <li>preferredLanguageIn -  (optional)</li>
          *   <li>preferredLanguageNotIn -  (optional)</li>
          *   <li>emailNotificationsEquals -  (optional)</li>
          *   <li>emailNotificationsNotEquals -  (optional)</li>
          *   <li>emailNotificationsSpecified -  (optional)</li>
          *   <li>emailNotificationsIn -  (optional)</li>
          *   <li>emailNotificationsNotIn -  (optional)</li>
          *   <li>smsNotificationsEquals -  (optional)</li>
          *   <li>smsNotificationsNotEquals -  (optional)</li>
          *   <li>smsNotificationsSpecified -  (optional)</li>
          *   <li>smsNotificationsIn -  (optional)</li>
          *   <li>smsNotificationsNotIn -  (optional)</li>
          *   <li>pushNotificationsEquals -  (optional)</li>
          *   <li>pushNotificationsNotEquals -  (optional)</li>
          *   <li>pushNotificationsSpecified -  (optional)</li>
          *   <li>pushNotificationsIn -  (optional)</li>
          *   <li>pushNotificationsNotIn -  (optional)</li>
          *   <li>phoneContains -  (optional)</li>
          *   <li>phoneDoesNotContain -  (optional)</li>
          *   <li>phoneEquals -  (optional)</li>
          *   <li>phoneNotEquals -  (optional)</li>
          *   <li>phoneSpecified -  (optional)</li>
          *   <li>phoneIn -  (optional)</li>
          *   <li>phoneNotIn -  (optional)</li>
          *   <li>emailContains -  (optional)</li>
          *   <li>emailDoesNotContain -  (optional)</li>
          *   <li>emailEquals -  (optional)</li>
          *   <li>emailNotEquals -  (optional)</li>
          *   <li>emailSpecified -  (optional)</li>
          *   <li>emailIn -  (optional)</li>
          *   <li>emailNotIn -  (optional)</li>
          *   <li>appUserIdGreaterThan -  (optional)</li>
          *   <li>appUserIdLessThan -  (optional)</li>
          *   <li>appUserIdGreaterThanOrEqual -  (optional)</li>
          *   <li>appUserIdLessThanOrEqual -  (optional)</li>
          *   <li>appUserIdEquals -  (optional)</li>
          *   <li>appUserIdNotEquals -  (optional)</li>
          *   <li>appUserIdSpecified -  (optional)</li>
          *   <li>appUserIdIn -  (optional)</li>
          *   <li>appUserIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return Long
      */
      @RequestLine("GET /api/user-preferences/count?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&preferredLanguage.contains={preferredLanguageContains}&preferredLanguage.doesNotContain={preferredLanguageDoesNotContain}&preferredLanguage.equals={preferredLanguageEquals}&preferredLanguage.notEquals={preferredLanguageNotEquals}&preferredLanguage.specified={preferredLanguageSpecified}&preferredLanguage.in={preferredLanguageIn}&preferredLanguage.notIn={preferredLanguageNotIn}&emailNotifications.equals={emailNotificationsEquals}&emailNotifications.notEquals={emailNotificationsNotEquals}&emailNotifications.specified={emailNotificationsSpecified}&emailNotifications.in={emailNotificationsIn}&emailNotifications.notIn={emailNotificationsNotIn}&smsNotifications.equals={smsNotificationsEquals}&smsNotifications.notEquals={smsNotificationsNotEquals}&smsNotifications.specified={smsNotificationsSpecified}&smsNotifications.in={smsNotificationsIn}&smsNotifications.notIn={smsNotificationsNotIn}&pushNotifications.equals={pushNotificationsEquals}&pushNotifications.notEquals={pushNotificationsNotEquals}&pushNotifications.specified={pushNotificationsSpecified}&pushNotifications.in={pushNotificationsIn}&pushNotifications.notIn={pushNotificationsNotIn}&phone.contains={phoneContains}&phone.doesNotContain={phoneDoesNotContain}&phone.equals={phoneEquals}&phone.notEquals={phoneNotEquals}&phone.specified={phoneSpecified}&phone.in={phoneIn}&phone.notIn={phoneNotIn}&email.contains={emailContains}&email.doesNotContain={emailDoesNotContain}&email.equals={emailEquals}&email.notEquals={emailNotEquals}&email.specified={emailSpecified}&email.in={emailIn}&email.notIn={emailNotIn}&appUserId.greaterThan={appUserIdGreaterThan}&appUserId.lessThan={appUserIdLessThan}&appUserId.greaterThanOrEqual={appUserIdGreaterThanOrEqual}&appUserId.lessThanOrEqual={appUserIdLessThanOrEqual}&appUserId.equals={appUserIdEquals}&appUserId.notEquals={appUserIdNotEquals}&appUserId.specified={appUserIdSpecified}&appUserId.in={appUserIdIn}&appUserId.notIn={appUserIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<Long> countUserPreferencesWithHttpInfo(@QueryMap(encoded=true) CountUserPreferencesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>countUserPreferences</code> method in a fluent style.
   */
  public static class CountUserPreferencesQueryParams extends HashMap<String, Object> {
    public CountUserPreferencesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams preferredLanguageContains(@jakarta.annotation.Nullable final String value) {
      put("preferredLanguage.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams preferredLanguageDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("preferredLanguage.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams preferredLanguageEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredLanguage.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams preferredLanguageNotEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredLanguage.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams preferredLanguageSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("preferredLanguage.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams preferredLanguageIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredLanguage.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams preferredLanguageNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredLanguage.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams emailNotificationsEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("emailNotifications.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams emailNotificationsNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("emailNotifications.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams emailNotificationsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("emailNotifications.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams emailNotificationsIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("emailNotifications.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams emailNotificationsNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("emailNotifications.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams smsNotificationsEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("smsNotifications.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams smsNotificationsNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("smsNotifications.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams smsNotificationsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("smsNotifications.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams smsNotificationsIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("smsNotifications.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams smsNotificationsNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("smsNotifications.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams pushNotificationsEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("pushNotifications.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams pushNotificationsNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("pushNotifications.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams pushNotificationsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("pushNotifications.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams pushNotificationsIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("pushNotifications.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams pushNotificationsNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("pushNotifications.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams phoneContains(@jakarta.annotation.Nullable final String value) {
      put("phone.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams phoneDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("phone.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams phoneEquals(@jakarta.annotation.Nullable final String value) {
      put("phone.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams phoneNotEquals(@jakarta.annotation.Nullable final String value) {
      put("phone.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams phoneSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("phone.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams phoneIn(@jakarta.annotation.Nullable final List<String> value) {
      put("phone.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams phoneNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("phone.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams emailContains(@jakarta.annotation.Nullable final String value) {
      put("email.contains", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams emailDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("email.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams emailEquals(@jakarta.annotation.Nullable final String value) {
      put("email.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams emailNotEquals(@jakarta.annotation.Nullable final String value) {
      put("email.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams emailSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("email.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams emailIn(@jakarta.annotation.Nullable final List<String> value) {
      put("email.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams emailNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("email.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.equals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("appUserId.specified", EncodingUtils.encode(value));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("appUserId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams appUserIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("appUserId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public CountUserPreferencesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param userPreferencesDTO  (required)
   * @return UserPreferencesDTO
   */
  @RequestLine("POST /api/user-preferences")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserPreferencesDTO createUserPreferences(@jakarta.annotation.Nonnull UserPreferencesDTO userPreferencesDTO);

  /**
   * 
   * Similar to <code>createUserPreferences</code> but it also returns the http response headers .
   * 
   * @param userPreferencesDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/user-preferences")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserPreferencesDTO> createUserPreferencesWithHttpInfo(@jakarta.annotation.Nonnull UserPreferencesDTO userPreferencesDTO);



  /**
   * 
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/user-preferences/{id}")
  @Headers({
    "Accept: application/json",
  })
  void deleteUserPreferences(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>deleteUserPreferences</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   */
  @RequestLine("DELETE /api/user-preferences/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteUserPreferencesWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



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
   * @param preferredLanguageContains  (optional)
   * @param preferredLanguageDoesNotContain  (optional)
   * @param preferredLanguageEquals  (optional)
   * @param preferredLanguageNotEquals  (optional)
   * @param preferredLanguageSpecified  (optional)
   * @param preferredLanguageIn  (optional)
   * @param preferredLanguageNotIn  (optional)
   * @param emailNotificationsEquals  (optional)
   * @param emailNotificationsNotEquals  (optional)
   * @param emailNotificationsSpecified  (optional)
   * @param emailNotificationsIn  (optional)
   * @param emailNotificationsNotIn  (optional)
   * @param smsNotificationsEquals  (optional)
   * @param smsNotificationsNotEquals  (optional)
   * @param smsNotificationsSpecified  (optional)
   * @param smsNotificationsIn  (optional)
   * @param smsNotificationsNotIn  (optional)
   * @param pushNotificationsEquals  (optional)
   * @param pushNotificationsNotEquals  (optional)
   * @param pushNotificationsSpecified  (optional)
   * @param pushNotificationsIn  (optional)
   * @param pushNotificationsNotIn  (optional)
   * @param phoneContains  (optional)
   * @param phoneDoesNotContain  (optional)
   * @param phoneEquals  (optional)
   * @param phoneNotEquals  (optional)
   * @param phoneSpecified  (optional)
   * @param phoneIn  (optional)
   * @param phoneNotIn  (optional)
   * @param emailContains  (optional)
   * @param emailDoesNotContain  (optional)
   * @param emailEquals  (optional)
   * @param emailNotEquals  (optional)
   * @param emailSpecified  (optional)
   * @param emailIn  (optional)
   * @param emailNotIn  (optional)
   * @param appUserIdGreaterThan  (optional)
   * @param appUserIdLessThan  (optional)
   * @param appUserIdGreaterThanOrEqual  (optional)
   * @param appUserIdLessThanOrEqual  (optional)
   * @param appUserIdEquals  (optional)
   * @param appUserIdNotEquals  (optional)
   * @param appUserIdSpecified  (optional)
   * @param appUserIdIn  (optional)
   * @param appUserIdNotIn  (optional)
   * @param distinct  (optional)
   * @return List&lt;UserPreferencesDTO&gt;
   */
  @RequestLine("GET /api/user-preferences?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&preferredLanguage.contains={preferredLanguageContains}&preferredLanguage.doesNotContain={preferredLanguageDoesNotContain}&preferredLanguage.equals={preferredLanguageEquals}&preferredLanguage.notEquals={preferredLanguageNotEquals}&preferredLanguage.specified={preferredLanguageSpecified}&preferredLanguage.in={preferredLanguageIn}&preferredLanguage.notIn={preferredLanguageNotIn}&emailNotifications.equals={emailNotificationsEquals}&emailNotifications.notEquals={emailNotificationsNotEquals}&emailNotifications.specified={emailNotificationsSpecified}&emailNotifications.in={emailNotificationsIn}&emailNotifications.notIn={emailNotificationsNotIn}&smsNotifications.equals={smsNotificationsEquals}&smsNotifications.notEquals={smsNotificationsNotEquals}&smsNotifications.specified={smsNotificationsSpecified}&smsNotifications.in={smsNotificationsIn}&smsNotifications.notIn={smsNotificationsNotIn}&pushNotifications.equals={pushNotificationsEquals}&pushNotifications.notEquals={pushNotificationsNotEquals}&pushNotifications.specified={pushNotificationsSpecified}&pushNotifications.in={pushNotificationsIn}&pushNotifications.notIn={pushNotificationsNotIn}&phone.contains={phoneContains}&phone.doesNotContain={phoneDoesNotContain}&phone.equals={phoneEquals}&phone.notEquals={phoneNotEquals}&phone.specified={phoneSpecified}&phone.in={phoneIn}&phone.notIn={phoneNotIn}&email.contains={emailContains}&email.doesNotContain={emailDoesNotContain}&email.equals={emailEquals}&email.notEquals={emailNotEquals}&email.specified={emailSpecified}&email.in={emailIn}&email.notIn={emailNotIn}&appUserId.greaterThan={appUserIdGreaterThan}&appUserId.lessThan={appUserIdLessThan}&appUserId.greaterThanOrEqual={appUserIdGreaterThanOrEqual}&appUserId.lessThanOrEqual={appUserIdLessThanOrEqual}&appUserId.equals={appUserIdEquals}&appUserId.notEquals={appUserIdNotEquals}&appUserId.specified={appUserIdSpecified}&appUserId.in={appUserIdIn}&appUserId.notIn={appUserIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  List<UserPreferencesDTO> getAllUserPreferences(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("preferredLanguageContains") @jakarta.annotation.Nullable String preferredLanguageContains, @Param("preferredLanguageDoesNotContain") @jakarta.annotation.Nullable String preferredLanguageDoesNotContain, @Param("preferredLanguageEquals") @jakarta.annotation.Nullable String preferredLanguageEquals, @Param("preferredLanguageNotEquals") @jakarta.annotation.Nullable String preferredLanguageNotEquals, @Param("preferredLanguageSpecified") @jakarta.annotation.Nullable Boolean preferredLanguageSpecified, @Param("preferredLanguageIn") @jakarta.annotation.Nullable List<String> preferredLanguageIn, @Param("preferredLanguageNotIn") @jakarta.annotation.Nullable List<String> preferredLanguageNotIn, @Param("emailNotificationsEquals") @jakarta.annotation.Nullable Boolean emailNotificationsEquals, @Param("emailNotificationsNotEquals") @jakarta.annotation.Nullable Boolean emailNotificationsNotEquals, @Param("emailNotificationsSpecified") @jakarta.annotation.Nullable Boolean emailNotificationsSpecified, @Param("emailNotificationsIn") @jakarta.annotation.Nullable List<Boolean> emailNotificationsIn, @Param("emailNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> emailNotificationsNotIn, @Param("smsNotificationsEquals") @jakarta.annotation.Nullable Boolean smsNotificationsEquals, @Param("smsNotificationsNotEquals") @jakarta.annotation.Nullable Boolean smsNotificationsNotEquals, @Param("smsNotificationsSpecified") @jakarta.annotation.Nullable Boolean smsNotificationsSpecified, @Param("smsNotificationsIn") @jakarta.annotation.Nullable List<Boolean> smsNotificationsIn, @Param("smsNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> smsNotificationsNotIn, @Param("pushNotificationsEquals") @jakarta.annotation.Nullable Boolean pushNotificationsEquals, @Param("pushNotificationsNotEquals") @jakarta.annotation.Nullable Boolean pushNotificationsNotEquals, @Param("pushNotificationsSpecified") @jakarta.annotation.Nullable Boolean pushNotificationsSpecified, @Param("pushNotificationsIn") @jakarta.annotation.Nullable List<Boolean> pushNotificationsIn, @Param("pushNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> pushNotificationsNotIn, @Param("phoneContains") @jakarta.annotation.Nullable String phoneContains, @Param("phoneDoesNotContain") @jakarta.annotation.Nullable String phoneDoesNotContain, @Param("phoneEquals") @jakarta.annotation.Nullable String phoneEquals, @Param("phoneNotEquals") @jakarta.annotation.Nullable String phoneNotEquals, @Param("phoneSpecified") @jakarta.annotation.Nullable Boolean phoneSpecified, @Param("phoneIn") @jakarta.annotation.Nullable List<String> phoneIn, @Param("phoneNotIn") @jakarta.annotation.Nullable List<String> phoneNotIn, @Param("emailContains") @jakarta.annotation.Nullable String emailContains, @Param("emailDoesNotContain") @jakarta.annotation.Nullable String emailDoesNotContain, @Param("emailEquals") @jakarta.annotation.Nullable String emailEquals, @Param("emailNotEquals") @jakarta.annotation.Nullable String emailNotEquals, @Param("emailSpecified") @jakarta.annotation.Nullable Boolean emailSpecified, @Param("emailIn") @jakarta.annotation.Nullable List<String> emailIn, @Param("emailNotIn") @jakarta.annotation.Nullable List<String> emailNotIn, @Param("appUserIdGreaterThan") @jakarta.annotation.Nullable Long appUserIdGreaterThan, @Param("appUserIdLessThan") @jakarta.annotation.Nullable Long appUserIdLessThan, @Param("appUserIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long appUserIdGreaterThanOrEqual, @Param("appUserIdLessThanOrEqual") @jakarta.annotation.Nullable Long appUserIdLessThanOrEqual, @Param("appUserIdEquals") @jakarta.annotation.Nullable Long appUserIdEquals, @Param("appUserIdNotEquals") @jakarta.annotation.Nullable Long appUserIdNotEquals, @Param("appUserIdSpecified") @jakarta.annotation.Nullable Boolean appUserIdSpecified, @Param("appUserIdIn") @jakarta.annotation.Nullable List<Long> appUserIdIn, @Param("appUserIdNotIn") @jakarta.annotation.Nullable List<Long> appUserIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);

  /**
   * 
   * Similar to <code>getAllUserPreferences</code> but it also returns the http response headers .
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
   * @param preferredLanguageContains  (optional)
   * @param preferredLanguageDoesNotContain  (optional)
   * @param preferredLanguageEquals  (optional)
   * @param preferredLanguageNotEquals  (optional)
   * @param preferredLanguageSpecified  (optional)
   * @param preferredLanguageIn  (optional)
   * @param preferredLanguageNotIn  (optional)
   * @param emailNotificationsEquals  (optional)
   * @param emailNotificationsNotEquals  (optional)
   * @param emailNotificationsSpecified  (optional)
   * @param emailNotificationsIn  (optional)
   * @param emailNotificationsNotIn  (optional)
   * @param smsNotificationsEquals  (optional)
   * @param smsNotificationsNotEquals  (optional)
   * @param smsNotificationsSpecified  (optional)
   * @param smsNotificationsIn  (optional)
   * @param smsNotificationsNotIn  (optional)
   * @param pushNotificationsEquals  (optional)
   * @param pushNotificationsNotEquals  (optional)
   * @param pushNotificationsSpecified  (optional)
   * @param pushNotificationsIn  (optional)
   * @param pushNotificationsNotIn  (optional)
   * @param phoneContains  (optional)
   * @param phoneDoesNotContain  (optional)
   * @param phoneEquals  (optional)
   * @param phoneNotEquals  (optional)
   * @param phoneSpecified  (optional)
   * @param phoneIn  (optional)
   * @param phoneNotIn  (optional)
   * @param emailContains  (optional)
   * @param emailDoesNotContain  (optional)
   * @param emailEquals  (optional)
   * @param emailNotEquals  (optional)
   * @param emailSpecified  (optional)
   * @param emailIn  (optional)
   * @param emailNotIn  (optional)
   * @param appUserIdGreaterThan  (optional)
   * @param appUserIdLessThan  (optional)
   * @param appUserIdGreaterThanOrEqual  (optional)
   * @param appUserIdLessThanOrEqual  (optional)
   * @param appUserIdEquals  (optional)
   * @param appUserIdNotEquals  (optional)
   * @param appUserIdSpecified  (optional)
   * @param appUserIdIn  (optional)
   * @param appUserIdNotIn  (optional)
   * @param distinct  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-preferences?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&preferredLanguage.contains={preferredLanguageContains}&preferredLanguage.doesNotContain={preferredLanguageDoesNotContain}&preferredLanguage.equals={preferredLanguageEquals}&preferredLanguage.notEquals={preferredLanguageNotEquals}&preferredLanguage.specified={preferredLanguageSpecified}&preferredLanguage.in={preferredLanguageIn}&preferredLanguage.notIn={preferredLanguageNotIn}&emailNotifications.equals={emailNotificationsEquals}&emailNotifications.notEquals={emailNotificationsNotEquals}&emailNotifications.specified={emailNotificationsSpecified}&emailNotifications.in={emailNotificationsIn}&emailNotifications.notIn={emailNotificationsNotIn}&smsNotifications.equals={smsNotificationsEquals}&smsNotifications.notEquals={smsNotificationsNotEquals}&smsNotifications.specified={smsNotificationsSpecified}&smsNotifications.in={smsNotificationsIn}&smsNotifications.notIn={smsNotificationsNotIn}&pushNotifications.equals={pushNotificationsEquals}&pushNotifications.notEquals={pushNotificationsNotEquals}&pushNotifications.specified={pushNotificationsSpecified}&pushNotifications.in={pushNotificationsIn}&pushNotifications.notIn={pushNotificationsNotIn}&phone.contains={phoneContains}&phone.doesNotContain={phoneDoesNotContain}&phone.equals={phoneEquals}&phone.notEquals={phoneNotEquals}&phone.specified={phoneSpecified}&phone.in={phoneIn}&phone.notIn={phoneNotIn}&email.contains={emailContains}&email.doesNotContain={emailDoesNotContain}&email.equals={emailEquals}&email.notEquals={emailNotEquals}&email.specified={emailSpecified}&email.in={emailIn}&email.notIn={emailNotIn}&appUserId.greaterThan={appUserIdGreaterThan}&appUserId.lessThan={appUserIdLessThan}&appUserId.greaterThanOrEqual={appUserIdGreaterThanOrEqual}&appUserId.lessThanOrEqual={appUserIdLessThanOrEqual}&appUserId.equals={appUserIdEquals}&appUserId.notEquals={appUserIdNotEquals}&appUserId.specified={appUserIdSpecified}&appUserId.in={appUserIdIn}&appUserId.notIn={appUserIdNotIn}&distinct={distinct}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<List<UserPreferencesDTO>> getAllUserPreferencesWithHttpInfo(@Param("idGreaterThan") @jakarta.annotation.Nullable Long idGreaterThan, @Param("idLessThan") @jakarta.annotation.Nullable Long idLessThan, @Param("idGreaterThanOrEqual") @jakarta.annotation.Nullable Long idGreaterThanOrEqual, @Param("idLessThanOrEqual") @jakarta.annotation.Nullable Long idLessThanOrEqual, @Param("idEquals") @jakarta.annotation.Nullable Long idEquals, @Param("idNotEquals") @jakarta.annotation.Nullable Long idNotEquals, @Param("idSpecified") @jakarta.annotation.Nullable Boolean idSpecified, @Param("idIn") @jakarta.annotation.Nullable List<Long> idIn, @Param("idNotIn") @jakarta.annotation.Nullable List<Long> idNotIn, @Param("preferredLanguageContains") @jakarta.annotation.Nullable String preferredLanguageContains, @Param("preferredLanguageDoesNotContain") @jakarta.annotation.Nullable String preferredLanguageDoesNotContain, @Param("preferredLanguageEquals") @jakarta.annotation.Nullable String preferredLanguageEquals, @Param("preferredLanguageNotEquals") @jakarta.annotation.Nullable String preferredLanguageNotEquals, @Param("preferredLanguageSpecified") @jakarta.annotation.Nullable Boolean preferredLanguageSpecified, @Param("preferredLanguageIn") @jakarta.annotation.Nullable List<String> preferredLanguageIn, @Param("preferredLanguageNotIn") @jakarta.annotation.Nullable List<String> preferredLanguageNotIn, @Param("emailNotificationsEquals") @jakarta.annotation.Nullable Boolean emailNotificationsEquals, @Param("emailNotificationsNotEquals") @jakarta.annotation.Nullable Boolean emailNotificationsNotEquals, @Param("emailNotificationsSpecified") @jakarta.annotation.Nullable Boolean emailNotificationsSpecified, @Param("emailNotificationsIn") @jakarta.annotation.Nullable List<Boolean> emailNotificationsIn, @Param("emailNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> emailNotificationsNotIn, @Param("smsNotificationsEquals") @jakarta.annotation.Nullable Boolean smsNotificationsEquals, @Param("smsNotificationsNotEquals") @jakarta.annotation.Nullable Boolean smsNotificationsNotEquals, @Param("smsNotificationsSpecified") @jakarta.annotation.Nullable Boolean smsNotificationsSpecified, @Param("smsNotificationsIn") @jakarta.annotation.Nullable List<Boolean> smsNotificationsIn, @Param("smsNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> smsNotificationsNotIn, @Param("pushNotificationsEquals") @jakarta.annotation.Nullable Boolean pushNotificationsEquals, @Param("pushNotificationsNotEquals") @jakarta.annotation.Nullable Boolean pushNotificationsNotEquals, @Param("pushNotificationsSpecified") @jakarta.annotation.Nullable Boolean pushNotificationsSpecified, @Param("pushNotificationsIn") @jakarta.annotation.Nullable List<Boolean> pushNotificationsIn, @Param("pushNotificationsNotIn") @jakarta.annotation.Nullable List<Boolean> pushNotificationsNotIn, @Param("phoneContains") @jakarta.annotation.Nullable String phoneContains, @Param("phoneDoesNotContain") @jakarta.annotation.Nullable String phoneDoesNotContain, @Param("phoneEquals") @jakarta.annotation.Nullable String phoneEquals, @Param("phoneNotEquals") @jakarta.annotation.Nullable String phoneNotEquals, @Param("phoneSpecified") @jakarta.annotation.Nullable Boolean phoneSpecified, @Param("phoneIn") @jakarta.annotation.Nullable List<String> phoneIn, @Param("phoneNotIn") @jakarta.annotation.Nullable List<String> phoneNotIn, @Param("emailContains") @jakarta.annotation.Nullable String emailContains, @Param("emailDoesNotContain") @jakarta.annotation.Nullable String emailDoesNotContain, @Param("emailEquals") @jakarta.annotation.Nullable String emailEquals, @Param("emailNotEquals") @jakarta.annotation.Nullable String emailNotEquals, @Param("emailSpecified") @jakarta.annotation.Nullable Boolean emailSpecified, @Param("emailIn") @jakarta.annotation.Nullable List<String> emailIn, @Param("emailNotIn") @jakarta.annotation.Nullable List<String> emailNotIn, @Param("appUserIdGreaterThan") @jakarta.annotation.Nullable Long appUserIdGreaterThan, @Param("appUserIdLessThan") @jakarta.annotation.Nullable Long appUserIdLessThan, @Param("appUserIdGreaterThanOrEqual") @jakarta.annotation.Nullable Long appUserIdGreaterThanOrEqual, @Param("appUserIdLessThanOrEqual") @jakarta.annotation.Nullable Long appUserIdLessThanOrEqual, @Param("appUserIdEquals") @jakarta.annotation.Nullable Long appUserIdEquals, @Param("appUserIdNotEquals") @jakarta.annotation.Nullable Long appUserIdNotEquals, @Param("appUserIdSpecified") @jakarta.annotation.Nullable Boolean appUserIdSpecified, @Param("appUserIdIn") @jakarta.annotation.Nullable List<Long> appUserIdIn, @Param("appUserIdNotIn") @jakarta.annotation.Nullable List<Long> appUserIdNotIn, @Param("distinct") @jakarta.annotation.Nullable Boolean distinct);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getAllUserPreferences</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetAllUserPreferencesQueryParams} class that allows for
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
   *   <li>preferredLanguageContains -  (optional)</li>
   *   <li>preferredLanguageDoesNotContain -  (optional)</li>
   *   <li>preferredLanguageEquals -  (optional)</li>
   *   <li>preferredLanguageNotEquals -  (optional)</li>
   *   <li>preferredLanguageSpecified -  (optional)</li>
   *   <li>preferredLanguageIn -  (optional)</li>
   *   <li>preferredLanguageNotIn -  (optional)</li>
   *   <li>emailNotificationsEquals -  (optional)</li>
   *   <li>emailNotificationsNotEquals -  (optional)</li>
   *   <li>emailNotificationsSpecified -  (optional)</li>
   *   <li>emailNotificationsIn -  (optional)</li>
   *   <li>emailNotificationsNotIn -  (optional)</li>
   *   <li>smsNotificationsEquals -  (optional)</li>
   *   <li>smsNotificationsNotEquals -  (optional)</li>
   *   <li>smsNotificationsSpecified -  (optional)</li>
   *   <li>smsNotificationsIn -  (optional)</li>
   *   <li>smsNotificationsNotIn -  (optional)</li>
   *   <li>pushNotificationsEquals -  (optional)</li>
   *   <li>pushNotificationsNotEquals -  (optional)</li>
   *   <li>pushNotificationsSpecified -  (optional)</li>
   *   <li>pushNotificationsIn -  (optional)</li>
   *   <li>pushNotificationsNotIn -  (optional)</li>
   *   <li>phoneContains -  (optional)</li>
   *   <li>phoneDoesNotContain -  (optional)</li>
   *   <li>phoneEquals -  (optional)</li>
   *   <li>phoneNotEquals -  (optional)</li>
   *   <li>phoneSpecified -  (optional)</li>
   *   <li>phoneIn -  (optional)</li>
   *   <li>phoneNotIn -  (optional)</li>
   *   <li>emailContains -  (optional)</li>
   *   <li>emailDoesNotContain -  (optional)</li>
   *   <li>emailEquals -  (optional)</li>
   *   <li>emailNotEquals -  (optional)</li>
   *   <li>emailSpecified -  (optional)</li>
   *   <li>emailIn -  (optional)</li>
   *   <li>emailNotIn -  (optional)</li>
   *   <li>appUserIdGreaterThan -  (optional)</li>
   *   <li>appUserIdLessThan -  (optional)</li>
   *   <li>appUserIdGreaterThanOrEqual -  (optional)</li>
   *   <li>appUserIdLessThanOrEqual -  (optional)</li>
   *   <li>appUserIdEquals -  (optional)</li>
   *   <li>appUserIdNotEquals -  (optional)</li>
   *   <li>appUserIdSpecified -  (optional)</li>
   *   <li>appUserIdIn -  (optional)</li>
   *   <li>appUserIdNotIn -  (optional)</li>
   *   <li>distinct -  (optional)</li>
   *   </ul>
   * @return List&lt;UserPreferencesDTO&gt;
   */
  @RequestLine("GET /api/user-preferences?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&preferredLanguage.contains={preferredLanguageContains}&preferredLanguage.doesNotContain={preferredLanguageDoesNotContain}&preferredLanguage.equals={preferredLanguageEquals}&preferredLanguage.notEquals={preferredLanguageNotEquals}&preferredLanguage.specified={preferredLanguageSpecified}&preferredLanguage.in={preferredLanguageIn}&preferredLanguage.notIn={preferredLanguageNotIn}&emailNotifications.equals={emailNotificationsEquals}&emailNotifications.notEquals={emailNotificationsNotEquals}&emailNotifications.specified={emailNotificationsSpecified}&emailNotifications.in={emailNotificationsIn}&emailNotifications.notIn={emailNotificationsNotIn}&smsNotifications.equals={smsNotificationsEquals}&smsNotifications.notEquals={smsNotificationsNotEquals}&smsNotifications.specified={smsNotificationsSpecified}&smsNotifications.in={smsNotificationsIn}&smsNotifications.notIn={smsNotificationsNotIn}&pushNotifications.equals={pushNotificationsEquals}&pushNotifications.notEquals={pushNotificationsNotEquals}&pushNotifications.specified={pushNotificationsSpecified}&pushNotifications.in={pushNotificationsIn}&pushNotifications.notIn={pushNotificationsNotIn}&phone.contains={phoneContains}&phone.doesNotContain={phoneDoesNotContain}&phone.equals={phoneEquals}&phone.notEquals={phoneNotEquals}&phone.specified={phoneSpecified}&phone.in={phoneIn}&phone.notIn={phoneNotIn}&email.contains={emailContains}&email.doesNotContain={emailDoesNotContain}&email.equals={emailEquals}&email.notEquals={emailNotEquals}&email.specified={emailSpecified}&email.in={emailIn}&email.notIn={emailNotIn}&appUserId.greaterThan={appUserIdGreaterThan}&appUserId.lessThan={appUserIdLessThan}&appUserId.greaterThanOrEqual={appUserIdGreaterThanOrEqual}&appUserId.lessThanOrEqual={appUserIdLessThanOrEqual}&appUserId.equals={appUserIdEquals}&appUserId.notEquals={appUserIdNotEquals}&appUserId.specified={appUserIdSpecified}&appUserId.in={appUserIdIn}&appUserId.notIn={appUserIdNotIn}&distinct={distinct}")
  @Headers({
  "Accept: */*",
  })
  List<UserPreferencesDTO> getAllUserPreferences(@QueryMap(encoded=true) GetAllUserPreferencesQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getAllUserPreferences</code> that receives the query parameters as a map,
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
          *   <li>preferredLanguageContains -  (optional)</li>
          *   <li>preferredLanguageDoesNotContain -  (optional)</li>
          *   <li>preferredLanguageEquals -  (optional)</li>
          *   <li>preferredLanguageNotEquals -  (optional)</li>
          *   <li>preferredLanguageSpecified -  (optional)</li>
          *   <li>preferredLanguageIn -  (optional)</li>
          *   <li>preferredLanguageNotIn -  (optional)</li>
          *   <li>emailNotificationsEquals -  (optional)</li>
          *   <li>emailNotificationsNotEquals -  (optional)</li>
          *   <li>emailNotificationsSpecified -  (optional)</li>
          *   <li>emailNotificationsIn -  (optional)</li>
          *   <li>emailNotificationsNotIn -  (optional)</li>
          *   <li>smsNotificationsEquals -  (optional)</li>
          *   <li>smsNotificationsNotEquals -  (optional)</li>
          *   <li>smsNotificationsSpecified -  (optional)</li>
          *   <li>smsNotificationsIn -  (optional)</li>
          *   <li>smsNotificationsNotIn -  (optional)</li>
          *   <li>pushNotificationsEquals -  (optional)</li>
          *   <li>pushNotificationsNotEquals -  (optional)</li>
          *   <li>pushNotificationsSpecified -  (optional)</li>
          *   <li>pushNotificationsIn -  (optional)</li>
          *   <li>pushNotificationsNotIn -  (optional)</li>
          *   <li>phoneContains -  (optional)</li>
          *   <li>phoneDoesNotContain -  (optional)</li>
          *   <li>phoneEquals -  (optional)</li>
          *   <li>phoneNotEquals -  (optional)</li>
          *   <li>phoneSpecified -  (optional)</li>
          *   <li>phoneIn -  (optional)</li>
          *   <li>phoneNotIn -  (optional)</li>
          *   <li>emailContains -  (optional)</li>
          *   <li>emailDoesNotContain -  (optional)</li>
          *   <li>emailEquals -  (optional)</li>
          *   <li>emailNotEquals -  (optional)</li>
          *   <li>emailSpecified -  (optional)</li>
          *   <li>emailIn -  (optional)</li>
          *   <li>emailNotIn -  (optional)</li>
          *   <li>appUserIdGreaterThan -  (optional)</li>
          *   <li>appUserIdLessThan -  (optional)</li>
          *   <li>appUserIdGreaterThanOrEqual -  (optional)</li>
          *   <li>appUserIdLessThanOrEqual -  (optional)</li>
          *   <li>appUserIdEquals -  (optional)</li>
          *   <li>appUserIdNotEquals -  (optional)</li>
          *   <li>appUserIdSpecified -  (optional)</li>
          *   <li>appUserIdIn -  (optional)</li>
          *   <li>appUserIdNotIn -  (optional)</li>
          *   <li>distinct -  (optional)</li>
      *   </ul>
          * @return List&lt;UserPreferencesDTO&gt;
      */
      @RequestLine("GET /api/user-preferences?id.greaterThan={idGreaterThan}&id.lessThan={idLessThan}&id.greaterThanOrEqual={idGreaterThanOrEqual}&id.lessThanOrEqual={idLessThanOrEqual}&id.equals={idEquals}&id.notEquals={idNotEquals}&id.specified={idSpecified}&id.in={idIn}&id.notIn={idNotIn}&preferredLanguage.contains={preferredLanguageContains}&preferredLanguage.doesNotContain={preferredLanguageDoesNotContain}&preferredLanguage.equals={preferredLanguageEquals}&preferredLanguage.notEquals={preferredLanguageNotEquals}&preferredLanguage.specified={preferredLanguageSpecified}&preferredLanguage.in={preferredLanguageIn}&preferredLanguage.notIn={preferredLanguageNotIn}&emailNotifications.equals={emailNotificationsEquals}&emailNotifications.notEquals={emailNotificationsNotEquals}&emailNotifications.specified={emailNotificationsSpecified}&emailNotifications.in={emailNotificationsIn}&emailNotifications.notIn={emailNotificationsNotIn}&smsNotifications.equals={smsNotificationsEquals}&smsNotifications.notEquals={smsNotificationsNotEquals}&smsNotifications.specified={smsNotificationsSpecified}&smsNotifications.in={smsNotificationsIn}&smsNotifications.notIn={smsNotificationsNotIn}&pushNotifications.equals={pushNotificationsEquals}&pushNotifications.notEquals={pushNotificationsNotEquals}&pushNotifications.specified={pushNotificationsSpecified}&pushNotifications.in={pushNotificationsIn}&pushNotifications.notIn={pushNotificationsNotIn}&phone.contains={phoneContains}&phone.doesNotContain={phoneDoesNotContain}&phone.equals={phoneEquals}&phone.notEquals={phoneNotEquals}&phone.specified={phoneSpecified}&phone.in={phoneIn}&phone.notIn={phoneNotIn}&email.contains={emailContains}&email.doesNotContain={emailDoesNotContain}&email.equals={emailEquals}&email.notEquals={emailNotEquals}&email.specified={emailSpecified}&email.in={emailIn}&email.notIn={emailNotIn}&appUserId.greaterThan={appUserIdGreaterThan}&appUserId.lessThan={appUserIdLessThan}&appUserId.greaterThanOrEqual={appUserIdGreaterThanOrEqual}&appUserId.lessThanOrEqual={appUserIdLessThanOrEqual}&appUserId.equals={appUserIdEquals}&appUserId.notEquals={appUserIdNotEquals}&appUserId.specified={appUserIdSpecified}&appUserId.in={appUserIdIn}&appUserId.notIn={appUserIdNotIn}&distinct={distinct}")
      @Headers({
    "Accept: */*",
      })
   ApiResponse<List<UserPreferencesDTO>> getAllUserPreferencesWithHttpInfo(@QueryMap(encoded=true) GetAllUserPreferencesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getAllUserPreferences</code> method in a fluent style.
   */
  public static class GetAllUserPreferencesQueryParams extends HashMap<String, Object> {
    public GetAllUserPreferencesQueryParams idGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams idLessThan(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams idGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams idLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("id.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams idEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams idNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("id.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams idSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("id.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams idIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams idNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("id.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams preferredLanguageContains(@jakarta.annotation.Nullable final String value) {
      put("preferredLanguage.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams preferredLanguageDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("preferredLanguage.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams preferredLanguageEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredLanguage.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams preferredLanguageNotEquals(@jakarta.annotation.Nullable final String value) {
      put("preferredLanguage.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams preferredLanguageSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("preferredLanguage.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams preferredLanguageIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredLanguage.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams preferredLanguageNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("preferredLanguage.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailNotificationsEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("emailNotifications.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailNotificationsNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("emailNotifications.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailNotificationsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("emailNotifications.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailNotificationsIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("emailNotifications.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailNotificationsNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("emailNotifications.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams smsNotificationsEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("smsNotifications.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams smsNotificationsNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("smsNotifications.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams smsNotificationsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("smsNotifications.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams smsNotificationsIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("smsNotifications.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams smsNotificationsNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("smsNotifications.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams pushNotificationsEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("pushNotifications.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams pushNotificationsNotEquals(@jakarta.annotation.Nullable final Boolean value) {
      put("pushNotifications.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams pushNotificationsSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("pushNotifications.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams pushNotificationsIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("pushNotifications.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams pushNotificationsNotIn(@jakarta.annotation.Nullable final List<Boolean> value) {
      put("pushNotifications.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams phoneContains(@jakarta.annotation.Nullable final String value) {
      put("phone.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams phoneDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("phone.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams phoneEquals(@jakarta.annotation.Nullable final String value) {
      put("phone.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams phoneNotEquals(@jakarta.annotation.Nullable final String value) {
      put("phone.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams phoneSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("phone.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams phoneIn(@jakarta.annotation.Nullable final List<String> value) {
      put("phone.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams phoneNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("phone.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailContains(@jakarta.annotation.Nullable final String value) {
      put("email.contains", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailDoesNotContain(@jakarta.annotation.Nullable final String value) {
      put("email.doesNotContain", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailEquals(@jakarta.annotation.Nullable final String value) {
      put("email.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailNotEquals(@jakarta.annotation.Nullable final String value) {
      put("email.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("email.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailIn(@jakarta.annotation.Nullable final List<String> value) {
      put("email.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams emailNotIn(@jakarta.annotation.Nullable final List<String> value) {
      put("email.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdGreaterThan(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.greaterThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdLessThan(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.lessThan", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdGreaterThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.greaterThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdLessThanOrEqual(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.lessThanOrEqual", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdEquals(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.equals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdNotEquals(@jakarta.annotation.Nullable final Long value) {
      put("appUserId.notEquals", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdSpecified(@jakarta.annotation.Nullable final Boolean value) {
      put("appUserId.specified", EncodingUtils.encode(value));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("appUserId.in", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams appUserIdNotIn(@jakarta.annotation.Nullable final List<Long> value) {
      put("appUserId.notIn", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetAllUserPreferencesQueryParams distinct(@jakarta.annotation.Nullable final Boolean value) {
      put("distinct", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param id  (required)
   * @return UserPreferencesDTO
   */
  @RequestLine("GET /api/user-preferences/{id}")
  @Headers({
    "Accept: */*",
  })
  UserPreferencesDTO getUserPreferences(@Param("id") @jakarta.annotation.Nonnull Long id);

  /**
   * 
   * Similar to <code>getUserPreferences</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/user-preferences/{id}")
  @Headers({
    "Accept: */*",
  })
  ApiResponse<UserPreferencesDTO> getUserPreferencesWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id);



  /**
   * 
   * 
   * @param id  (required)
   * @param userPreferencesDTO  (required)
   * @return UserPreferencesDTO
   */
  @RequestLine("PATCH /api/user-preferences/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserPreferencesDTO partialUpdateUserPreferences(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserPreferencesDTO userPreferencesDTO);

  /**
   * 
   * Similar to <code>partialUpdateUserPreferences</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param userPreferencesDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /api/user-preferences/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserPreferencesDTO> partialUpdateUserPreferencesWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserPreferencesDTO userPreferencesDTO);



  /**
   * 
   * 
   * @param id  (required)
   * @param userPreferencesDTO  (required)
   * @return UserPreferencesDTO
   */
  @RequestLine("PUT /api/user-preferences/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  UserPreferencesDTO updateUserPreferences(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserPreferencesDTO userPreferencesDTO);

  /**
   * 
   * Similar to <code>updateUserPreferences</code> but it also returns the http response headers .
   * 
   * @param id  (required)
   * @param userPreferencesDTO  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/user-preferences/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: */*",
  })
  ApiResponse<UserPreferencesDTO> updateUserPreferencesWithHttpInfo(@Param("id") @jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nonnull UserPreferencesDTO userPreferencesDTO);


}
