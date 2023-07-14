package com.business.hrsAPI;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.hrs.Androidpages.LoginPage;
import com.hrs.resources.HrsJsonBody;
import com.hrs.web.ClinicianConnectPage;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static com.utility.Utilities.JSClick;
import static com.utility.Utilities.ScrollToTheElement;
import static com.utility.Utilities.Wait;
import static com.utility.Utilities.findElement;
import static com.utility.Utilities.findElements;
import static com.utility.Utilities.getWebDriver;
import static com.utility.Utilities.switchPlatformToWeb;
import static com.utility.Utilities.typeWeb;
import static com.utility.Utilities.waitForElementAndClickIfPresent;
import static com.utility.Utilities.waitTime;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HrsApiLogic extends APIBaseClass {
	
	
	 /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : baseUrl()
     * @Description : Generates the Request Specification Generic Function for the
     * BaseUrl without any Headers depending on the Global Value Key from
     * Properties file
     * **********************************************************************
     */
    public static RequestSpecification baseUrlWithoutHeaders(String globalValue) throws IOException {
        RequestSpecification res = RestAssured.given().baseUri(getGlobalValue(globalValue));
        return res;
    }
	
	 /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : baseUrl()
     * @Description : Generates the Request Specification Generic Function for the
     * BaseUrl with content type as Json Format in Headers, depending on the Global Value Key from
     * Properties file
     * **********************************************************************
     */
    public static RequestSpecification baseUrl(String globalValue) throws IOException {
        RequestSpecification res = RestAssured.given().baseUri(getGlobalValue(globalValue))
                .headers("Content-type",
                        "application/json");
        return res;
    }
	
	  /**
     * *********************************************************************
     *
     * @Project Name : HRS- UTAF Framework.
     * @Function Name : generateLogInAccessToken()
     * @Description : Sends the post Requests and gets the Response body for Generating Token for HRS LogIn
     * **********************************************************************
     */
    public void generateLogInAccessToken(String username, String password) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_LogInAccess).redirects().follow(false)
                .body(HrsJsonBody.generateLogInTokenHRSJsonBody(username, password)).log().all()
                .when().post(resourceEndpoint).then().extract().response();
    }

<<<<<<< HEAD
    public void getConfirmAllMedGatewayEndpointsareExposedResponseBody()
            throws IOException {
        response = HrsApiLogic.baseUrlWithoutHeaders(BaseUrl_LogInAccess)
                .header("Authorization","Bearer " +loginAccessToken).log().all().when()
                .get(resourceEndpoint).then().log().all().extract().response();
=======
    
    
    public void getConfirmAllMedGatewayEndpointsareExposedResponseBody()
            throws IOException {
        response = HrsApiLogic.baseUrlWithoutHeaders(BaseUrl_LogInAccess)
                .header("Authorization","Bearer " +loginAccessToken)
                .when()
                .get(resourceEndpoint).then().extract().response();
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
        
    }
    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : getBiometricKycResponseBody()
     * @Description : Get the Response body for Confirm All Med Gateway Endpoints
     * **********************************************************************
     */
    public void getMedicationMasterListPulledFromGatewayResponseBody()
            throws IOException {
    	  response = HrsApiLogic.baseUrlWithoutHeaders(BaseUrl_LogInAccess)
<<<<<<< HEAD
                  .header("Authorization","Bearer " +loginAccessToken).log().all().when()
                  .get(resourceEndpoint).then().log().all().extract().response();
=======
                  .header("Authorization","Bearer " +loginAccessToken)
                  .when()
                  .get(resourceEndpoint).then().extract().response();
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
    }
    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : getBiometricKycResponseBody()
     * @Description : Get the Response body for  New Medication From EMR Modal - Notifications - Reconciled
     * **********************************************************************
     */
    public void getNewMedicationFromEMRModalNotificationsReconciledResponseBody()
            throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_LogInAccess)
        		.header("Authorization","Bearer " +loginAccessToken).log().all().when()
                .get(resourceEndpoint).then().log().all().extract().response();
    }
	
    
 
	
    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : getBiometricKycResponseBody()
     * @Description : Get the Response body for  DELETE - Reduce Medication Frequency - One Reminder Time Slot
     * **********************************************************************
     */
