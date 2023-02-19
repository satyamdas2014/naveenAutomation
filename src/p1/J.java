package p1;

public class J {
public static void main(String[] args) {
	int [] x= {1,1,2,3,4,4,5};
	int [] temp = new int [x.length];
	int j=0;
	for(int i= 0; i<x.length-1;i++) {
		if(x[i] != x[i+1]) {
			temp [j] = x[i+1];
			j++;
			temp[j] = x.length;
		}
	}
	
	for(int z:temp) {
		System.out.println(z);
	}
	
}
}
