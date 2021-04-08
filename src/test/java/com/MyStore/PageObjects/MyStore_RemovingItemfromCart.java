package com.MyStore.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyStore_RemovingItemfromCart {
WebDriver ldriver;

public MyStore_RemovingItemfromCart(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this );
}
//Login elements

//Login element
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


//buying product element
@FindBy(how=How.LINK_TEXT,using="Women")
@CacheLookup
WebElement lnkwomen;

@FindBy(how=How.XPATH,using="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a")
@CacheLookup
WebElement lnkBlouses;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img") //2nd product bouses
@CacheLookup                 //html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img
WebElement img2Blouse;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/div[2]/a[1]/span ")//Addto cart button
@CacheLookup                
WebElement btnAddtocart;


//continueshopping
@FindBy(how=How.XPATH, using="/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")
@CacheLookup                  
WebElement btncontinueshopping;

@FindBy(how=How.LINK_TEXT,using="Dresses")
@CacheLookup
WebElement lnkDresses;


@FindBy(how=How.LINK_TEXT,using="Casual Dresses")
@CacheLookup
WebElement lnkCasualDresses;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")
@CacheLookup
WebElement imgcasualdress;

//remove button from cart
@FindBy(how=How.XPATH,using="/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/dl/dt[1]/span/a")
@CacheLookup
WebElement btnremovefromcart;

@FindBy(how=How.XPATH,using="/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[5]")
@CacheLookup
WebElement emptycartlbl;


@FindBy (how=How.XPATH,using="/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")
@CacheLookup
WebElement cartmousehover;


//login element methods
public void clicksignin()
{
	lnksighin.click();
	
}

public void Clicksignout()
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

//buy product elements method
public void womenhover()
{
	//Actions act=new Actions(ldriver);
	//act.moveToElement(lnkwomen).build().perform();
	lnkwomen.click();
}

public void clickBlouse()
{
	//Actions act=new Actions(ldriver);
	lnkBlouses.click();
}

public void mousehover2product()
{
	Actions act=new Actions(ldriver);
	act.moveToElement(img2Blouse).build().perform();
}


public void ClickAddtocart()
{
	btnAddtocart.click();
}

public void ClickcontinueShopping()
{
	btncontinueshopping.click();
}

public void clickonDresses()
{
	lnkDresses.click();
}


public void clickCasualDresses()
{
	lnkCasualDresses.click();
}

public void clickCasualDressesimg()
{
	Actions act=new Actions(ldriver);
	act.moveToElement(imgcasualdress).build().perform();
}

public void RemoveFromCartbtn()
{
	btnremovefromcart.click();
}

public void Mousehoveroncart()
{
Actions act=new Actions(ldriver);
act.moveToElement(cartmousehover).build().perform();

}
}
