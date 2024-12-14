package part_01._02_Types._13_Casting;

// Implicit Casting (Automatic Type Conversion)
// - Java automatically converts smaller types to larger types in a specific
// order:
// byte -> short -> int -> long -> float -> double.
// - This is safe because there is no risk of data loss when going from a smaller
// to a larger type.
public class _13_Casting {

	public static void main(String[] args) {

		// 1. Implicit Casting (Automatic Type Conversion)

		// Example 1.1: short to int (implicit casting)
		short x1 = 1;
		System.out.println(x1);
		int y1 = x1 + 2;
		System.out.println(y1);

		// Example 1.2: implicit casting with double
		double x2 = 1.1;
		double y2 = x2 + 2;
		System.out.println(y2);

		// 2. Explicit Casting (Manual Type Conversion)

		// Example 2.1: double to int (explicit casting)
		double x3 = 1.1;
		int y3 = (int) x3 + 2;
		System.out.println(y3);

		// 3. String to Numeric Types

		// Example 3.1: String to int: Integer.parseInt()
		String x4 = "1";
		int y4 = Integer.parseInt(x4) + 2;
		System.out.println(y4);

		// Example 3.2: String to double: Integer.parseDouble()
		String x5 = "1.1";
		double y5 = Double.parseDouble(x5) + 2;
		System.out.println(y5);
	}

}