//    public void deleteReduceMedicationFrequencyOneReminderTimeSlotResponseBody(String sessionToken, String msisdn, String xtraceId, String clientId)
//            throws IOException {
//        response = HrsApiLogic.baseUrl(BaseUrl_LogInAccessTokens)
//                .headers("X-Msisdn", msisdn, "X-Traceid", xtraceId)
//                .queryParams("client_id", clientId, "sessionToken", sessionToken, "fields",
//                        "prefix,firstName,lastName,middleName,suffix,mobileNumber,emailAddress,birthDate,birthPlace" +
//                                ",nationality,currentAddressStreet,currentAddressTown,currentAddressProvince," +
//                                "currentAddressCountry,currentAddressZipcode,permanentAddressStreet,permanentAddressTown" +
//                                ",permanentAddressProvince,permanentAddressCountry,permanentAddressZipcode,sourceOfFund" +
//                                ",workNature,idType,idNumber,idPicture,selfiePicture,kycCreated,kycLastEdit,kycCreated" +
//                                ",kycLastEdit")
//                .body(com.hrs.resources.HrsJsonBody.deleteReduceMedicationFrequencyOneReminderTimeSlotJsonBody(sessionToken, msisdn))
//                .log().all().when().get(resourceEndpoint).then().log().all().extract().response();
//    }
//	
    /**
     * *
     * @throws Exception ********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : addMedication()
     * @Description : Get the Response body for  DELETE - Reduce Medication Frequency - Multiple Reminder Time Slots
     * **********************************************************************
     */
<<<<<<< HEAD
//    public void deleteReduceMedicationFrequencyMultipleReminderTimeSlotsResponseBody(String sessionToken, String msisdn, String xtraceId, String clientId)
//            throws IOException {
//        response = HrsApiLogic.baseUrl(BaseUrl_LogInAccessTokens)
//                .headers("X-Msisdn", msisdn, "X-Traceid", xtraceId)
//                .queryParams("client_id", clientId, "sessionToken", sessionToken, "fields",
//                        "prefix,firstName,lastName,middleName,suffix,mobileNumber,emailAddress,birthDate,birthPlace" +
//                                ",nationality,currentAddressStreet,currentAddressTown,currentAddressProvince," +
//                                "currentAddressCountry,currentAddressZipcode,permanentAddressStreet,permanentAddressTown" +
//                                ",permanentAddressProvince,permanentAddressCountry,permanentAddressZipcode,sourceOfFund" +
//                                ",workNature,idType,idNumber,idPicture,selfiePicture,kycCreated,kycLastEdit,kycCreated" +
//                                ",kycLastEdit")
//                .body(com.hrs.resources.HrsJsonBody.deleteReduceMedicationFrequencyMultipleReminderTimeSlotsJsonBody(sessionToken, msisdn))
//                .log().all().when().get(resourceEndpoint).then().log().all().extract().response();
//    }
//	
   
	
	
=======

