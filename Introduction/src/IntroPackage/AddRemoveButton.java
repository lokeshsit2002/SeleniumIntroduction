package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRemoveButton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver79\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       driver.findElement(By.cssSelector("div[class='example'] button")).click();
       WebDriverWait wait = new WebDriverWait(driver,10);
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(" div[id='elements'] button")));
       driver.findElement(By.cssSelector(" div[id='elements'] button")).click();
      
	}

	}
