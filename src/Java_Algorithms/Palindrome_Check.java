package Java_Algorithms;


public class Palindrome_Check {

	public static void main(String[] args) {
		
		/**
		 * Palindrome number in java: A palindrome number is a number that is same after reverse. 
		 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
		 * It can also be a string like LOL, MADAM, race car etc.
		 */
		
		checkIfPalindrome("RACE CAR");
		
		

	}
	
	public static void checkIfPalindrome(String str) {
		System.out.println("given String " + str);
		
		//str.replace(" ", "");  this line wont work because string immutable
		
		str=str.replace(" ", "");
		
		
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		System.out.println(reverse);
		
		boolean isPalindrome = true;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != reverse.charAt(i)) {
				isPalindrome=false;
			}	
			}
		
			if(isPalindrome) {
				System.out.println("PALINDROME");
			}
			else {
				System.out.println("not a palindrome");
			}
		
		
	}
	
	}


