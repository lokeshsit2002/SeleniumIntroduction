package IntroPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DigitalAuthentication {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver79\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
  
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

    //   driver.get("https://the-internet.herokuapp.com/digest_auth");
      driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
       
       
	}
	
}
