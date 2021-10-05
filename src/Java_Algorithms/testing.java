package Java_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		
		
		//finding count of specific character in string
		String s = "selenium ui testing library";
		System.out.println(s);
		int totalcount = 0;
		char storage;
		for(int i=0; i<s.length(); i++) {
			storage=s.charAt(i);
			if(storage=='e') {
				totalcount++;
			}
		}
		System.out.println("total count of given letter e is: " + totalcount);
		
	
		
		
		
		
		//largets and smallest array
		 int numbers[] = {-2, 4, 6, 19, 67, 89, 93, -78, 78};
		 System.out.println("given array " +numbers);
	       int largestNum = numbers[0];
	       int smallestNum = numbers[0];
	       
	       for(int i=0; i<numbers.length; i++) {
	    	   if(numbers[i]>largestNum) {
	    		   largestNum=numbers[i];
	    	   }
	    	   else if(numbers[i]<smallestNum){
	    		   smallestNum=numbers[i];
			}
	    	  
	       } System.out.println("largest array " +largestNum);
    	   System.out.println("smallest array " +smallestNum);
	       
	       
	       
	       
	       
	       //largets and smallest array 
//	       List<Integer>  lst = new ArrayList<> (Arrays.asList(12, 25, -45, 88, -125, 78954));
//	       System.out.println(Collections.max(lst));
//	       System.out.println(Collections.min(lst));
	       
	       
	       
    	   String ss = "Gelmishdun";
    	   String reverse = "";
    	   for(int i=ss.length()-1; i>=0; i--) {
    		   reverse = reverse + ss.charAt(i);
    	   }
	       System.out.println(reverse);
	}

	
      
     
	
	
	
	
	
	
       
       
  
       
	
}




