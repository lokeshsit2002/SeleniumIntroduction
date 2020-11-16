package IntroPackage;

public class JavaStaticKeyword {
	
	String name;
	String address;
	static String city="Bangalore";
	static int i=0;
	
	//static block
	static {
		int j =10;
		String country = "India";
	}
	
	public JavaStaticKeyword(String name, String address) {
		
		this.name= name;
		this.address=address;
		i++;
		System.out.println(i);
				
	}
	
	public void getaddress()
	{
		System.out.println(address + " "+ city);
	}
	
	
	public static void main(String[] args)
	{
		JavaStaticKeyword sk1 = new JavaStaticKeyword("Lokesh", "Jayanagar");
		JavaStaticKeyword sk2 = new JavaStaticKeyword("Rahul", "BTM");
		sk1.getaddress();
		sk2.getaddress();
		
		System.out.println(JavaStaticKeyword.city);
		JavaStaticKeyword.i = 4;	
		sk1.address="Silk Board";
		
	}

}
