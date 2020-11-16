package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectRepository.RediffHomePage;
import PageObjectRepository.RediffLoginPage;

public class RediffTestCase1 {
    @Test
	public void rediffTesting() {
		System.setProperty("webdriver.chrome.driver", "C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		RediffLoginPage rl= new RediffLoginPage(driver);
		RediffHomePage rh= new RediffHomePage(driver);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rl.emailId().sendKeys("hello");
		rl.password().sendKeys("hello");
		rl.loginButton().click();
		Assert.assertTrue(rl.messageText().getText().contains("please try again"));;
		rl.homeLink().click();
		
		rh.searchText().sendKeys("laptop");
		rh.submitButton().click();
		
	
		
		

	}
}
