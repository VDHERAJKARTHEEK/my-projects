package core_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists2 {

	public static void main(String[] args) {
		ArrayList<String> ll = new ArrayList<String>();
		ll.add("fake");
		ll.add("love");
		ll.add("jac");
		ll.add(0,"noy");
		System.out.println(ll.get(1));
		System.out.println(ll);
		Iterator<String> st = ll.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(12);
	
		li.addFirst(2);
		li.addLast(20);
		System.out.println(li);
		Iterator<Integer> tt= li.iterator();
        while(tt.hasNext()) {
        	System.out.println(tt.next());
        	
        }
	}

}
