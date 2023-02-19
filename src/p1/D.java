package p1;

public class D {
public static void main(String[] args) {
	String str="satyam";
  int	vowelcount=0;
  int consonentcount=0;
  for(int i=0;i<str.length();i++) {
	if(isvowel(str.charAt(i))) {
		vowelcount++;
		
	}else {
		consonentcount++;
	}
  }
  System.out.println("vowel count="+vowelcount);
  System.out.println("conso count="+consonentcount);
}

private static boolean isvowel(char ch) {
	
	return (ch=='a' || ch=='e' || ch=='i');
}
}
