package IntroPackage;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Greencart {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	   String[] vegSelection = {"Cucumber","Brocolli","Beetroot","Brinjal"};
	 
	   System.setProperty("webdriver.chrome.driver", "C:\\Lokesh\\Selenium\\Drivers\\chromedriver85\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    //   Thread.sleep(5000);
     
      itemSelection(vegSelection,driver);
      
      driver.findElement(By.cssSelector("img[alt='Cart']")).click();
      driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
      driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
      driver.findElement(By.cssSelector("button.promoBtn")).click();
      //explicit wait
      WebDriverWait wait= new WebDriverWait(driver,8);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
      System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
       
	}
	
	
	
   public static void itemSelection(String[] vegSelection,WebDriver driver)
   {
	   int itemCount =0;
	   List<String> vegList= Arrays.asList(vegSelection);
	   
       List<WebElement> itemList= driver.findElements(By.cssSelector("h4.product-name"));
       for(int i=0;i<itemList.size();i++)
       {
    	  String[] rawItem= itemList.get(i).getText().split("-"); 
    	  String item= rawItem[0].trim();
    	  if(vegList.contains(item))
    	  {
    		  itemCount++;
    		  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
    		  if(itemCount==vegSelection.length)
    		   break;
    	  }
       }
   
   
   }
}
