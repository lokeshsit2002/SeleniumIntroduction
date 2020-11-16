package IntroPackage;

public class JavaArrays {
	
	public static void main(String[] args) {
		//- A container which stores multiple values of same data type

		int a[] = new int[5];// Delclares an array and allocates memory for the values
		a[0]= 2;
		a[1]=6;
		a[2]=1;
		a[3]=9;
		a[4]=12;//initilased values into that array
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		// retrieve values present in this array/
	}

		int b[] = {1,4,3,5,7,8};

		for(int i=0;i<b.length;i++)
		{
		System.out.println(b[i]);
		// retrieve values present in this array/
	}
		
		
		//Multidimentional Arrays
		
		
	////a[row][coloum]


		int c[][] = new int[2][3];
		c[0][0]=2;
		c[0][1]=4;
		c[0][2]=5;
		c[1][0]=3;
		c[1][1]=4;
		c[1][2]=7;
		
		System.out.println(c[1][0]);
		
		
		int d[][]= {{2,4,5},{3,4,7},{1,7,8}};
		
		System.out.println(d[2][1]);
		
		
		//Print the minimum value of the array element
		
		int min= d[0][0];

		for(int i=0;i<3;i++) //row
		{

		for(int j=0;j<3;j++) //coloumn
		{

		if(d[i][j]<min)
		{
			min=d[i][j];
		}
		}
	}
		System.out.println("Print minimum value of array D = "+ min);
	}
}
