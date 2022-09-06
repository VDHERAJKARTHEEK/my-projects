package core_java;

public class Encapsyou {
private int ooo;
private  double mjmj;
private float lklk;
public int getOoo() {
	return ooo;
}
public void setOoo(int ooo) {
	this.ooo = ooo;
}
public double getMjmj() {
	return mjmj;
}
public void setMjmj(double mjmj) {
	this.mjmj = mjmj;
}
public float getLklk() {
	return lklk;
}
public void setLklk(float lklk) {
	this.lklk = lklk;
}

public static void main(String[] args) {
	
	Encapsyou ey= new Encapsyou();
	ey.setOoo(1021354);
	System.out.println(ey.getOoo());
	ey.setMjmj(789456123);
	System.out.println(ey.getMjmj());
	ey.setLklk(456789123);
	System.out.println(ey.getLklk());
	
	
}
		

	

}
