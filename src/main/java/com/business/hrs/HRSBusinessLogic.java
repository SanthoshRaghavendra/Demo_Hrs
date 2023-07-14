package com.business.hrs;

import static com.utility.Utilities.*;

import java.util.*;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.driverInstance.DriverManager;
import com.hrs.Androidpages.HomePage;
import com.hrs.Androidpages.LoginPage;
import com.hrs.web.ClinicianConnectPage;
import com.utility.ExtentReporter;



public class HRSBusinessLogic extends BaseClass {
	static String mobileUserName;
	static String mobilePassword;
	//	public static String PCM_UserName = mobileUserName;
	//	public static String PCM_Password = mobilePassword;

	public HRSBusinessLogic() {
		super();

	}

	/**
	 *  @author Santhosh_Raghavendra
	 * @param location,contact,photo
	 * @description Popup Selection
	 * @throws Exception
	 */
	public static void popupSelection() throws Exception {
		String popupMsg = "";
		int count = 1;
		for (int i = 0; i < count; i++) {
			Map<String, String> popup = new HashMap<>();
			if (verifyElementDisplayed(LoginPage.objPermissionTxt)) {
				popupMsg = getText(LoginPage.objPermissionTxt);
				popup.put(getText(LoginPage.objPermissionTxt), "permission");
			} else if (verifyElementDisplayed(LoginPage.objPermissionClose_Btn)) {
				popupMsg = getText(LoginPage.objPermissionClose_Btn);
				popup.put(getText(LoginPage.objPermissionClose_Btn), "alertPopup");
			}
			for (Map.Entry<String, String> popups : popup.entrySet()) {
				if (popupMsg.contains(popups.getKey())) {

					switch (popups.getValue()) {
					case "alertPopup":
						verifyElementPresent(LoginPage.objPermissionClose_Btn, getText(LoginPage.objPermissionClose_Btn));
						click(LoginPage.objPermissionClose_Btn, "Close Button");
						break;

					case "permission":
						if(popupMsg.contains("notifications?")) {
							click(LoginPage.objAllowBtn, "Allow Button");
						}else if(popupMsg.contains("audio")) {
							click(LoginPage.objAllowBtn, "Allow Button");
						}else if(popupMsg.contains("photos")) {
							click(LoginPage.objAllowBtn, "Allow Button");
						}else if(popupMsg.contains("relative")) {
							click(LoginPage.objAllowBtn, "Allow Button");
							break;
						}
					}
				}
				if (verifyElementDisplayed(LoginPage.objPermissionTxt) || verifyElementDisplayed(LoginPage.objPermissionClose_Btn)) {
					count++;
				}
			}
		}
	}



	public static void loginToMobile(String mobileUserName, String mobilePassword) throws Exception
	{
		findElementAndVerifyText(LoginPage.objHRSLogo, "HRS Logo");
		type(LoginPage.objMobileUserNameTextbox, mobileUserName, "User Name ");
		type(LoginPage.objMobilePasswordNameTextbox, mobilePassword, "Password  ");
		verifyElementPresentAndClick(LoginPage.objSubmitButton, "Submit "); 

	}

