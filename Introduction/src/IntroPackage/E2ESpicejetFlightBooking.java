package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2ESpicejetFlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).getText());

		driver.findElement(By.cssSelector("input[id*='originStation1']")).click();
		driver.findElement(By.xpath("//a[@value='RDP']")).click();
	//	Thread.sleep(2000);
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

	//	 System.out.println(driver.findElement(By.cssSelector("a[class='ui-state-default']")).getText());
	//	 driver.findElement(By.cssSelector("a[class='ui-state-default']")).click();

		// verification if the returning calendar is enabled or not. In case,
		// isenabled() is not working

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("The returning calendar is disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("The returning calendar is enabled");
			Assert.assertTrue(false);
		}

	//	Thread.sleep(2000);

		driver.findElement(By.id("divpaxinfo")).click();
	//	Thread.sleep(2000);

		Select passSel = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		passSel.selectByValue("5");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		Select currencyValue = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currencyValue.selectByIndex(1);

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
