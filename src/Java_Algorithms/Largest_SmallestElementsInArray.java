package Java_Algorithms;

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
		
		
		
		
		
		
		
	}
	

}
