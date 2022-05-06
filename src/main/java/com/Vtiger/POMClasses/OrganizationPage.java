package com.Vtiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.GenericLibraries.WebDriverUtil;

public class OrganizationPage 
{
		WebDriver driver;
		public OrganizationPage (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(name="search_text")
		private WebElement orgSearchBox;
		
		@FindBy(id="bas_searchfield")
		private WebElement orgSearchTypeDD;
		
		@FindBy(name="submit")
		private WebElement submitSearchBtn;
		
		@FindBy(xpath="//img[@alt='Create Organization...']")
		private WebElement createNewOrgLink;
		
		
		public WebElement getSearchBox() {
			return orgSearchBox;
		}

		public WebElement getOrgSearchTypeDD() {
			return orgSearchTypeDD;
		}

		public WebElement getSubmitsearchBtn() {
			return submitSearchBtn;
		}

		public WebElement getCreateNewOrgBtn() {
			return createNewOrgLink;
		}
	
		
		WebDriverUtil webDriverUtil=new WebDriverUtil(driver);
			
		
		public void searchOrg(String orgName, String ddsearchvalue) throws Throwable
		{
			orgSearchBox.sendKeys(orgName);
			webDriverUtil.selectValuefromdd(orgSearchTypeDD, ddsearchvalue);
			Thread.sleep(1000);
			submitSearchBtn.click();
			
		}
			
			
		
	
}
