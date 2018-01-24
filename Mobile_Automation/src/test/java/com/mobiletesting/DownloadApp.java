package com.mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DownloadApp {

	//This is from Mukesh and it is working fine 
	@SuppressWarnings("deprecation")
	@Test
	public  void test1() throws MalformedURLException {
		
	
	//File f= new File("src\\test\\java");
	//File fs=new File(f, "C:\\Users\\rubeldm\\eclipse-workspace\\StartMobieTest\\src\\test\\java\\bookMyShow-ucb.apk");
	
	DesiredCapabilities cap= new DesiredCapabilities();
	//cap.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
	//cap.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device" );
	
	//cap.setCapability(MobileCapabilityType.VERSION, "6.0");
	//cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	//cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\rubeldm\\eclipse-workspace\\StartMobieTest\\src\\test\\java\\bookMyShow-ucb.apk");
	
	cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\rubeldm\\eclipse-workspace\\StartMobieTest\\src\\test\\java\\ApiDemos-debug (2).apk");
	
	//cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\rubeldm\\eclipse-workspace\\StartMobieTest\\src\\test\\java\\ContactManager.apk");
	
	
	
	
	AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub "),cap);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	//driver.findElementByAndroidUIAutomator("new UIScrollable(new Uiselector()).ScrollIntoview(text()"Views")));
	//driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").text(\"ALLOW\")"
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
	// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").click();
     
	//String tx= driver.findElement(By.xpath("//android.view.View[@content-desc='Hello World! - 1']")).getText();
	
     //Drug And Drop
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text('Views'));").click();
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
	//Long Touch 
	
	 TouchAction t=new TouchAction(driver);
   
driver.findElementByXPath("//*[@content-desc='9']").click();
t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction().moveTo(driver.findElementByXPath("//*[@content-desc='30']")).release().perform();
	

			
}	

}//end class


