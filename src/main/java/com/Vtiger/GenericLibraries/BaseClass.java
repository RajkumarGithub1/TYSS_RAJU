package com.Vtiger.GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Vtiger.POMClasses.HomePage;
import com.Vtiger.POMClasses.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass 
{
	
	public WebDriver driver;
	PropertyFileData pfdata=new PropertyFileData();

	@BeforeClass
	public void LaunchBrowser() throws Throwable
	{
		String browser= pfdata.readDataFromProperty("browser");

		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			System.out.println("opening Chrome");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			System.out.println("opening Firefox Browser");
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			System.out.println("Opening Edge Browser");
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("No proper browser detected, Opening Default chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		
		WebDriverUtil web=new WebDriverUtil(driver);
		web.maxwindow();
		
		driver.get(pfdata.readDataFromProperty("url"));
		
	}
	
		@BeforeMethod
		public void login() throws Throwable
		{
			LoginPage loginpg =new LoginPage(driver);
			loginpg.LoginTopage();
			
		}
	
		
		@AfterMethod
		public void signOut() throws InterruptedException
		{
			HomePage homepg=new HomePage(driver);
			homepg.signout();
			
			
			
		}
		
		
		@AfterClass
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(6000);
			driver.close();
		}
	
}
