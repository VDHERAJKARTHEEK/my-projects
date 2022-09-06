package core_java;

import java.util.ArrayList;
import java.util.Iterator;



public class Lists {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(null);
		al.add(10);
		al.add(20);
		
		System.out.println(al);
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
       ArrayList<Float> ch= new ArrayList<Float>();
       ch.add(123456f);
       ch.add(456123f);
       ch.add(654987f);
       System.out.println(ch);
       Iterator<Float> ft=ch.iterator();
       while(ft.hasNext()) {
    	   System.out.println(ft.next());
       }
       
	}

}
	
	

