package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Lokesh";
		 System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	       
	       driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	       driver.findElement(By.id("name")).sendKeys(text);

	       driver.findElement(By.cssSelector("[id='alertbtn']")).click();

	       System.out.println(driver.switchTo().alert().getText());

	       driver.switchTo().alert().accept();

	       driver.findElement(By.id("confirmbtn")).click();

	       System.out.println(driver.switchTo().alert().getText());



	       driver.switchTo().alert().dismiss();


	}

}
