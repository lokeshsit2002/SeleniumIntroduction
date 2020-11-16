package IntroPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/23268/pak-vs-sl-3rd-t20i-sri-lanka-tour-of-pakistan-2019");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// select the table
		// WebElement table = driver.findElement(By.cssSelector("div[class='cb-col
		// cb-col-100 cb-ltst-wgt-hdr']"));
		WebElement table = driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")).get(0);
		// select rows
		List<WebElement> rows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));

		int rowcount = rows.size();
		System.out.println("rowcount is " + rowcount);
		// run row element
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		// System.out.println("count is "+ count);

		for (int i = 0; i < count - 2; i++) {
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			System.out.println(value);
			int valueInteger = Integer.parseInt(value);
			sum = sum + valueInteger;
		}

		// Never use xpath to identify element under table
		// String extrasValue =
		// table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		

	String extrasValue = table
				.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']"))
				.getText();
				
		System.out.println(extrasValue);
		int extrasValueInteger = Integer.parseInt(extrasValue);
		int sumTotal = sum + extrasValueInteger;

		// Never use xpath to identify element under table
  //	String actualValue = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		String actualValue = table
				.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
		int actualTotal = Integer.parseInt(actualValue);
		System.out.println(actualTotal + "   " + sumTotal);
		if (sumTotal == actualTotal) {
			System.out.println("Total matched");
		} else {
			System.out.println(" Total not matched");
		}
	}

}
