package core_java;

public class Return2 extends Returnstatement{

	public String  hug () {
		String a ="i will hug you";
		return a;
	}
	
	
	public static void main(String[] args) {
		Return2 re=new Return2();
		System.out.println(re.hug());
		
         System.out.println(re.y());
         System.out.println(re.x());
         
         System.out.println(re.run());
	}
	
	
	public int y () {
		int a = 2;
		int b = 3;
		int v= a*b;
	     return v;
		
		
		
	}
	public double x() {
		double m=5.5;
		double n=6.5;
		double v= m/n;
		return v;
	}

}
