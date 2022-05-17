package blueStone;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class defaultPage 
{
	WebDriver driver;
	public defaultPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="bst-discounted-price") private List<WebElement> priceList;

	
	
	public List<WebElement> getPriceList() 
	{
		return priceList;
	}

	
	
	
}
