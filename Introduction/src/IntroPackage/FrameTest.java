package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Lokesh\\\\Selenium\\\\Drivers\\\\chromedriver85\\\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://jqueryui.com/droppable/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,250)");
	       System.out.println(driver.findElements(By.tagName("iframe")).size());
	       driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	       Actions act = new Actions(driver);
	       WebElement source = driver.findElement(By.id("draggable"));
	       WebElement target = driver.findElement(By.id("droppable"));
	       act.dragAndDrop(source, target).build().perform();
	       driver.switchTo().defaultContent();
	       driver.findElement(By.xpath("//a[contains(text(),'Accordion')]")).click();
	       
	       
	}

}
