package core_java;

public class Multiplication {

	int a=5;
	int b=7;//non static variable.
	
	static int c=2;
	static int d=3;//static variable.
	
	public static void main(String[] args) {
		int q=4;
		int h=6;// local
		
		Multiplication D=new Multiplication();
		//Multiplication here is the class...D is the reference variable ...new is object creator
		//Multiplication () is an object created.
		
		int g=D.a*D.b;
		//to access a and b we use the reference declared in the object creation
		// this only applicable for non static global variable.
		
		int j=c*d;
		int r=q*h;
		System.out.println(g);
		System.out.println(j);
		System.out.println(r);

	}

}
