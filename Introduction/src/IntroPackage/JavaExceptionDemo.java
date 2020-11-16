package IntroPackage;

public class JavaExceptionDemo {

public static void main(String[] args) {
		
	int b=7; int c=0; 
	try { 
		   int k=b/c;
		   
		   System.out.println(k);
		   
		   //int arr[]=new int[5];     
		   //System.out.println(arr[7]);  
		   
		   
		   } 
	
	catch(ArithmeticException et) 
	{ 
		System.out.println("I catched the Arthimetic/exception"); 
		} 
	catch(IndexOutOfBoundsException ets) 
	{ 
		System.out.println("I catched the IndexBound/exception"); 
		} 
	catch(Exception e) { 
		System.out.println("I catched the error/exception"); 
		
	} 
	finally 
	{ 
		//THis block is executed irrespective of exception thrown or not 
		System.out.println("delete cookies");
	}
	}
	
}
