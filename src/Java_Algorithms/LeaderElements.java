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

}
