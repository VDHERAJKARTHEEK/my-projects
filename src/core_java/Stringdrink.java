package core_java;

public class Stringdrink {

	int a=99;
	int b=0;
	
	public static void main(String[] args) {
		Stringdrink d=new Stringdrink();
		
		int g=d.a+d.b;
		
		if (g==99) {
			System.out.println("g is equal to 99");
		}
		else if (g==66) {
			System.out.println("g is not equal to 99");
		}
		else {
			System.out.println("g is not a number");
		}
    switch (g) {
    case 99: System.out.println("g=99");
    break;
    case 100:System.out.println("g>99");
    break;
    default:System.out.println("g is not aa number");
    
    }
    	
    }
    	
	}


