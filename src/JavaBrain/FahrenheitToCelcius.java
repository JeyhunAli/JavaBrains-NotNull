package JavaBrain;

public class FahrenheitToCelcius {

	public static void main(String[] args) {

		/**
		 * Fahrenheit to celsius calculator the formula to calculate it is: ((°F − 32) ×
		 * 5/9 = °C)
		 * lets try negative nubmer 
		 */
		
		
		calculateFahrenheit(-89);

	}
	
	public static void calculateFahrenheit(double d) {
		
		System.out.println("what is the temperaturen? ");
		
		double fahren = d;
		double celcius = (5.0/9.0)*(fahren - 32);
		System.out.println("fahrenheit degrees is: "+ fahren +
				"\n " + "degrees in celsius is " + celcius);
		
		
	}

}