package com.ttech.mobileTesting;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CapabilitiesXpath extends CapabilitiesMainClass {
 @Test
 public void allXpath () throws MalformedURLException  {
	
AndroidDriver<AndroidElement> driver = capabilities();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // this 2 line fix for every Class

driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();  // this 2 line by xpath

driver.findElement(By.id("android:id/checkbox")).click(); // this line by ID

driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

driver.findElementByClassName("android.widget.EditText").sendKeys("HELLO"); // this line by ClassName

driver.findElementsByClassName("android.widget.Button").get(1).click();  // this line by indElementsByClassName and flowing (index) 
         
 }}
