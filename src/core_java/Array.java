package core_java;

public class Array {

	public static void main(String[] args) {
		int[]a=new int [3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
	int []b= {6,5,4};
		for(int i=0;i<a.length;i++){
			
			System.out.println(a[i]+" ");
			
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" ");
		}
System.out.println();

int[][]c= {{1,2,3},{3,4,5},{4,5,6}};


for(int i=0;i<c.length;i++) {
	for(int j=0;j<c[i].length;j++) {
		System.out.print(c[i][j]+" ");
	}
System.out.println( );
}System.out.println();
int[][]d= {{1,2,5},{4,5,5},{6,9,8}};
for(int i=0;i<d.length;i++) {
	for(int k=0;k<d[i].length;k++) {
		System.out.print(d[i][k]+" ");
	}
	System.out.println();
	
}

	System.out.println( );
	int f[][]=new int[3][3];
	for(int i=0;i<f.length;i++) {
		for(int k=0;k<f[i].length;k++) {
			f[i][k]=d[i][k]*c[i][k];
		}
		
	}
	for(int i=0;i<f.length;i++) {
		for(int k=0;k<f[i].length;k++) {
			System.out.print(f[i][k]+" ");
		}
		System.out.println();
			}


	}
}


