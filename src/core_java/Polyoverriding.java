package core_java;

public class Polyoverriding extends Polyoverload {

	public void tyre() {
		System.out.println("The child tyre");
	}
	public static void main(String[] args) {
	Polyoverriding op = new Polyoverriding();
	op.tyre();
	op.steer();
	op.engine();
	
	}
}
