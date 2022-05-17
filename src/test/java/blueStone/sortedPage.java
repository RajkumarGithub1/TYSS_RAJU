package blueStone;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sortedPage 
{

	WebDriver driver;
	public sortedPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="bst-discounted-price") private List<WebElement> sortedprice;

	public List<WebElement> getSortedprice() 
	{
		return sortedprice;
	}
	
}
