package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Lokesh\\Selenium\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://ksrtc.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("fromPlaceName")).sendKeys("Ben");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		
	//	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
	//Not working-->  	System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text= (String) js.executeScript(script);
	//	System.out.println(text);
		int i=1;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) 
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			 text= (String) js.executeScript(script);
			 if(i>10)
			 {
				 break;
			 }
		}
		 if(i>10)
		 {
			 System.out.println("Place not Found");
		 }
		 else
			 System.out.println("Place Found");
		
	}

}
