package Java_Algorithms;

import java.util.Arrays;

public class RemoveJunkChar {

	public static void main(String[] args) {
		// to remove unwanted char from string we use regular expression with array
		// bracket

		String s = "平仮名!@#$%片仮名 English Language plus numbers )(*& +_+ 017897654";

		String ss = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(ss);

		// how to find missing number in array

		int arr[] = { 10, 1, 2, 4, 5, 6, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1] - 1) {
				System.out.println("missing num is: " + (arr[i + 1] - 1));
			}
		}
		

	}

}
