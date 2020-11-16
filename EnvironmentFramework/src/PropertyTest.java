import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyTest {
	
	@Test
	public void propertyFileUsage() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\lsingh38\\eclipse-workspace\\EnvironmentFramework\\src\\GlobalVariableFile.properties");
		prop.load(fis);
		System.out.println("Username is: "+prop.getProperty("username"));
		System.out.println("Password is: "+prop.getProperty("password"));
		
	}

}
