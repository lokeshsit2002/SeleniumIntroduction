package IntroPackage;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.internal.Constants;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AndroidTabTest {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	AndroidDriver<AndroidElement> driver;
	
	DesiredCapabilities capabilities=DesiredCapabilities.android();
	capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus_7_TABG_API_28");
	capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
	
	driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.context("CHROMIUM");
	System.out.println(driver.getContextHandles());
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);    
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Google", "The title is not as expected");
	driver.quit();
	}
}
