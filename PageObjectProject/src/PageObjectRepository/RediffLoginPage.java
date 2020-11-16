package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {
	
	//********Page objects have been implemented in PageFactory Style******
	WebDriver driver; 
    public RediffLoginPage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    }

	
	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(css="input[name='passwd']")
	WebElement passwd;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement login;
	
	@FindBy(xpath="//div[@class='head-wrapper'] //div[@class='floatR']/a")
	WebElement home;
	 
	@FindBy(xpath="//div[@id='login']/div/div")
	WebElement message;
	
	public WebElement emailId() {
		return username;
	}
	
	public WebElement password() {
		return passwd;
	}
	
	public WebElement loginButton() {
		return login;
	}
	
	public WebElement homeLink() {
		return home;
	}
	
	public WebElement messageText() {
		return message;
	}
	
}
