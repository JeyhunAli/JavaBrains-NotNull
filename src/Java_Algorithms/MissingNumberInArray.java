package Java_Algorithms;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {

		/**
		 * in order to find missing number in array we have to first create two array
		 * 1st array find the sum of length 2nd array find actual sum of the array then
		 * we substract from 2-1 then finding missing number
		 * 
		 */

		int arr1[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);

		int sum2 = 0;
		for (int j = 0; j <= 10; j++) {
			sum2 = sum2 + j;
		}
		System.out.println(sum2);
		System.out.println("missing number is:: " + (sum2 - sum));

		// --------------------------------------------------------------------------------------------

		// but its failed with unsorted array
		int[] nums = { -1, 1, 5, 2, 4, 7, 9, 10 };
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if ((nums[i] + 1) != nums[i + 1]) {
				System.out.println("missing number is*--" + (nums[i] + 1));
			}
		}

		FindMissingNumInArray();

	}

	// the best way to find missing number even multiple numbers can be found
	// but its failed with unsorted array
	public static void FindMissingNumInArray() {
		int arr1[] = {-5, -2,-3 -1, 1, 2, 3, 4, 6, 8 };
		Arrays.sort(arr1);
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] != arr1[i - 1] + 1) {
				System.out.println("missing num is:" + (arr1[i - 1] + 1));
			}
		}

	}

}
