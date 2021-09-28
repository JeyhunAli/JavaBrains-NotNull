package Java_Algorithms;

public class FactorialNummber {

	public static void main(String[] args) {
		

		// 5! = 5*4*3*2*1
		//Factorial of a non-negative integer, 
		//is multiplication of all integers smaller 
		//than or equal to n. For example factorial 
		//of 6 is 6*5*4*3*2*1 which is 720.
		
		findFactorial(3);
	}
	
	public static void findFactorial(int factorial) {
		
		int fact = 1;
		for(int i = factorial; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
