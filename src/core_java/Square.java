package core_java;

public class Square {
	public void Sqrt (int n){
		for (int i =0;i<n;i++) {
			if(n==i*i) {
				System.out.println("Sqrt "+n+" is "+i);
			}
		}
		
	}
	public void Sqre (int n){
		int s=n*n; 
				System.out.println("Sqre "+n+" is "+s);
			}
		

	public static void main(String[] args) {
		Square d= new Square();
		d.Sqrt(625);
		d.Sqre(1);

	}
	

}
