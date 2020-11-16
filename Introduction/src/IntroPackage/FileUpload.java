package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lokesh\\Selenium\\Drivers\\chromedriver79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://the-internet.herokuapp.com/upload");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 * ////a[@id='nav-link-accountList']/span[@class='nav-line-2 '] WebElement
		 * uploadElement = driver.findElement(By.id("file-upload"));
		 * uploadElement.sendKeys("C:\\Lokesh\\Test Data\\Testresult.csv");
		 * driver.findElement(By.id("file-submit")).click();
		 */

		driver.get("https://cvizopsportaltest.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'CVA')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'All Visits')]")).click();
		driver.findElement(By.cssSelector("a[id='nav-allvisits-tab'] span")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Drafts')]")).click();
		driver.findElement(By.cssSelector("a[id='nav-draft-tab'] span")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Reports & Analytics')]")).click();
		driver.findElement(By.cssSelector("a[id='nav-reports-tab'] span")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Admin Management')]")).click();
		driver.findElement(By.cssSelector("a[id='nav-admin-tab'] span")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//span[contains(text(),'Home / Dashboard')]")).click();
		driver.findElement(By.cssSelector("div[id='nav-tab'] a:nth-child(1) span")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Initiate New Visit')]")).click();
		driver.findElement(By.cssSelector("div[id='nav-tab'] a:nth-child(2) span")).click();
		
		WebElement uploadElement = driver.findElement(By.xpath("//input[@class='form-control file-reference']"));
		
		try {
			driver.findElement(By.xpath("//label[@class='file-notifincation']"));
			Assert.assertTrue(false);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(true);
		}
		System.out.println(uploadElement.getAttribute("type"));
//		uploadElement.sendKeys("C:\\Lokesh\\Selenium\\TestData\\Sample50kb.jpg");
	}

}
