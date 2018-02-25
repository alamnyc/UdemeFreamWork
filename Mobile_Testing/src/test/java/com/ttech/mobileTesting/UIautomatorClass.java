package com.ttech.mobileTesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomatorClass extends CapabilitiesMainClass{
    @Test
	public void UIautomator() throws MalformedURLException {

	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//driver.findElementByAndroidUIAutomator("Attribute(\"value\")") 
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	
	// Validate click able feature for all option 
	//driver.findElementByAndroidUIAutomator("new UISelector().property(value)");
	//System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
	
	}

}
