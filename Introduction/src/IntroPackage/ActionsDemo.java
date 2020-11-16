package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	       ////a[@id='nav-link-accountList']/span[@class='nav-line-2 ']
	       Actions act = new Actions(driver);
	       act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	//       Thread.sleep(5000);
	       act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span[contains(@class,'nav-line-2 ')]"))).contextClick().build().perform();
	   
	}

}
