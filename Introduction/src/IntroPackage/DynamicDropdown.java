package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='RDP']")).click();
		Thread.sleep(2000);
		// By Index Method: (//a[@value='HYD'])[2]
		// driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

		// parent child method:
		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='HYD']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']"))
				.click();

		// select current date from calendar
		System.out.println(
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).getText());
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// verification if the returning calendar is enabled or not. In case,
		// isenabled() is not working

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("The returning calendar is disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("The returning calendar is enabled");
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("The returning calendar is enabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("The returning calendar is disabled");
			Assert.assertTrue(false);
		}
	}

}
