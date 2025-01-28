package part_01._02_Types._11_Arithmetic_Expressions;

public class _11_Arithmetic_Expressions {

	public static void main(String[] args) {

		/*
		 * ===============================================================================
		 * Basic Arithmetic Operations
		 * ===============================================================================
		 */
		int additionResult = 10 + 3;
		int divisionResult = 10 / 3;

		/*
		 * ===============================================================================
		 * Increment Examples
		 * ===============================================================================
		 */
		int x = 1;
		x++; // Same as ++x when used alone
		System.out.println(x);

		int x1 = 1, y1 = x1++; // Post-increment: y1 = x1, then x1++
		System.out.println(x1);
		System.out.println(y1);

		int x2 = 1, y2 = ++x2; // Pre-increment: x2++, then y2 = x2
		System.out.println(x2);
		System.out.println(y2);
	}

}
