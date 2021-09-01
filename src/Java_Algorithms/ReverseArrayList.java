package Java_Algorithms;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> dogs = new ArrayList<String>();
		dogs.add("ALASKAN KLEE KAI");
		dogs.add("CHINESE CRESTED");
		dogs.add("DANISH-SWEDISH FARMDOG");
		dogs.add("SILKY TERRIER");
		dogs.add("POMERANIAN");
		dogs.add("SHETLAND SHEEPDOG");
		dogs.add("BEAGLE");
		
		for(int i=dogs.size()-1; i>=0; i--) {
			System.out.println(dogs.get(i));
		}
		
		

	}

}
