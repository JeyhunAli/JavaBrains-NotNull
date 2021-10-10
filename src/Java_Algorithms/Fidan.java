package Java_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Fidan {

	public static void main(String[] args) {

		
		
		
		System.out.println(FiDDAn());
		
		
	
		
		/**
		 * Write a program that prints out the numbers from 1 to 30 but for numbers
		 * which are a collection of 3, print "FI" instead of the number and for numbers
		 * which are a collection of 5, print "DAN" instead of the number. For numbers
		 * which are a collection of both 3 and 5,print "Fidan" instead of the number.
		 */

//		for (int i = 1; i <= 30; i++) {
//			String print = "";
//			
//			if (i % 3 == 0) {
//				print = "FI";
//			}
//				
//			if (i % 5 == 0) {
//				print = "DAN";	
//			}
//				
//			if (print.isEmpty()) {
//				System.out.println(i);
//			}
//
//			else {
//
//				System.out.println(print);
//
//			}
//
//		}
		
		
		for (int i = 1; i <= 30; i++) {
			
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("Fidan");
			}
			if(i%3==0) {
				System.out.println("FI");
			}
			if(i%5==0) {
				System.out.println("Dan");
			}
			else {
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		
		

	}
	
	
	
	public static List<String> FiDDAn() {
		
		List<String> words = new ArrayList<String>();
		for(int i=0; i<=10; i++) {
			
			if(i%3 == 0 && i%5 == 0) {
				words.add("Fidan");
			}
			if(i%3==0) {
				words.add("FI");
			}
			if(i%5==0) {
				words.add("DAN");
			}
			else {
				words.add(Integer.toString(i));
			}
			
		}
		
		return words;
		
		
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
