package com.Vtiger.GenericLibraries;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil 
{
	
		WebDriver driver;
		
		/**
		 * @author DELL
		 * This constructor is to initialize WebDriver variable
		 * argument should be WebDriver Variable
		 * 
		 * @param driver
		 */
		public WebDriverUtil(WebDriver driver) 
		{
			this.driver=driver;
		}
		
		
		/**
		 *@author DELL
		 *
		 *this method will maximize your window
		 *@return void
		 */
		public void maxwindow() 
		{
			driver.manage().window().maximize();
		}

		
		
		/**
		 * @author DELL
		 * This method will give you the implicitlyWait for FindElement method and max duration of time in Seconds should be given as argument
		 * int type argument
		 * @return void
		 */
		public void implicitlywaitForElement(int maxTime) 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		}
		
		
		/**
		 * @author DELL
		 * this method will make you to test whether the element is displayed or not
		 * you should pass WebElement as argument
		 * @param element
		 * @return boolean
		 */
		public boolean elementIsDisplayed(WebElement element) 
		{
			return element.isDisplayed();
		}

		
		
		/**
		 * @author DELL
		 * this method will make you to test whether the element is displayed or not
		 * argument should give is WebElement
		 *  
		 * @param element
		 * @return
		 */
		public boolean elementIsSelected(WebElement element) 
		{
			return element.isSelected();
		}
		
		
		/**
		 * @author DELL
		 * 
		 * @param element
		 */
		public void elementIsClickable(WebElement element) 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		}

		/**
		 * @author DELL
		 * This method will wait until the given element is displayed
		 * and the max time it will wait is 15 seconds
		 * @param element
		 */
		
		public void elementIsVisible(WebElement element) 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
		}

		public void selectValuefromdd(WebElement element,int index) 
		{
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		public void selectValuefromdd(WebElement element,String value) 
		{
			Select select = new Select(element);
			select.selectByValue(value);
		}
		
		/**
		 * @author DELL
		 * This SELECT class method will give you the use of Select by visible text Method
		 * @param text
		 * @param element
		 */
		public void selectValuefromdd(String text, WebElement element) 
		{
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}

		public void moveToelement(WebElement element) 
		{
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}

		public void dragandDrop(WebElement src, WebElement dest) 
		{
			Actions action = new Actions(driver);
			action.dragAndDrop(src, dest).build().perform();
		}

		public void dragandDrop(WebElement element) 
		{
			Actions action = new Actions(driver);
			action.doubleClick(element);
		}
		public void rightClick(WebElement element) 
		{
			Actions action = new Actions(driver);
			action.contextClick(element);
		}

		public void scrolltoelement(WebElement element) 
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		}

		public void acceptAlert()
		{
			driver.switchTo().alert().accept();
		}

		public void dismissAlert()
		{
			driver.switchTo().alert().dismiss();
		}

		public void sendkeysAlert(String text)
		{
			driver.switchTo().alert().sendKeys(text);
		}

		public void switchWindow(String title) 
		{
			Set<String> winids = driver.getWindowHandles();

			Iterator<String> it = winids.iterator();

			for (String id : winids) 
			{
				driver.switchTo().window(id);
				if(title.equalsIgnoreCase(driver.getTitle())) {
					break;
				}
			}

		}



}
