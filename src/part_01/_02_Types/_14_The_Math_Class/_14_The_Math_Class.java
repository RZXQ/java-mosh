package part_01._02_Types._14_The_Math_Class;

public class _14_The_Math_Class {

	public static void main(String[] args) {

		// Math.round()
		int roundedResult = Math.round(1.1F);

		// Math.ceil()
		double ceilResult = Math.ceil(1.1F);

		// Math.floor()
		double floorResult = Math.floor(1.1F);

		// Math.max()
		int maxResult = Math.max(1, 2);

		// Math.min()
		int minResult = Math.min(1, 2);

		// Math.abs()
		int absResult = Math.abs(-5);

		// Math.random()
		// Generates a random number between 0.0 (inclusive) and 1.0 (exclusive),
		// scaled to 0 - 100, and rounded to the nearest integer.
		int randomResult = (int) Math.round(Math.random() * 100);
	}

}
