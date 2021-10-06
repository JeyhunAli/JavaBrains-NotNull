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
	
}
	
	
	
	
	
	
	


