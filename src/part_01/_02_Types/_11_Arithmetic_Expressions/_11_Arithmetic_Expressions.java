package part_01._02_Types._11_Arithmetic_Expressions;

public class _11_Arithmetic_Expressions {

	public static void main(String[] args) {

		// 1. Basic Arithmetic Operations
		int additionResult = 10 + 3;
		int divisionResult = 10 / 3;

		// 2. Increment Operations
		int x = 1;
		x++; // Equivalent to ++x
		System.out.println("x after x++: " + x);

		int x1 = 1;
		int y1 = x1++;
		System.out.println(x1);
		System.out.println(y1);

		int x2 = 1;
		int y2 = ++x;
		System.out.println(x2);
		System.out.println(y2);

	}

}