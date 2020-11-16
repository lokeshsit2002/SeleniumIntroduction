package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// to delete specific cookie driver.manage().deleteCookieNamed("Session key");

		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google", "The title is not as expected");
	}

}
