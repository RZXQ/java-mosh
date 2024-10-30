package part_01._02_Types._11_Arithmetic_Expressions;

public class _11_Arithmetic_Expressions {

	public static void main(String[] args) {
		// Basic arithmetic operations
		int additionResult = 10 + 3;
		System.out.println("10 + 3 = " + additionResult);

		int divisionResult = 10 / 3;
		System.out.println("10 / 3 = " + divisionResult);

		// Increment operations
		int x = 1;
		x++; // ++x would produce the same result
		System.out.println("x after x++: " + x);

		int y1 = x++;
		System.out.println("x after x++: " + x);
		System.out.println("y after x++: " + y1);

		int y2 = ++x;
		System.out.println("x after ++x: " + x);
		System.out.println("y1 after ++x: " + y2);
	}

}