	public static void validatePatientConnectMobileLoginCodesLoggingIntoPCM() throws Exception {
		refresh();
		waitTime(1000);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objCarePlanButton, 10, "Care Plan ");		
		ScrollToTheElement(ClinicianConnectPage.objPatientConnectMobile);
		JSClick(ClinicianConnectPage.objGenerateLoginCodesBtn, "Generate Login Code");
		Thread.sleep(2000);
		mobileUserName = getText(ClinicianConnectPage.objMobileLoginUserNameText).split(": ")[1].replace(" ", "").trim();
		System.out.println(mobileUserName);
		mobilePassword = getText(ClinicianConnectPage.objMobileLoginPasswordText).split(": ")[1].trim();
		System.out.println(mobilePassword);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objCloseButton, 10, "Close ");
		waitTime(1000);
		switchPlatformToAndroid();
		Thread.sleep(2000);
		findElementAndVerifyText(LoginPage.objHRSLogo, "HRS Logo");
		Thread.sleep(1000);
		DriverManager.getAppiumDriver().findElement(LoginPage.objUsernameField).sendKeys(mobileUserName);
		Thread.sleep(1000);
		DriverManager.getAppiumDriver().findElement(LoginPage.objPasswordField).sendKeys(mobilePassword);		
		Thread.sleep(1000);
		DriverManager.getAppiumDriver().findElement(LoginPage.objSubmitButton).click();
		Thread.sleep(2000);
		DriverManager.getAppiumDriver().findElement(LoginPage.objNextCosentFormButton).click();
		waitTime(200);
		DriverManager.getAppiumDriver().findElement(LoginPage.objNextCosentFormButton).click();
		waitTime(200);
		Swipe("UP", 1);
		waitTime(200);
		DriverManager.getAppiumDriver().findElement(LoginPage.objSumitCosentFormButton).click();
		Thread.sleep(1000);
		findElementAndVerifyText(HomePage.objHomeButtonText, "Home");
		waitTime(200);
		findElementAndVerifyText(LoginPage.objHelpCosentFormButton, "Help"); 

	}


	public static void logInToWebClinicianConnect(String urlHRS, String userName, String password) throws Exception
	{
		switchPlatformToWeb(urlHRS);
		waitTime(1000);
		typeWeb(LoginPage.objUserNameWebTextBox, userName, "UserName");
		typeWeb(LoginPage.objPasswordWebTextBox, password, "Password");
		JSClick(LoginPage.objLoginWebButton, "Login ");
	}

	public static void validatePatientListGeneralDetailsDisplay() throws Exception {
		Thread.sleep(9000);
		findElementAndVerifyTextWeb(ClinicianConnectPage.objLastNameColumnNameText, "Last Name");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objFirstNameColumnNameText, "First Name");
		//	findElementAndVerifyTextWeb(ClinicianConnectPage.objPatientIDColumnNameText, "Patient ID");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objDevicesColumnNameText, "Devices");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objDaysEnrolledColumnNameText, "Days Enrolled");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objStatusColumnNameText, "Status");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objRiskColumnNameText, "Risk");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objReviewedColumnNameText, "Reviewed");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objSubgroupColumnNameText, "Subgroup");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objClinicianColumnNameText, "Clinician");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objConditionsColumnNameText, "Conditions");
		Thread.sleep(2000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();
		Thread.sleep(1000);
		jsExecutor.executeScript("document.querySelector('body > div:nth-child(2) > main-component:nth-child(1) > div:nth-child(1) > section:nth-child(2) > patient-list-component:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2)').scrollLeft=1500");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objActivityColumnNameText, "Activity");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objBloodPressureColumnNameText, "Blood Pressure");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objGlucoseColumnNameText, "Glucose");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objMedsColumnNameText, "Meds");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objPulseOxColumnNameText, "Pulse Ox");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objSurveyColumnNameText, "Survey");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objTemperatureColumnNameText, "Temperature");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objWeightColumnNameText, "Weight");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objImagingColumnNameText, "Imaging");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objStethoscopeColumnNameText, "Stethoscope");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objStepsColumnNameText, "Steps");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objPCVoiceColumnNameText, "PC Voice");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objTodaysCallColumnNameText, "Today's Call");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objLastCallColumnNameText, "Last Call");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objSSNEditedColumnNameText, "SSN - Edited");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objDateTestColumnNameText, "Date Test");
		logger.info(getText(ClinicianConnectPage.objSSNEditedColumnNameText)+" And "+ getText(ClinicianConnectPage.objDateTestColumnNameText) +"  Sortable attributes Dispalyed ");
		ExtentReporter.extentLogger(" Additional Sortable attributes Dispalyed ", getText(ClinicianConnectPage.objSSNEditedColumnNameText)+" And "+ getText(ClinicianConnectPage.objDateTestColumnNameText) +"  Sortable attributes Dispalyed ");
		List<String> columnNameOrderList = new ArrayList<String>();
		columnNameOrderList.add("Last Name");
		columnNameOrderList.add("First Name");
		columnNameOrderList.add("Patient ID");
		columnNameOrderList.add("Devices");
		columnNameOrderList.add("Days Enrolled");
		columnNameOrderList.add("Risk");
		columnNameOrderList.add("Reviewed");
		columnNameOrderList.add("Subgroup");
		columnNameOrderList.add("Clinician");
		columnNameOrderList.add("Conditions");
		columnNameOrderList.add("Activity");
		columnNameOrderList.add("Blood Pressure");
		columnNameOrderList.add("Glucose");
		columnNameOrderList.add("Meds");
		columnNameOrderList.add("Pulse Ox");
		columnNameOrderList.add("Survey");
		columnNameOrderList.add("Temperature");
		columnNameOrderList.add("Weight");
		columnNameOrderList.add("Imaging");
		columnNameOrderList.add("Stethoscope");
		columnNameOrderList.add("Steps");
		columnNameOrderList.add("SSN - Edited");
		columnNameOrderList.add("Date Test");
		columnNameOrderList.add("PC Voice");
		columnNameOrderList.add("Today's Call");
		columnNameOrderList.add("Last Call");
		JSClick(ClinicianConnectPage.objMenuBarButton, "Menu Button ");
		List<String> columnNameText = new ArrayList<String>();
		List<WebElement> colunmNameTextLinkTag  = findElements(ClinicianConnectPage.objColumnList);
		for(WebElement columnNameList : colunmNameTextLinkTag )  
		{
			if(getText(ClinicianConnectPage.objColumnList)!="Status")
			{
				String name = columnNameList.getText().trim();
				columnNameText.add(name);
			}	
		}
		for(int i=0; i<columnNameOrderList.size(); i++)  
		{
			softAssertVerifyText(columnNameText.get(i), columnNameOrderList.get(i));
		}
		JSClick(ClinicianConnectPage.objMenuBarButton, "Menu Button ");
	}

	

	public static void validateMetricsTabGeneralDisplay() throws Exception
	{
		Thread.sleep(5000);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objAddPatientButton, 10, "Add Patients ");
		typeWeb(ClinicianConnectPage.objFirstNameTextBox, generateRandomString(4), "User First Name");
		typeWeb(ClinicianConnectPage.objLastNameTextBox,  generateRandomString(6), "User Last Name");
		typeWeb(ClinicianConnectPage.objDateTextBox, "05/30/1993", "User DOB");
		//	JSClick(ClinicianConnectPage.objMiddleNameTextBox, "Middle Nme");
		typeWeb(ClinicianConnectPage.objPatientIDTextBox, RandomIntegerGenerator(6), "Patient ID");
		Wait(1000);
		JSClick(ClinicianConnectPage.objCustomDropdownBtn, "DropDown ");
		selectByVisibleTextByLocator(ClinicianConnectPage.objCustomDropdownBtn, "Yes");
		typeWeb(ClinicianConnectPage.objCustomSSNEditTextBox, "Test ", "SSN Value ");
		typeWeb(ClinicianConnectPage.objNewCustomeTextField, "text", "Custom Text Value");
		JSClick(ClinicianConnectPage.objSaveButton, "Save ");
		explicitWaitVisibility(ClinicianConnectPage.objCarePlanButton, 10);
		JSClick(ClinicianConnectPage.objCarePlanButton, "Care Plan ");
		ScrollToTheElement(ClinicianConnectPage.objPatientConnectMobile);
		Wait(1000);
		List<WebElement> ListOfPresantsOption = findElements(ClinicianConnectPage.objPresentsOptionsList);
		logger.info("Presents Button Count " + ListOfPresantsOption.size());
		for(WebElement presentsTaglink : ListOfPresantsOption)
		{
			verifyElementExist(presentsTaglink, presentsTaglink.getText());
			validateColorCodeByWebElement(presentsTaglink );
		}
		Wait(1000);
		List<WebElement> ListOfModulesOption = findElements(ClinicianConnectPage.objMadulesOptionsList);
		logger.info("Madules Button Count " + ListOfModulesOption.size());
		for(WebElement madulesTaglink : ListOfModulesOption)
		{
			verifyElementExist(madulesTaglink, madulesTaglink.getText());
			validateColorCodeByWebElement(madulesTaglink);
		}
		verifyElementAvailable(ClinicianConnectPage.objActivityRemindersText, "Activity Reminder ");
		verifyElementAvailable(ClinicianConnectPage.objSurveyRemindersText, "Survey Reminder ");
		verifyElementAvailable(ClinicianConnectPage.objWeightRemindersText, "Weight Reminder ");
		verifyElementAvailable(ClinicianConnectPage.objMedicationRemindersText, "Medication Reminder ");
		verifyElementAvailable(ClinicianConnectPage.objSaveButtonReminderColumn, "Save Button");
		Wait(1000);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objSomethingPresentOption, 10, "SomeThing Present ");
		Thread.sleep(1000);
		validateColorCode(ClinicianConnectPage.objActivityMadulesOption);
		validateColorCode(ClinicianConnectPage.objWeightMadulesOption);
		validateColorCode(ClinicianConnectPage.objMadicationMadulesOption);
		explicitWaitVisibility(ClinicianConnectPage.objSurveyPresentOption, 10);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objSurveyPresentOption, 10, "Survey ");
		Thread.sleep(1000);
		validateColorCode(ClinicianConnectPage.objSurveyMadulesOption);
		Wait(800);
		explicitWaitVisibility(ClinicianConnectPage.objCarePlanSaveBtn, 30);
		JSClick(ClinicianConnectPage.objCarePlanSaveBtn, "Save Care Plan ");
		Wait(200);
		findElementAndVerifyTextWeb(ClinicianConnectPage.objSuccessNotificationText, "Care Plan Metrics were successfully saved.");
		Thread.sleep(1000);
		ScrollToTheElement(ClinicianConnectPage.objPatientConnectMobile);
		Wait(1000);
		validateColorCode(ClinicianConnectPage.objSomethingPresentOption);
		Wait(200);
		validateColorCode(ClinicianConnectPage.objSurveyPresentOption);
		Wait(200);
		validateColorCode(ClinicianConnectPage.objActivityMadulesOption);
		Wait(200);
		validateColorCode(ClinicianConnectPage.objWeightMadulesOption);
		Wait(200);
		validateColorCode(ClinicianConnectPage.objMadicationMadulesOption);
		Wait(200);
		validateColorCode(ClinicianConnectPage.objSurveyMadulesOption);
		refresh();
		waitTime(5000);
		ScrollToTheElement(ClinicianConnectPage.objPatientConnectMobile);
		explicitWaitVisibility(ClinicianConnectPage.objOverViewTabActivityText, 10);
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabActivityText, "Activity");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabWeightText, "Weight");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabMadicationText, "Medications");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabSurveyText, "Survey");
		waitForElementAndClickIfPresent(ClinicianConnectPage.objCarePlanButton, 10, "Care Plan ");
		ScrollToTheElement(ClinicianConnectPage.objPatientConnectMobile);
		explicitWaitVisibility(ClinicianConnectPage.objTemperatureMadulesOption, 10);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objTemperatureMadulesOption, 10, "Temperature ");
		waitForElementAndClickIfPresent(ClinicianConnectPage.objBloodPressureMadulesOption, 10, "Blood Pressure ");
		waitForElementAndClickIfPresent(ClinicianConnectPage.objPlulseOXMadulesOption, 10, "Plulse OX ");
		Wait(200);
		explicitWaitVisibility(ClinicianConnectPage.objCarePlanSaveBtn,30);
		JSClick(ClinicianConnectPage.objCarePlanSaveBtn, "Save Care Plan ");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objSuccessNotificationText, "Care Plan Metrics were successfully saved.");
		Thread.sleep(1000);
		validateColorCode(ClinicianConnectPage.objTemperatureMadulesOption);
		validateColorCode(ClinicianConnectPage.objBloodPressureMadulesOption);
		validateColorCode(ClinicianConnectPage.objPlulseOXMadulesOption);
		refresh();
		waitTime(5000);
		explicitWaitVisibility(ClinicianConnectPage.objOverViewTabActivityText, 10);	
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabActivityText, "Activity");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabWeightText, "Weight");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabMadicationText, "Medications");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabSurveyText, "Survey");

		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabTemperatureText, "Temperature");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabBloodPressureText, "Blood Pressure");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objOverViewTabPluseOXText, "PulseOx");

	}

	public static void validateAddReminderModalGeneralDisplay() throws Exception
	{
		//		JSClick(ClinicianConnectPage.objPatientFullProfile, "Patient Profile");
		refresh();
		waitTime(1000);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objCarePlanButton, 10, "Care Plan ");
		waitTime(1000);
		ScrollToTheElement(ClinicianConnectPage.objAddReminderBtn);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objAddReminderBtn, 10, " Add Reminder ");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objAddReminderHeader, "Add Reminder");
		verifyElementExist(ClinicianConnectPage.objCloseXBtn, "X  Button");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objReminderTimeText, "Reminder Time");

		findElementAndVerifyTextWeb(ClinicianConnectPage.objReminderWindowText, "Reminder Window");
		verifyElementExist(ClinicianConnectPage.objReminderWindowIcon, "Reminder Window Icon");

		findElementAndVerifyTextWeb(ClinicianConnectPage.objRemiderMaduleText, "Reminder Modules");

		List<String> madulesListInOrder = new LinkedList<String>();
		madulesListInOrder.add("Blood Pressure");
		madulesListInOrder.add("Pulse Ox");
		madulesListInOrder.add("Temperature");
		madulesListInOrder.add("Weight");

		List<WebElement> tagLinkMadule =  findElements(ClinicianConnectPage.objSelectedMadulesInReminderMadule);
		for(int i=0; i<=madulesListInOrder.size()-1; i++)
		{
			softAssertVerifyText(tagLinkMadule.get(i).getText(), tagLinkMadule.get(i).getText());
			validateColorCodeByWebElement(tagLinkMadule.get(i));
		}
		findElementAndVerifyTextWeb(ClinicianConnectPage.objCancelButton, "Cancel");
		verifyElementEnabled(ClinicianConnectPage.objSaveReminderMaduleBtn, "Save Button Enable");

		JSClick(ClinicianConnectPage.objReminderWindowDropDown, "Reminder Dropdown");
		Thread.sleep(1000);
		findElement(ClinicianConnectPage.objReminderWindowDropDown).sendKeys(Keys.ENTER);
		waitTime(5000);
		LinkedList<String> dropDownValues=  getAllvaluesFromDD(ClinicianConnectPage.objReminderWindowDropDown); 

		List<String> expectedDropDownValues = new LinkedList<String>();
		expectedDropDownValues.add("30 mins");
		expectedDropDownValues.add("1 hour");
		expectedDropDownValues.add("2 hours");
		for(int i=0; i<=expectedDropDownValues.size()-1; i++)
		{
			softAssertVerifyText(dropDownValues.get(i), expectedDropDownValues.get(i));
		}
		findElement(ClinicianConnectPage.objReminderWindowDropDown).sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		WebElement element = getWebDriver().findElement(ClinicianConnectPage.objReminderWindowIcon);
		moveToElementAction(element, "Reminder Window Icon");
		Thread.sleep(1000);
		verifyElementPresentAndText(ClinicianConnectPage.objReminderWindowIconText, "The Reminder Window will add that amount of time before and after the selected Reminder Time. This creates the Adherence Window. A Reminder Time of 9 AM and Reminder Window of 1 hour creates an Adherence Window of 8 AM - 10 AM.");
		Wait(200);


		for(int j=0; j<=tagLinkMadule.size()-1; j++)
		{
			softAssertVerifyText(tagLinkMadule.get(j).getText(), madulesListInOrder.get(j));
			Thread.sleep(1000);
		}
		JSClick(ClinicianConnectPage.objCancelButton, "Cancel Button");
	}


	public static void validateAddMedicationFrequencyOnceDaily() throws Exception {
		refresh();
		Wait(1000);
<<<<<<< HEAD
=======
		waitForElementAndClickIfPresent(ClinicianConnectPage.objCarePlanButton, 10, "Care Plan ");
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
		ScrollToTheElement(ClinicianConnectPage.objPluseBtn);
		Wait(200);
		JSClick(ClinicianConnectPage.objPluseBtn, "Pluse Button");
		Wait(200);
		WebElement ele = findElement(ClinicianConnectPage.objMedicationNameChooseBtn);
		Actions ac = new Actions(getWebDriver());
		ac.moveToElement(ele).click().build().perform();
		List<WebElement> medicationListValues = findElements(ClinicianConnectPage.objMedicationValuesList);
		for(WebElement medicationValues : medicationListValues )
		{
			if((medicationValues.getText()).equalsIgnoreCase("LIQUAEMIN SODIUM"))
			{
				medicationValues.click();
				break;
			}
		}
		typeWeb(ClinicianConnectPage.objStrengthTextBox, "100" , "Strength Value MG");
		Thread.sleep(1000);
		waitForElementAndClickIfPresent(ClinicianConnectPage.objIsEssentialCheckBox, 10, "Is Essential Check Box ");
		typeWeb(ClinicianConnectPage.objExpirationDate, "08/07/2024" , "Expiration");
		Thread.sleep(1000);
		typeWeb(ClinicianConnectPage.objSpecialInstructionTextBox, "Every Day " , "Special Instructions");
		JSClick(ClinicianConnectPage.objMedicationSubmitBtn, "Submit");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objMedicationNameColumnText, "LIQUAEMIN SODIUM (Essential)");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objMedicationStrengthDoseText, "100 mg x1 Oral");
		findElementAndVerifyTextWeb(ClinicianConnectPage.objMedicationSheduleText, "Everyday");
