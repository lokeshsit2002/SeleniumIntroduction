package TestNGTu;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DemoClass2 {
	
	@Test(groups= {"Smoke"})
	public void demoTestngThree()
	{
		System.out.println("Hello_3");
	}
	
	@BeforeTest
	public void executionFirst()
	{
		System.out.println("I will execute first");
	}
	@AfterTest
	public void executionLast()
	{
		System.out.println("I will execute Last");
	}

}
