package IntroPackage;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String : it is one of the prebuilt class in java
		/* 1.String literal
		2.by creating object of string*/

		String a= " javatraining";//string 

		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat(" Lokesh learns"));
		//a.length()
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		//split
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
		
		
		//palindrome
		
		String name = "Lokesh";
		String rname="";
		
		for (int i = name.length()-1;i>=0;i--) {
			rname = rname + name.charAt(i);
		}
		System.out.println(rname);
		
		if(rname.equals(name)) {
			System.out.println("palindrome");
		}
		else System.out.println("Not palindrome");


	}

}
