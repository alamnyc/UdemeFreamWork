package com.ttech.mobileTesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.ttech.mobileTesting.CapabilitiesMainClass;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SomeMethodes extends CapabilitiesMainClass {
	     @Test
         public void SomeMethod() throws MalformedURLException {
	     AndroidDriver<AndroidElement> driver=capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElementByXPath("//android.widget.TextView[@text='Done']").click();
	     driver.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='World Music']").click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"));");
	     driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();
	     driver.findElementById("com.raaga.android:id/toolbar_logo").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Settings']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Push Notification']").click();
	     
	     Point point= driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
	     TouchAction t= new TouchAction(driver);
	     //toggle on
	     t.tap(point.x+20, point.y+30).perform();
	     //toggle off
	     t.tap(point.x+100, point.y+30).perform();
	     //Previous//appium version older- scrollTo()
	     }}