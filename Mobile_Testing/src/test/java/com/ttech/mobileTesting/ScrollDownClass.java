package com.ttech.mobileTesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDownClass extends CapabilitiesMainClass{
	@Test
	public void PressRelese() throws MalformedURLException {

	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	   driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	// appium not support ScrollDown method, so take support from android api
     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

}}
