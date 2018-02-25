package com.ttech.mobileTesting;

import java.net.MalformedURLException;

//import org.openqa.selenium.interactions.internal.TouchAction;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TapTouchAction extends CapabilitiesMainClass{
	    
		@SuppressWarnings("deprecation")
		@Test
		public void PressRelese() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
         driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
         // Tap 
         TouchAction t = new TouchAction(driver);
         t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
         
         driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	    // Tap 
        t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction().release().perform();
	    System.out.println(driver.findElementById("android:id/title").getText());
	   
	   
	   }}
