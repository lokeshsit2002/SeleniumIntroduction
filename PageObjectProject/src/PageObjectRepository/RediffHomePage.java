package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	//***********Page objects have been implemented in normal Style***********
	WebDriver driver;
	
 public RediffHomePage(WebDriver driver) {
	 this.driver=driver;
	 
 }
 
 By search = By.id("srchword");
 By submitBtn = By.xpath("//input[@class='newsrchbtn']");
 
 public WebElement searchText() {
	 return driver.findElement(search);	 
 }
 
 public WebElement submitButton() {
	 return driver.findElement(submitBtn );	 
 }
}
