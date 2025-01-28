package part_01._02_Types._13_Casting;

/*===============================================================================
 *                              Type Casting in Java
 *===============================================================================*/
/*
 * Implicit Casting (Automatic Type Conversion):
 * - Java converts smaller types to larger types automatically.
 * - Order: byte -> short -> int -> long -> float -> double.
 * - No data loss occurs.
 *
 * Explicit Casting (Manual Type Conversion):
 * - Required when converting larger types to smaller types.
 * - May cause data loss.
 */

public class _13_Casting {

	public static void main(String[] args) {

		/*
		 * ===============================================================================
		 * 1. Implicit Casting (Automatic Conversion)
		 * ===============================================================================
		 */
		short x1 = 1; // short to int
		System.out.println(x1);
		int y1 = x1 + 2;
		System.out.println(y1);

		double x2 = 1.1; // implicit conversion with double
		double y2 = x2 + 2;
		System.out.println(y2);

		/*
		 * ===============================================================================
		 * 2. Explicit Casting (Manual Conversion)
		 * ===============================================================================
		 */
		double x3 = 1.1; // double to int
		int y3 = (int) x3 + 2;
		System.out.println(y3);

		/*
		 * ===============================================================================
		 * 3. String to Numeric Types Conversion
		 * ===============================================================================
		 */
		String x4 = "1"; // String to int
		int y4 = Integer.parseInt(x4) + 2;
		System.out.println(y4);

		String x5 = "1.1"; // String to double
		double y5 = Double.parseDouble(x5) + 2;
		System.out.println(y5);
	}

}
