package Java_Algorithms;

import java.util.Arrays;

public class Largest_SmallestElementsInArray {

	public static void main(String[] args) {
	
		//finding smallest and largest number in array 
		
		
		
		int num[] = {1,3,4,55,44,65,76,87,7,99,};
		int largest = num[0];
		int smallest = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]> largest) {
				largest = num[i];
			}
			else if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println("largest " + largest);
		System.out.println("smallest" + smallest);
		
		
		
		
		//largets and smallest array
		 int numbers[] = {-2, 4, 6, 19, 67, 89, 93, -78, 78};
		 System.out.println("given array " + Arrays.toString(numbers));
	       int largestNum = numbers[0];
	       int smallestNum = numbers[0];
	       
	       for(int i=0; i<numbers.length; i++) {
	    	   if(numbers[i]>largestNum) {
	    		   largestNum=numbers[i];
	    	   }
	    	   else if(numbers[i]<smallestNum){
	    		   smallestNum=numbers[i];
			}
	    	  
	       } System.out.println("largest array  ===> " +largestNum);
   	   System.out.println("smallest array ===> " +smallestNum);
	       
		
		
		
		
	}
	

}
