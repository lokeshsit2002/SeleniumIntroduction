package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver79\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/checkboxes");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       driver .findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
       driver .findElement(By.xpath("//form[@id='checkboxes']/input[2]")).click();
	}

}
