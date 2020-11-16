package IntroPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Download jar files of FileUtils from
		// https://commons.apache.org/proper/commons-io/download_io.cgi
		// Add jar files as External Jar files to the project

		FileUtils.copyFile(src, new File("C:\\Lokesh\\Selenium\\ScreenShots\\photo.png"));
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google", "The title is not as expected");
	}

}
