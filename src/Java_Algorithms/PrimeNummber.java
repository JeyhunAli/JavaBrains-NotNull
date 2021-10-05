package Java_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrimeNummber {

	public static void main(String[] args) {
		

		System.out.println("prime number: " + checkPrimeNumber(6));
		
		
	}
	
	
	
	public static boolean checkPrimeNumber(int num) {
		System.out.println(num);
		if(num<=1) {
			return false;
		}
	for(int i=2; i<num; i++) {
		if(num % i == 0) {
			return false;
		}
	}
	return true;
	
	}
	
	public static void one_tohundred_PrimeNumber(int number) {
		
		List<Integer> primeNumbers = new ArrayList<Integer>();
		boolean isTrue = true;
		for(int i=2; i<=number; i++) {
			for(int j=2;j<=i/2; j++) {
				if(i%j==0) {
					isTrue=false;
					break;
				}
			}
			if(isTrue) {
				primeNumbers.add(i);
			}
			
			
		}
		System.out.println("");
		
		
		
	}
	

}
