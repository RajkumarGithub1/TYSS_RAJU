package com.Vtiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.GenericLibraries.WebDriverUtil;

public class HomePage 
{
	WebDriver driver;

	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//a[text()='Organizations']")
	private WebElement organisationTabLink;
	
	@FindBy (xpath="//td[@class='small' and @valign='bottom']")
	private WebElement signoutIMG;
	
	@FindBy (xpath="//a[text()='Sign Out']")
	private WebElement signoutBtn;
	
	@FindBy (xpath="//a[.='Contacts']")
	private WebElement contactsTabLink;
	
	
	public WebElement getContactsTabLink() {
		return contactsTabLink;
	}

	public WebElement getOrgTabLink() {
		return organisationTabLink;
	}

	public WebElement getSignoutIMG() {
		return signoutIMG;
	}

	public WebElement getSignoutBtn() {
		return signoutBtn;
	}
	
	
	
	public void signout() throws InterruptedException
	{
		WebDriverUtil webd=new WebDriverUtil(driver);

		webd.moveToelement(signoutIMG);
		Thread.sleep(1000);
		signoutBtn.click();
		
	}
	
	
	
}
