package core_java;

public class Ifelsecondition1 {

	public static void main(String[] args) {
		int eng=50;
		int maths=75;
		int science=85;
		
		if (eng>=50) {
			System.out.println("eng pass");
		
		}
		else {
			System.out.println(" eng fail");
		
		}
		if (maths>=50) {
			System.out.println("maths pass");
		}
		else {
		System.out.println("maths fail");
		}
		if (science>=50) {
			System.out.println("scince pass");
		}
		else {
			System.out.println("science fail");
		}
		int avg=(eng+maths+science)/3;
		if(avg>70) {
			System.out.println("percentage 50");
		}
        else {
			System.out.println("fail");
		}
		
	}
}
