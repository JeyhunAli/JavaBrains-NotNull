package Java_Algorithms;

public class RemoveJunkChar {

	public static void main(String[] args) {
		// to remove unwanted char from string we use regular expression with array bracket 
		
		String s = "平仮名!@#$%片仮名 English Language plus numbers )(*& +_+ 017897654";
		
		String ss = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(ss);
		

	}

}
