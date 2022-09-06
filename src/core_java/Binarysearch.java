package core_java;

import java.util.Arrays;

public class Binarysearch {
	
public void bubblesort (int[]a) {
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;		
			}
		}
	}
	for (int x:a) {
		System.out.print(x+" ");
	}System.out.println();
	
}
public int Binarysearch(int []a,int l,int r,int x) {
 if (r>=l) {
	 int mid =l+(r-l)/2;
	 if (a[mid ]==x) {
		 return mid;
		 
	 }
	 else if (a[mid]>x) {
		 return  Binarysearch(a,l,mid-1,x);
		 
	 }
	 else {
		 return Binarysearch(a,mid+1,r,x);
		 }
 }
return -1;
	
}

	public static void main(String[] args) {
		int[] a= {4,9,7,6,3,1};
		Binarysearch d= new Binarysearch();
		d.bubblesort(a);
		int[]b= {2,4,6,8,10,12,14,20};
		int elm=10;
		int f=d.Binarysearch(b, 0, b.length-1, elm);
		System.out.println("element "+elm+" at "+f);
		
	}

}
