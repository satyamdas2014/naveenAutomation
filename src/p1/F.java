package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class F {
	public static void main(String[] args) {
		String str="Banana";
HashMap<Character,Integer> map = new HashMap<>();
for(int i=0;i<str.length(); i++) {
	if(map.get(str.charAt(i))!=null) {
		map.put(str.charAt(i), map.get(str.charAt(i))+1);
	}else {
		map.put(str.charAt(i), 1);
	}
}
Set<Entry<Character, Integer>> set = map.entrySet();
List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		return o2.getValue().compareTo(o1.getValue());
	}
	
});
for(Entry<Character, Integer> entry:list) {
	System.out.println("freq" + entry.getKey() + "..." + entry.getValue());
}

}
}