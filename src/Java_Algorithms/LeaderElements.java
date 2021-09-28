package Java_Algorithms;

public class LeaderElements {
	
	/**
	 * 
	 * @param args
	 * leader elements are those elements lets say there 
	 * 
	 * 2,5,6,12,3,4,6,8,11,10
	 * here 12 is leader element why because the numbers on the right side os 12 all are smaller than 12
	 * 11 also leader 
	 * 10 also leader number an so on 
	 * last always is leader element because after last element thers no element
	 * 
	 */

	public static void main(String[] args) {
		
		int num [] = {2,5,6,12,3,4,6,8,11,10};
		findLeaderElement(num);
		
		System.out.println("\n----------");
		
		int numbers [] = {77,2,5,6,12,3,4,6,8,11,10,65};
		leaderElement_2(numbers);
		
		System.out.println("\n----------");
		
		int number2 [] = {23,22,17,18,21};
		leaderNumber_3(number2);
		
		
		//*****************************************************
		
		System.out.println("\n----------");
		
		int n[] = {2,9,5,6,12,3,4,6,8,11,10,9};
		int max = n[n.length-1];
		System.out.print(max + " ");
		for(int i=n.length-1; i>=0; i--) {
			if (n[i]>max) {
				System.out.print(n[i] + " ");
				max=n[i];
			}
		}
		
		//*****************************************************
		
		
	
		
		
		
	}
	
	
	public static void findLeaderElement(int num[]) {
		
		int maxLeader = num[num.length-1];
		System.out.print(maxLeader + " ");
		
		for (int i=num.length-2; i>=0; i--) {
			
			if(num[i]>maxLeader) {
				System.out.print(num[i]+ " ");
				maxLeader=num[i];
			}
		}
		
		
	}
	
	
	public static void leaderElement_2(int numbers[]) {
		
		int  maxNumber = numbers[numbers.length-1];
		System.out.print(maxNumber + " ");
		
		for(int i=numbers.length-2; i>=0; i--) {
			if(numbers[i]>maxNumber) {
				System.out.print(numbers[i] + " ");
				maxNumber=numbers[i];
			}
		}
		
	}
	
	
	public static void leaderNumber_3(int number2[]) {
		
		
		int maxN = number2[number2.length-1];
		System.out.print(maxN + " ");
		
		for(int i=number2.length-2; i>=0; i--) {
			if(number2[i]>maxN) {
				System.out.print(number2[i]+ " ");
				maxN=number2[i];
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
