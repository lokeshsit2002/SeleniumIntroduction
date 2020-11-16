package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailLogin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://mail.google.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("11.lokesh@Gmail.com");     
	       driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SH11@IV11"); 
	       driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	       driver.findElement(By.xpath("//a[@class='gb_D gb_La gb_i']")).click();
	       driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	      
	       
	       
	}

}
