package com.Vtiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage 
{
	WebDriver driver;
	public CreateNewContactsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(name="lastname")
	private WebElement lastnametxtbox;
	
	@FindBy(xpath="//img[@alt='Select'][1]")
	private WebElement addOrgNameLinkbtn;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath="(//td[@class='dvtCellInfo'])[2]")
	private WebElement contactIDbox;
	
	
	
	
	
		// 	Getters
	

	

	public WebElement getContactIDbox() {
		return contactIDbox;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getLastnametxtbox() {
		return lastnametxtbox;
	}

	public WebElement getAddOrgNameLinkbtn() {
		return addOrgNameLinkbtn;
	}
		
		
		
		
	
	
	
	
	
}
