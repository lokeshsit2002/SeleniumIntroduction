package IntroPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowHandleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://support.google.com/mail/answer/56256?hl=en");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	       driver.findElement(By.cssSelector("a.action-button")).click();
	       System.out.println("Before switching to child");
	       System.out.println(driver.getTitle());
	       try {
	    	   driver.findElement(By.cssSelector("a.action-butto"));
				  Assert.assertTrue(false);
			       }
			       catch(NoSuchElementException e) {
			    	   Assert.assertTrue(true);
			       }
	       Set<String> windows = driver.getWindowHandles();
	      Iterator<String> itr = windows.iterator();
	      String parentId= itr.next();
	      String childId =itr.next();
	      System.out.println("After switching to child");
	      System.out.println(driver.switchTo().window(childId).getTitle());
	      
	      System.out.println("After switching back to Parent");
	      System.out.println(driver.switchTo().window(parentId).getTitle());
	      
	       
	       
	}

}
