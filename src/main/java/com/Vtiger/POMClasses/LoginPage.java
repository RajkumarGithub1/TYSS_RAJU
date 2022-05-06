package com.Vtiger.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.GenericLibraries.PropertyFileData;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (name="user_name")
	private WebElement usernameTextbox;
	
	@FindBys ({@FindBy(name="user_password"), @FindBy (xpath="//input[@type='password']")}) 
	private WebElement passwordTextbox;
	
	@FindAll ({@FindBy (id="submitButton"), @FindBy(xpath="//input[@type='submit']")})
	private WebElement loginbutton;

	
	public WebElement getUsernameTextbox() {
		return usernameTextbox;
	}

	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}

	public WebElement getSubmitbutton() {
		return loginbutton;
	}
	
	
	public void LoginTopage() throws Throwable 
	{
		PropertyFileData pfdata=new PropertyFileData();
		String un=pfdata.readDataFromProperty("username");
		String pwd=pfdata.readDataFromProperty("password");
		
		usernameTextbox.sendKeys(un);
		passwordTextbox.sendKeys(pwd);
		loginbutton.click();
	}
	
	
	
	
}
