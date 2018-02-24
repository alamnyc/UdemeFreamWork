package com.ttech.mobileTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

     public class CapabilitiesMainClass {   // This Class for All project fixed Coding
	
	 public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
	
		
	 File appDir = new File("src/main/java");
     File App = new File(appDir, "ApiDemos-debug.apk"); // This 2 Line for configuration with (ApiDemos-debug.apk) File
     
     DesiredCapabilities capabilities = new DesiredCapabilities();  // This Line for connect the appium server to Eclipse
     
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo"); // This Line for identify device
     
     capabilities.setCapability(MobileCapabilityType.APP, App.getAbsolutePath()); // This Line for (ApiDemos-debug.apk) download Demoapp in device
     
     AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); // This line for appium server connects
     return driver;
    
	 }}