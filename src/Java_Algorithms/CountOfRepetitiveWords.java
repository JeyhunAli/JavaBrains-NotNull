package Java_Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfRepetitiveWords {

	public static void main(String[] args) {
		
		
		repetitiveWord("Java my lovely Java is the best Java java");
		repetitiveWord_2("java java java Java ");
		
	}
	
	//find out repetitive words 
	//extracting with entrySet
	public static void repetitiveWord(String intputWord) {
		intputWord = intputWord.toLowerCase();
		String words[] = intputWord.split(" ");
		
		Map <String, Integer> mapWord = new HashMap<String, Integer>();
		for(String word: words ) {
			if(mapWord.containsKey(word)) {
				mapWord.put(word, mapWord.get(word)+1);
			}
			else {
				mapWord.put(word, 1);
			}
		}
		Set<Map.Entry<String, Integer>> entriSet = mapWord.entrySet();
		for(Map.Entry<String, Integer> entry: entriSet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
	}
	
	//find out repetitive words 
		//extracting with Keyset
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
