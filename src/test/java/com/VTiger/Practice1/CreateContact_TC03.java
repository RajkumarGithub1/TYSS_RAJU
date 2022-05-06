package com.VTiger.Practice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Vtiger.GenericLibraries.BaseClass;
import com.Vtiger.GenericLibraries.FakerData;
import com.Vtiger.GenericLibraries.WebDriverUtil;
import com.Vtiger.POMClasses.ContactsPage;
import com.Vtiger.POMClasses.CreateContactPopup;
import com.Vtiger.POMClasses.CreateNewContactsPage;
import com.Vtiger.POMClasses.HomePage;

public class CreateContact_TC03 extends BaseClass
{

	
	@Test  
	public void createContactTest() throws Throwable
	{
		HomePage homepg=new HomePage(driver);
		homepg.getContactsTabLink().click();
		
		Thread.sleep(5000);
		ContactsPage contactpg=new ContactsPage(driver);
		contactpg.getCreateNewContactBtn().click();
		
		
		FakerData fd=new FakerData();
		String lastname = fd.getlastName();
		
		CreateNewContactsPage createnew=new CreateNewContactsPage(driver);
		createnew.getLastnametxtbox().sendKeys(lastname);
		createnew.getAddOrgNameLinkbtn().click();
		
		Set<String> whs = driver.getWindowHandles();
		
		Iterator<String> handles = whs.iterator();
		String parent = handles.next();
		String child=handles.next();
		System.out.println(parent+"  parent");
		System.out.println(child+"  child");
		
		WebDriverUtil webd=new WebDriverUtil(driver);
		
		driver.switchTo().window(child);
		webd.implicitlywaitForElement(15);
		
		
		CreateContactPopup popup=new CreateContactPopup(driver);

		popup.getSelectOrgNameLink().click();
		
		driver.switchTo().window(parent);
		
		createnew.getSaveBtn().click();
		
		webd.implicitlywaitForElement(15);
		
		String contactID=createnew.getContactIDbox().getText();
		System.out.println("contact id :"+contactID);
		
		homepg.getContactsTabLink().click();

		webd.implicitlywaitForElement(15);

		contactpg.getSearchtxtbox().sendKeys(contactID);
				
		contactpg.getSubmitSearchBox().click();
		
		webd.implicitlywaitForElement(15);
		
		String actualName=driver.findElement(By.xpath("//a[.='"+lastname+"']")).getText();
			
				
//				contactpg.getLastnameCreated().getText();
	
		System.out.println(lastname);
		System.out.println(actualName);
		
		if(lastname.equalsIgnoreCase(actualName))
		{
			System.out.println("TC Passed");
		}
		else
		{
			System.out.println("TC Failed");
		}
		
		homepg.getContactsTabLink().click();

		
	}
}
