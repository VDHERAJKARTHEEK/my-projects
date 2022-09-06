package core_java;

public class Reverseofstring {

	public void Stringrev(String s) {
      s = s.toLowerCase();
	boolean flag = true;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
			flag = false;
		}
	}if(flag) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	
	}
		
		
			
	
	public static void main(String[] args) {
		Reverseofstring sr = new Reverseofstring();
	sr.Stringrev("Madam");

	int ab = 123;
	String z =String.valueOf(ab);
	System.out.println("st"+(z+10));
	System.out.println("int"+(ab+10));
	String v="345";
	int p=Integer.parseInt(v);
	System.out.println("parse"+(p+10));
	
	}
}
