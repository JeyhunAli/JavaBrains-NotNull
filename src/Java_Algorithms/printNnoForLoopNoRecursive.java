package Java_Algorithms;

import java.util.BitSet;

public class printNnoForLoopNoRecursive {

	public static void main(String[] args) {
		
		
		String number = new BitSet() {{set(0,100);}}.toString();
		System.out.append(number, 0, number.length());
		
	}

}
