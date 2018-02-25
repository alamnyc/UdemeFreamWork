package com.ttech.mobileTesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeClass extends CapabilitiesMainClass{
	
	@SuppressWarnings("deprecation")
	@Test
	public void PressRelese() throws MalformedURLException {

	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    TouchAction t=new TouchAction(driver);
    driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
    driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
    driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
    driver.findElementByXPath("//*[@content-desc='9']").click();
    t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction().moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
	}}
