package TestNGTu;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DemoClass5 {

	

	@Test(groups = { "even", "odd", "top" }, enabled = false)

	public void byeTest0(String affirm) {
		System.out.println("Bye_0");
		
	}
	
	@Parameters({ "affirmation","mediumname" })
	@Test(groups = { "odd", "medium" }, timeOut = 40000)
	public void byeTest1(String str1,String strrr1) {
		System.out.println("Bye_1");
		System.out.println(str1 + " ! "+ strrr1);
	}
	@Parameters({ "affirmation","mediumname" })
	@Test(groups = { "even", "medium" }, dependsOnMethods = { "byeTest4", "byeTest3" })
	public void byeTest2(String str2,String strrr2) {
		System.out.println("Bye_2");
		System.out.println(str2 + " ! "+ strrr2);
	}

	@Test(groups = { "odd", "medium" })
	public void byeTest3() {
		System.out.println("Bye_3");
	}

	@Test(groups = { "even", "medium" })
	public void byeTest4() {
		System.out.println("Bye_4");
	}

	@Test(groups = { "odd", "bottom" })
	public void byeTest5() {
		System.out.println("Bye_5");
	}
}
