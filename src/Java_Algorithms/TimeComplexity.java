package Java_Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jey O(n) BIG O O(1) O(n) O(n^2)
 * 
 *         here n means input size of the algorithms O means notations for time
 *         complexity
 * 
 *         time complexity is time estimation how much time algorithm take time
 *         how many iterattion it takes
 * 
 *
 */

public class TimeComplexity {

	public static void main(String[] args) {

		// O(1) it will execute only once
		int n = 1;
		System.out.println(n);

		// O(1) it will execute only once how ? its just checking number no matter
		// how big number and deciding its odd or even
		int number = 20;
		if (number % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		/**
		 * this concept calls Big O of n O(n) how here q=10 is constant value inside for
		 * loop i iterate 10 times it could be 100 0r one thousand or more we take it as
		 * n number print line is also constant at the end we drop constant values we
		 * have n it means our statement execute n number of time O(n)
		 */
		int q = 10;
		for (int i = 0; i <= q; i++) {
			System.out.println(i);
		}

		// program to find largest num in unsorted array
		/**
		 * TIME COMLEXITY FOR THIS STATEMENT IS: max = 0; CONSTANT EQUAL 1 LOOP EXECUTE
		 * BASED ON ARRAY LENGHT IT MEANS n time and printing line also constant 1 then
		 * ignoring all the constant we n Big O of n 1+n+1 ==> 2n ==> n ==> 0(n)
		 */
		int nume[] = { 23, 45, 67, 65, 78, 98, 89, 55, 101, 19, 108 };
		int max = 0;
		for (int i = 0; i < nume.length; i++) { // this line looping
			if (max < nume[i]) { // this line one by one checking
				max = nume[i]; // this line comparing until finding large numb
			}
		}
		System.out.println("max number is: " + max);

		// getting student marks with hashmap
		// this also equal to O(1) because executing only once

		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Jeyhun", 100);
		marks.put("Naveen", 101);
		marks.put("Ahmed", 99);
		marks.put("Ali", 105);
		marks.put("Tom", 110);

		Integer getvalue = marks.get("Naveen");
		System.out.println("student marks:" + getvalue);

		/**
		 * this all example is liner equation
		 */

		/**
		 * this two for loop concept outer for loop and inner for loop will create
		 * QUADRATIC EQUATION time complexity O(n^2) Big O n square of 2
		 */
		for (int i = 0; i <= 5; i++) {
			for (int y = 0; y <= 5; y++) {
				System.out.print(i + "" + y + " ");
			}
			System.out.println();
		}

		// another example of O(n^2)
		// wap to find duplicate array from an arraylist
		/**
		 * this statement is also O n Square
		 *  O(n^2)
		 */
		int arr[] = { 22, 3, 5, 76, 88, 55, 33, 3, 22, 56, 78, 90, 00, 00, 76, 55, };

		for (int i = 0; i < arr.length; i++) {
			for (int y = 0; y < arr.length; y++) {
				if (i == y) {
					continue;
				}
				if (arr[i] == arr[y]) {
					System.out.println(arr[i] + " --- is dublicate");
				}
			}
		}
		

		//  this example of 3 for loop 
		//  this concept call 
		//  this statement is  O n Square 3
		//  O(n^3)
		int ar[] = { 22, 3, 5, 76, 88, 55, 33, 3, 22, 56, 78, 90, 00, 00, 76, 55, };

		for (int i = 0; i < ar.length; i++) {
			for (int y = 0; y < ar.length; y++) {
				for (int j = 0; j < ar.length; j++) {
					if (i == y || i == j) {
						continue;
					}
					if (ar[i] == ar[y] || ar[i] == ar[j]) {
						System.out.println(ar[j] + " --- is dublicate");
					}
				}
			}

		}

	}
}



/**
 * ok now overrall explanation   
 * 
 * O(1)  execute only once   no looping 
 * O(n)  execute n nummbers of the time becausde it has only one for loop 
 * O(n^2)  execute more depends of how many iteration inner loop and outer loop is there 
 * O(n^3) is also execute more depends of how many iteration with three loop concept 
 * 
 * 
 * 
 * 
 */





























