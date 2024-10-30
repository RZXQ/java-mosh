package part_01._02_Types._14_The_Math_Class;

public class _14_The_Math_Class {

	public static void main(String[] args) {
		// Rounding a float value
		int roundedResult = Math.round(1.1F); // Math.round
		System.out.println(roundedResult);

		// Ceiling of a float value
		double ceilResult = Math.ceil(1.1F); // Math.ceil
		System.out.println(ceilResult);

		// Floor of a float value
		double floorResult = Math.floor(1.1F); // Math.floor
		System.out.println(floorResult);

		// Maximum of two integers
		int maxResult = Math.max(1, 2); // Math.max
		System.out.println(maxResult);

		// Minimum of two integers
		int minResult = Math.min(1, 2); // Math.min
		System.out.println(minResult);

		// Generating a random integer between 0 and 100
		int randomResult = (int) Math.round(Math.random() * 100); // Math.random
		System.out.println(randomResult);
	}

}