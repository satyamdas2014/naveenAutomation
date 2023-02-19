package p4;

public class F {
public static void main(String[] args) {
	int x = 12345679;
	int even = 0;
	int odd = 0;
	while(x>0) {
		int rem = x%10;
		if(rem%2==0) {
			even++;
		}else {
			odd++;
		}
		x=x/10;
	}
	System.out.println(""+even);
	System.out.println(""+odd);
}
}
