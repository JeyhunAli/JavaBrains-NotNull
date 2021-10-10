package Java_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class One_To_Hundred_PrimeNumber {
/**
 *   A prime number is a number that is divisible by only two numbers:
		   1 and itself. So, if any number is divisible by any other number, 
		   it is not a prime number.
		  
		   lowest prime num is 2
	
 * 
 */
	      
	public static void main(String[] args) {
		// 2 3 4 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
		// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
		//for(int j=2; j<i; j++)
		// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
		
		
		primeNumber(100);
		oneToHundredPrimeNum(50);

	}
	public static void primeNumber(int num) {
		
		List<Integer> PrimeNumbers = new ArrayList<Integer>();
		
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				PrimeNumbers.add(i);
				
			}
		}
		System.out.println("prime Numbers 1 to 100 ");
		System.out.println("PrimeNumbers.size == " +PrimeNumbers.size());
		for(Integer numbers : PrimeNumbers) {
			System.out.print(numbers +" ");
			
		}

}

	
public static void oneToHundredPrimeNum(int numbers) {
		
		List<Integer> primeNumb = new ArrayList<Integer>();
		
		for(int i=2; i<=numbers; i++) {
			boolean isPrime = true;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				primeNumb.add(i);
			}
		}
		System.out.println("1 to 100 prime numbers ");
		System.out.println("SIZE OF PRIME NUMBERS ARE " +primeNumb.size());
		for(Integer n: primeNumb) {
			System.out.print(n + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}