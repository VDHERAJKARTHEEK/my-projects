package core_java;

public class Factorial {

	public int factor (int n) {
		
	if(n==1) {
		return 1;
	}
	else {
		return n *factor((n-1));
		
	}
	
	}
	
	
	
	
	public static void main(String[] args) {
	Factorial f = new Factorial();
	System.out.println(f.factor(6));

	}

}
