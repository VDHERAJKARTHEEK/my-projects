package core_java;

public class Continuestatement {

	public static void main(String[] args) {
		for (int i=2;i<10;i++) {
			if(i%2==1) {
				continue;
			}System.out.println(i);
		}
		for (int g=0;g<10;g++) {//preincreament printing will from zero
			
			if(g==5) {
				continue;
				
			}System.out.println(g);
		}
for (int p=5;p<60;++p) { //post increament printing will be done from 6
	if (p==22) {
		continue;
	}
	System.out.println(p);
}
	}

}
