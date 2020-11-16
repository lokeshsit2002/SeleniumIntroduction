package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/context_menu");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       Actions act = new Actions(driver);
       act.moveToElement(driver.findElement(By.cssSelector("div[id='hot-spot']"))).contextClick().build().perform();
       Thread.sleep(5000);
       driver.switchTo().alert().accept();
       
	}

}
