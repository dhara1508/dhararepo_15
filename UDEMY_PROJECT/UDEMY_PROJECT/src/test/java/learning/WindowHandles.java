package learning;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class WindowHandles {
	public static void main(String args[])  {
		System.setProperty("webdriver.chrome.driver", "C://browserdrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.cssSelector("a.blinkingText")).click();
	Set<String> windows = driver.getWindowHandles();     //[ParantId,ChildId,SubchildId]
	Iterator<String> it = windows.iterator();
	String parantid = it.next();
	String childid = it.next();
	driver.switchTo().window(childid);
	System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
	driver.findElement(By.cssSelector("p.im-para.red")).getText();
	String emailid = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	driver.switchTo().window(parantid);
	driver.findElement(By.id("username")).sendKeys(emailid);
	
	}
}






