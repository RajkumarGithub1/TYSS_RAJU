package com.Vtiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage 
{
	WebDriver driver;
	public ContactsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(xpath="//img[@alt='Create Contact...']")
	private WebElement createNewContactBtn;
	
	
	@FindBy(xpath="//input[@class='txtBox']")
	private WebElement searchtxtbox;
	
	@FindBy(name="submit")
	private WebElement submitSearchBox;
	
	@FindBy(xpath="(//a[contains(@href, \"index.php?module=Contacts&parenttab=Marketing&action=DetailView&record=\")])[2]")
	private WebElement lastnameCreated;
	
	
	
	
	
	
	
	
		// 	Getters
	public WebElement getCreateNewContactBtn() {
		return createNewContactBtn;
	}
		
	public WebElement getLastnameCreated() {
		return lastnameCreated;
	}

	public WebElement getSubmitSearchBox() {
		return submitSearchBox;
	}

	public WebElement getSearchtxtbox() {
		return searchtxtbox;
	}
		
		
		
		
	
	
	
	
	
}
