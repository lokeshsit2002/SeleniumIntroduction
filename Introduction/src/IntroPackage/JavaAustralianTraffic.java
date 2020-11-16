package IntroPackage;

public class JavaAustralianTraffic implements JavaCentralTraffic, JavaContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JavaCentralTraffic a= new JavaAustralianTraffic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();
		
		JavaContinentTraffic ct=new JavaAustralianTraffic();
		ct.Trainsymbol();
		
		JavaAustralianTraffic at = new JavaAustralianTraffic();
		at.walkonsymbol();
		
		
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Wait till Train passes through");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" Green go implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
	}

	
	public void walkonsymbol()
	{
	System.out.println("walking");
	}
}
