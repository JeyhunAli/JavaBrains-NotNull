package Java_Algorithms;

public class printNumberWithoutLoop {

	public static void main(String[] args) {
		
		
		//to print number without loop we use 
		// recursive function which is function calls itself
		printNumbers(1, 70);
		
		
	}
	
	public static void printNumbers(int startingNuber, int endNumber) {
		if(startingNuber<=endNumber) {
			System.out.println(startingNuber);
			startingNuber++;
			printNumbers(startingNuber, endNumber);
		}
	}

}
