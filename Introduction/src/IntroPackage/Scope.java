package IntroPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("http://qaclickacademy.com/practice.php");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	       System.out.println(driver.findElements(By.tagName("a")).size());
	       WebElement footerDriver = driver.findElement(By.cssSelector("div#gf-BIG"));
	       System.out.println(footerDriver.findElements(By.tagName("a")).size());
	       WebElement columnDriver = footerDriver.findElement(By.tagName("ul"));
	       System.out.println(columnDriver.findElements(By.tagName("a")).size());
	       
	       //adding two keys effect
	       String newTabOpened = Keys.chord(Keys.CONTROL,Keys.ENTER);
	       
	       for(int i=0;i<columnDriver.findElements(By.tagName("a")).size();i++)
	       {
	    	   columnDriver.findElements(By.tagName("a")).get(i).sendKeys(newTabOpened);
	       }

	       Set<String> tabs= driver.getWindowHandles();
	       Iterator<String> itr= tabs.iterator();
	       
	       while(itr.hasNext())
	       {
	    	   System.out.println(driver.switchTo().window(itr.next()).getTitle());
	       }
	       
	       
	}

}
