package part_01._02_Types._13_Casting;

public class _13_Casting {

	public static void main(String[] args) {
		// 1. Implicit casting: byte -> short -> int -> long -> float -> double
		short x1 = 1; // short value is implicitly cast to int
		int y1 = x1 + 2;
		System.out.println(y1);

		// double value is implicitly used in calculation without casting
		double x2 = 1.1;
		double y2 = x2 + 2;
		System.out.println(y2);

		// 2. Explicit casting:
		// double is explicitly cast to int
		double x3 = 1.1;
		int y3 = (int) x3 + 2;
		System.out.println(y3);

		// 3. String to numeric types
		String x4 = "1"; // String to int
		int y4 = Integer.parseInt(x4) + 2; // Integer is a wrapper class
		System.out.println(y4);

		// String to double
		String x5 = "1.1";
		double y5 = Double.parseDouble(x5) + 2;
		System.out.println(y5);
	}

}