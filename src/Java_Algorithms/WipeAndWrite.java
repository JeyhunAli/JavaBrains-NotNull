package Java_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WipeAndWrite {

	public static void main(String[] args) {

		int [] arr = {33, 45, 22, 1, 3, 2, 4, 6, 5, 8, 7, 11, 10 };
		sortArray(arr);
		
		findduplicatechar("America is great country for the craziest and inteliigent people");
		
		findPrimeNum(100);
		
		checkPalindrome("race car"); 
		checkPalindrome("Mom");
		checkPalindrome("Nurses Run");
		System.out.println("---");
		repetitiveWordCount("hey hey  two two ");
		repetitiveWord_2("hey hey  hey ");
		getrepetitiveword("choose selenium with java then u have to learn Java then selenium");
		
	}

	//sort array with logic not with in build method
	public static void sortArray(int [] arr) {
		System.out.println("given array: " + Arrays.toString(arr));
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int y=i; y<arr.length; y++) {
				if(arr[i] > arr[y]) {
					temp = arr[i];
					arr[i] = arr[y];
					arr[y] = temp;
				}
			}
		}
		System.out.println("sorted array after logic: " + Arrays.toString(arr));
		for(Integer e: arr) {
			System.out.print(e + " ");
		}
		
	}
	
	//find repetitive char with logic
	public static void findduplicatechar(String str) {
		System.out.println("Given String " + str);
		if(str==null) {
			System.out.println("null String " +str);
			return;
		}
		if(str.isEmpty()) {
			System.out.println("empthy String " + str);
			return;
		}
		if(str.length()<=1) {
			System.out.println("single String" + str);
		}
		
		char[] letters = str.toCharArray();
		Map<Character, Integer> mapChar = new HashMap<Character, Integer>();
		for(Character ch: letters) {
			if(mapChar.containsKey(ch)) {
				mapChar.put(ch, mapChar.get(ch)+1);
			}
			else {
				mapChar.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entriSet = mapChar.entrySet();
		for(Map.Entry<Character, Integer> entry: entriSet){
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
		
	}
	
	
	public static void findPrimeNum(int numbers) {
		System.out.println("given integer numbers " + numbers);
		
		List<Integer> primeNumbers = new ArrayList<Integer>();
		
		for(int i=2; i<=numbers; i++) {
			boolean isPrime = true;
			for(int y=2; y<=i/2; y++) {
				if(i%y==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				primeNumbers.add(i);
			}
		}
		System.out.println("1 to " + numbers + " prime numbers");
		System.out.println("primeNumbers.size()" + primeNumbers.size());
		for(Integer e: primeNumbers) {
			System.out.print(e + " ");
		}
	}
	
	
	
	public static void checkPalindrome(String str) {
		System.out.println("given String: " + str);
		str = str.replace(" ", "");  //because of string immutable great example
		str = str.toLowerCase();
		
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		boolean isPalindrome = true;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != reverse.charAt(i)) {
				isPalindrome = false;
			}
		}
		
		if(isPalindrome) {
			System.out.println("given String: "+ str +" is Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		
	    }
	
	//repetitiveWordCount
	public static void repetitiveWordCount(String input) {
		input = input.toLowerCase();
		String[] splitedwords = input.split(" ");
		Map<String, Integer> mapWords = new HashMap<String, Integer>();
		
		for(String word : splitedwords) {
			if(mapWords.containsKey(word)) {
				mapWords.put(word, mapWords.get(word)+1);
			}
			else {
				mapWords.put(word, 1);
			}
			
		}
		Set<String> setword = mapWords.keySet();
		for(String w: setword) {
			if(mapWords.get(w)>1) {
				System.out.println(w + " : " + mapWords.get(w));
			}
			
		}
		
	}
	//repetitiveWordCount
	public static void repetitiveWord_2(String input) {
		input = input.toLowerCase();
		String[] words = input.split(" ");
		HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
		for(String word: words) {
			if(wordcount.containsKey(word)) {
				wordcount.put(word, wordcount.get(word)+1);
			}
			else {
				wordcount.put(word, 1);
			}
		
	}
		Set<String> wordInString = wordcount.keySet();
		for(String word: wordInString) {
			if(wordcount.get(word)>1) {
				System.out.println(word + " : " + wordcount.get(word));
				
			}
		}
	}
	
	//repetitiveWordCount with entry set
	public static void getrepetitiveword(String input) {
    	 input = input.toLowerCase();
    	String [] splittedwords = input.split(" ");
    	Map<String, Integer> mapWords = new HashMap<String, Integer>();
    	
    	for(String words: splittedwords) {
    		if(mapWords.containsKey(words)) {
    			mapWords.put(words, mapWords.get(words)+1);
    		}
    		else {
    			mapWords.put(words, 1);
    		}
    	}
    	Set<Map.Entry<String, Integer>> entriSet = mapWords.entrySet();
    	for(Map.Entry<String, Integer> entry: entriSet) {
    		if(entry.getValue()>1) {
    			System.out.println(entry.getKey() + " : " + entry.getValue());
    		}
    	}
    	
    	 
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	


