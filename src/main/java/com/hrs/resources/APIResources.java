package com.hrs.resources;

public enum APIResources {

	
	
	/*
	 * @Description : TelcoScore
	 */
	
	
	  logInAccessTokenAPI_EndPoint("/v1/tokens"),
	  confirmAllMedGatewayAPI_Endpoints("/v1/medications"),
<<<<<<< HEAD
	  deletReduceMedicationFrequencyOneReminder_Endpoints(""),
	  deletReduceMedicationFrequencyMultipleReminder_Endpoints(""),
	  newMedicationFromEMRModalNotifications_Endpoints("/apiv2/notifications");
=======
	  newMedicationFromEMRModalNotifications_Endpoints("/apiv2/notifications"),
	  prescribedMedicationsPost_Endpoints("/v1/prescribed-medications");
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
	
	  
	private String resource;

	APIResources(String resource) {
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}

}