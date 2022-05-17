package blueStone;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario8 
{
	@Test
	public void BlueStone() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bluestone.com");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		
		
		WebElement	sa=driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.moveToElement(sa).perform();
		
		
		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> id = handles.iterator();
		String p = id.next();
		String c = id.next();
		Thread.sleep(2000);
		driver.switchTo().window(c);
		JavascriptExecutor jee=(JavascriptExecutor)driver;
		jee.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//span[@class='select-size']")).click();
		
	    WebElement size = driver.findElement(By.xpath("//span[text()='2-4(2 4/16\")']"));
	    String abc = size.getText();
		size.click();
		Thread.sleep(3000);
		driver.findElement(By.id("buy-now")).click();
		String cartsize = driver.findElement(By.xpath("//span[@class='ring-size-box']")).getText();
		if(abc.equals(cartsize))
		{
			System.out.println("size is same");
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}