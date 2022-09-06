package core_java;

public class Pizza {

	int a=45;
	int b=22;
	
	static int c=55;
	static int d=33;
	
	public static void main(String[] args) {
		
		int f=2;
		int q=5;
		int k=q-f;
				
		int z=c-d;
		
		Pizza h=new Pizza();
		int g=h.a-h.b;
	 System.out.println("the value of local variables"+k);
	 System.out.println("the value of static variables"+z);
	 System.out.println("the value of non static variable"+g);
				

	}

}
