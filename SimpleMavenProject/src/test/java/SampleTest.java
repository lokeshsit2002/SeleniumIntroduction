import java.io.IOException;
import java.util.ArrayList;

public class SampleTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelDataExtraction data= new ExcelDataExtraction();
		ArrayList<String> values= data.getData("Purchase");
		for (String val: values)
		{
			System.out.println(val);
		}

	}

}