<<<<<<< HEAD
		findElementAndVerifyTextWeb(ClinicianConnectPage.objMedicationExpirationText, "05/30/2024");
		
		
=======
		findElementAndVerifyTextWeb(ClinicianConnectPage.objMedicationExpirationText, "08/07/2024");


>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
	}

	
	
	
	
	
	public static void addMedication() throws Exception
	{
		waitTime(1000);
	//	getWebDriver().get("https://cc.jerry.hrsqa.com/");
		switchPlatformToWebToAPI("https://cc.jerry.hrsqa.com/");
	//	waitTime(1000);
	//	getWebDriver().findElement(LoginPage.objUserNameWebTextBox).sendKeys("Rudra");
		typeWeb_API(LoginPage.objUserNameWebTextBox, "Rudra", "UserName");
		typeWeb_API(LoginPage.objPasswordWebTextBox, "Maharudra@123456", "Password");
		waitForElementAndClickIfPresent_API(LoginPage.objLoginWebButton, "Login ");
		waitTime(1000);
		Thread.sleep(3000);
		waitForElementAndClickIfPresent_API(ClinicianConnectPage.objPatientFullProfile, "Patient Profile");
		waitTime(1000);
		waitForElementAndClickIfPresent_API(ClinicianConnectPage.objCarePlanButton,  "Care Plan ");
		waitTime(1000);
		ScrollToTheElement(ClinicianConnectPage.objAddReminderBtn);
		waitTime(1000);
		waitForElementAndClickIfPresent_API(ClinicianConnectPage.objPluseBtn, "Pluse Button");
		waitTime(1000);
		WebElement ele = findElement(ClinicianConnectPage.objMedicationNameChooseBtn);
		Actions ac = new Actions(getWebDriver());
		ac.moveToElement(ele).click().build().perform();
		List<WebElement> medicationListValues = findElements(ClinicianConnectPage.objMedicationValuesList);
		for(WebElement medicationValues : medicationListValues )
		{
			if((medicationValues.getText()).equalsIgnoreCase("LIQUAEMIN SODIUM"))
			{
				medicationValues.click();
				break;
			}
		}
		waitTime(1000);
		typeWeb_API(ClinicianConnectPage.objStrengthTextBox, "100" , "Strength Value MG");
		Thread.sleep(1000);
		waitForElementAndClickIfPresent_API(ClinicianConnectPage.objIsEssentialCheckBox, "Is Essential Check Box ");
		typeWeb_API(ClinicianConnectPage.objExpirationDate, "08/07/2024" , "Expiration");
		Thread.sleep(1000);
		typeWeb_API(ClinicianConnectPage.objSpecialInstructionTextBox, "Every Day " , "Special Instructions");
		waitForElementAndClickIfPresent_API(ClinicianConnectPage.objMedicationSubmitBtn, "Submit");
		waitTime(1000);
		getWebDriver().close();
		
		waitTime(1000);
	}

}	


