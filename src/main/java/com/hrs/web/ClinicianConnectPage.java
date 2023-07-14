package com.hrs.web;

import org.openqa.selenium.By;

public class ClinicianConnectPage {


	//Patint List 
	public static By objPatientListButton = By.id("navPatientList");
	//Action Text  
	public static By objActionsText = By.xpath("//span[text()='Actions']");
	//Last Name Column 
	public static By objLastNameColumnNameText = By.xpath("//span[text()='Last Name']");
	//First Name Column 
	public static By objFirstNameColumnNameText = By.xpath("//span[text()='First Name']");
	//Patient ID Column 
	public static By objPatientIDColumnNameText = By.id("//*[@role='button']/child::span[text()='Patient ID']");
	//Devices Column 
	public static By objDevicesColumnNameText = By.xpath("//span[text()='Devices']");
	//Days Enrolled Column 
	public static By objDaysEnrolledColumnNameText = By.xpath("//span[text()='Days Enrolled']");
	//Status Column 
	public static By objStatusColumnNameText = By.xpath("//span[text()='Status']");
	//Risk Column 
	public static By objRiskColumnNameText = By.xpath("//span[text()='Risk']");
	//Reviewed Column 
	public static By objReviewedColumnNameText = By.xpath("//span[text()='Reviewed']");
	//Subgroup Column 
	public static By objSubgroupColumnNameText = By.xpath("//span[text()='Subgroup']");
	//Clinician Column 
	public static By objClinicianColumnNameText = By.xpath("//span[text()='Clinician']");
	//Conditions Column 
	public static By objConditionsColumnNameText = By.xpath("//span[text()='Conditions']");
	// Scroll
	public static By objScroll = By.xpath("(//*[@class='ui-grid-viewport ng-isolate-scope' ])[2]");

	//Activity Column 
	public static By objActivityColumnNameText = By.xpath("//span[text()='Activity']");
	//Blood Pressure Column 
	public static By objBloodPressureColumnNameText = By.xpath("//span[text()='Blood Pressure']");
	//Glucose Column 
	public static By objGlucoseColumnNameText = By.xpath("//span[text()='Glucose']");
	//Meds Column 
	public static By objMedsColumnNameText = By.xpath("//span[text()='Meds']");
	//Pulse Ox Column 
	public static By objPulseOxColumnNameText = By.xpath("//span[text()='Pulse Ox']");
	//Survey Column 
	public static By objSurveyColumnNameText = By.xpath("//span[text()='Survey']");
	//Temperature Column 
	public static By objTemperatureColumnNameText = By.xpath("//span[text()='Temperature']");
	//Weight Column 
	public static By objWeightColumnNameText = By.xpath("//span[text()='Weight']");
	//Imaging Column 
	public static By objImagingColumnNameText = By.xpath("//span[text()='Imaging']");
	//Stethoscope Column 
	public static By objStethoscopeColumnNameText = By.xpath("//span[text()='Stethoscope']");
	//Steps Column 
	public static By objStepsColumnNameText = By.xpath("//span[text()='Steps']");
	//PC Voice Column 
	public static By objPCVoiceColumnNameText = By.xpath("//span[text()='PC Voice']");
	//Today's Call Column 
	public static By objTodaysCallColumnNameText = By.xpath("(//span[text()='PC Voice']/parent::div/parent::div/parent::div/following-sibling::div[@role='columnheader']/child::div[@role='columnheader']/child::div[@role='button']/child::span[@class='ui-grid-header-cell-label ng-binding'])[1]");
	//Last Call Column 
	public static By objLastCallColumnNameText = By.xpath("//span[text()='Last Call']");
	//========================================Custom Object
	//SSN - Edited Column 
	public static By objSSNEditedColumnNameText = By.xpath("//span[text()='SSN - Edited']");
	//Date Test Column 
	public static By objDateTestColumnNameText = By.xpath("//span[text()='Date Test']");
	//Menu Button
	public static By objMenuBarButton = By.xpath("//*[@class='ui-grid-icon-container']");
	//List Of Column
	public static By objColumnList = By.xpath("//*[@class='ui-grid-menu-item']/parent::li/following-sibling::li/child::button");

