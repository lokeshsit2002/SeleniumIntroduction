package IntroPackage;

public class JavaInheritChild extends JavaInheritParent {

	
	String name ="QAClickAcademy";


	public JavaInheritChild()
	{
	super();// this should be always be at first line
	System.out.println("child class constructor");

	}
	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.name);
	}


	public void getData()
	{
	super.getData();
	System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JavaInheritChild cd = new JavaInheritChild();

		cd.getStringdata();
		cd.getData();
	}

}
