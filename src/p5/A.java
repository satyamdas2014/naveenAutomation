package p5;

public class A {
	public static void main(String[] args) {
		int x [] = {24,13,55,67,34,98,23} ;
	
		int temp;
		for(int j = 0; j<x.length-1; j++) {
			for(int i =0; i<x.length-1; i++) {
				if(x[i]>x[i+1]) {
					temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
			}
		}
	for(int arr : x) {
		System.out.println(arr);
	}
	}

}
