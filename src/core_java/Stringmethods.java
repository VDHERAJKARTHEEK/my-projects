package core_java;

public class Stringmethods {

	public static void main(String[] args) {
		String a="Mom";
		String b="dad";
		System.out.println(a.charAt(1));
		System.out.println(a.endsWith("m"));
		System.out.println(a.toUpperCase());
			System.out.println(a.toLowerCase());
			System.out.println(a.concat(b));
			System.out.println(a.compareTo(b));
			System.out.println(a.equals(b));
			char[]c=a.toCharArray();
			for (int i=0;i<a.length();i++) {
				System.out.println(c[i]);
				System.out.println("123"+321);
				System.out.println(123+321);
				String d= "456";
				System.out.println("String "+(d+12));
				int e=Integer.valueOf(d);
				System.out.println("int "+(e+12));
				String f="this is good day";
				String[]g=f.split(" ");
				//for (int j= 0;j<g.length;j++) {
				System.out.println(g[2]);
				System.out.println(g[0]);
				}
			//}
		}
	
		

	}


