  package p1;

import java.util.HashMap;

public class E {
	public static void main(String[] args) {
	String str="pooja";
	HashMap<Character,Integer> map= new HashMap<>();
	for(int i=0;i<str.length();i++) {
		if(map.get(str.charAt(i))!=null) {
			map.put(str.charAt(i), map.get(str.charAt(i))+1);
			
		}else {
			map.put(str.charAt(i), 1);
		}
	}
	System.out.println(map);
}
}