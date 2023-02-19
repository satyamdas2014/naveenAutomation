package p1;

public class K {
	public static void main(String[] args) {
		int [] x= {38,23,32,14,7};
		for(int j= 0;j<x.length-1; j++) {
			for(int i = 0; i<x.length-1;i++) {
				if(x[i]>x[i+1]) {
					int temp;
					temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
				}
				
			}
			
			}
		for(int m: x) {
			System.out.println(m);
		}
	}

}
