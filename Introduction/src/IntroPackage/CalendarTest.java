package IntroPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(cal.getTime());
		System.out.println(sdf.format(cal.getTime()));
	
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println(sdf1.format(cal.getTime()));
		
		
		System.out.println(cal.getTimeZone());
	}

}
