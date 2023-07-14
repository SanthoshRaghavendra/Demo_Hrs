package com.business.hrsAPI;


import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.hrs.resources.APIResources;
import com.utility.ExtentReporter;
import com.utility.LoggingUtils;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import javax.mail.internet.AddressException;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class APIBaseClass implements ITestListener {
	
    public static Response response;
	 protected static String BaseUrl_LogInAccess ="BaseUrl_LogInAccess";
	    public static String resourceEndpoint ;
	
	    public static String loginAccessToken;
<<<<<<< HEAD
	 
=======
	    public static ExtentTest testLogger;
	    
	    
>>>>>>> ca3e1b056268130abccbc924d010473b09e61212
	    
	 
	 
    protected static String BaseUrl_Product = "BaseUrl_Product";
    protected static String BaseUrl_GTelcoScore = "BaseUrl_GTelcoScore";
    protected static String BaseUrl_GSave = "BaseUrl_GSave";
    protected static String BaseUrl_GSave_Sit = "BaseUrl_GSave_Sit";
	protected static String BaseUrl_GSave_Uat = "BaseUrl_GSave_Uat";
	protected static String BaseUrl_GInsure = "BaseUrl_GInsure";
	protected static String BaseUrl_GGives = "BaseUrl_GGives";
	
    protected com.business.hrs.HRSBusinessLogic HRSBusinessLogic;
    public static String request;

    public static String finscoreUatAccessToken;
    public static String homeCreditAccessToken;
    public static String trustingSocialUatAccessToken;
    public static ExtentHtmlReporter htmlReporter;
 //   public static ExtentReports extent;
   
    public static String path = System.getProperty("user.dir");
    public static String os = System.getProperty("os.name").toLowerCase();
    public static String env;

    public static String identitySolutionVerificationAccessToken;
    public static String requestTokenUATAllAccessToken;
    

   // public static Logger log;
    public static LoggingUtils log = new LoggingUtils();
	public static ExtentReports extent = new ExtentReports();
    
    public static Object keyValue;
    protected static SoftAssert softAssert = new SoftAssert();
    protected LoggingUtils logger = new LoggingUtils();


    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : responseValueKeyPath()
     * @Description : Generic method which Gets the Value of the Key from the API Response Body
     * **********************************************************************
     */
    public static Object responseValueKeyPath(String key) {
        keyValue = response.getBody().jsonPath().get(key);
        return keyValue;
    }

    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : verifyAssertEqualsResults()
     * @Description : Generic method which verifies the Actual and Expected result between API Response Body and Test Data
     * **********************************************************************
     */
    public static void verifyAssertEqualsResults(Object actual, String expected, String message) {
        softAssert.assertTrue(actual.equals(expected), message);
        log.info(actual + "  "+ expected + "  " + message );
  		ExtentReporter.extentLogger("Result" ,actual + "  "+ expected + "  " + message );
    }

    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : verifyAssertContainsResults()
     * @Description : Generic method which verifies the Actual from Api Response Body contains the Expected result
	 * from the Test Data
     * **********************************************************************
     */
    public static void verifyAssertContainsResults(String actual, String expected, String message) {
        softAssert.assertTrue(actual.contains(expected), message);
        log.info(actual + "  "+ expected + "  " + message );
      		ExtentReporter.extentLogger("Result" ,actual + "  "+ expected + "  " + message );
    }

    public static void verifyAssertEqualsResults(String actual, String expected, String message) {
        softAssert.assertEquals(actual, expected, message);
        log.info("Actual Result  " +actual + "   Expected Result  "+ expected + "  " + message );
        testLogger.info("Actual Result  " +actual + "   Expected  "+ expected + "  " + message );
    }

    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : verifyResultIsNotNull()
     * @Description : Generic Method to check if the Response key has some value which is not a static value but dynamic
     * **********************************************************************
     */
    public static void verifyResultIsNotNull(Object actual) {
        softAssert.assertNotNull(actual);
    }

    /**
     * *********************************************************************
     *
     * @Project Name : HRS - UTAF Framework.
     * @Function Name : verifyResultIsNull()
     * @Description : Generic Method to check if the Response Key has no value but null
     * **********************************************************************
     */
    public static void verifyResultIsNull(Object actual) {
        softAssert.assertNull(actual);
    }

  //  @SuppressWarnings("static-access")
	@BeforeSuite
    public void logging() throws FileNotFoundException {
        PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
//        RestAssured.filters(new RequestLoggingFilter().logRequestTo(log),
//                new ResponseLoggingFilter().logResponseTo(log));
        env = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("Env");
        System.out.println(env);
    }

    public static String getGlobalValue(String key) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("API_" + env + ".properties");
        prop.load(fis);
        return prop.getProperty(key);
    }

    public static String getResource(String resource) {
        APIResources resourceAPI = APIResources.valueOf(resource);
        return resourceAPI.getResource();
    }

    String filePath;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:MM");
        Date date = new Date();
        String currentDate = dateFormat.format(date).toString().replaceFirst(" ", "_")
				.replaceAll("/", "_")
                .replaceAll(":", "_");
        filePath = System.getProperty("user.dir") + "/Reports" + "/" + "Api_reports" + "/" + "APIReports_"
				+ currentDate + "/" + "HTMLReport_" + this.getClass().getSimpleName() + ".html";

        htmlReporter = new ExtentHtmlReporter(filePath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Report Name", "ReST API Report");
        htmlReporter.config().setDocumentTitle("AutomationTesting in ReST API");
        htmlReporter.config().setReportName("ReST API Report");
    }

    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String name = dateFormat.format(date).toString().replaceFirst(" ", "_")
				.replaceAll("/", "_").replaceAll(":",
                "_");
        return name;
    }

    @AfterMethod
    public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            testLogger.fail(MarkupHelper.createLabel(result.getName() + " Test Case is FAILED", ExtentColor.RED));
            testLogger.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            testLogger.pass(MarkupHelper.createLabel(result.getName() + " Test Case is PASSED", ExtentColor.GREEN));
        } else {
            testLogger.skip(MarkupHelper.createLabel(result.getName() + " Test Case is SKIPPED", ExtentColor.YELLOW));
            testLogger.skip(result.getThrowable());
        }
    }

    @AfterClass
    public void tearDown() throws AddressException {
        System.out.println("After suite executed");
        extent.flush();
        softAssert.assertAll();
    }

}