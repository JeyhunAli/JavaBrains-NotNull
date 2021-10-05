package Java_Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WipeAndWrite {

	public static void main(String[] args) {

		findDublicate("Who ever mentions about God That Person is my Friend");
		
		findPrimeNumbers(100);
		
		String text =reverseString("\n Love God find the way of being in peace");
		System.out.println(text);
		
		
		
	}
	
	
	public static void findDublicate(String str) {
		System.out.println("given String" + str);
		if(str==null) {
			System.out.println("null String");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("empthy String" + str);
			return;
		}
		if(str.length()<=1) {
			System.out.println("Single char ");
			return;
		}
		char[] letters = str.toCharArray();
		Map<Character, Integer> mapChar = new HashMap<Character, Integer>();
		for(Character ch: letters) {
			if(mapChar.containsKey(ch)) {
				mapChar.put(ch, mapChar.get(ch)+1);
				
			}else {
				mapChar.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entriSet = mapChar.entrySet();
		for(Map.Entry<Character, Integer> entry: entriSet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " : " + entry.getValue());
			}
		}
		
	}
	
	
	public static void findPrimeNumbers(int number) {
		
		List<Integer> primeNumbers = new ArrayList<Integer>();
		
		for(int i=2; i<=number; i++) {
			boolean isPrime= true;
			for(int y=2; y<=i/2; y++) {
				if(i%y==0) {
					isPrime=false;
				}
			}
			if(isPrime) {
				primeNumbers.add(i);
			}
			
		}
		System.out.println("print 1 to " + number + " Prime numbers");
		System.out.println("primeNumbers.size is: " + primeNumbers.size());
		for(Integer e: primeNumbers) {
			System.out.print(e +" ");
		}
		
	}
	
	
	
	public static String reverseString(String s) {
		System.out.println("given String " + s);
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("reversed String " + reverse);
		return reverse;
	}

	
}
	
	
	
	
	
	
	


