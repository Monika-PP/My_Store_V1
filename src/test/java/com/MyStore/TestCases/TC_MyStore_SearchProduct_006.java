package com.MyStore.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.MyStore_SearchProduct;

public class TC_MyStore_SearchProduct_006 extends BaseClass {

	
	@Test
	public void SearchProduct() throws InterruptedException {
		logger.info("Url is open");
		
		MyStore_SearchProduct searchprd=new MyStore_SearchProduct(driver);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		searchprd.womenhover();
		//searchprd.clickTshirts();
		searchprd.mousehover2product();
	
		searchprd.ClickonMore();
	
		
		//searchprd.getproductname();
		
	String productname=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/h1")).getText();
	System.out.println(productname); 
		
	searchprd.searchtext(productname);
	searchprd.searchbutton();
	Thread.sleep(1000);
	
	
	String searchreasult=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]")).getText();
	//System.out.println("after search reasult"+searchreasult);
	//String si=searchreasult.toLowerCase();
	
	
if(searchreasult.equalsIgnoreCase(productname))
{
	logger.info("Results matched, Test case Passed");
}
else
{
	logger.info("Results does not matched, Test case failed");
}
	}
}
