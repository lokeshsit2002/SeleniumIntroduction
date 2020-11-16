package TestNGTu;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DemoClass6 {
	
	@Test(groups= {"even","odd","top"})
	public void NamasakarTest0()
	{
		System.out.println("Namasakar_0");
		
	}
	
	@Parameters({ "affirmation" })
	@Test(groups= {"odd","medium"})
	public void NamasakarTest1(String var1)
	{
		System.out.println("Namasakar_1");
		System.out.println(var1);
	}
	
	@Parameters({ "affirmation" })
	@Test(groups= {"even","medium"},dependsOnMethods= {"NamasakarTest4","NamasakarTest3"})
	public void NamasakarTest2(String var2)
	{
		System.out.println("Namasakar_2");
		System.out.println(var2);
	}
	
	@Test(groups= {"odd","medium"})
	public void NamasakarTest3()
	{
		System.out.println("Namasakar_3");
	}
	
	@Test(groups= {"even","medium"})
	public void NamasakarTest4()
	{
		System.out.println("Namasakar_4");
	}
	
	@Test(groups= {"odd","bottom"})
	public void NamasakarTest5()
	{
		System.out.println("Namasakar_5");
	}
}
