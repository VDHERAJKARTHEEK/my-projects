package core_java;

public class Returnstatement {

	public String  run() {
		String a = "I am running "; // same variable name can be given as the method is different 
		return a ;
	}
	public String sleeping() {
		String a = "I am sleeping ";
		return a ;
	}
	public String reading() {
		String a = "I am reading ";
		return a;
		
	}
	
	public static void main (String[]args) {
		Returnstatement re= new Returnstatement();
		System.out.println(re.run());
		System.out.println(re.sleeping());
		System.out.println(re.reading());
		
	}
	}