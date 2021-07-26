package Java_Algorithms;

import java.util.Arrays;
import java.util.BitSet;


/**
 * 
 * @author jey
 * not sure about this method 
 * bitset need to more POC 
 */
public class MissingNumbersWithNegativeNinArray {

	public static void main(String[] args) {
		
		
		
	}
	
	public static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
 
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
 
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
        Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
 
    }
}
