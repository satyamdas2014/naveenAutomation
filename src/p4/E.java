package p4;

public class E {
public static void main(String[] args) {
	int x = 6786;
	int count = 0;
	while(x>0) {
		for(int i =0; i<=x; i++) {
		
			x = x/10;
			count++;
		}
		System.out.println(count);
	}
	
}
}
