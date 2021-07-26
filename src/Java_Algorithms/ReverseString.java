package Java_Algorithms;

/**
 * 
 * @author jey 
 *         in String class theres no reverse method because string is
 *         immutable object
 *
 *have print statement outside of for loop 
 *other whise it will print all the step 
 *
 */

public class ReverseString {

	public static void main(String[] args) {

		//1st way of reversing String
		
		String s = "Hello Java Programming Language";
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
        //2nd way of reversing String
        
		String w = "Hello World";
		StringBuffer sb = new StringBuffer(w);
		StringBuffer reversedText = sb.reverse();
		System.out.println(reversedText);
		
		
		
		
	}

}


