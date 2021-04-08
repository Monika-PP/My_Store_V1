package com.MyStore.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.MyStore_SearchProduct;

public class TC_MyStore_AddToWishlistVerification_007 extends BaseClass {

	@Test
	public void addtowishlistverification() throws InterruptedException
	{
		logger.info("Url is open");
		MyStore_SearchProduct wishlist=new MyStore_SearchProduct(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		wishlist.womenhover();
		
		logger.info("Mousehover on Women");
		
		wishlist.mousehover2product();
		
		logger.info("Mousehover on second product");
		
		wishlist.addtowishlist();
	logger.info("Click on AddtoWishlist ");
		
		String msg=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/p")).getText();
		logger.info(msg);
		logger.info("Error Message Displayed, Testcase Passed");
		
		Thread.sleep(2000);
	}
	
	
}
