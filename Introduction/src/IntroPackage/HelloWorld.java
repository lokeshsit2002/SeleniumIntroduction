package IntroPackage;

public class HelloWorld {
	
	int a = 4;
	
	public void getData() {
		
		System.out.println("I am in a Hello World class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld hw = new HelloWorld();
		HelloWorldSecond hws = new HelloWorldSecond();
		hw.getData();
		hws.getSecondData();
		
		System.out.println(hw.a);

	}

}
