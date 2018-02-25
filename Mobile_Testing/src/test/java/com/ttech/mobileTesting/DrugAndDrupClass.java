package com.ttech.mobileTesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DrugAndDrupClass extends CapabilitiesMainClass {
	
	@SuppressWarnings("deprecation")
	@Test
	public void PressRelese() throws MalformedURLException {

	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
    driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
    TouchAction t = new TouchAction(driver);
    t.longPress(driver.findElementsByClassName("android.view.View").get(0)).moveTo(driver.findElementsByClassName("android.view.View").get(1)).release().perform();
 
   
}}
