package com.hrs.test;

import org.testng.annotations.Test;

import com.business.hrs.HRSBusinessLogic;
import com.hrs.Androidpages.LoginPage;
import com.utility.ExtentReporter;
import static com.utility.Utilities.*;

public class ClinicianConnect extends BaseTest{


	
	/**
	 * @throws Exception
	 * @Project Name : HSS - UTAF Framework.
	 * @Function Name : verifyPatientListGeneralDetailsDisplay()
	 * @Description : Verify Patient List General Details display
	 * @Return : N/A
	 * @Date : June, 16, 2023
	 * @Author : Santhosh_Raghavendra
	 */
	@Test(priority =1)
	public void verifyPatientListGeneralDetailsDisplay() throws Exception {
		ExtentReporter.HeaderChildNode("[T2894306]");
		try {
			verifyElementPresentAndClick(LoginPage.objPermissionSignIn_Btn, "Sing In");
			HRSBusinessLogic.popupSelection();
			HRSBusinessLogic.logInToWebClinicianConnect(prop.getproperty("HRS_URL"), prop.getproperty("HRS_USERNAME"), prop.getproperty("HRS_PWD"));
			HRSBusinessLogic.validatePatientListGeneralDetailsDisplay();
			logger.info("[T2894306][AND] Verify Patient List General Details display");
			ExtentReporter.extentLoggerPass("Pass", "[T2894306][AND] Verify Patient List General Details display");
		}catch(AssertionError e){
			logger.error("[T2894306][AND] Verify Patient List General Details display");
			ExtentReporter.extentLoggerFail("Fail","[T2894306][AND] Verify Patient List General Details display");
			throw e;
		}finally {
			softAssert.assertAll();
		}
	}
	/**
	 * @throws Exception
	 * @Project Name : HSS - UTAF Framework.
	 * @Function Name : verifyMetricsTabGeneralDisplay()
	 * @Description : Verify Metrics Tab General Display
	 * @Return : N/A
	 * @Date : June, 16, 2023
	 * @Author : Santhosh_Raghavendra
	 */
	@Test(priority =2, dependsOnMethods = {"verifyPatientListGeneralDetailsDisplay"},alwaysRun=true)
	public void verifyMetricsTabGeneralDisplay() throws Exception {
		ExtentReporter.HeaderChildNode("[T2894304]");
		try {
		
		//	HRSBusinessLogic.logInToWebClinicianConnect(prop.getproperty("HRS_URL"), prop.getproperty("HRS_USERNAME"), prop.getproperty("HRS_PWD"));
			HRSBusinessLogic.validateMetricsTabGeneralDisplay();
			logger.info("[T2894304][AND] Verify Metrics Tab General Display");
			ExtentReporter.extentLoggerPass("Pass", "[T2894304][AND] Verify Metrics Tab General Display");
		}catch(AssertionError e){
			logger.error("[T2894304][AND] Verify Metrics Tab General Display");
			ExtentReporter.extentLoggerFail("Fail","[T2894304][AND] Verify Metrics Tab General Display");
			throw e;
		}finally {
			softAssert.assertAll();
		}
	}
	/**
	 * @throws Exception
	 * @Project Name : HSS - UTAF Framework.
	 * @Function Name : verifyAddReminderModalGeneralDisplay()
	 * @Description : Verify Add Reminder Modal - General Display
	 * @Return : N/A
	 * @Date : June, 16, 2023
	 * @Author : Santhosh_Raghavendra
	 */
	@Test(priority =3, dependsOnMethods = {"verifyMetricsTabGeneralDisplay"},alwaysRun=true)
	public void verifyAddReminderModalGeneralDisplay() throws Exception {
		ExtentReporter.HeaderChildNode("[T2894308]");
		try {
//			HRSBusinessLogic.logInToWebClinicianConnect(prop.getproperty("HRS_URL"), prop.getproperty("HRS_USERNAME"), prop.getproperty("HRS_PWD"));
			HRSBusinessLogic.validateAddReminderModalGeneralDisplay();
			logger.info("[T2894308][AND] Verify Add Reminder Modal - General Display");
			ExtentReporter.extentLoggerPass("Pass", "[T2894308][AND] Verify Add Reminder Modal - General Display");
		}catch(AssertionError e){
			logger.error("[T2894308][AND] Verify Add Reminder Modal - General Display");
			ExtentReporter.extentLoggerFail("Fail","[T2894308][AND] Verify Add Reminder Modal - General Display");
			throw e;
		}finally {
			softAssert.assertAll();
		}
	}

