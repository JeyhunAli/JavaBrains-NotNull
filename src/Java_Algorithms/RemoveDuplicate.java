package Java_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		/**
		 * removing duplicates from arraylist
		 * with linkedHashSet because as we know that set family doesn't store duplicate elememnts
		 * 
		 */
		//linkedhashSet
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,3,4,2,2,4,5,6,7,8,9,3));
		System.out.println("given numbers with duplicate numbers " + numbers);
		LinkedHashSet<Integer> ArrNumbers = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> noDuplicate = new ArrayList<Integer>(ArrNumbers);
		System.out.println("no duplicate " +noDuplicate);
		
		
		//java 8 streams
		
	}
	
	
	
		
		
	

}
