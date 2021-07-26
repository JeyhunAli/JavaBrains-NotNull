package Java_Algorithms;

import java.util.Arrays;

public class missingNumbersinArray {

	public static void main(String[] args) {
		
		missingNums();
		
		
		
		
		
		int[] numbers = { 11, 6, 4, 5, 7, 1 };
		Arrays.sort(numbers);
		int numbersArrayIndex = 0;
		for (int i = 0; i < numbers[numbers.length - 1]; i++) {
		    if (i == numbers[numbersArrayIndex]) {
		        numbersArrayIndex++;
		    }
		    else {
		        System.out.println(i);
		    }
		}
		
		
		

		int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };

		int[] register = new int[input.length];

		for (int i : input) {
			register[i] = 1;
		}

		System.out.println("missing numbers in given array");

		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.println(i);
			}
		}
	}

	
	public static void missingNums() {
		int arr[] = {-4,-3,-2, 0, 1, 3, 2, 5 ,9, 7, 10, 12};
		Arrays.sort(arr);
		for(int i=1; i<arr.length-1; i++) {
			if(arr[i] != arr[i-1]+1) {
				
			}
			System.out.println("missing numbers: " +(arr[i-1]+1));
		}
		
	}
	
	}


