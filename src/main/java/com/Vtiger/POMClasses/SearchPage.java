package com.Vtiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	WebDriver driver;
	public SearchPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@title='Organizations']")
	private WebElement orgNameElementfromSearch;
	
	
	public WebElement getorgNameElementfromSearch() {
		return orgNameElementfromSearch;
	}
	
	public String getorgNameText()
	{
		String orgNameis=orgNameElementfromSearch.getText();
		return orgNameis;
	}
	
	
	
	
	
	
	
	
	
}
