package TestNGTu;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValueProviderTest {
	//userPwdTest0 will run as many times(3) as rows(3) mentioned in dataprovider
	
	@Test(dataProvider="getDataset")
	public void userPwdTest0(String Username,String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
		
	}

	
	@Parameters({"City"})
	@Test()
	public void BenagluruTest(String MyCity)
	{
		System.out.println(MyCity);
	}
	
	@DataProvider
	
	public Object[][] getDataset()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="1stUser";
		data[0][1]="1stPassword";
		data[1][0]="2ndUser";
		data[1][1]="2ndPassword";
		data[2][0]="3rdUser";
		data[2][1]="3rdPassword";
		return data;
		
	}
}
