package IntroPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();

		Select currencyValue = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

		currencyValue.selectByIndex(1);
		currencyValue.selectByValue("AED");
		currencyValue.selectByVisibleText("USD");

	}

}
