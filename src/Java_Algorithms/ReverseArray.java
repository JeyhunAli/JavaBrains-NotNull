package Java_Algorithms;

public class ReverseArray {  
	
	
	
    public static void main(String[] args) {  
        
    	
    	//first way
    	
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + ",");  
        }  
       
        System.out.println("\nArray in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + ",");  
        }  
       
        
        System.out.println("\n------------");
        
        
        //second way
        int[] array = {1,3,5,7,9,11,13,15,17};
        System.out.println("Given array");
        for (int num : array) {
           System.out.print(num + " ");
          
        }
        // initialize start and end counters
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
          // swap the values at the left and right indices
          int temp = array[start];
          array[start] = array[end];
          array[end] = temp;
          // increase start counter
          start++;
          // decrease end counter
          end--;
        }
        System.out.println("\nAfter");
        for (int num : array) {
          System.out.print(num+ " ");
          
        }
      }
    }  
 