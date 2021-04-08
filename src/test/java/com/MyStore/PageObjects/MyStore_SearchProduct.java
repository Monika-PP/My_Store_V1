package com.MyStore.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyStore_SearchProduct {
WebDriver ldriver;

public MyStore_SearchProduct(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this );
}

//search product elements
@FindBy(how=How.LINK_TEXT,using="Women")
@CacheLookup
WebElement lnkwomen;

@FindBy(how=How.XPATH,using="//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']")////*[@id="block_top_menu"]/ul/li[3]/a
@CacheLookup           //div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']
WebElement lnktshirts;

//mouse hover on 2nd imgproduct
@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")//*[@id="center_column"]/ul/li/div/div[1]/div/a[1]/img
@CacheLookup  //html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img    //*[@id="center_column"]/ul/li[1]/div/div[1]/div/a[1]/img
WebElement img2; 

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[2]")
@CacheLookup
WebElement lnkmore;

//product name
@FindBy(how=How.XPATH,using="//*[@id=\"center_column\"]/div/div/div[3]/h1") 
@CacheLookup
WebElement productname;


@FindBy(how=How.ID,using="search_query_top")
@CacheLookup
WebElement searchtxt;

@FindBy(how=How.NAME,using="submit_search")
@CacheLookup
WebElement submitsearchbtn;

@FindBy(how=How.XPATH,using="//*[@id=\"center_column\"]/h1/span[1]")
@CacheLookup
WebElement searchproductname;

@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[3]/div[1]/a")
@CacheLookup
WebElement lnkaddtowishlist;

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

public void getproductname()
{
	productname.getText();
	
}

public void searchtext(String stext)
{
	searchtxt.sendKeys(stext);
}
public void searchbutton()
{
	submitsearchbtn.click();
}

public void addtowishlist()
{
	lnkaddtowishlist.click();
}
}
