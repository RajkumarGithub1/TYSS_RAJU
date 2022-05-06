package com.VTiger.Practice1;


import org.testng.annotations.Test;

import com.Vtiger.GenericLibraries.Browser;
import com.Vtiger.GenericLibraries.FakerData;
import com.Vtiger.GenericLibraries.PropertyFileData;
import com.Vtiger.GenericLibraries.WebDriverUtil;

import com.Vtiger.POMClasses.CreateOrganizationPage;
import com.Vtiger.POMClasses.HomePage;
import com.Vtiger.POMClasses.LoginPage;
import com.Vtiger.POMClasses.OrganizationPage;
import com.Vtiger.POMClasses.SearchPage;


public class OrgCreate_POM_TC1 extends Browser
{
	
	@Test
	public void createOrgTask() throws Throwable
	{
		
		Browser br=new Browser();
		
		br.openBrowser();
		
		PropertyFileData pfdata=new PropertyFileData();
		
		WebDriverUtil webutil=new WebDriverUtil(driver);
		
		webutil.maxwindow();
		
		
		driver.get(pfdata.readDataFromProperty("url"));
		
		LoginPage loginpg=new LoginPage(driver);
		loginpg.LoginTopage();
		
		Thread.sleep(2000);
		HomePage homepg=new HomePage(driver);
		homepg.getOrgTabLink().click();
		
		
		OrganizationPage orgpg=new OrganizationPage(driver);
		orgpg.getCreateNewOrgBtn().click();
		
		FakerData fakedata=new FakerData();
		String compName=fakedata.getCompanyName();
		
		CreateOrganizationPage createOrgpg=new CreateOrganizationPage(driver);
		createOrgpg.getOrganisationNametxtBox().sendKeys(compName);
		
		createOrgpg.getSaveBtn().click();
		
		
		Thread.sleep(2000);
		homepg.getOrgTabLink().click();
		
		Thread.sleep(2000);
		
		orgpg.searchOrg(compName, "accountname");
		
		SearchPage searchpg=new SearchPage(driver);
		
		String actualName=searchpg.getorgNameText();
		
		if(actualName.equals(compName))
		{
			System.out.println("PAss");
		}
		else {
			System.out.println("fail");
		}
		
		
		
		
		
	}
	
}
