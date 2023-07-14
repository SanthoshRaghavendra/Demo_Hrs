package com.hrs.Androidpages;

import org.openqa.selenium.By;

public class LoginPage {

	//==================================================Login Popup  Mobile Page==========================================================//
	//Sign In Button
	public static By objPermissionSignIn_Btn = By.xpath("//*[@text='SIGN IN']");


	// Permissions Pop-up header text
	public static By objPermissionTxt = By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_message']");
	// Permissions Pop-up Ok Text
	public static By objPermissionClose_Btn = By.xpath("//*[@text='CLOSE']");
	// Allow Button
	public static By objAllowBtn = By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']");
	// HRS LOGO 
	public static By objHRSLogo = By.xpath("//*[@text='HRS Logo']");
	

	//Username TextField

//public static By objUsernameField=By.xpath("(//*[@text='One-Time Sign In Username']/parent::android.view.View/following-sibling::android.view.View)[1]");


	  public static By objUsernameField=By.xpath("(//*[@resource-id='hrs-input-0-lbl']/following-sibling::android.view.View/child::android.widget.EditText)[1]");


public static By objPasswordField=By.xpath("(//*[@resource-id='hrs-input-0-lbl']/following-sibling::android.view.View/child::android.widget.EditText)[2]");
 
	//Mobile User Name 
	public static By objMobileUserNameTextbox = By.xpath("(//*[@resource-id='hrs-input-0-lbl']/following-sibling::android.view.View/child::android.widget.EditText)[1]");	
	//Mobile Password Name 
	public static By objMobilePasswordNameTextbox = By.xpath("(//*[@resource-id='hrs-input-0-lbl']/following-sibling::android.view.View/child::android.widget.EditText)[2]");	
	//Submit Button 
	public static By objSubmitButton = By.xpath("//*[@text='SUBMIT']");
	
	
	//Next Button Consent Form
	public static By objNextCosentFormButton = By.xpath("//*[@text='NEXT next']");
	
	//Submit Button Consent Form
	public static By objSumitCosentFormButton = By.xpath("//*[@text='SUBMIT']");
	
	//Help Button 
	public static By objHelpCosentFormButton = By.xpath("//*[@text='Help']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//==================================================Login Popup  Web Page==========================================================//
	//User Name Text Box
	public static By objUserNameWebTextBox = By.id("loginEmail");
	//Password Text Box
	public static By objPasswordWebTextBox = By.id("password");
	//LogIn Button 
	public static By objLoginWebButton = By.id("loginSubmitButton");




	
	
	
	
	
	

	// Contact Permissiion Header text
	public static By objContactPermissionTxt = By.xpath("//*[@text='Allow GCash UAT to access your contacts?']");


	// Deny Button
	public static By objDenyBtn = By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_deny_button']");
	// Manage Phone Calls Permission Header
	public static By objPhonePermissionTxt = By.xpath("//*[@text='Allow GCash UAT to make and manage phone calls?']");
	// Allow Pictures Permission Header
	public static By objPictureTxt = By.xpath("//*[@text='Allow GCash UAT to take pictures and record video?']");
	// Location Notification Header
	public static By objLocationPermissionTxt = By.xpath("//*[@text=\"Allow GCash UAT to access this device's location?\"]");
	// Allow while Using this Button
	public static By objAllowWhileUsingAppBtn = By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");
	// Allow File Permission Header
	public static By objFilePermissionTxt = By.xpath("//*[@text='Allow GCash UAT to access photos, media and files on your device?']");
	// Alert Title
	public static By objAlertTitle = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/alertTitle']");
	// permission popup
	public static By objPermissionPopup = By.xpath("//*[@resource-id='com.android.permissioncontroller:id/permission_message']");
	// Permission Needed!
	public static By objPermissionPopups = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/tv_title']");
	// cancel Button
	public static By objCancelBtn = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/btn_negative']");
	//================================================Enter Mobile Number Page========================================================//
	//Login Button
	public static By objLoginBtn = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/btn_welcome_login']");
	//Enter Mobile no Header
	public static By objMobNoHeaderText = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/textView2']");
	//Country Code
	public static By objmobNoTxtField = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/et_msisdn']");
	//Next Button
	public static By objMobNoPageNxtBtn = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/btn_next']");
	// ==================================================MpinPage=================================================================//
	// MPIN Header
	public static By objMPINHeader = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/tv_greetings']");
	// Enter your MPIN Text
	public static By objEnterMPINTxt = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/lbl_enter_mpin']");
	// MPIN 1 Button
	public static By objBtn(int mpinNo) {
		return By.xpath("//*[@text='" + mpinNo + "']");
	}
	// Something went wrong popup
	public static By objServerPopup = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/tv_title']");
	// close Button
	public static By objCloseBtn = By.xpath("com.globe.gcash.android.uat.tokyo:id/btn_positive");
	// Biometric
	public static By objSkipEnableBiometricsBtn = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/tv_skip_for_now']");
	//=================================================Authentication OTP Page=======================================================//
	public static By objOTPPageHeader = By.xpath("//*[@text='Authentication']");
	// OTP Text Field
	public static By objOTPField = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/textView3']/following-sibling::android.widget.FrameLayout/descendant::android.widget.EditText");
	//MPIN 1
	public static By objOTPOneNo = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/tv_one']");
	//MPIN 0
	public static By objOTPZeroNo = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/tv_zero']");
	//MPIN 9
	public static By objOTPNineNo = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/tv_nine']");
	//MPIN 8
	public static By objOTPEightNo = By.xpath("//*[@resource-id='com.globe.gcash.android.uat.tokyo:id/tv_eight']");
	//============================================================================================================================//


	//Close Button 
	public static By objCloseButton = By.xpath("//*[@text='CLOSE']");
	// Notification Permission Needed PopUp
	public static By objPermissionNeededPopUp = By.xpath("//*[@text='Notification Permission Needed']");


	//Sing In Button
	public static By objSingInButton = By.xpath("//*[@text='SIGN IN']");
















}