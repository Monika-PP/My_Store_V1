package com.MyStore.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.MyStore_LoginPage;

public class TC_MyStoreLoginTest_003 extends BaseClass {

	@Test
	public void logintest() throws IOException
	{
		logger.info("Url is open");
		MyStore_LoginPage mylogin=new MyStore_LoginPage(driver);
		mylogin.clicksignin();
		mylogin.emailaddress(username);
		logger.info("Email address provided");
		mylogin.epassword(password);
		logger.info("Password provided");
		mylogin.clicksubmit();
		
		
		
		if (driver.getTitle().equals("My account - My Store"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else 
		{
			CaptureScreen(driver,"Login Test");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
	
}