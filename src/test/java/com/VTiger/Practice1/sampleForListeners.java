package com.VTiger.Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Vtiger.POMClasses.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenersPractice.class)
public class sampleForListeners 
{
	public static WebDriver sdriver;
	WebDriver driver;
	
	@BeforeClass
	public void bc()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		sdriver=driver;
		
	}
	
	@Test
	public void FirstMethod()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");

		
		LoginPage lp=new LoginPage(driver);
		WebElement un = lp.getUsernameTextbox();
		boolean v1 = un.isDisplayed();
		Assert.assertEquals(v1, true);
		un.sendKeys("admin");
		
		WebElement pw=lp.getPasswordTextbox();
		boolean v2 = pw.isDisplayed();
		Assert.assertEquals(v2, true);
		pw.sendKeys("admin");
		Assert.assertEquals(true, false);

	}
	
	@Test
	public void SecondMethod()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");

		
		LoginPage lp=new LoginPage(driver);
		WebElement un = lp.getUsernameTextbox();
		boolean v1 = un.isDisplayed();
		Assert.assertEquals(v1, true);
		un.sendKeys("admin");
		
		WebElement pw=lp.getPasswordTextbox();
		boolean v2 = pw.isDisplayed();
		Assert.assertEquals(v2, true);
		pw.sendKeys("admin");
		Assert.assertEquals(true, false);
		
}
}
