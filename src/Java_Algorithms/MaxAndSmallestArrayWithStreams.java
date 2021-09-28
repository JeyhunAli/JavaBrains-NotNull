package Java_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxAndSmallestArrayWithStreams {

	public static void main(String[] args) {
		
		//largets and smallest array 
		 int numbers[] = {-2, 4, 6, 19, 67, 89, 93, -78, 78};
		 System.out.println("given Array " + Arrays.toString(numbers));
		 int max = Arrays.stream(numbers).max().getAsInt();
		 int min = Arrays.stream(numbers).min().getAsInt();
         System.out.println("max number " + max +  "\n"+ "min number " + min);
         
         
         
         
         //largets and smallest array 
	       List<Integer>  lst = new ArrayList<> (Arrays.asList(12, 25, -45, 88, -125, 78954));
	       System.out.println(Collections.max(lst));
	       System.out.println(Collections.min(lst));
	       
         
         
	}
	

}
