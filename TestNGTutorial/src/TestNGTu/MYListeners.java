package TestNGTu;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class MYListeners implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		    // not implemented
		System.out.println("listener is invoked successfully on failure of Test: "+result.getTestClass()+"  "+result.getName());
		  }

	
	

}
