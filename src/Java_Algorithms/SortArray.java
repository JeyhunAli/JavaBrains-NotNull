package Java_Algorithms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		
		int [] array = {9,8,7,6,5,4,3,2,1};
		int[] sortedarray = sortArray(array);
		System.out.println("first sorted Array "+ Arrays.toString(sortedarray));
		
		
		
		
		
		

		int[] arr = { 4, 7, 2, 3, 8, 9, 1, 6, 5, 10, 67, 89, 88 };

		System.out.println("given array " + Arrays.toString(arr));

		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		// first way to print
		System.out.println("sorted array" + Arrays.toString(arr));
		// second way to print
		for (Integer e : arr) {
			System.out.print(e + " ");
		}

	}

	public static int[] sortArray(int a[]) {
		
		System.out.println("given array " + Arrays.toString(a));
		Arrays.toString(a);
		Arrays.sort(a);
		return a;
		
	}
	
	
}














