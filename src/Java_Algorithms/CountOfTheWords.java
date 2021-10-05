package Java_Algorithms;

public class CountOfTheWords {

	public static void main(String[] args) {
		
		
		
		String s = "Java is the most Secure programming language";
		 System.out.println("the count of words in String == " + s.split(" ").length);
		 
		 
		 
		 
		 String str = "Great America is desired country for everybody";
		String [] words = str.split(" ");
		System.out.println("the count of words in String == " + words.length);
		
		
		
		
		int wordCount = 1;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)== ' ') {
				wordCount++;
			}
		}
	System.out.println(wordCount);
	}

}
