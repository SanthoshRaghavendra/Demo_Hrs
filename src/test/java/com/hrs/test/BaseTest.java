package com.hrs.test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//
import com.business.hrs.BaseClass;
import com.driverInstance.AppiumServer;
import com.propertyfilereader.PropertyFileReader;
import com.utility.LoggingUtils;

import org.testng.asserts.SoftAssert;
import static com.utility.Utilities.softAssert;
import static com.utility.Utilities.*;

public class BaseTest{

	protected com.business.hrs.BaseClass baseClass;
	
	protected com.business.hrs.HRSBusinessLogic hrsBusinessLogic;
	
	AppiumServer server = new AppiumServer();
	LoggingUtils logger = new LoggingUtils();
	public static PropertyFileReader prop;
	String osName=System.getProperty("os.name").toLowerCase();

	//To Read Properties File Based On Current OS Of Laptop
	public void propertyFileReader() {
		if(osName.contains("mac")){
			System.out.println(osName);
			prop = new PropertyFileReader(".//properties//testdata.properties");
		}else {
			prop = new PropertyFileReader(".\\properties\\testdata.properties");	
		}
	}
	@BeforeMethod(alwaysRun = true)
	  public void beforeMethod() throws IOException {
	    softAssert =new SoftAssert();
	    //appium.startServer();
	  }
	//Start Application
	@Parameters({ "deviceName", "portno" })
	@BeforeClass
	public void beforeMethod(String deviceName, String portno) throws Exception {

		baseClass = new BaseClass("hrs", deviceName, portno);
		hrsBusinessLogic=new com.business.hrs.HRSBusinessLogic();
		propertyFileReader();
	}

	//Stop Application
	@AfterTest
	public void afterTest() {
		baseClass.tearDown();
	}


}
