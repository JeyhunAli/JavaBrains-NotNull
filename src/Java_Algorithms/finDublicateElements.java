package Java_Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class finDublicateElements {

	public static void main(String[] args) {

		// find repetitive elements in given String
		findDublicate("interview-Process on the go");
		
	}
	public static void findDublicate(String str) {
		
		if(str==null) {
			System.out.println("null string");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("empthy String");
			return;
		}
		if(str.length()<1) {
			System.out.println("single char String");
			
		}
		
		char [] letters = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(Character ch: letters) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entriSet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entriSet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
		
	}

}

