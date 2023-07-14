package com.hrs.resources;

public class HrsJsonBody {
	public static String requestBody;

	
	public static String generateLogInTokenHRSJsonBody(String userName, String password) {
		requestBody = "{\n"
				+ "  \"data\": {\n"
				+ "    \"type\": \"credentials\",\n"
				+ "    \"username\": \""+userName+"\",\n"
				+ "    \"password\": \""+password+"\"\n"
				+ "  }\n"
				+ "}";
		return requestBody;
	}
	
	
	public static String getConfirmAllMedGatewayEndpointsareExposedJsonBody(String userName, String password) {
		requestBody = "";
		return requestBody;
	}
	
	public static String getMedicationMasterListPulledFromGatewayJsonBody(String userName, String password) {
		requestBody = "";
		return requestBody;
	}
	
	
	public static String deleteReduceMedicationFrequencyOneReminderTimeSlotJsonBody(String userName, String password) {
		requestBody = "";
		return requestBody;
	}
	
	public static String deleteReduceMedicationFrequencyMultipleReminderTimeSlotsJsonBody(String userName, String password) {
		requestBody = "";
		return requestBody;
	}
	
	public static String getNewMedicationFromEMRModalNotificationsJsonBody(String userName, String password) {
		requestBody = "";
		return requestBody;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 public static String depositeRequestBody(String amount,String mobile_number) {
		    requestBody="{\n"
		        + "  \"amount\": "+amount+",\n"
		        + "  \"mobile_number\":\""+mobile_number+"\"\n"
		        + "}" ;
		    return requestBody ;
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String getTokensFinscore(String grant_type, String client_id, String client_secret) {
		
		requestBody = "{\n" 
		        + "     \"grant_type\" : \"" + grant_type + "\",\n" 
				+ "  \"client_id\" : \"" + client_id
				+ "\",\n" + "  \"client_secret\" : \"" + client_secret + "\"\n" + "\n" + "}";
		return requestBody;
	}

	public static String finScoreUATGetScoreBody(String partner_id, String requested_msisdn,
			String external_source_id) {
		
		requestBody = "{\r\n"
				+ "    \"partner_id\": \""+partner_id+"\",\r\n"
				+ "    \"requested_msisdn\": \""+requested_msisdn+"\",\r\n"
				+ "    \"request_data\": {\r\n"
				+ "        \"client_code\": \"finscore\",\r\n"
				+ "        \"hdr_username\": \"finscore\",\r\n"
				+ "        \"external_source_id\": \""+external_source_id+"\",\r\n"
				+ "        \"plan_code\": \"fs-code\",\r\n"
				+ "        \"timestamp\": \"2023-05-10T19:29:26.529726\",\r\n"
				+ "        \"expired_at\": \"\",\r\n"
				+ "        \"signature\": \"\",\r\n"
				+ "        \"hdr_request_id\": \"\",\r\n"
				+ "        \"partnerId\": \"fs-partner\"\r\n"
				+ "    }\r\n"
				+ "}";
		return requestBody;
	}

	

	public static String homeCreditUATGetScoreBody() {
		requestBody = "{\n"
				+ "     \"msisdn\": \"M64rs+jpNlDvXJII9Zt/zGIEMGW8zZ5M9aptdGzjplzcVolgK10QAlQwogUuqPGmnyP8tZyVLblh/15vAHjzng0yCkbBRMojWQ1YvzGAzAPsWwG5nOp4uKdyhSaMI5UMAUgqwA7cFkPUzzBUDKli87QG4ekwu6yk24DcMhYkDMb4ZEKcsUALsnHleNcQyhXPWMsq97XJwL763ODbsw+AKKzpbNAIkQikfjUPL17KQwKd9wa8JNkXcRkRB9y4wibRbxZRNZUj/VR/isZKgrDklgeNs0bINAi9CgP2BdSxZqk7OAFW9bUnjXlzU8azQ/FXmBYoOqy8Mt28ATk1Z83usg==\",\n"
				+ "     \"score_model\": \"score_model_1\"\n" + "}";
		return requestBody;
	}
	
	public static String postTelcoScoreTrustingSocialUatGenerateTokenBody() {
		requestBody = "{\r\n" + "  \"client_id\" : \"trustingsocial\",\r\n"
				+ "  \"client_secret\" : \"KkjAQzjHdSJyX9uHX62kBErD8ParbPgR\",\r\n"
				+ "  \"scope\" : \"telcoscore\",\r\n" + "  \"grant_type\" : \"client_credentials\"\r\n" + "}";
		return requestBody;
	}

	public static String postTelcoScoreTrustingSocialUatGetScoreBody(String msisdn, String externalSourceId) {
		requestBody = "{\r\n" + "    \"partner_id\": \"trustingsocial\",\r\n" 
	            + "    \"request_data\": {\r\n"
				+ "        \"client_code\": \"transunion_client\",\r\n"
				+ "        \"expired_at\": \"2023-04-26T15:10:59+08:00\",\r\n" 
				+ "        \"external_source_id\": \""+ externalSourceId + "\",\r\n" + "        \"hdr_request_id\": \"1148680\",\r\n"
				+ "        \"hdr_username\": \"transunion_user\",\r\n" + "        \"plan_code\": \"POS\",\r\n"
				+ "        \"score_version\": \"v1\",\r\n"
				+ "        \"signature\": \"jedxZd44WTK943VfzDBkABVa_l-vPoCUmWWa_dmPq_0=\",\r\n"
				+ "        \"timestamp\": \"2023-04-25T15:10:59+08:00\"\r\n" + "    },\r\n"
				+ "    \"requested_msisdn\": \"" + msisdn + "\"\r\n" + "}";
		return requestBody;
	}

	public static String postIdentitySolutionVerificationEWalletReqBody(String msisdn, String iv) {
		requestBody = "{\r\n" + "  \"msisdn\": \"" + msisdn + "\",\r\n" + "  \"iv\": \"" + iv + "\"\r\n" + "}";
		return requestBody;
	}

	public static String createProductRequestBody(String productId, String name, String config_table) {
		requestBody = "{ \n" 
	            + "    \"product_id\": \"" + productId + "\",\n" 
				+ "    \"name\": \"" + name + "\",\n"
				+ "    \"config_table\": \"" + config_table + "\"\n" + "}";
		return requestBody;
	}

	public static String saveProductConfigRequestBody(boolean isActive) {
		requestBody = "{\r\n" + "    \"is_active\": " + isActive + "\r\n" + "}";

		return requestBody;
	}

	public static String gSaveInquireJson (String mobile_number,String email_address,String email_verified) {
	    requestBody = " {\n" +
	        "    \"mobile_number\": \""+mobile_number+"\",\n" +
	        "    \"email_address\": \""+email_address+"\",\n" +
	        "    \"email_verified\": \""+email_verified+"\"\n" +
	        " }" ;
	    return requestBody ;
	  }
	
	  public static String getRegisterFieldJson (String mobile_number) {
	    requestBody = "{\n"
	        + "    \"mobile_number\": \""+mobile_number+"\" \n"
	        + "}" ;
	    return requestBody ;
	  }
	  
	 
	  
	  public static String createUserIDRequestBody(String mobile_number) {
		  requestBody =  "{\n" +
	                "    \"request\": {\n" +
	                "        \"head\": {\n" +
	                "            \"clientId\": \"clientId\",\n" +
	                "            \"function\": \"gcash.customer.user.info.query\",\n" +
	                "            \"clientSecret\": \"clientSecret\",\n" +
	                "            \"reqTime\": \"2021-10-20T06:22:07+00:00\",\n" +
	                "            \"version\": \"1.0\",\n" +
	                "            \"reqMsgId\": \"20211020-062207-179\",\n" +
	                "            \"reserve\": \"{\\\"timeout\\\":5000}\"\n" +
	                "        },\n" +
	                "        \"body\": {\n" +
	                "            \"userCode\": \""+mobile_number+"\",\n" +
	                "            \"userType\": \"MOBILE_NO\"\n" +
	                "        }\n" +
	                "    },\n" +
	                "    \"signature\": \"none\"\n" +
	                "}";
		    return requestBody ;
		  }
	  public static String invalidMerchantIdRequestBody(String userId, String marchantId) {
		  requestBody =  "{\n" +
	                "   \"request\":{\n" +
	                "      \"head\":{\n" +
	                "         \"version\":\"1.0\",\n" +
	                "         \"function\":\"gcfs.gsave.prevalidate\",\n" +
	                "         \"clientId\":\"clientId\",\n" +
	                "         \"clientSecret\":\"clientSecret\",\n" +
	                "         \"reqTime\":\"2019-05-07T12:21:56+08:00\",\n" +
	                "         \"reqMsgId\":\"2211122\",\n" +
	                "         \"reserve\":\"\"\n" +
	                "      },\n" +
	                "      \"body\":{\n" +
	                "        \"userId\":\""+userId+"\",\n" +
	                "        \"merchantId\":\""+marchantId+"\"\n" +
	                "      }\n" +
	                "   },\n" +
	                "   \"signature\":\"none\"\n" +
	                "}";
		    return requestBody ;
		  }
	  
	  public static String depositUserIsRiskRejectInGCashRequestBody(String amount, String mobile_number) {
		  requestBody = "{\n" +
	                "\t\"amount\":"+amount+",\n" +
	                "\t\"mobile_number\":\""+mobile_number+"\"\n" +
	                "}";
		    return requestBody ;
		  }
	  public static String withDrawUserIsRiskRejectInGCashRequestBody(String amount, String mobile_number) {
		  requestBody = "{ \n" +
	                " \"amount\": "+amount+", \n" +
	                " \"mobile_number\":\""+mobile_number+"\", \n" +
	                "        \"otp\": \"\", \n" +
	                "        \"wait_time\": \"\", \n" +
	                "        \"otpSceneNo\": \"\", \n" +
	                "        \"otp_time\": \"\", \n" +
	                "        \"send_time\": \"\", \n" +
	                "        \"masked_mobileNo\": \"\" \n" +
	                "}";
		    return requestBody ;
		  }
	  public static String inquireforExistingGsaveBlacklistedInCIMBWithdrawRequestBody(String mobile_number, String email_address, String email_verified) {
		  requestBody = " {\n" +
	                "    \"mobile_number\": \""+mobile_number+"\",\n" +
	                "    \"email_address\": \""+email_address+"\",\n" +
	                "    \"email_verified\": \""+email_verified+"\"\n" +
	                " }";
		    return requestBody ;
		  }
	  

	  public static String smsInquireAPIResponseUserRequestBody(String user_id, String mobile_number) {
		  requestBody = "{\n" +
	                "   \"request\":{\n" +
	                "      \"head\":{\n" +
	                "         \"version\":\"1.0\",\n" +
	                "         \"function\":\"gcfs.insurance.smsinquire\",\n" +
	                "         \"clientId\":\"clientId\",\n" +
	                "         \"clientSecret\":\"clientSecret\",\n" +
	                "         \"reqTime\":\"2019-05-07T12:21:56+08:00\",\n" +
	                "         \"reqMsgId\":\"2211122\",\n" +
	                "         \"reserve\":\"\"\n" +
	                "      },\n" +
	                "      \"body\":{\n" +
	                "        \"userId\":\""+user_id+"\",\n" +
	                "        \"mobileNumber\" : \""+mobile_number+"\"\n" +
	                "      }\n" +
	                "   },\n" +
	                "   \"signature\":\"none\"\n" +
	                "}";
		    return requestBody ;
		  }
	  public static String smsInquireAPIResponseNullValuesRequestBody(String mobile_number) {
		  requestBody = "{\n" +
	                "   \"request\":{\n" +
	                "      \"head\":{\n" +
	                "         \"version\":\"1.0\",\n" +
	                "         \"function\":\"gcfs.insurance.smsinquire\",\n" +
	                "         \"clientId\":\"clientId\",\n" +
	                "         \"clientSecret\":\"clientSecret\",\n" +
	                "         \"reqTime\":\"2019-05-07T12:21:56+08:00\",\n" +
	                "         \"reqMsgId\":\"2211122\",\n" +
	                "         \"reserve\":\"\"\n" +
	                "      },\n" +
	                "      \"body\":{\n" +
	                "        \"userId\":null,\n" +
	                "        \"mobileNumber\" : \""+mobile_number+"\"\n" +
	                "      }\n" +
	                "   },\n" +
	                "   \"signature\":\"none\"\n" +
	                "}";
		    return requestBody ;
		  }
	  public static String smsPrevalidateAPIResponseRequestBody( String product_id, String user_id) {
		  requestBody = "{\n" +
	                "    \"request\": {\n" +
	                "        \"head\": {\n" +
	                "            \"version\": \"1.0\",\n" +
	                "            \"function\": \"gcfs.insurance.smsprevalidate\",\n" +
	                "            \"clientId\": \"clientId\",\n" +
	                "            \"clientSecret\": \"clientSecret\",\n" +
	                "            \"reqTime\": \"2019-05-07T12:21:56+08:00\",\n" +
	                "            \"reqMsgId\": \"2211122\",\n" +
	                "            \"reserve\": \"\"\n" +
	                "        },\n" +
	                "        \"body\": {\n" +
	                "            \"userId\": \""+user_id+"\",\n" +
	                "            \"insuranceProductCode\": \""+product_id+"\"\n" +
	                "        }\n" +
	                "    },\n" +
	                "    \"signature\": \"none\"\n" +
	                "}";
		    return requestBody ;
		  }
	  public static String smsPrevalidateAPIResponseNullValuesResponseRequestBody( String product_id) {
		  requestBody = "{\n" +
	                "    \"request\": {\n" +
	                "        \"head\": {\n" +
	                "            \"version\": \"1.0\",\n" +
	                "            \"function\": \"gcfs.insurance.smsprevalidate\",\n" +
	                "            \"clientId\": \"clientId\",\n" +
	                "            \"clientSecret\": \"clientSecret\",\n" +
	                "            \"reqTime\": \"2019-05-07T12:21:56+08:00\",\n" +
	                "            \"reqMsgId\": \"2211122\",\n" +
	                "            \"reserve\": \"\"\n" +
	                "        },\n" +
	                "        \"body\": {\n" +
	                "            \"userId\": null,\n" +
	                "            \"insuranceProductCode\": \"sample\"\n" +
	                "        }\n" +
	                "    },\n" +
	                "    \"signature\": \"none\"\n" +
	                "}";
		    return requestBody ;
		  }
	  
	  public static String gGivesRegistrationAPIBody(String msisdn,String userId,String publicUserId,String loanAmount,
		      String tenor,String fixedDaysOfMonth,String interestRate,String DateAndTime,String repaymentDay) {
		    requestBody="{\n" +
		        "  \"msisdn\": \""+msisdn+"\",\n" +
		        "  \"userId\": \""+userId+"\",\n" +
		        "  \"publicUserId\": \""+publicUserId+"\",\n" +
		        "  \"parentProduct\": \"CASH LOAN\",\n" +
		        "  \"product\": \"GGIVES\",\n" +
		        "  \"loanAccountDetails\": {\n" +
		        "    \"birthDate\": \"1991-01-09\",\n" +
		        "    \"firstName\": \"MYNTTEST ONE\",\n" +
		        "    \"middleName\": \"TESTTEST\",\n" +
		        "    \"lastName\": \"COLL\",\n" +
		        "    \"emailAddress\": \"09369056671@yopmail.com\",\n" +
		        "    \"loanAmount\": "+loanAmount+",\n" +
		        "    \"tenor\": "+tenor+",\n" +
		        "    \"fixedDaysOfMonth\": "+fixedDaysOfMonth+",\n" +
		        "    \"interestRate\":"+interestRate+"\n" +
		        "  },\n" +
		        "  \"loanAccountUserDetails\": {\n" +
		        "    \"nickname\": \"Raco\",\n" +
		        "    \"gender\": \"Male\",\n" +
		        "    \"civilStatus\": \"Married\",\n" +
		        "    \"otherMobileNumber\": \"09170004321\",\n" +
		        "    \"landlineNumber\": \"7106358\",\n" +
		        "    \"ownBusiness\": true,\n" +
		        "    \"nationalityFreeText\": \"FILIPINO\",\n" +
		        "    \"clientFunds\": \"Cash on Hand\",\n" +
		        "    \"clientWork\": \"Academics and Researchers\",\n" +
		        "    \"clientAddressLine1\": \"2ND STREET\",\n" +
		        "    \"clientZipCode\": \"7302\",\n" +
		        "    \"clientBarangay\": \"\",\n" +
		        "    \"clientCity\": \"CITY OF LAMITAN (Capital)\",\n" +
		        "    \"clientProvince\": \"BASILAN\",\n" +
		        "    \"clientCountry\": \"PHILIPPINES\"\n" +
		        "  },\n" +
		        "  \"loanAccountEmergencyContact\": {\n" +
		        "    \"lastName\": \"Silverio\",\n" +
		        "    \"firstName\": \"Marco\",\n" +
		        "    \"middleName\": \"Polo\",\n" +
		        "    \"relation\": \"Spouse\",\n" +
		        "    \"contactNumber\": \"09170004321\"\n" +
		        "  },\n" +
		        "  \"loanAccountAgreementDetails\": {\n" +
		        "    \"loanTnc\": \""+DateAndTime+"\",\n" +
		        "    \"dataPrivacyAgreement\": \""+DateAndTime+"\",\n" +
		        "    \"disclosureStatement\": \""+DateAndTime+"\",\n" +
		        "    \"disclosureStatementData\": \"\",\n" +
		        "    \"otp\": \"123456\",\n" +
		        "    \"otpTimeStamp\": \""+DateAndTime+"\",\n" +
		        "    \"repaymentDay\": "+repaymentDay+"\n" +
		        "  }\n" +
		        "}\n";
		    return requestBody ;
		  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
