package com.hrsAPI.test;

import static com.utility.Utilities.getWebDriver;

import java.io.IOException;

import org.testng.annotations.Test;

import com.business.hrs.HRSBusinessLogic;
import com.business.hrsAPI.HrsApiLogic;
import com.hrs.resources.HrsAPI_TestData_DataProvider;



public class HrsApiTest extends HrsApiLogic {
<<<<<<< HEAD

	Object actual_message_header, actual_kyc_level, actual_details, actual_footer;

=======

	Object actual_message_header, actual_kyc_level, actual_details, actual_footer;

>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
	public static String actual_MedicationID_Count,actual_medGetewayEndPointResponse,actual_PatientName,actual_PatientEpoch,actual_PatientId, 
	actual_PatientHrsId, actual_PatientType,actual_PatientStatus, actual_Medication_createdAtDate,actual_Medication_Name,actual_Medication_Id_0, actual_Medication_ResourceType,actual_Medication_UpdatedAtDate,
	actual_Medication_createdAtDate_1, actual_Medication_Name_1,actual_Medication_Id_1, actual_Medication_ResourceType_1, actual_Medication_UpdatedAtDate_1;


	String moduleName = "HRS API";
<<<<<<< HEAD
	String globalValue = "BaseUrl_HRS";
=======
	String globalValue = BaseUrl_LogInAccess;
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212


	/**
	 * *********************************************************************
	 *
	 * @param : filename : HRSAPI_TestData_sit.xlsx
	 * @param : sheetname :HRS
	 * @throws Exception
	 * @Project Name : HRS - UTAF Framework.
	 * @Function Name : verifyEndpointTestingConfirmAllMedGatewayEndpointsareExposed
	 * @Description :
	 * [T2896359-API][BE] Verify Endpoint Testing - Confirm All Med Gateway Endpoints are Exposed
	 * @Author : Santhosh_Raghavendra
	 * **********************************************************************
	 */

