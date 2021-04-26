package com.qa.androidproject.Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.androidproject.Base.TestBase;
import com.qa.androidproject.Utilities.FunctionalUtilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchMyApp extends TestBase {

	public LaunchMyApp() throws IOException {
		super();
	}

	public AndroidDriver<WebElement> driver;

	@Test
	public void TC1_AmazonSearch() throws Exception {

//		logger.info("***********************Amazon Search Test case started**********************");
//		logger.info("searchText is "+searchText);
		WebElement searchTxtBox = TestBase.driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		FunctionalUtilities.enterText(searchTxtBox,searchText,"Search Text Box");
//		.sendKeys(searchText);
		WebElement searchButton = TestBase.driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")); 
//		.click();
		FunctionalUtilities.clickButton(searchButton,"Search Submit Button");
//		logger.info("***********************Amazon Search Test case Completed successfully**********************");
		System.out.println("Test Case1 Completed");

	}
}
