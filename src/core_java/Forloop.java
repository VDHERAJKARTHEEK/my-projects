package core_java;

public class Forloop {

	public static void main(String[] args) {
		
		//a is initilized variable, <11 is the condition, a++ is increament.
		for (int a=1;a<11;a++) {// 1 to 10
			System.out.println(a);
		}
     for (int f=100;f>0;f--) {// 
    	 System.out.println(f);
	}

     for (int g=1000;g<2000;g+=100) {
    	 System.out.println(g);
     }
     for (int d=45;d>20;d-=5) {
    	 System.out.println(d);
     }
     int b=45;
     while (b>5) {
    	 System.out.println(b);
    	 b--;
     }
     int h=22;
     do {
    	 System.out.println(h);
    	 h++;
     }
     while (h>55);
 
     
}
}