package com.MyStore.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.MyStore_BuyProduct;

public class TC_MyStore_BuyProduct_005 extends BaseClass {

	@Test
	public void BuyProduct() throws InterruptedException
	{
		logger.info("url is open");
		MyStore_BuyProduct buyprd=new MyStore_BuyProduct(driver);
		//MyStore_LoginPage login=new MyStore_LoginPage(driver);
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		buyprd.clicksignin();
		buyprd.emailaddress(username);
		logger.info("username provided");
		buyprd.epassword(password);
		logger.info("Password provided");
		buyprd.clicksubmit();
		
		Thread.sleep(3000);
		buyprd.womenhover();
		//buyprd.clickTshirts();
		buyprd.mousehover2product();
		
		
		buyprd.ClickonMore();
		
		buyprd.increasequantity();
		
		//selecting size
		buyprd.size("3");
		
		//select colour
		buyprd.colourBlue();
		//adding to cart
		buyprd.addtocartbtn();
		
		//proceed to check out
		buyprd.proceedtocheckout();
		buyprd.summaryproceedcheckout();
		buyprd.adressproceedcheckout();
		buyprd.checkboxclick();
		buyprd.shippingproceedcheckout();
		
		//payment by bank wire
		buyprd.paybyBankwire();
		
		//confirm order
		buyprd.confirmOrder();
		
		//buyprd.confirmText("complete");
		System.out.println("test complete");
		
		String confirmtxt=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong")).getText();///html/body/div/div[2]/div/div[3]/div/div/p/strong
		
		if(confirmtxt.contains("complete"))
		{
			logger.info("Your order on Mystore is complete");
			logger.info("Testcase pass");
			//System.out.println("Your order on Mystore is complete, Test case pass");
		}
		else
		{
			logger.info("Your order on Mystore is not successfull, please try again");
			logger.info("Testcase failed");
			//System.out.println("Your order on Mystore is not complete, Test case failed");
		}
		Thread.sleep(1000);
	}
}
