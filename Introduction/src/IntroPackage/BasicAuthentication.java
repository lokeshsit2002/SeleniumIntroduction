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


public class BasicAuthentication {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver79\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
  
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

    //   driver.get("https://the-internet.herokuapp.com/basic_auth");
      driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
       
      
      /* not worked
       
       
       StringSelection ssu = new StringSelection("admin");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssu, null);
	    
	    robotEntry();
	    
	    Thread.sleep(5000);
	    
	    Robot robot1 = new Robot();
	    robot1.keyPress(KeyEvent.VK_TAB);
	    robot1.keyRelease(KeyEvent.VK_TAB);
	    
	    StringSelection ssp = new StringSelection("admin");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssp, null);
	    robotEntry();
	    
	    robot1.keyPress(KeyEvent.VK_TAB);
	    robot1.keyRelease(KeyEvent.VK_TAB);
	    
	    robot1.keyPress(KeyEvent.VK_ENTER);
	    robot1.keyRelease(KeyEvent.VK_ENTER);
	    */
	    
	    
	    
	    
	   
       
	}
	
	
	/*
	 public static void robotEntry() throws AWTException {
    	 //imitate mouse events like ENTER, CTRL+C, CTRL+V
	    Robot robot = new Robot();
	    robot.delay(3000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.delay(3000);
	    robot.keyRelease(KeyEvent.VK_ENTER);
    }
*/
}
