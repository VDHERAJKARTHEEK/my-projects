package core_java;

public class Grandchild extends Abschild{
	
public static void main(String[] args) {
		Grandchild gd=new Grandchild();
		gd.setA(789);
		System.out.println(gd.getA());
		gd.setB(987);
		System.out.println(gd.getB());
		gd.setC(567);
		System.out.println(gd.getC());
		gd.run();
		gd.jump();
		gd.sleep();
		

	}

}