	/**
	 * @throws Exception
	 * @Project Name : HSS - UTAF Framework.
	 * @Function Name : verifyAddMedicationFrequencyOnceDaily()
	 * @Description : Verify Add Medication - Frequency - Once Daily
	 * @Return : N/A
	 * @Date : June, 16, 2023
	 * @Author : Santhosh_Raghavendra
	 */
	
@Test(priority =4, dependsOnMethods = {"verifyAddReminderModalGeneralDisplay"},alwaysRun=true)
	public void verifyAddMedicationFrequencyOnceDaily() throws Exception {
		ExtentReporter.HeaderChildNode("[T2920223]");
		try {
<<<<<<< HEAD
			HRSBusinessLogic.logInToWebClinicianConnect(prop.getproperty("HRS_URL"), prop.getproperty("HRS_USERNAME"), prop.getproperty("HRS_PWD"));
=======
	//		HRSBusinessLogic.logInToWebClinicianConnect(prop.getproperty("HRS_URL"), prop.getproperty("HRS_USERNAME"), prop.getproperty("HRS_PWD"));
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
			HRSBusinessLogic.validateAddMedicationFrequencyOnceDaily();
			logger.info("[T2920223][AND] Verify Add Medication - Frequency - Once Daily");
			ExtentReporter.extentLoggerPass("Pass", "[T2920223][AND] Verify Add Medication - Frequency - Once Daily");
		}catch(AssertionError e){
			logger.error("[T2920223][AND] Verify Add Medication - Frequency - Once Daily");
			ExtentReporter.extentLoggerFail("Fail","[T2920223][AND] Verify Add Medication - Frequency - Once Daily");
			throw e;
		}finally {
			softAssert.assertAll();
		}
	}
	/**
	 * @throws Exception
	 * @Project Name : HSS - UTAF Framework.
	 * @Function Name : patientConnectMobileLoginCodesLoggingIntoPCM()
	 * @Description : PatientConnect Mobile Login Codes - Logging into PCM
	 * @Return : N/A
	 * @Date : June, 16, 2023
	 * @Author : Santhosh_Raghavendra
	 */
	@Test(priority =5, dependsOnMethods = {"verifyAddMedicationFrequencyOnceDaily"},alwaysRun=true)
	public void verifyPatientConnectMobileLoginCodesLoggingIntoPCM() throws Exception {
		ExtentReporter.HeaderChildNode("[T2894305]");
		try {
<<<<<<< HEAD
=======
			
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
			HRSBusinessLogic.validatePatientConnectMobileLoginCodesLoggingIntoPCM();
			logger.info("[T2894305][AND] PatientConnect Mobile Login Codes - Logging into PCM");
			ExtentReporter.extentLoggerPass("Pass", "[T2894305][AND] PatientConnect Mobile Login Codes - Logging into PCM");
		}catch(AssertionError e){
			logger.error("[T2894305][AND] PatientConnect Mobile Login Codes - Logging into PCM");
			ExtentReporter.extentLoggerFail("Fail","[T2894305][AND] PatientConnect Mobile Login Codes - Logging into PCM");
			throw e;
		}finally {
			softAssert.assertAll();
		}
	}
	
	
	
	
	
	
	
	
}
