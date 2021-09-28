package Java_Algorithms;

public class DuplicateElementsinArray {

	public static void main(String[] args) {

		
		//this consider not good solution for that 
		//because time complexity for this algorithm is O(n^2)
		String s[] = { "Java", "Java", "Selenium", "JS", "Ruby", "JS" };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {

				if (s[i].equals(s[j])) {
					System.out.println("duplicate element is: " + s[i]);
				}

			}

		}

	}
}
