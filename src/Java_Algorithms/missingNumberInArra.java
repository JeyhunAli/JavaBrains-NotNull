package Java_Algorithms;

import java.util.Arrays;

public class missingNumberInArra {
	public static void main(String[] args) {
		
	
		
		//this method works within range and able to find multiple elements 
		//but elements have to be in sequence mode 
		//not able to find negative elements
		
		int[] arr = { 12, 10, 9, 7, 5, 4, 3, 1, 2 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1 ; i++) {
			if (arr[i] != arr[i + 1] - 1) {
				System.out.println("missing Elemenets -> " + (arr[i + 1] - 1));
			}
	
		}
		
		//--------------------------------------------------------------------
		
		
		
		int arr1[] = {5,4,3,1};
		int w = findMissing_num(arr1, 5);
		System.out.println("missing N " + w);
	}
	//this method works within range and able to find only one missing element
	//not able to find negative elements
	
	public static int findMissing_num(int num[], int totalCount) {
		
		int expSum = (totalCount*(totalCount+1))/2;
		int actualSum = 0;
				for(int i: num) {
					actualSum +=i;
				}
		return  expSum-actualSum;
		
	}
}
