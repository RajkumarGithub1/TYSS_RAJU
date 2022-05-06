package com.VTiger.Practice1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotPractice 
{
	WebDriver driver;
	@Test
	public void Screenshot() throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		String loc="../TYSS_RAJU/screenshots/3.jpg";
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(loc);
		
		Files.copy(src, dest);
		
		
	}
}