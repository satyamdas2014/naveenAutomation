package p2;

import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		int[]x= {10,20,10,30,10};
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i=0;i<x.length;i++) {
			if(map.get(x[i])!=null) {
				map.put(x[i], map.get(x[i])+1);
				
			}else {
				map.put(x[i], 1);
			}
			
		if(map.get(x[i])>x.length/2) {
			System.out.println(x[i]);
			
		}
	}
}
}
	