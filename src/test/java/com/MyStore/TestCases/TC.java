package com.MyStore.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.MyStore_LoginPage;


public class TC extends BaseClass {

	
	@Test
	public void logintest() throws IOException, InterruptedException
	{
	
	logger.info("Url is open");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	MyStore_LoginPage mylogin=new MyStore_LoginPage(driver);
	/*mylogin.clicksignin();
	mylogin.emailaddress(username);
	logger.info("Email address provided");
	mylogin.epassword(password);
	logger.info("Password provided");
	mylogin.clicksubmit();*/
	
	Thread.sleep(3000);
	
	WebElement women=driver.findElement(By.linkText("Women"));
	Actions act=new Actions(driver);
	act.moveToElement(women).build().perform();
	
	
	//driver.findElement(By.linkText("Women")).click();
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]")).click();
WebElement img=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img"));
	
act.moveToElement(img).build().perform();
driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[2]")).click();
	
	String productname=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/h1")).getText();
	System.out.println(productname); 
	
	
	driver.findElement(By.name("search_query")).sendKeys(productname);
	driver.findElement(By.name("submit_search")).click();
	
	String searchreasult=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]")).getText();
	System.out.println("after search reasult"+searchreasult);
	
	 /*  WebElement msg1=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]"));
	 //*[@id="center_column"]/div[1]
			//System.out.println(msg1.getText());
			String rtievemsg=msg1.getText();
			System.out.println(rtievemsg);
			
			if(msg1.isDisplayed()==true)
			{
				System.out.println("Please enter fields");
			}
			
			else
			{
				System.out.println("no empty fields");
			}*/
	
	
}
}