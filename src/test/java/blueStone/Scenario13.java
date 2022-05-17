package blueStone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario13 
{
	@Test
	public void bluestone() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		System.out.println("opening Chrome");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Offers ']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(ele1).perform();
		
		driver.findElement(By.xpath("//span[contains(text(), 'Upto 30% Off on Making')]")).click();		
		
		
		
		
		
		
		
		
		
		
	}
}
