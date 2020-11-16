package IntroPackage;

public class JavaChildAirIndia extends JavaParentAircraft {
	
	public static void main(String[] args) {
		
		JavaChildAirIndia cai= new JavaChildAirIndia();
		cai.bodyColor();
		cai.engine();
		cai.safetyGuidelines();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Red");
	}
	

}
