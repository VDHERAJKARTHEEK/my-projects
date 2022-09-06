package core_java;

public class Carchild extends Carsuperclass{

	public void display() {
		System.out.println(Battery(5000));
	}
	public void end () {
		System.out.println(camera("64"));
	}
	public void rgv () {
		System.out.println(cpu(8));
	}
	
	//additional feature of child class
	public String Led() {
		String led = "This is backlit";
		System.out.println(led);
		return led;
	}
	
	public static void main(String[] args) {
		
		Carsuperclass cs = new Carchild(); //upcasting
		Carchild cc = new Carchild();
		cc.display();
		cc.Led();
		cc.end();
		cc.rgv();
		
	}
}

