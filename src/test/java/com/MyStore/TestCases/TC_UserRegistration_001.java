package com.MyStore.TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.MyStore.PageObjects.CreateAnAccount;

public class TC_UserRegistration_001 extends BaseClass {
	
@Test
public void CreateAnAcount()
{
	CreateAnAccount adduser=new CreateAnAccount(driver);
//	driver.get(baseURL);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	adduser.clicksignin();
	

	String generatedstring=RandomStringUtils.randomAlphabetic(8);
	String email=generatedstring+"@gmail.com";
	adduser.creataccountemail(email);
	
	adduser.clickcreateaccount();
	adduser.cusfirsttname("Maria"); 
	adduser.custlastname("Paul");
	adduser.custpassword("01234");
	adduser.ddate("25");
	adduser.dmonth("8");
	adduser.dyear("1987");
	adduser.sploffer();
	adduser.ccompany("InfoIT");
	adduser.address1("Banglore");
	adduser.address2("Banglore India");
	adduser.cust_city("Hyderabad");
	adduser.cust_state("50");
	adduser.cust_postcode("54545");
	
	adduser.cust_country("21");
	adduser.cust_addinfo("hgdgfkdjdhdndfh");
	adduser.cust_mobile("8989898767");
	adduser.cust_alias("fgdffgdhjsdgywete");
	adduser.cregisterbtn();
	
	
	/*public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return (generatedstring)
	}*/
	
	


	
	String Username=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText(); //*[@id="header"]/div[2]/div/div/nav/div[1]/a/span
	
	if(Username.contains("Maria"))
	{
		System.out.println("User registerd successfully , Test Passed");
		
	}
	else
	{
		System.out.println("User didi not registerd successfully , Test Failed");
	}
	
	


	
	




	
}

}
