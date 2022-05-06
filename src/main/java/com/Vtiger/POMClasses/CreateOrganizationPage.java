package com.Vtiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage 
{
	WebDriver driver;
	public CreateOrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(name="accountname")
		private WebElement orgNametxtBox;
		
		@FindBy(name="industry")
		private WebElement industryTypeDD;
		
		@FindBy(name="rating")
		private WebElement ratinngDD;
		
		@FindBy(name="accounttype")
		private WebElement orgTypeDD;
	
		@FindBy(xpath="//input[@accesskey=\"S\"]")
		private WebElement saveBtn;
		
	// 	Getters
	
		public WebElement getOrganisationNametxtBox() {
			return orgNametxtBox;
		}

		public WebElement getIndustryTypeDD() {
			return industryTypeDD;
		}

		public WebElement getRatinngDD() {
			return ratinngDD;
		}

		public WebElement getOrgTypeDD() {
			return orgTypeDD;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
		
		
		
		
		
	
	
	
	
	
}
