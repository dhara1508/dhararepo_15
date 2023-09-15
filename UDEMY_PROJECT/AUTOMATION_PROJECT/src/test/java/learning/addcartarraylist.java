package learning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addcartarraylist {
	public static void main(String[] args) throws InterruptedException {
		int j=0;
		String[] vegnames = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver-win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.cssSelector(".product"));
		Thread.sleep(2000L);
		for (int i=0; i<products.size();i++){
			Thread.sleep(2000L);
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
			List listItem = Arrays.asList(vegnames);
			
			if (listItem.contains(formattedname)) {
				j++;
			
				driver.findElements(By.xpath("//div[@class=\"product-action\"]//button")).get(i).click();
				if(j==vegnames.length)
				{
					break;
				}
				
			}	
			//driver.close();
		}
				
	}
}
