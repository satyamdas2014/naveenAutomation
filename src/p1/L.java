package p1;

public class L {
	public static void main(String[] args) {
		
int x [] = {10,11,5,4,7};
   int next;
		for( int i=0;i<x.length;i++) {
			 
			next=-1;
			for(int j=i+1;j<x.length;j++) {
				if(x[i]<x[j]) {
					next=x[j];
					break;
					
				}
			}
			System.out.println(x[i]+"  "+next);
			}
		
	}
}