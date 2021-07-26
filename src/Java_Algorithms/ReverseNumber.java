package Java_Algorithms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int numbers = 123456;
		int rev=0;
		while(numbers!=0) {
			rev=rev*10+numbers%10;
			numbers=numbers/10;
		}
		System.out.println(rev);
}

}