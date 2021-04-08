package com.MyStore.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.MyStore_RemovingItemfromCart;

public class TC_MyStore_RemoveFromCart_009 extends BaseClass{

	@Test
	public void Removeitemfromcart() throws InterruptedException
	{
		logger.info("Url is open");
		MyStore_RemovingItemfromCart removecart= new MyStore_RemovingItemfromCart(driver );
		
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
       removecart.clicksignin();
        removecart.emailaddress(username);
		logger.info("username provided");
		removecart.epassword(password);
		logger.info("Password provided");
		removecart.clicksubmit();
		
		
		removecart.womenhover();
		
		logger.info("cliked on Women link");
		//removecart.mousehover2product();
		
		//removecart.clickBlouse();
		
		removecart.mousehover2product();
		
		
		removecart.ClickAddtocart();
	
		String cartmsg=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/h2/span[1]")).getText();
		System.out.println(cartmsg);
		
		logger.info("Product added to cart successfully");
		
	
		removecart.ClickcontinueShopping();
		
	
		removecart.clickonDresses();
		removecart.clickCasualDresses();
		
		removecart.clickCasualDressesimg();
		
		
		try
		{
			removecart.ClickAddtocart();
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]")).click();
		}                               
		
		Thread.sleep(3000);
		String cartitem=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).getText();
		System.out.println("Item Present in cart is  "   +    cartitem);
		
		removecart.Mousehoveroncart();
		//String cartitem2=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).getText();
		//System.out.println("Item Present after removing in cart is  "   +    cartitem2);
		
	}
	
}
