package com.MyStore.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.CreateAnAccount;

public class TC_EmailValidation_002 extends BaseClass {

	@Test
	public void emailvalidation()
	{
		CreateAnAccount adduser=new CreateAnAccount(driver);
		
		driver.get(baseURL);
		logger.info("Url entered");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		adduser.clicksignin();
		logger.info("Clicked on signin link");
		adduser.creataccountemail("");
		logger.info("Enter in email field");
		adduser.clickcreateaccount();
		logger.info("Clicked on CreateAccount button");
	
		
		String emailtext=driver.findElement(By.id("email_create")).getText();
		
		
		String invmessage=driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText(); 
         System.out.println(invmessage);
	
    
         
         if(invmessage.contains("Invalid email"))
         {
        	 logger.info("Please enter valid email address, Testcase Failed");
         }
         
         else
         {
        	 logger.info(" Email address is valid , Testcase Passed"); 
         }
	/* if(emailtext.contains("@")&& emailtext.contains(".com")&&emailtext.contains(".org"))
	 {
		 logger.info(" Email address is valid , Testcase Passed"); 
		 
	 }
	 else
		
	 {
		
		 logger.info("Please enter valid email address, Testcase Failed");
	 }*/
	}

	
}
