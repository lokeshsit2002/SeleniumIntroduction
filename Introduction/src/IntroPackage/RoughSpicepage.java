package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RoughSpicepage {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver79\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	//       driver.get("https://www.spicejet.com");
	       
	       /*     //check the content of url
	       System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).getText());
	       driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
	       System.out.println(driver.getCurrentUrl());
	       
	       */
	       
	       /*
	       //how to check highlighted button and toolbar error message
	       System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("style"));
	       driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	       System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("style"));
	       Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("style").contains("important"));
	       System.out.println(driver.findElement(By.id("view-origin-station")).getText());
	       */
	       
	       
	       driver.get("https://ksrtc.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.id("fromPlaceName")).sendKeys("Ben");
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String script="return document.getElementById(\"fromPlaceName\").value;";
			String text= (String) js.executeScript(script);
			
		  System.out.println(text);
		  
		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
			String script1="return document.querySelector(\"input[id='fromPlaceName']\").value;";
			String text1= (String) js1.executeScript(script1);
			
			 System.out.println(text1);
		
			
	}

}
