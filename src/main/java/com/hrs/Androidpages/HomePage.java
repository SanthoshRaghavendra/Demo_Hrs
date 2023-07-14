package com.hrs.Androidpages;

import org.openqa.selenium.By;

public class HomePage {

	
	//Home Button 
	public static By objHomeButtonText = By.xpath("(//*[@text='Home' and @class='android.widget.TextView'])[2]");
	//Education Button 
	public static By objEducationButtonText = By.xpath("//*[@text='Education' and @class='android.widget.TextView']");
	//Help Button 
	public static By objHelpButtonText = By.xpath("//*[@text='Help' and @class='android.widget.TextView']");
	
}