	public static By objColums = By.xpath("//span[@class='ui-grid-header-cell-label ng-binding']");

	public static By objListColum = By.xpath("(//*[@class='ui-grid-viewport ng-isolate-scope' ])[2]");


	//User Last Name
	public static By objUserLastName = By.xpath("//*[text()='Last Name']/parent::div/following-sibling::div/descendant::input");
	//Patient Full Profile
	public static By objPatientFullProfile = By.xpath("//i[@class='fa fa-caret-right fa-2x']");	
	//Patient Connect Mobile   
	public static By objPatientConnectMobile = By.xpath("//*[text()='PatientConnect Mobile']");	
	//Generate Login Codes Button 
	public static By objGenerateLoginCodesBtn = By.xpath("//*[@class='qa-pcmobile_info--btn btn btn-primary']");
	//Mobile Login User Name
	public static By objMobileLoginUserNameText = By.xpath("//*[@class='qa-pc_mobile--name']");
	//Mobile Login Password
	public static By objMobileLoginPasswordText = By.xpath("//*[@class='qa-pc_mobile--code']");	
	//Close Button
	public static By objCloseButton = By.xpath("//*[text()='Close']");

//===========================Create Patient Form
	//  Add Patient Button  
	public static By objAddPatientButton = By.xpath("//*[@id='toolbarAddPatient']");
	//First Name Text Box  
	public static By objFirstNameTextBox = By.id("newPatient_first");
	//First Name Text Box  
	public static By objMiddleNameTextBox = By.id("newPatient_middle");
	//Last Name Text Box  
	public static By objLastNameTextBox = By.id("newPatient_last");
	//Date Text Box  
	public static By objDateTextBox = By.xpath("//*[@name='dp']");
	//Patient ID Text Box  
	public static By objPatientIDTextBox = By.id("newPatient_pid");
	//Custom Dropdown  
	public static By objCustomDropdownBtn = By.id("newPatient_customField_0_select");
	
	//Custome DropDown Option 
	public static By objCustomDropdownOption = By.xpath("//*[@id='newPatient_customField_0_select']/option");
	//SSN Edit Text Box  
	public static By objCustomSSNEditTextBox = By.id("newPatient_customField_2");
	//New Custom Text Box  
	public static By objNewCustomeTextField = By.id("newPatient_customField_3");
	//Save Button  
	public static By objSaveButton = By.xpath("//span[text()='Save']");


	//Care Plan Button
	public static By objCarePlanButton = By.id("patientProfileCareplanTab");
	
	//Present Header Text
	public static By objPresentHeaderText = By.xpath("//*[@id='patient_care--metrics']/following-sibling::div/child::div/child::h6[text()='Presets']");
	//Madule Header Text
	public static By objMaduleHeaderText = By.xpath("//*[@id='patient_care--metrics']/following-sibling::div/child::div/child::h6[text()='Modules']");
	
