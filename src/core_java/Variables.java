package core_java;

public class Variables {

	int a=12; //this is a non static variable inside class out side method,...object level
	int b=20;
	
	static int c=12;//this is static variable inside class out side method...class level
	static int d=15;
	
	public static void main(String[] args) {
		
		int q=10;//this is local variable inside method...block level or method level
		int r=20;
		
		int t=q+r;
		int z=c+d;
		
		Variables d=new Variables();
		int m=d.a+d.b;
		
		System.out.println(t);
		System.out.println(z);
		System.out.println(m);
		

	}

}
