package core_java;

public class Abschild extends  Abstract{
    private int a;
    private int b;
    private int c;
    
    
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	void run() {
		String run;
		
		 run= "run";
		System.out.println(run);
		
	}

	@Override
	void jump() {
	String jump="jump";
	
		System.out.println(jump);
	}

	@Override
	void sleep() {
		String sleep="sleep";
		System.out.println(sleep);
		
	}
	public static void main(String[] args) {
		Abschild ac= new Abschild ();
		ac.sleep();
		ac.jump();
		ac.run();
	}
	

}
