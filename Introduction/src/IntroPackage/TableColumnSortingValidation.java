package IntroPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableColumnSortingValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check whether items get set in descending order after clicking on "Veg/fruit name"
		 
	       System.setProperty("webdriver.chrome.driver","C:\\Lokesh\\Selenium\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	       driver.findElement(By.cssSelector("tr th:nth-child(2) b")).click();
           List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
           ArrayList<String> originalList = new ArrayList<String>();
           for(WebElement f:firstColList)
           {
        	   originalList.add(f.getText());
           }
           
           ArrayList<String> copiedList = new ArrayList<String>();
           
           for(String o:originalList)
           {
        	   copiedList.add(o);
           }
           //sorting in descending order
           Collections.sort(copiedList);
           Collections.reverse(copiedList);
           System.out.println("*********Original List********");
           for(String o:originalList)
           {
        	   System.out.println(o);
           }
           
           System.out.println("*********Copied List********");
           for(String c:copiedList)
           {
        	   System.out.println(c);
           }
           
           Assert.assertTrue(copiedList.equals(originalList));
	}

}
