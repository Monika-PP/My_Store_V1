package com.MyStore.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyStore_LoginPage {
WebDriver ldriver;

public MyStore_LoginPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
	

@FindBy(how=How.LINK_TEXT,using="Sign in")
@CacheLookup
WebElement lnksighin;

@FindBy(how=How.ID,using="email")
@CacheLookup
WebElement semaddress;

@FindBy(how=How.ID,using="passwd")
@CacheLookup
WebElement spassword;

@FindBy(how=How.ID,using="SubmitLogin")
@CacheLookup
WebElement ssubmit;

@FindBy(how=How.LINK_TEXT,using="Sign out")
@CacheLookup
WebElement lnksignout;

@FindBy(how=How.XPATH, using="//*[@id=\"center_column\"]/div[1]/ol/li/text()")
@CacheLookup
WebElement errmessage;


public void emessage(String msg1)
{
	String msg=errmessage.getText();
}

public void clicksignin()
{
	lnksighin.click();
	
}


public void clicksignout()
{
	lnksignout.click();
}
public void emailaddress(String semail)
{
	semaddress.sendKeys(semail);
}

public void epassword(String spwd)
{
	spassword.sendKeys(spwd);
}

public void clicksubmit()
{
	ssubmit.click();
}
}
