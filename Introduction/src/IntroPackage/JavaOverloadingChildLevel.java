package IntroPackage;

public class JavaOverloadingChildLevel extends JavaOveridingParentlevel {
	
	// Overloading
	//either argument count should be different
	//or argument data type should be different
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		System.out.println(a +" and "+ b);
	}
	
	
	//Overiding
	
	public void brake() {
		System.out.println("New Child Brake");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaOverloadingChildLevel ocl= new JavaOverloadingChildLevel();
		
		ocl.getData(2);
		ocl.getData("Lokesh");
		ocl.getData(2, 5);
		ocl.brake();
	}

}
