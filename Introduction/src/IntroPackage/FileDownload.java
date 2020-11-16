package IntroPackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lokesh\\Selenium\\Drivers\\chromedriver79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'some-file.txt')]")).click();
         Thread.sleep(5000);
		System.out.println(waitForFileToDownload("some-file.txt", 1000));

	}

	public static boolean waitForFileToDownload(String fileName, int timeWait) throws InterruptedException {
		String home = System.getProperty("user.home");
		String downloadPath = home + "//Downloads//";
		System.out.println(downloadPath);
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		for (int i = 0; i < dirContents.length; i++) {
              System.out.println(dirContents[i].getName());
			if (dirContents[i].getName().equalsIgnoreCase(fileName)) {
				dirContents[i].delete();
				return true;
			} else {
				Thread.sleep(timeWait);
			}
		}
		return false;
	}

}
