package com.ttech.mobileTesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class miscelleanous extends CapabilitiesMainClass{
	
	@Test
	public void miscelleanou() throws MalformedURLException {

	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.out.println(driver.currentActivity());
    System.out.println(driver.getContext());
    //views - Native , Hybrid, Webview
    System.out.println(driver.getOrientation());
    System.out.println(driver.isLocked());
  //  driver.hideKeyboard();
	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	driver.pressKeyCode(AndroidKeyCode.BACK);

}}
