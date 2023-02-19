package p4;

import java.util.HashMap;
import java.util.Map.Entry;

public class A {
	
	public static void main(String[] args) {
		String x ="satyam";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<x.length();i++) {
			 if(map.get(x.charAt(i))!=null) {
				 map.put(x.charAt(i), map.get(x.charAt(i))+1);
			 }
			 else {
			map.put(x.charAt(i), 1);
		}
		
	}
	StringBuilder sb = new StringBuilder (); 
	for(Entry<Character, Integer> entry:map.entrySet()) {
		sb.append(entry.getKey());
		sb.append(entry.getValue());
		}
System.out.println(sb.toString());
}
}