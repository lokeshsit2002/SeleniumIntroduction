package IntroPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class SSLcertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SSL Certificates
		//General Chrome Profile		
		DesiredCapabilities chBr = DesiredCapabilities.chrome();
		// 1st way   ch.acceptInsecureCerts();
		//2nd way
		chBr.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		chBr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// Belongs to local browser
		ChromeOptions lcBr = new ChromeOptions();
		lcBr.merge(chBr);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		
		//apply modified lcBr to ChromeDriver
		WebDriver driver = new ChromeDriver(lcBr);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google", "The title is not as expected");

	}

}
