package com.qa.androidproject.Utilities;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.qa.androidproject.Base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidUtils {

	public void launchApp() throws Exception {

		System.out.println("Test case started");
//		TestBase.logger.info("***********************Test case started**********************");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "R52N70RFSSP");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(CapabilityType.VERSION, "10");
		TestBase.driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		TestBase.driver.get(TestBase.url);
//		TestBase.logger.info(TestBase.url);
//		TestBase.logger.info("***********************Amazon WebPage Launched**********************");
		ReportUtilities.test.log(LogStatus.PASS,"App Launched Successfully");
		System.out.println("App Launched");
		
		
		
		
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"f6e5c49e9804");
//      mCurrentFocus=Window{ecedbc0 u0 com.miui.calculator/com.miui.calculator.cal.CalculatorActivity}
//		cap.setCapability("appPackage", "com.miui.calculator");
//		cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
//
//		 cap.setCapability("appPackage", "com.android.contacts");
//		 cap.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
//
//		 cap.setCapability("appPackage","com.miui.gallery");
//		 cap.setCapability("appActivity","com.miui.gallery.activity.HomePageActivity");
//
//		 cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		
	}

}