	@Test(dataProviderClass = HrsAPI_TestData_DataProvider.class, dataProvider = "allMedGatewayEndpointsAreExposedInquireAPIResponse", description = "T2896359", enabled = true)
	public void verifyEndpointTestingConfirmAllMedGatewayEndpointsareExposed( String TestCaseID,String statusCode, String userName,String password) throws IOException, InterruptedException {
<<<<<<< HEAD
		testLogger(moduleName, globalValue, TestCaseID);
=======
		
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
		resourceEndpoint = getResource("logInAccessTokenAPI_EndPoint");
		testLogger(moduleName, globalValue, TestCaseID);
		generateLogInAccessToken(userName, password);
<<<<<<< HEAD
		loginAccessToken = responseValueKeyPath("data.attributes.token").toString();
		System.out.println(response.getStatusCode() + "Access Token Response Code");
		resourceEndpoint =  getResource("confirmAllMedGatewayAPI_Endpoints");
		getConfirmAllMedGatewayEndpointsareExposedResponseBody();	
		validatestatusCode(statusCode, TestCaseID );	
		int	actual_medGetewayEndPointResponseValue = response.getStatusCode();
		actual_medGetewayEndPointResponse = String.valueOf(actual_medGetewayEndPointResponseValue);
		System.out.println(TestCaseID);
		System.out.println(actual_medGetewayEndPointResponse);	
		verifyAssertEqualsResults(actual_medGetewayEndPointResponse, statusCode, " Med GetWay EndPoint Response Matched ");
=======
		validatestatusCodeWithoutResponceBodyPrint(statusCode, TestCaseID );
		loginAccessToken = responseValueKeyPath("data.attributes.token").toString();
		log.info("Access Token Response Code   : "+response.getStatusCode());
        testLogger.info("Access Token Response Code   : "+response.getStatusCode());	
		resourceEndpoint =  getResource("confirmAllMedGatewayAPI_Endpoints");
		getConfirmAllMedGatewayEndpointsareExposedResponseBody();			
		validatestatusCodeWithoutResponceBodyPrint(statusCode, TestCaseID );
		int	actual_medGetewayEndPointResponseValue = response.getStatusCode();
		actual_medGetewayEndPointResponse = String.valueOf(actual_medGetewayEndPointResponseValue);
		System.out.println(TestCaseID);
		System.out.println(actual_medGetewayEndPointResponse);
		System.out.println(statusCode);
		verifyAssertEqualsResults(actual_medGetewayEndPointResponse, statusCode, " Med GetWay EndPoint Response ");
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212

	}
	/**
	 * *********************************************************************
	 * @param : filename : HRSAPI_TestData_sit.xlsx
	 * @param : sheetname :HRS
	 * @throws Exception
	 * @Project Name : HRS - UTAF Framework.
	 * @Function Name : verifyMedicationMasterListPulledFromGatewayEndpoint
	 * @Description :
	 * @Description :
	 * [T2896358-API][BE] Verify Medication Master List - Pulled From Gateway Endpoint
	 * @Author : Santhosh_Raghavendra
	 * **********************************************************************
	 */
	@Test(dataProviderClass = HrsAPI_TestData_DataProvider.class, dataProvider = "getMedicationMasterListPulledFromGatewayAPIResponse", description = "T2896358-API", enabled = true)
<<<<<<< HEAD
	public void verifyMedicationMasterListPulledFromGatewayEndpoint(String TestCaseID,String statusCode, String userName,String password, String totalIdCount ) throws IOException, InterruptedException {
		testLogger(moduleName, globalValue, TestCaseID);
		resourceEndpoint = getResource("logInAccessTokenAPI_EndPoint");
		generateLogInAccessToken(userName, password);
		loginAccessToken = responseValueKeyPath("data.attributes.token").toString();
		System.out.println(response.getStatusCode() + "Access Token Response Code");
		resourceEndpoint =  getResource("confirmAllMedGatewayAPI_Endpoints");
		getMedicationMasterListPulledFromGatewayResponseBody();	
		validatestatusCode(statusCode, TestCaseID );
		actual_MedicationID_Count = responseValueKeyPath("data[2087].id").toString();
		System.out.println(actual_MedicationID_Count);
=======
	public void verifyMedicationMasterListPulledFromGatewayEndpoint(String TestCaseID,String statusCode, String userName,String password, String totalIdCount ) throws Exception {
		resourceEndpoint = getResource("logInAccessTokenAPI_EndPoint");
		testLogger(moduleName, globalValue, TestCaseID);
		generateLogInAccessToken(userName, password);
		validatestatusCodeWithoutResponceBodyPrint(statusCode, TestCaseID );
		loginAccessToken = responseValueKeyPath("data.attributes.token").toString();
		log.info("Access Token Response Code   : "+response.getStatusCode());
        testLogger.info("Access Token Response Code   : "+response.getStatusCode());
		resourceEndpoint =  getResource("confirmAllMedGatewayAPI_Endpoints");
		getMedicationMasterListPulledFromGatewayResponseBody();	
		validatestatusCodeWithoutResponceBodyPrint(statusCode, TestCaseID );
		actual_MedicationID_Count = responseValueKeyPath("data[2087].id").toString();
		log.info("Total Medication Count  : "+ actual_MedicationID_Count);
        testLogger.info("Total Medication Count  : "+ actual_MedicationID_Count);
        verifyAssertEqualsResults(actual_MedicationID_Count, totalIdCount, "Total Med ID Count");
        Thread.sleep(3000);
//        HRSBusinessLogic = new com.business.hrs.HRSBusinessLogic();
//        HRSBusinessLogic.addMedication();	
//        Thread.sleep(3000);		
//		getMedicationMasterListPulledFromGatewayResponseBody();	
//		validatestatusCodeWithoutResponceBodyPrint(statusCode, TestCaseID );
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
		actual_Medication_createdAtDate = responseValueKeyPath("data[0].createdAt").toString();
		actual_Medication_Name = responseValueKeyPath("data[0].attributes.name").toString();
		actual_Medication_Id_0 = responseValueKeyPath("data[0].id").toString();
		actual_Medication_ResourceType = responseValueKeyPath("data[0].resourceType").toString();
		actual_Medication_UpdatedAtDate = responseValueKeyPath("data[0].updatedAt").toString();
	
		actual_Medication_createdAtDate_1 = responseValueKeyPath("data[0].createdAt").toString();
		actual_Medication_Name_1 = responseValueKeyPath("data[0].attributes.name").toString();
		actual_Medication_Id_1 = responseValueKeyPath("data[0].id").toString();
		actual_Medication_ResourceType_1 = responseValueKeyPath("data[0].resourceType").toString();
		actual_Medication_UpdatedAtDate_1 = responseValueKeyPath("data[0].updatedAt").toString();
		
<<<<<<< HEAD
		
		verifyAssertEqualsResults(actual_Medication_createdAtDate, "2017-07-22T03:43:15Z[Etc/UTC]", "Medication Created Date");
		verifyAssertEqualsResults(actual_Medication_Name, "tylenol", "Medication Name");
		verifyAssertEqualsResults(actual_Medication_Id_0, "1", "Medication ID No");
		verifyAssertEqualsResults(actual_Medication_ResourceType, "medications", "Medication Resource Type");
		verifyAssertEqualsResults(actual_Medication_UpdatedAtDate, "2022-04-18T16:59:54Z[Etc/UTC]", "Medication Updated Date");
		
		verifyAssertEqualsResults(actual_Medication_createdAtDate_1, "2017-07-22T04:09:44Z[Etc/UTC]", "Medication Created Date");
		verifyAssertEqualsResults(actual_Medication_Name_1, "Lesinopril", "Medication Name");
		verifyAssertEqualsResults(actual_Medication_Id_1, "2", "Medication ID No");
		verifyAssertEqualsResults(actual_Medication_ResourceType_1, "medications", "Medication Resource Type");
		verifyAssertEqualsResults(actual_Medication_UpdatedAtDate_1, "2022-04-18T16:59:54Z[Etc/UTC]", "Medication Updated Date");
	
		verifyAssertEqualsResults(actual_MedicationID_Count, totalIdCount, "Total Med ID Count");
		System.out.println(response.getStatusCode());
=======
		verifyAssertEqualsResults(actual_Medication_createdAtDate, "2017-07-22T03:43:15Z[Etc/UTC]", "Medication Created Date ");
		verifyAssertEqualsResults(actual_Medication_Name, "tylenol", "Medication Name ");
		verifyAssertEqualsResults(actual_Medication_ResourceType, "medications", "Medication Resource Type");
		verifyAssertEqualsResults(actual_Medication_UpdatedAtDate, "2022-04-18T16:59:54Z[Etc/UTC]", "Medication Updated Date");
		
	
		verifyAssertEqualsResults(actual_Medication_createdAtDate_1, "2017-07-22T03:43:15Z[Etc/UTC]", "Medication Created Date ");
		verifyAssertEqualsResults(actual_Medication_Name_1, "tylenol", "Medication Name ");
		verifyAssertEqualsResults(actual_Medication_ResourceType_1, "medications", "Medication Resource Type");
		verifyAssertEqualsResults(actual_Medication_UpdatedAtDate_1, "2022-04-18T16:59:54Z[Etc/UTC]", "Medication Updated Date");
		verifyAssertEqualsResults(actual_MedicationID_Count, totalIdCount, "Total Med ID Count");
		
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212

	}

	/**
	 * *********************************************************************
	 *
	 * @param : filename : HRSAPI_TestData_sit.xlsx
	 * @param : sheetname :HRS
	 * @throws Exception
	 * @Project Name : HRS - UTAF Framework.
	 * @Function Name : verifyNewMedicationFromEMRModalNotificationsReconciled
	 * @Description :
	 * [T2896362-API][BE] Verify New Medication From EMR Modal - Notifications - Reconciled (Notifications - endpoint - GET)
	 * @Author : Santhosh_Raghavendra
	 * **********************************************************************
	 */
		@Test(dataProviderClass = HrsAPI_TestData_DataProvider.class, dataProvider = "getNewMedicationFromEMRModalNotificationsAPIResponse", description = "HRS_API-T2896362", enabled = true)
		public void verifyNewMedicationFromEMRModalNotificationsReconciled( String TestCaseID,String statusCode, String userName,String password, String patientName, String patientEpoch,
				String patientId, String patientHrsId, String patientType, String patientStatus) throws IOException, InterruptedException {
			testLogger(moduleName, globalValue, TestCaseID);
			resourceEndpoint = getResource("logInAccessTokenAPI_EndPoint");
			generateLogInAccessToken(userName, password);
			loginAccessToken = responseValueKeyPath("data.attributes.token").toString();
		
<<<<<<< HEAD
			validatestatusCode(statusCode, TestCaseID );
			resourceEndpoint = getResource("newMedicationFromEMRModalNotifications_Endpoints");
			getNewMedicationFromEMRModalNotificationsReconciledResponseBody();
			validatestatusCode(statusCode, TestCaseID );
=======
			validatestatusCodeWithoutResponceBodyPrint(statusCode, TestCaseID );
			resourceEndpoint = getResource("newMedicationFromEMRModalNotifications_Endpoints");
			getNewMedicationFromEMRModalNotificationsReconciledResponseBody();
			validatestatusCodeWithoutResponceBodyPrint(statusCode, TestCaseID );
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
			actual_PatientName   = responseValueKeyPath("notifications[0].patientName").toString();
			actual_PatientEpoch   = responseValueKeyPath("notifications[0].epoch").toString();
			actual_PatientId   = responseValueKeyPath("notifications[0].id").toString();
			actual_PatientHrsId   = responseValueKeyPath("notifications[0].hrsid").toString();
			actual_PatientType   = responseValueKeyPath("notifications[0].type").toString();
			actual_PatientStatus   = responseValueKeyPath("status").toString();
			
			verifyAssertEqualsResults(actual_PatientName, patientName, "PatientName");
			verifyAssertEqualsResults(actual_PatientEpoch, patientEpoch, "PatientEpoch");
			verifyAssertEqualsResults(actual_PatientId, patientId, "PatientId");
			verifyAssertEqualsResults(actual_PatientHrsId, patientHrsId, "PatientHrsId");
			verifyAssertEqualsResults(actual_PatientType, patientType, "PatientType");
			verifyAssertEqualsResults(actual_PatientStatus, patientStatus, "PatientStatus");	
			System.out.println(response.getStatusCode());
		}

<<<<<<< HEAD

	/**
	 * *********************************************************************
	 *
	 * @param : filename : HRSAPI_TestData_sit.xlsx
	 * @param : sheetname :HRS
	 * @throws Exception
	 * @Project Name : HRS - UTAF Framework.
	 * @Function Name : verifyEndpoinDELETEReduceMedicationFrequencyOneReminderTimeSlot
	 * @Description :
	 * [T2896360-API][BE] Verify v1/tasks Endpoint DELETE - Reduce Medication Frequency - One Reminder Time Slot
	 * @Author : Santhosh_Raghavendra
	 * **********************************************************************
	 */
//		@Test(dataProviderClass = HrsAPI_TestData_DataProvider.class, dataProvider = "deleteReduceMedicationFrequencyOneReminderTimeSlotAPIResponse", description = "HRS_API-T2896359", enabled = true)
//		public void verifyEndpoinDELETEReduceMedicationFrequencyOneReminderTimeSlot( String TestCaseID,String statusCode,String mobile_number,String user_id, 
//				String resultCode, String resultCodeId, String resultMessage, String result_status, String success,
//				String clintId, String function, String regMsgID, String userName, String  password ) throws IOException, InterruptedException {
//			testLogger(moduleName, globalValue, TestCaseID);
//			resourceEndpoint = getResource("deletReduceMedicationFrequencyOneReminder_Endpoints");
//			deleteReduceMedicationFrequencyOneReminderTimeSlotResponseBody( function,  regMsgID, clintId, success);
//			
//			
//			validatestatusCode(statusCode, TestCaseID );
//			actual_result_code = responseValueKeyPath("response.body.resultInfo.resultCode").toString();
//			actual_result_code_id = responseValueKeyPath("response.body.resultInfo.resultCodeId").toString();
//			actual_result_msg = responseValueKeyPath("response.body.resultInfo.resultMsg").toString();
//			actual_result_status = responseValueKeyPath("response.body.resultInfo.resultStatus").toString();
//			actual_result_success = responseValueKeyPath("response.body.resultInfo.success").toString();
//			actual_client_id = responseValueKeyPath("response.head.clientId").toString();
//			actual_function = responseValueKeyPath("response.head.function").toString();
//			actual_request_msg_id = responseValueKeyPath("response.head.reqMsgId").toString();	
//			logger.info("RESPONSE STATUS CODE : " + response.getStatusCode());
//			
//			verifyAssertEqualsResults(actual_result_code, resultCode, "Result Code");
//			verifyAssertEqualsResults(actual_result_code_id, resultCodeId,"Result Code ID");
//			verifyAssertEqualsResults(actual_result_msg, resultMessage, "Result Message");
//			verifyAssertEqualsResults(actual_result_status, result_status,"Result Status");
//			verifyAssertEqualsResults(actual_result_success, success,"Result Success");
//			verifyAssertEqualsResults(actual_client_id, clintId, "Client ID");
//			verifyAssertEqualsResults(actual_function, function, "Fuction");
//			verifyAssertEqualsResults(actual_request_msg_id, regMsgID, "Result Msg ID");
//		}

	/**
	 * *********************************************************************
	 *
	 * @param : filename : HRSAPI_TestData_sit.xlsx
	 * @param : sheetname :HRS
	 * @throws Exception
	 * @Project Name : HRS - UTAF Framework.
	 * @Function Name : v1TasksEndpointDELETEReduceMedicationFrequencyMultipleReminderTimeSlots
	 * @Description :
	 * [T2896361-API][BE] Verify v1/tasks endpoint DELETE - Reduce Medication Frequency - Multiple Reminder Time Slots
	 * @Author : Santhosh_Raghavendra
	 * **********************************************************************
	 */
	//	@Test(dataProviderClass = HrsAPI_TestData_DataProvider.class, dataProvider = "deletReduceMedicationFrequencyMultipleReminderTimeSlotsAPIResponse", description = "HRS_API-T2896361", enabled = true)
	//	public void verifyv1TasksEndpointDELETEReduceMedicationFrequencyMultipleReminderTimeSlots( String TestCaseID,String statusCode,String mobile_number,String user_id, 
	//			String resultCode, String resultCodeId, String resultMessage, String result_status, String success,
	//			String clintId, String function, String regMsgID, String userName, String  password ) throws IOException, InterruptedException {
	//		testLogger(moduleName, globalValue, TestCaseID);
	//		resourceEndpoint = getResource("deletReduceMedicationFrequencyMultipleReminder_Endpoints");
	//		deleteReduceMedicationFrequencyMultipleReminderTimeSlotsResponseBody( function,  regMsgID, clintId, success);
	//		
	//		
	//	
	//	}


=======

	

>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
	















<<<<<<< HEAD







=======
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
}
