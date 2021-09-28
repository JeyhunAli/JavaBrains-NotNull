package Java_Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countOfRepetitiveCharInString {

	public static void main(String[] args) {
		
		
		countOfRepetitiveElements("United States of America");
	}
	
	public static void countOfRepetitiveElements(String str) {
		System.out.println(str);
		if(str==null) {
			System.out.println("null string");
			return;
		}
		else if(str.isEmpty()) {
			System.out.println("emthy String");
			return;
		}
		else if(str.length()==1) {
			System.out.println("Single char");
			return;
		}
		
		char[] letters = str.toCharArray();
		Map <Character, Integer> mapChar = new HashMap<Character, Integer>();
		
		for(Character ch: letters) {
			if(mapChar.containsKey(ch)) {
				mapChar.put(ch, mapChar.get(ch)+1);
			}
			else {
				mapChar.put(ch, 1);
				
			}
		}
		
		Set<Map.Entry<Character, Integer>> entryse = mapChar.entrySet();
		for(Map.Entry<Character, Integer> entry: entryse) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ ":" +entry.getValue());
			}
		}
		
	}

}
