package com.MyStore.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.MyStore_LoginPage;
import com.MyStore.Utilities.Mystore_XlUtils;

public class TC_Mystore_LoginDDT_004 extends BaseClass{
	
@Test(dataProvider="MyStore_LoginData")
public void LoginDDT(String user,String pwd) throws InterruptedException
{
	logger.info("Url is open");
	MyStore_LoginPage mylogin=new MyStore_LoginPage(driver);
	mylogin.clicksignin();
	mylogin.emailaddress(user);
	logger.info("Email address provided");
	mylogin.epassword(pwd);
	logger.info("Password provided");
	mylogin.clicksubmit();
	
	Thread.sleep(3000);
	WebElement msg1=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]"));
	String errmsg1=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
	System.out.println(errmsg1);
	//System.out.println(msg1.getText());
	//String rtievemsg=msg1.getText();
	
	if(errmsg1.contains("error"))
	{
		logger.warn("Login failed");
		driver.switchTo().defaultContent();
	}
	
	else
	{
		logger.info("Login Success");
		mylogin.clicksignout();
		Thread.sleep(3000);
	}
	/*if(msg1.isDisplayed()==true && rtievemsg.equals("Invalid password")&& rtievemsg.equals("Authentication failed") && rtievemsg.equals ("There is 1 error"))
		//if(msg1.("Invalid password")==true)
	{
		//Assert.assertTrue(false);
	
		logger.warn("Login failed");
		driver.switchTo().defaultContent();
	
		//System.out.println("Login failed");
	}
	else
	{
		//Assert.assertTrue(true);
		logger.info("Login Success");
		//System.out.println("Login success");
		mylogin.clicksignout();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}*/
	}
@DataProvider(name="MyStore_LoginData")
String [][]getdata() throws IOException
{
	String path=System.getProperty("user.dir")+"/src/test/java/com/MyStore/TestData/MYStore_LoginData.xlsx";
	int rownum=Mystore_XlUtils.getRowCount(path, "sheet1");
	int colcount=Mystore_XlUtils.getCellCount(path, "sheet1",1);
	
	String logindata[][]=new String [rownum][colcount];
	for(int i=1; i<=rownum; i++)
	{
		for(int j=0; j<colcount; j++)
		{
			logindata[i-1][j]=Mystore_XlUtils.getCellData(path, "sheet1", i, j);
			
		}
	}
return logindata;

}
/*public boolean isAlertPresent()
{
	try
	{
		//driver.switchTo().alert();
		return true;
		
	}
catch(NoAlertPresentException e)
	{
	return false;
	
	}
}*/

}
