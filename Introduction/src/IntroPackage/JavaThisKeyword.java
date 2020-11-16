package IntroPackage;

public class JavaThisKeyword {
	
	int a =2;
	
	public void getData() {
		int a =4;
		int b = a + this.a;
		System.out.println(a);
		System.out.println(this.a);//this refers to the object level..ultimately scope is in class level
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		JavaThisKeyword tk = new JavaThisKeyword();
		tk.getData();
	}

}
