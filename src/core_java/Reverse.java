package core_java;

public class Reverse {

	public void revint(int s) {
		int rem=0;
		int sum=0;
		int tem=s;
		
		while(s>0) {
		rem = s%10;	
		sum =(sum*10)+rem;
		s=s/10;
		
		}System.out.println(sum);
		if(tem==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}
	public static void main(String[] args) {
	  Reverse re = new Reverse();
	  re.revint(9891);
	   
	    

	}

}
