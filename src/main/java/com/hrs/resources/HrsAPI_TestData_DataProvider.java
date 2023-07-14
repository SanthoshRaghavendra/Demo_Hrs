package com.hrs.resources;

import com.business.hrsAPI.APIBaseClass;
import com.utility.Excel;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;

public class HrsAPI_TestData_DataProvider extends APIBaseClass {
//	@Parameters({ "env" })
//	public static String excelPath() {
//		
//		String filePath;
//		if (os.equalsIgnoreCase("windows 10")) {
//			filePath = path + "\\src\\main\\java\\com\\hrs\\resources\\HrsAPI_TestData_"+ env + ".xlsx";
//
//		} else {
//			filePath = path + "//src//main//java//com//hrs//resources//HrsAPI_TestData_"+ env + ".xlsx";
//			
//		}
//		return filePath;
//	}
	
	@Parameters({"Env"}) public static String excelPath(){
        String filePath;
       // String env=Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("Env");
       // System.out.println(env);
    
        if(os.equalsIgnoreCase("windows 10")){
            filePath = path + "\\src\\main\\java\\com\\hrs\\resources\\HrsAPI_TestData_" +"sit" + ".xlsx";
        }else{
            filePath = path + "//src//main//java//com//hrs//resources//HrsAPI_TestData_" + env + ".xlsx";
        }
        return filePath;
    }
	
	/*
	 * @Description :TelcoScore Data Provider
	 */

	@DataProvider(name = "allMedGatewayEndpointsAreExposedInquireAPIResponse")
	public static Object[][] verifyEndpointTestingConfirmAllMedGatewayEndpointsareExposed() throws IOException {
		return Excel.getTestData(excelPath(), "HR", "allMedGatewayEndpointsAreExposedInquireAPIResponse");
	}

	@DataProvider(name = "getMedicationMasterListPulledFromGatewayAPIResponse")
	public static Object[][] verifyMedicationMasterListPulledFromGatewayEndpoint() throws IOException {
		return Excel.getTestData(excelPath(), "HR", "getMedicationMasterListPulledFromGatewayAPIResponse");
	}

	@DataProvider(name = "getNewMedicationFromEMRModalNotificationsAPIResponse")
	public static Object[][] verifyNewMedicationFromEMRModalNotificationsReconciled() throws IOException {
		return Excel.getTestData(excelPath(), "HR", "getNewMedicationFromEMRModalNotificationsAPIResponse");
	}
	
	
	
	
	
	
	
	@DataProvider(name = "deleteReduceMedicationFrequencyOneReminderTimeSlotAPIResponse")
	public static Object[][] verifyEndpoinDELETEReduceMedicationFrequencyOneReminderTimeSlot() throws IOException {
		return Excel.getTestData(excelPath(), "HRS", "deleteReduceMedicationFrequencyOneReminderTimeSlotAPIResponse");
	}

