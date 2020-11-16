package IntroPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class MicrosoftEdge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Microsoft Edge Driver execution
	       System.setProperty("webdriver.edge.driver","C:\\Windows\\System32\\MicrosoftWebDriver.exe");
	      WebDriver driver = new EdgeDriver();
	      driver.get("http://www.google.com");
	       System.out.println(driver.getTitle());
	}

}
