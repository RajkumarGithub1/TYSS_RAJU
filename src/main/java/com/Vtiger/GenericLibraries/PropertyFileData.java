package com.Vtiger.GenericLibraries;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileData 
{
	public String readDataFromProperty(String key) throws Throwable 
	{
		FileInputStream fis=new FileInputStream("../TYSS_RAJU/dataFile.properties");
		Properties p=new Properties();
		p.load(fis);
		
		return p.getProperty(key);
		
		
		
	}
}
