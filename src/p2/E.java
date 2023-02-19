package p2;

public class E {
public static void main(String[] args) {
	int num = 1456789;
	
	int EvenNo=0;
	int oddNo=0;
	while(num>0) {
		int rem = num%10;
		
		if(rem%2==0) {
			EvenNo++;
			
		}
		else
		{
			oddNo++;
		}
		num = num/10;
		
	}
	System.out.print ("even no."+EvenNo);
	System.out.println(" ");
	System.out.print( "odd no"+oddNo);
}
}
