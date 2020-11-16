package IntroPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelectionCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 250)");
		driver.findElement(By.cssSelector("#travel_date")).click();
		//May 11
		
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("May"))
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days']  th[class='next']")).click();
		}
		List<WebElement> dates=driver.findElements(By.xpath("//td[@class='day']"));
		dates.addAll(driver.findElements(By.xpath("//td[@class='active day']")));
		System.out.println(dates.size());
		
		for(int i=0;i<dates.size();i++)
		{
			if(dates.get(i).getText().equalsIgnoreCase("11"))
			{
				dates.get(i).click();
				break;
			}
		}
	}

}
