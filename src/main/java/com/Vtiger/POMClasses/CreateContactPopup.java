package com.Vtiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPopup 
{
	WebDriver driver;
	public CreateContactPopup(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='javascript:window.close();'])[2]")
	private WebElement selectOrgNameLink;
	
	@FindBy(name="search_text")
	private WebElement searchboxOfChild;
	
	
	
	public WebElement getSearchboxOfChild() {
		return searchboxOfChild;
	}



	public WebElement getSelectOrgNameLink() {
		return selectOrgNameLink;
	}
	
	
	
	
	
}
