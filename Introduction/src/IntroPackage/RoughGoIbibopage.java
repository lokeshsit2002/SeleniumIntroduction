package IntroPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RoughGoIbibopage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.goibibo.com/");
	       System.out.println(driver.findElement(By.xpath("//div[@class='col-md-8 col-sm-8 col-xs-6 pad0 marginT5']//li[2]//a[1]")).getText());
	       driver.findElement(By.xpath("//div[@class='col-md-8 col-sm-8 col-xs-6 pad0 marginT5']//li[2]//a[1]")).click();
	       System.out.println(driver.getCurrentUrl());
	       Assert.assertTrue(driver.getCurrentUrl().contains("hotels"));
	       
	}

}
