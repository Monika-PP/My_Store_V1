package com.MyStore.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccount {
WebDriver ldriver;


public CreateAnAccount(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}


@FindBy(how=How.LINK_TEXT, using="Sign in")
@CacheLookup
WebElement lnksighin;//signin link which will navigate to authentication page and ask for user to put email


@FindBy(how=How.NAME,using="email_create")
@CacheLookup
WebElement txtemailcreate; // here user has to enter emailaddress

@FindBy(how=How.NAME,using="SubmitCreate")
@CacheLookup
WebElement btnCreateanaccount;

@FindBy(how=How.ID, using="customer_firstname") // /html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input  #customer_firstname
@CacheLookup
WebElement txtfirstname;

@FindBy(how=How.ID,using="customer_lastname")
@CacheLookup
WebElement txtlastname;

@FindBy(how=How.ID,using="email")
@CacheLookup
WebElement txtemail;

@FindBy(how=How.ID,using="passwd")
@CacheLookup
WebElement txtpassword;

@FindBy(how=How.ID,using="days")
@CacheLookup
WebElement drpdate;


@FindBy(how=How.ID,using="months")
@CacheLookup
WebElement drpmonth;


@FindBy(how=How.ID,using="years")
@CacheLookup
WebElement drpyear;


@FindBy(how=How.ID, using="newsletter")
@CacheLookup
WebElement chknewsletter;


@FindBy(how=How.ID, using="optin")
@CacheLookup
WebElement chksploffer;

@FindBy(how=How.ID,using="company")
@CacheLookup
WebElement txtcompany;

@FindBy(how=How.ID,using="address1")
@CacheLookup
WebElement txtadd1;


@FindBy(how=How.ID,using="address2")
@CacheLookup
WebElement txtadd2;

@FindBy(how=How.ID,using="city")
@CacheLookup
WebElement txtcity;


@FindBy(how=How.ID,using="postcode")
@CacheLookup
WebElement txtpostcode;


@FindBy(how=How.ID, using="id_state")
@CacheLookup
WebElement drpstate;

@FindBy(how=How.ID,using="id_country")
@CacheLookup
WebElement drpcountry;

@FindBy(how=How.ID,using="other")
@CacheLookup
WebElement txtadditionalinfo;

@FindBy(how=How.ID,using="phone")
@CacheLookup
WebElement txthomephone;


@FindBy(how=How.ID,using="phone_mobile")
@CacheLookup
WebElement txtmobile;


@FindBy(how=How.ID,using="alias")
@CacheLookup
WebElement txtalias;

@FindBy(how=How.ID, using="submitAccount")
@CacheLookup
WebElement btnRegister;


public void clicksignin()
{
	lnksighin.click(); //signin link click
}

public void creataccountemail(String createmail)
{
	txtemailcreate.sendKeys(createmail); //provide email
}

public void clickcreateaccount()
{
	btnCreateanaccount.click();//click on create new account
}

public void cusfirsttname(String fname)
{
	txtfirstname.sendKeys(fname);
}


public void custlastname(String lname)
{
	txtlastname.sendKeys(lname);
}

public void custemail(String cemail)
{
	txtemail.sendKeys(cemail);
}

public void custpassword(String cpassword)
{
	txtpassword.sendKeys(cpassword);
}


public void ddate(String cdate)
{
	 Select drop = new Select(drpdate);
     drop.selectByValue(cdate);  
}

public void dmonth(String cmonth)
{
	Select dpmonth=new Select(drpmonth);
	dpmonth.selectByValue(cmonth);
}

public void dyear(String cyear)
{
	Select dyear=new Select(drpyear);
	dyear.selectByValue(cyear);
}

public void newsletter()
{
	chknewsletter.isEnabled();
	
}

public void sploffer()
{
	chksploffer.isEnabled();	
}

public void ccompany(String c_company)
{
	txtcompany.sendKeys(c_company);
}

public void address1(String cadd1)
{
	txtadd1.sendKeys(cadd1);
}

public void address2(String cadd2)
{
	txtadd2.sendKeys(cadd2);
}

public void cust_city(String ccity)
{
	txtcity.sendKeys(ccity);
}

public void cust_postcode(String cpostcode)
{
	txtpostcode.sendKeys(cpostcode);
}

public void cust_state(String cstate)
{
	Select dstate=new Select(drpstate);
	dstate.selectByValue(cstate);
}
public void cust_country(String ccountry)
{
Select dcountry=new Select (drpcountry);
dcountry.selectByValue(ccountry);
}
public void cust_addinfo(String caddinfo)
{
	txtadditionalinfo.sendKeys(caddinfo);
}
public void cust_homephone(String chomephone)
{
	txthomephone.sendKeys(chomephone);
}

public void cust_mobile(String cmobile)
{
	txtmobile.sendKeys(cmobile);
}

public void cust_alias(String calias)
{
	txtalias.sendKeys(calias);
}

public void cregisterbtn() {
	btnRegister.click();
}
}
