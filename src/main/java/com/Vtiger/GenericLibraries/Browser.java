package com.Vtiger.GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
	public static WebDriver driver;
	
	public void openBrowser() throws Throwable
	{
		PropertyFileData prop=new PropertyFileData();
		String browser= prop.readDataFromProperty("browser");

		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			System.out.println("opening Chrome");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			System.out.println("opening Firefox");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("No proper browser detected, Opening Default Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		
	}
}
