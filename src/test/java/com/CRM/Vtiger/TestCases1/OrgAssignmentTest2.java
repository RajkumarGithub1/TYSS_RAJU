package com.CRM.Vtiger.TestCases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Vtiger.GenericLibraries.Browser;
import com.Vtiger.GenericLibraries.FakerData;
import com.Vtiger.GenericLibraries.PropertyFileData;
import com.Vtiger.GenericLibraries.WebDriverUtil;

public class OrgAssignmentTest2 extends Browser
{
	@Test
	public void AssignmentTestCase() throws Throwable
	{
		Browser b=new Browser();
		b.openBrowser();
		
		WebDriverUtil w=new WebDriverUtil(driver);
		w.maxwindow();
		
		PropertyFileData prop=new PropertyFileData();
		
		String url = prop.readDataFromProperty("url");
		driver.get(url);
		
		String u=prop.readDataFromProperty("username");
		String p=prop.readDataFromProperty("password");
		
		driver.findElement(By.name("user_name")).sendKeys(u);
		
		driver.findElement(By.name("user_password")).sendKeys(p);
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		
		FakerData fd=new FakerData();
		String compName = fd.getCompanyName();
		
		driver.findElement(By.name("accountname")).sendKeys(compName);
		
		driver.findElement(By.xpath("//option[@value='Education']")).click();
		driver.findElement(By.xpath("//option[@value='Customer']")).click();
		driver.findElement(By.xpath("//option[@value='Active']")).click();
		
		driver.findElement(By.xpath("//input[@accesskey=\"S\"]")).click();
		
		w.implicitlywaitForElement(20);
		
		WebElement ele3=driver.findElement(By.xpath("//td[text()='Organization No']/following-sibling::td[@class='dvtCellInfo']"));
		String t1=ele3.getText();
		String compID=t1.trim();		
		
		WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(), 'Organization Information')]"));
		
		String t=ele2.getText();
		System.out.println("gettext Name :"+t);
		System.out.println("input given :"+compName);
		
		if (t.contains(compName))
		{
			System.out.println("Org Saved, PASS");
		}
		else
		{
			System.out.println("Org Not Saved, FAIL");
		}
		
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys(compID);
		
		driver.findElement(By.name("submit")).click();

		w.implicitlywaitForElement(15);
//		WebElement ele4=driver.findElement(By.xpath("//input[@name='selected_id']/ancestor::tr[@class='lvtColData']/descendant::td[2]"));
		
		String xpat=compID+" ";
		WebElement ele4=driver.findElement(By.xpath("//td[text()='"+xpat+"']"));
		
		String getID=ele4.getText();
		System.out.println("comp getID :"+getID);
		System.out.println("comp trimmed ID :"+compID);
		
		if(compID.contains(getID))
		{
			System.out.println("Org available at Search, PASS");
		}
		else
		{
			System.out.println("Org not Available at Search, FAIL");
		}
		
		Thread.sleep(2000);
		driver.close();		
		
	}
}
