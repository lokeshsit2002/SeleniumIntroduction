package IntroPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {
	static Integer invalidimg = 0;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// 1st method to find broken images
		List<WebElement> allimages = driver.findElements(By.tagName("img"));
		for (WebElement image : allimages) {
			System.out.println(image.getText());
			// image.click();
			verifyimgActive(image);
		}

		// 2nd method to find broken images

		for (WebElement image : driver.findElements(By.cssSelector("img"))) {
			isImageBroken(image);
		}

	}

	// related to first method
	public static void verifyimgActive(WebElement img) {
		try {
			HttpResponse response = new DefaultHttpClient().execute(new HttpGet(img.getAttribute("src")));
			if (response.getStatusLine().getStatusCode() != 200) {
				invalidimg++;
				System.out.println(invalidimg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// related to 2nd method
	public static void isImageBroken(WebElement img) {
		if (img.getAttribute("naturalWidth").equals("0")) {
			System.out.println(img.getAttribute("outerHTML") + " is broken.");
		}
	}
}
