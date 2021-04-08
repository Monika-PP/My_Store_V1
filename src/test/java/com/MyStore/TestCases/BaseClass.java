package com.MyStore.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.MyStore.Utilities.MyStore_ReadConfig;

public class BaseClass {
	MyStore_ReadConfig readconfig= new MyStore_ReadConfig();
	
	public String baseURL=readconfig.getappurl();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	
	
	//public String baseURL="http://automationpractice.com/index.php";
    public static WebDriver driver;
    public static Logger logger;
    
	@Parameters("browser")
    @BeforeClass
    public void setup(String br)
    {
    logger=logger.getLogger("MyStore Ecommerce Application");
    PropertyConfigurator.configure("Log4j.properties");
   // BasicConfigurator.configure();
    BasicConfigurator.configure();
   
    
    if(br.equals("chrome"))
    {
    	System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    }
		
    else if(br.equals("firefox"))
    {
    	System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
    	driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    }
    	
    else if(br.equals("ie"))
    {
    	System.setProperty("webdriver.ie.driver", readconfig.getiepath());
    	driver=new InternetExplorerDriver();
    	driver.manage().window().maximize();
    }
    	
    	driver.get(baseURL);
    }
    
	public void CaptureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("ScreenShot Taken");
		
	}

	
	
    @AfterClass
    public void teardown()
    {
    	driver.close();
    	driver.quit();
    	
    }
}
