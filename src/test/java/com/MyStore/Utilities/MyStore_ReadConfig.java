package com.MyStore.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class MyStore_ReadConfig {
Properties pro;


public MyStore_ReadConfig()
{
	File fsrc=new File("./Configurations/config.properties");
	
	try
	{
		FileInputStream fis=new FileInputStream(fsrc);
		pro=new Properties();
		pro.load(fis);
	}
	catch(Exception e)
	{
		System.out.println("Exception is" + e.getMessage());
	}
}

public String getappurl()
{
	String url=pro.getProperty("baseURL");
	return url;
	}

public String getusername()
{
	String eusername=pro.getProperty("username");
	return eusername;
}

public String getpassword()
{
	String epassword=pro.getProperty("password");
	return epassword;
	}

public String getchromepath() ////This method will return chromepath
{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	
}

public String getiepath() //this will return iepath
{
	String iepath=pro.getProperty("iepath");
	return iepath;
}

public String getfirefoxpath()//this will return firefoxpath
{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
}




}
