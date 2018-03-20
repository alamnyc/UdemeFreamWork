package com.usa.realdevice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClassRealMobile {
    @Test
   public  void test1()throws MalformedURLException {

  DesiredCapabilities cap= new DesiredCapabilities(); // this is Selenium package (DesiredCapabilities) class must create object
  cap.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME); // for browser open formula
  cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device" );
  cap.setCapability(MobileCapabilityType.VERSION, "5.0.2");
  AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub "),cap); //appium connectivity host
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  driver.get("https://www.facebook.com/");
  driver.findElement(By.xpath("//*[@id=\"m_login_email\"]")).sendKeys("nurnaharbegumnyc@gmail.com");
  driver.findElement(By.xpath("//*[@id=\"m_login_password\"]")).sendKeys("SAYEDawan2008");
  driver.findElement(By.xpath("//*[@id=\"u_0_5\"]")).click();
  }}//End class