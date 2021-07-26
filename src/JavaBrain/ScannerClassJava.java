package JavaBrain;

import java.util.Scanner;

public class ScannerClassJava {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        
		System.out.println("hey if are you trying to learn java enter some number");
		String nextline = scan.nextLine();
		System.out.println("thats what i guessed  ))) " + nextline  + "\n and how old are U ?");
		int num = scan.nextInt();
		System.out.println("hmm thats perfect age being in your " + num );
		
		scan.nextLine(); // this line will help you to avoid messing around with messages 
		                 // just comment the line then u will see the difference

		
		System.out.println("what is your favorite car? ");
		String car = scan.nextLine();
		System.out.println(car +": wow that is cool car ");
		
		
		
	}

}