	//============================================Present
	//SomeThing Present 
	public static By objSomethingPresentOption = By.id("patient_care--metrics--presets-button-somepresetthing");
	//SomeThing Present 
	//Healthy
	public static By objHealthyOption = By.id("patient_care--metrics--presets-button-healthy");
	//cond1
	public static By objCond1Option = By.id("patient_care--metrics--presets-button-cond1");
	//cond2activity
	public static By objCond2ActivityOption = By.id("patient_care--metrics--presets-button-cond2activity");
	//cond3bpox
	public static By objCond3BpoxOption = By.id("patient_care--metrics--presets-button-cond3bpox");
	//cond4med
	public static By objCond4MedOption = By.id("patient_care--metrics--presets-button-cond4med");
	//cond5gmps
	public static By objCond5Gmpsoption = By.id("patient_care--metrics--presets-button-cond5gmps");
	//cond6abgm
	public static By objCond6AbgmOption = By.id("patient_care--metrics--presets-button-cond6abgm");
	//cond7img
	public static By objCond7ImgOption = By.id("patient_care--metrics--presets-button-cond7img");
	//cond8stw
	public static By objCond8StwOption = By.id("patient_care--metrics--presets-button-cond8stw");
	//cond9amigt
	public static By objCond9AmightOption = By.id("patient_care--metrics--presets-button-cond9aimgt");
	//condition10
	public static By objCondition10Option = By.id("patient_care--metrics--presets-button-condition10");
	//condition11
	public static By objCondtion11Option = By.id("patient_care--metrics--presets-button-condition11");
	//condition12
	public static By objCondition12Option = By.id("patient_care--metrics--presets-button-condition12");
	//Hypertension
	public static By objHyperTensionOption = By.id("patient_care--metrics--presets-button-hypertension");
	//oncology
	public static By objOncologyOption = By.id("patient_care--metrics--presets-button-oncology");
	//Mainthree
	public static By objMainThreeOption = By.id("patient_care--metrics--presets-button-mainthree");
	//Somepresentthing
	public static By objSomePresentThingOption = By.id("patient_care--metrics--presets-button-somepresetthing");
	//Vapelung
	public static By objVapeLungOption = By.id("patient_care--metrics--presets-button-vapelung");
	//WackyHair
	public static By objWackyHairOption = By.id("patient_care--metrics--presets-button-wackyhair");
	//ActivityPresent
	public static By objActivityPresentOption = By.id("patient_care--metrics--presets-button-activity_preset");
	//BpPresent
	public static By objBpPresentOption = By.id("patient_care--metrics--presets-button-bp_preset");
	//GlucosePresent
	public static By objGlucosePresentOption = By.id("patient_care--metrics--presets-button-glucose_preset");
	//MedicationPresent
	public static By objMedicationPresentOption = By.id("patient_care--metrics--presets-button-medication_preset");
	//Pulseoxpresent
	public static By objPulseOxPresentOption = By.id("patient_care--metrics--presets-button-pulseox_preset");
	//SurveyPresent
	public static By objSurveyPresentOption = By.id("patient_care--metrics--presets-button-survey_preset");
	//Temperature  Present
	public static By objTemperaturePresentOption = By.id("patient_care--metrics--presets-button-temperature_preset");
	//Weight Present
	public static By objWeightPresentOption = By.id("patient_care--metrics--presets-button-weight_preset");
	//Wi Present
	public static By objWiPresentOption = By.id("patient_care--metrics--presets-button-wi_preset");
	//Stethoscope Present
	public static By objStethoscopePresentOption = By.id("patient_care--metrics--presets-button-stethoscope_preset");
	//Steps Present
	public static By objStepsPresentOption = By.id("patient_care--metrics--presets-button-steps_preset");
	// Madule Activity  patient_care--metrics--modules-button-Activity
	public static By objActivityModulesOption = By.xpath("public static By objActivityModulesOption = By.id(\"patient_care--metrics--presets-button-steps_preset\");");

	//============================================================== Modules 
	
	//Presents Options List
	public static By objPresentsOptionsList = By.xpath("(//*[@class='col-xs-12 col-md-12 col-lg-12 col-xl-12']/child::div)[1][@class='row']/child::div/child::button");
	//Madules Options List
	public static By objMadulesOptionsList = By.xpath("(//*[@class='col-xs-12 col-md-12 col-lg-12 col-xl-12']/child::div)[2][@class='row']/child::div/child::button");
	
	
	//Activity Madules
	public static By objActivityMadulesOption = By.id("patient_care--metrics--modules-button-Activity");
	//Blood Pressure Madules
	public static By objBloodPressureMadulesOption = By.id("patient_care--metrics--modules-button-Blood Pressure");
	//Glocose Madules
	public static By objGlocoseMadulesOption = By.id("patient_care--metrics--modules-button-Glucose");
	//Madication Madules
	public static By objMadicationMadulesOption = By.id("patient_care--metrics--modules-button-Medication");
	//Pluse OX Madules
	public static By objPlulseOXMadulesOption = By.id("patient_care--metrics--modules-button-Pulse Ox");
	//Survey Madules
	public static By objSurveyMadulesOption = By.id("patient_care--metrics--modules-button-Survey");
	//Temperature Madules
	public static By objTemperatureMadulesOption = By.id("patient_care--metrics--modules-button-Temperature");
	//Weight Madules
	public static By objWeightMadulesOption = By.id("patient_care--metrics--modules-button-Weight");
	//Imagining Madules
	public static By objImaginingMadulesOption = By.id("patient_care--metrics--modules-button-Imaging");
	//Patient Connect Voice Madules
	public static By objPatientConnectVoiceMadulesOption = By.id("patient_care--metrics--modules-button-PatientConnect Voice");
	//Stethoscope Madules
	public static By objStethosScopeMadulesOption = By.id("patient_care--metrics--modules-button-Stethoscope");
	//Steps Madules
	public static By objStepsMadulesOption = By.id("patient_care--metrics--modules-button-Steps");
	//Save Button In Reminder column
	public static By objSaveButtonReminderColumn = By.xpath("//*[@class='qa-medication_reminders_table--btn-save btn btn-primary ladda-button']/child::span[text()='Save']");
	
