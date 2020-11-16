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

public class AndroidSampleTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver;

		// first of all, in appium server console log, you can find the chrome version for which chromedriver needed
		// Download the chrome driver and save it at 
		//C:\Users\lsingh38\AppData\Roaming\npm\node_modules\appium\node_modules\appium-chromedriver\chromedriver\win
 //   	DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus_5X_API_28");
		capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5556");
//		DesiredCapabilities capabilities = new DesiredCapabilities();	
//		capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);		
//	capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability("deviceName", "Nexus_5X_API_28");
//	capabilities.setCapability("browserName", "Chrome");
//		capabilities.setCapability("appPackage", "com.android.chrome");
//		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
//		capabilities.setCapability("automationName", "UiAutomator2");
//	capabilities.setCapability("adbExecTimeout", "500000");
//	capabilities.setCapability("newCommandTimeout", "60");
//		capabilities.setCapability("noReset", true);
		
	
//	capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);

//	capabilities.setCapability("chromedriverExecutable",WebDriverManager.chromedriver().version("2.28").getBinaryPath());
//	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_25");      
//	capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");  
//	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator1");
//	capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,40);

//	capabilities.setCapability(MobileCapabilityType.NO_RESET,true);

//	 System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\Androidchromedriver_win32\\chromedriver.exe");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 //  ********This context is needed for successful execution of getTitle and other browser selenium methods on Emulator*****
		driver.context("CHROMIUM");
//		driver.context("WEB_VIEW");
		System.out.println(driver.getContextHandles());
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);    
		driver.get("http://www.google.com");
//	driver.getTitle();
//	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getTitle());
//	Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google", "The title is not as expected");

//	Assert.assertTrue(driver.getTitle().contains("Google"));

	driver.quit();

	}

}
