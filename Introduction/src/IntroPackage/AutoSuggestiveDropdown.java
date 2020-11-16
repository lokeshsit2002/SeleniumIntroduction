package IntroPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver79\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.makemytrip.com/");
	       Thread.sleep(2000);
	       WebElement sourceFrom= driver.findElement(By.id("fromCity"));
//	       source.clear();
	       sourceFrom.click();
	       WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']")); 
	       source.sendKeys("kol");
	       Thread.sleep(3000);
	       source.sendKeys(Keys.ARROW_DOWN);
	       source.sendKeys(Keys.ENTER);
//	       Thread.sleep(3000);
       
	}

}
