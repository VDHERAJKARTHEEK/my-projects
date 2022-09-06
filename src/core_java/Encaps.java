package core_java;

public class Encaps {
private int love;
private double fake;
private String tru;
private char marrage;


public int getLove() {
	return love;
}
public void setLove(int love) {
	this.love = love;
}
public double getFake() {
	return fake;
}
public void setFake(double fake) {
	this.fake = fake;
}
public String getTru() {
	return tru;
}
public void setTru(String tru) {
	this.tru = tru;
}
public char getMarrage() {
	return marrage;
}
public void setMarrage(char marrage) {
	this.marrage = marrage;
}

public static void main(String[] args) {
	
	Encaps en =new Encaps ();
	en.setLove(22);
	System.out.println(en.getLove());
	
	en.setFake(2.8);
	System.out.println(en.getFake());
	en.setTru("love");
	System.out.println(en.getTru());
	en.setMarrage('d');
	System.out.println(en.getMarrage());
		
	
	
}
}

