package Java_Algorithms;

import java.util.Arrays;

public class testing {

	public static void main(String[] args) {
		
	//revrese number
		
		int[] nums = { -1, 1, 5, 2, 4, 7, 9, 10, 12};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if ((nums[i] + 1) != nums[i + 1]) {
				System.out.println("missing number is*--" + (nums[i] + 1));
			}
		}
		
		
		System.out.println("----------------");
		
		
		int arr1[] = {-5, -2,-3 -1, 1, 2, 3, 4, 6, 8 };
		Arrays.sort(arr1);
		for (int i = 1; i < arr1.length; i++) {
			if (arr1[i] != arr1[i - 1] + 1) {
				System.out.println("missing num is:" + (arr1[i - 1] + 1));
			}
		}
		
		
	}

}




