package com.MyStore.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyStore_BuyProduct {
WebDriver ldriver;

public MyStore_BuyProduct(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}

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

@FindBy(how=How.XPATH,using="//*[@id=\\\"block_top_menu\\\"]/ul/li[3]")////*[@id="block_top_menu"]/ul/li[3]/a
@CacheLookup         //div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']
WebElement lnktshirts;

//mouse hover on 2nd imgproduct
@FindBy(how=How.XPATH,using="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
@CacheLookup
WebElement img2;

@FindBy(how=How.LINK_TEXT,using="More")
@CacheLookup
WebElement lnkmore;

@FindBy(how=How.XPATH,using="//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")
@CacheLookup
WebElement btnplus;

@FindBy(how=How.ID,using="group_1")
@CacheLookup
WebElement drpsize;

@FindBy(how=How.XPATH,using="//*[@id=\"color_13\"]")
@CacheLookup
WebElement clrorange;

@FindBy(how=How.XPATH,using="//*[@id=\"color_14\"]")
@CacheLookup
WebElement clrblue;

@FindBy(how=How.NAME,using="Submit")
@CacheLookup
WebElement btnsubmit;

@FindBy(how=How.LINK_TEXT,using="Proceed to checkout")
@CacheLookup
WebElement btnproceedtocheckout;


@FindBy(how=How.LINK_TEXT,using="Proceed to checkout")
@CacheLookup
WebElement sumryproceedtocheckout;

@FindBy(how=How.NAME,using="processAddress")
@CacheLookup
WebElement btnprocessAddress;


@FindBy(how=How.ID,using="cgv")
@CacheLookup
WebElement chkterms;

@FindBy(how=How.NAME,using="processCarrier")
@CacheLookup
WebElement btnprocessCarrier;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")
@CacheLookup
WebElement lnkpaybywire;

@FindBy(how=How.LINK_TEXT,using="Pay by check")
@CacheLookup
WebElement lnkbycheck;

@FindBy(how=How.XPATH,using="//*[@id=\"cart_navigation\"]/button")
@CacheLookup
WebElement btnconfirmorder;

@FindBy(how=How.XPATH,using="//*[@id=\"center_column\"]/div/p/strong")
@CacheLookup
WebElement labelconfirm;

@FindBy(how=How.ID,using="quantity_wanted")
@CacheLookup
WebElement txtquantity;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/div/a[2]")
@CacheLookup
WebElement cartquantity;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[4]/span/span")
@CacheLookup
WebElement lblunitprice;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[6]/span")
@CacheLookup
WebElement lbltotal;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div/div[2]/table/tfoot/tr[6]/td[2]/span")
@CacheLookup
WebElement lblgrandtotal;




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

public void clickTshirts()
{
	//Actions act=new Actions(ldriver);
	lnktshirts.click();
}

public void mousehover2product()
{
	Actions act=new Actions(ldriver);
	act.moveToElement(img2).build().perform();
}

public void ClickonMore()
{
	lnkmore.click();
}

public void increasequantity()
{
	btnplus.click();
}


public void clearquantity()
{
	txtquantity.clear();
}
public void size(String csize)
{
	Select se=new Select(drpsize);
	se.selectByValue(csize);
}
public void colourOrange()
{
	clrorange.click();
}

public void colourBlue()
{
	clrblue.click();
}

public void addtocartbtn()
{
	btnsubmit.click();
}

public void proceedtocheckout()
{
	btnproceedtocheckout.click();	
}

public void summaryproceedcheckout()
{
	sumryproceedtocheckout.click();
}

public void adressproceedcheckout()
{
	btnprocessAddress.click();
}


public void checkboxclick()
{
	chkterms.click();
}

public void shippingproceedcheckout()
{
	btnprocessCarrier.click();
}

public void paybyBankwire()
{
	lnkpaybywire.click();
}

public void paybyCheck()
{
	lnkbycheck.click();
}

public void confirmOrder()
{
	btnconfirmorder.click();
}

public void confirmText(String confirmmsg)
{
	confirmmsg= labelconfirm.getText();
}

public void setquantity(String cquantity)
{
	txtquantity.sendKeys(cquantity);
}

public void increasecartquantity()
{
	cartquantity.click();
}

public void unitprice()
{
	lblunitprice.click();
}
}
