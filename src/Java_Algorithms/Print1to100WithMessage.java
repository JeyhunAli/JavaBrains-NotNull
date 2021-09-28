package Java_Algorithms;

public class Print1to100WithMessage {

	public static void main(String[] args) {
		
		
		int i=1;
		while(i<=100) {
			System.out.println(i);
			if(i%5==0) {
				System.out.println("hey this message will come up every after 5 reminder ");
			}
			i++;
		}
		
		

	}

}
