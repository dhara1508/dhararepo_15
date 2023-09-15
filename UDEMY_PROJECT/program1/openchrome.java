package selem;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openchrome {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();   //We can use WebDriver instead of ChromeDriver
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://handmerch.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Bucklo Wrop Wooden Chair");
		driver.findElement(By.xpath("(//i[@class=\"bi bi-search search-icon\"])[1]")).click();
		driver.close();
		
		
	}
}