	//Activity Reminders
	public static By objActivityRemindersText = By.id("patient_care--metrics--reminders-activity--input");
	//Survey Reminders
	public static By objSurveyRemindersText = By.xpath("patient_care--metrics--reminders-survey--select");
	//Weight Reminders
	public static By objWeightRemindersText = By.xpath("//*[text()='Biometric Reminders']");
	//Medication Reminders
	public static By objMedicationRemindersText = By.xpath("//p[text()='Medication Reminders']");
	
	//Notification Text 
	public static By objSuccessNotificationText = By.xpath("//*[@class='notifier__notification-message']");
	//Save Button Care Plan Tab
	public static By objCarePlanSaveBtn = By.id("patient_care--metrics--btn-save");
	//======================== OverView Tab
	//OverViewTab Activity Text
	public static By objOverViewTabActivityText = By.xpath("//*[text()='Activity']");
	//OverViewTab Weight Text
	public static By objOverViewTabWeightText = By.xpath("//*[text()='Weight']");
	//OverViewTab Medication Text
	public static By objOverViewTabMadicationText = By.xpath("//*[text()='Medications']");
	//Survey Activity Text
	public static By objOverViewTabSurveyText = By.xpath("//*[text()='Survey']");
	
	
	//Temperature Activity Text
	public static By objOverViewTabTemperatureText = By.xpath("//*[text()='Temperature']");
	//Blood Pressure Activity Text
	public static By objOverViewTabBloodPressureText = By.xpath("//*[text()='Blood']");
	//Pluse OX  Activity Text
	public static By objOverViewTabPluseOXText = By.xpath("//*[text()='PulseOx']");


//    
	//Add Reminder Button
	public static By objAddReminderBtn = By.xpath("//*[text()='Add Reminder']");
	//Add Reminder Header Titile 
	public static By objAddReminderHeader = By.xpath("//*[@class='modal-header']/child::h4[@class='qa-biometrics--title modal-title']");
	//Close X Button 
	public static By objCloseXBtn = By.xpath("//button[@attr.aria-label='Close']/child::span");
	//Reminder Time Text 
	public static By objReminderTimeText = By.xpath("//*[text()='Reminder Time']");
	//Reminder Window Text 
	public static By objReminderWindowText = By.xpath("//*[text()='Reminder Window']");
	//Reminder Window Icon 
	public static By objReminderWindowIcon = By.xpath("(//*[@class='icmn-question4'])[2]");
	//Reminder Window Icon Text
	public static By objReminderWindowIconText = By.xpath("(//*[@class='icmn-question4'])[2]/following-sibling::div");
	//Reminder Window Dropdown  
	public static By objReminderWindowDropDown = By.xpath("//label[text()='Reminder Window']/parent::div/following-sibling::select");
	//Reminder Window DropDown Option
	public static By objReminderWindowDropDownOption = By.xpath("//*[@class='qa-biometrics--dropdown-window form-control select-with-placeholder ng-pristine ng-valid ng-touched']/child::option");	
	
	
	// Reminder Time Button
	public static By objTimeReminderButton = By.xpath("//*[@name='timeModel']");
	
