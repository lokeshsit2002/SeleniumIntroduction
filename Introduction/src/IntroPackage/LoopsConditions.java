package IntroPackage;

public class LoopsConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//While loop

		//1 to 10
		int i=10;

		 while(i>0)
		{
		System.out.println(i);
		i--;
		}
		 
	
		 // 20 to 30
		int j=20;
		do
		{
		System.out.println(j);
		j++;

		}while(j<31);// 1 loop of execution is guarantee

		// For loop

		for(int k=0;k<10;k=k+3)
		{
		if(k==9)
		System.out.println(" 9 is displayed");
		else
		System.out.println("I didnot find");//
		}
	}
	
}
