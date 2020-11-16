package alpha;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo1 {

	// log errors only for Demo1
	public static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) throws InterruptedException {
	
		log.debug("Setting ChromeDriver System Property");
		System.setProperty("webdriver.chrome.driver", "C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
		log.info("ChromeDriver System Property is set");
		log.debug("Creating new Chrome Driver Instance ");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("New Chrome Driver Instance created");
		log.debug("Open Spicejet website");
		driver.get("https://www.spicejet.com");
		log.info("Spicejet website is opened");
		log.debug("Click on  originStation button");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		log.info("OriginStation button is clicked");
		log.debug("Select a source city ");
		driver.findElement(By.xpath("//a[@value='RDP']")).click();
		Thread.sleep(2000);
		log.info("A source city is selected ");
		// By Index Method: (//a[@value='HYD'])[2]
		// driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		log.debug("Select a destination city ");
		// parent child method:
		// //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']
		// //a[@value='HYD']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']"))
				.click();
		log.info("A destination city is selected ");
		log.debug("Select current date from calendar");
		System.out.println(
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).getText());
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		log.info("The current date is selected from calendar");
		// verification if the returning calendar is enabled or not. In case,
		// isenabled() is not working
		log.debug("verify if the returning calendar is enabled or not for one way");
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("The returning calendar is disabled for one way");
			Assert.assertTrue(true);
			log.info("The returning calendar is disabled for one way");
		} else {
			System.out.println("The returning calendar is enabled for one way");
			Assert.assertTrue(false);
			log.error("The returning calendar is enabled for one way");
		}

		log.debug("verify if the returning calendar is enabled or not for roundtrip");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("The returning calendar is enabled for round trip");
			Assert.assertTrue(true);
			log.info("The returning calendar is enabled for round trip");
		} else {
			System.out.println("The returning calendar is disabled");
			Assert.assertTrue(false);
			log.error("The returning calendar is disabled for round trip");
		}

	}

}
