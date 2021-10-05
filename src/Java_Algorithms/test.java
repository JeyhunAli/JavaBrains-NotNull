package Java_Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		
		getPrimeNum(100);
		repetetiveLetters("Broken_Foot_hurts_a_Lot");
		findFactorial(5);
		findrepetitive("azerBaijan_Dogma_Diyar");
		primeNumberOne_TO_Hundred(60);
		factNUMM(5);
	}
	
	
	// 1 to 100 prime numbers
	/**
	 * 
	 * @author jey
	 * A prime number is a number that is divisible by only two numbers:
	 *  1 and itself. So, if any number is divisible by any other number, 
	 *  it is not a prime number.
	 * 
	 * lowest prime num is 2
	 *
	 */
	
	public static void getPrimeNum(int numbers) {
		List<Integer> pNumbers = new ArrayList<Integer>();
		for(int i=2; i<=numbers; i++) {
			boolean isPrime = true;
			for(int y=2; y<=i/2; y++) {
				if(i%y==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				pNumbers.add(i);
			}
			
		}
		System.out.println("1 to 100 prime numbers ");
		System.out.println("PrimeNumbers.size = " + pNumbers.size());
		for(Integer num: pNumbers) {
			System.out.print(num + " ");
		}
	}
	
	//--------------------------------------------------------------------------------
	
	
	//find out repetetive letters in String
	
	public static void repetetiveLetters(String str) {
		
		System.out.println("\n given String " + str);
		if(str==null) {
			System.out.println("null String");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("empthy String");
			return;
		}
		if(str.length()<=1) {
			System.out.println("single character");
			return;
		}
		
		char [] letters = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch: letters) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entriSet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry: entriSet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
		
	}
	
	//--------------------------------------------------------------------------------
	
	        //Factorial of a non-negative integer, is multiplication of all integers 
			//smaller than or equal to number excluding zero
	public static void findFactorial(int num) {
		
		int fact = 1;
		for(int i=num; i>=1; i--) {
			fact = fact*i;
		}
		
		System.out.println("factorial of == " + num + " is " + fact);
	}
	
	
	//--------------------------------------------------------------------------------

	public static void findrepetitive(String str) {
		System.out.println("\n given String " + str);
		if(str==null) {
			System.out.println("null String");
				return;
			}
			if(str.isEmpty()) {
				System.out.println("empthy String");
				return;
			}
			if(str.length()<=1) {
				System.out.println("single character");
				return;
			}
			
			char [] letters = str.toCharArray();
			
			Map<Character, Integer> charMap = new HashMap<Character, Integer >();
			for(Character ch: letters) {
				if(charMap.containsKey(ch)) {
					charMap.put(ch, charMap.get(ch)+1);
				}
				else {
					charMap.put(ch, 1);
				}
				
		}
			Set<Map.Entry<Character, Integer>> entirSet = charMap.entrySet();
			for(Map.Entry<Character, Integer> entry: entirSet) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
			}
	}
	
	//--------------------------------------------------------------------------------
	//lowest prime number is 2
	
	public static void primeNumberOne_TO_Hundred(int numbers) {
		
		List<Integer> primenumbres = new ArrayList<Integer>();
		
		for(int i=2; i<=numbers; i++) {
			boolean isPrime = true;
			for(int b=2; b<=i/2; b++) {
				if(i%b==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primenumbres.add(i);
			}
		}
		System.out.println("Prime numbers from one up to given number ");
		System.out.println("primenumbres.size " + primenumbres.size());
		for(Integer numb: primenumbres) {
			System.out.print(numb+ " ");
		}
	}
	
	public static void factNUMM(int num) {
		
		int fact = 1;
		for(int i=num; i>=1;i--) {
			fact=fact*i;
			
		}System.out.println("\n" +fact);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