>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	

    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : testLogger()
     * @Description : Generates the Header Title in the Extent Report
     * **********************************************************************
     */
    public void testLogger(String moduleName, String globalValue, String TestCaseId) throws IOException {
        testLogger = extent.createTest(moduleName + " : " + TestCaseId, "Test to Validate Response-" + TestCaseId);
        testLogger.info("Call post HRS API: HRS API</br>Endpoint url-" + getGlobalValue(globalValue) + resourceEndpoint);
        logger.info("Call post HRS API: HRS API</br>Endpoint url-" + getGlobalValue(globalValue) + resourceEndpoint);
    }

   

   

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getidentitySolutionsProductResponseBody()
     * @Description : Get the Response body for Products in Identity Solutions
     * **********************************************************************
     */
    public void getidentitySolutionsProductResponseBody() throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_Product)
                .headers("X-Tracker", "abcde")
                .when().get(resourceEndpoint)
                .then().log().all().extract().response();
    }

   

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : createIdentitySolutionsProductResponseBody()
     * @Description : Sends the post Requests and gets the Response body for Create Product in Identity Solutions
     * **********************************************************************
     */
    public void createIdentitySolutionsProductResponseBody(String productId, String name, String config_table)
            throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_Product).headers("X-Tracker", "abcde")
                .body(com.hrs.resources.HrsJsonBody.createProductRequestBody(productId, name, config_table)).log().all().when()
                .post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : saveIdentitySolutionsProductResponseBody()
     * @Description : Sends the post Requests and gets the Response body for Save Product in Identity Solutions
     * **********************************************************************
     */
    public void saveIdentitySolutionsProductResponseBody(boolean isActive) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_Product).headers("X-Tracker", "abcde")
                .body(HrsJsonBody.saveProductConfigRequestBody(isActive)).log().all().when().put(resourceEndpoint)
                .then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : gConnectRequestTokenBody()
     * @Description : Sends the post Requests and gets the Response body for Create Request Token Body in Identity Solutions
     * **********************************************************************
     */
    public void gConnectRequestTokenBody(String clientId, String clientSecret, String grantType) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_Product).contentType("application/x-www-form-urlencoded")
                .formParams("client_id", clientId, "client_secret", clientSecret, "grant_type", grantType).log().all()
                .when().post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getKycResponseBody()
     * @Description : Sends the post Requests and gets the Response body for Getting KYC in Identity Solutions
     * **********************************************************************
     */
    public void getKycResponseBody(String sessionToken, String msisdn, String xtraceId, String clientId)
            throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_Product)
                .headers("X-Msisdn", msisdn, "X-Traceid", xtraceId)
                .queryParams("client_id", clientId,
                        "sessionToken", sessionToken).log().all().when()
                .get(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : gConnectAccessCustomer()
     * @Description : Sends the post Requests and gets the Response body for Connect Access Customer in Identity Solutions
     * **********************************************************************
     */
    public void gConnectAccessCustomer(String sessionToken, String clientId, String xtrackerId) throws IOException {
        response = HrsApiLogic.baseUrlWithoutHeaders(BaseUrl_Product).urlEncodingEnabled(false)
                .headers("X-Tracker", xtrackerId,
                        "client_id", clientId,
                        "Authorization", "Bearer " + requestTokenUATAllAccessToken)
                .queryParams("callbackUrl", "http://www.google.com",
                        "sessionToken", sessionToken, "client_id",
                        clientId)
                .log().all().when().get(resourceEndpoint).then().log().all().extract().response();

    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getResponseIdentitySolutionsVerifiers()
     * @Description : Sends the post Requests and gets the Response body for Verifiers in Identity Solutions
     * **********************************************************************
     */
    public void getResponseIdentitySolutionsVerifiers(String clientId, String xTracker) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_Product)
                .headers("X-Tracker", xTracker, "client_id", clientId, "Authorization",
                        "Bearer " + identitySolutionVerificationAccessToken)
                .log().all().when().get(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : postResponseIdentityEWallet()
     * @Description : Sends the post Requests and gets the Response body for Create EWallet in Identity Solutions
     * **********************************************************************
     */
    public void postResponseIdentityEWallet(String clientId, String xTracker, String msisdn, String iv)
            throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_Product)
                .headers("X-Tracker", xTracker, "client_id", clientId, "Authorization",
                        "Bearer " + identitySolutionVerificationAccessToken)
                .body(HrsJsonBody.postIdentitySolutionVerificationEWalletReqBody(msisdn, iv)).log().all().when()
                .post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getScoreAPIRequestallParameterValidResponseBody()
     * @Description : Sends the post Requests and gets the Response body for Get Score in Telcoscore
     * **********************************************************************
     */
    public void getScoreAPIRequestallParameterValidResponseBody(String partner_id, String requested_msisdn,
                                                                String external_source_id) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GTelcoScore)
                .header("Authorization", "Bearer " + finscoreUatAccessToken)
                .body(HrsJsonBody.finScoreUATGetScoreBody(partner_id, requested_msisdn, external_source_id)).log()
                .all().when().post(resourceEndpoint).then().log().all().extract().response();
    }

  
    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getScoreHomeCreditInvalidAccessToken()
     * @Description : Sends the post Requests and gets the Response body for GetScore Home Credit for Invalid token in Telcoscore
     * **********************************************************************
     */

    public void getScoreHomeCreditInvalidAccessToken(String accessToken) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GTelcoScore).headers("Authorization", accessToken)
                .body(HrsJsonBody.homeCreditUATGetScoreBody()).log().all().when().post(resourceEndpoint)
                .then().log()
                .all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : telcoGetScoreInvalidAccessTokenRequest()
     * @Description : Sends the post Requests and gets the Response body for Telco Get Score for Invalid Token in Telcoscore
     * **********************************************************************
     */
    public void telcoGetScoreInvalidAccessTokenRequest(String partner_id, String requested_msisdn,
                                                       String external_source_id) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GTelcoScore)
                .header("Authorization", "invalidaccesstokentest")
                .body(HrsJsonBody.finScoreUATGetScoreBody(partner_id, requested_msisdn, external_source_id)).log()
                .all().when().post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : gTelcoScoregetResponseBody()
     * @Description : Sends the post Requests and gets the Response body for FinscoreScore  in Telcoscore
     * **********************************************************************
     */

    public void gTelcoScoregetResponseBody(String grant_type, String client_id, String client_secret)
            throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GTelcoScore)
                .header("Authorization", "Basic aG9tZWNyZWRpdDpNMWNnbTdxUVdBeDdRSDNUM1V3TXM5ZVhqY3d2czd4MA==")
                .body(HrsJsonBody.getTokensFinscore(grant_type, client_id, client_secret)).log().all().when()
                .post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getGTelcoScoreTrustingSocialAccessToken()
     * @Description : Sends the post Requests and gets the Response body for TrustingSocial for Getting Access Token  in Telcoscore
     * **********************************************************************
     */
    public void getGTelcoScoreTrustingSocialAccessToken() throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GTelcoScore).redirects().follow(false)
                .header("Authorization", "Basic aG9tZWNyZWRpdDpNMWNnbTdxUVdBeDdRSDNUM1V3TXM5ZVhqY3d2czd4MA==")
                .body(HrsJsonBody.postTelcoScoreTrustingSocialUatGenerateTokenBody()).log().all().when()
                .post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getResponseTSGetScoreInvalidExpiredToken()
     * @Description : Sends the post Requests and gets the Response body for TrustingSocial for Getting Invalid Expired Token  in Telcoscore
     * **********************************************************************
     */

    public void getResponseTSGetScoreInvalidExpiredToken(String msisdn, String externalSourceId, String accessToken)
            throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GTelcoScore).redirects().follow(false)
                .header("Authorization", "Bearer " + accessToken)
                .body(HrsJsonBody.postTelcoScoreTrustingSocialUatGetScoreBody(msisdn, externalSourceId)).log().all()
                .when().post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getResponseTrustingSocialGetScoreUat()
     * @Description : Sends the post Requests and gets the Response of GetScore in Trusting Social
     * **********************************************************************
     */
    public void getResponseTrustingSocialGetScoreUat(String msisdn, String externalSourceId) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GTelcoScore).redirects().follow(false)
                .header("Authorization", "Bearer " + trustingSocialUatAccessToken)
                .body(HrsJsonBody.postTelcoScoreTrustingSocialUatGetScoreBody(msisdn, externalSourceId)).log().all()
                .when().post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getGSaveInquireResponseBody()
     * @Description : Sends the post Requests and gets the Response for Inquire in GSave
     * **********************************************************************
     */
    public void getGSaveInquireResponseBody(String mobile_number, String email_address, String email_verified) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GSave).redirects().follow(false)
                .headers("API-Key", "1103FEFEE09B11E8AF40FC4F970A6CFE",
                        "X-Env-Info",
                        "eyJvcmRlclRlcm1pbmFsVHlwZSI6IkFQUCIsInRlcm1pbmFsVHlwZSI6IkFQUCIsImNoYW5uZWwiOiJHQ0FTSF9BUFAiLCJhcHBWZXJzaW9uIjoiNS4xNS4wOjIyNCIsInRva2VuSWQiOiI4YldyOHV0dlRoNHdURjBIdjkrZXZyUHErUTcxSHZhZUJwRE8wc1Y5SUdVU29HbUFhUUVBQUE9PSIsICJjbGllbnRJcCI6IjEwLjI0MC40NC4xOTQifQ==")
                .body(HrsJsonBody.gSaveInquireJson(mobile_number, email_address, email_verified)).log()
                .all().when().post(resourceEndpoint).then().log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getRegisterFieldResponseBody()
     * @Description : Sends the post Requests and gets the Response for Get Register Field in GSave
     * **********************************************************************
     */
    public void getRegisterFieldResponseBody(String mobileno) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GSave).redirects().follow(false)
                .headers("API-Key", "543A70D6E09B11E8AF40FC4F970A6CFE",
                        "X-Env-Info", "eyJvcmRlclRlcm1pbmFsVHlwZSI6IkFQUCIsInRlcm1pbmFsVHlwZSI6IkFQUCIsImNoYW5uZWwiOiJHQ0FTSF9BUFAiLCJhcHBWZXJzaW9uIjoiNS4xNS4wOjIyNCIsInRva2VuSWQiOiI4YldyOHV0dlRoNHdURjBIdjkrZXZyUHErUTcxSHZhZUJwRE8wc1Y5SUdVU29HbUFhUUVBQUE9PSIsICJjbGllbnRJcCI6IjEwLjI0MC40NC4xOTQifQ==")
                .body(HrsJsonBody.getRegisterFieldJson(mobileno)).log().all().when().post(resourceEndpoint).then()
                .log().all().extract().response();
    }

    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getDepositResponseBody()
     * @Description : Sends the post Requests and gets the Response for Get Deposit in GSave
     * **********************************************************************
     */

    public void getDepositResponseBody(String amount, String mobile_number) throws IOException {
        response = HrsApiLogic.baseUrl(BaseUrl_GSave).redirects().follow(false)
                .header("X-Env-Info", "eyJvcmRlclRlcm1pbmFsVHlwZSI6IkFQUCIsInRlcm1pbmFsVHlwZSI6IkFQUCIsImNoYW5uZWwiOiJHQ0FTSF9BUFAiLCJhcHBWZXJzaW9uIjoiNS4xNS4wOjIyNCIsInRva2VuSWQiOiI4YldyOHV0dlRoNHdURjBIdjkrZXZyUHErUTcxSHZhZUJwRE8wc1Y5SUdVU29HbUFhUUVBQUE9PSIsICJjbGllbnRJcCI6IjEwLjI0MC40NC4xOTQifQ==")
                .body(HrsJsonBody.depositeRequestBody(amount, mobile_number)).log().all().when().post(resourceEndpoint)
                .then().log().all().extract().response();
    }
    
    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : getUserIDGenarateResponseBody()
     * @Description : Sends the post Requests and gets the UserID
     * **********************************************************************
     */
    public void getUserIDGenarateResponseBody(String mobile_number) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GSave_Sit).redirects().follow(false)
				.body(HrsJsonBody.createUserIDRequestBody(mobile_number)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}


	/**
	 **********************************************************************
	 * @Project Name : GCash/Mynt - UTAF Framework.
	 * @Function Name : getInvalidMerchantIdResponseBody()
	 * @Description : Sends the post Requests and gets the Response and Validate Error Message
	 ***********************************************************************
	 */
	public void getInvalidMerchantIdResponseBody(String userId, String marchantId) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GSave_Sit).redirects().follow(false)
				.body(HrsJsonBody.invalidMerchantIdRequestBody(userId, marchantId)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}

	/**
	 **********************************************************************
	 * @Project Name : GCash/Mynt - UTAF Framework.
	 * @Function Name : getDepositRiskRejectedResponseBody()
	 * @Description : Sends the post Requests and gets the Response and Validate Error Message
	 ***********************************************************************
	 */
	public void getDepositRiskRejectedResponseBody( String mobile_number, String amount) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GSave_Uat).redirects().follow(false).headers("x-tracker","5555", "API-Key", "543A70D6E09B11E8AF40FC4F970A6CFE", "X-Env-Info", "eyJvcmRlclRlcm1pbmFsVHlwZSI6IkFQUCIsInRlcm1pbmFsVHlwZSI6IkFQUCIsImNoYW5uZWwiOiJHQ0FTSF9BUFAiLCJhcHBWZXJzaW9uIjoiNS4xNS4wOjIyNCIsInRva2VuSWQiOiI4YldyOHV0dlRoNHdURjBIdjkrZXZyUHErUTcxSHZhZUJwRE8wc1Y5SUdVU29HbUFhUUVBQUE9PSIsICJjbGllbnRJcCI6IjEwLjI0MC40NC4xOTQifQ==")
				.body(HrsJsonBody.depositUserIsRiskRejectInGCashRequestBody(mobile_number, amount)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}

	/**
	 **********************************************************************
	 * @Project Name : GCash/Mynt - UTAF Framework.
	 * @Function Name : getDepositRiskRejectedResponseBody()
	 * @Description : Sends the post Requests and gets the Response and Validate Error Message
	 ***********************************************************************
	 */
	public void getWithDrawRiskRejectResponseBody(String mobile_number, String amount) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GSave_Uat).redirects().follow(false).headers("API-Key", "698DDA54E09B11E8AF40FC4F970A6CFE", "X-Env-Info", "eyJvcmRlclRlcm1pbmFsVHlwZSI6IkFQUCIsInRlcm1pbmFsVHlwZSI6IkFQUCIsImNoYW5uZWwiOiJHQ0FTSF9BUFAiLCJhcHBWZXJzaW9uIjoiNS4xNS4wOjIyNCIsInRva2VuSWQiOiI4YldyOHV0dlRoNHdURjBIdjkrZXZyUHErUTcxSHZhZUJwRE8wc1Y5SUdVU29HbUFhUUVBQUE9PSIsICJjbGllbnRJcCI6IjEwLjI0MC40NC4xOTQifQ==")
				.body(HrsJsonBody.withDrawUserIsRiskRejectInGCashRequestBody(mobile_number, amount )).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}

	/**
	 **********************************************************************
	 * @Project Name : GCash/Mynt - UTAF Framework.
	 * @Function Name : inquireforExistingGsaveAccountBlacklistedInCIMBWithDrawRequestBody()
	 * @Description : Sends the post Requests and gets the Response and Validate Error Message
	 ***********************************************************************
	 */
	public void inquireforExistingGsaveAccountBlacklistedInCIMBWithDrawRequestBody(String mobile_number, String email_address, String email_verified) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GSave_Uat).redirects().follow(false).headers("API-Key", "1103FEFEE09B11E8AF40FC4F970A6CFE", "X-Env-Info", "eyJvcmRlclRlcm1pbmFsVHlwZSI6IkFQUCIsInRlcm1pbmFsVHlwZSI6IkFQUCIsImNoYW5uZWwiOiJHQ0FTSF9BUFAiLCJhcHBWZXJzaW9uIjoiNS4xNS4wOjIyNCIsInRva2VuSWQiOiI4YldyOHV0dlRoNHdURjBIdjkrZXZyUHErUTcxSHZhZUJwRE8wc1Y5SUdVU29HbUFhUUVBQUE9PSIsICJjbGllbnRJcCI6IjEwLjI0MC40NC4xOTQifQ==")
				.body(HrsJsonBody.inquireforExistingGsaveBlacklistedInCIMBWithdrawRequestBody(mobile_number, email_address, email_verified)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}


    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : validatestatusCode()
     * @Description : Using for Validating Status Code
     * **********************************************************************
     */
    public void validatestatusCode(String statusCode, String TestCaseId) {
        testLogger.log(Status.INFO, MarkupHelper.createLabel(
                "Request Body: \n" + HrsJsonBody.requestBody.replaceAll("Rudra", "RuXXX").replaceAll("Maharudra@123456", "MaXXXXXXXXXXXXXX"), ExtentColor.GREY));
        logger.info("Request Body: \n" + HrsJsonBody.requestBody.replaceAll("Rudra", "RuXXX").replaceAll("Maharudra@123456", "MaXXXXXXXXXXXXXX"));

                
                
     
        if ((response.getStatusCode() == Integer.parseInt(statusCode))) {

            testLogger.log(Status.PASS, MarkupHelper.createLabel(
            		
                    "Response Body: \n" + response.getBody().print(), ExtentColor.GREEN));
            logger.info("Response Body: \n" + response.getBody().print());
            testLogger.log(Status.PASS, MarkupHelper.createLabel(
                    "Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS), ExtentColor.GREEN));
            logger.info("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS));

            testLogger.log(Status.PASS,
                    MarkupHelper.createLabel("Expected Response code is returned-" + statusCode, ExtentColor.GREEN));
            testLogger.log(Status.PASS, MarkupHelper
                    .createLabel("Actual Response code is returned-" + response.getStatusCode(), ExtentColor.GREEN));
            logger.info("Expected Response code is returned-" + statusCode);

        } else {
            testLogger.log(Status.FAIL, MarkupHelper.createLabel(
                    "Response Body: \n" + response.getBody().print(), ExtentColor.RED));
            logger.info("Response Body: \n" + response.getBody().print());
            testLogger.log(Status.FAIL, MarkupHelper
                    .createLabel("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS), ExtentColor.RED));
            logger.info("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS));
            testLogger.log(Status.FAIL,
                    MarkupHelper.createLabel("Expected Response code is returned-" + statusCode, ExtentColor.RED));
            testLogger.log(Status.FAIL, MarkupHelper
                    .createLabel("Actual Response code is returned-" + response.getStatusCode(), ExtentColor.RED));
            logger.info("Expected Response code is returned-" + response.getStatusCode());
            logger.error(TestCaseId + " - FAILED");
            softAssert.assertEquals(response.getStatusCode(), statusCode, TestCaseId + " - FAILED");
        }
        HrsJsonBody.requestBody="";
    }
    public void validatestatusCodeWithoutResponceBodyPrint(String statusCode, String TestCaseId) {
        testLogger.log(Status.INFO, MarkupHelper.createLabel(
                "Request Body: \n" + HrsJsonBody.requestBody.replaceAll("Rudra", "RuXXX").replaceAll("Maharudra@123456", "MaXXXXXXXXXXXXXX"), ExtentColor.GREY));
        logger.info("Request Body: \n" + HrsJsonBody.requestBody.replaceAll("Rudra", "RuXXX").replaceAll("Maharudra@123456", "MaXXXXXXXXXXXXXX"));

        if ((response.getStatusCode() == Integer.parseInt(statusCode))) {

            testLogger.log(Status.PASS, MarkupHelper.createLabel(
                    "Response Body: \n" + response.getBody(), ExtentColor.GREEN));
            logger.info("Response Body: \n" + response.getBody());
            testLogger.log(Status.PASS, MarkupHelper.createLabel(
                    "Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS), ExtentColor.GREEN));
            logger.info("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS));

            testLogger.log(Status.PASS,
                    MarkupHelper.createLabel("Expected Response code is returned-" + statusCode, ExtentColor.GREEN));
            testLogger.log(Status.PASS, MarkupHelper
                    .createLabel("Actual Response code is returned-" + response.getStatusCode(), ExtentColor.GREEN));
            logger.info("Expected Response code is returned-" + statusCode);

        } else {
            testLogger.log(Status.FAIL, MarkupHelper.createLabel(
                    "Response Body: \n" + response.getBody().print(), ExtentColor.RED));
            logger.info("Response Body: \n" + response.getBody().print());
            testLogger.log(Status.FAIL, MarkupHelper
                    .createLabel("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS), ExtentColor.RED));
            logger.info("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS));
            testLogger.log(Status.FAIL,
                    MarkupHelper.createLabel("Expected Response code is returned-" + statusCode, ExtentColor.RED));
            testLogger.log(Status.FAIL, MarkupHelper
                    .createLabel("Actual Response code is returned-" + response.getStatusCode(), ExtentColor.RED));
            logger.info("Expected Response code is returned-" + response.getStatusCode());
            logger.error(TestCaseId + " - FAILED");
            softAssert.assertEquals(response.getStatusCode(), statusCode, TestCaseId + " - FAILED");
        }
        HrsJsonBody.requestBody="";
    }
    public void validatestatusCodeWithoutResponceBodyPrint(String statusCode, String TestCaseId) {
        testLogger.log(Status.INFO, MarkupHelper.createLabel(
                "Request Body: \n" + HrsJsonBody.requestBody, ExtentColor.GREY));
        logger.info("Request Body: \n" + HrsJsonBody.requestBody);

        if ((response.getStatusCode() == Integer.parseInt(statusCode))) {

//            testLogger.log(Status.PASS, MarkupHelper.createLabel(
//                    "Response Body: \n" + response.getBody().print(), ExtentColor.GREEN));
//            logger.info("Response Body: \n" + response.getBody().print());
            testLogger.log(Status.PASS, MarkupHelper.createLabel(
                    "Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS), ExtentColor.GREEN));
            logger.info("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS));

            testLogger.log(Status.PASS,
                    MarkupHelper.createLabel("Expected Response code is returned-" + statusCode, ExtentColor.GREEN));
            testLogger.log(Status.PASS, MarkupHelper
                    .createLabel("Actual Response code is returned-" + response.getStatusCode(), ExtentColor.GREEN));
            logger.info("Expected Response code is returned-" + statusCode);

        } else {
//            testLogger.log(Status.FAIL, MarkupHelper.createLabel(
//                    "Response Body: \n" + response.getBody().print(), ExtentColor.RED));
//            logger.info("Response Body: \n" + response.getBody().print());
            testLogger.log(Status.FAIL, MarkupHelper
                    .createLabel("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS), ExtentColor.RED));
            logger.info("Response Time(ms)is-" + response.getTimeIn(TimeUnit.MILLISECONDS));
            testLogger.log(Status.FAIL,
                    MarkupHelper.createLabel("Expected Response code is returned-" + statusCode, ExtentColor.RED));
            testLogger.log(Status.FAIL, MarkupHelper
                    .createLabel("Actual Response code is returned-" + response.getStatusCode(), ExtentColor.RED));
            logger.info("Expected Response code is returned-" + response.getStatusCode());
            logger.error(TestCaseId + " - FAILED");
            softAssert.assertEquals(response.getStatusCode(), statusCode, TestCaseId + " - FAILED");
        }
        HrsJsonBody.requestBody="";
    }
    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : smsInquireAPIResponseForUserResponseBody()
     * @Description : Using for Validating Status Code 
     * **********************************************************************
     */
    public void smsInquireAPIResponseForUserResponseBody(String user_id, String mobile_number) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GInsure).redirects().follow(false)
				.body(HrsJsonBody.smsInquireAPIResponseUserRequestBody(user_id, mobile_number)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}
    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : smsInquireAPIResponseNullValuesResponseBody()
     * @Description : Using for Validating Status Code 
     * **********************************************************************
     */
    public void smsInquireAPIResponseNullValuesResponseBody(String mobile_number) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GInsure).redirects().follow(false)
				.body(HrsJsonBody.smsInquireAPIResponseNullValuesRequestBody(mobile_number)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}
    /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : smsPrevalidateAPIResponseResponseBody()
     * @Description : Using for Validating Status Code 
     * **********************************************************************
     */
	public void smsPrevalidateAPIResponseResponseBody(String product_id, String user_id) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GInsure).redirects().follow(false)
				.body(HrsJsonBody.smsPrevalidateAPIResponseRequestBody(product_id, user_id)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}
	
	
	 /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : smsPrevalidateAPIResponseForL3UserIDResponseBody()
     * @Description : Using for Validating Status Code 
     * **********************************************************************
     */
	public void smsPrevalidateAPIResponseForL3UserIDResponseBody(String product_code, String user_id) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GInsure).redirects().follow(false)
				.body(HrsJsonBody.smsPrevalidateAPIResponseRequestBody(product_code, user_id)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}
	 /**
     * *********************************************************************
     *
     * @Project Name : GCash/Mynt - UTAF Framework.
     * @Function Name : smsPrevalidateAPIResponseForL3UserIDResponseBody()
     * @Description : Using for Validating Status Code 
     * **********************************************************************
     */
	public void smsPrevalidateAPIResponseNullValuesResponseResponseBody(String product_code) throws IOException {
		response = HrsApiLogic.baseUrl(BaseUrl_GInsure).redirects().follow(false)
				.body(HrsJsonBody.smsPrevalidateAPIResponseNullValuesResponseRequestBody(product_code)).log().all().when().post(resourceEndpoint)
				.then().log().all().extract().response();
	}
	
	/**
	   * @Project Name : GCash/Mynt - UTAF Framework.
	   * @Function Name : getGGivesRegistrationResponseBody()
	   * @Description : Sends the post Requests and gets the Response for GGives Registration.
	   */
	  public void getGGivesRegistrationResponseBody(String msisdn,String userId,String publicUserId,String loanAmount,
	      String tenor,String fixedDaysOfMonth,String interestRate,String DateAndTime,String repaymentDay) throws IOException {
	    response = HrsApiLogic.baseUrl(BaseUrl_GGives).redirects().follow(false).header("x-msisdn",msisdn)
	        .body(HrsJsonBody.gGivesRegistrationAPIBody(msisdn,userId,publicUserId,loanAmount,tenor,
	            fixedDaysOfMonth,
	            interestRate,DateAndTime,repaymentDay)).log().all().when().post(resourceEndpoint)
	        .then().log().all().extract().response();
	  }
	
	  /**
	   * @Project Name : GCash/Mynt - UTAF Framework.
	   * @Function Name : getGGivesRegistrationResponseBody()
	   * @Description : Sends the post Requests and gets the Response for GGives Registration.
	   */
	  public void getInquireResponseCorrectlyDisplaysRegisteredUserResponseBody(String msisdn, String user_id, String publicUserId, String birth_date, String order_amount) throws IOException {
	    response = HrsApiLogic.baseUrl(BaseUrl_GGives).redirects().follow(false).params("msisdn",msisdn, "agentId",user_id, "publicUserId",publicUserId, "parentProduct", "cash", "product","GGIVES","birthdate",birth_date,"orderAmount","" )
	        .log().all().when().get(resourceEndpoint)
	        .then().log().all().extract().response();
	  }
	
	  
	  
	
	
	
	
	
	
	
	
	
	
}
