package IntroPackage;

public class JavaConstructorDemo {
	
	//will not return values //name of constructor should be the class name
	// Default 
	public JavaConstructorDemo() 
	{ System.out.println(" I am in the constructor"); System.out.println(" I am in the constructor lecture 1");
	 } 
	
	//Parameterized constructor 
	public JavaConstructorDemo(int a, int b) 
	{ System.out.println(" I am in the parameterized constructor"); 
	int c=a+b;
	System.out.println(c); 
	} 
	
	public JavaConstructorDemo(String str) 
	{ 
		System.out.println(str); 
		} 
	
	public void getdata() 
	{ 
		System.out.println("I am the method"); 
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaConstructorDemo cd = new JavaConstructorDemo();
		JavaConstructorDemo d = new JavaConstructorDemo(4,5);
		JavaConstructorDemo ds = new JavaConstructorDemo("Lokesh");
	}
}
