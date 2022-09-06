package core_java;

public class Switch {
    int a=2;
    		int b=1;
    		
	public static void main(String[] args) {
	Switch g=new Switch();
	int c=5;
	int d=4;
	
	int h=g.a+g.b;
	if ( h==5) {
		System.out.println("h=5");
	}
	else if (h>5) {
		System.out.println("h>5");
	}
	else {
		System.out.println("h<5");
	}
	
	int j=c+d;
	switch (j) {
	case 5: System.out.println("value is 5");
	break;
	case 10:System.out.println("value is 10");
	break;
	case 15:System.out.println("value is 15");
	break;
	default:System.out.println("value is not present");
	}
	}

}
