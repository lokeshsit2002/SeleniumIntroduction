package IntroPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       System.setProperty("webdriver.gecko.driver","C:\\Lokesh\\Selenium\\geckodriver.exe");
	       WebDriver driver = new FirefoxDriver();
	       driver.get("http://www.google.com");
	       System.out.println(driver.getTitle());
	}

}
