package p2;

public class C {
public static void main(String[] args) {
	String x  = " madam ";
	      String rev ="   ";
	for(int i=x.length()-1; i>0;i--) {
	
		rev = rev+x.charAt(i);
	
		
	}
	if(x==rev) {
		
		System.out.println( x + "parendrome");
	}
	else {
		System.out.println(x + "not parindrome");
	}
}

}
