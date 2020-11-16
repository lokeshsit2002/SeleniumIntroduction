package TestNGTu;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class DemoClass7 {
	//test for practicing listener class
	@Test
	public void demoTestngOne()
	{
		System.out.println("Hello_1");
		Assert.assertTrue(false);
	}
	@Test(groups= {"Smoke"})
	public void demoTestngtwo()
	{
		System.out.println("Hello_2");
	}
    @BeforeSuite
    public void BfSuite()
	{
		System.out.println("I am no 1");
	}
    
    @AfterSuite
    public void AfSuite()
	{
		System.out.println("I am no 1 from last");
	}
}
