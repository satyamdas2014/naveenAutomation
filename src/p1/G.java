package p1;

public class G {
public static void main(String[] args) {
	System.out.println(isRotate("abcd","bcda"));
}

private static boolean isRotate(String str, String stri) {
	if(str==null || stri==null ) {
		return false;
	}else if(str.length()!=stri.length()) {
		return false;
		
	}else {
		String concat= str+str;
		return concat.contains(stri);
	}
	
}
}