	//Reminder Madule Text
	public static By objRemiderMaduleText  = By.xpath("//*[text()='Reminder Modules']");  
	//Selected Module in Reminder Module 
	public static By objSelectedMadulesInReminderMadule = By.xpath("//*[@class='row module-container']/child::div/following-sibling::div/child::button");
	//Cancel Button  
	public static By objCancelButton = By.xpath("//*[@class='btn qa-add_edit_biometric--cancel-btn']");
	//Save Reminder Madule Button 
	public static By objSaveReminderMaduleBtn = By.xpath("//*[@class='btn btn-primary qa-add_edit_biometric--create-btn ladda-button']");

	//Reminder Madule Blood Pressure Button 
	public static By objReminderMaduleBloodPresureBtn = By.xpath("//*[@class='row module-container']/child::div/following-sibling::div/child::button[text()=' Blood Pressure ']");
	//Reminder Madule Pluse OX Button  
	public static By objReminderMadulePluseOXBtn = By.xpath("//*[@class='row module-container']/child::div/following-sibling::div/child::button[text()=' Pulse Ox ']");
	//Reminder Madule Temperature Button  
	public static By objReminderMaduleTemperatureBtn = By.xpath("//*[@class='row module-container']/child::div/following-sibling::div/child::button[text()=' Temperature ']");
	//Reminder Madule Weight Button 
	public static By objReminderMaduleWeightBtn = By.xpath("//*[@class='row module-container']/child::div/following-sibling::div/child::button[text()=' Weight ']");
	//Reminder Madule Imaging Button  
	public static By objReminderMaduleImagingBtn = By.xpath("//*[@class='row module-container']/child::div/following-sibling::div/child::button[text()=' Imaging ']");

	
   //  Add Medication 
	//Pluse Button  
	public static By objPluseBtn = By.xpath("//*[@class='fa fa-plus']");
	//Medication Name Choose Button  
	public static By objMedicationNameChooseBtn = By.xpath("//*[@class='ng-input']");
	//Medication Values List  
	public static By objMedicationValuesList = By.xpath("//div[@class='ng-option']");  //KWELL
	//Strength Text Box  
	public static By objStrengthTextBox = By.id("patient_care--medication_modal--input-strength");
	//MG Drop down 
	public static By objMGDropdown = By.id("patient_care--medication_modal--select-units");
	//Schedule Day Checkbox
	public static By objSchduleDayCheckbox = By.id("patient_care--medication_modal--schedule--radio-everyday");
	//Is Essential Check Box 
	public static By objIsEssentialCheckBox = By.id("patient_care--medication_modal--checkbox-essential");
	//Expiration Date  
	public static By objExpirationDate = By.xpath("//*[@id='patient_care--medication_modal--expiration--datepicker']/child::div/child::input");
	//Special Instruction Text Box Button  
	public static By objSpecialInstructionTextBox = By.id("patient_care--medication_modal--input-special_instructions");
	//Medication Submit Button  
	public static By objMedicationSubmitBtn = By.id("patient_care--medication_modal--button-submit");
	//Medication Cancel Button  
	public static By objMedicationCancelBtn = By.id("patient_care--medication_modal--button-cancel");
	
	
	// Medication Validate column
	//Medication Name Text 
	public static By objMedicationNameColumnText  = By.xpath("//*[@id='patient_care--metrics--reminders-medication--table']/child::thead/following-sibling::tbody/child::tr/td[contains(text(),'LIQUAEMIN SODIUM')]");
	
	//Medication Strength Dose Value Text 
	public static By objMedicationStrengthDoseText  = By.xpath("//*[@id='patient_care--metrics--reminders-medication--table']/child::thead/following-sibling::tbody/child::tr/td[contains(text(),'mg x1 Oral')]");
	
	//Medication Shedule Value Text 
	public static By objMedicationSheduleText  = By.xpath("//*[@id='patient_care--metrics--reminders-medication--table']/child::thead/following-sibling::tbody/child::tr/td[@id='patient_care--metrics--reminders-medication--table--row_0--column-schedule']");
		
	
	//Medication Expiration Value Text 
	public static By objMedicationExpirationText  = By.xpath("//*[@id='patient_care--metrics--reminders-medication--table']/child::thead/following-sibling::tbody/child::tr/td[@id='patient_care--metrics--reminders-medication--table--row_0--column-expiration']");
		
	
	
	
	
	
	
	
















}
