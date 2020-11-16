package IntroPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date d1= new Date();
		System.out.println(d1.toString());
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d1));
		
		SimpleDateFormat sd1= new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss");
		System.out.println(sd1.format(d1));
		
		SimpleDateFormat sd2= new SimpleDateFormat("HH:mm");
		Date d2 = sd2.parse("12:47");
		Date d3 = sd2.parse(sd2.format(d1));
		System.out.println(sd2.format(d1));
		if (d3.compareTo(d2)>0) {
			Assert.assertTrue(true);
						
		}
		else if (d3.compareTo(d2)==0)
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}

		
		 
		

	}

}
