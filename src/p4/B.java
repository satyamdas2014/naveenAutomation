package p4;

public class B {
	
	public static void main(String[] args) {
		int x = 12321;
	int rev = 0;
	while(x!=0) {
		 rev = rev*10 + x%10;
		 x=x/10;
		
	}
	
	if(rev==x) {
		
		System.out.print("no is parindrome");
		
	}
	
	}	
	
	

}
