package com.VTiger.Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.POMClasses.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionsPractice 
{
	WebDriver driver;
	@Test
	public void hardassets()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
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
		
		WebElement su = lp.getSubmitbutton();
		boolean v3 = su.isDisplayed();
		Assert.assertEquals(v3, true);
		su.click();
		
		
		
		
	}
}
