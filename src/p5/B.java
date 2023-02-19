package p5;

public class B {
	public static void main(String[] args) {
		int x [] = {2,2,3,4,5,5,6,5};
		int temp ;
		for(int i =0; i<x.length-1; i++) {
			if(x[i]!=x[i+1]) {
			temp = x[i];
			System.out.println(temp);
			}
			
		}
		
	
	}

}
