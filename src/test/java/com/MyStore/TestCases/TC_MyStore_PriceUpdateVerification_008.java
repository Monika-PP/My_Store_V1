package com.MyStore.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.MyStore_BuyProduct;

public class TC_MyStore_PriceUpdateVerification_008 extends BaseClass {

	
	@Test
	public void priceupdatecheck() throws InterruptedException
	{
		logger.info("Url is open");
		MyStore_BuyProduct priceverify=new MyStore_BuyProduct(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		priceverify.clicksignin();
		priceverify.emailaddress(username);
		logger.info("username provided");
		priceverify.epassword(password);
		logger.info("Password provided");
		priceverify.clicksubmit();
		
		Thread.sleep(3000);
		priceverify.womenhover();
		//buyprd.clickTshirts();
		
		logger.info("cliked on Women link");
		priceverify.mousehover2product();
		
		
		priceverify.ClickonMore();
		
		
		priceverify.clearquantity();
		
		logger.info("Clear quantity");

		priceverify.setquantity("1");
		
		logger.info("Quantity set to 1");
		//select colour
		priceverify.colourBlue();
		logger.info("Blue colour selected");
				//adding to cart
		priceverify.addtocartbtn();
				
				//proceed to check out
		priceverify.proceedtocheckout();
		logger.info("Proceed to checkout");
	
		
		String unitprice=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/span/span")).getText();
		System.out.println(unitprice);
		
		String total=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[6]/span")).getText();
		System.out.println(total);
		
		//String grandtotal=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tfoot/tr[6]/td[2]/span")).getText();
		//System.out.println(grandtotal);
		
		priceverify.increasecartquantity();
		
		String afterincreasegrandtotal=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tfoot/tr[6]/td[2]/span")).getText();
		System.out.println(afterincreasegrandtotal);
		if(afterincreasegrandtotal.matches(total))
		{
			logger.info("Price not Reflecting, Testcase Failed");
		}
		else
		{
			logger.info("Price is reflecting, Testcase Passed");
		}
		
		priceverify.Clicksignout();
		
	
	}
}
