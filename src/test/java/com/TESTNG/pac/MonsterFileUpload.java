package com.TESTNG.pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MonsterFileUpload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		Thread.sleep(2000);
		
		WebElement upload = driver.findElement(By.xpath("//span[text()='Choose CV']"));
		
		Thread.sleep(5000);
		upload.sendKeys("C:\\Users\\DELL\\Desktop\\RAJKUMAR_JSAPI_3.0 .docx");
		
		
		
	}
}