	@DataProvider(name = "deletReduceMedicationFrequencyMultipleReminderTimeSlotsAPIResponse")
	public static Object[][] verifyv1TasksEndpointDELETEReduceMedicationFrequencyMultipleReminderTimeSlots() throws IOException {
		return Excel.getTestData(excelPath(), "HRAS", "deletReduceMedicationFrequencyMultipleReminderTimeSlotsAPIResponse");
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@DataProvider(name = "HomeCreditGenerateTokenGetScore")
	public static Object[][] HomeCreditGenerateTokenGetScore() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "TC_HomeCreditGenerateTokenGetScore");
	}

	@DataProvider(name = "HomeCreditGetScoreInvalidAccessToken")
	public static Object[][] HomeCreditGetScoreInvalidAccessToken() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "HomeCreditGetScoreInvalidAccessToken");
	}

	@DataProvider(name = "GetTrustingSocialAccessToken")
	public static Object[][] getTrustingSocialAccessToken() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "GetTrustingSocialAccessToken");
	}

	@DataProvider(name = "VerifyTSInvalidExpiredToken")
	public static Object[][] verifyTSInvalidExpiredToken() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "VerifyTSInvalidExpiredToken");
	}

	@DataProvider(name = "VerifyTSInvalidMsisdn")
	public static Object[][] verifyTSInvalidMsisdn() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "VerifyTSInvalidMsisdn");
	}

	@DataProvider(name = "VerifyTSBlankExternalSource")
	public static Object[][] verifyTSBlankExternalSource() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "VerifyTSBlankExternalSource");
	}

	@DataProvider(name = "VerifyFailedWithUpperCaseNullExternalSourceId")
	public static Object[][] verifyFailedWithNULLExternalSourceId() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "VerifyFailedWithUpperCaseNullExternalSourceId");
	}

	@DataProvider(name = "VerifyFailedWithLowerCaseNullExternalSourceId")
	public static Object[][] VerifyFailedWithLowerCaseNullExternalSourceId() throws IOException {
		return Excel.getTestData(excelPath(), "GTelcoScore", "VerifyFailedWithLowerCaseNullExternalSourceId");
	}

	@DataProvider(name = "VerifyFailedWithNullSpaceExternalSourceId")
	public static Object[][] VerifyFailedWithNullSpaceExternalSourceId() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "VerifyFailedWithNullSpaceExternalSourceId");
	}

	@DataProvider(name = "TelkoGetScoreInvalidAccessToken")
	public static Object[][] verifyTelkoGetScoreInvalidAccessToken() throws IOException {
		return Excel.getTestData(excelPath(), "TelcoScore", "TelkoGetScoreInvalidAccessToken");
	}
	/*
	 * @Description : Identity Solutions Data provider
	 */

	@DataProvider(name = "IdentitySolutionsActiveProducts")
	public static Object[][] identitySolutionsActiveProducts() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "IdentitySolutionsActiveProducts");
	}

	@DataProvider(name = "IdentitySolutionsInactiveProducts")
	public static Object[][] identitySolutionsInactiveProducts() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "IdentitySolutionsInactiveProducts");
	}

	@DataProvider(name = "IdentitySolutionCreateProduct")
	public static Object[][] identitySolutionCreateProduct() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "IdentitySolutionCreateProduct");
	}

	@DataProvider(name = "IdentitySolutionProductExists")
	public static Object[][] identitySolutionCreateProductAlreadyExists() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "IdentitySolutionProductExists");
	}

	@DataProvider(name = "IdentitySolutionGetProductById")
	public static Object[][] identitySolutionGetProductById() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "IdentitySolutionGetProductById");
	}

	@DataProvider(name = "GetPartnersAvailingProductId")
	public static Object[][] getPartnersAvailingByProdId() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "GetPartnersAvailingProductId");
	}

	@DataProvider(name = "GetProductConfigByPartnerId")
	public static Object[][] getProductConfByPartnerId() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "GetProductConfigByPartnerId");
	}

	@DataProvider(name = "SaveProductConfigByPartnerId")
	public static Object[][] saveProductConfigByPartnerId() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "SaveProductConfigByPartnerId");
	}

	@DataProvider(name = "GetAccessTokenVerification")
	public static Object[][] getAccessTokenVerification() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "GetAccessTokenVerification");
	}

	@DataProvider(name = "GetIdentitySolutionsVerifiers")
	public static Object[][] getIdentitySolutionsVerifiers() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "GetIdentitySolutionsVerifiers");
	}

	@DataProvider(name = "PostIdentitySolutionEWallet")
	public static Object[][] postIdentitySolutionEWallet() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "PostIdentitySolutionEWallet");
	}

	@DataProvider(name = "PostIdentitySolutionEWalletVerified")
	public static Object[][] postIdentitySolutionEWalletVerified() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "PostIdentitySolutionEWalletVerified");
	}

	@DataProvider(name = "GCashIdentitySolutions")
	public static Object[][] gCashIdentitySolutions() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "TC_GCashProductManagement");
	}

	@DataProvider(name = "KYCReliance")
	public static Object[][] kycReliance() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "VerifyKYCRelianceResponse");
	}

	@DataProvider(name = "BIOKYCReliance")
	public static Object[][] bioKYCReliance() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "VerifyBiometricKYCRelianceResponse");
	}

	@DataProvider(name = "L3USER_BIO_KYCReliance")
	public static Object[][] bioKYCRelianceL3() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "VerifyBiometricL3KYCRelianceResponse");
	}

	@DataProvider(name = "L1USER_BIO_KYCReliance")
	public static Object[][] bioKYCRelianceL1() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "VerifyBiometricL1KYCRelianceResponse");
	}

	@DataProvider(name = "RequestToken_Customer")
	public static Object[][] requestTokenCustomer() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "VerifyRequestTokenCustomer");
	}

	@DataProvider(name = "RequestToken_CreditScore")
	public static Object[][] requestToken_CreditScore() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "TC_RequestToken_CreditScore");
	}

	@DataProvider(name = "RequestTokenGScore")
	public static Object[][] requestTokenGScore() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "VerifyRequestTokenGScore");
	}

	@DataProvider(name = "RequestTokenUATAll")
	public static Object[][] requestTokenUATAll() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "VerifyRequestTokenUATAll");
	}

	@DataProvider(name = "GConnectAccessCustomer")
	public static Object[][] gConnectAccessCustomer() throws IOException {
		return Excel.getTestData(excelPath(), "GCashIdentitySolutions", "VerifyGConnectAccessCustomer");
	}
	
	/*
	   * GSave
	   */
	  @DataProvider(name = "InquireExsitingmobilenumber")
	  public static Object[][] existingMobilenumberInInquire() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "InquireExsitingmobilenumber");
	  }
	  @DataProvider(name = "GSaveInquirenonexistinginGsaveAndFullyKYCZolozVerified")
	  public static Object[][] kycZolozMobilenumberInInquire() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "GSaveInquirenonexistinginGsaveAndFullyKYCZolozVerified");
	  }
	  @DataProvider(name = "GetRegisterFieldUserIDInvalid")
	  public static Object[][] getRegisterFieldUserIDInvalid() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "GetRegisterFieldUserIDInvalid");
	  }
	  @DataProvider(name = "InquireforEmailNotVerified")
	  public static Object[][] verifyInquireforEmailNotVerified() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "InquireforEmailNotVerified");
	  }
	  @DataProvider(name = "ResponseInquireUpgradeStatusPending")
	  public static Object[][] verifyResponseInquireUpgradeStatusPending() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "ResponseInquireUpgradeStatusPending");
	  }
	  @DataProvider(name = "ResponseOfDepositAPI")
	  public static Object[][] verifyResponseOfDeposit() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "ResponseOfDepositAPI");
	  }
	  @DataProvider(name = "ResponseOfDepositAPINullMessageHeader")
	  public static Object[][] verifyResponseOfDepositAPINullMessagesHeader() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "ResponseOfDepositAPINullMessageHeader");
	  }
	  @DataProvider(name = "getResponsePreValidateAPIUsingInvalidMerchantId")
	  public static Object[][] verifyrResponseInPreValidateAPIUsingInvalidMerchantId() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "getResponsePreValidateAPIUsingInvalidMerchantId");
	  }
	  @DataProvider(name = "getResponseOfDepositRickRejectGCash")
	  public static Object[][] verifyResponseInDepositIfUserIsRiskRejectInGCash() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "getResponseOfDepositRickRejectGCash");
	  }
	  @DataProvider(name = "getResponseOfWithDrawRiskRejectGCash")
	  public static Object[][] verifyResponseInWithdrawIfUserIsRiskRejectInGCash() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "getResponseOfWithDrawRiskRejectGCash");
	  }
	  @DataProvider(name = "InquireforExistingGsaveBlacklistedInCIMBAPI")
	  public static Object[][] VerifyResponseInInquireForExistingInGsaveBlacklistedInCIMB_NoWithdrawOnly() throws IOException {
	    return Excel.getTestData(excelPath(), "GSave", "InquireforExistingGsaveBlacklistedInCIMBAPI");
	  }
	  // GInsure
	  
	  @DataProvider(name = "smsInquireAPIResponse")
	  public static Object[][] verifySmsInquireAPIResponseForUserID() throws IOException {
	    return Excel.getTestData(excelPath(), "GInsure", "smsInquireAPIResponse");
	  }
	  @DataProvider(name = "smsInquireAPIResponseNullValues")
	  public static Object[][] verifySMSInquireAPIResponseForNullValues() throws IOException {
	    return Excel.getTestData(excelPath(), "GInsure", "smsInquireAPIResponseNullValues");
	  }
  
	  @DataProvider(name = "smsPrevalidateAPIResponse")
	  public static Object[][] verifySMSPrevalidateAPIResponseForUserID() throws IOException {
	    return Excel.getTestData(excelPath(), "GInsure", "smsPrevalidateAPIResponse");
	  }
	  
	  @DataProvider(name = "smsPrevalidateAPIResponseForL3UserID")
	  public static Object[][] verifySMSPrevalidateAPIResponseForL3UserID() throws IOException {
	    return Excel.getTestData(excelPath(), "GInsure", "smsPrevalidateAPIResponseForL3UserID");
	  }
	  @DataProvider(name = "smsPrevalidateAPIResponseNullValues")
	  public static Object[][] verifySMSPrevalidateAPIResponseForNullValues() throws IOException {
	    return Excel.getTestData(excelPath(), "GInsure", "smsPrevalidateAPIResponseNullValues");
	  }
	  
	  
	  /////////////////////////////////GGives 
	  @DataProvider(name = "GGivesRegistrationAPI")
	  public static Object[][] verifyInquireAPI() throws IOException {
	    return Excel.getTestData(excelPath(), "GGives", "GGivesRegistrationAPI");
	  }
	  
	  @DataProvider(name = "inquireResponseCorrectlyDisplaysRegisteredUser")
	  public static Object[][] verifyInquireResponseCorrectlyDisplaysUsersLoanOffersforRegisteredUser() throws IOException {
	    return Excel.getTestData(excelPath(), "GGives", "inquireResponseCorrectlyDisplaysRegisteredUser");
	  }
	  
	  
	  
	
}
