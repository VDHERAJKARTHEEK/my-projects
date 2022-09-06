package core_java;

import java.util.ArrayList;
import java.util.Iterator;



public class Gringo {

	public static void main(String[] args) {
		ArrayList<Double> dd = new ArrayList<Double>();
		dd.add(2.5);
		dd.add(3.5);
		dd.add(5.6);
		dd.add(4.56);
		dd.add(2.5689);
		System.out.println(dd);
		Iterator<Double> db=dd.iterator();
		while(db.hasNext()) {
			System.out.println(db.next());
		}
		
		

	}

}
