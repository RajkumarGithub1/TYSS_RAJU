package blueStone;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario5 
{
	@Test
	public void bluestone() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		System.out.println("opening Chrome");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(1000);
		WebElement rings = driver.findElement(By.xpath("//a[text()='Rings ']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(rings).perform();
		
		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		
		Thread.sleep(3000);
		
		defaultPage dp=new defaultPage(driver);
		List<WebElement> priceList = dp.getPriceList();
		System.out.println("default page price list size :"+priceList.size());

		HashMap<Integer, String> hash=new HashMap<Integer, String>();
		
		for(int i=0; i<priceList.size(); i++)
		{
			String p = priceList.get(i).getText();
			hash.put(i, p);
			
			System.out.print(hash.get(i)+", ");
		}
				
		
		WebElement list2 = driver.findElement(By.xpath("//span[text()=' Popular ']"));

		ac.moveToElement(list2).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		
		Thread.sleep(2000);
		
		sortedPage sp=new sortedPage(driver);
		List<WebElement> sortedprice = sp.getSortedprice();
		
		System.out.println("sorted price page list size :"+sortedprice.size());
		
		HashMap<Integer, String> hash2=new HashMap<Integer, String>();
		
		for(int i=0; i<sortedprice.size(); i++)
		{
			String p = sortedprice.get(i).getText();
			hash2.put(i, p);
			
			System.out.print(hash2.get(i)+", ");
		}
		
		Thread.sleep(4000);
		for(int i=0; i<hash.size(); i++)
		{
	
			String txt1 = hash.get(i);
			String a = txt1.replaceAll("[^0-9]", "");
			
			String txt2 = hash2.get(i);
			String b = txt2.replaceAll("[^0-9]", "");
							
			int price1=Integer.parseInt(a);
			int price2=Integer.parseInt(b);
						
			if(price1==price2)
			{
				System.out.println(txt1+ " is same with sorted price "+txt2);
			}
			else
			{
				System.out.println(txt1+": Both are not same :"+txt2);
			}
			
		}
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
