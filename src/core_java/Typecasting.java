package core_java;

public class Typecasting {
	
	public static void main(String[] args) {
		
		int a=2;
		double b=a;// expilicit type casting (small to big)
		
	    double c=3.2;
		short d=(short)c;//implicit type casting (big to small)
		
		System.out.println("explicit of a is" + b);
		System.out.println("implicite of c is "+ d);
	}

}
